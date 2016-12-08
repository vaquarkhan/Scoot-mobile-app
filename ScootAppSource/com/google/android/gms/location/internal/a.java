package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;

public class a
  extends aq<q>
{
  protected final af<q> d = new b(this);
  private final String e;
  
  public a(Context paramContext, Looper paramLooper, s params, t paramt, String paramString, ai paramai)
  {
    super(paramContext, paramLooper, 23, paramai, params, paramt);
    this.e = paramString;
  }
  
  protected q a(IBinder paramIBinder)
  {
    return r.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.location.internal.GoogleLocationManagerService.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
  }
  
  protected Bundle c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("client_name", this.e);
    return localBundle;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */