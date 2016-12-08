package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.s;

final class x
  extends s
{
  private Handler a;
  
  private void a(int paramInt, Object paramObject)
  {
    if (this.a == null)
    {
      Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = paramInt;
    localMessage.obj = paramObject;
    this.a.sendMessage(localMessage);
  }
  
  public void a(LocationAvailability paramLocationAvailability)
  {
    a(1, paramLocationAvailability);
  }
  
  public void a(LocationResult paramLocationResult)
  {
    a(0, paramLocationResult);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */