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

public class CarRentalPrePaymentPage
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
  private String M;
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
  private String X;
  private String Y;
  private String Z;
  private String aa;
  private EditText ab;
  private EditText ac;
  private EditText ad;
  private EditText ae;
  private TextView af;
  private TextView ag;
  private EditText ah;
  private CheckBox ai;
  private AutoCompleteTextView aj;
  private Button ak;
  private String al;
  private boolean am = false;
  private boolean an = false;
  private boolean ao = false;
  private boolean ap = false;
  private boolean aq = false;
  private boolean ar = true;
  private Location as;
  private String at;
  private SharedPreferences au;
  private ProgressDialog av;
  protected q m;
  bg n;
  be o;
  ParseObject p = null;
  private Intent r;
  private String s;
  private String t;
  private String u;
  private String v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  static
  {
    if (!CarRentalPrePaymentPage.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      q = bool;
      return;
    }
  }
  
  private void a(String paramString, AutoCompleteTextView paramAutoCompleteTextView)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this, 2131034137);
    localAnimation.setAnimationListener(new bd(this, paramAutoCompleteTextView, paramString));
    paramAutoCompleteTextView.startAnimation(localAnimation);
  }
  
  private void a(String paramString, EditText paramEditText)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this, 2131034137);
    localAnimation.setAnimationListener(new bc(this, paramEditText, paramString));
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
    //   5: new 232	java/net/URL
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 235	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: invokevirtual 239	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   16: checkcast 241	java/net/HttpURLConnection
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual 244	java/net/HttpURLConnection:connect	()V
    //   24: aload_1
    //   25: invokevirtual 248	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   28: astore 4
    //   30: new 250	java/io/BufferedReader
    //   33: dup
    //   34: new 252	java/io/InputStreamReader
    //   37: dup
    //   38: aload 4
    //   40: invokespecial 255	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   43: invokespecial 258	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore_3
    //   47: new 260	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 261	java/lang/StringBuilder:<init>	()V
    //   54: astore_2
    //   55: aload_3
    //   56: invokevirtual 265	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +41 -> 104
    //   66: aload_2
    //   67: aload 5
    //   69: invokevirtual 269	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: goto -18 -> 55
    //   76: astore_3
    //   77: ldc_w 271
    //   80: astore_2
    //   81: aload_3
    //   82: invokevirtual 274	java/lang/Exception:printStackTrace	()V
    //   85: getstatic 96	com/sagar/taxiapp/CarRentalPrePaymentPage:q	Z
    //   88: ifne +55 -> 143
    //   91: aload 4
    //   93: ifnonnull +50 -> 143
    //   96: new 276	java/lang/AssertionError
    //   99: dup
    //   100: invokespecial 277	java/lang/AssertionError:<init>	()V
    //   103: athrow
    //   104: aload_2
    //   105: invokevirtual 280	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: astore_2
    //   109: aload_3
    //   110: invokevirtual 283	java/io/BufferedReader:close	()V
    //   113: getstatic 96	com/sagar/taxiapp/CarRentalPrePaymentPage:q	Z
    //   116: ifne +16 -> 132
    //   119: aload 4
    //   121: ifnonnull +11 -> 132
    //   124: new 276	java/lang/AssertionError
    //   127: dup
    //   128: invokespecial 277	java/lang/AssertionError:<init>	()V
    //   131: athrow
    //   132: aload 4
    //   134: invokevirtual 286	java/io/InputStream:close	()V
    //   137: aload_1
    //   138: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   141: aload_2
    //   142: areturn
    //   143: aload 4
    //   145: invokevirtual 286	java/io/InputStream:close	()V
    //   148: aload_1
    //   149: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   152: aload_2
    //   153: areturn
    //   154: astore_3
    //   155: aconst_null
    //   156: astore 4
    //   158: aload_2
    //   159: astore_1
    //   160: aload_3
    //   161: astore_2
    //   162: getstatic 96	com/sagar/taxiapp/CarRentalPrePaymentPage:q	Z
    //   165: ifne +16 -> 181
    //   168: aload 4
    //   170: ifnonnull +11 -> 181
    //   173: new 276	java/lang/AssertionError
    //   176: dup
    //   177: invokespecial 277	java/lang/AssertionError:<init>	()V
    //   180: athrow
    //   181: aload 4
    //   183: invokevirtual 286	java/io/InputStream:close	()V
    //   186: aload_1
    //   187: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   190: aload_2
    //   191: athrow
    //   192: astore_2
    //   193: aconst_null
    //   194: astore 4
    //   196: goto -34 -> 162
    //   199: astore_2
    //   200: goto -38 -> 162
    //   203: astore_2
    //   204: goto -42 -> 162
    //   207: astore_3
    //   208: aconst_null
    //   209: astore 5
    //   211: ldc_w 271
    //   214: astore_2
    //   215: aload 4
    //   217: astore_1
    //   218: aload 5
    //   220: astore 4
    //   222: goto -141 -> 81
    //   225: astore_3
    //   226: aconst_null
    //   227: astore 4
    //   229: ldc_w 271
    //   232: astore_2
    //   233: goto -152 -> 81
    //   236: astore_3
    //   237: goto -156 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	CarRentalPrePaymentPage
    //   0	240	1	paramString	String
    //   1	190	2	localObject1	Object
    //   192	1	2	localObject2	Object
    //   199	1	2	localObject3	Object
    //   203	1	2	localObject4	Object
    //   214	19	2	str1	String
    //   46	10	3	localBufferedReader	java.io.BufferedReader
    //   76	34	3	localException1	Exception
    //   154	7	3	localObject5	Object
    //   207	1	3	localException2	Exception
    //   225	1	3	localException3	Exception
    //   236	1	3	localException4	Exception
    //   3	225	4	localObject6	Object
    //   59	160	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	55	76	java/lang/Exception
    //   55	61	76	java/lang/Exception
    //   66	73	76	java/lang/Exception
    //   104	109	76	java/lang/Exception
    //   5	20	154	finally
    //   20	30	192	finally
    //   30	55	199	finally
    //   55	61	199	finally
    //   66	73	199	finally
    //   104	109	199	finally
    //   109	113	199	finally
    //   81	85	203	finally
    //   5	20	207	java/lang/Exception
    //   20	30	225	java/lang/Exception
    //   109	113	236	java/lang/Exception
  }
  
  private void o()
  {
    View localView = getCurrentFocus();
    if (localView != null) {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
    this.aj.clearFocus();
  }
  
  public void a(Bundle paramBundle)
  {
    try
    {
      this.as = i.b.a(this.m);
      return;
    }
    catch (SecurityException paramBundle) {}
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(b paramb)
  {
    HashMap localHashMap = new HashMap();
    if (this.S.equalsIgnoreCase("clear Car rental"))
    {
      localHashMap.put("tripId", this.at);
      localHashMap.put("userIPAddress", this.I);
      localHashMap.put("userId", this.B);
      localHashMap.put("paidAmount", this.v);
      localHashMap.put("scootTime", this.V);
      com.scootapp.tv.a.a.a(this, localHashMap, this.S, paramb, "intercity");
    }
    do
    {
      return;
      if (this.S.equalsIgnoreCase("makson"))
      {
        localHashMap.put("mobileNum", this.P);
        localHashMap.put("email", this.O);
        localHashMap.put("firstName", this.M);
        localHashMap.put("lastName", this.N);
        localHashMap.put("pickupAddress", this.R);
        localHashMap.put("pickupDate", this.F);
        localHashMap.put("pickupTime", this.G);
        localHashMap.put("pickupCity", this.D);
        localHashMap.put("dropCity", this.E);
        localHashMap.put("days", this.s);
        localHashMap.put("travelTypeOption", this.J);
        localHashMap.put("tripTypeOption", this.H);
        localHashMap.put("carId", this.U);
        localHashMap.put("natureId", this.T);
        localHashMap.put("totalAmount", this.v);
        localHashMap.put("carName", this.C);
        localHashMap.put("approxDistance", this.w);
        localHashMap.put("scootTime", this.V);
        com.scootapp.tv.a.a.a(this, localHashMap, this.S, paramb, "intercity");
        return;
      }
      if (this.S.equalsIgnoreCase("one way cabs"))
      {
        localHashMap.put("mobileNum", this.P);
        localHashMap.put("email", this.O);
        localHashMap.put("firstName", this.M);
        localHashMap.put("lastName", this.N);
        localHashMap.put("pickupAddress", this.R);
        localHashMap.put("pickupDate", this.F);
        localHashMap.put("pickupTime", this.G);
        localHashMap.put("pickupCity", this.D);
        localHashMap.put("dropCity", this.E);
        localHashMap.put("carName", this.C);
        localHashMap.put("approxDistance", this.w);
        localHashMap.put("totalAmount", this.v);
        localHashMap.put("scootTime", this.V);
        com.scootapp.tv.a.a.a(this, localHashMap, this.S, paramb, "intercity");
        return;
      }
      if (this.S.equalsIgnoreCase("roder"))
      {
        localHashMap.put("phoneno", this.P);
        localHashMap.put("email", this.O);
        localHashMap.put("firstName", this.M);
        localHashMap.put("lastName", this.N);
        localHashMap.put("pickupAddress", this.R);
        localHashMap.put("pickupDate", this.F);
        localHashMap.put("pickupTime", this.G);
        localHashMap.put("pickupCity", this.D);
        localHashMap.put("dropCity", this.E);
        localHashMap.put("days", this.s);
        localHashMap.put("travelTypeOption", this.J);
        localHashMap.put("tripTypeOption", this.H);
        localHashMap.put("totalAmount", this.v);
        localHashMap.put("approxDistance", this.w);
        localHashMap.put("scootTime", this.V);
        localHashMap.put("bookingId", this.W);
        localHashMap.put("preference", this.X);
        localHashMap.put("carName", this.C);
        com.scootapp.tv.a.a.a(this, localHashMap, this.S, paramb, "intercity");
        return;
      }
    } while (!this.S.equalsIgnoreCase("savaari"));
    localHashMap.put("mobileNum", this.P);
    localHashMap.put("email", this.O);
    localHashMap.put("firstName", this.M);
    localHashMap.put("lastName", this.N);
    localHashMap.put("pickupAddress", this.R);
    localHashMap.put("pickupDate", this.F);
    localHashMap.put("pickupTime", this.G);
    localHashMap.put("pickupCity", this.D);
    localHashMap.put("dropCity", this.E);
    localHashMap.put("days", this.s);
    localHashMap.put("travelTypeOption", this.J);
    localHashMap.put("tripTypeOption", this.H);
    localHashMap.put("totalAmount", this.v);
    localHashMap.put("approxDistance", this.w);
    localHashMap.put("scootTime", this.V);
    localHashMap.put("pickupCityCode", this.Y);
    localHashMap.put("dropCityCode", this.Z);
    localHashMap.put("pickupDateTime", this.aa);
    localHashMap.put("carId", this.U);
    com.scootapp.tv.a.a.a(this, localHashMap, this.S, paramb, "intercity");
  }
  
  public void a(HashMap<String, Object> paramHashMap)
  {
    ParseCloud.callFunctionInBackground("payuTransctionId", paramHashMap, new bb(this));
  }
  
  public void c_(int paramInt)
  {
    this.m.e();
  }
  
  public void l()
  {
    this.av.dismiss();
  }
  
  public void m()
  {
    this.av.dismiss();
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
          break label512;
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
              break label524;
            }
            paramInt1 = i;
          }
        }
        catch (Exception localException)
        {
          Object localObject3;
          Toast.makeText(this, paramIntent, 1).show();
          return;
        }
        paramIntent = (Intent)localObject1;
        if (!((String)localObject3).equals("failure")) {
          break label524;
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
      localObject3 = new b();
      paramIntent = (Intent)localObject1;
      ((b)localObject3).e(this.v);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).f(this.C);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).d(this.w);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).a(String.format("%s %s", new Object[] { this.F, this.V }));
      paramIntent = (Intent)localObject1;
      ((b)localObject3).b(this.R);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).c(this.at);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).g(this.P);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).h(this.I);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).i(this.B);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).j(((JSONObject)localObject2).optString("id"));
      paramIntent = (Intent)localObject1;
      ((b)localObject3).k(this.L);
      paramIntent = (Intent)localObject1;
      ((b)localObject3).l(this.S);
      paramIntent = (Intent)localObject1;
      a((b)localObject3);
      return;
      paramIntent = localException;
      Toast.makeText(this, localException, 1).show();
      return;
      label512:
      Toast.makeText(this, "Cab Booking Cancelled", 1).show();
      return;
      label524:
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
    this.au = getSharedPreferences("shareddata", 0);
    this.r = getIntent();
    this.s = this.r.getStringExtra("days");
    this.t = this.r.getStringExtra("paidAmount");
    this.u = this.r.getStringExtra("balanceAmount");
    this.v = this.r.getStringExtra("totalAmount");
    this.w = this.r.getStringExtra("approxDistance");
    this.x = this.r.getStringExtra("minimumChargedDistance");
    this.y = this.r.getStringExtra("perKmRateCharge");
    this.z = this.r.getStringExtra("driverCharges");
    this.A = this.r.getStringExtra("nightHalt");
    this.B = this.r.getStringExtra("userId");
    this.C = this.r.getStringExtra("carName");
    this.D = this.r.getStringExtra("pickupCity");
    this.E = this.r.getStringExtra("dropCity");
    this.F = this.r.getStringExtra("pickupDate");
    this.G = this.r.getStringExtra("pickupTime");
    this.H = this.r.getStringExtra("tripTypeOption");
    this.I = this.r.getStringExtra("userIPAddress");
    this.J = this.r.getStringExtra("travelTypeOption");
    this.K = this.r.getStringExtra("onewayPerKmRate");
    this.L = this.r.getStringExtra("cars");
    this.Q = this.r.getStringExtra("seatingCapacity");
    this.S = this.r.getStringExtra("provName");
    this.T = this.r.getStringExtra("natureId");
    this.U = this.r.getStringExtra("carId");
    this.V = this.r.getStringExtra("scootTime");
    this.W = this.r.getStringExtra("bookingId");
    this.X = this.r.getStringExtra("preference");
    this.Y = this.r.getStringExtra("pickupCityCode");
    this.Z = this.r.getStringExtra("dropCityCode");
    this.aa = this.r.getStringExtra("pickupDateTime");
    this.t = this.v;
    paramBundle = ParseUser.getCurrentUser();
    this.ab = ((EditText)findViewById(2131755263));
    this.ac = ((EditText)findViewById(2131755264));
    this.ad = ((EditText)findViewById(2131755267));
    this.ae = ((EditText)findViewById(2131755270));
    this.ai = ((CheckBox)findViewById(2131755279));
    this.aj = ((AutoCompleteTextView)findViewById(2131755275));
    this.ak = ((Button)findViewById(2131755259));
    this.af = ((TextView)findViewById(2131755277));
    this.ag = ((TextView)findViewById(2131755278));
    this.ah = ((EditText)findViewById(2131755273));
    Object localObject;
    android.support.v7.a.a locala;
    if (this.S.equalsIgnoreCase("one way cabs"))
    {
      this.ak.setText("Confirm Booking");
      this.af.setText("Payment Policy:");
      this.ag.setText(2131296583);
      this.ai.setText("I accept the above listed payment policy.");
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = getWindow();
        ((Window)localObject).addFlags(Integer.MIN_VALUE);
        ((Window)localObject).clearFlags(67108864);
        ((Window)localObject).setStatusBarColor(c.c(this, 2131689628));
      }
      localObject = (Toolbar)findViewById(2131755210);
      a((Toolbar)localObject);
      locala = h();
      if (locala != null)
      {
        locala.c(false);
        locala.b(true);
        locala.a(true);
        if (Build.VERSION.SDK_INT < 21) {
          break label992;
        }
        locala.a(getResources().getDrawable(2130837795, null));
      }
    }
    for (;;)
    {
      localObject = (TextView)((Toolbar)localObject).findViewById(2131755818);
      ((TextView)localObject).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      ((TextView)localObject).setText("Your Details");
      this.aj.setText(this.au.getString("yourLocation", "Enter Your Address"));
      if (paramBundle != null)
      {
        this.M = paramBundle.getString("firstName");
        this.N = paramBundle.getString("lastName");
        this.ab.setText(this.M);
        this.ac.setText(this.N);
        this.ad.setText(paramBundle.getEmail());
        this.ae.setText(paramBundle.getString("phone"));
      }
      this.ak.setOnClickListener(new ay(this, paramBundle));
      this.aj.setThreshold(1);
      this.aj.addTextChangedListener(new ba(this));
      return;
      if (this.S.equalsIgnoreCase("roder")) {
        this.ag.setText(2131296595);
      }
      this.ak.setText("Pay ₹ " + this.v);
      this.ai.setText("I accept the above listed cancellation policy.");
      break;
      label992:
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\CarRentalPrePaymentPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */