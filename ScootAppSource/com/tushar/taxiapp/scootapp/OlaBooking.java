package com.tushar.taxiapp.scootapp;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.a.ah;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.analytics.l;
import com.parse.ParseCloud;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;
import com.sagar.taxiapp.beans.OlaBookingObject;
import com.sagar.taxiapp.ds;
import com.scootapp.tv.receivers.OlaTrackRideReceiver;
import com.scootapp.tv.services.OlaBookingTrackingService;
import java.util.HashMap;
import org.json.JSONObject;

@SuppressLint({"NewApi"})
public class OlaBooking
  extends ah
{
  private IntentFilter A;
  private Long B;
  private int C = 0;
  private Dialog D;
  boolean m;
  private TextView n;
  private ProgressDialog o;
  private int p = 0;
  private String q;
  private String r;
  private String s;
  private String t;
  private SharedPreferences u;
  private String v = "N/A";
  private String w;
  private BroadcastReceiver x;
  private ProgressBar y;
  private Button z;
  
  private void a(String paramString)
  {
    com.b.a.a.r.a(this).a(new aa(this, 1, "https://devapi.olacabs.com/v1/bookings/cancel", new x(this, paramString), new z(this), paramString));
  }
  
  private void a(JSONObject paramJSONObject)
  {
    this.u = getSharedPreferences("shareddata", 0);
    Object localObject = new OlaBookingObject();
    ((OlaBookingObject)localObject).a(paramJSONObject.optString("booking_id"));
    ((OlaBookingObject)localObject).f(paramJSONObject.optString("car_model"));
    ((OlaBookingObject)localObject).e(this.u.getString("selectedCabCompany", ""));
    ((OlaBookingObject)localObject).g("N/A");
    ((OlaBookingObject)localObject).c(paramJSONObject.optString("date"));
    ((OlaBookingObject)localObject).d(paramJSONObject.optString("time"));
    ((OlaBookingObject)localObject).a(0);
    ((OlaBookingObject)localObject).a(this.u.getFloat("selectedCabSurcharge", 1.0F));
    ((OlaBookingObject)localObject).i(this.u.getString("yourLocation", "N/A"));
    ((OlaBookingObject)localObject).b(this.u.getString("yourDestination", "N/A"));
    ((OlaBookingObject)localObject).h("IN_PROGRESS");
    com.scootapp.tv.b.c.a((OlaBookingObject)localObject);
    localObject = new ParseObject("OlaRideBookings");
    ((ParseObject)localObject).put("booking_id", paramJSONObject.optString("booking_id"));
    ((ParseObject)localObject).put("model", paramJSONObject.optString("car_model"));
    ((ParseObject)localObject).put("date", paramJSONObject.optString("date"));
    ((ParseObject)localObject).put("time", paramJSONObject.optString("time"));
    ((ParseObject)localObject).put("surcharge", Float.valueOf(this.u.getFloat("selectedCabSurcharge", 1.0F)));
    ((ParseObject)localObject).put("location", this.u.getString("yourLocation", "N/A"));
    ((ParseObject)localObject).put("destination", this.u.getString("yourDestination", "N/A"));
    ((ParseObject)localObject).put("email", this.v);
    ((ParseObject)localObject).put("providerName", this.u.getString("selectedCabCompany", ""));
    ((ParseObject)localObject).put("distance", "N/A");
    ((ParseObject)localObject).put("deviceType", "ANDROID");
    ((ParseObject)localObject).saveInBackground(new r(this, (ParseObject)localObject));
    localObject = new Intent(getApplicationContext(), OlaTrackRideReceiver.class);
    ((Intent)localObject).putExtra(com.scootapp.tv.a.z.s, paramJSONObject.optString("booking_id"));
    paramJSONObject = PendingIntent.getBroadcast(getApplicationContext(), 1, (Intent)localObject, 134217728);
    ((AlarmManager)getSystemService("alarm")).setInexactRepeating(1, System.currentTimeMillis() + 5000L, 5000L, paramJSONObject);
  }
  
  private void o()
  {
    Intent localIntent = new Intent(this, OlaBookingTrackingService.class);
    localIntent.putExtra(com.scootapp.tv.a.z.s, getSharedPreferences("olaBookingDetails", 0).getString("booking_id", "null"));
    startService(localIntent);
  }
  
  public void finish()
  {
    super.finish();
  }
  
  public void l()
  {
    ((ApplicationTaxi)getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Book Cab Clicked").a());
    this.w = this.n.getText().toString();
    if (!this.w.equalsIgnoreCase("auto")) {}
    for (this.o = ProgressDialog.show(this, "", "  Booking Your Cab...");; this.o = ProgressDialog.show(this, "", "  Please wait..."))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("lat", this.q);
      localHashMap.put("lng", this.r);
      localHashMap.put("droplat", this.s);
      localHashMap.put("droplng", this.t);
      localHashMap.put("category", this.w);
      localHashMap.put("authorization", this.u.getString("access_token", "null"));
      ParseCloud.callFunctionInBackground("olaCabBooking", localHashMap, new t(this));
      return;
    }
  }
  
  public void m()
  {
    ParseUser localParseUser = ParseUser.getCurrentUser();
    int i;
    if ((localParseUser != null) && (this.m))
    {
      localObject = ParseQuery.getQuery("olaSavedMoney");
      i = getSharedPreferences("shareddata", 0).getInt("percentSaved", 0);
      if (localObject != null)
      {
        ((ParseQuery)localObject).whereEqualTo("emailId", localParseUser.getEmail());
        ((ParseQuery)localObject).findInBackground(new u(this, i, localParseUser));
      }
    }
    else
    {
      return;
    }
    Object localObject = new ParseObject("olaSavedMoney");
    ((ParseObject)localObject).put("emailId", localParseUser.getEmail());
    ((ParseObject)localObject).put("percentSaved", Integer.valueOf(i));
    ((ParseObject)localObject).saveInBackground();
  }
  
  public void n()
  {
    this.o.dismiss();
    this.D = new Dialog(this);
    this.D.requestWindowFeature(1);
    this.D.setContentView(2130968625);
    this.D.setCanceledOnTouchOutside(false);
    this.D.show();
    this.C = 0;
    this.y = ((ProgressBar)this.D.findViewById(2131755352));
    this.z = ((Button)this.D.findViewById(2131755354));
    this.y.setProgressDrawable(getResources().getDrawable(2130837884));
    this.y.setProgress(this.C);
    this.B = Long.valueOf(System.currentTimeMillis());
    this.z.setOnClickListener(new v(this));
    new w(this, 50000L, 1000L).start();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((103 == paramInt1) && (paramInt2 == -1)) {
      l();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968738);
    paramBundle = ParseUser.getCurrentUser();
    if (paramBundle != null) {
      this.v = paramBundle.getString("username");
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(android.support.v4.b.c.c(this, 2131689628));
    }
    paramBundle = ds.a(this, "fonts/OpenSans-Regular.ttf");
    Object localObject1 = (Toolbar)findViewById(2131755145);
    a((Toolbar)localObject1);
    Object localObject2 = h();
    label377:
    Button localButton;
    TextView localTextView2;
    if (localObject2 != null)
    {
      ((android.support.v7.a.a)localObject2).c(false);
      ((android.support.v7.a.a)localObject2).b(true);
      ((android.support.v7.a.a)localObject2).a(true);
      if (Build.VERSION.SDK_INT >= 21) {
        ((android.support.v7.a.a)localObject2).a(getResources().getDrawable(2130837795, null));
      }
    }
    else
    {
      localObject1 = (TextView)((Toolbar)localObject1).findViewById(2131755818);
      ((TextView)localObject1).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      ((TextView)localObject1).setText(getResources().getString(2131296464));
      this.u = getSharedPreferences("shareddata", 0);
      this.m = this.u.getBoolean("destEntered", false);
      localObject1 = this.u.getString("selectedCabCompany", "");
      ((CardView)findViewById(2131755309)).setCardBackgroundColor(com.scootapp.tv.a.a.a(this, (String)localObject1));
      this.A = new IntentFilter();
      this.A.addAction("BOOKING_UPDATED");
      this.q = this.u.getString("enteredLat", "null");
      this.r = this.u.getString("enteredLng", "null");
      this.s = this.u.getString("destLat", "null");
      this.t = this.u.getString("destLng", "null");
      ((TextView)findViewById(2131755688)).setTypeface(paramBundle);
      localObject1 = (TextView)findViewById(2131755693);
      ((TextView)localObject1).setTypeface(paramBundle);
      if (this.m) {
        break label661;
      }
      ((TextView)localObject1).setText("Rate");
      ((TextView)findViewById(2131755695)).setTypeface(paramBundle);
      ((TextView)findViewById(2131755690)).setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755691));
      localObject1 = (TextView)findViewById(2131755692);
      localObject2 = (TextView)findViewById(2131755694);
      localButton = (Button)findViewById(2131755697);
      localButton.setTypeface(paramBundle);
      TextView localTextView1 = (TextView)findViewById(2131755689);
      localTextView2 = (TextView)findViewById(2131755696);
      if (this.u.getString("selectedCabType", "N/A").equalsIgnoreCase("auto")) {
        localButton.setText("Book Auto");
      }
      this.n.setText(this.u.getString("selectedCabType", "N/A"));
      ((TextView)localObject1).setText(this.u.getString("selectedCabEta", "N/A"));
      ((TextView)localObject2).setText(this.u.getString("selectedCabRate", "N/A"));
      localTextView1.setText(this.u.getString("yourLocation", "N/A"));
      localTextView1.setTypeface(paramBundle);
      if (this.u.getFloat("selectedCabSurcharge", 1.0F) != 1.0D) {
        break label671;
      }
      localTextView2.setText("Not Present");
    }
    for (;;)
    {
      localButton.setOnClickListener(new q(this));
      this.x = new s(this);
      return;
      ((android.support.v7.a.a)localObject2).a(android.support.v4.b.c.a(this, 2130837795));
      break;
      label661:
      ((TextView)localObject1).setText("Fare Estimate");
      break label377;
      label671:
      localTextView2.setText("" + this.u.getFloat("selectedCabSurcharge", 1.0F) + "x");
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
  
  protected void onPause()
  {
    try
    {
      unregisterReceiver(this.x);
      super.onPause();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  protected void onResume()
  {
    try
    {
      registerReceiver(this.x, this.A);
      super.onResume();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onStart()
  {
    try
    {
      registerReceiver(this.x, this.A);
      super.onStart();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\OlaBooking.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */