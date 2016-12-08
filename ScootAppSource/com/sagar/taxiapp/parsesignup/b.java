package com.sagar.taxiapp.parsesignup;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.parse.ParseUser;

final class b
  implements View.OnClickListener
{
  b(ModifyUserDetails paramModifyUserDetails) {}
  
  public void onClick(View paramView)
  {
    paramView = ModifyUserDetails.a(this.a).getText().toString();
    String str = ModifyUserDetails.b(this.a).getText().toString();
    ModifyUserDetails.c(this.a).put("firstName", paramView);
    ModifyUserDetails.c(this.a).put("lastName", str);
    ModifyUserDetails.c(this.a).put("phone", ModifyUserDetails.d(this.a).getText().toString());
    ModifyUserDetails.c(this.a).saveInBackground();
    Toast.makeText(this.a, "We have saved the changes you made.", 1).show();
    this.a.a(paramView + " " + str);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */