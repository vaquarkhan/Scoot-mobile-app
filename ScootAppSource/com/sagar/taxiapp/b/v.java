package com.sagar.taxiapp.b;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.en;
import android.support.v7.widget.er;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.b.a.a.n;
import com.google.android.gms.analytics.l;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.i;
import com.parse.ParseCloud;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.sagar.taxiapp.ActivityMainNew;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.OnDemandSearchAddress;
import com.sagar.taxiapp.beans.h;
import com.sagar.taxiapp.ds;
import com.scootapp.tv.d.e;
import com.tushar.taxiapp.scootapp.OlaBooking;
import com.tushar.taxiapp.scootapp.RideCompletionActivity;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class v
  extends Fragment
  implements er, View.OnClickListener, s, t, com.google.android.gms.location.g
{
  public static boolean ao;
  public static boolean ap;
  public static boolean aq;
  protected com.google.android.gms.common.api.q a;
  private boolean aA;
  private String aB;
  private RecyclerView aC;
  private ArrayList<h> aD;
  private RelativeLayout aE;
  private SharedPreferences.Editor aF;
  private AppCompatAutoCompleteTextView aG;
  private AppCompatAutoCompleteTextView aH;
  private at aI;
  private aq aJ;
  private boolean aK = false;
  private String aL;
  private Location aM;
  private com.sagar.taxiapp.a.q aN;
  private android.support.v4.view.q aO;
  private TextView aP;
  private TextView aQ;
  private TextView aR;
  private TextView aS;
  private TextView aT;
  private TextView aU;
  private TextView aV;
  private TextView aW;
  private LinearLayout aX;
  private boolean aY = false;
  private boolean aZ = false;
  String ai = "";
  LocationManager aj;
  SharedPreferences ak;
  SharedPreferences al;
  SharedPreferences.Editor am;
  SharedPreferences an;
  protected LocationRequest ar;
  ParseObject as = null;
  long at = 0L;
  int au = 0;
  private final int aw = 201;
  private final int ax = 202;
  private ArrayList<Integer> ay = new ArrayList();
  private int az = 0;
  Geocoder b;
  private ListView ba;
  private com.sagar.taxiapp.a.o bb;
  private com.sagar.taxiapp.a.g bc;
  private FloatingActionButton bd;
  private ArrayList<h> be;
  private boolean bf = false;
  private boolean bg = false;
  private boolean bh = false;
  private View bi;
  private Context bj;
  private boolean bk;
  String c = "";
  int d = 0;
  SwipeRefreshLayout e;
  public Location f;
  List<Address> g;
  String h;
  String i;
  
  static
  {
    if (!v.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      av = bool;
      ao = false;
      ap = false;
      aq = false;
      return;
    }
  }
  
  private void S()
  {
    long l = new Date().getTime();
    if ((this.as != null) && ((this.at == 0L) || (l > this.at + 5000L)))
    {
      this.as.saveInBackground();
      this.at = new Date().getTime();
    }
  }
  
  private void T()
  {
    if (this.aD.size() == 0)
    {
      this.aE.setVisibility(0);
      return;
    }
    this.aE.setVisibility(8);
  }
  
  private void U()
  {
    View localView = l().getCurrentFocus();
    if (localView != null) {
      ((InputMethodManager)l().getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
  }
  
  private void V()
  {
    Typeface localTypeface = ds.a(l(), "fonts/OpenSans-Regular.ttf");
    this.aH.setTypeface(localTypeface);
    this.aG.setTypeface(localTypeface);
    this.aG.setText(this.c);
  }
  
  private void W()
  {
    this.ba.setVisibility(8);
    int j = ((RelativeLayout.LayoutParams)this.aX.getLayoutParams()).bottomMargin;
    this.aX.animate().translationY(j + this.aX.getHeight()).setInterpolator(new AccelerateInterpolator(2.0F)).start();
  }
  
  private void X()
  {
    this.ba.setVisibility(0);
    this.aX.animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).start();
  }
  
  private void Y()
  {
    this.ba.animate().translationY(this.ba.getHeight() + this.aX.getHeight());
  }
  
  private void Z()
  {
    if ((android.support.v4.app.a.a(l(), "android.permission.ACCESS_FINE_LOCATION")) || (android.support.v4.app.a.a(l(), "android.permission.ACCESS_COARSE_LOCATION")))
    {
      Log.i("Scoot", "Displaying location permission rationale to provide additional context.");
      Snackbar.a(this.bi, 2131296585, -2).a(2131296578, new ad(this)).a();
      return;
    }
    android.support.v4.app.a.a(l(), com.scootapp.tv.a.a.b, 101);
  }
  
  private int a(ArrayList<Integer> paramArrayList, float paramFloat)
  {
    float f1 = 0.0F;
    int j = 0;
    while (j < paramArrayList.size())
    {
      f1 += ((Integer)paramArrayList.get(j)).intValue();
      j += 1;
    }
    f1 /= paramArrayList.size();
    return (int)((f1 - paramFloat) / f1 * 100.0F);
  }
  
  private void a(View paramView)
  {
    this.aG = ((AppCompatAutoCompleteTextView)paramView.findViewById(2131755226));
    this.aH = ((AppCompatAutoCompleteTextView)paramView.findViewById(2131755414));
    this.aG.setThreshold(1);
    this.aH.setThreshold(1);
    this.aG.setOnClickListener(new w(this));
    this.aH.setOnClickListener(new ag(this));
    this.aH.addTextChangedListener(new ah(this));
    this.aG.addTextChangedListener(new ai(this));
  }
  
  private void a(TextView paramTextView)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(l(), 2131034137);
    localAnimation.setAnimationListener(new ac(this, paramTextView));
    paramTextView.startAnimation(localAnimation);
  }
  
  private void b(Location paramLocation)
  {
    this.aM = paramLocation;
  }
  
  private void b(View paramView)
  {
    this.aE = ((RelativeLayout)paramView.findViewById(2131755644));
    this.aE.setVisibility(8);
    this.e = ((SwipeRefreshLayout)paramView.findViewById(2131755642));
    this.aD = new ArrayList();
    this.be = new ArrayList();
    this.aC = ((RecyclerView)paramView.findViewById(2131755643));
    this.aN = new com.sagar.taxiapp.a.q(k(), this.aD);
    this.aC.setAdapter(new jp.wasabeef.recyclerview.a.b(this.aN));
    Object localObject = new LinearLayoutManager(l());
    this.aC.setLayoutManager((en)localObject);
    this.aC.a(this);
    this.aC.a(new aj(this));
    this.aO = new android.support.v4.view.q(l(), new au(this, null));
    this.e.setColorSchemeResources(new int[] { 2131689696 });
    this.e.setOnRefreshListener(new ak(this));
    localObject = paramView.findViewById(2131755195);
    this.aP = ((TextView)paramView.findViewById(2131755196));
    this.aQ = ((TextView)paramView.findViewById(2131755197));
    View localView1 = paramView.findViewById(2131755199);
    this.aR = ((TextView)paramView.findViewById(2131755200));
    this.aS = ((TextView)paramView.findViewById(2131755201));
    View localView2 = paramView.findViewById(2131755205);
    this.aT = ((TextView)paramView.findViewById(2131755206));
    this.aU = ((TextView)paramView.findViewById(2131755207));
    View localView3 = paramView.findViewById(2131755645);
    this.aV = ((TextView)paramView.findViewById(2131755646));
    this.aW = ((TextView)paramView.findViewById(2131755647));
    this.aX = ((LinearLayout)paramView.findViewById(2131755193));
    this.ba = ((ListView)paramView.findViewById(2131755208));
    this.bb = new com.sagar.taxiapp.a.o(l(), com.scootapp.tv.d.d.b());
    this.bc = new com.sagar.taxiapp.a.g(l());
    ((View)localObject).setOnClickListener(new al(this));
    localView1.setOnClickListener(new am(this));
    localView2.setOnClickListener(new an(this));
    localView3.setOnClickListener(new x(this));
    localView3.setVisibility(8);
    this.bd = ((ActivityMainNew)l()).m;
    this.bd.setOnClickListener(new y(this));
    this.ba.animate().translationY(this.ba.getHeight() + this.aX.getHeight()).setStartDelay(0L);
    this.bd.b();
  }
  
  private void b(String paramString1, String paramString2)
  {
    Log.v("Test", "Inside Function fetchData");
    this.e.setRefreshing(true);
    this.aE.setVisibility(8);
    this.aD.clear();
    X();
    g("All");
    com.scootapp.tv.d.d.a();
    this.aN.a(this.aD);
    SharedPreferences.Editor localEditor = this.bj.getSharedPreferences("shareddata", 0).edit();
    localEditor.putString("sourceLat", paramString1).apply();
    localEditor.putString("sourceLng", paramString2).apply();
    if (this.aK) {
      localEditor.putString("yourDestination", this.aH.getText().toString()).apply();
    }
    for (;;)
    {
      c(paramString1, paramString2);
      return;
      localEditor.putString("destLat", "").apply();
      localEditor.putString("destLng", "").apply();
      localEditor.putString("yourDestination", "N/A").apply();
    }
  }
  
  private void c(String paramString)
  {
    paramString = paramString.substring(1, paramString.length()).split("-");
    if (paramString.length == 2) {
      f1 = Float.parseFloat(paramString[0]);
    }
    for (float f1 = (Float.parseFloat(paramString[1]) + f1) / 2.0F;; f1 = Float.parseFloat(paramString[0]))
    {
      this.ay.add(Integer.valueOf((int)f1));
      return;
    }
  }
  
  private void c(String paramString1, String paramString2)
  {
    try
    {
      Log.v("Test", "Inside Function fetchParse");
      HashMap localHashMap = new HashMap();
      localHashMap.put("lat", paramString1);
      localHashMap.put("lng", paramString2);
      if (this.aK)
      {
        localHashMap.put("droplat", this.ak.getString("destLat", ""));
        localHashMap.put("droplng", this.ak.getString("destLng", ""));
      }
      ParseCloud.callFunctionInBackground("distanceExceedCheck", localHashMap, new z(this, paramString1, paramString2));
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  static boolean c(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext.getPackageInfo(paramString, 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private float d(String paramString)
  {
    paramString = paramString.substring(1, paramString.length()).split("-");
    if (paramString.length == 2)
    {
      float f1 = Float.parseFloat(paramString[0]);
      return (Float.parseFloat(paramString[1]) + f1) / 2.0F;
    }
    return Float.parseFloat(paramString[0]);
  }
  
  private void d(String paramString1, String paramString2)
  {
    try
    {
      this.au += 1;
      Log.v("Test", "Inside Function fetchQueryAllProvidersIntl ");
      if (l() != null)
      {
        this.am = this.bj.getSharedPreferences("shareddata", 0).edit();
        HashMap localHashMap = new HashMap();
        localHashMap.put("lat", paramString1);
        localHashMap.put("lng", paramString2);
        if (this.aK)
        {
          localHashMap.put("droplat", this.ak.getString("destLat", ""));
          localHashMap.put("droplng", this.ak.getString("destLng", ""));
          this.am.putBoolean("destEntered", true).apply();
        }
        for (;;)
        {
          this.am.putString("enteredLat", paramString1).apply();
          this.am.putString("enteredLng", paramString2).apply();
          localHashMap.put("androidUpdate", a(2131296580));
          Log.v("Scoot", "Request -- " + localHashMap.toString());
          ParseCloud.callFunctionInBackground("queryallprovidersintl", localHashMap, new aa(this, paramString1, paramString2));
          return;
          this.am.putBoolean("destEntered", false).apply();
        }
      }
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  private boolean e(String paramString)
  {
    PackageManager localPackageManager = l().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo(paramString, 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return false;
  }
  
  /* Error */
  private String f(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: new 818	java/net/URL
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 820	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: invokevirtual 824	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   16: checkcast 826	java/net/HttpURLConnection
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual 829	java/net/HttpURLConnection:connect	()V
    //   24: aload_1
    //   25: invokevirtual 833	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   28: astore 4
    //   30: new 835	java/io/BufferedReader
    //   33: dup
    //   34: new 837	java/io/InputStreamReader
    //   37: dup
    //   38: aload 4
    //   40: invokespecial 840	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   43: invokespecial 843	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore_3
    //   47: new 797	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 798	java/lang/StringBuilder:<init>	()V
    //   54: astore_2
    //   55: aload_3
    //   56: invokevirtual 846	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +47 -> 110
    //   66: aload_2
    //   67: aload 5
    //   69: invokevirtual 804	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: goto -18 -> 55
    //   76: astore_3
    //   77: ldc -112
    //   79: astore_2
    //   80: ldc_w 347
    //   83: aload_3
    //   84: invokevirtual 847	java/lang/Exception:toString	()Ljava/lang/String;
    //   87: invokestatic 849	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   90: pop
    //   91: getstatic 121	com/sagar/taxiapp/b/v:av	Z
    //   94: ifne +55 -> 149
    //   97: aload 4
    //   99: ifnonnull +50 -> 149
    //   102: new 851	java/lang/AssertionError
    //   105: dup
    //   106: invokespecial 852	java/lang/AssertionError:<init>	()V
    //   109: athrow
    //   110: aload_2
    //   111: invokevirtual 806	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: astore_2
    //   115: aload_3
    //   116: invokevirtual 855	java/io/BufferedReader:close	()V
    //   119: getstatic 121	com/sagar/taxiapp/b/v:av	Z
    //   122: ifne +16 -> 138
    //   125: aload 4
    //   127: ifnonnull +11 -> 138
    //   130: new 851	java/lang/AssertionError
    //   133: dup
    //   134: invokespecial 852	java/lang/AssertionError:<init>	()V
    //   137: athrow
    //   138: aload 4
    //   140: invokevirtual 858	java/io/InputStream:close	()V
    //   143: aload_1
    //   144: invokevirtual 861	java/net/HttpURLConnection:disconnect	()V
    //   147: aload_2
    //   148: areturn
    //   149: aload 4
    //   151: invokevirtual 858	java/io/InputStream:close	()V
    //   154: aload_1
    //   155: invokevirtual 861	java/net/HttpURLConnection:disconnect	()V
    //   158: aload_2
    //   159: areturn
    //   160: astore_3
    //   161: aconst_null
    //   162: astore 4
    //   164: aload_2
    //   165: astore_1
    //   166: aload_3
    //   167: astore_2
    //   168: getstatic 121	com/sagar/taxiapp/b/v:av	Z
    //   171: ifne +16 -> 187
    //   174: aload 4
    //   176: ifnonnull +11 -> 187
    //   179: new 851	java/lang/AssertionError
    //   182: dup
    //   183: invokespecial 852	java/lang/AssertionError:<init>	()V
    //   186: athrow
    //   187: aload 4
    //   189: invokevirtual 858	java/io/InputStream:close	()V
    //   192: aload_1
    //   193: invokevirtual 861	java/net/HttpURLConnection:disconnect	()V
    //   196: aload_2
    //   197: athrow
    //   198: astore_2
    //   199: aconst_null
    //   200: astore 4
    //   202: goto -34 -> 168
    //   205: astore_2
    //   206: goto -38 -> 168
    //   209: astore_2
    //   210: goto -42 -> 168
    //   213: astore_3
    //   214: aconst_null
    //   215: astore 5
    //   217: ldc -112
    //   219: astore_2
    //   220: aload 4
    //   222: astore_1
    //   223: aload 5
    //   225: astore 4
    //   227: goto -147 -> 80
    //   230: astore_3
    //   231: aconst_null
    //   232: astore 4
    //   234: ldc -112
    //   236: astore_2
    //   237: goto -157 -> 80
    //   240: astore_3
    //   241: goto -161 -> 80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	this	v
    //   0	244	1	paramString	String
    //   1	196	2	localObject1	Object
    //   198	1	2	localObject2	Object
    //   205	1	2	localObject3	Object
    //   209	1	2	localObject4	Object
    //   219	18	2	str1	String
    //   46	10	3	localBufferedReader	java.io.BufferedReader
    //   76	40	3	localException1	Exception
    //   160	7	3	localObject5	Object
    //   213	1	3	localException2	Exception
    //   230	1	3	localException3	Exception
    //   240	1	3	localException4	Exception
    //   3	230	4	localObject6	Object
    //   59	165	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	55	76	java/lang/Exception
    //   55	61	76	java/lang/Exception
    //   66	73	76	java/lang/Exception
    //   110	115	76	java/lang/Exception
    //   5	20	160	finally
    //   20	30	198	finally
    //   30	55	205	finally
    //   55	61	205	finally
    //   66	73	205	finally
    //   110	115	205	finally
    //   115	119	205	finally
    //   80	91	209	finally
    //   5	20	213	java/lang/Exception
    //   20	30	230	java/lang/Exception
    //   115	119	240	java/lang/Exception
  }
  
  private void g(String paramString)
  {
    int j = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (j)
      {
      default: 
        return;
        if (paramString.equals("Time"))
        {
          j = 0;
          continue;
          if (paramString.equals("Price"))
          {
            j = 1;
            continue;
            if (paramString.equals("CabType"))
            {
              j = 2;
              continue;
              if (paramString.equals("CabCompany"))
              {
                j = 3;
                continue;
                if (paramString.equals("All")) {
                  j = 4;
                }
              }
            }
          }
        }
        break;
      }
    }
    this.aR.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aS.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    aq = false;
    return;
    this.aP.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aQ.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    ap = false;
    return;
    if (this.aZ) {
      this.aZ = false;
    }
    while (this.bh)
    {
      this.ba.animate().translationY(this.ba.getHeight() + this.aX.getHeight());
      return;
      this.bc.c();
      this.aV.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
      this.aW.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
      this.aW.setPaintFlags(0);
    }
    if (this.aY) {
      this.aY = false;
    }
    while (this.bg)
    {
      this.ba.animate().translationY(this.ba.getHeight() + this.aX.getHeight());
      return;
      this.bb.b();
      this.aT.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
      this.aU.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
      this.aU.setPaintFlags(0);
    }
    this.aR.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aS.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    aq = false;
    this.aP.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aQ.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    ap = false;
    this.bc.c();
    this.aV.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aW.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aW.setPaintFlags(0);
    this.bb.b();
    this.aT.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aU.setTextColor(android.support.v4.b.c.c(this.bj, 2131689705));
    this.aU.setPaintFlags(0);
    if (this.aZ) {
      this.aZ = false;
    }
    if (this.bh) {
      this.ba.animate().translationY(this.ba.getHeight() + this.aX.getHeight());
    }
    if (this.aY) {
      this.aY = false;
    }
    if (this.bg) {
      this.ba.animate().translationY(this.ba.getHeight() + this.aX.getHeight());
    }
    if (this.bf) {
      this.bf = false;
    }
    this.bd.b();
  }
  
  private void h(String paramString)
  {
    paramString = "https://maps.google.com/maps/api/geocode/json?latlng=" + paramString + "&sensor=false&key=" + "AIzaSyBqRVwi0eTm8A_EiFY9ZABdt9fMV9U9Sk0";
    Log.v("Scoot", "URL - " + paramString);
    paramString = new n(paramString, null, new ae(this), new af(this));
    ApplicationTaxi.a().a(paramString);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ak = l().getSharedPreferences("shareddata", 0);
    this.al = l().getSharedPreferences("olaUser", 0);
    this.an = l().getSharedPreferences("latestOlaRideFeedBackRecord", 0);
    this.bi = paramLayoutInflater.inflate(2130968725, paramViewGroup, false);
    this.aj = ((LocationManager)l().getSystemService("location"));
    this.aA = this.an.getBoolean("showFeedbackScreen", false);
    this.aB = this.an.getString("olaBookingId", "");
    if ((com.scootapp.tv.b.c.a(this.aB).equalsIgnoreCase("COMPLETED")) && (this.aA)) {
      paramLayoutInflater = com.scootapp.tv.b.c.b(this.aB);
    }
    try
    {
      this.an.edit().putInt("lastRideAmount", paramLayoutInflater.b()).apply();
      a(new Intent(l(), RideCompletionActivity.class));
      b(this.bi);
      a();
      this.aF = l().getSharedPreferences("shareddata", 0).edit();
      paramLayoutInflater = ((ApplicationTaxi)l().getApplication()).a(com.sagar.taxiapp.ab.a);
      paramLayoutInflater.a("Home Screen");
      paramLayoutInflater.a(new com.google.android.gms.analytics.o().a());
      a(this.bi);
      V();
      if (3 > this.bj.getSharedPreferences("apprater", 0).getInt("offer_launch_count", 0)) {
        com.sagar.taxiapp.z.a(l());
      }
      return this.bi;
    }
    catch (NullPointerException paramLayoutInflater)
    {
      for (;;)
      {
        this.an.edit().putInt("lastRideAmount", -20).apply();
      }
    }
  }
  
  protected void a()
  {
    try
    {
      this.a = new com.google.android.gms.common.api.r(l()).a(this).a(this).a(i.a).b();
      b();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      Log.v("Scoot", "OnActivityResult");
      if ((paramInt1 == 201) && (paramIntent != null))
      {
        this.aF.putString("sourceLat", paramIntent.getStringExtra("lat")).apply();
        this.aF.putString("sourceLng", paramIntent.getStringExtra("lng")).apply();
        this.aF.putString("yourLocation", paramIntent.getStringExtra("yourLocation")).apply();
        this.aG.setText(paramIntent.getStringExtra("yourLocation"));
        a(paramIntent.getStringExtra("lat"), paramIntent.getStringExtra("lng"));
      }
      if ((paramInt1 == 202) && (paramIntent != null))
      {
        this.aK = true;
        this.aF.putString("destLat", paramIntent.getStringExtra("lat")).apply();
        this.aF.putString("destLng", paramIntent.getStringExtra("lng")).apply();
        this.aH.setText(paramIntent.getStringExtra("yourLocation"));
        this.ak = l().getSharedPreferences("shareddata", 0);
        a(this.ak.getString("sourceLat", ""), this.ak.getString("sourceLng", ""));
      }
      return;
    }
    catch (NullPointerException paramIntent)
    {
      paramIntent.printStackTrace();
    }
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt == 101)
    {
      if (com.scootapp.taxiapp.utils.b.a(paramArrayOfInt))
      {
        a(null);
        return;
      }
      Snackbar.a(this.bi, 2131296587, -1).a();
      return;
    }
    super.a(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    this.bj = paramContext;
  }
  
  public void a(Location paramLocation)
  {
    Log.v("Scoot", "Location Changed");
    this.f = paramLocation;
    new ap(this, l()).execute(new String[0]);
    b(this.f.getLatitude() + "", this.f.getLongitude() + "");
    b(this.f);
  }
  
  public void a(Bundle paramBundle)
  {
    if ((Build.VERSION.SDK_INT >= 23) && (android.support.v4.b.c.a(k(), "android.permission.ACCESS_FINE_LOCATION") != 0) && (android.support.v4.b.c.a(k(), "android.permission.ACCESS_COARSE_LOCATION") != 0))
    {
      Z();
      return;
    }
    Log.v("Test", "Inside Function onConnected");
    if (!this.bk)
    {
      c();
      this.bk = false;
    }
    if (this.bk) {
      this.bk = false;
    }
    Log.v("Test", "Outside Function onConnected");
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(String paramString1, String paramString2)
  {
    Log.v("Test", "Inside Function processNewLocations");
    this.h = paramString1;
    this.i = paramString2;
    b(paramString1, paramString2);
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    this.aO.a(paramMotionEvent);
    return false;
  }
  
  protected void b()
  {
    this.ar = new LocationRequest();
    this.ar.a(300000L);
    this.ar.b(300000L);
    this.ar.a(100);
  }
  
  public void b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {}
  
  public void b(String paramString)
  {
    Toast.makeText(this.bj, paramString, 1).show();
  }
  
  protected void c()
  {
    if ((Build.VERSION.SDK_INT >= 23) && (android.support.v4.b.c.a(k(), "android.permission.ACCESS_FINE_LOCATION") != 0) && (android.support.v4.b.c.a(k(), "android.permission.ACCESS_COARSE_LOCATION") != 0))
    {
      Z();
      return;
    }
    i.b.a(this.a, this.ar, this);
  }
  
  public void c_(int paramInt)
  {
    this.a.e();
  }
  
  protected void d()
  {
    if (this.a.i()) {
      i.b.a(this.a, this);
    }
  }
  
  public void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle != null)
    {
      this.h = paramBundle.getString("latStr", null);
      this.i = paramBundle.getString("lngStr", null);
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("latStr", this.h);
    paramBundle.putString("lngStr", this.i);
  }
  
  public void f()
  {
    super.f();
    g("All");
    this.a.e();
  }
  
  public void g()
  {
    super.g();
    g("All");
    if (this.a.i()) {
      this.a.g();
    }
    S();
  }
  
  public void onClick(View paramView)
  {
    h localh;
    Object localObject1;
    Object localObject2;
    int j;
    Object localObject3;
    if (paramView != null)
    {
      localh = (h)this.aD.get(this.aC.d(paramView));
      this.d = localh.d;
      paramView = ((ApplicationTaxi)l().getApplication()).a(com.sagar.taxiapp.ab.a);
      localObject1 = com.scootapp.tv.d.d.a(this.d);
      if (localObject1 == null) {
        break label1850;
      }
      localObject2 = ParseUser.getCurrentUser();
      if ((localObject2 != null) && (this.ak.getBoolean("destEntered", false)))
      {
        float f1 = d(localh.a);
        j = a(this.ay, f1);
        localObject3 = ParseQuery.getQuery("olaSavedMoney");
        if (((String)localObject1).equalsIgnoreCase("ola")) {
          break label337;
        }
        if (localObject3 == null) {
          break label291;
        }
        ((ParseQuery)localObject3).whereEqualTo("emailId", ((ParseUser)localObject2).getEmail());
        ((ParseQuery)localObject3).findInBackground(new ab(this, j, (ParseUser)localObject2));
      }
      if (!((String)localObject1).toLowerCase().contains("ola")) {
        break label763;
      }
      if ((!e.a(localh.b).equalsIgnoreCase("auto")) || (this.aK)) {
        break label363;
      }
      this.bk = true;
      paramView = new Intent(l(), OnDemandSearchAddress.class);
      paramView.putExtra("autocompletetext", "Enter Your Destination");
      startActivityForResult(paramView, 202);
    }
    for (;;)
    {
      if (this.as != null) {
        this.as.put("selectedChoice", localh.f + "@" + localh.b);
      }
      return;
      label291:
      localObject3 = new ParseObject("olaSavedMoney");
      ((ParseObject)localObject3).put("emailId", ((ParseUser)localObject2).getEmail());
      ((ParseObject)localObject3).put("percentSaved", Integer.valueOf(j));
      ((ParseObject)localObject3).saveInBackground();
      break;
      label337:
      this.ak.edit().putInt("percentSaved", j).apply();
      break;
      label363:
      paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " app redirect").a());
      this.am = l().getSharedPreferences("shareddata", 0).edit();
      this.am.putString("selectedCabCompany", (String)localObject1).apply();
      this.am.putString("selectedCabType", e.a(localh.b)).apply();
      this.am.putString("selectedCabEta", localh.c).apply();
      if (!this.ak.getBoolean("destEntered", false)) {
        this.am.putString("selectedCabRate", localh.g + "" + localh.a + "/" + localh.h).apply();
      }
      for (;;)
      {
        this.am.putFloat("selectedCabSurcharge", (float)localh.j).apply();
        this.am = l().getSharedPreferences("olaUser", 0).edit();
        l().getSharedPreferences("shareddata", 0).edit().putString("yourLocation", this.aG.getText().toString()).apply();
        l().getSharedPreferences("shareddata", 0).edit().putString("yourDestination", this.aH.getText().toString()).apply();
        a(new Intent(l(), OlaBooking.class));
        break;
        if (this.ak.getBoolean("destEntered", false)) {
          this.am.putString("selectedCabRate", localh.a).apply();
        }
      }
      label763:
      Object localObject4;
      if (((String)localObject1).toLowerCase().contains("uber"))
      {
        paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " app redirect").a());
        for (;;)
        {
          try
          {
            localObject4 = l().getSharedPreferences("shareddata", 0);
            l().getPackageManager().getPackageInfo("com.ubercab", 1);
            paramView = ((SharedPreferences)localObject4).getString("enteredLat", "0");
            localObject1 = ((SharedPreferences)localObject4).getString("enteredLng", "0");
            ((SharedPreferences)localObject4).getString("yourLocation", "");
            localObject2 = localh.i;
            if (((SharedPreferences)localObject4).getBoolean("destEntered", false)) {
              break label1049;
            }
            localObject3 = this.aG.getText().toString();
            paramView = "uber://?action=setPickup&pickup=my_location&client_id=gv8dOM1afXYvc6t5NJHBWwz_nPT4gTad&pickup[latitude]=" + paramView + "&pickup[longitude]=" + (String)localObject1 + "&pickup[formatted_address]=" + (String)localObject3 + "&product_id=" + (String)localObject2;
            localObject1 = new Intent("android.intent.action.VIEW");
            ((Intent)localObject1).setData(Uri.parse(paramView));
            a((Intent)localObject1);
          }
          catch (PackageManager.NameNotFoundException paramView)
          {
            paramView = new Intent("android.intent.action.VIEW");
            paramView.setData(Uri.parse("https://m.uber.com/sign-up?client_id=gv8dOM1afXYvc6t5NJHBWwz_nPT4gTad"));
            a(paramView);
          }
          break;
          label1049:
          localObject3 = ((SharedPreferences)localObject4).getString("destLat", "0");
          localObject4 = ((SharedPreferences)localObject4).getString("destLng", "0");
          String str1 = this.aH.getText().toString();
          String str2 = this.aG.getText().toString();
          paramView = "uber://?action=setPickup&pickup=my_location&client_id=gv8dOM1afXYvc6t5NJHBWwz_nPT4gTad&pickup[latitude]=" + paramView + "&pickup[longitude]=" + (String)localObject1 + "&pickup[formatted_address]=" + str2 + "&dropoff[latitude]=" + (String)localObject3 + "&dropoff[longitude]=" + (String)localObject4 + "&dropoff[formatted_address]=" + str1 + "&product_id=" + (String)localObject2;
        }
      }
      if (((String)localObject1).toLowerCase().contains("lyft"))
      {
        paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " app redirect").a());
        localObject4 = l().getSharedPreferences("shareddata", 0);
        if (c(l(), "me.lyft.android"))
        {
          paramView = ((SharedPreferences)localObject4).getString("enteredLat", "0");
          localObject1 = ((SharedPreferences)localObject4).getString("enteredLng", "0");
          localObject2 = localh.i;
          if (!((SharedPreferences)localObject4).getBoolean("destEntered", false)) {}
          for (paramView = "lyft://ridetype?id=" + (String)localObject2 + "&partner=oknimtIu5AIt&" + "pickup[latitude]=" + paramView + "&pickup[longitude]=" + (String)localObject1;; paramView = "lyft://ridetype?id=" + (String)localObject2 + "&partner=oknimtIu5AIt&" + "pickup[latitude]=" + paramView + "&pickup[longitude]=" + (String)localObject1 + "&destination[latitude]=" + (String)localObject3 + "&destination[longitude]=" + (String)localObject4)
          {
            localObject1 = new Intent("android.intent.action.VIEW");
            ((Intent)localObject1).setData(Uri.parse(paramView));
            a((Intent)localObject1);
            break;
            localObject3 = ((SharedPreferences)localObject4).getString("destLat", "0");
            localObject4 = ((SharedPreferences)localObject4).getString("destLng", "0");
            this.aH.getText().toString();
          }
        }
        paramView = new Intent("android.intent.action.VIEW");
        paramView.setFlags(268435456);
        paramView.setData(Uri.parse("https://play.google.com/store/apps/details?id=me.lyft.android"));
        a(paramView);
      }
      else if (((String)localObject1).toLowerCase().contains("jugnoo"))
      {
        paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " app redirect").a());
        paramView = new Intent("android.intent.action.VIEW");
        paramView.setData(Uri.parse("http://share.jugnoo.in/jugnoo-via-scootapp"));
        a(paramView);
      }
      else if (e(localh.e))
      {
        a(l().getPackageManager().getLaunchIntentForPackage(localh.e));
        paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " app redirect").a());
      }
      else
      {
        paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " store redirect").a());
        a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + localh.e)));
        continue;
        label1850:
        if (e(localh.e))
        {
          a(l().getPackageManager().getLaunchIntentForPackage(localh.e));
          paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " app redirect").a());
          System.out.println("App already installed on your phone");
        }
        else
        {
          paramView.a(new l().a("USER_EVENTS").b("CAB CLICKS").c(localh.f + " store redirect").a());
          a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + localh.e)));
        }
      }
    }
  }
  
  public void x()
  {
    ao = false;
    g("All");
    if (this.aI != null) {
      this.aI.cancel(true);
    }
    if (this.aJ != null) {
      this.aJ.cancel(true);
    }
    d();
    super.x();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */