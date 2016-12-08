package com.tushar.taxiapp.scootapp;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;

final class f
  implements CompoundButton.OnCheckedChangeListener
{
  f(BookingConfirmation paramBookingConfirmation, RadioButton paramRadioButton1, RadioButton paramRadioButton2, RadioButton paramRadioButton3, Button paramButton) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.a.setChecked(false);
      this.b.setChecked(false);
      this.c.setChecked(false);
      this.d.setEnabled(true);
      this.d.setClickable(true);
      this.d.setBackgroundResource(2130837922);
      this.d.setTextColor(-1);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */