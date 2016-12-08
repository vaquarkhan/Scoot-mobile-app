package com.sagar.taxiapp.parsesignup;

import android.widget.Toast;
import com.parse.ParseException;
import com.parse.RequestPasswordResetCallback;

final class f
  implements RequestPasswordResetCallback
{
  f(c paramc) {}
  
  public void done(ParseException paramParseException)
  {
    if (paramParseException == null) {
      Toast.makeText(c.a(this.a), "Check your mail to reset password", 1).show();
    }
    while (paramParseException.getCode() != 205) {
      return;
    }
    Toast.makeText(c.a(this.a), "Email id not found.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */