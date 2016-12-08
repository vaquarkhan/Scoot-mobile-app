package com.squareup.okhttp.internal;

import com.squareup.okhttp.HttpUrl;
import d.ad;
import d.ae;
import d.f;
import d.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class Util
{
  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final Charset UTF_8 = Charset.forName("UTF-8");
  
  public static void checkOffsetAndCount(long paramLong1, long paramLong2, long paramLong3)
  {
    if (((paramLong2 | paramLong3) < 0L) || (paramLong2 > paramLong1) || (paramLong1 - paramLong2 < paramLong3)) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  
  public static void closeAll(Closeable paramCloseable1, Closeable paramCloseable2)
  {
    Object localObject = null;
    for (;;)
    {
      try
      {
        paramCloseable1.close();
        paramCloseable1 = (Closeable)localObject;
      }
      catch (Throwable paramCloseable1)
      {
        continue;
      }
      try
      {
        paramCloseable2.close();
        paramCloseable2 = paramCloseable1;
      }
      catch (Throwable localThrowable)
      {
        paramCloseable2 = paramCloseable1;
        if (paramCloseable1 != null) {
          continue;
        }
        paramCloseable2 = localThrowable;
        continue;
        if (!(paramCloseable2 instanceof IOException)) {
          continue;
        }
        throw ((IOException)paramCloseable2);
        if (!(paramCloseable2 instanceof RuntimeException)) {
          continue;
        }
        throw ((RuntimeException)paramCloseable2);
        if (!(paramCloseable2 instanceof Error)) {
          continue;
        }
        throw ((Error)paramCloseable2);
        throw new AssertionError(paramCloseable2);
      }
    }
    if (paramCloseable2 == null) {
      return;
    }
  }
  
  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable) {}
  }
  
  public static void closeQuietly(ServerSocket paramServerSocket)
  {
    if (paramServerSocket != null) {}
    try
    {
      paramServerSocket.close();
      return;
    }
    catch (RuntimeException paramServerSocket)
    {
      throw paramServerSocket;
    }
    catch (Exception paramServerSocket) {}
  }
  
  public static void closeQuietly(Socket paramSocket)
  {
    if (paramSocket != null) {}
    try
    {
      paramSocket.close();
      return;
    }
    catch (AssertionError paramSocket)
    {
      while (isAndroidGetsocknameError(paramSocket)) {}
      throw paramSocket;
    }
    catch (RuntimeException paramSocket)
    {
      throw paramSocket;
    }
    catch (Exception paramSocket) {}
  }
  
  public static String[] concat(String[] paramArrayOfString, String paramString)
  {
    String[] arrayOfString = new String[paramArrayOfString.length + 1];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramArrayOfString.length);
    arrayOfString[(arrayOfString.length - 1)] = paramString;
    return arrayOfString;
  }
  
  public static boolean contains(String[] paramArrayOfString, String paramString)
  {
    return Arrays.asList(paramArrayOfString).contains(paramString);
  }
  
  public static boolean discard(ad paramad, int paramInt, TimeUnit paramTimeUnit)
  {
    try
    {
      boolean bool = skipAll(paramad, paramInt, paramTimeUnit);
      return bool;
    }
    catch (IOException paramad) {}
    return false;
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static String hostHeader(HttpUrl paramHttpUrl)
  {
    if (paramHttpUrl.port() != HttpUrl.defaultPort(paramHttpUrl.scheme())) {
      return paramHttpUrl.host() + ":" + paramHttpUrl.port();
    }
    return paramHttpUrl.host();
  }
  
  public static <T> List<T> immutableList(List<T> paramList)
  {
    return Collections.unmodifiableList(new ArrayList(paramList));
  }
  
  public static <T> List<T> immutableList(T... paramVarArgs)
  {
    return Collections.unmodifiableList(Arrays.asList((Object[])paramVarArgs.clone()));
  }
  
  public static <K, V> Map<K, V> immutableMap(Map<K, V> paramMap)
  {
    return Collections.unmodifiableMap(new LinkedHashMap(paramMap));
  }
  
  private static <T> List<T> intersect(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    ArrayList localArrayList = new ArrayList();
    int k = paramArrayOfT1.length;
    int i = 0;
    if (i < k)
    {
      T ? = paramArrayOfT1[i];
      int m = paramArrayOfT2.length;
      int j = 0;
      for (;;)
      {
        if (j < m)
        {
          T ? = paramArrayOfT2[j];
          if (?.equals(?)) {
            localArrayList.add(?);
          }
        }
        else
        {
          i += 1;
          break;
        }
        j += 1;
      }
    }
    return localArrayList;
  }
  
  public static <T> T[] intersect(Class<T> paramClass, T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    paramArrayOfT1 = intersect(paramArrayOfT1, paramArrayOfT2);
    return paramArrayOfT1.toArray((Object[])Array.newInstance(paramClass, paramArrayOfT1.size()));
  }
  
  public static boolean isAndroidGetsocknameError(AssertionError paramAssertionError)
  {
    return (paramAssertionError.getCause() != null) && (paramAssertionError.getMessage() != null) && (paramAssertionError.getMessage().contains("getsockname failed"));
  }
  
  public static String md5Hex(String paramString)
  {
    try
    {
      paramString = k.a(MessageDigest.getInstance("MD5").digest(paramString.getBytes("UTF-8"))).d();
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;) {}
    }
  }
  
  public static k sha1(k paramk)
  {
    try
    {
      paramk = k.a(MessageDigest.getInstance("SHA-1").digest(paramk.g()));
      return paramk;
    }
    catch (NoSuchAlgorithmException paramk)
    {
      throw new AssertionError(paramk);
    }
  }
  
  public static String shaBase64(String paramString)
  {
    try
    {
      paramString = k.a(MessageDigest.getInstance("SHA-1").digest(paramString.getBytes("UTF-8"))).b();
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;) {}
    }
  }
  
  public static boolean skipAll(ad paramad, int paramInt, TimeUnit paramTimeUnit)
  {
    long l2 = System.nanoTime();
    long l1;
    if (paramad.timeout().hasDeadline()) {
      l1 = paramad.timeout().deadlineNanoTime() - l2;
    }
    for (;;)
    {
      paramad.timeout().deadlineNanoTime(Math.min(l1, paramTimeUnit.toNanos(paramInt)) + l2);
      try
      {
        paramTimeUnit = new f();
        while (paramad.read(paramTimeUnit, 2048L) != -1L) {
          paramTimeUnit.t();
        }
      }
      catch (InterruptedIOException paramTimeUnit)
      {
        if (l1 == Long.MAX_VALUE) {
          paramad.timeout().clearDeadline();
        }
        for (;;)
        {
          return false;
          l1 = Long.MAX_VALUE;
          break;
          if (l1 == Long.MAX_VALUE) {
            paramad.timeout().clearDeadline();
          }
          for (;;)
          {
            return true;
            paramad.timeout().deadlineNanoTime(l1 + l2);
          }
          paramad.timeout().deadlineNanoTime(l1 + l2);
        }
      }
      finally
      {
        if (l1 != Long.MAX_VALUE) {
          break label188;
        }
      }
    }
    paramad.timeout().clearDeadline();
    for (;;)
    {
      throw paramTimeUnit;
      label188:
      paramad.timeout().deadlineNanoTime(l1 + l2);
    }
  }
  
  public static ThreadFactory threadFactory(String paramString, boolean paramBoolean)
  {
    return new Util.1(paramString, paramBoolean);
  }
  
  public static String toHumanReadableAscii(String paramString)
  {
    int m = paramString.length();
    int i = 0;
    int j;
    for (;;)
    {
      localObject = paramString;
      if (i >= m) {
        break label119;
      }
      j = paramString.codePointAt(i);
      if ((j <= 31) || (j >= 127)) {
        break;
      }
      i += Character.charCount(j);
    }
    Object localObject = new f();
    ((f)localObject).a(paramString, 0, i);
    if (i < m)
    {
      int k = paramString.codePointAt(i);
      if ((k > 31) && (k < 127)) {}
      for (j = k;; j = 63)
      {
        ((f)localObject).a(j);
        i = Character.charCount(k) + i;
        break;
      }
    }
    localObject = ((f)localObject).q();
    label119:
    return (String)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */