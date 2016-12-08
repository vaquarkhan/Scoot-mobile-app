package com.sagar.taxiapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.b.c;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.a.ah;
import android.support.v7.a.f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.en;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.parse.ParseUser;
import com.sagar.taxiapp.a.an;
import com.sagar.taxiapp.b.av;
import com.sagar.taxiapp.b.v;
import com.scootapp.taxiapp.utils.SlidingTabLayout;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class ActivityMainNew
  extends ah
{
  public FloatingActionButton m;
  private String n = "";
  private String o = "2130837825";
  private final int p = 99;
  private DrawerLayout q;
  private RelativeLayout r;
  private an s;
  
  private void a(ViewPager paramViewPager)
  {
    m localm = new m(this, f());
    localm.a(new v(), "ON DEMAND");
    localm.a(new com.sagar.taxiapp.b.h(), "INTERCITY");
    localm.a(new av(), "RENTAL");
    paramViewPager.setAdapter(localm);
  }
  
  private void l()
  {
    View localView = getCurrentFocus();
    if (localView != null) {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
  }
  
  public void a(String paramString)
  {
    Picasso.with(this).load(paramString).into(new l(this));
  }
  
  public void finish()
  {
    super.finish();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str = "";
    if (paramInt1 == 5)
    {
      if (paramIntent != null)
      {
        this.n = paramIntent.getStringExtra("profileName");
        str = paramIntent.getStringExtra("profilePic");
      }
      this.s.a(this.n, str);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  @SuppressLint({"NewApi"})
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968613);
    paramBundle = ParseUser.getCurrentUser();
    Object localObject1;
    Object localObject2;
    if (paramBundle != null)
    {
      localObject1 = paramBundle.getString("firstName");
      localObject2 = paramBundle.getString("lastName");
      this.n = ((String)localObject1 + " " + (String)localObject2);
      paramBundle = paramBundle.getString("displayPictureUrl");
      this.o = paramBundle;
      if (c.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
        break label448;
      }
      android.support.v4.app.a.a(this, new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 99);
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.clearFlags(67108864);
        paramBundle.setStatusBarColor(c.c(this, 2131689628));
      }
      paramBundle = (Toolbar)findViewById(2131755145);
      a(paramBundle);
      localObject1 = h();
      if (localObject1 != null) {
        ((android.support.v7.a.a)localObject1).c(false);
      }
      localObject1 = (TextView)paramBundle.findViewById(2131755818);
      ((TextView)localObject1).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      ((TextView)localObject1).setText(getResources().getString(2131296457));
      this.r = ((RelativeLayout)findViewById(2131755181));
      localObject1 = (RecyclerView)findViewById(2131755182);
      ((RecyclerView)localObject1).setHasFixedSize(true);
      this.s = new an(this.n, this.o);
      ((RecyclerView)localObject1).setAdapter(this.s);
      this.s.c(0);
      localObject2 = new LinearLayoutManager(this);
      ((RecyclerView)localObject1).setHasFixedSize(true);
      ((RecyclerView)localObject1).setLayoutManager((en)localObject2);
      findViewById(2131755186).setOnClickListener(new g(this));
      findViewById(2131755187).setOnClickListener(new h(this));
      findViewById(2131755188).setOnClickListener(new i(this));
      this.q = ((DrawerLayout)findViewById(2131755178));
      paramBundle = new j(this, this, this.q, paramBundle, 2131296548, 2131296547);
      this.q.a(paramBundle);
      paramBundle.a();
      paramBundle = (ViewPager)findViewById(2131755180);
      a(paramBundle);
      paramBundle.setOffscreenPageLimit(2);
      localObject1 = (SlidingTabLayout)findViewById(2131755179);
      ((SlidingTabLayout)localObject1).setDistributeEvenly(true);
      ((SlidingTabLayout)localObject1).setCustomTabColorizer(new k(this));
      ((SlidingTabLayout)localObject1).setViewPager(paramBundle);
      this.m = ((FloatingActionButton)findViewById(2131755209));
      return;
      label448:
      if ((!paramBundle.equalsIgnoreCase("na")) && ("".equals(getSharedPreferences("shareddata", 0).getString("profile_uri", "")))) {
        a(paramBundle);
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while ((paramArrayOfInt.length <= 0) || (paramArrayOfInt[0] != 0));
    a(this.o);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.s.c(0);
    if (this.q.j(this.r)) {
      this.q.i(this.r);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ActivityMainNew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */