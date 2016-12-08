package com.sagar.taxiapp;

import android.widget.Toast;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.sagar.taxiapp.parsesignup.c;
import java.util.List;

final class by
  implements FindCallback<ParseUser>
{
  by(LoginPage paramLoginPage, String paramString1, String paramString2) {}
  
  public void done(List<ParseUser> paramList, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      if (paramList.size() > 0)
      {
        paramList = ((ParseUser)paramList.get(0)).getString("usertype");
        if ((paramList.equalsIgnoreCase("facebook")) && (this.a.equalsIgnoreCase("facebook")))
        {
          new c(this.b, this.a, this.c).a();
          return;
        }
        if ((paramList.equalsIgnoreCase("facebook")) && (!this.a.equalsIgnoreCase("facebook")))
        {
          Toast.makeText(this.c, "You signed up using Facebook the last time. Please use the same.", 1).show();
          return;
        }
        if ((paramList.equalsIgnoreCase("googleplus")) && (this.a.equalsIgnoreCase("googleplus")))
        {
          new c(this.b, this.a, this.c).a();
          return;
        }
        if ((paramList.equalsIgnoreCase("googleplus")) && (!this.a.equalsIgnoreCase("googleplus")))
        {
          Toast.makeText(this.c, "You signed up using Google+ the last time. Please use the same.", 1).show();
          return;
        }
        new c(this.b, this.a, this.c).a();
        return;
      }
      Toast.makeText(this.c, "You need to signup to login.", 1).show();
      return;
    }
    Toast.makeText(this.c, "Something went wrong! Please try again.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */