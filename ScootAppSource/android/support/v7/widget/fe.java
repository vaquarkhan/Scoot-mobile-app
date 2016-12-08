package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.l;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class fe
  extends a
{
  final RecyclerView a;
  final a c = new ff(this);
  
  public fe(RecyclerView paramRecyclerView)
  {
    this.a = paramRecyclerView;
  }
  
  private boolean c()
  {
    return this.a.p();
  }
  
  public void a(View paramView, l paraml)
  {
    super.a(paramView, paraml);
    paraml.b(RecyclerView.class.getName());
    if ((!c()) && (this.a.getLayoutManager() != null)) {
      this.a.getLayoutManager().a(paraml);
    }
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!c()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.getLayoutManager() != null) {
        paramView.getLayoutManager().a(paramAccessibilityEvent);
      }
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    if ((!c()) && (this.a.getLayoutManager() != null)) {
      return this.a.getLayoutManager().a(paramInt, paramBundle);
    }
    return false;
  }
  
  a b()
  {
    return this.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */