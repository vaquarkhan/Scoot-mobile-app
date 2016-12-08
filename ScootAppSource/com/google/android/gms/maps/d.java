package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.an;
import com.google.android.gms.maps.a.ar;
import com.google.android.gms.maps.model.g;

public final class d
{
  private static boolean a = false;
  
  public static int a(Context paramContext)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        com.google.android.gms.common.internal.b.a(paramContext, "Context is null");
        boolean bool = a;
        if (!bool) {
          continue;
        }
      }
      finally
      {
        try
        {
          paramContext = an.a(paramContext);
          a(paramContext);
          a = true;
        }
        catch (c paramContext)
        {
          i = paramContext.a;
        }
        paramContext = finally;
      }
      return i;
    }
  }
  
  public static void a(ar paramar)
  {
    try
    {
      b.a(paramar.a());
      com.google.android.gms.maps.model.b.a(paramar.b());
      return;
    }
    catch (RemoteException paramar)
    {
      throw new g(paramar);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */