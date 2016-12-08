package com.sagar.taxiapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.location.d;
import com.google.android.gms.location.i;
import com.parse.ParseCloud;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.sagar.taxiapp.beans.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class LocalCarRentalPrePaymentPage
  extends ah
  implements s, t, com.scootapp.tv.c.a
{
  private String A;
  private String B;
  private String C;
  private String D;
  private String E;
  private String F;
  private String G;
  private String H;
  private String I;
  private String J;
  private String K;
  private String L;
  private int M;
  private String N;
  private String O;
  private String P;
  private String Q;
  private String R;
  private String S;
  private String T;
  private String U;
  private String V;
  private String W;
  private EditText X;
  private EditText Y;
  private EditText Z;
  private EditText aa;
  private EditText ab;
  private CheckBox ac;
  private AutoCompleteTextView ad;
  private Button ae;
  private String af;
  private boolean ag = false;
  private boolean ah = false;
  private boolean ai = false;
  private boolean aj = false;
  private boolean ak = false;
  private boolean al = true;
  private Location am;
  private SharedPreferences an;
  private ProgressDialog ao;
  protected q m;
  br n;
  bp o;
  String p;
  ParseObject q = null;
  private Intent s;
  private String t;
  private String u;
  private String v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  static
  {
    if (!LocalCarRentalPrePaymentPage.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      r = bool;
      return;
    }
  }
  
  private void a(String paramString, AutoCompleteTextView paramAutoCompleteTextView)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this, 2131034137);
    localAnimation.setAnimationListener(new bo(this, paramAutoCompleteTextView, paramString));
    paramAutoCompleteTextView.startAnimation(localAnimation);
  }
  
  private void a(String paramString, EditText paramEditText)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this, 2131034137);
    localAnimation.setAnimationListener(new bn(this, paramEditText, paramString));
    paramEditText.startAnimation(localAnimation);
  }
  
  public static boolean a(String paramString)
  {
    boolean bool = false;
    if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(paramString).matches()) {
      bool = true;
    }
    return bool;
  }
  
  /* Error */
  private String b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: new 216	java/net/URL
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 219	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: invokevirtual 223	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   16: checkcast 225	java/net/HttpURLConnection
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual 228	java/net/HttpURLConnection:connect	()V
    //   24: aload_1
    //   25: invokevirtual 232	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   28: astore 4
    //   30: new 234	java/io/BufferedReader
    //   33: dup
    //   34: new 236	java/io/InputStreamReader
    //   37: dup
    //   38: aload 4
    //   40: invokespecial 239	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   43: invokespecial 242	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore_3
    //   47: new 244	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   54: astore_2
    //   55: aload_3
    //   56: invokevirtual 249	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +40 -> 103
    //   66: aload_2
    //   67: aload 5
    //   69: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: goto -18 -> 55
    //   76: astore_3
    //   77: ldc -1
    //   79: astore_2
    //   80: aload_3
    //   81: invokevirtual 258	java/lang/Exception:printStackTrace	()V
    //   84: getstatic 88	com/sagar/taxiapp/LocalCarRentalPrePaymentPage:r	Z
    //   87: ifne +55 -> 142
    //   90: aload 4
    //   92: ifnonnull +50 -> 142
    //   95: new 260	java/lang/AssertionError
    //   98: dup
    //   99: invokespecial 261	java/lang/AssertionError:<init>	()V
    //   102: athrow
    //   103: aload_2
    //   104: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: astore_2
    //   108: aload_3
    //   109: invokevirtual 267	java/io/BufferedReader:close	()V
    //   112: getstatic 88	com/sagar/taxiapp/LocalCarRentalPrePaymentPage:r	Z
    //   115: ifne +16 -> 131
    //   118: aload 4
    //   120: ifnonnull +11 -> 131
    //   123: new 260	java/lang/AssertionError
    //   126: dup
    //   127: invokespecial 261	java/lang/AssertionError:<init>	()V
    //   130: athrow
    //   131: aload 4
    //   133: invokevirtual 270	java/io/InputStream:close	()V
    //   136: aload_1
    //   137: invokevirtual 273	java/net/HttpURLConnection:disconnect	()V
    //   140: aload_2
    //   141: areturn
    //   142: aload 4
    //   144: invokevirtual 270	java/io/InputStream:close	()V
    //   147: aload_1
    //   148: invokevirtual 273	java/net/HttpURLConnection:disconnect	()V
    //   151: aload_2
    //   152: areturn
    //   153: astore_3
    //   154: aconst_null
    //   155: astore 4
    //   157: aload_2
    //   158: astore_1
    //   159: aload_3
    //   160: astore_2
    //   161: getstatic 88	com/sagar/taxiapp/LocalCarRentalPrePaymentPage:r	Z
    //   164: ifne +16 -> 180
    //   167: aload 4
    //   169: ifnonnull +11 -> 180
    //   172: new 260	java/lang/AssertionError
    //   175: dup
    //   176: invokespecial 261	java/lang/AssertionError:<init>	()V
    //   179: athrow
    //   180: aload 4
    //   182: invokevirtual 270	java/io/InputStream:close	()V
    //   185: aload_1
    //   186: invokevirtual 273	java/net/HttpURLConnection:disconnect	()V
    //   189: aload_2
    //   190: athrow
    //   191: astore_2
    //   192: aconst_null
    //   193: astore 4
    //   195: goto -34 -> 161
    //   198: astore_2
    //   199: goto -38 -> 161
    //   202: astore_2
    //   203: goto -42 -> 161
    //   206: astore_3
    //   207: aconst_null
    //   208: astore 5
    //   210: ldc -1
    //   212: astore_2
    //   213: aload 4
    //   215: astore_1
    //   216: aload 5
    //   218: astore 4
    //   220: goto -140 -> 80
    //   223: astore_3
    //   224: aconst_null
    //   225: astore 4
    //   227: ldc -1
    //   229: astore_2
    //   230: goto -150 -> 80
    //   233: astore_3
    //   234: goto -154 -> 80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	LocalCarRentalPrePaymentPage
    //   0	237	1	paramString	String
    //   1	189	2	localObject1	Object
    //   191	1	2	localObject2	Object
    //   198	1	2	localObject3	Object
    //   202	1	2	localObject4	Object
    //   212	18	2	str1	String
    //   46	10	3	localBufferedReader	java.io.BufferedReader
    //   76	33	3	localException1	Exception
    //   153	7	3	localObject5	Object
    //   206	1	3	localException2	Exception
    //   223	1	3	localException3	Exception
    //   233	1	3	localException4	Exception
    //   3	223	4	localObject6	Object
    //   59	158	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	55	76	java/lang/Exception
    //   55	61	76	java/lang/Exception
    //   66	73	76	java/lang/Exception
    //   103	108	76	java/lang/Exception
    //   5	20	153	finally
    //   20	30	191	finally
    //   30	55	198	finally
    //   55	61	198	finally
    //   66	73	198	finally
    //   103	108	198	finally
    //   108	112	198	finally
    //   80	84	202	finally
    //   5	20	206	java/lang/Exception
    //   20	30	223	java/lang/Exception
    //   108	112	233	java/lang/Exception
  }
  
  private void o()
  {
    View localView = getCurrentFocus();
    if (localView != null) {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
    this.ad.clearFocus();
  }
  
  public void a(Bundle paramBundle)
  {
    try
    {
      this.am = i.b.a(this.m);
      return;
    }
    catch (SecurityException paramBundle) {}
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(b paramb)
  {
    HashMap localHashMap = new HashMap();
    if (this.Q.equalsIgnoreCase("clear Car rental"))
    {
      localHashMap.put("tripId", this.p);
      localHashMap.put("userIPAddress", this.F);
      localHashMap.put("userId", this.z);
      localHashMap.put("paidAmount", this.w);
      localHashMap.put("scootTime", this.U);
      com.scootapp.tv.a.a.a(this, localHashMap, this.Q, paramb, "rental");
    }
    do
    {
      return;
      if (this.Q.equalsIgnoreCase("makson"))
      {
        localHashMap.put("mobileNum", this.L);
        localHashMap.put("email", this.K);
        localHashMap.put("firstName", this.I);
        localHashMap.put("lastName", this.J);
        localHashMap.put("pickupAddress", this.N);
        localHashMap.put("pickupDate", this.C);
        localHashMap.put("pickupTime", this.D);
        localHashMap.put("pickupCity", this.B);
        localHashMap.put("dropCity", "");
        localHashMap.put("days", this.t);
        localHashMap.put("travelTypeOption", this.G);
        localHashMap.put("tripTypeOption", this.E);
        localHashMap.put("carId", this.R);
        localHashMap.put("natureId", this.S);
        localHashMap.put("totalAmount", this.w);
        localHashMap.put("carName", this.A);
        localHashMap.put("approxDistance", this.T);
        localHashMap.put("scootTime", this.U);
        com.scootapp.tv.a.a.a(this, localHashMap, this.Q, paramb, "rental");
        return;
      }
    } while (!this.Q.equalsIgnoreCase("savaari"));
    localHashMap.put("mobileNum", this.L);
    localHashMap.put("email", this.K);
    localHashMap.put("firstName", this.I);
    localHashMap.put("lastName", this.J);
    localHashMap.put("pickupAddress", this.N);
    localHashMap.put("pickupDate", this.C);
    localHashMap.put("pickupTime", this.D);
    localHashMap.put("pickupCity", this.B);
    localHashMap.put("dropCity", "");
    localHashMap.put("days", this.t);
    localHashMap.put("travelTypeOption", this.G);
    localHashMap.put("tripTypeOption", this.E);
    localHashMap.put("carId", this.R);
    localHashMap.put("totalAmount", this.w);
    localHashMap.put("carName", this.A);
    localHashMap.put("approxDistance", this.T);
    localHashMap.put("scootTime", this.U);
    localHashMap.put("pickupCityCode", this.V);
    localHashMap.put("pickupDateTime", this.W);
    com.scootapp.tv.a.a.a(this, localHashMap, this.Q, paramb, "rental");
  }
  
  public void a(HashMap<String, Object> paramHashMap)
  {
    ParseCloud.callFunctionInBackground("payuTransctionId", paramHashMap, new bm(this));
  }
  
  public void c_(int paramInt)
  {
    this.m.e();
  }
  
  public void l()
  {
    this.ao.dismiss();
  }
  
  public void m()
  {
    this.ao.dismiss();
  }
  
  protected void n()
  {
    try
    {
      this.m = new r(this).a(this).a(this).a(i.a).b();
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
    int i = 0;
    Log.v("Scoot", "Request Code " + paramInt1 + " Result code " + paramInt2);
    if (paramInt1 == 100)
    {
      try
      {
        if (paramIntent.getStringExtra("payu_response") == null) {
          break label557;
        }
        localObject1 = new ParseObject("PayLog");
        ((ParseObject)localObject1).put("response", paramIntent.getStringExtra("payu_response"));
        ((ParseObject)localObject1).saveInBackground();
        localObject2 = paramIntent.getStringExtra("payu_response");
        Log.v("Scoot", "Payment Response " + paramIntent.getStringExtra("payu_response"));
        localObject1 = "Some error occured";
        paramIntent = (Intent)localObject1;
        try
        {
          localObject2 = new JSONObject((String)localObject2);
          paramIntent = (Intent)localObject1;
          Log.v("Scoot", "Payment JSON Response " + ((JSONObject)localObject2).toString());
          paramIntent = (Intent)localObject1;
          localObject1 = ((JSONObject)localObject2).optString("Error_Message");
          paramIntent = (Intent)localObject1;
          localObject3 = ((JSONObject)localObject2).optString("status");
          paramIntent = (Intent)localObject1;
          switch (((String)localObject3).hashCode())
          {
          case -1867169789: 
            paramIntent = (Intent)localObject1;
            if (!((String)localObject3).equals("success")) {
              break label569;
            }
            paramInt1 = i;
          }
        }
        catch (Exception localException)
        {
          Toast.makeText(this, paramIntent, 1).show();
          return;
        }
        paramIntent = (Intent)localObject1;
        if (!((String)localObject3).equals("failure")) {
          break label569;
        }
        paramInt1 = 1;
      }
      catch (Exception paramIntent)
      {
        Object localObject1;
        Object localObject2;
        Toast.makeText(this, "Some error occured", 1).show();
        return;
      }
      paramIntent = (Intent)localObject1;
      Object localObject3 = new b();
      paramIntent = (Intent)localObject1;
      ((b)localObject3).e(this.w);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).f(this.A);
      paramIntent = (Intent)localObject1;
      if (!this.E.equalsIgnoreCase("1"))
      {
        paramIntent = (Intent)localObject1;
        if (!this.E.equalsIgnoreCase("4")) {}
      }
      else
      {
        paramIntent = (Intent)localObject1;
        ((b)localObject3).d("Full day");
      }
      for (;;)
      {
        paramIntent = (Intent)localObject1;
        ((b)localObject3).a(String.format("%s %s", new Object[] { this.C, this.U }));
        paramIntent = (Intent)localObject1;
        ((b)localObject3).b(this.N);
        paramIntent = (Intent)localObject1;
        ((b)localObject3).c(this.p);
        paramIntent = (Intent)localObject1;
        ((b)localObject3).g(this.L);
        paramIntent = (Intent)localObject1;
        ((b)localObject3).h(this.F);
        paramIntent = (Intent)localObject1;
        ((b)localObject3).i(this.z);
        paramIntent = (Intent)localObject1;
        ((b)localObject3).j(((JSONObject)localObject2).optString("id"));
        paramIntent = (Intent)localObject1;
        ((b)localObject3).k(this.H);
        paramIntent = (Intent)localObject1;
        ((b)localObject3).l(this.Q);
        paramIntent = (Intent)localObject1;
        a((b)localObject3);
        return;
        paramIntent = localException;
        ((b)localObject3).d("Half Day");
      }
      paramIntent = localException;
      Toast.makeText(this, localException, 1).show();
      return;
      label557:
      Toast.makeText(this, "Cab Booking Cancelled", 1).show();
      return;
      label569:
      paramInt1 = -1;
      switch (paramInt1)
      {
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968608);
    n();
    this.an = getSharedPreferences("shareddata", 0);
    this.s = getIntent();
    this.t = this.s.getStringExtra("days");
    this.u = this.s.getStringExtra("paidAmount");
    this.v = this.s.getStringExtra("balanceAmount");
    this.w = this.s.getStringExtra("totalAmount");
    this.x = this.s.getStringExtra("perKmRateCharge");
    this.y = this.s.getStringExtra("nightHalt");
    this.z = this.s.getStringExtra("userId");
    this.A = this.s.getStringExtra("carName");
    this.B = this.s.getStringExtra("pickupCity");
    this.C = this.s.getStringExtra("pickupDate");
    this.D = this.s.getStringExtra("pickupTime");
    this.E = this.s.getStringExtra("tripTypeOption");
    this.F = this.s.getStringExtra("userIPAddress");
    this.G = this.s.getStringExtra("travelTypeOption");
    this.H = this.s.getStringExtra("cars");
    this.M = this.s.getIntExtra("seatingCapacity", 0);
    this.O = this.s.getStringExtra("localHourRate");
    this.P = this.s.getStringExtra("extraHourRate");
    this.Q = this.s.getStringExtra("provName");
    this.R = this.s.getStringExtra("carId");
    this.S = this.s.getStringExtra("natureId");
    this.T = this.s.getStringExtra("approxDistance");
    this.U = this.s.getStringExtra("scootTime");
    this.V = this.s.getStringExtra("pickupCityCode");
    this.W = this.s.getStringExtra("pickupDateTime");
    this.u = this.w;
    paramBundle = ParseUser.getCurrentUser();
    this.X = ((EditText)findViewById(2131755263));
    this.Y = ((EditText)findViewById(2131755264));
    this.Z = ((EditText)findViewById(2131755267));
    this.aa = ((EditText)findViewById(2131755270));
    this.ac = ((CheckBox)findViewById(2131755279));
    this.ad = ((AutoCompleteTextView)findViewById(2131755275));
    this.ae = ((Button)findViewById(2131755259));
    this.ab = ((EditText)findViewById(2131755273));
    this.ae.setText("Pay ₹ " + this.w);
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).clearFlags(67108864);
      ((Window)localObject).setStatusBarColor(c.c(this, 2131689628));
    }
    Object localObject = (Toolbar)findViewById(2131755210);
    a((Toolbar)localObject);
    android.support.v7.a.a locala = h();
    if (locala != null)
    {
      locala.c(false);
      locala.b(true);
      locala.a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label806;
      }
      locala.a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      localObject = (TextView)((Toolbar)localObject).findViewById(2131755818);
      ((TextView)localObject).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      ((TextView)localObject).setText("Your Details");
      this.ad.setText(this.an.getString("yourLocation", "Enter Your Address"));
      if (paramBundle != null)
      {
        this.I = paramBundle.getString("firstName");
        this.J = paramBundle.getString("lastName");
        this.X.setText(this.I);
        this.Y.setText(this.J);
        this.Z.setText(paramBundle.getEmail());
        this.aa.setText(paramBundle.getString("phone"));
      }
      this.ae.setOnClickListener(new bj(this, paramBundle));
      this.ad.setThreshold(1);
      this.ad.addTextChangedListener(new bl(this));
      return;
      label806:
      locala.a(c.a(this, 2130837795));
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
  
  public void onStart()
  {
    super.onStart();
    this.m.e();
  }
  
  public void onStop()
  {
    super.onStop();
    if (this.m.i()) {
      this.m.g();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\LocalCarRentalPrePaymentPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */