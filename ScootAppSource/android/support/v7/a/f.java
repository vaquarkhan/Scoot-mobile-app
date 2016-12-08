package android.support.v7.a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.z;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class f
  implements z
{
  private final h a;
  private final DrawerLayout b;
  private k c;
  private Drawable d;
  private boolean e = true;
  private final int f;
  private final int g;
  private View.OnClickListener h;
  private boolean i = false;
  
  public f(Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar, int paramInt1, int paramInt2)
  {
    this(paramActivity, paramToolbar, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  <T extends Drawable,  extends k> f(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout, T paramT, int paramInt1, int paramInt2)
  {
    if (paramToolbar != null)
    {
      this.a = new o(paramToolbar);
      paramToolbar.setNavigationOnClickListener(new g(this));
      this.b = paramDrawerLayout;
      this.f = paramInt1;
      this.g = paramInt2;
      if (paramT != null) {
        break label180;
      }
    }
    label180:
    for (this.c = new j(paramActivity, this.a.b());; this.c = ((k)paramT))
    {
      this.d = b();
      return;
      if ((paramActivity instanceof i))
      {
        this.a = ((i)paramActivity).b();
        break;
      }
      if (Build.VERSION.SDK_INT >= 18)
      {
        this.a = new n(paramActivity, null);
        break;
      }
      if (Build.VERSION.SDK_INT >= 11)
      {
        this.a = new m(paramActivity, null);
        break;
      }
      this.a = new l(paramActivity);
      break;
    }
  }
  
  private void c()
  {
    int j = this.b.a(8388611);
    if ((this.b.h(8388611)) && (j != 2)) {
      this.b.f(8388611);
    }
    while (j == 1) {
      return;
    }
    this.b.e(8388611);
  }
  
  public void a()
  {
    Drawable localDrawable;
    if (this.b.g(8388611))
    {
      this.c.a(1.0F);
      if (this.e)
      {
        localDrawable = (Drawable)this.c;
        if (!this.b.g(8388611)) {
          break label74;
        }
      }
    }
    label74:
    for (int j = this.g;; j = this.f)
    {
      a(localDrawable, j);
      return;
      this.c.a(0.0F);
      break;
    }
  }
  
  public void a(int paramInt) {}
  
  void a(Drawable paramDrawable, int paramInt)
  {
    if ((!this.i) && (!this.a.c()))
    {
      Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
      this.i = true;
    }
    this.a.a(paramDrawable, paramInt);
  }
  
  public void a(View paramView)
  {
    this.c.a(1.0F);
    if (this.e) {
      b(this.g);
    }
  }
  
  public void a(View paramView, float paramFloat)
  {
    this.c.a(Math.min(1.0F, Math.max(0.0F, paramFloat)));
  }
  
  Drawable b()
  {
    return this.a.a();
  }
  
  void b(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void b(View paramView)
  {
    this.c.a(0.0F);
    if (this.e) {
      b(this.f);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */