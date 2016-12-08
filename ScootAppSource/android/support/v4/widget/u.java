package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.l;
import android.support.v4.view.a.m;
import android.support.v4.view.cb;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

final class u
  extends a
{
  private final Rect c = new Rect();
  
  u(DrawerLayout paramDrawerLayout) {}
  
  private void a(l paraml1, l paraml2)
  {
    Rect localRect = this.c;
    paraml2.a(localRect);
    paraml1.b(localRect);
    paraml2.c(localRect);
    paraml1.d(localRect);
    paraml1.c(paraml2.h());
    paraml1.a(paraml2.p());
    paraml1.b(paraml2.q());
    paraml1.d(paraml2.s());
    paraml1.h(paraml2.m());
    paraml1.f(paraml2.k());
    paraml1.a(paraml2.f());
    paraml1.b(paraml2.g());
    paraml1.d(paraml2.i());
    paraml1.e(paraml2.j());
    paraml1.g(paraml2.l());
    paraml1.a(paraml2.c());
  }
  
  private void a(l paraml, ViewGroup paramViewGroup)
  {
    int j = paramViewGroup.getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = paramViewGroup.getChildAt(i);
      if (DrawerLayout.l(localView)) {
        paraml.c(localView);
      }
      i += 1;
    }
  }
  
  public void a(View paramView, l paraml)
  {
    if (DrawerLayout.e()) {
      super.a(paramView, paraml);
    }
    for (;;)
    {
      paraml.b(DrawerLayout.class.getName());
      paraml.a(false);
      paraml.b(false);
      paraml.a(m.a);
      paraml.a(m.b);
      return;
      l locall = l.a(paraml);
      super.a(paramView, locall);
      paraml.b(paramView);
      ViewParent localViewParent = cb.i(paramView);
      if ((localViewParent instanceof View)) {
        paraml.d((View)localViewParent);
      }
      a(paraml, locall);
      locall.t();
      a(paraml, (ViewGroup)paramView);
    }
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if ((DrawerLayout.e()) || (DrawerLayout.l(paramView))) {
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    return false;
  }
  
  public boolean d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramView = paramAccessibilityEvent.getText();
      paramAccessibilityEvent = DrawerLayout.a(this.a);
      if (paramAccessibilityEvent != null)
      {
        int i = this.a.e(paramAccessibilityEvent);
        paramAccessibilityEvent = this.a.b(i);
        if (paramAccessibilityEvent != null) {
          paramView.add(paramAccessibilityEvent);
        }
      }
      return true;
    }
    return super.d(paramView, paramAccessibilityEvent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */