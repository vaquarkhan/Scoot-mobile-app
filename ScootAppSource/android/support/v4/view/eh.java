package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

abstract interface eh
{
  public abstract void a(ViewParent paramViewParent, View paramView);
  
  public abstract void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt);
  
  public abstract boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2);
  
  public abstract boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean);
  
  public abstract boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt);
  
  public abstract boolean a(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */