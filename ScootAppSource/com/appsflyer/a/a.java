package com.appsflyer.a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static a a = new a();
  
  public static a a()
  {
    return a;
  }
  
  private b a(File paramFile)
  {
    try
    {
      FileReader localFileReader = new FileReader(paramFile);
      Object localObject = new char[(int)paramFile.length()];
      localFileReader.read((char[])localObject);
      localObject = new b((char[])localObject);
      ((b)localObject).a(paramFile.getName());
      localFileReader.close();
      return (b)localObject;
    }
    catch (Exception paramFile) {}
    return null;
  }
  
  private File c(Context paramContext)
  {
    return new File(paramContext.getFilesDir(), "AFRequestCache");
  }
  
  public void a(Context paramContext)
  {
    try
    {
      if (!c(paramContext).exists()) {
        c(paramContext).mkdir();
      }
      return;
    }
    catch (Exception paramContext)
    {
      Log.i("AppsFlyer_3.0", "Could not create cache directory");
    }
  }
  
  public void a(b paramb, Context paramContext)
  {
    try
    {
      File localFile = c(paramContext);
      if (!localFile.exists())
      {
        localFile.mkdir();
        return;
      }
      if (localFile.listFiles().length > 20)
      {
        Log.i("AppsFlyer_3.0", "reached cache limit, not caching request");
        return;
      }
    }
    catch (Exception paramb)
    {
      Log.i("AppsFlyer_3.0", "Could not cache request");
      return;
    }
    Log.i("AppsFlyer_3.0", "caching request...");
    paramContext = new File(c(paramContext), Long.toString(System.currentTimeMillis()));
    paramContext.createNewFile();
    paramContext = new OutputStreamWriter(new FileOutputStream(paramContext.getPath(), true));
    paramContext.write("version=");
    paramContext.write(paramb.a());
    paramContext.write(10);
    paramContext.write("url=");
    paramContext.write(paramb.c());
    paramContext.write(10);
    paramContext.write("data=");
    paramContext.write(paramb.b());
    paramContext.write(10);
    paramContext.flush();
    paramContext.close();
  }
  
  public void a(String paramString, Context paramContext)
  {
    paramContext = new File(c(paramContext), paramString);
    Log.i("AppsFlyer_3.0", "Deleting " + paramString + " from cache");
    if (paramContext.exists()) {}
    try
    {
      paramContext.delete();
      return;
    }
    catch (Exception paramContext)
    {
      Log.i("AppsFlyer_3.0", "Could not delete " + paramString + " from cache", paramContext);
    }
  }
  
  public List<b> b(Context paramContext)
  {
    localArrayList = new ArrayList();
    try
    {
      paramContext = c(paramContext);
      if (!paramContext.exists())
      {
        paramContext.mkdir();
        return localArrayList;
      }
      paramContext = paramContext.listFiles();
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        File localFile = paramContext[i];
        Log.i("AppsFlyer_3.0", "Found cached request" + localFile.getName());
        localArrayList.add(a(localFile));
        i += 1;
      }
      return localArrayList;
    }
    catch (Exception paramContext)
    {
      Log.i("AppsFlyer_3.0", "Could not cache request");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */