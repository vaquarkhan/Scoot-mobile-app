package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.ae;
import android.support.v4.view.a.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a
{
  private static final d a;
  private static final Object c;
  final Object b = a.a(this);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {
      a = new e();
    }
    for (;;)
    {
      c = a.a();
      return;
      if (Build.VERSION.SDK_INT >= 14) {
        a = new b();
      } else {
        a = new g();
      }
    }
  }
  
  public ae a(View paramView)
  {
    return a.a(c, paramView);
  }
  
  Object a()
  {
    return this.b;
  }
  
  public void a(View paramView, int paramInt)
  {
    a.a(c, paramView, paramInt);
  }
  
  public void a(View paramView, l paraml)
  {
    a.a(c, paramView, paraml);
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.b(c, paramView, paramAccessibilityEvent);
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a.a(c, paramView, paramInt, paramBundle);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(c, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.c(c, paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.d(c, paramView, paramAccessibilityEvent);
  }
  
  public boolean d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(c, paramView, paramAccessibilityEvent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */