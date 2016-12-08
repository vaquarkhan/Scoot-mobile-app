package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.support.v4.view.fe;
import android.support.v4.view.fg;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.b;
import android.support.v7.view.l;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.cd;
import android.support.v7.widget.fm;
import android.support.v7.widget.i;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public class bv
  extends a
  implements i
{
  private static final Interpolator i;
  private static final Interpolator j;
  private static final boolean k;
  private boolean A;
  private int B = 0;
  private boolean C = true;
  private boolean D;
  private boolean E;
  private boolean F;
  private boolean G = true;
  private l H;
  private boolean I;
  bz a;
  b b;
  android.support.v7.view.c c;
  boolean d;
  final fe e = new bw(this);
  final fe f = new bx(this);
  final fg g = new by(this);
  private Context l;
  private Context m;
  private Activity n;
  private Dialog o;
  private ActionBarOverlayLayout p;
  private ActionBarContainer q;
  private cd r;
  private ActionBarContextView s;
  private View t;
  private fm u;
  private ArrayList<Object> v = new ArrayList();
  private int w = -1;
  private boolean x;
  private boolean y;
  private ArrayList<c> z = new ArrayList();
  
  static
  {
    boolean bool2 = true;
    if (!bv.class.desiredAssertionStatus())
    {
      bool1 = true;
      h = bool1;
      i = new AccelerateInterpolator();
      j = new DecelerateInterpolator();
      if (Build.VERSION.SDK_INT < 14) {
        break label56;
      }
    }
    label56:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      k = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public bv(Activity paramActivity, boolean paramBoolean)
  {
    this.n = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    a(paramActivity);
    if (!paramBoolean) {
      this.t = paramActivity.findViewById(16908290);
    }
  }
  
  public bv(Dialog paramDialog)
  {
    this.o = paramDialog;
    a(paramDialog.getWindow().getDecorView());
  }
  
  private void a(View paramView)
  {
    this.p = ((ActionBarOverlayLayout)paramView.findViewById(R.id.decor_content_parent));
    if (this.p != null) {
      this.p.setActionBarVisibilityCallback(this);
    }
    this.r = b(paramView.findViewById(R.id.action_bar));
    this.s = ((ActionBarContextView)paramView.findViewById(R.id.action_context_bar));
    this.q = ((ActionBarContainer)paramView.findViewById(R.id.action_bar_container));
    if ((this.r == null) || (this.s == null) || (this.q == null)) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
    }
    this.l = this.r.b();
    int i1;
    if ((this.r.o() & 0x4) != 0)
    {
      i1 = 1;
      if (i1 != 0) {
        this.x = true;
      }
      paramView = android.support.v7.view.a.a(this.l);
      if ((!paramView.f()) && (i1 == 0)) {
        break label264;
      }
    }
    label264:
    for (boolean bool = true;; bool = false)
    {
      d(bool);
      m(paramView.d());
      paramView = this.l.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
      if (paramView.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
        e(true);
      }
      i1 = paramView.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
      if (i1 != 0) {
        a(i1);
      }
      paramView.recycle();
      return;
      i1 = 0;
      break;
    }
  }
  
  private cd b(View paramView)
  {
    if ((paramView instanceof cd)) {
      return (cd)paramView;
    }
    if ((paramView instanceof Toolbar)) {
      return ((Toolbar)paramView).getWrapper();
    }
    if ("Can't make a decor toolbar out of " + paramView != null) {}
    for (paramView = paramView.getClass().getSimpleName();; paramView = "null") {
      throw new IllegalStateException(paramView);
    }
  }
  
  private static boolean b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {}
    while ((!paramBoolean1) && (!paramBoolean2)) {
      return true;
    }
    return false;
  }
  
  private void m(boolean paramBoolean)
  {
    boolean bool = true;
    this.A = paramBoolean;
    int i1;
    label45:
    label78:
    Object localObject;
    if (!this.A)
    {
      this.r.a(null);
      this.q.setTabContainer(this.u);
      if (j() != 2) {
        break label155;
      }
      i1 = 1;
      if (this.u != null)
      {
        if (i1 == 0) {
          break label160;
        }
        this.u.setVisibility(0);
        if (this.p != null) {
          cb.w(this.p);
        }
      }
      localObject = this.r;
      if ((this.A) || (i1 == 0)) {
        break label172;
      }
      paramBoolean = true;
      label97:
      ((cd)localObject).a(paramBoolean);
      localObject = this.p;
      if ((this.A) || (i1 == 0)) {
        break label177;
      }
    }
    label155:
    label160:
    label172:
    label177:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(paramBoolean);
      return;
      this.q.setTabContainer(null);
      this.r.a(this.u);
      break;
      i1 = 0;
      break label45;
      this.u.setVisibility(8);
      break label78;
      paramBoolean = false;
      break label97;
    }
  }
  
  private void n(boolean paramBoolean)
  {
    if (b(this.D, this.E, this.F)) {
      if (!this.G)
      {
        this.G = true;
        j(paramBoolean);
      }
    }
    while (!this.G) {
      return;
    }
    this.G = false;
    k(paramBoolean);
  }
  
  private void p()
  {
    if (!this.F)
    {
      this.F = true;
      if (this.p != null) {
        this.p.setShowingForActionMode(true);
      }
      n(false);
    }
  }
  
  private void q()
  {
    if (this.F)
    {
      this.F = false;
      if (this.p != null) {
        this.p.setShowingForActionMode(false);
      }
      n(false);
    }
  }
  
  public int a()
  {
    return this.r.o();
  }
  
  public b a(android.support.v7.view.c paramc)
  {
    if (this.a != null) {
      this.a.c();
    }
    this.p.setHideOnContentScrollEnabled(false);
    this.s.c();
    paramc = new bz(this, this.s.getContext(), paramc);
    if (paramc.e())
    {
      paramc.d();
      this.s.a(paramc);
      l(true);
      this.s.sendAccessibilityEvent(32);
      this.a = paramc;
      return paramc;
    }
    return null;
  }
  
  public void a(float paramFloat)
  {
    cb.j(this.q, paramFloat);
  }
  
  public void a(int paramInt)
  {
    this.r.d(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = this.r.o();
    if ((paramInt2 & 0x4) != 0) {
      this.x = true;
    }
    this.r.c(i1 & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public void a(Configuration paramConfiguration)
  {
    m(android.support.v7.view.a.a(this.l).d());
  }
  
  public void a(Drawable paramDrawable)
  {
    this.r.b(paramDrawable);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.r.a(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 2;; i1 = 0)
    {
      a(i1, 2);
      return;
    }
  }
  
  public void b(int paramInt)
  {
    this.B = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 4;; i1 = 0)
    {
      a(i1, 4);
      return;
    }
  }
  
  public boolean b()
  {
    int i1 = k();
    return (this.G) && ((i1 == 0) || (d() < i1));
  }
  
  public Context c()
  {
    int i1;
    if (this.m == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.l.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0) {
        break label61;
      }
    }
    label61:
    for (this.m = new ContextThemeWrapper(this.l, i1);; this.m = this.l) {
      return this.m;
    }
  }
  
  public void c(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 8;; i1 = 0)
    {
      a(i1, 8);
      return;
    }
  }
  
  public int d()
  {
    return this.p.getActionBarHideOffset();
  }
  
  public void d(boolean paramBoolean)
  {
    this.r.b(paramBoolean);
  }
  
  public void e(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.p.a())) {
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    this.d = paramBoolean;
    this.p.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public void f(boolean paramBoolean)
  {
    if (!this.x) {
      b(paramBoolean);
    }
  }
  
  public boolean f()
  {
    if ((this.r != null) && (this.r.c()))
    {
      this.r.d();
      return true;
    }
    return false;
  }
  
  public void g(boolean paramBoolean)
  {
    this.I = paramBoolean;
    if ((!paramBoolean) && (this.H != null)) {
      this.H.b();
    }
  }
  
  public boolean g()
  {
    ViewGroup localViewGroup = this.r.a();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  public void h(boolean paramBoolean)
  {
    if (paramBoolean == this.y) {}
    for (;;)
    {
      return;
      this.y = paramBoolean;
      int i2 = this.z.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((c)this.z.get(i1)).a(paramBoolean);
        i1 += 1;
      }
    }
  }
  
  void i()
  {
    if (this.c != null)
    {
      this.c.a(this.b);
      this.b = null;
      this.c = null;
    }
  }
  
  public void i(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  public int j()
  {
    return this.r.p();
  }
  
  public void j(boolean paramBoolean)
  {
    if (this.H != null) {
      this.H.b();
    }
    this.q.setVisibility(0);
    if ((this.B == 0) && (k) && ((this.I) || (paramBoolean)))
    {
      cb.b(this.q, 0.0F);
      float f2 = -this.q.getHeight();
      float f1 = f2;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp77_75 = localObject;
        tmp77_75[0] = 0;
        Object tmp81_77 = tmp77_75;
        tmp81_77[1] = 0;
        tmp81_77;
        this.q.getLocationInWindow((int[])localObject);
        f1 = f2 - localObject[1];
      }
      cb.b(this.q, f1);
      Object localObject = new l();
      en localen = cb.s(this.q).c(0.0F);
      localen.a(this.g);
      ((l)localObject).a(localen);
      if ((this.C) && (this.t != null))
      {
        cb.b(this.t, f1);
        ((l)localObject).a(cb.s(this.t).c(0.0F));
      }
      ((l)localObject).a(j);
      ((l)localObject).a(250L);
      ((l)localObject).a(this.f);
      this.H = ((l)localObject);
      ((l)localObject).a();
    }
    for (;;)
    {
      if (this.p != null) {
        cb.w(this.p);
      }
      return;
      cb.c(this.q, 1.0F);
      cb.b(this.q, 0.0F);
      if ((this.C) && (this.t != null)) {
        cb.b(this.t, 0.0F);
      }
      this.f.b(null);
    }
  }
  
  public int k()
  {
    return this.q.getHeight();
  }
  
  public void k(boolean paramBoolean)
  {
    if (this.H != null) {
      this.H.b();
    }
    if ((this.B == 0) && (k) && ((this.I) || (paramBoolean)))
    {
      cb.c(this.q, 1.0F);
      this.q.setTransitioning(true);
      l locall = new l();
      float f2 = -this.q.getHeight();
      float f1 = f2;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp86_84 = localObject;
        tmp86_84[0] = 0;
        Object tmp90_86 = tmp86_84;
        tmp90_86[1] = 0;
        tmp90_86;
        this.q.getLocationInWindow((int[])localObject);
        f1 = f2 - localObject[1];
      }
      Object localObject = cb.s(this.q).c(f1);
      ((en)localObject).a(this.g);
      locall.a((en)localObject);
      if ((this.C) && (this.t != null)) {
        locall.a(cb.s(this.t).c(f1));
      }
      locall.a(i);
      locall.a(250L);
      locall.a(this.e);
      this.H = locall;
      locall.a();
      return;
    }
    this.e.b(null);
  }
  
  public void l()
  {
    if (this.E)
    {
      this.E = false;
      n(true);
    }
  }
  
  public void l(boolean paramBoolean)
  {
    en localen1;
    en localen2;
    if (paramBoolean)
    {
      p();
      if (!paramBoolean) {
        break label68;
      }
      localen1 = this.r.a(4, 100L);
      localen2 = this.s.a(0, 200L);
    }
    for (;;)
    {
      l locall = new l();
      locall.a(localen1, localen2);
      locall.a();
      return;
      q();
      break;
      label68:
      localen2 = this.r.a(0, 200L);
      localen1 = this.s.a(8, 100L);
    }
  }
  
  public void m()
  {
    if (!this.E)
    {
      this.E = true;
      n(true);
    }
  }
  
  public void n()
  {
    if (this.H != null)
    {
      this.H.b();
      this.H = null;
    }
  }
  
  public void o() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */