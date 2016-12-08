package com.sagar.taxiapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.a.ah;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.parse.ParseUser;
import com.sagar.taxiapp.a.an;
import com.scootapp.taxiapp.utils.SlidingTabLayout;

@SuppressLint({"NewApi"})
public class ActivityBookingHistory
  extends ah
{
  int m;
  Intent n;
  private an o;
  private RelativeLayout p;
  private DrawerLayout q;
  
  private void a(ViewPager paramViewPager)
  {
    f localf = new f(f());
    localf.a("ON DEMAND");
    localf.a("INTERCITY");
    localf.a("RENTAL");
    paramViewPager.setAdapter(localf);
    paramViewPager.setCurrentItem(this.m);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    startActivity(new Intent(this, ActivityMainNew.class));
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968602);
    this.n = getIntent();
    this.m = this.n.getIntExtra("currentItem", 0);
    paramBundle = ParseUser.getCurrentUser();
    Object localObject1;
    Object localObject2;
    if (paramBundle != null)
    {
      localObject1 = paramBundle.getString("firstName");
      localObject2 = paramBundle.getString("lastName");
      localObject1 = (String)localObject1 + " " + (String)localObject2;
    }
    for (paramBundle = paramBundle.getString("displayPictureUrl");; paramBundle = "2130837825")
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject2 = getWindow();
        ((Window)localObject2).addFlags(Integer.MIN_VALUE);
        ((Window)localObject2).clearFlags(67108864);
        ((Window)localObject2).setStatusBarColor(android.support.v4.b.c.c(this, 2131689628));
      }
      localObject2 = (Toolbar)findViewById(2131755145);
      a((Toolbar)localObject2);
      Object localObject3 = h();
      if (localObject3 != null)
      {
        ((android.support.v7.a.a)localObject3).c(false);
        ((android.support.v7.a.a)localObject3).b(true);
        ((android.support.v7.a.a)localObject3).a(true);
        if (Build.VERSION.SDK_INT < 21) {
          break label455;
        }
        ((android.support.v7.a.a)localObject3).a(getResources().getDrawable(2130837795, null));
      }
      for (;;)
      {
        localObject3 = (TextView)((Toolbar)localObject2).findViewById(2131755818);
        ((TextView)localObject3).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
        ((TextView)localObject3).setText(getResources().getString(2131296459));
        this.p = ((RelativeLayout)findViewById(2131755181));
        localObject3 = (RecyclerView)findViewById(2131755182);
        ((RecyclerView)localObject3).setHasFixedSize(true);
        this.o = new an((String)localObject1, paramBundle);
        ((RecyclerView)localObject3).setAdapter(this.o);
        this.o.c(0);
        paramBundle = new LinearLayoutManager(this);
        ((RecyclerView)localObject3).setHasFixedSize(true);
        ((RecyclerView)localObject3).setLayoutManager(paramBundle);
        findViewById(2131755186).setOnClickListener(new a(this));
        findViewById(2131755187).setOnClickListener(new b(this));
        findViewById(2131755188).setOnClickListener(new c(this));
        this.q = ((DrawerLayout)findViewById(2131755178));
        paramBundle = new d(this, this, this.q, (Toolbar)localObject2, 2131296548, 2131296547);
        this.q.setDrawerListener(paramBundle);
        paramBundle.a();
        paramBundle = (ViewPager)findViewById(2131755180);
        a(paramBundle);
        localObject1 = (SlidingTabLayout)findViewById(2131755179);
        ((SlidingTabLayout)localObject1).setDistributeEvenly(true);
        ((SlidingTabLayout)localObject1).setCustomTabColorizer(new e(this));
        ((SlidingTabLayout)localObject1).setViewPager(paramBundle);
        return;
        label455:
        ((android.support.v7.a.a)localObject3).a(android.support.v4.b.c.a(this, 2130837795));
      }
      localObject1 = "";
    }
  }
  
  protected void onPause()
  {
    if (this.q.j(this.p)) {
      this.q.i(this.p);
    }
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.o.c(2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ActivityBookingHistory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */