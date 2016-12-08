package com.sagar.taxiapp.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v4.b.c;
import android.support.v7.widget.CardView;
import android.support.v7.widget.ed;
import android.support.v7.widget.fd;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sagar.taxiapp.b.v;
import com.sagar.taxiapp.beans.h;
import com.sagar.taxiapp.ds;
import com.scootapp.tv.a.a;
import com.scootapp.tv.d.d;
import com.scootapp.tv.d.e;
import java.util.ArrayList;

public final class q
  extends ed<fd>
{
  private ArrayList<h> a;
  private Context b;
  private Typeface c;
  private SharedPreferences d;
  
  public q(Context paramContext, ArrayList<h> paramArrayList)
  {
    this.d = paramContext.getSharedPreferences("shareddata", 0);
    this.b = paramContext;
    this.a = paramArrayList;
    this.c = ds.a(paramContext, "fonts/Roboto-Condensed.ttf");
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public fd a(ViewGroup paramViewGroup, int paramInt)
  {
    return new r(this, ((LayoutInflater)paramViewGroup.getContext().getSystemService("layout_inflater")).inflate(2130968696, paramViewGroup, false));
  }
  
  public void a(fd paramfd, int paramInt)
  {
    h localh = (h)this.a.get(paramInt);
    String str = d.a(localh.d);
    paramfd = (r)paramfd;
    paramfd.l.setText(str);
    r.a(paramfd).setCardBackgroundColor(a.a(this.b, str));
    paramfd.m.setText(e.a(localh.b));
    if ((localh.j == 1.0D) || (localh.j == 0.0D))
    {
      paramfd.o.setVisibility(4);
      if (!this.d.getBoolean("destEntered", false)) {
        break label297;
      }
      paramfd.p.setText("Estimate");
      paramfd.q.setText(localh.a);
      label126:
      if (("0".equals(localh.a)) || (localh.a == null) || (localh.a.isEmpty()) || (localh.a.equalsIgnoreCase("na")) || (localh.a.contains("undefined"))) {
        paramfd.q.setText("N/A");
      }
      paramfd.s.setText(localh.c);
      if (!v.ao) {
        break label408;
      }
      if (!v.aq) {
        break label353;
      }
      paramfd.r.setTextColor(c.c(this.b, 2131689696));
      paramfd.l.setTextColor(c.c(this.b, 2131689629));
      paramfd.p.setTextColor(c.c(this.b, 2131689629));
    }
    label297:
    label353:
    while (!v.ap)
    {
      return;
      paramfd.o.setVisibility(0);
      paramfd.n.setText(String.format("%s x", new Object[] { Double.valueOf(localh.j) }));
      break;
      paramfd.p.setText(String.format("Fare/%s", new Object[] { localh.h }));
      paramfd.q.setText(String.format("%s  %s", new Object[] { localh.g, localh.a }));
      break label126;
    }
    paramfd.r.setTextColor(c.c(this.b, 2131689629));
    paramfd.l.setTextColor(c.c(this.b, 2131689629));
    paramfd.p.setTextColor(c.c(this.b, 2131689696));
    return;
    label408:
    paramfd.r.setTextColor(c.c(this.b, 2131689696));
    paramfd.l.setTextColor(c.c(this.b, 2131689696));
    paramfd.p.setTextColor(c.c(this.b, 2131689696));
  }
  
  public void a(ArrayList<h> paramArrayList)
  {
    this.a = paramArrayList;
    c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */