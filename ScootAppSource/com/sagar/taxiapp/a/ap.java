package com.sagar.taxiapp.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.parse.ParseUser;
import com.sagar.taxiapp.NewUserScreen;
import com.sagar.taxiapp.parsesignup.ModifyUserDetails;

final class ap
  implements View.OnClickListener
{
  ap(an paraman) {}
  
  public void onClick(View paramView)
  {
    if (ParseUser.getCurrentUser() != null)
    {
      paramView = new Intent(an.a(this.a), ModifyUserDetails.class);
      ((Activity)an.a(this.a)).startActivityForResult(paramView, 5);
      return;
    }
    paramView = new Intent(an.a(this.a), NewUserScreen.class);
    an.a(this.a).startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */