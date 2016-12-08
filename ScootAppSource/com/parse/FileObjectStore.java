package com.parse;

import a.o;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

class FileObjectStore<T extends ParseObject>
  implements ParseObjectStore<T>
{
  private final String className;
  private final ParseObjectCurrentCoder coder;
  private final File file;
  
  public FileObjectStore(Class<T> paramClass, File paramFile, ParseObjectCurrentCoder paramParseObjectCurrentCoder)
  {
    this(getSubclassingController().getClassName(paramClass), paramFile, paramParseObjectCurrentCoder);
  }
  
  public FileObjectStore(String paramString, File paramFile, ParseObjectCurrentCoder paramParseObjectCurrentCoder)
  {
    this.className = paramString;
    this.file = paramFile;
    this.coder = paramParseObjectCurrentCoder;
  }
  
  private static <T extends ParseObject> T getFromDisk(ParseObjectCurrentCoder paramParseObjectCurrentCoder, File paramFile, ParseObject.State.Init paramInit)
  {
    try
    {
      paramFile = ParseFileUtils.readFileToJSONObject(paramFile);
      return ParseObject.from(paramParseObjectCurrentCoder.decode(paramInit, paramFile, ParseDecoder.get()).isComplete(true).build());
    }
    catch (IOException paramParseObjectCurrentCoder)
    {
      return null;
    }
    catch (JSONException paramParseObjectCurrentCoder)
    {
      for (;;) {}
    }
  }
  
  private static ParseObjectSubclassingController getSubclassingController()
  {
    return ParseCorePlugins.getInstance().getSubclassingController();
  }
  
  private static void saveToDisk(ParseObjectCurrentCoder paramParseObjectCurrentCoder, ParseObject paramParseObject, File paramFile)
  {
    paramParseObjectCurrentCoder = paramParseObjectCurrentCoder.encode(paramParseObject.getState(), null, PointerEncoder.get());
    try
    {
      ParseFileUtils.writeJSONObjectToFile(paramFile, paramParseObjectCurrentCoder);
      return;
    }
    catch (IOException paramParseObjectCurrentCoder) {}
  }
  
  public o<Void> deleteAsync()
  {
    return o.a(new FileObjectStore.4(this), ParseExecutors.io());
  }
  
  public o<Boolean> existsAsync()
  {
    return o.a(new FileObjectStore.3(this), ParseExecutors.io());
  }
  
  public o<T> getAsync()
  {
    return o.a(new FileObjectStore.2(this), ParseExecutors.io());
  }
  
  public o<Void> setAsync(T paramT)
  {
    return o.a(new FileObjectStore.1(this, paramT), ParseExecutors.io());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\FileObjectStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */