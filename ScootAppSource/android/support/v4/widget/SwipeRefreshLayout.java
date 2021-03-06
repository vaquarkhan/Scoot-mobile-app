package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.bf;
import android.support.v4.view.bo;
import android.support.v4.view.bp;
import android.support.v4.view.bq;
import android.support.v4.view.br;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

public class SwipeRefreshLayout
  extends ViewGroup
  implements bo, bq
{
  private static final String c = SwipeRefreshLayout.class.getSimpleName();
  private static final int[] y = { 16842766 };
  private int A = -1;
  private float B;
  private av C;
  private Animation D;
  private Animation E;
  private Animation F;
  private Animation G;
  private Animation H;
  private float I;
  private boolean J;
  private int K;
  private int L;
  private boolean M;
  private Animation.AnimationListener N = new bw(this);
  private final Animation O = new cb(this);
  private final Animation P = new cc(this);
  protected int a;
  protected int b;
  private View d;
  private ce e;
  private boolean f = false;
  private int g;
  private float h = -1.0F;
  private float i;
  private final br j;
  private final bp k;
  private final int[] l = new int[2];
  private final int[] m = new int[2];
  private boolean n;
  private int o;
  private int p;
  private boolean q = false;
  private float r;
  private float s;
  private boolean t;
  private int u = -1;
  private boolean v;
  private boolean w;
  private final DecelerateInterpolator x;
  private e z;
  
  public SwipeRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.o = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.x = new DecelerateInterpolator(2.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, y);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
    paramContext = getResources().getDisplayMetrics();
    this.K = ((int)(paramContext.density * 40.0F));
    this.L = ((int)(paramContext.density * 40.0F));
    c();
    android.support.v4.view.cb.a(this, true);
    this.I = (paramContext.density * 64.0F);
    this.h = this.I;
    this.j = new br(this);
    this.k = new bp(this);
    setNestedScrollingEnabled(true);
  }
  
  private float a(MotionEvent paramMotionEvent, int paramInt)
  {
    paramInt = bf.a(paramMotionEvent, paramInt);
    if (paramInt < 0) {
      return -1.0F;
    }
    return bf.d(paramMotionEvent, paramInt);
  }
  
  private Animation a(int paramInt1, int paramInt2)
  {
    if ((this.v) && (d())) {
      return null;
    }
    bz localbz = new bz(this, paramInt1, paramInt2);
    localbz.setDuration(300L);
    this.z.a(null);
    this.z.clearAnimation();
    this.z.startAnimation(localbz);
    return localbz;
  }
  
  private void a(float paramFloat)
  {
    this.C.a(true);
    float f2 = Math.min(1.0F, Math.abs(paramFloat / this.h));
    float f3 = (float)Math.max(f2 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f4 = Math.abs(paramFloat);
    float f5 = this.h;
    float f1;
    int i1;
    int i2;
    if (this.M)
    {
      f1 = this.I - this.b;
      f4 = Math.max(0.0F, Math.min(f4 - f5, f1 * 2.0F) / f1);
      f4 = (float)(f4 / 4.0F - Math.pow(f4 / 4.0F, 2.0D)) * 2.0F;
      i1 = this.b;
      i2 = (int)(f1 * f2 + f1 * f4 * 2.0F);
      if (this.z.getVisibility() != 0) {
        this.z.setVisibility(0);
      }
      if (!this.v)
      {
        android.support.v4.view.cb.g(this.z, 1.0F);
        android.support.v4.view.cb.h(this.z, 1.0F);
      }
      if (this.v) {
        setAnimationProgress(Math.min(1.0F, paramFloat / this.h));
      }
      if (paramFloat >= this.h) {
        break label318;
      }
      if ((this.C.getAlpha() > 76) && (!a(this.F))) {
        e();
      }
    }
    for (;;)
    {
      this.C.a(0.0F, Math.min(0.8F, f3 * 0.8F));
      this.C.a(Math.min(1.0F, f3));
      this.C.b((-0.25F + f3 * 0.4F + f4 * 2.0F) * 0.5F);
      a(i2 + i1 - this.p, true);
      return;
      f1 = this.I;
      break;
      label318:
      if ((this.C.getAlpha() < 255) && (!a(this.G))) {
        f();
      }
    }
  }
  
  private void a(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.a = paramInt;
    this.O.reset();
    this.O.setDuration(200L);
    this.O.setInterpolator(this.x);
    if (paramAnimationListener != null) {
      this.z.a(paramAnimationListener);
    }
    this.z.clearAnimation();
    this.z.startAnimation(this.O);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    this.z.bringToFront();
    this.z.offsetTopAndBottom(paramInt);
    this.p = this.z.getTop();
    if ((paramBoolean) && (Build.VERSION.SDK_INT < 11)) {
      invalidate();
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = bf.b(paramMotionEvent);
    if (bf.b(paramMotionEvent, i1) == this.u) {
      if (i1 != 0) {
        break label33;
      }
    }
    label33:
    for (i1 = 1;; i1 = 0)
    {
      this.u = bf.b(paramMotionEvent, i1);
      return;
    }
  }
  
  private void a(Animation.AnimationListener paramAnimationListener)
  {
    this.z.setVisibility(0);
    if (Build.VERSION.SDK_INT >= 11) {
      this.C.setAlpha(255);
    }
    this.D = new bx(this);
    this.D.setDuration(this.o);
    if (paramAnimationListener != null) {
      this.z.a(paramAnimationListener);
    }
    this.z.clearAnimation();
    this.z.startAnimation(this.D);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f != paramBoolean1)
    {
      this.J = paramBoolean2;
      g();
      this.f = paramBoolean1;
      if (this.f) {
        a(this.p, this.N);
      }
    }
    else
    {
      return;
    }
    b(this.N);
  }
  
  private boolean a(Animation paramAnimation)
  {
    return (paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded());
  }
  
  private void b()
  {
    this.z.clearAnimation();
    this.C.stop();
    this.z.setVisibility(8);
    setColorViewAlpha(255);
    if (this.v) {
      setAnimationProgress(0.0F);
    }
    for (;;)
    {
      this.p = this.z.getTop();
      return;
      a(this.b - this.p, true);
    }
  }
  
  private void b(float paramFloat)
  {
    if (paramFloat > this.h)
    {
      a(true, true);
      return;
    }
    this.f = false;
    this.C.a(0.0F, 0.0F);
    ca localca = null;
    if (!this.v) {
      localca = new ca(this);
    }
    b(this.p, localca);
    this.C.a(false);
  }
  
  private void b(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    if (this.v)
    {
      c(paramInt, paramAnimationListener);
      return;
    }
    this.a = paramInt;
    this.P.reset();
    this.P.setDuration(200L);
    this.P.setInterpolator(this.x);
    if (paramAnimationListener != null) {
      this.z.a(paramAnimationListener);
    }
    this.z.clearAnimation();
    this.z.startAnimation(this.P);
  }
  
  private void b(Animation.AnimationListener paramAnimationListener)
  {
    this.E = new by(this);
    this.E.setDuration(150L);
    this.z.a(paramAnimationListener);
    this.z.clearAnimation();
    this.z.startAnimation(this.E);
  }
  
  private void c()
  {
    this.z = new e(getContext(), -328966, 20.0F);
    this.C = new av(getContext(), this);
    this.C.b(-328966);
    this.z.setImageDrawable(this.C);
    this.z.setVisibility(8);
    addView(this.z);
  }
  
  private void c(float paramFloat)
  {
    a(this.a + (int)((this.b - this.a) * paramFloat) - this.z.getTop(), false);
  }
  
  private void c(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.a = paramInt;
    if (d()) {}
    for (this.B = this.C.getAlpha();; this.B = android.support.v4.view.cb.t(this.z))
    {
      this.H = new cd(this);
      this.H.setDuration(150L);
      if (paramAnimationListener != null) {
        this.z.a(paramAnimationListener);
      }
      this.z.clearAnimation();
      this.z.startAnimation(this.H);
      return;
    }
  }
  
  private boolean d()
  {
    return Build.VERSION.SDK_INT < 11;
  }
  
  private void e()
  {
    this.F = a(this.C.getAlpha(), 76);
  }
  
  private void f()
  {
    this.G = a(this.C.getAlpha(), 255);
  }
  
  private void g()
  {
    int i1;
    if (this.d == null) {
      i1 = 0;
    }
    for (;;)
    {
      if (i1 < getChildCount())
      {
        View localView = getChildAt(i1);
        if (!localView.equals(this.z)) {
          this.d = localView;
        }
      }
      else
      {
        return;
      }
      i1 += 1;
    }
  }
  
  private void setAnimationProgress(float paramFloat)
  {
    if (d())
    {
      setColorViewAlpha((int)(255.0F * paramFloat));
      return;
    }
    android.support.v4.view.cb.g(this.z, paramFloat);
    android.support.v4.view.cb.h(this.z, paramFloat);
  }
  
  private void setColorViewAlpha(int paramInt)
  {
    this.z.getBackground().setAlpha(paramInt);
    this.C.setAlpha(paramInt);
  }
  
  public boolean a()
  {
    boolean bool = false;
    if (Build.VERSION.SDK_INT < 14)
    {
      if ((this.d instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)this.d;
        return (localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop()));
      }
      if ((android.support.v4.view.cb.b(this.d, -1)) || (this.d.getScrollY() > 0)) {
        bool = true;
      }
      return bool;
    }
    return android.support.v4.view.cb.b(this.d, -1);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.k.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.k.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.k.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.k.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.A < 0) {}
    do
    {
      return paramInt2;
      if (paramInt2 == paramInt1 - 1) {
        return this.A;
      }
    } while (paramInt2 < this.A);
    return paramInt2 + 1;
  }
  
  public int getNestedScrollAxes()
  {
    return this.j.a();
  }
  
  public int getProgressCircleDiameter()
  {
    if (this.z != null) {
      return this.z.getMeasuredHeight();
    }
    return 0;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.k.b();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.k.a();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    g();
    int i1 = bf.a(paramMotionEvent);
    if ((this.w) && (i1 == 0)) {
      this.w = false;
    }
    if ((!isEnabled()) || (this.w) || (a()) || (this.f) || (this.n)) {
      return false;
    }
    switch (i1)
    {
    }
    for (;;)
    {
      return this.t;
      a(this.b - this.z.getTop(), true);
      this.u = bf.b(paramMotionEvent, 0);
      this.t = false;
      float f1 = a(paramMotionEvent, this.u);
      if (f1 == -1.0F) {
        break;
      }
      this.s = f1;
      continue;
      if (this.u == -1)
      {
        Log.e(c, "Got ACTION_MOVE event but don't have an active pointer id.");
        return false;
      }
      f1 = a(paramMotionEvent, this.u);
      if (f1 == -1.0F) {
        break;
      }
      if ((f1 - this.s > this.g) && (!this.t))
      {
        this.r = (this.s + this.g);
        this.t = true;
        this.C.setAlpha(76);
        continue;
        a(paramMotionEvent);
        continue;
        this.t = false;
        this.u = -1;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    if (getChildCount() == 0) {}
    do
    {
      return;
      if (this.d == null) {
        g();
      }
    } while (this.d == null);
    View localView = this.d;
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    localView.layout(paramInt3, paramInt4, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt3, paramInt2 - getPaddingTop() - getPaddingBottom() + paramInt4);
    paramInt2 = this.z.getMeasuredWidth();
    paramInt3 = this.z.getMeasuredHeight();
    this.z.layout(paramInt1 / 2 - paramInt2 / 2, this.p, paramInt1 / 2 + paramInt2 / 2, this.p + paramInt3);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.d == null) {
      g();
    }
    if (this.d == null) {}
    for (;;)
    {
      return;
      this.d.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.z.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
      if ((!this.M) && (!this.q))
      {
        this.q = true;
        paramInt1 = -this.z.getMeasuredHeight();
        this.b = paramInt1;
        this.p = paramInt1;
      }
      this.A = -1;
      paramInt1 = 0;
      while (paramInt1 < getChildCount())
      {
        if (getChildAt(paramInt1) == this.z)
        {
          this.A = paramInt1;
          return;
        }
        paramInt1 += 1;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramInt2 > 0) && (this.i > 0.0F))
    {
      if (paramInt2 <= this.i) {
        break label141;
      }
      paramArrayOfInt[1] = (paramInt2 - (int)this.i);
      this.i = 0.0F;
    }
    for (;;)
    {
      a(this.i);
      if ((this.M) && (paramInt2 > 0) && (this.i == 0.0F) && (Math.abs(paramInt2 - paramArrayOfInt[1]) > 0)) {
        this.z.setVisibility(8);
      }
      paramView = this.l;
      if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], paramView, null))
      {
        paramArrayOfInt[0] += paramView[0];
        paramInt1 = paramArrayOfInt[1];
        paramView[1] += paramInt1;
      }
      return;
      label141:
      this.i -= paramInt2;
      paramArrayOfInt[1] = paramInt2;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.m);
    paramInt1 = this.m[1] + paramInt4;
    if ((paramInt1 < 0) && (!a()))
    {
      float f1 = this.i;
      this.i = (Math.abs(paramInt1) + f1);
      a(this.i);
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.j.a(paramView1, paramView2, paramInt);
    startNestedScroll(paramInt & 0x2);
    this.i = 0.0F;
    this.n = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (isEnabled()) && (!this.w) && (!this.f) && ((paramInt & 0x2) != 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.j.a(paramView);
    this.n = false;
    if (this.i > 0.0F)
    {
      b(this.i);
      this.i = 0.0F;
    }
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = bf.a(paramMotionEvent);
    if ((this.w) && (i1 == 0)) {
      this.w = false;
    }
    if ((!isEnabled()) || (this.w) || (a()) || (this.n)) {
      return false;
    }
    switch (i1)
    {
    case 3: 
    case 4: 
    default: 
    case 0: 
    case 2: 
    case 5: 
    case 6: 
      for (;;)
      {
        return true;
        this.u = bf.b(paramMotionEvent, 0);
        this.t = false;
        continue;
        i1 = bf.a(paramMotionEvent, this.u);
        if (i1 < 0)
        {
          Log.e(c, "Got ACTION_MOVE event but have an invalid active pointer id.");
          return false;
        }
        f1 = (bf.d(paramMotionEvent, i1) - this.r) * 0.5F;
        if (this.t)
        {
          if (f1 <= 0.0F) {
            break;
          }
          a(f1);
          continue;
          i1 = bf.b(paramMotionEvent);
          if (i1 < 0)
          {
            Log.e(c, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
            return false;
          }
          this.u = bf.b(paramMotionEvent, i1);
          continue;
          a(paramMotionEvent);
        }
      }
    }
    i1 = bf.a(paramMotionEvent, this.u);
    if (i1 < 0)
    {
      Log.e(c, "Got ACTION_UP event but don't have an active pointer id.");
      return false;
    }
    float f1 = bf.d(paramMotionEvent, i1);
    float f2 = this.r;
    this.t = false;
    b((f1 - f2) * 0.5F);
    this.u = -1;
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (((Build.VERSION.SDK_INT < 21) && ((this.d instanceof AbsListView))) || ((this.d != null) && (!android.support.v4.view.cb.D(this.d)))) {
      return;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  @Deprecated
  public void setColorScheme(int... paramVarArgs)
  {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    g();
    this.C.a(paramVarArgs);
  }
  
  public void setColorSchemeResources(int... paramVarArgs)
  {
    Resources localResources = getResources();
    int[] arrayOfInt = new int[paramVarArgs.length];
    int i1 = 0;
    while (i1 < paramVarArgs.length)
    {
      arrayOfInt[i1] = localResources.getColor(paramVarArgs[i1]);
      i1 += 1;
    }
    setColorSchemeColors(arrayOfInt);
  }
  
  public void setDistanceToTriggerSync(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.k.a(paramBoolean);
  }
  
  public void setOnRefreshListener(ce paramce)
  {
    this.e = paramce;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(int paramInt)
  {
    this.z.setBackgroundColor(paramInt);
    this.C.b(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(int paramInt)
  {
    setProgressBackgroundColorSchemeColor(getResources().getColor(paramInt));
  }
  
  public void setRefreshing(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.f != paramBoolean))
    {
      this.f = paramBoolean;
      if (!this.M) {}
      for (int i1 = (int)(this.I + this.b);; i1 = (int)this.I)
      {
        a(i1 - this.p, true);
        this.J = false;
        a(this.N);
        return;
      }
    }
    a(paramBoolean, false);
  }
  
  public void setSize(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      return;
    }
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    int i1;
    if (paramInt == 0)
    {
      i1 = (int)(localDisplayMetrics.density * 56.0F);
      this.K = i1;
    }
    for (this.L = i1;; this.L = i1)
    {
      this.z.setImageDrawable(null);
      this.C.a(paramInt);
      this.z.setImageDrawable(this.C);
      return;
      i1 = (int)(localDisplayMetrics.density * 40.0F);
      this.K = i1;
    }
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.k.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.k.c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\SwipeRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */