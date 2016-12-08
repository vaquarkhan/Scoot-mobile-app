package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import d.ac;
import d.i;
import d.j;
import d.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DiskLruCache
  implements Closeable
{
  static final long ANY_SEQUENCE_NUMBER = -1L;
  private static final String CLEAN = "CLEAN";
  private static final String DIRTY = "DIRTY";
  static final String JOURNAL_FILE = "journal";
  static final String JOURNAL_FILE_BACKUP = "journal.bkp";
  static final String JOURNAL_FILE_TEMP = "journal.tmp";
  static final Pattern LEGAL_KEY_PATTERN;
  static final String MAGIC = "libcore.io.DiskLruCache";
  private static final ac NULL_SINK;
  private static final String READ = "READ";
  private static final String REMOVE = "REMOVE";
  static final String VERSION_1 = "1";
  private final int appVersion;
  private final Runnable cleanupRunnable = new DiskLruCache.1(this);
  private boolean closed;
  private final File directory;
  private final Executor executor;
  private final FileSystem fileSystem;
  private boolean hasJournalErrors;
  private boolean initialized;
  private final File journalFile;
  private final File journalFileBackup;
  private final File journalFileTmp;
  private i journalWriter;
  private final LinkedHashMap<String, DiskLruCache.Entry> lruEntries = new LinkedHashMap(0, 0.75F, true);
  private long maxSize;
  private long nextSequenceNumber = 0L;
  private int redundantOpCount;
  private long size = 0L;
  private final int valueCount;
  
  static
  {
    if (!DiskLruCache.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
      NULL_SINK = new DiskLruCache.4();
      return;
    }
  }
  
  DiskLruCache(FileSystem paramFileSystem, File paramFile, int paramInt1, int paramInt2, long paramLong, Executor paramExecutor)
  {
    this.fileSystem = paramFileSystem;
    this.directory = paramFile;
    this.appVersion = paramInt1;
    this.journalFile = new File(paramFile, "journal");
    this.journalFileTmp = new File(paramFile, "journal.tmp");
    this.journalFileBackup = new File(paramFile, "journal.bkp");
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
    this.executor = paramExecutor;
  }
  
  private void checkNotClosed()
  {
    try
    {
      if (isClosed()) {
        throw new IllegalStateException("cache is closed");
      }
    }
    finally {}
  }
  
  private void completeEdit(DiskLruCache.Editor paramEditor, boolean paramBoolean)
  {
    int k = 0;
    DiskLruCache.Entry localEntry;
    try
    {
      localEntry = DiskLruCache.Editor.access$1700(paramEditor);
      if (DiskLruCache.Entry.access$900(localEntry) != paramEditor) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int j = k;
    if (paramBoolean)
    {
      j = k;
      if (!DiskLruCache.Entry.access$800(localEntry))
      {
        int i = 0;
        for (;;)
        {
          j = k;
          if (i >= this.valueCount) {
            break;
          }
          if (DiskLruCache.Editor.access$1800(paramEditor)[i] == 0)
          {
            paramEditor.abort();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
          }
          if (!this.fileSystem.exists(DiskLruCache.Entry.access$1400(localEntry)[i]))
          {
            paramEditor.abort();
            return;
          }
          i += 1;
        }
      }
    }
    for (;;)
    {
      long l1;
      if (j < this.valueCount)
      {
        paramEditor = DiskLruCache.Entry.access$1400(localEntry)[j];
        if (paramBoolean)
        {
          if (this.fileSystem.exists(paramEditor))
          {
            File localFile = DiskLruCache.Entry.access$1300(localEntry)[j];
            this.fileSystem.rename(paramEditor, localFile);
            l1 = DiskLruCache.Entry.access$1200(localEntry)[j];
            long l2 = this.fileSystem.size(localFile);
            DiskLruCache.Entry.access$1200(localEntry)[j] = l2;
            this.size = (this.size - l1 + l2);
          }
        }
        else {
          this.fileSystem.delete(paramEditor);
        }
      }
      else
      {
        this.redundantOpCount += 1;
        DiskLruCache.Entry.access$902(localEntry, null);
        if ((DiskLruCache.Entry.access$800(localEntry) | paramBoolean))
        {
          DiskLruCache.Entry.access$802(localEntry, true);
          this.journalWriter.b("CLEAN").i(32);
          this.journalWriter.b(DiskLruCache.Entry.access$1500(localEntry));
          localEntry.writeLengths(this.journalWriter);
          this.journalWriter.i(10);
          if (paramBoolean)
          {
            l1 = this.nextSequenceNumber;
            this.nextSequenceNumber = (1L + l1);
            DiskLruCache.Entry.access$1602(localEntry, l1);
          }
        }
        for (;;)
        {
          this.journalWriter.flush();
          if ((this.size <= this.maxSize) && (!journalRebuildRequired())) {
            break;
          }
          this.executor.execute(this.cleanupRunnable);
          break;
          this.lruEntries.remove(DiskLruCache.Entry.access$1500(localEntry));
          this.journalWriter.b("REMOVE").i(32);
          this.journalWriter.b(DiskLruCache.Entry.access$1500(localEntry));
          this.journalWriter.i(10);
        }
      }
      j += 1;
    }
  }
  
  public static DiskLruCache create(FileSystem paramFileSystem, File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    return new DiskLruCache(paramFileSystem, paramFile, paramInt1, paramInt2, paramLong, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
  }
  
  private DiskLruCache.Editor edit(String paramString, long paramLong)
  {
    for (;;)
    {
      try
      {
        initialize();
        checkNotClosed();
        validateKey(paramString);
        Object localObject = (DiskLruCache.Entry)this.lruEntries.get(paramString);
        if (paramLong != -1L) {
          if (localObject != null)
          {
            long l = DiskLruCache.Entry.access$1600((DiskLruCache.Entry)localObject);
            if (l == paramLong) {}
          }
          else
          {
            paramString = null;
            return paramString;
          }
        }
        if ((localObject != null) && (DiskLruCache.Entry.access$900((DiskLruCache.Entry)localObject) != null))
        {
          paramString = null;
        }
        else
        {
          this.journalWriter.b("DIRTY").i(32).b(paramString).i(10);
          this.journalWriter.flush();
          if (this.hasJournalErrors)
          {
            paramString = null;
          }
          else if (localObject == null)
          {
            localObject = new DiskLruCache.Entry(this, paramString, null);
            this.lruEntries.put(paramString, localObject);
            paramString = (String)localObject;
            localObject = new DiskLruCache.Editor(this, paramString, null);
            DiskLruCache.Entry.access$902(paramString, (DiskLruCache.Editor)localObject);
            paramString = (String)localObject;
          }
          else
          {
            paramString = (String)localObject;
          }
        }
      }
      finally {}
    }
  }
  
  private boolean journalRebuildRequired()
  {
    return (this.redundantOpCount >= 2000) && (this.redundantOpCount >= this.lruEntries.size());
  }
  
  private i newJournalWriter()
  {
    return r.a(new DiskLruCache.2(this, this.fileSystem.appendingSink(this.journalFile)));
  }
  
  private void processJournal()
  {
    this.fileSystem.delete(this.journalFileTmp);
    Iterator localIterator = this.lruEntries.values().iterator();
    while (localIterator.hasNext())
    {
      DiskLruCache.Entry localEntry = (DiskLruCache.Entry)localIterator.next();
      int i;
      if (DiskLruCache.Entry.access$900(localEntry) == null)
      {
        i = 0;
        while (i < this.valueCount)
        {
          this.size += DiskLruCache.Entry.access$1200(localEntry)[i];
          i += 1;
        }
      }
      else
      {
        DiskLruCache.Entry.access$902(localEntry, null);
        i = 0;
        while (i < this.valueCount)
        {
          this.fileSystem.delete(DiskLruCache.Entry.access$1300(localEntry)[i]);
          this.fileSystem.delete(DiskLruCache.Entry.access$1400(localEntry)[i]);
          i += 1;
        }
        localIterator.remove();
      }
    }
  }
  
  private void readJournal()
  {
    j localj = r.a(this.fileSystem.source(this.journalFile));
    label241:
    try
    {
      String str1 = localj.r();
      String str2 = localj.r();
      String str3 = localj.r();
      String str4 = localj.r();
      String str5 = localj.r();
      if ((!"libcore.io.DiskLruCache".equals(str1)) || (!"1".equals(str2)) || (!Integer.toString(this.appVersion).equals(str3)) || (!Integer.toString(this.valueCount).equals(str4)) || (!"".equals(str5))) {
        throw new IOException("unexpected journal header: [" + str1 + ", " + str2 + ", " + str4 + ", " + str5 + "]");
      }
    }
    finally
    {
      Util.closeQuietly(localj);
      throw ((Throwable)localObject);
      int i = 0;
      try
      {
        for (;;)
        {
          readJournalLine(localj.r());
          i += 1;
        }
        rebuildJournal();
      }
      catch (EOFException localEOFException)
      {
        this.redundantOpCount = (i - this.lruEntries.size());
        if (localj.f()) {
          break label241;
        }
      }
      Util.closeQuietly(localj);
      return;
    }
  }
  
  private void readJournalLine(String paramString)
  {
    int i = paramString.indexOf(' ');
    if (i == -1) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    int j = i + 1;
    int k = paramString.indexOf(' ', j);
    String str;
    if (k == -1)
    {
      str = paramString.substring(j);
      if ((i == "REMOVE".length()) && (paramString.startsWith("REMOVE"))) {
        this.lruEntries.remove(str);
      }
    }
    else
    {
      str = paramString.substring(j, k);
    }
    for (;;)
    {
      DiskLruCache.Entry localEntry2 = (DiskLruCache.Entry)this.lruEntries.get(str);
      DiskLruCache.Entry localEntry1 = localEntry2;
      if (localEntry2 == null)
      {
        localEntry1 = new DiskLruCache.Entry(this, str, null);
        this.lruEntries.put(str, localEntry1);
      }
      if ((k != -1) && (i == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        paramString = paramString.substring(k + 1).split(" ");
        DiskLruCache.Entry.access$802(localEntry1, true);
        DiskLruCache.Entry.access$902(localEntry1, null);
        DiskLruCache.Entry.access$1000(localEntry1, paramString);
        return;
      }
      if ((k == -1) && (i == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        DiskLruCache.Entry.access$902(localEntry1, new DiskLruCache.Editor(this, localEntry1, null));
        return;
      }
      if ((k == -1) && (i == "READ".length()) && (paramString.startsWith("READ"))) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private void rebuildJournal()
  {
    for (;;)
    {
      DiskLruCache.Entry localEntry;
      try
      {
        if (this.journalWriter != null) {
          this.journalWriter.close();
        }
        i locali1 = r.a(this.fileSystem.sink(this.journalFileTmp));
        try
        {
          locali1.b("libcore.io.DiskLruCache").i(10);
          locali1.b("1").i(10);
          locali1.k(this.appVersion).i(10);
          locali1.k(this.valueCount).i(10);
          locali1.i(10);
          Iterator localIterator = this.lruEntries.values().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localEntry = (DiskLruCache.Entry)localIterator.next();
          if (DiskLruCache.Entry.access$900(localEntry) != null)
          {
            locali1.b("DIRTY").i(32);
            locali1.b(DiskLruCache.Entry.access$1500(localEntry));
            locali1.i(10);
            continue;
            locali2 = finally;
          }
        }
        finally
        {
          locali1.close();
        }
        locali2.b("CLEAN").i(32);
      }
      finally {}
      locali2.b(DiskLruCache.Entry.access$1500(localEntry));
      localEntry.writeLengths(locali2);
      locali2.i(10);
    }
    locali2.close();
    if (this.fileSystem.exists(this.journalFile)) {
      this.fileSystem.rename(this.journalFile, this.journalFileBackup);
    }
    this.fileSystem.rename(this.journalFileTmp, this.journalFile);
    this.fileSystem.delete(this.journalFileBackup);
    this.journalWriter = newJournalWriter();
    this.hasJournalErrors = false;
  }
  
  private boolean removeEntry(DiskLruCache.Entry paramEntry)
  {
    if (DiskLruCache.Entry.access$900(paramEntry) != null) {
      DiskLruCache.Editor.access$1902(DiskLruCache.Entry.access$900(paramEntry), true);
    }
    int i = 0;
    while (i < this.valueCount)
    {
      this.fileSystem.delete(DiskLruCache.Entry.access$1300(paramEntry)[i]);
      this.size -= DiskLruCache.Entry.access$1200(paramEntry)[i];
      DiskLruCache.Entry.access$1200(paramEntry)[i] = 0L;
      i += 1;
    }
    this.redundantOpCount += 1;
    this.journalWriter.b("REMOVE").i(32).b(DiskLruCache.Entry.access$1500(paramEntry)).i(10);
    this.lruEntries.remove(DiskLruCache.Entry.access$1500(paramEntry));
    if (journalRebuildRequired()) {
      this.executor.execute(this.cleanupRunnable);
    }
    return true;
  }
  
  private void trimToSize()
  {
    while (this.size > this.maxSize) {
      removeEntry((DiskLruCache.Entry)this.lruEntries.values().iterator().next());
    }
  }
  
  private void validateKey(String paramString)
  {
    if (!LEGAL_KEY_PATTERN.matcher(paramString).matches()) {
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + paramString + "\"");
    }
  }
  
  public void close()
  {
    for (;;)
    {
      try
      {
        if ((!this.initialized) || (this.closed))
        {
          this.closed = true;
          return;
        }
        DiskLruCache.Entry[] arrayOfEntry = (DiskLruCache.Entry[])this.lruEntries.values().toArray(new DiskLruCache.Entry[this.lruEntries.size()]);
        int j = arrayOfEntry.length;
        int i = 0;
        if (i < j)
        {
          DiskLruCache.Entry localEntry = arrayOfEntry[i];
          if (DiskLruCache.Entry.access$900(localEntry) != null) {
            DiskLruCache.Entry.access$900(localEntry).abort();
          }
        }
        else
        {
          trimToSize();
          this.journalWriter.close();
          this.journalWriter = null;
          this.closed = true;
          continue;
        }
        i += 1;
      }
      finally {}
    }
  }
  
  public void delete()
  {
    close();
    this.fileSystem.deleteContents(this.directory);
  }
  
  public DiskLruCache.Editor edit(String paramString)
  {
    return edit(paramString, -1L);
  }
  
  public void evictAll()
  {
    try
    {
      initialize();
      DiskLruCache.Entry[] arrayOfEntry = (DiskLruCache.Entry[])this.lruEntries.values().toArray(new DiskLruCache.Entry[this.lruEntries.size()]);
      int j = arrayOfEntry.length;
      int i = 0;
      while (i < j)
      {
        removeEntry(arrayOfEntry[i]);
        i += 1;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 142	com/squareup/okhttp/internal/DiskLruCache:initialized	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokespecial 356	com/squareup/okhttp/internal/DiskLruCache:checkNotClosed	()V
    //   18: aload_0
    //   19: invokespecial 149	com/squareup/okhttp/internal/DiskLruCache:trimToSize	()V
    //   22: aload_0
    //   23: getfield 281	com/squareup/okhttp/internal/DiskLruCache:journalWriter	Ld/i;
    //   26: invokeinterface 306 1 0
    //   31: goto -20 -> 11
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	DiskLruCache
    //   6	2	1	bool	boolean
    //   34	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	34	finally
    //   14	31	34	finally
  }
  
  /* Error */
  public DiskLruCache.Snapshot get(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 354	com/squareup/okhttp/internal/DiskLruCache:initialize	()V
    //   6: aload_0
    //   7: invokespecial 356	com/squareup/okhttp/internal/DiskLruCache:checkNotClosed	()V
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial 359	com/squareup/okhttp/internal/DiskLruCache:validateKey	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield 106	com/squareup/okhttp/internal/DiskLruCache:lruEntries	Ljava/util/LinkedHashMap;
    //   19: aload_1
    //   20: invokevirtual 362	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast 212	com/squareup/okhttp/internal/DiskLruCache$Entry
    //   26: astore_3
    //   27: aload_3
    //   28: ifnull +12 -> 40
    //   31: aload_3
    //   32: invokestatic 220	com/squareup/okhttp/internal/DiskLruCache$Entry:access$800	(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z
    //   35: istore_2
    //   36: iload_2
    //   37: ifne +9 -> 46
    //   40: aconst_null
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: areturn
    //   46: aload_3
    //   47: invokevirtual 543	com/squareup/okhttp/internal/DiskLruCache$Entry:snapshot	()Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    //   50: astore_3
    //   51: aload_3
    //   52: ifnonnull +8 -> 60
    //   55: aconst_null
    //   56: astore_1
    //   57: goto -15 -> 42
    //   60: aload_0
    //   61: aload_0
    //   62: getfield 189	com/squareup/okhttp/internal/DiskLruCache:redundantOpCount	I
    //   65: iconst_1
    //   66: iadd
    //   67: putfield 189	com/squareup/okhttp/internal/DiskLruCache:redundantOpCount	I
    //   70: aload_0
    //   71: getfield 281	com/squareup/okhttp/internal/DiskLruCache:journalWriter	Ld/i;
    //   74: ldc 35
    //   76: invokeinterface 287 2 0
    //   81: bipush 32
    //   83: invokeinterface 291 2 0
    //   88: aload_1
    //   89: invokeinterface 287 2 0
    //   94: bipush 10
    //   96: invokeinterface 291 2 0
    //   101: pop
    //   102: aload_3
    //   103: astore_1
    //   104: aload_0
    //   105: invokespecial 181	com/squareup/okhttp/internal/DiskLruCache:journalRebuildRequired	()Z
    //   108: ifeq -66 -> 42
    //   111: aload_0
    //   112: getfield 138	com/squareup/okhttp/internal/DiskLruCache:executor	Ljava/util/concurrent/Executor;
    //   115: aload_0
    //   116: getfield 115	com/squareup/okhttp/internal/DiskLruCache:cleanupRunnable	Ljava/lang/Runnable;
    //   119: invokeinterface 312 2 0
    //   124: aload_3
    //   125: astore_1
    //   126: goto -84 -> 42
    //   129: astore_1
    //   130: aload_0
    //   131: monitorexit
    //   132: aload_1
    //   133: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	this	DiskLruCache
    //   0	134	1	paramString	String
    //   35	2	2	bool	boolean
    //   26	99	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	129	finally
    //   31	36	129	finally
    //   46	51	129	finally
    //   60	102	129	finally
    //   104	124	129	finally
  }
  
  public File getDirectory()
  {
    return this.directory;
  }
  
  public long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void initialize()
  {
    try
    {
      if ((!$assertionsDisabled) && (!Thread.holdsLock(this))) {
        throw new AssertionError();
      }
    }
    finally {}
    boolean bool = this.initialized;
    if (bool) {
      return;
    }
    if (this.fileSystem.exists(this.journalFileBackup))
    {
      if (!this.fileSystem.exists(this.journalFile)) {
        break label189;
      }
      this.fileSystem.delete(this.journalFileBackup);
    }
    for (;;)
    {
      bool = this.fileSystem.exists(this.journalFile);
      if (bool) {
        try
        {
          readJournal();
          processJournal();
          this.initialized = true;
        }
        catch (IOException localIOException)
        {
          Platform.get().logW("DiskLruCache " + this.directory + " is corrupt: " + localIOException.getMessage() + ", removing");
          delete();
          this.closed = false;
        }
      }
      rebuildJournal();
      this.initialized = true;
      break;
      label189:
      this.fileSystem.rename(this.journalFileBackup, this.journalFile);
    }
  }
  
  public boolean isClosed()
  {
    try
    {
      boolean bool = this.closed;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean remove(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 354	com/squareup/okhttp/internal/DiskLruCache:initialize	()V
    //   6: aload_0
    //   7: invokespecial 356	com/squareup/okhttp/internal/DiskLruCache:checkNotClosed	()V
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial 359	com/squareup/okhttp/internal/DiskLruCache:validateKey	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield 106	com/squareup/okhttp/internal/DiskLruCache:lruEntries	Ljava/util/LinkedHashMap;
    //   19: aload_1
    //   20: invokevirtual 362	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast 212	com/squareup/okhttp/internal/DiskLruCache$Entry
    //   26: astore_1
    //   27: aload_1
    //   28: ifnonnull +9 -> 37
    //   31: iconst_0
    //   32: istore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: iload_2
    //   36: ireturn
    //   37: aload_0
    //   38: aload_1
    //   39: invokespecial 175	com/squareup/okhttp/internal/DiskLruCache:removeEntry	(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z
    //   42: istore_2
    //   43: goto -10 -> 33
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	DiskLruCache
    //   0	51	1	paramString	String
    //   32	11	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	27	46	finally
    //   37	43	46	finally
  }
  
  public void setMaxSize(long paramLong)
  {
    try
    {
      this.maxSize = paramLong;
      if (this.initialized) {
        this.executor.execute(this.cleanupRunnable);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long size()
  {
    try
    {
      initialize();
      long l = this.size;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Iterator<DiskLruCache.Snapshot> snapshots()
  {
    try
    {
      initialize();
      DiskLruCache.3 local3 = new DiskLruCache.3(this);
      return local3;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */