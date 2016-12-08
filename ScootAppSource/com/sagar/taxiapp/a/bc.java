package com.sagar.taxiapp.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v4.b.c;
import android.support.v7.widget.ed;
import android.support.v7.widget.fd;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.parse.ParseCloud;
import com.sagar.taxiapp.beans.b;
import com.scootapp.tv.a.a;
import com.scootapp.tv.d.o;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.HashMap;
import java.util.List;

public final class bc
  extends ed<fd>
{
  private List<bn> a;
  private Context b;
  
  public bc(List<bn> paramList)
  {
    this.a = paramList;
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public int a(int paramInt)
  {
    return ((bn)this.a.get(paramInt)).a;
  }
  
  public fd a(ViewGroup paramViewGroup, int paramInt)
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)paramViewGroup.getContext().getSystemService("layout_inflater");
    this.b = paramViewGroup.getContext();
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new bp(this, localLayoutInflater.inflate(2130968691, paramViewGroup, false));
    }
    return new bo(this, localLayoutInflater.inflate(2130968628, paramViewGroup, false));
  }
  
  public void a(fd paramfd, int paramInt)
  {
    Object localObject = (bn)this.a.get(paramInt);
    switch (((bn)localObject).a)
    {
    default: 
      return;
    case 0: 
      paramfd = (bp)paramfd;
      paramfd.t = ((bn)localObject);
      if (paramInt == 0) {
        paramfd.s.setVisibility(8);
      }
      Picasso.with(this.b).load(a.a(((bn)localObject).b.m())).into(paramfd.m);
      paramfd.n.setText(((bn)localObject).b.a());
      paramfd.p.setText(((bn)localObject).b.b());
      paramfd.q.setVisibility(0);
      if (((bn)localObject).c == null)
      {
        paramfd.q.setImageResource(2130837784);
        label143:
        paramfd.q.setOnClickListener(new bd(this, (bn)localObject, paramfd));
        paramfd.r.setOnClickListener(new be(this, (bn)localObject));
        switch (o.a(((bn)localObject).b.a()))
        {
        }
      }
      while (((bn)localObject).b.g() == 1)
      {
        paramfd.o.setText("CANCELLED");
        paramfd.o.setTextColor(c.c(this.b, 2131689687));
        paramfd.r.setVisibility(8);
        return;
        paramfd.q.setImageResource(2130837782);
        break label143;
        paramfd.o.setText("COMPLETED");
        paramfd.o.setTextColor(c.c(this.b, 2131689688));
        paramfd.r.setVisibility(8);
        continue;
        paramfd.o.setText("ACTIVE");
        paramfd.o.setTextColor(c.c(this.b, 2131689686));
        paramfd.r.setVisibility(0);
        paramfd.r.setPaintFlags(paramfd.r.getPaintFlags() | 0x8);
        continue;
        paramfd.o.setText("UPCOMING");
        paramfd.o.setTextColor(c.c(this.b, 2131689689));
        paramfd.r.setVisibility(0);
        paramfd.r.setPaintFlags(paramfd.r.getPaintFlags() | 0x8);
      }
    }
    paramfd = (bo)paramfd;
    localObject = ((bn)this.a.get(paramInt - 1)).b;
    paramfd.p.setText("Package :");
    paramfd.l.setText(((b)localObject).c());
    paramfd.n.setText(String.valueOf(((b)localObject).f()));
    paramfd.m.setText(String.format("%s %s", new Object[] { "₹ ", ((b)localObject).e() }));
    if ("".equals(((b)localObject).d()))
    {
      paramfd.o.setText("N/A");
      return;
    }
    paramfd.o.setText(((b)localObject).d());
  }
  
  public void a(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, bn parambn)
  {
    ParseCloud.callFunctionInBackground("CCRBookingCancel", paramHashMap, new bh(this, paramProgressDialog, parambn));
  }
  
  public void a(List<bn> paramList)
  {
    this.a = paramList;
    c();
  }
  
  public void b(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, bn parambn)
  {
    ParseCloud.callFunctionInBackground("savaariCancelBooking", paramHashMap, new bj(this, paramProgressDialog, parambn));
  }
  
  public void c(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, bn parambn)
  {
    ParseCloud.callFunctionInBackground("MaksonCancelBooking", paramHashMap, new bl(this, paramProgressDialog, parambn));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */