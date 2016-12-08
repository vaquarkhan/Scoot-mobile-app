package com.sagar.taxiapp.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bd
  implements View.OnClickListener
{
  bd(bc parambc, bn parambn, bp parambp) {}
  
  public void onClick(View paramView)
  {
    if (this.a.c == null)
    {
      this.a.c = new ArrayList();
      j = bc.a(this.c).indexOf(this.b.t);
      i = 0;
      while ((bc.a(this.c).size() > j + 1) && (((bn)bc.a(this.c).get(j + 1)).a == 1))
      {
        this.a.c.add(bc.a(this.c).remove(j + 1));
        i += 1;
      }
      this.c.b(j + 1, i);
      this.b.q.setImageResource(2130837782);
      return;
    }
    int j = bc.a(this.c).indexOf(this.b.t);
    paramView = this.a.c.iterator();
    int i = j + 1;
    while (paramView.hasNext())
    {
      bn localbn = (bn)paramView.next();
      bc.a(this.c).add(i, localbn);
      i += 1;
    }
    this.c.a(j + 1, i - j - 1);
    this.b.q.setImageResource(2130837784);
    this.a.c = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */