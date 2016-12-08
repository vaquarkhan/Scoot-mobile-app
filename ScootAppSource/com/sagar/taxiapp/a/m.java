package com.sagar.taxiapp.a;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.sagar.taxiapp.beans.c;

final class m
  implements View.OnClickListener
{
  m(k paramk, EditText paramEditText, c paramc, Dialog paramDialog) {}
  
  public void onClick(View paramView)
  {
    paramView = this.a.getText().toString();
    if ((!paramView.equalsIgnoreCase("0")) || (paramView.length() == 0))
    {
      this.b.z = paramView;
      if (k.c(this.d).equalsIgnoreCase("outstation")) {
        this.d.f(this.b);
      }
    }
    for (;;)
    {
      this.c.dismiss();
      return;
      this.d.g(this.b);
      continue;
      Toast.makeText(k.b(this.d), "Number of cars should be at least 1", 1).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */