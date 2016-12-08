package com.tushar.taxiapp.scootapp;

import android.os.CountDownTimer;
import android.widget.ProgressBar;

final class w
  extends CountDownTimer
{
  w(OlaBooking paramOlaBooking, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish()
  {
    OlaBooking.m(this.a);
  }
  
  public void onTick(long paramLong)
  {
    OlaBooking.j(this.a);
    OlaBooking.l(this.a).setProgress(OlaBooking.k(this.a));
    if (paramLong % 15000L == 0L) {
      OlaBooking.m(this.a);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */