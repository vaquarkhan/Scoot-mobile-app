package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.u;

abstract class dc
{
  private final Context a;
  protected final f<an> c;
  protected final f<i> d;
  final bf e;
  final String f;
  final ef g;
  final boolean h;
  final ResultReceiver i;
  final a j;
  
  dc(Context paramContext, bf parambf, String paramString, ef paramef, boolean paramBoolean, ResultReceiver paramResultReceiver, a parama)
  {
    this.a = paramContext;
    this.e = parambf;
    this.f = paramString;
    this.g = paramef;
    this.h = paramBoolean;
    this.i = paramResultReceiver;
    this.j = parama;
    this.d = new dd(this);
    this.c = new de(this);
  }
  
  private Intent a(AuthConfig paramAuthConfig, String paramString, Class<? extends Activity> paramClass)
  {
    boolean bool;
    if (paramAuthConfig == null) {
      bool = this.h;
    }
    for (;;)
    {
      String str = paramString;
      if (paramString == null) {
        str = this.f;
      }
      paramString = new Intent(this.a, paramClass);
      paramString.putExtra("receiver", this.i);
      paramString.putExtra("phone_number", str);
      paramString.putExtra("auth_config", paramAuthConfig);
      paramString.putExtra("email_enabled", bool);
      return paramString;
      if ((paramAuthConfig.c) && (this.h)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private Intent a(an paraman)
  {
    return a(paraman.b, paraman.a, this.j.b());
  }
  
  private Intent a(i parami)
  {
    Intent localIntent = a(parami.d, parami.a, this.j.c());
    localIntent.putExtra("request_id", parami.b);
    localIntent.putExtra("user_id", parami.c);
    return localIntent;
  }
  
  private bs a(u paramu)
  {
    return bs.a(new dm(this.a.getResources()), paramu);
  }
  
  private void b()
  {
    this.e.b(this.f, this.g, this.c);
  }
  
  private void c()
  {
    this.e.a(this.f, this.g, this.d);
  }
  
  public void a()
  {
    c();
  }
  
  public abstract void a(Intent paramIntent);
  
  public abstract void a(bs parambs);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */