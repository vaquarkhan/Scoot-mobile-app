package com.facebook.b;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class ai
  implements Runnable
{
  public void run()
  {
    try
    {
      Iterator localIterator = ah.c().iterator();
      while (localIterator.hasNext()) {
        al.a((al)localIterator.next(), true);
      }
    }
    finally
    {
      ah.d().set(false);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */