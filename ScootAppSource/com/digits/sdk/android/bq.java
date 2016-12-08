package com.digits.sdk.android;

import android.os.CountDownTimer;
import android.widget.TextView;

final class bq
  extends CountDownTimer
{
  bq(bo parambo, long paramLong1, long paramLong2, TextView paramTextView, InvertedStateButton paramInvertedStateButton1, InvertedStateButton paramInvertedStateButton2)
  {
    super(paramLong1, paramLong2);
  }
  
  private int a(double paramDouble)
  {
    return (int)Math.ceil(paramDouble / 1000.0D);
  }
  
  public void onFinish()
  {
    this.a.setText("");
    this.a.setEnabled(true);
    this.b.setEnabled(true);
    this.c.setEnabled(true);
  }
  
  public void onTick(long paramLong)
  {
    this.a.setText(String.valueOf(a(paramLong)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */