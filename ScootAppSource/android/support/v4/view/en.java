package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class en
{
  static final ex a = new ep();
  private WeakReference<View> b;
  private Runnable c = null;
  private Runnable d = null;
  private int e = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new ew();
      return;
    }
    if (i >= 19)
    {
      a = new ev();
      return;
    }
    if (i >= 18)
    {
      a = new et();
      return;
    }
    if (i >= 16)
    {
      a = new eu();
      return;
    }
    if (i >= 14)
    {
      a = new er();
      return;
    }
  }
  
  en(View paramView)
  {
    this.b = new WeakReference(paramView);
  }
  
  public long a()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      return a.a(this, localView);
    }
    return 0L;
  }
  
  public en a(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public en a(long paramLong)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramLong);
    }
    return this;
  }
  
  public en a(fe paramfe)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramfe);
    }
    return this;
  }
  
  public en a(fg paramfg)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramfg);
    }
    return this;
  }
  
  public en a(Interpolator paramInterpolator)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramInterpolator);
    }
    return this;
  }
  
  public en b(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public en b(long paramLong)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView, paramLong);
    }
    return this;
  }
  
  public void b()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView);
    }
  }
  
  public en c(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.c(this, localView, paramFloat);
    }
    return this;
  }
  
  public void c()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.c(this, localView);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */