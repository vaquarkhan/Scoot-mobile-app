package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.R.anim;
import android.support.design.R.layout;
import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class Snackbar
{
  private static final Handler a = new Handler(Looper.getMainLooper(), new ay());
  private final ViewGroup b;
  private final Context c;
  private final Snackbar.SnackbarLayout d;
  private int e;
  private bk f;
  private final AccessibilityManager g;
  private final bp h = new bb(this);
  
  private Snackbar(ViewGroup paramViewGroup)
  {
    this.b = paramViewGroup;
    this.c = paramViewGroup.getContext();
    ce.a(this.c);
    this.d = ((Snackbar.SnackbarLayout)LayoutInflater.from(this.c).inflate(R.layout.design_layout_snackbar, this.b, false));
    this.g = ((AccessibilityManager)this.c.getSystemService("accessibility"));
  }
  
  public static Snackbar a(View paramView, int paramInt1, int paramInt2)
  {
    return a(paramView, paramView.getResources().getText(paramInt1), paramInt2);
  }
  
  public static Snackbar a(View paramView, CharSequence paramCharSequence, int paramInt)
  {
    paramView = new Snackbar(a(paramView));
    paramView.a(paramCharSequence);
    paramView.a(paramInt);
    return paramView;
  }
  
  private static ViewGroup a(View paramView)
  {
    Object localObject2 = null;
    View localView = paramView;
    if ((localView instanceof CoordinatorLayout)) {
      return (ViewGroup)localView;
    }
    Object localObject1 = localObject2;
    if ((localView instanceof FrameLayout))
    {
      if (localView.getId() == 16908290) {
        return (ViewGroup)localView;
      }
      localObject1 = (ViewGroup)localView;
    }
    paramView = localView;
    if (localView != null)
    {
      paramView = localView.getParent();
      if (!(paramView instanceof View)) {
        break label77;
      }
    }
    label77:
    for (paramView = (View)paramView;; paramView = null)
    {
      localView = paramView;
      localObject2 = localObject1;
      if (paramView != null) {
        break;
      }
      return (ViewGroup)localObject1;
    }
  }
  
  private void c(int paramInt)
  {
    bn.a().a(this.h, paramInt);
  }
  
  private void d(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      cb.s(this.d).c(this.d.getHeight()).a(a.b).a(250L).a(new bi(this, paramInt)).c();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.d.getContext(), R.anim.design_snackbar_out);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new az(this, paramInt));
    this.d.startAnimation(localAnimation);
  }
  
  private void e()
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      cb.b(this.d, this.d.getHeight());
      cb.s(this.d).c(0.0F).a(a.b).a(250L).a(new bg(this)).c();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.d.getContext(), R.anim.design_snackbar_in);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new bh(this));
    this.d.startAnimation(localAnimation);
  }
  
  private void e(int paramInt)
  {
    bn.a().a(this.h);
    if (this.f != null) {
      this.f.a(this, paramInt);
    }
    ViewParent localViewParent = this.d.getParent();
    if ((localViewParent instanceof ViewGroup)) {
      ((ViewGroup)localViewParent).removeView(this.d);
    }
  }
  
  private void f()
  {
    bn.a().b(this.h);
    if (this.f != null) {
      this.f.a(this);
    }
  }
  
  private boolean g()
  {
    return !this.g.isEnabled();
  }
  
  public Snackbar a(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public Snackbar a(int paramInt, View.OnClickListener paramOnClickListener)
  {
    return a(this.c.getText(paramInt), paramOnClickListener);
  }
  
  public Snackbar a(CharSequence paramCharSequence)
  {
    this.d.getMessageView().setText(paramCharSequence);
    return this;
  }
  
  public Snackbar a(CharSequence paramCharSequence, View.OnClickListener paramOnClickListener)
  {
    Button localButton = this.d.getActionView();
    if ((TextUtils.isEmpty(paramCharSequence)) || (paramOnClickListener == null))
    {
      localButton.setVisibility(8);
      localButton.setOnClickListener(null);
      return this;
    }
    localButton.setVisibility(0);
    localButton.setText(paramCharSequence);
    localButton.setOnClickListener(new ba(this, paramOnClickListener));
    return this;
  }
  
  public void a()
  {
    bn.a().a(this.e, this.h);
  }
  
  final void b(int paramInt)
  {
    if ((g()) && (this.d.getVisibility() == 0))
    {
      d(paramInt);
      return;
    }
    e(paramInt);
  }
  
  public boolean b()
  {
    return bn.a().e(this.h);
  }
  
  final void c()
  {
    if (this.d.getParent() == null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.d.getLayoutParams();
      if ((localLayoutParams instanceof u))
      {
        bj localbj = new bj(this);
        localbj.a(0.1F);
        localbj.b(0.6F);
        localbj.a(0);
        localbj.a(new bc(this));
        ((u)localLayoutParams).a(localbj);
      }
      this.b.addView(this.d);
    }
    this.d.setOnAttachStateChangeListener(new bd(this));
    if (cb.F(this.d))
    {
      if (g())
      {
        e();
        return;
      }
      f();
      return;
    }
    this.d.setOnLayoutChangeListener(new bf(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\Snackbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */