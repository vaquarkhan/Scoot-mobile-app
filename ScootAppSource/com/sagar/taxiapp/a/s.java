package com.sagar.taxiapp.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.support.v4.b.c;
import android.support.v7.widget.ed;
import android.support.v7.widget.fd;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.b.a.a.r;
import com.parse.ParseCloud;
import com.sagar.taxiapp.beans.b;
import com.sagar.taxiapp.dc;
import com.scootapp.tv.a.a;
import com.scootapp.tv.d.o;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.HashMap;
import java.util.List;

public final class s
  extends ed<fd>
{
  private List<ak> a;
  private Context b;
  
  public s(List<ak> paramList)
  {
    this.a = paramList;
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public int a(int paramInt)
  {
    return ((ak)this.a.get(paramInt)).a;
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
      return new am(this, localLayoutInflater.inflate(2130968691, paramViewGroup, false));
    }
    return new al(this, localLayoutInflater.inflate(2130968628, paramViewGroup, false));
  }
  
  public void a(fd paramfd, int paramInt)
  {
    Object localObject = (ak)this.a.get(paramInt);
    switch (((ak)localObject).a)
    {
    default: 
      return;
    case 0: 
      paramfd = (am)paramfd;
      paramfd.t = ((ak)localObject);
      if (paramInt == 0) {
        paramfd.s.setVisibility(8);
      }
      Picasso.with(this.b).load(a.a(((ak)localObject).b.m())).into(paramfd.m);
      paramfd.n.setText(((ak)localObject).b.a());
      paramfd.p.setText(((ak)localObject).b.b());
      paramfd.q.setVisibility(0);
      if (((ak)localObject).c == null)
      {
        paramfd.q.setImageResource(2130837784);
        label143:
        paramfd.q.setOnClickListener(new t(this, (ak)localObject, paramfd));
        paramfd.r.setOnClickListener(new u(this, (ak)localObject));
        switch (o.a(((ak)localObject).b.a()))
        {
        }
      }
      while (((ak)localObject).b.g() == 1)
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
    paramfd = (al)paramfd;
    localObject = ((ak)this.a.get(paramInt - 1)).b;
    if ((((b)localObject).m().equalsIgnoreCase("one way cabs")) && (((b)localObject).g() == 0)) {
      switch (o.a(((b)localObject).a()))
      {
      }
    }
    for (;;)
    {
      paramfd.l.setText(((b)localObject).c());
      paramfd.n.setText(String.valueOf(((b)localObject).f()));
      paramfd.m.setText(String.format("%s %s", new Object[] { "₹ ", ((b)localObject).e() }));
      if (!"".equals(((b)localObject).d())) {
        break;
      }
      paramfd.o.setText("N/A");
      return;
      paramfd.p.setText("Amount :");
      continue;
      paramfd.p.setText("Amount Due :");
      continue;
      paramfd.p.setText("Amount Due :");
      continue;
      paramfd.p.setText("Amount :");
    }
    paramfd.o.setText(String.format("%s Km", new Object[] { ((b)localObject).d() }));
  }
  
  public void a(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, ak paramak)
  {
    ParseCloud.callFunctionInBackground("OneWayCabsCancelBooking", paramHashMap, new x(this, paramProgressDialog, paramak));
  }
  
  public void a(List<ak> paramList)
  {
    this.a = paramList;
    c();
  }
  
  public void b(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, ak paramak)
  {
    ParseCloud.callFunctionInBackground("savaariCancelBooking", paramHashMap, new z(this, paramProgressDialog, paramak));
  }
  
  public void c(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, ak paramak)
  {
    String str2 = paramak.b.c();
    paramHashMap = paramak.b.a();
    int i = Integer.parseInt(paramak.b.e());
    float f = o.b(paramHashMap);
    if (f < 12.0F) {
      i = 0;
    }
    for (;;)
    {
      paramHashMap = "volley/0";
      try
      {
        String str1 = this.b.getPackageName();
        PackageInfo localPackageInfo = this.b.getPackageManager().getPackageInfo(str1, 0);
        str1 = str1 + "/" + localPackageInfo.versionCode;
        paramHashMap = str1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
      paramHashMap = new dc(AndroidHttpClient.newInstance(paramHashMap));
      r.a(this.b, paramHashMap).a(new af(this, 3, "https://api.roder.in/json/bookings/", new ab(this, paramak, i, str2, paramProgressDialog), new ae(this, paramProgressDialog), str2));
      return;
      if ((f > 12.0F) && (f < 24.0F)) {
        i /= 2;
      } else if (f <= 24.0F) {
        i = -1;
      }
    }
  }
  
  public void d(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, ak paramak)
  {
    ParseCloud.callFunctionInBackground("CCRBookingCancel", paramHashMap, new ag(this, paramProgressDialog, paramak));
  }
  
  public void e(HashMap<String, Object> paramHashMap, ProgressDialog paramProgressDialog, ak paramak)
  {
    ParseCloud.callFunctionInBackground("MaksonCancelBooking", paramHashMap, new ai(this, paramProgressDialog, paramak));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */