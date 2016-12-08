package com.tushar.taxiapp.scootapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import com.b.a.u;

final class j
  implements View.OnClickListener
{
  j(BookingConfirmation paramBookingConfirmation, Dialog paramDialog, RadioButton paramRadioButton1, RadioButton paramRadioButton2, RadioButton paramRadioButton3, RadioButton paramRadioButton4, String paramString, u paramu) {}
  
  public void onClick(View paramView)
  {
    this.a.dismiss();
    this.h.m = ProgressDialog.show(this.h, "", "  Cancelling Your Cab...");
    if (this.b.isChecked()) {
      BookingConfirmation.a(this.h, this.b.getTag().toString());
    }
    for (;;)
    {
      paramView = new n(this, 1, "https://devapi.olacabs.com/v1/bookings/cancel", new k(this), new m(this));
      this.g.a(paramView);
      return;
      if (this.c.isChecked()) {
        BookingConfirmation.a(this.h, this.c.getTag().toString());
      } else if (this.d.isChecked()) {
        BookingConfirmation.a(this.h, this.d.getTag().toString());
      } else if (this.e.isChecked()) {
        BookingConfirmation.a(this.h, this.e.getTag().toString());
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */