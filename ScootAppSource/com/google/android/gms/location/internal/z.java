package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.g;
import com.google.android.gms.location.v;

final class z
  extends v
{
  private Handler a;
  
  z(g paramg, Looper paramLooper)
  {
    boolean bool;
    if (paramLooper == null)
    {
      if (Looper.myLooper() != null)
      {
        bool = true;
        b.a(bool, "Can't create handler inside thread that has not called Looper.prepare()");
      }
    }
    else {
      if (paramLooper != null) {
        break label46;
      }
    }
    label46:
    for (paramg = new y(paramg);; paramg = new y(paramg, paramLooper))
    {
      this.a = paramg;
      return;
      bool = false;
      break;
    }
  }
  
  public void a()
  {
    this.a = null;
  }
  
  public void a(Location paramLocation)
  {
    if (this.a == null)
    {
      Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramLocation;
    this.a.sendMessage(localMessage);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */