package com.sagar.taxiapp.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import java.util.ArrayList;

final class p
  implements View.OnClickListener
{
  p(o paramo, int paramInt, RadioButton paramRadioButton) {}
  
  public void onClick(View paramView)
  {
    if ((((Integer)o.a(this.c).get(this.a)).intValue() == 0) || (((Integer)o.a(this.c).get(this.a)).intValue() == 1))
    {
      if (((Integer)o.a(this.c).get(this.a)).intValue() == 1)
      {
        o.a(this.c).set(this.a, Integer.valueOf(0));
        o.b(this.c).remove(o.b(this.c).indexOf(Integer.valueOf(this.a)));
        this.b.setChecked(false);
        this.c.notifyDataSetChanged();
      }
    }
    else {
      return;
    }
    o.b(this.c).add(Integer.valueOf(this.a));
    o.a(this.c).set(this.a, Integer.valueOf(((Integer)o.a(this.c).get(this.a)).intValue() + 1));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */