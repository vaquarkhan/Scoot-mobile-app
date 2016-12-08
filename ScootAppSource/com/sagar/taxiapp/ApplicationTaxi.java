package com.sagar.taxiapp;

import android.support.b.e;
import com.b.a.u;
import com.facebook.w;
import com.google.android.gms.analytics.h;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.scootapp.tv.d.f;
import java.util.HashMap;
import net.danlew.android.joda.a;

public class ApplicationTaxi
  extends e
{
  private static ApplicationTaxi c;
  HashMap<ab, com.google.android.gms.analytics.r> a = new HashMap();
  private u b;
  
  public static ApplicationTaxi a()
  {
    try
    {
      ApplicationTaxi localApplicationTaxi = c;
      return localApplicationTaxi;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public com.google.android.gms.analytics.r a(ab paramab)
  {
    try
    {
      if (!this.a.containsKey(paramab))
      {
        com.google.android.gms.analytics.r localr = h.a(this).a(2131099648);
        localr.c(true);
        this.a.put(paramab, localr);
      }
      paramab = (com.google.android.gms.analytics.r)this.a.get(paramab);
      return paramab;
    }
    finally {}
  }
  
  public <T> void a(com.b.a.r<T> paramr)
  {
    paramr.a("VolleyPatterns");
    b().a(paramr);
  }
  
  public u b()
  {
    if (this.b == null) {
      this.b = com.b.a.a.r.a(getApplicationContext());
    }
    return this.b;
  }
  
  public void onCreate()
  {
    super.onCreate();
    w.a(getApplicationContext());
    c = this;
    f.a(getApplicationContext());
    Parse.initialize(this, "YYVf5o4fHQ6G63Y8HkORclk4J3wzSG7TWyx3EYQI", "FsBDbW7LKkDqqsNNpOeOhy9IpLoGz2Y9zRLBCsSq");
    ParseUser.enableRevocableSessionInBackground();
    ParseInstallation.getCurrentInstallation().saveInBackground();
    a.a(getApplicationContext());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ApplicationTaxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */