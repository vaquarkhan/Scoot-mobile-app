package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.support.v4.b.c;
import android.view.View;
import android.view.View.OnClickListener;
import com.scootapp.tv.d.g;

final class be
  implements View.OnClickListener
{
  be(bc parambc, bn parambn) {}
  
  public void onClick(View paramView)
  {
    paramView = new g(bc.b(this.b)).a("Are you sure you want to cancel?").c("Yes").d("No").c(c.c(bc.b(this.b), 2131689705)).d(c.c(bc.b(this.b), 2131689705));
    AlertDialog localAlertDialog = paramView.show();
    paramView.a(new bf(this, localAlertDialog));
    paramView.b(new bg(this, localAlertDialog));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */