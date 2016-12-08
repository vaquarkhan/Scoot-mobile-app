package com.tushar.taxiapp.scootapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import com.parse.ParseQuery;

final class aj
  implements View.OnClickListener
{
  aj(RideCompletionActivity paramRideCompletionActivity) {}
  
  public void onClick(View paramView)
  {
    if (RideCompletionActivity.j(this.a).getRating() == 0.0D)
    {
      RideCompletionActivity.a(this.a, false);
      if (!RideCompletionActivity.k(this.a)) {
        break label173;
      }
      RideCompletionActivity.l(this.a).putBoolean("showFeedbackScreen", false).apply();
      if (RideCompletionActivity.i(this.a).getText().toString().equalsIgnoreCase("")) {
        break label149;
      }
      RideCompletionActivity.b(this.a, RideCompletionActivity.i(this.a).getText().toString());
    }
    for (;;)
    {
      ParseQuery.getQuery("OlaRideBookings").getInBackground(RideCompletionActivity.m(this.a).getString("objectId", ""), new ak(this));
      this.a.finish();
      return;
      RideCompletionActivity.a(this.a, true);
      break;
      label149:
      RideCompletionActivity.b(this.a, RideCompletionActivity.c(this.a).getText().toString());
    }
    label173:
    Toast.makeText(this.a, "Please rate the ride before submitting.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */