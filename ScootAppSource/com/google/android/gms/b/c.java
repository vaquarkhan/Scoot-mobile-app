package com.google.android.gms.b;

import android.content.Context;
import com.google.firebase.a;
import java.util.concurrent.atomic.AtomicReference;

public final class c
{
  private static final AtomicReference<c> a = new AtomicReference();
  
  c(Context paramContext) {}
  
  public static c a(Context paramContext)
  {
    a.compareAndSet(null, new c(paramContext));
    return (c)a.get();
  }
  
  public void a(a parama) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */