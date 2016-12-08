package com.google.android.gms.location.places.a;

import android.app.Activity;
import android.content.Intent;

public final class b
  extends d
{
  public b(int paramInt)
  {
    super("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
    this.a.putExtra("gmscore_client_jar_version", com.google.android.gms.common.b.a);
    this.a.putExtra("mode", paramInt);
    this.a.putExtra("origin", 2);
  }
  
  public Intent a(Activity paramActivity)
  {
    return super.a(paramActivity);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */