package com.sagar.taxiapp.a;

import android.content.Context;
import android.support.v7.widget.ed;
import android.support.v7.widget.fd;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sagar.taxiapp.beans.OlaBookingObject;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;

public final class a
  extends ed<fd>
{
  private List<d> a;
  private Context b;
  
  public a(List<d> paramList)
  {
    this.a = paramList;
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public int a(int paramInt)
  {
    return ((d)this.a.get(paramInt)).a;
  }
  
  public fd a(ViewGroup paramViewGroup, int paramInt)
  {
    this.b = paramViewGroup.getContext();
    LayoutInflater localLayoutInflater = (LayoutInflater)paramViewGroup.getContext().getSystemService("layout_inflater");
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new f(this, localLayoutInflater.inflate(2130968690, paramViewGroup, false));
    }
    return new e(this, localLayoutInflater.inflate(2130968627, paramViewGroup, false));
  }
  
  public void a(fd paramfd, int paramInt)
  {
    int i = 0;
    Object localObject = (d)this.a.get(paramInt);
    switch (((d)localObject).a)
    {
    default: 
      return;
    case 0: 
      paramfd = (f)paramfd;
      paramfd.t = ((d)localObject);
      if (paramInt == 0) {
        paramfd.s.setVisibility(8);
      }
      Picasso.with(this.b).load(com.scootapp.tv.a.a.a(((d)localObject).b.f())).into(paramfd.m);
      paramfd.n.setText(String.format("%s, %s", new Object[] { ((d)localObject).b.d(), ((d)localObject).b.e() }));
      paramfd.p.setText(((d)localObject).b.j());
      paramfd.q.setText(((d)localObject).b.b());
      paramfd.r.setVisibility(0);
      String str = ((d)localObject).b.h();
      switch (str.hashCode())
      {
      default: 
        paramInt = -1;
        switch (paramInt)
        {
        default: 
          label226:
          paramfd.o.setText("CANCELLED");
          paramfd.o.setTextColor(android.support.v4.b.c.c(this.b, 2131689687));
          label277:
          if (((d)localObject).c == null) {
            paramfd.r.setImageResource(2130837784);
          }
          break;
        }
        break;
      }
      for (;;)
      {
        paramfd.r.setOnClickListener(new c(this, (d)localObject, paramfd));
        return;
        if (!str.equals("IN_PROGRESS")) {
          break;
        }
        paramInt = i;
        break label226;
        if (!str.equals("cancelled")) {
          break;
        }
        paramInt = 1;
        break label226;
        if (!str.equals("COMPLETED")) {
          break;
        }
        paramInt = 2;
        break label226;
        paramfd.o.setText("ACTIVE");
        paramfd.o.setTextColor(android.support.v4.b.c.c(this.b, 2131689686));
        paramfd.l.setOnClickListener(new b(this));
        paramfd.r.setVisibility(4);
        break label277;
        paramfd.o.setText("CANCELLED");
        paramfd.o.setTextColor(android.support.v4.b.c.c(this.b, 2131689687));
        paramfd.l.setOnClickListener(null);
        break label277;
        paramfd.o.setText("COMPLETED");
        paramfd.o.setTextColor(android.support.v4.b.c.c(this.b, 2131689688));
        paramfd.l.setOnClickListener(null);
        break label277;
        paramfd.r.setImageResource(2130837782);
      }
    }
    paramfd = (e)paramfd;
    localObject = ((d)this.a.get(paramInt - 1)).b;
    paramfd.l.setText(((OlaBookingObject)localObject).a());
    if (((OlaBookingObject)localObject).i() == 1.0F) {
      paramfd.n.setText("N/A");
    }
    for (;;)
    {
      paramfd.m.setText(String.format("%s%s", new Object[] { "₹ ", String.valueOf(((OlaBookingObject)localObject).c()) }));
      paramfd.o.setText(((OlaBookingObject)localObject).g());
      return;
      paramfd.n.setText(String.valueOf(((OlaBookingObject)localObject).i()));
    }
  }
  
  public void a(List<d> paramList)
  {
    this.a = paramList;
    c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */