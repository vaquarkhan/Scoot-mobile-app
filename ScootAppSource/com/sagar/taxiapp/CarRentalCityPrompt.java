package com.sagar.taxiapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.y;
import com.google.android.gms.location.places.f;
import com.google.android.gms.location.places.m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public class CarRentalCityPrompt
  extends ah
  implements s, t
{
  private SharedPreferences A;
  private SharedPreferences.Editor B;
  private y<f> C = new av(this);
  protected q m;
  AdapterView.OnItemClickListener n = new at(this);
  View.OnClickListener o = new au(this);
  private de p;
  private AutoCompleteTextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private LatLngBounds z;
  
  public void a(Bundle paramBundle) {}
  
  public void a(TextView paramTextView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("cityName", paramTextView.getText().toString());
    if (getParent() == null) {
      setResult(-1, localIntent);
    }
    for (;;)
    {
      finish();
      return;
      getParent().setResult(-1, localIntent);
    }
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(String paramString)
  {
    int i = 1;
    int j;
    if ((!paramString.equalsIgnoreCase(this.r.getText().toString())) && (!paramString.equalsIgnoreCase(this.s.getText().toString())) && (!paramString.equalsIgnoreCase(this.t.getText().toString())) && (!paramString.equalsIgnoreCase(this.u.getText().toString())) && (!paramString.equalsIgnoreCase(this.v.getText().toString())) && (!paramString.equalsIgnoreCase(this.w.getText().toString())) && (!paramString.equalsIgnoreCase(this.x.getText().toString())) && (!paramString.equalsIgnoreCase(this.y.getText().toString())))
    {
      j = this.A.getInt("index", 1);
      if (j != 9) {
        break label244;
      }
      this.B.putInt("index", 1).apply();
    }
    for (;;)
    {
      this.B.putString("city" + i, paramString).apply();
      this.B.putInt("index", i + 1).apply();
      return;
      label244:
      i = j;
    }
  }
  
  public void c_(int paramInt) {}
  
  public void l()
  {
    this.r.setText(this.A.getString("city1", "Delhi"));
    this.s.setText(this.A.getString("city2", "Bengaluru"));
    this.t.setText(this.A.getString("city3", "Mumbai"));
    this.u.setText(this.A.getString("city4", "Kolkata"));
    this.v.setText(this.A.getString("city5", "Chennai"));
    this.w.setText(this.A.getString("city6", "Hyderabad"));
    this.x.setText(this.A.getString("city7", "Pune"));
    this.y.setText(this.A.getString("city8", "Kochi"));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.z = new LatLngBounds(new LatLng(9.0251553D, 69.1125379D), new LatLng(30.8961796D, 88.247927D));
    setContentView(2130968606);
    this.A = getSharedPreferences("searchHistory", 0);
    this.B = this.A.edit();
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    paramBundle = (Toolbar)findViewById(2131755210);
    a(paramBundle);
    android.support.v7.a.a locala = h();
    if (locala != null)
    {
      locala.c(false);
      locala.b(true);
      locala.a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label477;
      }
      locala.a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      this.r = ((TextView)findViewById(2131755215));
      this.s = ((TextView)findViewById(2131755216));
      this.t = ((TextView)findViewById(2131755217));
      this.u = ((TextView)findViewById(2131755218));
      this.v = ((TextView)findViewById(2131755219));
      this.w = ((TextView)findViewById(2131755220));
      this.x = ((TextView)findViewById(2131755221));
      this.y = ((TextView)findViewById(2131755222));
      l();
      this.r.setOnClickListener(this.o);
      this.s.setOnClickListener(this.o);
      this.t.setOnClickListener(this.o);
      this.u.setOnClickListener(this.o);
      this.v.setOnClickListener(this.o);
      this.w.setOnClickListener(this.o);
      this.x.setOnClickListener(this.o);
      this.y.setOnClickListener(this.o);
      this.m = new r(this).a(this, 0, this).a(m.c).b();
      this.q = ((AutoCompleteTextView)paramBundle.findViewById(2131755211));
      this.q.setOnItemClickListener(this.n);
      paramBundle = new com.google.android.gms.location.places.a().a(5).a();
      this.p = new de(this, this.m, this.z, paramBundle);
      this.q.setAdapter(this.p);
      return;
      label477:
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
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\CarRentalCityPrompt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */