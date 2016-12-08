package com.sagar.taxiapp.parsesignup;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.parse.ParseException;
import com.parse.SignUpCallback;
import com.sagar.taxiapp.ActivityMainNew;
import com.sagar.taxiapp.LoginPage;

final class d
  implements SignUpCallback
{
  d(c paramc, ProgressDialog paramProgressDialog, Activity paramActivity) {}
  
  public void done(ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      this.a.dismiss();
      paramParseException = new Intent(c.a(this.c), ActivityMainNew.class);
      paramParseException.addFlags(536903680);
      c.a(this.c).startActivity(paramParseException);
      this.b.finish();
      return;
    }
    if (paramParseException.getCode() == 202)
    {
      Toast.makeText(c.a(this.c), "Email Id already exists. Please login to continue.", 1).show();
      paramParseException = new Intent(c.a(this.c), LoginPage.class);
      c.a(this.c).startActivity(paramParseException);
    }
    this.a.dismiss();
    this.b.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */