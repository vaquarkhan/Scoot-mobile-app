package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class f
  extends b
  implements j
{
  private Context a;
  private ActionBarContextView b;
  private c c;
  private WeakReference<View> d;
  private boolean e;
  private boolean f;
  private android.support.v7.view.menu.i g;
  
  public f(Context paramContext, ActionBarContextView paramActionBarContextView, c paramc, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramActionBarContextView;
    this.c = paramc;
    this.g = new android.support.v7.view.menu.i(paramActionBarContextView.getContext()).a(1);
    this.g.a(this);
    this.f = paramBoolean;
  }
  
  public MenuInflater a()
  {
    return new i(this.b.getContext());
  }
  
  public void a(int paramInt)
  {
    b(this.a.getString(paramInt));
  }
  
  public void a(android.support.v7.view.menu.i parami)
  {
    d();
    this.b.a();
  }
  
  public void a(View paramView)
  {
    this.b.setCustomView(paramView);
    if (paramView != null) {}
    for (paramView = new WeakReference(paramView);; paramView = null)
    {
      this.d = paramView;
      return;
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.b.setSubtitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.b.setTitleOptional(paramBoolean);
  }
  
  public boolean a(android.support.v7.view.menu.i parami, MenuItem paramMenuItem)
  {
    return this.c.a(this, paramMenuItem);
  }
  
  public Menu b()
  {
    return this.g;
  }
  
  public void b(int paramInt)
  {
    a(this.a.getString(paramInt));
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.b.setTitle(paramCharSequence);
  }
  
  public void c()
  {
    if (this.e) {
      return;
    }
    this.e = true;
    this.b.sendAccessibilityEvent(32);
    this.c.a(this);
  }
  
  public void d()
  {
    this.c.b(this, this.g);
  }
  
  public CharSequence f()
  {
    return this.b.getTitle();
  }
  
  public CharSequence g()
  {
    return this.b.getSubtitle();
  }
  
  public boolean h()
  {
    return this.b.d();
  }
  
  public View i()
  {
    if (this.d != null) {
      return (View)this.d.get();
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\view\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */