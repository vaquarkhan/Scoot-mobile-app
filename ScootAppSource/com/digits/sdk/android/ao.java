package com.digits.sdk.android;

import android.annotation.TargetApi;
import b.a.a.a.a.c.n;
import b.a.a.a.a.f.d;
import b.a.a.a.q;
import com.twitter.sdk.android.core.internal.c;
import com.twitter.sdk.android.core.j;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

@n(a={t.class})
public class ao
  extends q<Void>
{
  private volatile bf a;
  private volatile ContactsClient b;
  private m<cb> c;
  private com.twitter.sdk.android.core.internal.f<cb> d;
  private a k;
  private bw l = new bx(null);
  private ce m;
  private int n;
  
  public static void a(ba paramba)
  {
    d().a(paramba.b);
    d().i().a(paramba);
  }
  
  @Deprecated
  public static void a(g paramg)
  {
    a(paramg, 0);
  }
  
  @Deprecated
  public static void a(g paramg, int paramInt)
  {
    a(new bb().a(paramg).a(paramInt).a());
  }
  
  public static ao d()
  {
    return (ao)b.a.a.a.f.a(ao.class);
  }
  
  public static m<cb> f()
  {
    return d().c;
  }
  
  private void o()
  {
    try
    {
      if (this.a == null) {
        this.a = new bf();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void p()
  {
    try
    {
      if (this.b == null) {
        this.b = new ContactsClient();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private bw q()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.c);
    if ((this.a != null) && (this.a.a() != null)) {
      return new bx(new com.twitter.sdk.android.core.internal.scribe.a(this, this.a.a().toString(), localArrayList, D()));
    }
    return new bx(new com.twitter.sdk.android.core.internal.scribe.a(this, "Digits", localArrayList, D()));
  }
  
  public String a()
  {
    return "1.10.3.111";
  }
  
  protected void a(int paramInt)
  {
    this.n = paramInt;
    n();
  }
  
  public String b()
  {
    return "com.digits.sdk.android:digits";
  }
  
  protected Void g()
  {
    this.c.b();
    this.l = q();
    o();
    p();
    this.d = new com.twitter.sdk.android.core.internal.f(f(), l(), this.m);
    this.d.a(F().e());
    return null;
  }
  
  @TargetApi(21)
  int h()
  {
    if (this.n != 0) {
      return this.n;
    }
    return R.style.Digits_default;
  }
  
  protected boolean h_()
  {
    new c().a(E(), b(), b() + ":" + "session_store" + ".xml");
    this.c = new j(new d(E(), "session_store"), new cc(), "active_session", "session");
    this.m = new ce();
    return super.h_();
  }
  
  bf i()
  {
    if (this.a == null) {
      o();
    }
    return this.a;
  }
  
  protected bw j()
  {
    return this.l;
  }
  
  public ContactsClient k()
  {
    if (this.b == null) {
      p();
    }
    return this.b;
  }
  
  protected ExecutorService l()
  {
    return F().f();
  }
  
  protected a m()
  {
    if (this.k == null) {
      n();
    }
    return this.k;
  }
  
  protected void n()
  {
    this.k = new b().a(E(), this.n);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */