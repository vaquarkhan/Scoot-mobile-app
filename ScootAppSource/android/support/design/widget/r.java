package android.support.design.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.fh;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;

public abstract class r<V extends View>
{
  public r() {}
  
  public r(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public fh a(CoordinatorLayout paramCoordinatorLayout, V paramV, fh paramfh)
  {
    return paramfh;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt)
  {
    return false;
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return View.BaseSavedState.EMPTY_STATE;
  }
  
  public void b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt) {}
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
  {
    return false;
  }
  
  public int c(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return -16777216;
  }
  
  public boolean c(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
  {
    return false;
  }
  
  public float d(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return 0.0F;
  }
  
  public void d(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
  
  public boolean e(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return d(paramCoordinatorLayout, paramV) > 0.0F;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */