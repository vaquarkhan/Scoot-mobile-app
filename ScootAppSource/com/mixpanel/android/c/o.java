package com.mixpanel.android.c;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class o
  implements ViewTreeObserver.OnGlobalLayoutListener, Runnable
{
  private volatile boolean a;
  private boolean b;
  private final WeakReference<View> c;
  private final at d;
  private final Handler e;
  
  public o(View paramView, at paramat, Handler paramHandler)
  {
    this.d = paramat;
    this.c = new WeakReference(paramView);
    this.e = paramHandler;
    this.b = true;
    this.a = false;
    paramView = paramView.getViewTreeObserver();
    if (paramView.isAlive()) {
      paramView.addOnGlobalLayoutListener(this);
    }
    run();
  }
  
  private void b()
  {
    if (this.b)
    {
      Object localObject = (View)this.c.get();
      if (localObject != null)
      {
        localObject = ((View)localObject).getViewTreeObserver();
        if (((ViewTreeObserver)localObject).isAlive()) {
          ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(this);
        }
      }
      this.d.a();
    }
    this.b = false;
  }
  
  public void a()
  {
    this.a = true;
    this.e.post(this);
  }
  
  public void onGlobalLayout()
  {
    run();
  }
  
  public void run()
  {
    if (!this.b) {
      return;
    }
    View localView = (View)this.c.get();
    if ((localView == null) || (this.a))
    {
      b();
      return;
    }
    this.d.b(localView);
    this.e.removeCallbacks(this);
    this.e.postDelayed(this, 1000L);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */