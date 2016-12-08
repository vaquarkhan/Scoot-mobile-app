package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.ar;
import android.support.v4.view.a.l;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class dy
  extends a
{
  dy(ViewPager paramViewPager) {}
  
  private boolean b()
  {
    return (ViewPager.a(this.a) != null) && (ViewPager.a(this.a).b() > 1);
  }
  
  public void a(View paramView, l paraml)
  {
    super.a(paramView, paraml);
    paraml.b(ViewPager.class.getName());
    paraml.i(b());
    if (this.a.canScrollHorizontally(1)) {
      paraml.a(4096);
    }
    if (this.a.canScrollHorizontally(-1)) {
      paraml.a(8192);
    }
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    paramView = android.support.v4.view.a.a.a(paramAccessibilityEvent);
    paramView.a(b());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.a(this.a) != null))
    {
      paramView.a(ViewPager.a(this.a).b());
      paramView.b(ViewPager.b(this.a));
      paramView.c(ViewPager.b(this.a));
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 4096: 
      if (this.a.canScrollHorizontally(1))
      {
        this.a.setCurrentItem(ViewPager.b(this.a) + 1);
        return true;
      }
      return false;
    }
    if (this.a.canScrollHorizontally(-1))
    {
      this.a.setCurrentItem(ViewPager.b(this.a) - 1);
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */