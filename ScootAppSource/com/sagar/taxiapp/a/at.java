package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import com.sagar.taxiapp.beans.m;
import com.scootapp.tv.d.j;

final class at
  implements View.OnClickListener
{
  at(ar paramar, m paramm) {}
  
  public void onClick(View paramView)
  {
    if ("Scoot".equalsIgnoreCase(this.a.g))
    {
      ar.a(this.b, this.a);
      return;
    }
    paramView = new j(ar.a(this.b)).a(this.a.d).b(this.a.c).b(2130837723).d(this.a.f.toUpperCase()).c("GET CODE");
    if ((this.a.b == null) || (this.a.b.isEmpty()) || ("".equals(this.a.b)) || ("null".equals(this.a.b))) {
      paramView.c("No Code");
    }
    AlertDialog localAlertDialog = paramView.show();
    localAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
    paramView.b(new au(this, localAlertDialog));
    paramView.a(new av(this));
    paramView.a(this.a.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */