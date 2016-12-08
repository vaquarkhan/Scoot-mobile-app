package com.sagar.taxiapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.ce;
import android.support.v7.a.ah;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.en;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.parse.ParseCloud;
import com.sagar.taxiapp.a.i;
import com.sagar.taxiapp.a.k;
import com.sagar.taxiapp.a.o;
import com.scootapp.tv.d.n;
import java.util.ArrayList;
import java.util.HashMap;
import jp.wasabeef.recyclerview.a.b;

public class CarRentalCabsListingLocal
  extends ah
  implements ce
{
  private k A;
  private ArrayList<com.sagar.taxiapp.beans.c> B;
  private en C;
  private TextView D;
  private TextView E;
  private ImageView F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private TextView L;
  private LinearLayout M;
  private boolean N = false;
  private boolean O = false;
  private boolean P = false;
  private boolean Q = false;
  private boolean R = false;
  private ListView S;
  private o T;
  private i U;
  private FloatingActionButton V;
  private ArrayList<com.sagar.taxiapp.beans.c> W = new ArrayList();
  private boolean X = false;
  private boolean Y = false;
  private boolean Z = false;
  private Intent m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private String s;
  private String t;
  private String u;
  private String v;
  private SwipeRefreshLayout w;
  private TextView x;
  private ImageView y;
  private RecyclerView z;
  
  private void a(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return;
        if (paramString.equals("Time"))
        {
          i = 0;
          continue;
          if (paramString.equals("Price"))
          {
            i = 1;
            continue;
            if (paramString.equals("CabType"))
            {
              i = 2;
              continue;
              if (paramString.equals("CabCompany"))
              {
                i = 3;
                continue;
                if (paramString.equals("All")) {
                  i = 4;
                }
              }
            }
          }
        }
        break;
      }
    }
    this.G.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.H.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.P = false;
    return;
    this.D.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.E.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.O = false;
    this.Z = false;
    a("Price", "ASC");
    return;
    if (this.R) {
      this.R = false;
    }
    while (this.Y)
    {
      this.S.animate().translationY(this.S.getHeight() + this.M.getHeight());
      return;
      this.U.b();
      this.K.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.L.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.L.setPaintFlags(0);
    }
    if (this.Q) {
      this.Q = false;
    }
    while (this.X)
    {
      this.S.animate().translationY(this.S.getHeight() + this.M.getHeight());
      return;
      this.T.b();
      this.I.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.J.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.J.setPaintFlags(0);
    }
    this.G.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.H.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.P = false;
    this.D.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.E.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.O = false;
    this.Z = false;
    a("Price", "ASC");
    this.U.b();
    this.K.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.L.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.L.setPaintFlags(0);
    this.T.b();
    this.I.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.J.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.J.setPaintFlags(0);
    if (this.R) {
      this.R = false;
    }
    if (this.Y) {
      this.S.animate().translationY(this.S.getHeight() + this.M.getHeight());
    }
    if (this.Q) {
      this.Q = false;
    }
    if (this.X) {
      this.S.animate().translationY(this.S.getHeight() + this.M.getHeight());
    }
    this.V.b();
  }
  
  private void a(String paramString1, String paramString2)
  {
    int k = 2130837784;
    int i;
    int j;
    if (paramString1.equals("Price"))
    {
      if (!this.O) {
        break label91;
      }
      i = 2131689480;
      if (!paramString2.equals("ASC")) {
        break label97;
      }
      j = 2130837782;
    }
    for (;;)
    {
      this.F.setBackgroundResource(j);
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramString1 = android.support.v4.b.c.a(this, j);
        paramString1.mutate().setColorFilter(android.support.v4.b.c.c(this, i), PorterDuff.Mode.SRC_ATOP);
        this.F.setBackground(paramString1);
      }
      this.F.invalidate();
      return;
      label91:
      i = 2131689705;
      break;
      label97:
      j = k;
      if (paramString2.equals("DESC")) {
        j = k;
      }
    }
  }
  
  private void m()
  {
    if (this.B.isEmpty()) {
      Toast.makeText(this, "No cabs are available.", 1).show();
    }
  }
  
  private void n()
  {
    this.S.setVisibility(8);
    int i = ((RelativeLayout.LayoutParams)this.M.getLayoutParams()).bottomMargin;
    this.M.animate().translationY(i + this.M.getHeight()).setInterpolator(new AccelerateInterpolator(2.0F)).start();
  }
  
  private void o()
  {
    this.S.setVisibility(0);
    this.M.animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).start();
  }
  
  private void p()
  {
    this.S.animate().translationY(this.S.getHeight() + this.M.getHeight());
  }
  
  public void l()
  {
    com.scootapp.tv.d.a.a();
    n.a();
    this.B.clear();
    this.w.post(new ar(this));
    HashMap localHashMap = new HashMap();
    localHashMap.put("pickupCity", this.n);
    localHashMap.put("pickupDate", this.o);
    localHashMap.put("pickupTime", this.p);
    localHashMap.put("tripTypeOption", this.q);
    localHashMap.put("userIPAddress", this.r);
    localHashMap.put("travelTypeOption", this.s);
    localHashMap.put("days", this.t);
    localHashMap.put("lat", this.u);
    localHashMap.put("lng", this.v);
    localHashMap.put("droplat", this.u);
    localHashMap.put("droplng", this.v);
    localHashMap.put("androidUpdate", getString(2131296562));
    ParseCloud.callFunctionInBackground("CarRentalCabsListing", localHashMap, new as(this));
  }
  
  public void l_()
  {
    a("All");
    o();
    l();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968605);
    this.m = getIntent();
    this.n = this.m.getStringExtra("pickupCity");
    this.o = this.m.getStringExtra("pickupDate");
    this.p = this.m.getStringExtra("pickupTime");
    this.q = this.m.getStringExtra("tripTypeOption");
    this.r = this.m.getStringExtra("userIPAddress");
    this.s = this.m.getStringExtra("travelTypeOption");
    this.t = this.m.getStringExtra("days");
    this.u = this.m.getStringExtra("lat");
    this.v = this.m.getStringExtra("lng");
    this.B = new ArrayList();
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(android.support.v4.b.c.c(this, 2131689628));
    }
    paramBundle = (Toolbar)findViewById(2131755145);
    a(paramBundle);
    Object localObject = h();
    if (localObject != null)
    {
      ((android.support.v7.a.a)localObject).c(false);
      ((android.support.v7.a.a)localObject).b(true);
      ((android.support.v7.a.a)localObject).a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label839;
      }
      ((android.support.v7.a.a)localObject).a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      this.x = ((TextView)paramBundle.findViewById(2131755819));
      this.x.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      this.x.setText(this.n);
      this.x = ((TextView)paramBundle.findViewById(2131755821));
      this.x.setVisibility(4);
      this.y = ((ImageView)paramBundle.findViewById(2131755820));
      this.y.setVisibility(4);
      this.w = ((SwipeRefreshLayout)findViewById(2131755192));
      this.w.setColorSchemeResources(new int[] { 2131689696 });
      this.w.setOnRefreshListener(this);
      this.z = ((RecyclerView)findViewById(2131755194));
      this.C = new LinearLayoutManager(this);
      this.z.setLayoutManager(this.C);
      this.A = new k(this, this.B, "local");
      this.z.setAdapter(new b(this.A));
      this.y.setOnClickListener(new ak(this));
      this.z.a(new al(this));
      paramBundle = findViewById(2131755195);
      this.D = ((TextView)findViewById(2131755196));
      this.E = ((TextView)findViewById(2131755197));
      this.F = ((ImageView)findViewById(2131755198));
      localObject = findViewById(2131755199);
      this.G = ((TextView)findViewById(2131755200));
      this.H = ((TextView)findViewById(2131755201));
      View localView1 = findViewById(2131755205);
      this.I = ((TextView)findViewById(2131755206));
      this.J = ((TextView)findViewById(2131755207));
      View localView2 = findViewById(2131755202);
      this.K = ((TextView)findViewById(2131755203));
      this.L = ((TextView)findViewById(2131755204));
      this.M = ((LinearLayout)findViewById(2131755193));
      this.S = ((ListView)findViewById(2131755208));
      this.T = new o(this, n.b());
      this.U = new i(this, com.scootapp.tv.d.a.b());
      paramBundle.setOnClickListener(new am(this));
      ((View)localObject).setOnClickListener(new an(this));
      localView1.setOnClickListener(new ao(this));
      localView2.setOnClickListener(new ap(this));
      ((View)localObject).setVisibility(8);
      a("Price", "DESC");
      this.V = ((FloatingActionButton)findViewById(2131755209));
      this.V.setOnClickListener(new aq(this));
      this.S.animate().translationY(this.S.getHeight() + this.M.getHeight()).setStartDelay(0L);
      this.V.b();
      o();
      l();
      return;
      label839:
      ((android.support.v7.a.a)localObject).a(android.support.v4.b.c.a(this, 2130837795));
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    finish();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\CarRentalCabsListingLocal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */