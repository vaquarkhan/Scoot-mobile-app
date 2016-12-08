package com.google.android.gms.b;

import android.app.Activity;
import android.support.v4.app.aa;
import com.google.android.gms.common.a.j;
import com.google.android.gms.common.internal.b;

public final class dh
{
  private final Object a;
  
  public dh(Activity paramActivity)
  {
    b.a(paramActivity, "Activity must not be null");
    if ((j.a()) || ((paramActivity instanceof aa))) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "This Activity is not supported before platform version 11 (3.0 Honeycomb). Please use FragmentActivity instead.");
      this.a = paramActivity;
      return;
    }
  }
  
  public boolean a()
  {
    return this.a instanceof aa;
  }
  
  public Activity b()
  {
    return (Activity)this.a;
  }
  
  public aa c()
  {
    return (aa)this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */