package com.mixpanel.android.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;
import com.mixpanel.android.mpmetrics.ab;

final class v
  implements SensorEventListener
{
  private int a = -1;
  private int b = 0;
  private long c = -1L;
  private final float[] d = new float[3];
  private final w e;
  
  public v(w paramw)
  {
    this.e = paramw;
  }
  
  private float[] a(float[] paramArrayOfFloat)
  {
    int i = 0;
    while (i < 3)
    {
      float f = this.d[i];
      this.d[i] = (f + 0.7F * (paramArrayOfFloat[i] - f));
      i += 1;
    }
    return this.d;
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float[] arrayOfFloat = a(paramSensorEvent.values);
    int i = this.b;
    float f = arrayOfFloat[0] * arrayOfFloat[0] + arrayOfFloat[1] * arrayOfFloat[1] + arrayOfFloat[2] * arrayOfFloat[2];
    this.b = 0;
    if ((arrayOfFloat[2] > 7.8F) && (arrayOfFloat[2] < 11.8F)) {
      this.b = -1;
    }
    if ((arrayOfFloat[2] < -7.8F) && (arrayOfFloat[2] > -11.8F)) {
      this.b = 1;
    }
    if ((f < 60.840004F) || (f > 139.24F)) {
      this.b = 0;
    }
    if (i != this.b) {
      this.c = paramSensorEvent.timestamp;
    }
    long l = paramSensorEvent.timestamp - this.c;
    switch (this.b)
    {
    }
    do
    {
      do
      {
        do
        {
          return;
        } while ((l <= 250000000L) || (this.a != 0));
        if (ab.a) {
          Log.v("MixpanelAPI.FlipGesture", "Flip gesture begun");
        }
        this.a = 1;
        return;
      } while ((l <= 250000000L) || (this.a != 1));
      if (ab.a) {
        Log.v("MixpanelAPI.FlipGesture", "Flip gesture completed");
      }
      this.a = 0;
      this.e.a();
      return;
    } while ((l <= 1000000000L) || (this.a == 0));
    if (ab.a) {
      Log.v("MixpanelAPI.FlipGesture", "Flip gesture abandoned");
    }
    this.a = 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */