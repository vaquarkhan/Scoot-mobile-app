package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.parse.ParseCloud;
import com.parse.ParseUser;
import com.sagar.taxiapp.NewUserScreen;
import com.sagar.taxiapp.beans.m;
import com.scootapp.tv.a.a;
import java.util.HashMap;

final class aw
  implements View.OnClickListener
{
  aw(ar paramar, AlertDialog paramAlertDialog, m paramm) {}
  
  public void onClick(View paramView)
  {
    this.a.dismiss();
    paramView = ProgressDialog.show(ar.a(this.c), "Please wait . . . ", "Fetching Offer Status . . .", false);
    paramView.setCancelable(false);
    ParseUser localParseUser = ParseUser.getCurrentUser();
    if (localParseUser != null)
    {
      HashMap localHashMap = new HashMap();
      if ((Build.VERSION.SDK_INT >= 23) && (c.a(ar.a(this.c), "android.permission.READ_PHONE_STATE") != 0)) {
        localHashMap.put("uniqueId", localParseUser.getString("phone"));
      }
      for (;;)
      {
        localHashMap.put("provName", this.b.f);
        localHashMap.put("email", localParseUser.getString("username"));
        localHashMap.put("mobileNum", localParseUser.getString("phone"));
        Log.v("Scoot", "Get Coupon Request " + localHashMap.toString());
        ParseCloud.callFunctionInBackground("getOffer", localHashMap, new ax(this, paramView));
        return;
        localHashMap.put("uniqueId", a.a(ar.a(this.c)));
      }
    }
    ar.a(this.c).startActivityForResult(new Intent(ar.a(this.c), NewUserScreen.class), 103);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */