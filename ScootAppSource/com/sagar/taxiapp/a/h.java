package com.sagar.taxiapp.a;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

final class h
  implements View.OnClickListener
{
  h(g paramg, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if ((((Integer)g.a(this.b).get(this.a)).intValue() == 0) || (((Integer)g.a(this.b).get(this.a)).intValue() == 1))
    {
      if (((Integer)g.a(this.b).get(this.a)).intValue() == 1)
      {
        g.a(this.b).set(this.a, Integer.valueOf(0));
        g.b(this.b)[this.a] = 0;
        this.b.notifyDataSetChanged();
      }
    }
    else {
      return;
    }
    g.b(this.b)[this.a] = 1;
    g.a(this.b).set(this.a, Integer.valueOf(((Integer)g.a(this.b).get(this.a)).intValue() + 1));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */