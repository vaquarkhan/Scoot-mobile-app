package com.sagar.taxiapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.en;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.location.d;
import com.google.android.gms.location.i;
import com.google.android.gms.location.places.e;
import com.parse.ParseUser;
import com.sagar.taxiapp.a.bt;
import java.util.ArrayList;

public class OnDemandSearchAddress
  extends ah
  implements s, t
{
  private AppCompatAutoCompleteTextView A;
  private CardView B;
  private CardView C;
  private TextView D;
  private TextView E;
  private TextView F;
  private TextView G;
  private ImageView H;
  private ImageView I;
  private boolean J = false;
  private RecyclerView K;
  private ArrayList<String> L;
  private bt M;
  private en N;
  int m = 1;
  protected q n;
  public Location o;
  String p = "";
  SharedPreferences q;
  SharedPreferences.Editor r;
  Intent s;
  private String u = "key=AIzaSyBqRVwi0eTm8A_EiFY9ZABdt9fMV9U9Sk0";
  private Location v;
  private db w;
  private cz x;
  private String y;
  private String z;
  
  static
  {
    if (!OnDemandSearchAddress.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      t = bool;
      return;
    }
  }
  
  /* Error */
  private String b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: new 101	java/net/URL
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 104	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: invokevirtual 108	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   16: checkcast 110	java/net/HttpURLConnection
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual 113	java/net/HttpURLConnection:connect	()V
    //   24: aload_1
    //   25: invokevirtual 117	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   28: astore 4
    //   30: new 119	java/io/BufferedReader
    //   33: dup
    //   34: new 121	java/io/InputStreamReader
    //   37: dup
    //   38: aload 4
    //   40: invokespecial 124	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   43: invokespecial 127	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore_3
    //   47: new 129	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   54: astore_2
    //   55: aload_3
    //   56: invokevirtual 134	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +46 -> 109
    //   66: aload_2
    //   67: aload 5
    //   69: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: goto -18 -> 55
    //   76: astore_3
    //   77: ldc 76
    //   79: astore_2
    //   80: ldc -116
    //   82: aload_3
    //   83: invokevirtual 143	java/lang/Exception:toString	()Ljava/lang/String;
    //   86: invokestatic 149	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   89: pop
    //   90: getstatic 64	com/sagar/taxiapp/OnDemandSearchAddress:t	Z
    //   93: ifne +55 -> 148
    //   96: aload 4
    //   98: ifnonnull +50 -> 148
    //   101: new 151	java/lang/AssertionError
    //   104: dup
    //   105: invokespecial 152	java/lang/AssertionError:<init>	()V
    //   108: athrow
    //   109: aload_2
    //   110: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: astore_2
    //   114: aload_3
    //   115: invokevirtual 156	java/io/BufferedReader:close	()V
    //   118: getstatic 64	com/sagar/taxiapp/OnDemandSearchAddress:t	Z
    //   121: ifne +16 -> 137
    //   124: aload 4
    //   126: ifnonnull +11 -> 137
    //   129: new 151	java/lang/AssertionError
    //   132: dup
    //   133: invokespecial 152	java/lang/AssertionError:<init>	()V
    //   136: athrow
    //   137: aload 4
    //   139: invokevirtual 159	java/io/InputStream:close	()V
    //   142: aload_1
    //   143: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   146: aload_2
    //   147: areturn
    //   148: aload 4
    //   150: invokevirtual 159	java/io/InputStream:close	()V
    //   153: aload_1
    //   154: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   157: aload_2
    //   158: areturn
    //   159: astore_3
    //   160: aconst_null
    //   161: astore 4
    //   163: aload_2
    //   164: astore_1
    //   165: aload_3
    //   166: astore_2
    //   167: getstatic 64	com/sagar/taxiapp/OnDemandSearchAddress:t	Z
    //   170: ifne +16 -> 186
    //   173: aload 4
    //   175: ifnonnull +11 -> 186
    //   178: new 151	java/lang/AssertionError
    //   181: dup
    //   182: invokespecial 152	java/lang/AssertionError:<init>	()V
    //   185: athrow
    //   186: aload 4
    //   188: invokevirtual 159	java/io/InputStream:close	()V
    //   191: aload_1
    //   192: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   195: aload_2
    //   196: athrow
    //   197: astore_2
    //   198: aconst_null
    //   199: astore 4
    //   201: goto -34 -> 167
    //   204: astore_2
    //   205: goto -38 -> 167
    //   208: astore_2
    //   209: goto -42 -> 167
    //   212: astore_3
    //   213: aconst_null
    //   214: astore 5
    //   216: ldc 76
    //   218: astore_2
    //   219: aload 4
    //   221: astore_1
    //   222: aload 5
    //   224: astore 4
    //   226: goto -146 -> 80
    //   229: astore_3
    //   230: aconst_null
    //   231: astore 4
    //   233: ldc 76
    //   235: astore_2
    //   236: goto -156 -> 80
    //   239: astore_3
    //   240: goto -160 -> 80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	OnDemandSearchAddress
    //   0	243	1	paramString	String
    //   1	195	2	localObject1	Object
    //   197	1	2	localObject2	Object
    //   204	1	2	localObject3	Object
    //   208	1	2	localObject4	Object
    //   218	18	2	str1	String
    //   46	10	3	localBufferedReader	java.io.BufferedReader
    //   76	39	3	localException1	Exception
    //   159	7	3	localObject5	Object
    //   212	1	3	localException2	Exception
    //   229	1	3	localException3	Exception
    //   239	1	3	localException4	Exception
    //   3	229	4	localObject6	Object
    //   59	164	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	55	76	java/lang/Exception
    //   55	61	76	java/lang/Exception
    //   66	73	76	java/lang/Exception
    //   109	114	76	java/lang/Exception
    //   5	20	159	finally
    //   20	30	197	finally
    //   30	55	204	finally
    //   55	61	204	finally
    //   66	73	204	finally
    //   109	114	204	finally
    //   114	118	204	finally
    //   80	90	208	finally
    //   5	20	212	java/lang/Exception
    //   20	30	229	java/lang/Exception
    //   114	118	239	java/lang/Exception
  }
  
  private void n()
  {
    View localView = getCurrentFocus();
    if (localView != null) {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    try
    {
      this.o = i.b.a(this.n);
      if ((!this.A.getText().toString().equalsIgnoreCase("")) || (this.o != null)) {}
      while (this.o == null) {
        return;
      }
      return;
    }
    catch (SecurityException paramBundle)
    {
      for (;;) {}
    }
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(String paramString)
  {
    int k = 6;
    int i1 = 0;
    int i = 1;
    for (;;)
    {
      int j = i1;
      if (i <= 6)
      {
        if (paramString.equalsIgnoreCase(this.q.getString("address" + i, ""))) {
          j = 1;
        }
      }
      else
      {
        if (j != 0) {
          return;
        }
        i1 = this.q.getInt("index", 1);
        i = i1;
        j = k;
        if (i1 == 7)
        {
          this.r.putInt("index", 1).apply();
          i = 1;
          j = k;
        }
        while (j > 1)
        {
          this.r.putString("address" + j, this.q.getString("address" + (j - 1), "")).apply();
          j -= 1;
        }
      }
      i += 1;
    }
    this.r.putString("address1", paramString).apply();
    this.r.putInt("index", i + 1).apply();
  }
  
  public void c_(int paramInt)
  {
    this.n.e();
  }
  
  public void l()
  {
    int i = 1;
    while (i <= 6)
    {
      String str = this.q.getString("address" + i, "");
      if (str.length() > 0) {
        this.L.add(str);
      }
      i += 1;
    }
    this.M.c();
  }
  
  protected void m()
  {
    try
    {
      this.n = new r(this).a(this).a(this).a(i.a).b();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str;
    ParseUser localParseUser;
    if (paramInt1 == this.m)
    {
      if (paramInt2 != -1) {
        break label323;
      }
      paramIntent = com.google.android.gms.location.places.a.a.a(this, paramIntent);
      str = paramIntent.b();
      localParseUser = ParseUser.getCurrentUser();
      if (!this.J) {
        break label181;
      }
      this.r.putString("workAddress", paramIntent.c().toString()).apply();
      this.r.putBoolean("workAdded", true).apply();
      this.r.putString("workPlaceId", str).apply();
      if (localParseUser != null)
      {
        localParseUser.put("workAddress", paramIntent.c().toString());
        localParseUser.put("workPlaceId", str);
        localParseUser.saveInBackground();
      }
      this.D.setVisibility(0);
      this.D.setText(paramIntent.c().toString());
      this.F.setText("Work");
    }
    label181:
    label323:
    do
    {
      return;
      this.r.putString("homeAddress", paramIntent.c().toString()).apply();
      this.r.putBoolean("homeAdded", true).apply();
      this.r.putString("homePlaceId", str).apply();
      if (localParseUser != null)
      {
        localParseUser.put("homeAddress", paramIntent.c().toString());
        localParseUser.put("homePlaceId", str);
        localParseUser.saveInBackground();
      }
      this.E.setVisibility(0);
      this.E.setText(paramIntent.c().toString());
      this.G.setText("Home");
      return;
      if (paramInt2 == 2)
      {
        com.google.android.gms.location.places.a.a.b(this, paramIntent);
        return;
      }
    } while (paramInt2 != 0);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968619);
    this.s = getIntent();
    paramBundle = this.s.getStringExtra("autocompletetext");
    this.q = getSharedPreferences("shareddata", 0);
    this.r = getSharedPreferences("shareddata", 0).edit();
    this.A = ((AppCompatAutoCompleteTextView)findViewById(2131755211));
    this.A.setHint(paramBundle);
    this.K = ((RecyclerView)findViewById(2131755335));
    this.B = ((CardView)findViewById(2131755327));
    this.C = ((CardView)findViewById(2131755331));
    this.D = ((TextView)findViewById(2131755329));
    this.E = ((TextView)findViewById(2131755333));
    this.F = ((TextView)findViewById(2131755328));
    this.G = ((TextView)findViewById(2131755332));
    this.H = ((ImageView)findViewById(2131755330));
    this.I = ((ImageView)findViewById(2131755334));
    this.L = new ArrayList();
    this.N = new LinearLayoutManager(this);
    this.K.setLayoutManager(this.N);
    this.M = new bt(this, this.L);
    this.K.setAdapter(this.M);
    if (this.q.getBoolean("workAdded", false))
    {
      this.F.setText("Work");
      this.D.setVisibility(0);
      this.D.setText(this.q.getString("workAddress", ""));
      if (!this.q.getBoolean("homeAdded", false)) {
        break label575;
      }
      this.G.setText("Home");
      this.E.setVisibility(0);
      label358:
      this.E.setText(this.q.getString("homeAddress", ""));
      l();
      m();
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.clearFlags(67108864);
        paramBundle.setStatusBarColor(c.c(this, 2131689628));
      }
      a((Toolbar)findViewById(2131755210));
      paramBundle = h();
      if (paramBundle != null)
      {
        paramBundle.c(false);
        paramBundle.b(true);
        paramBundle.a(true);
        if (Build.VERSION.SDK_INT < 21) {
          break label588;
        }
        paramBundle.a(getResources().getDrawable(2130837795, null));
      }
    }
    for (;;)
    {
      this.H.setOnClickListener(new ct(this));
      this.I.setOnClickListener(new cu(this));
      this.B.setOnClickListener(new cv(this));
      this.E.setOnClickListener(new cw(this));
      this.A.addTextChangedListener(new cx(this));
      return;
      this.F.setText("Add Work");
      break;
      label575:
      this.G.setText("Add Home");
      break label358;
      label588:
      paramBundle.a(c.a(this, 2130837795));
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\OnDemandSearchAddress.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */