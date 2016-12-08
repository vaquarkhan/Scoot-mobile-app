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

public class CarRentalCabListings
  extends android.support.v7.a.ah
  implements ce
{
  private TextView A;
  private SwipeRefreshLayout B;
  private RecyclerView C;
  private k D;
  private ArrayList<com.sagar.taxiapp.beans.c> E;
  private en F;
  private TextView G;
  private TextView H;
  private ImageView I;
  private TextView J;
  private TextView K;
  private TextView L;
  private TextView M;
  private TextView N;
  private TextView O;
  private LinearLayout P;
  private boolean Q = false;
  private boolean R = false;
  private boolean S = false;
  private boolean T = false;
  private boolean U = false;
  private ListView V;
  private o W;
  private i X;
  private FloatingActionButton Y;
  private ArrayList<com.sagar.taxiapp.beans.c> Z = new ArrayList();
  private boolean aa = false;
  private boolean ab = false;
  private boolean ac = false;
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
  private String w;
  private String x;
  private String y;
  private TextView z;
  
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
    this.J.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.K.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.S = false;
    return;
    this.G.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.H.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.R = false;
    this.ac = false;
    a("Price", "ASC");
    return;
    if (this.U) {
      this.U = false;
    }
    while (this.ab)
    {
      this.V.animate().translationY(this.V.getHeight() + this.P.getHeight());
      return;
      this.X.b();
      this.N.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.O.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.O.setPaintFlags(0);
    }
    if (this.T) {
      this.T = false;
    }
    while (this.aa)
    {
      this.V.animate().translationY(this.V.getHeight() + this.P.getHeight());
      return;
      this.W.b();
      this.L.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.M.setTextColor(android.support.v4.b.c.c(this, 2131689705));
      this.M.setPaintFlags(0);
    }
    this.J.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.K.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.S = false;
    this.G.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.H.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.R = false;
    this.ac = false;
    a("Price", "ASC");
    this.X.b();
    this.N.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.O.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.O.setPaintFlags(0);
    this.W.b();
    this.L.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.M.setTextColor(android.support.v4.b.c.c(this, 2131689705));
    this.M.setPaintFlags(0);
    if (this.U) {
      this.U = false;
    }
    if (this.ab) {
      this.V.animate().translationY(this.V.getHeight() + this.P.getHeight());
    }
    if (this.T) {
      this.T = false;
    }
    if (this.aa) {
      this.V.animate().translationY(this.V.getHeight() + this.P.getHeight());
    }
    this.Y.b();
  }
  
  private void a(String paramString1, String paramString2)
  {
    int k = 2130837784;
    int i;
    int j;
    if (paramString1.equals("Price"))
    {
      if (!this.R) {
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
      this.I.setBackgroundResource(j);
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramString1 = android.support.v4.b.c.a(this, j);
        paramString1.mutate().setColorFilter(android.support.v4.b.c.c(this, i), PorterDuff.Mode.SRC_ATOP);
        this.I.setBackground(paramString1);
      }
      this.I.invalidate();
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
    if (this.E.isEmpty()) {
      Toast.makeText(this, "No cabs are available.", 1).show();
    }
  }
  
  private void n()
  {
    this.V.setVisibility(8);
    int i = ((RelativeLayout.LayoutParams)this.P.getLayoutParams()).bottomMargin;
    this.P.animate().translationY(i + this.P.getHeight()).setInterpolator(new AccelerateInterpolator(2.0F)).start();
  }
  
  private void o()
  {
    this.V.setVisibility(0);
    this.P.animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).start();
  }
  
  private void p()
  {
    this.V.animate().translationY(this.V.getHeight() + this.P.getHeight());
  }
  
  public void l()
  {
    com.scootapp.tv.d.a.a();
    n.a();
    this.E.clear();
    this.B.post(new ai(this));
    HashMap localHashMap = new HashMap();
    localHashMap.put("pickupCity", this.n);
    localHashMap.put("dropCity", this.o);
    localHashMap.put("pickupDate", this.p);
    localHashMap.put("pickupTime", this.q);
    localHashMap.put("tripTypeOption", this.r);
    localHashMap.put("userIPAddress", this.s);
    localHashMap.put("travelTypeOption", this.t);
    localHashMap.put("returnDate", this.u);
    localHashMap.put("lat", this.v);
    localHashMap.put("lng", this.w);
    localHashMap.put("droplat", this.x);
    localHashMap.put("droplng", this.y);
    localHashMap.put("androidUpdate", getString(2131296562));
    ParseCloud.callFunctionInBackground("CarRentalCabsListing", localHashMap, new aj(this));
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
    setContentView(2130968604);
    this.m = getIntent();
    this.n = this.m.getStringExtra("pickupCity");
    this.o = this.m.getStringExtra("dropCity");
    this.p = this.m.getStringExtra("pickupDate");
    this.q = this.m.getStringExtra("pickupTime");
    this.r = this.m.getStringExtra("tripTypeOption");
    this.s = this.m.getStringExtra("userIPAddress");
    this.t = this.m.getStringExtra("travelTypeOption");
    this.u = this.m.getStringExtra("returnDate");
    this.v = this.m.getStringExtra("lat");
    this.w = this.m.getStringExtra("lng");
    this.x = this.m.getStringExtra("droplat");
    this.y = this.m.getStringExtra("droplng");
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
        break label833;
      }
      ((android.support.v7.a.a)localObject).a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      this.E = new ArrayList();
      this.B = ((SwipeRefreshLayout)findViewById(2131755192));
      this.B.setColorSchemeResources(new int[] { 2131689696 });
      this.B.setOnRefreshListener(this);
      this.C = ((RecyclerView)findViewById(2131755194));
      this.z = ((TextView)paramBundle.findViewById(2131755819));
      this.A = ((TextView)paramBundle.findViewById(2131755821));
      this.z.setText(this.n);
      this.A.setText(this.o);
      this.F = new LinearLayoutManager(this);
      this.C.setLayoutManager(this.F);
      this.D = new k(this, this.E, "outstation");
      this.C.setAdapter(new b(this.D));
      this.C.a(new ac(this));
      paramBundle = findViewById(2131755195);
      this.G = ((TextView)findViewById(2131755196));
      this.H = ((TextView)findViewById(2131755197));
      this.I = ((ImageView)findViewById(2131755198));
      localObject = findViewById(2131755199);
      this.J = ((TextView)findViewById(2131755200));
      this.K = ((TextView)findViewById(2131755201));
      View localView1 = findViewById(2131755205);
      this.L = ((TextView)findViewById(2131755206));
      this.M = ((TextView)findViewById(2131755207));
      View localView2 = findViewById(2131755202);
      this.N = ((TextView)findViewById(2131755203));
      this.O = ((TextView)findViewById(2131755204));
      this.P = ((LinearLayout)findViewById(2131755193));
      this.V = ((ListView)findViewById(2131755208));
      this.W = new o(this, n.b());
      this.X = new i(this, com.scootapp.tv.d.a.b());
      paramBundle.setOnClickListener(new ad(this));
      ((View)localObject).setOnClickListener(new ae(this));
      localView1.setOnClickListener(new af(this));
      localView2.setOnClickListener(new ag(this));
      ((View)localObject).setVisibility(8);
      a("Price", "DESC");
      this.Y = ((FloatingActionButton)findViewById(2131755209));
      this.Y.setOnClickListener(new ah(this));
      this.V.animate().translationY(this.V.getHeight() + this.P.getHeight()).setStartDelay(0L);
      this.Y.b();
      o();
      l();
      return;
      label833:
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\CarRentalCabListings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */