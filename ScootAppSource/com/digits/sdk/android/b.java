package com.digits.sdk.android;

import android.content.Context;
import android.content.res.TypedArray;

final class b
{
  private boolean a(Context paramContext, int paramInt, c paramc)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, c.a(paramc));
    boolean bool = paramContext.hasValue(c.b(paramc));
    paramContext.recycle();
    return bool;
  }
  
  a a(Context paramContext, int paramInt)
  {
    try
    {
      Class.forName("android.support.v7.a.e");
      if (a(paramContext, paramInt, new c())) {
        return new f();
      }
      paramContext = new d();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return new d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */