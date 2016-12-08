package com.sagar.taxiapp;

import android.widget.Toast;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.sagar.taxiapp.parsesignup.c;
import java.util.List;

final class bz
  implements FindCallback<ParseUser>
{
  bz(LoginPage paramLoginPage, String paramString) {}
  
  public void done(List<ParseUser> paramList, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      if (paramList.size() > 0)
      {
        paramList = ((ParseUser)paramList.get(0)).getString("usertype");
        if (paramList.equalsIgnoreCase("facebook"))
        {
          Toast.makeText(this.b, "You signed up using Facebook the last time. Please use the same.", 1).show();
          return;
        }
        if (paramList.equalsIgnoreCase("googleplus"))
        {
          Toast.makeText(this.b, "You signed up using Google+ the last time. Please use the same.", 1).show();
          return;
        }
        new c(this.b).a(this.a);
        return;
      }
      new c(this.b).a(this.a);
      return;
    }
    paramParseException.getCode();
    Toast.makeText(this.b, "Something went wrong! Please try again.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */