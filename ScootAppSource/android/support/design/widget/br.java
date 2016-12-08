package android.support.design.widget;

import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class br
{
  private final ArrayList<bt> a = new ArrayList();
  private bt b = null;
  private Animation c = null;
  private WeakReference<View> d;
  private Animation.AnimationListener e = new bs(this);
  
  private void a(bt parambt)
  {
    this.c = parambt.b;
    parambt = a();
    if (parambt != null) {
      parambt.startAnimation(this.c);
    }
  }
  
  private void c()
  {
    View localView = a();
    int j = this.a.size();
    int i = 0;
    while (i < j)
    {
      Animation localAnimation = ((bt)this.a.get(i)).b;
      if (localView.getAnimation() == localAnimation) {
        localView.clearAnimation();
      }
      i += 1;
    }
    this.d = null;
    this.b = null;
    this.c = null;
  }
  
  private void d()
  {
    if (this.c != null)
    {
      View localView = a();
      if ((localView != null) && (localView.getAnimation() == this.c)) {
        localView.clearAnimation();
      }
      this.c = null;
    }
  }
  
  View a()
  {
    if (this.d == null) {
      return null;
    }
    return (View)this.d.get();
  }
  
  void a(View paramView)
  {
    View localView = a();
    if (localView == paramView) {}
    do
    {
      return;
      if (localView != null) {
        c();
      }
    } while (paramView == null);
    this.d = new WeakReference(paramView);
  }
  
  void a(int[] paramArrayOfInt)
  {
    Object localObject2 = null;
    int j = this.a.size();
    int i = 0;
    Object localObject1 = localObject2;
    if (i < j)
    {
      localObject1 = (bt)this.a.get(i);
      if (!StateSet.stateSetMatches(((bt)localObject1).a, paramArrayOfInt)) {}
    }
    else
    {
      if (localObject1 != this.b) {
        break label64;
      }
    }
    label64:
    do
    {
      return;
      i += 1;
      break;
      if (this.b != null) {
        d();
      }
      this.b = ((bt)localObject1);
      paramArrayOfInt = (View)this.d.get();
    } while ((localObject1 == null) || (paramArrayOfInt == null) || (paramArrayOfInt.getVisibility() != 0));
    a((bt)localObject1);
  }
  
  public void a(int[] paramArrayOfInt, Animation paramAnimation)
  {
    paramArrayOfInt = new bt(paramArrayOfInt, paramAnimation, null);
    paramAnimation.setAnimationListener(this.e);
    this.a.add(paramArrayOfInt);
  }
  
  public void b()
  {
    if (this.c != null)
    {
      View localView = a();
      if ((localView != null) && (localView.getAnimation() == this.c)) {
        localView.clearAnimation();
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */