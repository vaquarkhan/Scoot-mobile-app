package android.support.v7.view;

import android.support.v4.view.en;
import android.support.v4.view.fe;
import android.support.v4.view.ff;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class l
{
  private final ArrayList<en> a = new ArrayList();
  private long b = -1L;
  private Interpolator c;
  private fe d;
  private boolean e;
  private final ff f = new m(this);
  
  private void c()
  {
    this.e = false;
  }
  
  public l a(long paramLong)
  {
    if (!this.e) {
      this.b = paramLong;
    }
    return this;
  }
  
  public l a(en paramen)
  {
    if (!this.e) {
      this.a.add(paramen);
    }
    return this;
  }
  
  public l a(en paramen1, en paramen2)
  {
    this.a.add(paramen1);
    paramen2.b(paramen1.a());
    this.a.add(paramen2);
    return this;
  }
  
  public l a(fe paramfe)
  {
    if (!this.e) {
      this.d = paramfe;
    }
    return this;
  }
  
  public l a(Interpolator paramInterpolator)
  {
    if (!this.e) {
      this.c = paramInterpolator;
    }
    return this;
  }
  
  public void a()
  {
    if (this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      en localen = (en)localIterator.next();
      if (this.b >= 0L) {
        localen.a(this.b);
      }
      if (this.c != null) {
        localen.a(this.c);
      }
      if (this.d != null) {
        localen.a(this.f);
      }
      localen.c();
    }
    this.e = true;
  }
  
  public void b()
  {
    if (!this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((en)localIterator.next()).b();
    }
    this.e = false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\view\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */