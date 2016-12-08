package com.facebook.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.ab;
import com.facebook.p;
import com.facebook.w;
import java.util.Collection;
import java.util.Iterator;

public final class az
{
  private static final String a = az.class.getName();
  
  public static void a()
  {
    if (!Looper.getMainLooper().equals(Looper.myLooper())) {
      throw new p("This method should be called from the UI thread");
    }
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, "context");
    if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
    {
      if (paramBoolean) {
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
      }
      Log.w(a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }
  }
  
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw new NullPointerException("Argument '" + paramString + "' cannot be null");
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (as.a(paramString1)) {
      throw new IllegalArgumentException("Argument '" + paramString2 + "' cannot be null or empty");
    }
  }
  
  public static <T> void a(Collection<T> paramCollection, String paramString)
  {
    if (paramCollection.isEmpty()) {
      throw new IllegalArgumentException("Container '" + paramString + "' cannot be empty");
    }
  }
  
  public static void b()
  {
    if (!w.a()) {
      throw new ab("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, "context");
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (localPackageManager != null) {
      paramContext = new ComponentName(paramContext, FacebookActivity.class);
    }
    try
    {
      localObject1 = localPackageManager.getActivityInfo(paramContext, 1);
      if (localObject1 == null)
      {
        if (paramBoolean) {
          throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
        Log.w(a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        localObject1 = localObject2;
      }
    }
  }
  
  public static <T> void b(Collection<T> paramCollection, String paramString)
  {
    a(paramCollection, paramString);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (paramCollection.next() == null) {
        throw new NullPointerException("Container '" + paramString + "' cannot contain null values");
      }
    }
  }
  
  public static <T> void c(Collection<T> paramCollection, String paramString)
  {
    b(paramCollection, paramString);
    a(paramCollection, paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */