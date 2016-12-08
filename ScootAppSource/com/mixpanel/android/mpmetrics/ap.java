package com.mixpanel.android.mpmetrics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class ap
  implements as, Runnable
{
  private final Set<au> b = new HashSet();
  private final Executor c = Executors.newSingleThreadExecutor();
  
  private ap(af paramaf) {}
  
  public void a()
  {
    this.c.execute(this);
  }
  
  public void run()
  {
    try
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        ((au)localIterator.next()).a();
      }
    }
    finally {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */