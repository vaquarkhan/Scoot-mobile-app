package com.sagar.taxiapp.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class c
  implements View.OnClickListener
{
  c(a parama, d paramd, f paramf) {}
  
  public void onClick(View paramView)
  {
    if (this.a.c == null)
    {
      this.a.c = new ArrayList();
      j = a.b(this.c).indexOf(this.b.t);
      i = 0;
      while ((a.b(this.c).size() > j + 1) && (((d)a.b(this.c).get(j + 1)).a == 1))
      {
        this.a.c.add(a.b(this.c).remove(j + 1));
        i += 1;
      }
      this.c.b(j + 1, i);
      this.b.r.setImageResource(2130837782);
      return;
    }
    int j = a.b(this.c).indexOf(this.b.t);
    paramView = this.a.c.iterator();
    int i = j + 1;
    while (paramView.hasNext())
    {
      d locald = (d)paramView.next();
      a.b(this.c).add(i, locald);
      i += 1;
    }
    this.c.a(j + 1, i - j - 1);
    this.b.r.setImageResource(2130837784);
    this.a.c = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */