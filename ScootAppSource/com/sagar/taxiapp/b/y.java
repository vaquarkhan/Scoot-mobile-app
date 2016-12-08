package com.sagar.taxiapp.b;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.b.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.g;
import com.sagar.taxiapp.a.o;
import com.sagar.taxiapp.a.q;
import com.sagar.taxiapp.beans.h;
import com.scootapp.tv.d.e;
import java.util.ArrayList;

final class y
  implements View.OnClickListener
{
  y(v paramv) {}
  
  public void onClick(View paramView)
  {
    v.f(this.a, true);
    v.a(this.a, "Price");
    v.a(this.a, "Time");
    int j = v.e(this.a).size();
    Object localObject;
    int i;
    h localh;
    if ((v.u(this.a)) && (v.n(this.a)))
    {
      v.c(this.a, false);
      v.d(this.a, false);
      paramView = v.r(this.a).a();
      if ((!v.v(this.a)) || (v.k(this.a).size() <= 0)) {
        break label489;
      }
      if (paramView.size() != 0)
      {
        j = v.k(this.a).size();
        localObject = new ArrayList();
        i = 0;
        while (i < j)
        {
          localh = (h)v.k(this.a).get(i);
          if (paramView.contains(Integer.valueOf(localh.d))) {
            ((ArrayList)localObject).add(localh);
          }
          i += 1;
        }
        v.a(this.a, (ArrayList)localObject);
      }
    }
    label489:
    label837:
    label1134:
    label1136:
    label1139:
    for (;;)
    {
      v.w(this.a).setTextColor(c.c(this.a.l(), 2131689696));
      v.x(this.a).setTextColor(c.c(this.a.l(), 2131689696));
      v.x(this.a).setPaintFlags(v.x(this.a).getPaintFlags() | 0x8);
      v.y(this.a);
      v.f(this.a).a(v.k(this.a));
      int n = v.e(this.a).size();
      int k;
      int i1;
      int m;
      if ((v.v(this.a)) && (v.s(this.a)))
      {
        v.b(this.a, false);
        v.e(this.a, false);
        paramView = v.t(this.a).b();
        if ((!v.u(this.a)) || (v.k(this.a).size() <= 0)) {
          break label837;
        }
        n = v.k(this.a).size();
        localObject = new ArrayList();
        k = 0;
        if (k < n)
        {
          localh = (h)v.k(this.a).get(k);
          if (paramView[0] == 1)
          {
            i1 = g.a.length;
            m = 0;
            j = 0;
            for (;;)
            {
              i = j;
              if (m >= i1) {
                break;
              }
              if (g.a[m].equalsIgnoreCase(e.a(localh.d)))
              {
                ((ArrayList)localObject).add(localh);
                j = 1;
              }
              m += 1;
            }
            v.k(this.a).clear();
            if (paramView.size() != 0) {
              break label1136;
            }
            v.a(this.a, (ArrayList)v.e(this.a).clone());
            continue;
          }
        }
      }
      for (;;)
      {
        if (i >= j) {
          break label1139;
        }
        localObject = (h)v.e(this.a).get(i);
        if (paramView.contains(Integer.valueOf(((h)localObject).d))) {
          v.k(this.a).add(localObject);
        }
        i += 1;
        continue;
        i = 0;
        m = i;
        if (paramView[1] == 1)
        {
          m = i;
          if (i == 0)
          {
            i1 = g.b.length;
            j = 0;
            for (;;)
            {
              m = i;
              if (j >= i1) {
                break;
              }
              if (g.b[j].equalsIgnoreCase(e.a(localh.d)))
              {
                ((ArrayList)localObject).add(localh);
                i = 1;
              }
              j += 1;
            }
          }
        }
        if ((paramView[2] == 1) && (m == 0))
        {
          j = g.c.length;
          i = 0;
          while (i < j)
          {
            if (g.c[i].equalsIgnoreCase(e.a(localh.d))) {
              ((ArrayList)localObject).add(localh);
            }
            i += 1;
          }
        }
        k += 1;
        break;
        v.a(this.a, (ArrayList)localObject);
        for (;;)
        {
          v.z(this.a).setTextColor(c.c(this.a.l(), 2131689696));
          v.A(this.a).setTextColor(c.c(this.a.l(), 2131689696));
          v.A(this.a).setPaintFlags(v.A(this.a).getPaintFlags() | 0x8);
          v.y(this.a);
          v.f(this.a).a(v.k(this.a));
          v.q(this.a).b();
          return;
          v.k(this.a).clear();
          if ((paramView[0] == 0) && (paramView[1] == 0) && (paramView[2] == 0))
          {
            v.a(this.a, (ArrayList)v.e(this.a).clone());
            continue;
            k += 1;
          }
          else
          {
            for (;;)
            {
              if (k >= n) {
                break label1134;
              }
              localObject = (h)v.k(this.a).get(k);
              if (paramView[0] == 1)
              {
                i1 = g.a.length;
                m = 0;
                j = 0;
                for (;;)
                {
                  i = j;
                  if (m >= i1) {
                    break;
                  }
                  if (g.a[m].equalsIgnoreCase(e.a(((h)localObject).d)))
                  {
                    v.k(this.a).add(localObject);
                    j = 1;
                  }
                  m += 1;
                }
              }
              i = 0;
              m = i;
              if (paramView[1] == 1)
              {
                m = i;
                if (i == 0)
                {
                  i1 = g.b.length;
                  j = 0;
                  for (;;)
                  {
                    m = i;
                    if (j >= i1) {
                      break;
                    }
                    if (g.b[j].equalsIgnoreCase(e.a(((h)localObject).d)))
                    {
                      v.k(this.a).add(localObject);
                      i = 1;
                    }
                    j += 1;
                  }
                }
              }
              if ((paramView[2] != 1) || (m != 0)) {
                break;
              }
              j = g.c.length;
              i = 0;
              while (i < j)
              {
                if (g.c[i].equalsIgnoreCase(e.a(((h)localObject).d))) {
                  v.k(this.a).add(localObject);
                }
                i += 1;
              }
              break;
              k = 0;
            }
          }
        }
        i = 0;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */