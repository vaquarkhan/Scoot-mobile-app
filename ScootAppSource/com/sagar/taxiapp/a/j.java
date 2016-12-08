package com.sagar.taxiapp.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import java.util.ArrayList;

final class j
  implements View.OnClickListener
{
  j(i parami, int paramInt, RadioButton paramRadioButton) {}
  
  public void onClick(View paramView)
  {
    if ((((Integer)i.a(this.c).get(this.a)).intValue() == 0) || (((Integer)i.a(this.c).get(this.a)).intValue() == 1))
    {
      if (((Integer)i.a(this.c).get(this.a)).intValue() == 1)
      {
        i.a(this.c).set(this.a, Integer.valueOf(0));
        i.b(this.c).remove(i.b(this.c).indexOf(Integer.valueOf(this.a)));
        this.b.setChecked(false);
        this.c.notifyDataSetChanged();
      }
    }
    else {
      return;
    }
    i.b(this.c).add(Integer.valueOf(this.a));
    i.a(this.c).set(this.a, Integer.valueOf(((Integer)i.a(this.c).get(this.a)).intValue() + 1));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */