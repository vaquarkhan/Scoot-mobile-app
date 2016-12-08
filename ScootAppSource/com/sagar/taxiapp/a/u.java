package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.support.v4.b.c;
import android.view.View;
import android.view.View.OnClickListener;
import com.scootapp.tv.d.g;

final class u
  implements View.OnClickListener
{
  u(s params, ak paramak) {}
  
  public void onClick(View paramView)
  {
    paramView = new g(s.b(this.b)).a("Are you sure you want to cancel?").c("Yes").d("No").c(c.c(s.b(this.b), 2131689705)).d(c.c(s.b(this.b), 2131689705));
    AlertDialog localAlertDialog = paramView.show();
    paramView.a(new v(this, localAlertDialog));
    paramView.b(new w(this, localAlertDialog));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */