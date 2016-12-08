package com.sagar.taxiapp.parsesignup;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.sagar.taxiapp.ActivityMainNew;
import com.scootapp.tv.a.a;

final class e
  implements LogInCallback
{
  e(c paramc, ProgressDialog paramProgressDialog) {}
  
  public void done(ParseUser paramParseUser, ParseException paramParseException)
  {
    if (paramParseUser != null)
    {
      a.b(c.b(this.b));
      this.b.a = c.a(this.b).getSharedPreferences("shareddata", 0);
      this.b.b = c.a(this.b).getSharedPreferences("shareddata", 0).edit();
      paramParseException = paramParseUser.getString("workAddress");
      String str = paramParseUser.getString("homeAddress");
      if ((paramParseException != null) && (str != null))
      {
        if (!paramParseException.equalsIgnoreCase(""))
        {
          this.b.b.putString("workAddress", paramParseException).apply();
          this.b.b.putBoolean("workAdded", true).apply();
          this.b.b.putString("workPlaceId", paramParseUser.getString("workPlaceId")).apply();
        }
        if (!str.equalsIgnoreCase(""))
        {
          this.b.b.putString("homeAddress", str).apply();
          this.b.b.putBoolean("homeAdded", true).apply();
          this.b.b.putString("homePlaceId", paramParseUser.getString("homePlaceId")).apply();
        }
      }
      paramParseUser = new Intent(c.a(this.b), ActivityMainNew.class);
      c.a(this.b).startActivity(paramParseUser);
      this.a.dismiss();
      ((Activity)c.a(this.b)).finish();
    }
    do
    {
      return;
      this.a.dismiss();
    } while (paramParseException.getCode() != 101);
    Toast.makeText(c.a(this.b), "Incorrect Email Id or Password", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */