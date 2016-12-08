package com.sagar.taxiapp;

import android.os.CountDownTimer;
import android.widget.TextView;

final class cf
  extends CountDownTimer
{
  cf(MobileVerification paramMobileVerification, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish()
  {
    MobileVerification.a(this.a).setText("FU");
  }
  
  public void onTick(long paramLong)
  {
    MobileVerification.a(this.a).setText(paramLong / 1000L + ":00");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */