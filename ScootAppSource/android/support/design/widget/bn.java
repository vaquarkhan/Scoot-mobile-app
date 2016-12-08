package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class bn
{
  private static bn a;
  private final Object b = new Object();
  private final Handler c = new Handler(Looper.getMainLooper(), new bo(this));
  private bq d;
  private bq e;
  
  static bn a()
  {
    if (a == null) {
      a = new bn();
    }
    return a;
  }
  
  private void a(bq parambq)
  {
    if (bq.b(parambq) == -2) {
      return;
    }
    int i = 2750;
    if (bq.b(parambq) > 0) {
      i = bq.b(parambq);
    }
    for (;;)
    {
      this.c.removeCallbacksAndMessages(parambq);
      this.c.sendMessageDelayed(Message.obtain(this.c, 0, parambq), i);
      return;
      if (bq.b(parambq) == -1) {
        i = 1500;
      }
    }
  }
  
  private boolean a(bq parambq, int paramInt)
  {
    bp localbp = (bp)bq.a(parambq).get();
    if (localbp != null)
    {
      this.c.removeCallbacksAndMessages(parambq);
      localbp.a(paramInt);
      return true;
    }
    return false;
  }
  
  private void b()
  {
    if (this.e != null)
    {
      this.d = this.e;
      this.e = null;
      bp localbp = (bp)bq.a(this.d).get();
      if (localbp != null) {
        localbp.a();
      }
    }
    else
    {
      return;
    }
    this.d = null;
  }
  
  private void b(bq parambq)
  {
    synchronized (this.b)
    {
      if ((this.d == parambq) || (this.e == parambq)) {
        a(parambq, 2);
      }
      return;
    }
  }
  
  private boolean f(bp parambp)
  {
    return (this.d != null) && (this.d.a(parambp));
  }
  
  private boolean g(bp parambp)
  {
    return (this.e != null) && (this.e.a(parambp));
  }
  
  public void a(int paramInt, bp parambp)
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if (f(parambp))
        {
          bq.a(this.d, paramInt);
          this.c.removeCallbacksAndMessages(this.d);
          a(this.d);
          return;
        }
        if (g(parambp))
        {
          bq.a(this.e, paramInt);
          if ((this.d == null) || (!a(this.d, 4))) {
            break;
          }
          return;
        }
      }
      this.e = new bq(paramInt, parambp);
    }
    this.d = null;
    b();
  }
  
  public void a(bp parambp)
  {
    synchronized (this.b)
    {
      if (f(parambp))
      {
        this.d = null;
        if (this.e != null) {
          b();
        }
      }
      return;
    }
  }
  
  public void a(bp parambp, int paramInt)
  {
    synchronized (this.b)
    {
      if (f(parambp)) {
        a(this.d, paramInt);
      }
      while (!g(parambp)) {
        return;
      }
      a(this.e, paramInt);
    }
  }
  
  public void b(bp parambp)
  {
    synchronized (this.b)
    {
      if (f(parambp)) {
        a(this.d);
      }
      return;
    }
  }
  
  public void c(bp parambp)
  {
    synchronized (this.b)
    {
      if (f(parambp)) {
        this.c.removeCallbacksAndMessages(this.d);
      }
      return;
    }
  }
  
  public void d(bp parambp)
  {
    synchronized (this.b)
    {
      if (f(parambp)) {
        a(this.d);
      }
      return;
    }
  }
  
  public boolean e(bp parambp)
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if (!f(parambp))
        {
          if (!g(parambp)) {
            break label40;
          }
          break label35;
          return bool;
        }
      }
      label35:
      boolean bool = true;
      continue;
      label40:
      bool = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */