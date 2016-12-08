package com.sagar.taxiapp.parsesignup;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.parse.ParseUser;

final class a
  implements View.OnClickListener
{
  a(ModifyUserDetails paramModifyUserDetails) {}
  
  public void onClick(View paramView)
  {
    ParseUser.logOut();
    this.a.getSharedPreferences("shareddata", 0).edit().putString("profile_uri", "").apply();
    Toast.makeText(this.a, "You have successfully logged out.", 1).show();
    this.a.a("");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */