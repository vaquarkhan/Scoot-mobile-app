package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class bf
{
  private final ao a;
  private final ch b;
  private final m<cb> c;
  private final t d;
  private final bc e;
  private final ca f;
  private DigitsApiClient g;
  
  bf()
  {
    this(ao.d(), new ch(), t.d(), ao.f(), null, new j(ao.d().j()));
  }
  
  bf(ao paramao, ch paramch, t paramt, m<cb> paramm, bc parambc, ca paramca)
  {
    if (paramt == null) {
      throw new IllegalArgumentException("twitter must not be null");
    }
    if (paramao == null) {
      throw new IllegalArgumentException("digits must not be null");
    }
    if (paramch == null) {
      throw new IllegalArgumentException("userAgent must not be null");
    }
    if (paramm == null) {
      throw new IllegalArgumentException("sessionManager must not be null");
    }
    this.d = paramt;
    this.a = paramao;
    this.b = paramch;
    this.c = paramm;
    if (parambc == null)
    {
      this.e = a(paramm);
      this.e.a(null);
    }
    for (;;)
    {
      this.f = paramca;
      return;
      this.e = parambc;
    }
  }
  
  private String a(String paramString)
  {
    return Base64.encodeToString(("__Digits@P@rtner__" + paramString).getBytes(Charset.forName("UTF-8")), 2);
  }
  
  private void a(Bundle paramBundle)
  {
    Context localContext = this.d.E();
    Object localObject2 = this.a.F().b();
    Object localObject1 = localContext;
    if (localObject2 != null)
    {
      localObject1 = localContext;
      if (!((Activity)localObject2).isFinishing()) {
        localObject1 = localObject2;
      }
    }
    if ((localObject2 != null) && (!((Activity)localObject2).isFinishing())) {}
    for (int i = 0;; i = 335544320)
    {
      localObject2 = new Intent((Context)localObject1, this.a.m().a());
      ((Intent)localObject2).putExtras(paramBundle);
      ((Intent)localObject2).setFlags(i);
      ((Context)localObject1).startActivity((Intent)localObject2);
      return;
    }
  }
  
  private boolean d(ba paramba)
  {
    paramba = paramba.d;
    return a(this.d.f().a()).equals(paramba);
  }
  
  private Bundle e(ba paramba)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("receiver", a(paramba.e));
    localBundle.putString("phone_number", paramba.c);
    localBundle.putBoolean("email_enabled", paramba.a);
    return localBundle;
  }
  
  DigitsApiClient a(l paraml)
  {
    if ((this.g != null) && (this.g.a().equals(paraml))) {
      return this.g;
    }
    this.g = new DigitsApiClient(paraml, this.d.f(), this.d.g(), this.a.l(), this.b);
    return this.g;
  }
  
  LoginResultReceiver a(g paramg)
  {
    return new LoginResultReceiver(paramg, this.c);
  }
  
  protected bc a(m paramm)
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramm);
    return new bc(this, new bt(paramm, localArrayList));
  }
  
  protected ch a()
  {
    return this.b;
  }
  
  protected void a(ba paramba)
  {
    this.f.a();
    cb localcb = (cb)this.c.b();
    if (paramba.f != null) {}
    boolean bool;
    for (int i = 1;; i = 0)
    {
      bool = d(paramba);
      if ((localcb == null) || (localcb.a())) {
        break;
      }
      paramba.e.a(localcb, null);
      this.f.c();
      return;
    }
    if ((i != 0) && (bool))
    {
      b(paramba);
      return;
    }
    if (i != 0) {
      throw new IllegalArgumentException("Invalid partner key");
    }
    a(e(paramba));
  }
  
  protected void a(String paramString1, long paramLong, String paramString2, com.twitter.sdk.android.core.f<cd> paramf)
  {
    this.e.a(new bj(this, paramf, paramString1, paramLong, paramString2));
  }
  
  protected void a(String paramString, ef paramef, com.twitter.sdk.android.core.f<i> paramf)
  {
    this.e.a(new bg(this, paramf, paramString, paramef));
  }
  
  protected void a(String paramString1, String paramString2, com.twitter.sdk.android.core.f<cg> paramf)
  {
    this.e.a(new bh(this, paramf, paramString2, paramString1));
  }
  
  protected void b(ba paramba)
  {
    c(paramba).a();
  }
  
  protected void b(String paramString1, long paramLong, String paramString2, com.twitter.sdk.android.core.f<cd> paramf)
  {
    this.e.a(new bl(this, paramf, paramString1, paramLong, paramString2));
  }
  
  protected void b(String paramString, ef paramef, com.twitter.sdk.android.core.f<an> paramf)
  {
    this.e.a(new bk(this, paramf, paramString, paramef));
  }
  
  dc c(ba paramba)
  {
    Context localContext = this.a.E();
    a locala = ao.d().m();
    return new bi(this, localContext, this, paramba.c, ef.b, paramba.a, a(paramba.e), locala, paramba);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */