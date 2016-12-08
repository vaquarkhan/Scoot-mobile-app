package android.support.design.widget;

import android.support.v4.view.bf;
import android.support.v4.widget.cp;
import android.support.v4.widget.cs;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior<V extends View>
  extends r<V>
{
  private cp a;
  private bv b;
  private boolean c;
  private float d = 0.0F;
  private boolean e;
  private int f = 2;
  private float g = 0.5F;
  private float h = 0.0F;
  private float i = 0.5F;
  private final cs j = new bu(this);
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    if (this.a == null) {
      if (!this.e) {
        break label33;
      }
    }
    label33:
    for (paramViewGroup = cp.a(paramViewGroup, this.d, this.j);; paramViewGroup = cp.a(paramViewGroup, this.j))
    {
      this.a = paramViewGroup;
      return;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  private static float c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.min(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  public void a(float paramFloat)
  {
    this.h = c(0.0F, paramFloat, 1.0F);
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void a(bv parambv)
  {
    this.b = parambv;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    switch (bf.a(paramMotionEvent))
    {
    case 2: 
    default: 
      if (paramCoordinatorLayout.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        break;
      }
    }
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      do
      {
        if (!this.c) {
          break;
        }
        return false;
      } while (!this.c);
      this.c = false;
      return false;
    }
    a(paramCoordinatorLayout);
    return this.a.a(paramMotionEvent);
  }
  
  public boolean a(View paramView)
  {
    return true;
  }
  
  public void b(float paramFloat)
  {
    this.i = c(0.0F, paramFloat, 1.0F);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.a != null)
    {
      this.a.b(paramMotionEvent);
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\SwipeDismissBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */