package com.tushar.taxiapp.scootapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;

final class af
  implements CompoundButton.OnCheckedChangeListener
{
  af(RideCompletionActivity paramRideCompletionActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      RideCompletionActivity.d(this.a).setChecked(false);
      RideCompletionActivity.e(this.a).setChecked(false);
      RideCompletionActivity.g(this.a).setChecked(false);
      RideCompletionActivity.h(this.a).setChecked(false);
      RideCompletionActivity.a(this.a, RideCompletionActivity.f(this.a).getTag().toString());
      RideCompletionActivity.i(this.a).setVisibility(8);
      this.a.l();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */