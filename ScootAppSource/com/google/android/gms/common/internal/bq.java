package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b.fb;
import com.google.android.gms.b.fc;

public final class bq
{
  private static Object a = new Object();
  private static boolean b;
  private static String c;
  private static int d;
  
  public static int a(Context paramContext)
  {
    b(paramContext);
    return d;
  }
  
  private static void b(Context paramContext)
  {
    String str;
    synchronized (a)
    {
      if (b) {
        return;
      }
      b = true;
      str = paramContext.getPackageName();
      paramContext = fc.b(paramContext);
    }
    try
    {
      paramContext = paramContext.a(str, 128).metaData;
      if (paramContext == null)
      {
        return;
        paramContext = finally;
        throw paramContext;
      }
      c = paramContext.getString("com.google.app.id");
      d = paramContext.getInt("com.google.android.gms.version");
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        Log.wtf("MetadataValueReader", "This should never happen.", paramContext);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */