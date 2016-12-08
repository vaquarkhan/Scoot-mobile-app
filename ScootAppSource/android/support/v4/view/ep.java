package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class ep
  implements ex
{
  WeakHashMap<View, Runnable> a = null;
  
  private void a(View paramView)
  {
    if (this.a != null)
    {
      Runnable localRunnable = (Runnable)this.a.get(paramView);
      if (localRunnable != null) {
        paramView.removeCallbacks(localRunnable);
      }
    }
  }
  
  private void d(en paramen, View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof fe)) {}
    for (localObject = (fe)localObject;; localObject = null)
    {
      Runnable localRunnable1 = en.a(paramen);
      Runnable localRunnable2 = en.b(paramen);
      en.b(paramen, null);
      en.a(paramen, null);
      if (localRunnable1 != null) {
        localRunnable1.run();
      }
      if (localObject != null)
      {
        ((fe)localObject).a(paramView);
        ((fe)localObject).b(paramView);
      }
      if (localRunnable2 != null) {
        localRunnable2.run();
      }
      if (this.a != null) {
        this.a.remove(paramView);
      }
      return;
    }
  }
  
  private void e(en paramen, View paramView)
  {
    if (this.a != null) {}
    for (Runnable localRunnable = (Runnable)this.a.get(paramView);; localRunnable = null)
    {
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new eq(this, paramen, paramView, null);
        if (this.a == null) {
          this.a = new WeakHashMap();
        }
        this.a.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
      return;
    }
  }
  
  public long a(en paramen, View paramView)
  {
    return 0L;
  }
  
  public void a(en paramen, View paramView, float paramFloat)
  {
    e(paramen, paramView);
  }
  
  public void a(en paramen, View paramView, long paramLong) {}
  
  public void a(en paramen, View paramView, fe paramfe)
  {
    paramView.setTag(2113929216, paramfe);
  }
  
  public void a(en paramen, View paramView, fg paramfg) {}
  
  public void a(en paramen, View paramView, Interpolator paramInterpolator) {}
  
  public void b(en paramen, View paramView)
  {
    e(paramen, paramView);
  }
  
  public void b(en paramen, View paramView, float paramFloat)
  {
    e(paramen, paramView);
  }
  
  public void b(en paramen, View paramView, long paramLong) {}
  
  public void c(en paramen, View paramView)
  {
    a(paramView);
    d(paramen, paramView);
  }
  
  public void c(en paramen, View paramView, float paramFloat)
  {
    e(paramen, paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */