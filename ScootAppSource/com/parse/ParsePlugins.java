package com.parse;

import java.io.File;

class ParsePlugins
{
  private static final String INSTALLATION_ID_LOCATION = "installationId";
  private static final Object LOCK = new Object();
  private static ParsePlugins instance;
  private final String applicationId;
  File cacheDir;
  private final String clientKey;
  File filesDir;
  private InstallationId installationId;
  final Object lock = new Object();
  File parseDir;
  private ParseHttpClient restClient;
  
  private ParsePlugins(String paramString1, String paramString2)
  {
    this.applicationId = paramString1;
    this.clientKey = paramString2;
  }
  
  private static File createFileDir(File paramFile)
  {
    if ((!paramFile.exists()) && (!paramFile.mkdirs())) {}
    return paramFile;
  }
  
  static ParsePlugins get()
  {
    synchronized (LOCK)
    {
      ParsePlugins localParsePlugins = instance;
      return localParsePlugins;
    }
  }
  
  static void initialize(String paramString1, String paramString2)
  {
    set(new ParsePlugins(paramString1, paramString2));
  }
  
  static void reset()
  {
    synchronized (LOCK)
    {
      instance = null;
      return;
    }
  }
  
  static void set(ParsePlugins paramParsePlugins)
  {
    synchronized (LOCK)
    {
      if (instance != null) {
        throw new IllegalStateException("ParsePlugins is already initialized");
      }
    }
    instance = paramParsePlugins;
  }
  
  String applicationId()
  {
    return this.applicationId;
  }
  
  String clientKey()
  {
    return this.clientKey;
  }
  
  File getCacheDir()
  {
    throw new IllegalStateException("Stub");
  }
  
  File getFilesDir()
  {
    throw new IllegalStateException("Stub");
  }
  
  @Deprecated
  File getParseDir()
  {
    throw new IllegalStateException("Stub");
  }
  
  InstallationId installationId()
  {
    synchronized (this.lock)
    {
      if (this.installationId == null) {
        this.installationId = new InstallationId(new File(getParseDir(), "installationId"));
      }
      InstallationId localInstallationId = this.installationId;
      return localInstallationId;
    }
  }
  
  ParseHttpClient newHttpClient()
  {
    return ParseHttpClient.createClient(10000, null);
  }
  
  ParseHttpClient restClient()
  {
    synchronized (this.lock)
    {
      if (this.restClient == null)
      {
        this.restClient = newHttpClient();
        this.restClient.addInternalInterceptor(new ParsePlugins.1(this));
      }
      ParseHttpClient localParseHttpClient = this.restClient;
      return localParseHttpClient;
    }
  }
  
  String userAgent()
  {
    return "Parse Java SDK";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePlugins.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */