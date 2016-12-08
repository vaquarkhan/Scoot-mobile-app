package com.tushar.taxiapp.scootapp;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.ScrollView;

final class ac
  implements RatingBar.OnRatingBarChangeListener
{
  ac(RideCompletionActivity paramRideCompletionActivity) {}
  
  public void onRatingChanged(RatingBar paramRatingBar, float paramFloat, boolean paramBoolean)
  {
    if (paramFloat <= 2.0D)
    {
      RideCompletionActivity.a(this.a).setVisibility(8);
      RideCompletionActivity.b(this.a).setVisibility(0);
      RideCompletionActivity.c(this.a).setVisibility(8);
      this.a.m();
    }
    do
    {
      return;
      if (paramFloat == 3.0D)
      {
        RideCompletionActivity.a(this.a).setVisibility(8);
        RideCompletionActivity.b(this.a).setVisibility(8);
        this.a.l();
        return;
      }
    } while (paramFloat < 4.0D);
    RideCompletionActivity.a(this.a).setVisibility(0);
    RideCompletionActivity.c(this.a).setVisibility(0);
    RideCompletionActivity.b(this.a).setVisibility(8);
    this.a.l();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */