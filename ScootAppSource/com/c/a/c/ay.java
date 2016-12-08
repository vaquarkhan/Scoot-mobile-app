package com.c.a.c;

import android.content.Context;
import b.a.a.a.a.b.m;
import b.a.a.a.a.f.a;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;
import java.util.Set;

final class ay
{
  private static final ba a = new ba(null);
  private final Context b;
  private final a c;
  private ax d;
  
  public ay(Context paramContext, a parama)
  {
    this(paramContext, parama, null);
  }
  
  public ay(Context paramContext, a parama, String paramString)
  {
    this.b = paramContext;
    this.c = parama;
    this.d = a;
    a(paramString);
  }
  
  private String a(File paramFile)
  {
    paramFile = paramFile.getName();
    int i = paramFile.lastIndexOf(".temp");
    if (i == -1) {
      return paramFile;
    }
    return paramFile.substring("crashlytics-userlog-".length(), i);
  }
  
  private File b(String paramString)
  {
    paramString = "crashlytics-userlog-" + paramString + ".temp";
    return new File(d(), paramString);
  }
  
  private boolean c()
  {
    return m.a(this.b, "com.crashlytics.CollectCustomLogs", true);
  }
  
  private File d()
  {
    File localFile = new File(this.c.a(), "log-files");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return localFile;
  }
  
  public b a()
  {
    return this.d.a();
  }
  
  void a(File paramFile, int paramInt)
  {
    this.d = new bs(paramFile, paramInt);
  }
  
  public final void a(String paramString)
  {
    this.d.b();
    this.d = a;
    if (paramString == null) {
      return;
    }
    if (!c())
    {
      f.h().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
      return;
    }
    a(b(paramString), 65536);
  }
  
  public void a(Set<String> paramSet)
  {
    File[] arrayOfFile = d().listFiles();
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        File localFile = arrayOfFile[i];
        if (!paramSet.contains(a(localFile))) {
          localFile.delete();
        }
        i += 1;
      }
    }
  }
  
  public void b()
  {
    this.d.c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */