package com.parse;

import a.ac;
import a.o;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public class ParseFile
{
  static final int MAX_FILE_SIZE = 10485760;
  private Set<ac<?>> currentTasks = Collections.synchronizedSet(new HashSet());
  byte[] data;
  File file;
  private ParseFile.State state;
  final TaskQueue taskQueue = new TaskQueue();
  
  ParseFile(ParseFile.State paramState)
  {
    this.state = paramState;
  }
  
  public ParseFile(File paramFile)
  {
    this(paramFile, null);
  }
  
  public ParseFile(File paramFile, String paramString)
  {
    this(new ParseFile.State.Builder().name(paramFile.getName()).mimeType(paramString).build());
    if (paramFile.length() > 10485760L) {
      throw new IllegalArgumentException(String.format("ParseFile must be less than %d bytes", new Object[] { Integer.valueOf(10485760) }));
    }
    this.file = paramFile;
  }
  
  public ParseFile(String paramString, byte[] paramArrayOfByte)
  {
    this(paramString, paramArrayOfByte, null);
  }
  
  public ParseFile(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this(new ParseFile.State.Builder().name(paramString1).mimeType(paramString2).build());
    if (paramArrayOfByte.length > 10485760) {
      throw new IllegalArgumentException(String.format("ParseFile must be less than %d bytes", new Object[] { Integer.valueOf(10485760) }));
    }
    this.data = paramArrayOfByte;
  }
  
  ParseFile(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    this(new ParseFile.State.Builder().name(paramJSONObject.optString("name")).url(paramJSONObject.optString("url")).build());
  }
  
  public ParseFile(byte[] paramArrayOfByte)
  {
    this(null, paramArrayOfByte, null);
  }
  
  public ParseFile(byte[] paramArrayOfByte, String paramString)
  {
    this(null, paramArrayOfByte, paramString);
  }
  
  private o<File> fetchInBackground(ProgressCallback paramProgressCallback, o<Void> paramo1, o<Void> paramo2)
  {
    if ((paramo2 != null) && (paramo2.d())) {
      return o.i();
    }
    return paramo1.b(new ParseFile.12(this, paramo2, paramProgressCallback));
  }
  
  static ParseFileController getFileController()
  {
    return ParseCorePlugins.getInstance().getFileController();
  }
  
  private static ProgressCallback progressCallbackOnMainThread(ProgressCallback paramProgressCallback)
  {
    if (paramProgressCallback == null) {
      return null;
    }
    return new ParseFile.1(paramProgressCallback);
  }
  
  private o<Void> saveAsync(String paramString, ProgressCallback paramProgressCallback, o<Void> paramo1, o<Void> paramo2)
  {
    if (!isDirty()) {
      return o.a(null);
    }
    if ((paramo2 != null) && (paramo2.d())) {
      return o.i();
    }
    return paramo1.b(new ParseFile.2(this, paramo2, paramString, paramProgressCallback));
  }
  
  public void cancel()
  {
    HashSet localHashSet = new HashSet(this.currentTasks);
    Iterator localIterator = localHashSet.iterator();
    while (localIterator.hasNext()) {
      ((ac)localIterator.next()).b();
    }
    this.currentTasks.removeAll(localHashSet);
  }
  
  JSONObject encode()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("__type", "File");
    localJSONObject.put("name", getName());
    if (getUrl() == null) {
      throw new IllegalStateException("Unable to encode an unsaved ParseFile.");
    }
    localJSONObject.put("url", getUrl());
    return localJSONObject;
  }
  
  public byte[] getData()
  {
    return (byte[])ParseTaskUtils.wait(getDataInBackground());
  }
  
  public o<byte[]> getDataInBackground()
  {
    return getDataInBackground((ProgressCallback)null);
  }
  
  public o<byte[]> getDataInBackground(ProgressCallback paramProgressCallback)
  {
    ac localac = new ac();
    this.currentTasks.add(localac);
    return this.taskQueue.enqueue(new ParseFile.7(this, paramProgressCallback, localac)).b(new ParseFile.6(this, localac));
  }
  
  public void getDataInBackground(GetDataCallback paramGetDataCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getDataInBackground(), paramGetDataCallback);
  }
  
  public void getDataInBackground(GetDataCallback paramGetDataCallback, ProgressCallback paramProgressCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getDataInBackground(paramProgressCallback), paramGetDataCallback);
  }
  
  public InputStream getDataStream()
  {
    return (InputStream)ParseTaskUtils.wait(getDataStreamInBackground());
  }
  
  public o<InputStream> getDataStreamInBackground()
  {
    return getDataStreamInBackground((ProgressCallback)null);
  }
  
  public o<InputStream> getDataStreamInBackground(ProgressCallback paramProgressCallback)
  {
    ac localac = new ac();
    this.currentTasks.add(localac);
    return this.taskQueue.enqueue(new ParseFile.11(this, paramProgressCallback, localac)).b(new ParseFile.10(this, localac));
  }
  
  public void getDataStreamInBackground(GetDataStreamCallback paramGetDataStreamCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getDataStreamInBackground(), paramGetDataStreamCallback);
  }
  
  public void getDataStreamInBackground(GetDataStreamCallback paramGetDataStreamCallback, ProgressCallback paramProgressCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getDataStreamInBackground(paramProgressCallback), paramGetDataStreamCallback);
  }
  
  public File getFile()
  {
    return (File)ParseTaskUtils.wait(getFileInBackground());
  }
  
  public o<File> getFileInBackground()
  {
    return getFileInBackground((ProgressCallback)null);
  }
  
  public o<File> getFileInBackground(ProgressCallback paramProgressCallback)
  {
    ac localac = new ac();
    this.currentTasks.add(localac);
    return this.taskQueue.enqueue(new ParseFile.9(this, paramProgressCallback, localac)).b(new ParseFile.8(this, localac));
  }
  
  public void getFileInBackground(GetFileCallback paramGetFileCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getFileInBackground(), paramGetFileCallback);
  }
  
  public void getFileInBackground(GetFileCallback paramGetFileCallback, ProgressCallback paramProgressCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getFileInBackground(paramProgressCallback), paramGetFileCallback);
  }
  
  public String getName()
  {
    return this.state.name();
  }
  
  ParseFile.State getState()
  {
    return this.state;
  }
  
  public String getUrl()
  {
    return this.state.url();
  }
  
  public boolean isDataAvailable()
  {
    return (this.data != null) || (getFileController().isDataAvailable(this.state));
  }
  
  public boolean isDirty()
  {
    return this.state.url() == null;
  }
  
  public void save()
  {
    ParseTaskUtils.wait(saveInBackground());
  }
  
  o<Void> saveAsync(String paramString, ProgressCallback paramProgressCallback, o<Void> paramo)
  {
    return this.taskQueue.enqueue(new ParseFile.5(this, paramString, paramProgressCallback, paramo));
  }
  
  public o<Void> saveInBackground()
  {
    return saveInBackground((ProgressCallback)null);
  }
  
  public o<Void> saveInBackground(ProgressCallback paramProgressCallback)
  {
    ac localac = new ac();
    this.currentTasks.add(localac);
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseFile.4(this, paramProgressCallback, localac)).b(new ParseFile.3(this, localac));
  }
  
  public void saveInBackground(SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(saveInBackground(), paramSaveCallback);
  }
  
  public void saveInBackground(SaveCallback paramSaveCallback, ProgressCallback paramProgressCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(saveInBackground(paramProgressCallback), paramSaveCallback);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */