package com.mixpanel.android.c;

import android.util.LruCache;

final class aq
  extends LruCache<Class<?>, String>
{
  public aq(int paramInt)
  {
    super(paramInt);
  }
  
  protected String a(Class<?> paramClass)
  {
    return paramClass.getCanonicalName();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */