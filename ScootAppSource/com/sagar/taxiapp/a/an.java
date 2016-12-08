package com.sagar.taxiapp.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.c;
import android.support.v7.widget.ed;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.io.File;

public final class an
  extends ed<aq>
{
  private static final String[] a = { "Book A Cab", "Offers", "My Rides", "My Accounts", "Terms and Conditions" };
  private static final int[] b = { 2130837772, 2130837799, 2130837791, 2130837794, 2130837818 };
  private static int[] c = { 0, 0, 0, 0, 0 };
  private String d;
  private String e;
  private Context f;
  
  public an(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }
  
  private void d()
  {
    int i = 0;
    while (i < 5)
    {
      c[i] = 0;
      i += 1;
    }
  }
  
  private boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private boolean e(int paramInt)
  {
    return c[paramInt] == 1;
  }
  
  public int a()
  {
    return a.length + 1;
  }
  
  public int a(int paramInt)
  {
    if (d(paramInt)) {
      return 0;
    }
    return 1;
  }
  
  public void a(aq paramaq, int paramInt)
  {
    Object localObject;
    try
    {
      if (paramaq.l == 1)
      {
        if (paramInt - 1 == 1)
        {
          if (!this.f.getSharedPreferences("apprater", 0).getBoolean("special_offer", false)) {
            break label197;
          }
          paramaq.r.setVisibility(8);
        }
        for (;;)
        {
          paramaq.m.setText(a[(paramInt - 1)]);
          paramaq.m.setTextColor(c.c(this.f, 2131689654));
          paramaq.n.setBackgroundResource(b[(paramInt - 1)]);
          if (c[(paramInt - 1)] == 1)
          {
            paramaq.m.setTextColor(c.c(this.f, 2131689480));
            paramaq.n.setBackgroundResource(b[(paramInt - 1)]);
            if (Build.VERSION.SDK_INT >= 16)
            {
              localObject = c.a(this.f, b[(paramInt - 1)]);
              ((Drawable)localObject).mutate().setColorFilter(c.c(this.f, 2131689480), PorterDuff.Mode.SRC_ATOP);
              paramaq.n.setBackground((Drawable)localObject);
            }
          }
          paramaq.q.setOnClickListener(new ao(this, paramInt));
          return;
          label197:
          paramaq.r.setVisibility(0);
        }
      }
      localObject = this.f.getSharedPreferences("shareddata", 0).getString("profile_uri", "");
    }
    catch (Exception paramaq)
    {
      paramaq.printStackTrace();
      return;
    }
    Log.v("Scoot", "Profile Path " + (String)localObject);
    if ("".equals(localObject)) {
      if (!this.e.equalsIgnoreCase("")) {
        Picasso.with(this.f).load(this.e).placeholder(2130837825).error(2130837825).into(paramaq.o);
      }
    }
    for (;;)
    {
      paramaq.p.setText(this.d);
      paramaq.o.setOnClickListener(new ap(this));
      return;
      Picasso.with(this.f).load(2130837825).into(paramaq.o);
      continue;
      Picasso.with(this.f).load(new File((String)localObject)).placeholder(2130837825).error(2130837825).into(paramaq.o);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
    c();
  }
  
  public aq c(ViewGroup paramViewGroup, int paramInt)
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)paramViewGroup.getContext().getSystemService("layout_inflater");
    this.f = paramViewGroup.getContext();
    if (paramInt == 1) {
      return new aq(localLayoutInflater.inflate(2130968679, paramViewGroup, false), paramInt);
    }
    if (paramInt == 0) {
      return new aq(localLayoutInflater.inflate(2130968692, paramViewGroup, false), paramInt);
    }
    return null;
  }
  
  public void c(int paramInt)
  {
    d();
    if (paramInt != -1) {
      c[paramInt] = 1;
    }
    c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */