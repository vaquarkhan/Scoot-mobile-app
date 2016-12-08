package com.google.android.gms.common.data;

import com.google.android.gms.common.api.w;
import java.util.Iterator;

public abstract interface b<T>
  extends w, Iterable<T>
{
  public abstract T a(int paramInt);
  
  public abstract int c();
  
  @Deprecated
  public abstract void d();
  
  public abstract Iterator<T> iterator();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */