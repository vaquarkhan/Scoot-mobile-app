package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.m;
import java.util.Iterator;
import java.util.List;

public abstract class j
{
  private final List<m<? extends l>> a;
  
  public j(List<m<? extends l>> paramList)
  {
    this.a = paramList;
  }
  
  public l a()
  {
    Object localObject = null;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      l locall = ((m)localIterator.next()).b();
      localObject = locall;
      if (locall != null) {
        localObject = locall;
      }
    }
    return (l)localObject;
  }
  
  public abstract void a(f<l> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */