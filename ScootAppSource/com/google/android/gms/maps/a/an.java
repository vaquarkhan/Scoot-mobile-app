package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.m;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.maps.model.g;

public class an
{
  private static Context a;
  private static ar b;
  
  public static ar a(Context paramContext)
  {
    b.a(paramContext);
    if (b != null) {
      return b;
    }
    b(paramContext);
    b = c(paramContext);
    try
    {
      b.a(m.a(d(paramContext).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
      return b;
    }
    catch (RemoteException paramContext)
    {
      throw new g(paramContext);
    }
  }
  
  private static <T> T a(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return (T)localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {}
      for (paramClass = "Unable to instantiate the dynamic class ".concat(paramClass);; paramClass = new String("Unable to instantiate the dynamic class ")) {
        throw new IllegalStateException(paramClass);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() == 0) {}
    }
    for (paramClass = "Unable to call the default constructor of ".concat(paramClass);; paramClass = new String("Unable to call the default constructor of ")) {
      throw new IllegalStateException(paramClass);
    }
  }
  
  private static <T> T a(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = a(((ClassLoader)b.a(paramClassLoader)).loadClass(paramString));
      return paramClassLoader;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      paramClassLoader = String.valueOf(paramString);
      if (paramClassLoader.length() == 0) {}
    }
    for (paramClassLoader = "Unable to find dynamic class ".concat(paramClassLoader);; paramClassLoader = new String("Unable to find dynamic class ")) {
      throw new IllegalStateException(paramClassLoader);
    }
  }
  
  public static boolean a()
  {
    return false;
  }
  
  private static Class<?> b()
  {
    try
    {
      Class localClass = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new RuntimeException(localClassNotFoundException);
    }
  }
  
  private static void b(Context paramContext)
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext);
    switch (i)
    {
    default: 
      throw new c(i);
    }
  }
  
  private static ar c(Context paramContext)
  {
    if (a())
    {
      Log.i(an.class.getSimpleName(), "Making Creator statically");
      return (ar)a(b());
    }
    Log.i(an.class.getSimpleName(), "Making Creator dynamically");
    return as.a((IBinder)a(d(paramContext).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
  }
  
  private static Context d(Context paramContext)
  {
    if (a == null) {
      if (!a()) {
        break label23;
      }
    }
    label23:
    for (a = paramContext.getApplicationContext();; a = GooglePlayServicesUtil.getRemoteContext(paramContext)) {
      return a;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */