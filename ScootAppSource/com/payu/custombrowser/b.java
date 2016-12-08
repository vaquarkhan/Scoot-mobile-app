package com.payu.custombrowser;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class b
  implements View.OnKeyListener
{
  b(a parama) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 4))
    {
      if (this.a.j().getBoolean("backButton", true))
      {
        paramView = new AlertDialog.Builder(a.e(this.a));
        paramView.setCancelable(false);
        paramView.setMessage("Do you really want to cancel the transaction ?");
        paramView.setPositiveButton("Ok", new c(this));
        paramView.setNegativeButton("Cancel", new d(this));
        a.a(this.a, "user_input", "payu_back_button");
        this.a.a(paramView);
        paramView.show();
        return true;
      }
      a.a(this.a, "user_input", "m_back_button");
      a.e(this.a).onBackPressed();
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */