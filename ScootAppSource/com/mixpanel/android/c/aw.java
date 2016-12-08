package com.mixpanel.android.c;

import android.view.View;
import android.view.View.AccessibilityDelegate;

final class aw
  extends View.AccessibilityDelegate
{
  private View.AccessibilityDelegate b;
  
  public aw(av paramav, View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    this.b = paramAccessibilityDelegate;
  }
  
  public View.AccessibilityDelegate a()
  {
    return this.b;
  }
  
  public void a(aw paramaw)
  {
    if (this.b == paramaw) {
      this.b = paramaw.a();
    }
    while (!(this.b instanceof aw)) {
      return;
    }
    ((aw)this.b).a(paramaw);
  }
  
  public boolean a(String paramString)
  {
    if (this.a.d() == paramString) {
      return true;
    }
    if ((this.b instanceof aw)) {
      return ((aw)this.b).a(paramString);
    }
    return false;
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    if (paramInt == av.a(this.a)) {
      this.a.c(paramView);
    }
    if (this.b != null) {
      this.b.sendAccessibilityEvent(paramView, paramInt);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */