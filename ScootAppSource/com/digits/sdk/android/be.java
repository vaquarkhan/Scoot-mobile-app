package com.digits.sdk.android;

import android.content.Context;
import b.a.a.a.t;
import com.twitter.sdk.android.core.u;
import java.lang.ref.WeakReference;

public abstract class be<T>
  extends com.twitter.sdk.android.core.f<T>
{
  private final WeakReference<Context> a;
  final bn c;
  
  be(Context paramContext, bn parambn)
  {
    this.a = new WeakReference(paramContext);
    this.c = parambn;
  }
  
  public void a(u paramu)
  {
    bs localbs = bs.a(this.c.c(), paramu);
    b.a.a.a.f.h().e("Digits", "HTTP Error: " + paramu.getMessage() + ", API Error: " + "" + localbs.a() + ", User Message: " + localbs.getMessage());
    this.c.a((Context)this.a.get(), localbs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */