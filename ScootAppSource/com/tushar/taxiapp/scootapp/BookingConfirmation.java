package com.tushar.taxiapp.scootapp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.b.a.a.r;
import com.b.a.u;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sagar.taxiapp.ds;
import com.scootapp.tv.a.z;
import com.scootapp.tv.services.OlaBookingTrackingService;

@SuppressLint({"NewApi"})
public class BookingConfirmation
  extends android.support.v7.a.ah
  implements com.google.android.gms.maps.e
{
  private SharedPreferences A;
  ProgressDialog m;
  private TextView n;
  private String o = "Changed my mind";
  private Intent p;
  private View q;
  private BroadcastReceiver r;
  private IntentFilter s;
  private com.google.android.gms.maps.c t;
  private LatLng u;
  private com.google.android.gms.maps.model.d v = new com.google.android.gms.maps.model.d();
  private FloatingActionButton w;
  private SharedPreferences x;
  private boolean y;
  private SharedPreferences z;
  
  private String a(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    paramLatLng1 = "origin=" + paramLatLng1.a + "," + paramLatLng1.b;
    paramLatLng2 = "destination=" + paramLatLng2.a + "," + paramLatLng2.b;
    paramLatLng1 = paramLatLng1 + "&" + paramLatLng2 + "&" + "sensor=false";
    return "https://maps.googleapis.com/maps/api/directions/" + "json" + "?" + paramLatLng1;
  }
  
  private void a(com.sagar.taxiapp.beans.o paramo)
  {
    SharedPreferences localSharedPreferences = getSharedPreferences("latestOlaRideFeedBackRecord", 0);
    localSharedPreferences.getString("olaBookingId", "");
    if (paramo != null) {
      String.format("Distance travelled : %s %sTotal Amount : %s%d", new Object[] { paramo.c(), System.getProperty("line.separator"), "₹ ", Integer.valueOf(paramo.b()) });
    }
    try
    {
      localSharedPreferences.edit().putInt("lastRideAmount", paramo.b()).apply();
      if (localSharedPreferences.getBoolean("showFeedbackScreen", false)) {
        startActivity(new Intent(this, RideCompletionActivity.class));
      }
      finish();
      return;
    }
    catch (NullPointerException paramo)
    {
      for (;;)
      {
        localSharedPreferences.edit().putInt("lastRideAmount", -10).apply();
      }
    }
  }
  
  private void l()
  {
    if (android.support.v4.app.a.a(this, "android.permission.CALL_PHONE"))
    {
      Log.i("Scoot", "Displaying location permission rationale to provide additional context.");
      Snackbar.a(this.q, 2131296473, -2).a(2131296578, new b(this)).a();
      return;
    }
    android.support.v4.app.a.a(this, com.scootapp.tv.a.a.c, 102);
  }
  
  private void m()
  {
    if (com.scootapp.tv.a.a.b(this))
    {
      Object localObject;
      if (this.t != null)
      {
        this.t.a();
        MarkerOptions localMarkerOptions;
        if ((!"".equals(this.x.getString("enteredLat", ""))) || (!"".equals(this.x.getString("enteredLng", ""))))
        {
          Log.v("Scoot", "Lat -- " + Double.parseDouble(this.x.getString("enteredLat", "")) + " -- Lng -- " + Double.parseDouble(this.x.getString("enteredLng", "")));
          this.u = new LatLng(Double.parseDouble(this.x.getString("enteredLat", "")), Double.parseDouble(this.x.getString("enteredLng", "")));
          localObject = new MarkerOptions().a(this.u);
          ((MarkerOptions)localObject).a(com.google.android.gms.maps.model.b.a(2130903051));
          ((MarkerOptions)localObject).a("Your Location");
          this.t.a((MarkerOptions)localObject);
          this.v.a(this.u);
          if ((!"".equals(this.z.getString("destLat", ""))) || (!"".equals(this.z.getString("destLng", ""))))
          {
            localObject = new LatLng(Double.parseDouble(this.z.getString("destLat", "")), Double.parseDouble(this.z.getString("destLng", "")));
            localMarkerOptions = new MarkerOptions().a((LatLng)localObject);
            localMarkerOptions.a(com.google.android.gms.maps.model.b.a(2130903049));
            localMarkerOptions.a("Your Destination");
            this.t.a(localMarkerOptions);
            this.v.a(this.u);
            new o(this, null).execute(new String[] { a(this.u, (LatLng)localObject), "2131689524" });
          }
        }
        if ((!"".equals(this.x.getString("driverLat", ""))) || (!"".equals(this.x.getString("driverLng", ""))))
        {
          Log.v("Scoot", "Driver Lat -- " + Double.parseDouble(this.x.getString("driverLat", "")) + " -- Lng -- " + Double.parseDouble(this.x.getString("driverLng", "")));
          localObject = new LatLng(Double.parseDouble(this.x.getString("driverLat", "")), Double.parseDouble(this.x.getString("driverLng", "")));
          localMarkerOptions = new MarkerOptions().a((LatLng)localObject);
          localMarkerOptions.a(com.google.android.gms.maps.model.b.a(2130903050));
          localMarkerOptions.a("Driver Location");
          this.t.a(localMarkerOptions);
          this.v.a((LatLng)localObject);
          Log.v("Scoot", "Is Ride Started " + this.y);
          if (!this.y) {
            break label657;
          }
          this.t.a(com.google.android.gms.maps.b.a((LatLng)localObject));
        }
      }
      return;
      label657:
      new o(this, null).execute(new String[] { a(this.u, (LatLng)localObject), "2131689480" });
      return;
    }
    Toast.makeText(this, "You do not have an active Internet connection", 1).show();
  }
  
  private void n()
  {
    Log.v("Scoot", "Starting Tracking Service from " + BookingConfirmation.class.getName());
    Intent localIntent = new Intent(getApplicationContext(), OlaBookingTrackingService.class);
    localIntent.putExtra(z.s, getSharedPreferences("olaBookingDetails", 0).getString("booking_id", ""));
    startService(localIntent);
  }
  
  public void a(com.google.android.gms.maps.c paramc)
  {
    this.t = paramc;
    try
    {
      this.t.a(true);
      m();
      return;
    }
    catch (SecurityException paramc)
    {
      for (;;) {}
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    u localu = r.a(this);
    String str = this.x.getString("booking_id", "null");
    Dialog localDialog = new Dialog(this);
    localDialog.requestWindowFeature(1);
    localDialog.setContentView(2130968635);
    Object localObject1 = (TextView)localDialog.findViewById(2131755401);
    Object localObject2 = (TextView)localDialog.findViewById(2131755407);
    ((TextView)localObject1).setText(paramString1);
    ((TextView)localObject2).setText(paramString2);
    localObject1 = (RadioButton)localDialog.findViewById(2131755402);
    localObject2 = (RadioButton)localDialog.findViewById(2131755405);
    RadioButton localRadioButton1 = (RadioButton)localDialog.findViewById(2131755408);
    RadioButton localRadioButton2 = (RadioButton)localDialog.findViewById(2131755411);
    ((RadioButton)localObject1).setTag(paramString1);
    localRadioButton1.setTag(paramString2);
    paramString1 = (Button)localDialog.findViewById(2131755412);
    paramString2 = (Button)localDialog.findViewById(2131755413);
    ((RadioButton)localObject1).setOnCheckedChangeListener(new e(this, (RadioButton)localObject2, localRadioButton1, localRadioButton2, paramString2));
    ((RadioButton)localObject2).setOnCheckedChangeListener(new f(this, (RadioButton)localObject1, localRadioButton1, localRadioButton2, paramString2));
    localRadioButton1.setOnCheckedChangeListener(new g(this, (RadioButton)localObject1, (RadioButton)localObject2, localRadioButton2, paramString2));
    localRadioButton2.setOnCheckedChangeListener(new h(this, (RadioButton)localObject1, (RadioButton)localObject2, localRadioButton1, paramString2));
    paramString1.setOnClickListener(new i(this, localDialog));
    paramString2.setOnClickListener(new j(this, localDialog, (RadioButton)localObject1, (RadioButton)localObject2, localRadioButton1, localRadioButton2, str, localu));
    localDialog.show();
  }
  
  public void finish()
  {
    super.finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968629);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(android.support.v4.b.c.c(this, 2131689628));
    }
    this.q = findViewById(2131755340);
    paramBundle = ds.a(this, "fonts/OpenSans-Regular.ttf");
    Object localObject1 = (Toolbar)findViewById(2131755145);
    a((Toolbar)localObject1);
    Object localObject2 = h();
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
      this.n = ((TextView)((Toolbar)localObject1).findViewById(2131755818));
      this.n.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      this.n.setText(getResources().getString(2131296458));
      this.x = getSharedPreferences("olaBookingDetails", 0);
      this.z = getSharedPreferences("shareddata", 0);
      this.A = getSharedPreferences("olaUser", 0);
      localObject1 = this.z.getString("selectedCabCompany", "");
      ((CardView)findViewById(2131755309)).setCardBackgroundColor(com.scootapp.tv.a.a.a(this, (String)localObject1));
      localObject1 = (Button)findViewById(2131755390);
      localObject2 = (Button)findViewById(2131755389);
      this.n = ((TextView)findViewById(2131755377));
      this.n.setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755375));
      this.n.setTypeface(paramBundle);
      if (!this.x.getString("vehicle_type", "Cab").equalsIgnoreCase("auto")) {
        break label1015;
      }
      this.n = ((TextView)findViewById(2131755381));
      this.n.setText("Auto Number");
      this.n.setTypeface(paramBundle);
      label368:
      this.n = ((TextView)findViewById(2131755385));
      this.n.setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755383));
      this.n.setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755385));
      this.n.setTypeface(paramBundle);
      if (this.x.getString("vehicle_type", "Cab").equalsIgnoreCase("auto"))
      {
        this.n = ((TextView)findViewById(2131755379));
        this.n.setText("Vehicle Type");
        this.n.setTypeface(paramBundle);
      }
      this.n = ((TextView)findViewById(2131755378));
      this.n.setText(this.z.getString("yourLocation", "N/A"));
      this.n.setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755376));
      this.n.setText(this.x.getString("crn", "N/A"));
      this.n.setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755384));
      this.n.setText(this.x.getString("driver_name", "N/A"));
      this.n.setTypeface(paramBundle);
      if (!this.x.getString("vehicle_type", "Cab").equalsIgnoreCase("auto")) {
        break label1040;
      }
      this.n = ((TextView)findViewById(2131755380));
      this.n.setText("Auto");
      this.n.setTypeface(paramBundle);
      label678:
      if (!this.x.getString("vehicle_type", "Cab").equalsIgnoreCase("auto")) {
        break label1087;
      }
      this.n = ((TextView)findViewById(2131755382));
      this.n.setText(this.x.getString("vehicle_number", "N/A"));
      this.n.setTypeface(paramBundle);
    }
    for (;;)
    {
      TextView localTextView = (TextView)findViewById(2131755374);
      localTextView.setText(this.x.getString("eta", "N/A"));
      localTextView.setTypeface(paramBundle);
      this.n = ((TextView)findViewById(2131755386));
      this.n.setText(this.x.getString("driver_number", "N/A"));
      this.n.setTypeface(paramBundle);
      ((Button)localObject1).setTypeface(paramBundle);
      ((Button)localObject2).setTypeface(paramBundle);
      ((Button)localObject1).setOnClickListener(new a(this));
      ((Button)localObject2).setOnClickListener(new c(this));
      this.r = new d(this);
      this.s = new IntentFilter();
      this.s.addAction("BOOKING_UPDATED");
      ((SupportMapFragment)f().a(2131755388)).a(this);
      this.w = ((FloatingActionButton)findViewById(2131755209));
      paramBundle = com.a.a.a.a().a().a(ds.a(this, "fonts/OpenSans-Regular.ttf")).a(android.support.v4.b.c.c(this, 2131689705)).b(30).b().a(this.x.getString("eta", "N/A"), 0);
      this.w.setImageDrawable(paramBundle);
      return;
      ((android.support.v7.a.a)localObject2).a(android.support.v4.b.c.a(this, 2130837795));
      break;
      label1015:
      this.n = ((TextView)findViewById(2131755381));
      this.n.setTypeface(paramBundle);
      break label368;
      label1040:
      this.n = ((TextView)findViewById(2131755380));
      this.n.setText(this.x.getString("car_model", "N/A"));
      this.n.setTypeface(paramBundle);
      break label678;
      label1087:
      this.n = ((TextView)findViewById(2131755382));
      this.n.setText(this.x.getString("cab_number", "N/A"));
      this.n.setTypeface(paramBundle);
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
      unregisterReceiver(this.r);
      super.onPause();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt == 102)
    {
      if (com.scootapp.taxiapp.utils.b.a(paramArrayOfInt))
      {
        new Intent("android.intent.action.CALL").setData(Uri.parse("tel:" + this.n.getText().toString()));
        startActivity(this.p);
        return;
      }
      Snackbar.a(this.q, 2131296586, -1).a();
      return;
    }
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  protected void onResume()
  {
    String str = com.scootapp.tv.b.c.a(this.x.getString("booking_id", "N/A"));
    int i = -1;
    switch (str.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      super.onResume();
      return;
      if (!str.equals("cancelled")) {
        break;
      }
      i = 0;
      break;
      if (!str.equals("COMPLETED")) {
        break;
      }
      i = 1;
      break;
      if (!str.equals("IN_PROGRESS")) {
        break;
      }
      i = 2;
      break;
      Toast.makeText(this, "Your Ride got Cancelled", 1).show();
      finish();
      continue;
      a(com.scootapp.tv.b.c.b(this.x.getString("booking_id", "N/A")));
      continue;
      if (!com.scootapp.tv.a.a.b(this, OlaBookingTrackingService.class.getName())) {
        n();
      }
    }
  }
  
  protected void onStart()
  {
    registerReceiver(this.r, this.s);
    super.onStart();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\BookingConfirmation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */