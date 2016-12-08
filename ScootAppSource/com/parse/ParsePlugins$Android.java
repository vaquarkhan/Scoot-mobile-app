package com.parse;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.SSLSessionCache;
import android.os.Build.VERSION;
import java.io.File;

class ParsePlugins$Android
  extends ParsePlugins
{
  private final Context applicationContext;
  
  private ParsePlugins$Android(Context paramContext, String paramString1, String paramString2)
  {
    super(paramString1, paramString2, null);
    this.applicationContext = paramContext.getApplicationContext();
  }
  
  static Android get()
  {
    return (Android)ParsePlugins.get();
  }
  
  static void initialize(Context paramContext, String paramString1, String paramString2)
  {
    ParsePlugins.set(new Android(paramContext, paramString1, paramString2));
  }
  
  Context applicationContext()
  {
    return this.applicationContext;
  }
  
  File getCacheDir()
  {
    synchronized (this.lock)
    {
      if (this.cacheDir == null) {
        this.cacheDir = new File(this.applicationContext.getCacheDir(), "com.parse");
      }
      File localFile = ParsePlugins.access$300(this.cacheDir);
      return localFile;
    }
  }
  
  File getFilesDir()
  {
    synchronized (this.lock)
    {
      if (this.filesDir == null) {
        this.filesDir = new File(this.applicationContext.getFilesDir(), "com.parse");
      }
      File localFile = ParsePlugins.access$300(this.filesDir);
      return localFile;
    }
  }
  
  File getParseDir()
  {
    synchronized (this.lock)
    {
      if (this.parseDir == null) {
        this.parseDir = this.applicationContext.getDir("Parse", 0);
      }
      File localFile = ParsePlugins.access$300(this.parseDir);
      return localFile;
    }
  }
  
  public ParseHttpClient newHttpClient()
  {
    return ParseHttpClient.createClient(10000, new SSLSessionCache(this.applicationContext));
  }
  
  String userAgent()
  {
    Object localObject = "unknown";
    try
    {
      String str = this.applicationContext.getPackageName();
      int i = this.applicationContext.getPackageManager().getPackageInfo(str, 0).versionCode;
      str = str + "/" + i;
      localObject = str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return "Parse Android SDK 1.13.1 (" + (String)localObject + ") API Level " + Build.VERSION.SDK_INT;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePlugins$Android.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */