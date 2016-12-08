package com.sagar.taxiapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.a.f;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ed;
import android.support.v7.widget.en;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.parse.ParseCloud;
import com.parse.ParseUser;
import com.sagar.taxiapp.a.an;
import com.sagar.taxiapp.a.ar;
import com.sagar.taxiapp.beans.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActivityOffers
  extends ah
{
  private RelativeLayout m;
  private DrawerLayout n;
  private ed o;
  private ArrayList<m> p;
  private RelativeLayout q;
  private View r;
  private an s;
  
  private void l()
  {
    if (this.p.size() == 0)
    {
      this.q.setVisibility(0);
      return;
    }
    this.q.setVisibility(8);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    startActivity(new Intent(this, ActivityMainNew.class));
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968617);
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
        ((Window)localObject2).setStatusBarColor(c.c(this, 2131689628));
      }
      localObject2 = (Toolbar)findViewById(2131755145);
      a((Toolbar)localObject2);
      Object localObject3 = h();
      if (localObject3 != null)
      {
        ((a)localObject3).c(false);
        ((a)localObject3).b(true);
        ((a)localObject3).a(true);
      }
      localObject3 = (TextView)((Toolbar)localObject2).findViewById(2131755818);
      ((TextView)localObject3).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      ((TextView)localObject3).setText(getResources().getString(2131296463));
      this.m = ((RelativeLayout)findViewById(2131755181));
      localObject3 = (RecyclerView)findViewById(2131755182);
      ((RecyclerView)localObject3).setHasFixedSize(true);
      this.s = new an((String)localObject1, paramBundle);
      ((RecyclerView)localObject3).setAdapter(this.s);
      this.s.c(0);
      ((RecyclerView)localObject3).setHasFixedSize(true);
      ((RecyclerView)localObject3).setLayoutManager(new LinearLayoutManager(this));
      findViewById(2131755186).setOnClickListener(new n(this));
      findViewById(2131755187).setOnClickListener(new o(this));
      findViewById(2131755188).setOnClickListener(new p(this));
      this.n = ((DrawerLayout)findViewById(2131755178));
      paramBundle = new q(this, this, this.n, (Toolbar)localObject2, 2131296548, 2131296547);
      this.n.setDrawerListener(paramBundle);
      paramBundle.a();
      paramBundle = getSharedPreferences("shareddata", 0);
      this.p = new ArrayList();
      this.q = ((RelativeLayout)findViewById(2131755323));
      this.r = findViewById(2131755325);
      localObject1 = (RecyclerView)findViewById(2131755324);
      ((RecyclerView)localObject1).setHasFixedSize(true);
      localObject2 = new GridLayoutManager(this, 2);
      ((RecyclerView)localObject1).setLayoutManager((en)localObject2);
      ((GridLayoutManager)localObject2).a(new r(this));
      this.o = new ar(this, this.p);
      ((RecyclerView)localObject1).setAdapter(this.o);
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("city", paramBundle.getString("currentCity", "null"));
      ((HashMap)localObject1).put("lat", paramBundle.getString("enteredLat", "null"));
      ((HashMap)localObject1).put("lng", paramBundle.getString("enteredLng", "null"));
      Log.v("Scoot", "Request " + ((HashMap)localObject1).toString());
      ParseCloud.callFunctionInBackground("coupondunia", (Map)localObject1, new s(this));
      return;
      localObject1 = "";
    }
  }
  
  protected void onPause()
  {
    if (this.n.j(this.m)) {
      this.n.i(this.m);
    }
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.s.c(1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ActivityOffers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */