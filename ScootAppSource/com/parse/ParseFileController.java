package com.parse;

import a.o;
import java.io.File;

class ParseFileController
{
  private ParseHttpClient awsClient;
  private final File cachePath;
  private final Object lock = new Object();
  private final ParseHttpClient restClient;
  
  public ParseFileController(ParseHttpClient paramParseHttpClient, File paramFile)
  {
    this.restClient = paramParseHttpClient;
    this.cachePath = paramFile;
  }
  
  ParseFileController awsClient(ParseHttpClient paramParseHttpClient)
  {
    synchronized (this.lock)
    {
      this.awsClient = paramParseHttpClient;
      return this;
    }
  }
  
  ParseHttpClient awsClient()
  {
    synchronized (this.lock)
    {
      if (this.awsClient == null) {
        this.awsClient = ParsePlugins.get().newHttpClient();
      }
      ParseHttpClient localParseHttpClient = this.awsClient;
      return localParseHttpClient;
    }
  }
  
  public void clearCache()
  {
    File[] arrayOfFile = this.cachePath.listFiles();
    if (arrayOfFile == null) {}
    for (;;)
    {
      return;
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        ParseFileUtils.deleteQuietly(arrayOfFile[i]);
        i += 1;
      }
    }
  }
  
  public o<File> fetchAsync(ParseFile.State paramState, String paramString, ProgressCallback paramProgressCallback, o<Void> paramo)
  {
    if ((paramo != null) && (paramo.d())) {
      return o.i();
    }
    paramString = getCacheFile(paramState);
    return o.a(new ParseFileController.4(this, paramString), ParseExecutors.io()).b(new ParseFileController.3(this, paramString, paramo, paramState, paramProgressCallback));
  }
  
  public File getCacheFile(ParseFile.State paramState)
  {
    return new File(this.cachePath, paramState.name());
  }
  
  File getTempFile(ParseFile.State paramState)
  {
    if (paramState.url() == null) {
      return null;
    }
    return new File(this.cachePath, paramState.url() + ".tmp");
  }
  
  public boolean isDataAvailable(ParseFile.State paramState)
  {
    return getCacheFile(paramState).exists();
  }
  
  public o<ParseFile.State> saveAsync(ParseFile.State paramState, File paramFile, String paramString, ProgressCallback paramProgressCallback, o<Void> paramo)
  {
    if (paramState.url() != null) {
      return o.a(paramState);
    }
    if ((paramo != null) && (paramo.d())) {
      return o.i();
    }
    paramString = ((ParseRESTFileCommand.Builder)new ParseRESTFileCommand.Builder().fileName(paramState.name()).file(paramFile).contentType(paramState.mimeType()).sessionToken(paramString)).build();
    paramString.enableRetrying();
    return paramString.executeAsync(this.restClient, paramProgressCallback, null, paramo).c(new ParseFileController.2(this, paramState, paramFile), ParseExecutors.io());
  }
  
  public o<ParseFile.State> saveAsync(ParseFile.State paramState, byte[] paramArrayOfByte, String paramString, ProgressCallback paramProgressCallback, o<Void> paramo)
  {
    if (paramState.url() != null) {
      return o.a(paramState);
    }
    if ((paramo != null) && (paramo.d())) {
      return o.i();
    }
    paramString = ((ParseRESTFileCommand.Builder)new ParseRESTFileCommand.Builder().fileName(paramState.name()).data(paramArrayOfByte).contentType(paramState.mimeType()).sessionToken(paramString)).build();
    paramString.enableRetrying();
    return paramString.executeAsync(this.restClient, paramProgressCallback, null, paramo).c(new ParseFileController.1(this, paramState, paramArrayOfByte), ParseExecutors.io());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFileController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */