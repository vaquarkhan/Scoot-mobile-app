package com.mixpanel.android.c;

import android.os.Handler;
import com.mixpanel.android.mpmetrics.af;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class d
  implements Runnable
{
  private d(b paramb) {}
  
  public void run()
  {
    long l = System.currentTimeMillis();
    synchronized (b.a(this.a))
    {
      Iterator localIterator = b.a(this.a).entrySet().iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)((Map.Entry)localIterator.next()).getValue();
        if (l - localf.a > 1000L)
        {
          b.b(this.a).a(localf.b, localf.c);
          localIterator.remove();
        }
      }
    }
    if (!b.a(this.a).isEmpty()) {
      b.c(this.a).postDelayed(this, 500L);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */