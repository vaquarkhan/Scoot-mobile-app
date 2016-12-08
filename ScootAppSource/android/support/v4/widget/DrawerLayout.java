package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.b.c;
import android.support.v4.c.a.a;
import android.support.v4.view.bf;
import android.support.v4.view.cb;
import android.support.v4.view.dj;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
  implements ag
{
  static final w a;
  private static final int[] b;
  private static final boolean c;
  private static final boolean d;
  private float A;
  private Drawable B;
  private Drawable C;
  private Drawable D;
  private CharSequence E;
  private CharSequence F;
  private Object G;
  private boolean H;
  private Drawable I = null;
  private Drawable J = null;
  private Drawable K = null;
  private Drawable L = null;
  private final ArrayList<View> M;
  private final v e = new v(this);
  private float f;
  private int g;
  private int h = -1728053248;
  private float i;
  private Paint j = new Paint();
  private final cp k;
  private final cp l;
  private final ac m;
  private final ac n;
  private int o;
  private boolean p;
  private boolean q = true;
  private int r = 3;
  private int s = 3;
  private int t = 3;
  private int u = 3;
  private boolean v;
  private boolean w;
  @Deprecated
  private z x;
  private List<z> y;
  private float z;
  
  static
  {
    boolean bool2 = true;
    b = new int[] { 16842931 };
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool1 = true;
      c = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label65;
      }
    }
    label65:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      d = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label70;
      }
      a = new x();
      return;
      bool1 = false;
      break;
    }
    label70:
    a = new y();
  }
  
  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.g = ((int)(64.0F * f1 + 0.5F));
    float f2 = 400.0F * f1;
    this.m = new ac(this, 3);
    this.n = new ac(this, 5);
    this.k = cp.a(this, 1.0F, this.m);
    this.k.a(1);
    this.k.a(f2);
    this.m.a(this.k);
    this.l = cp.a(this, 1.0F, this.n);
    this.l.a(2);
    this.l.a(f2);
    this.n.a(this.l);
    setFocusableInTouchMode(true);
    cb.c(this, 1);
    cb.a(this, new u(this));
    dj.a(this, false);
    if (cb.x(this))
    {
      a.a(this);
      this.B = a.a(paramContext);
    }
    this.f = (f1 * 10.0F);
    this.M = new ArrayList();
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (((!paramBoolean) && (!g(localView))) || ((paramBoolean) && (localView == paramView))) {
        cb.c(localView, 1);
      }
      for (;;)
      {
        i1 += 1;
        break;
        cb.c(localView, 4);
      }
    }
  }
  
  private boolean a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable == null) || (!a.b(paramDrawable))) {
      return false;
    }
    a.b(paramDrawable, paramInt);
    return true;
  }
  
  static String d(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private void f()
  {
    if (d) {
      return;
    }
    this.C = g();
    this.D = h();
  }
  
  private Drawable g()
  {
    int i1 = cb.h(this);
    if (i1 == 0)
    {
      if (this.I != null)
      {
        a(this.I, i1);
        return this.I;
      }
    }
    else if (this.J != null)
    {
      a(this.J, i1);
      return this.J;
    }
    return this.K;
  }
  
  private Drawable h()
  {
    int i1 = cb.h(this);
    if (i1 == 0)
    {
      if (this.J != null)
      {
        a(this.J, i1);
        return this.J;
      }
    }
    else if (this.I != null)
    {
      a(this.I, i1);
      return this.I;
    }
    return this.L;
  }
  
  private boolean i()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      if (aa.c((aa)getChildAt(i1).getLayoutParams())) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  private boolean j()
  {
    return k() != null;
  }
  
  private View k()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if ((g(localView)) && (k(localView))) {
        return localView;
      }
      i1 += 1;
    }
    return null;
  }
  
  private static boolean m(View paramView)
  {
    boolean bool2 = false;
    paramView = paramView.getBackground();
    boolean bool1 = bool2;
    if (paramView != null)
    {
      bool1 = bool2;
      if (paramView.getOpacity() == -1) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static boolean n(View paramView)
  {
    return (cb.e(paramView) != 4) && (cb.e(paramView) != 2);
  }
  
  public int a(int paramInt)
  {
    int i1 = cb.h(this);
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      if (this.r != 3) {
        return this.r;
      }
      if (i1 == 0) {}
      for (paramInt = this.t; paramInt != 3; paramInt = this.u) {
        return paramInt;
      }
      if (this.s != 3) {
        return this.s;
      }
      if (i1 == 0) {}
      for (paramInt = this.u; paramInt != 3; paramInt = this.t) {
        return paramInt;
      }
      if (this.t != 3) {
        return this.t;
      }
      if (i1 == 0) {}
      for (paramInt = this.r; paramInt != 3; paramInt = this.s) {
        return paramInt;
      }
      if (this.u != 3) {
        return this.u;
      }
      if (i1 == 0) {}
      for (paramInt = this.s; paramInt != 3; paramInt = this.r) {
        return paramInt;
      }
    }
  }
  
  public int a(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return a(((aa)paramView.getLayoutParams()).a);
  }
  
  View a()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if ((aa.b((aa)localView.getLayoutParams()) & 0x1) == 1) {
        return localView;
      }
      i1 += 1;
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = android.support.v4.view.v.a(paramInt2, cb.h(this));
    Object localObject;
    switch (paramInt2)
    {
    default: 
      if (paramInt1 != 0)
      {
        if (i1 == 3)
        {
          localObject = this.k;
          label67:
          ((cp)localObject).e();
        }
      }
      else {
        switch (paramInt1)
        {
        }
      }
      break;
    }
    do
    {
      do
      {
        return;
        this.r = paramInt1;
        break;
        this.s = paramInt1;
        break;
        this.t = paramInt1;
        break;
        this.u = paramInt1;
        break;
        localObject = this.l;
        break label67;
        localObject = c(i1);
      } while (localObject == null);
      h((View)localObject);
      return;
      localObject = c(i1);
    } while (localObject == null);
    i((View)localObject);
  }
  
  void a(int paramInt1, int paramInt2, View paramView)
  {
    paramInt1 = this.k.a();
    int i1 = this.l.a();
    aa localaa;
    if ((paramInt1 == 1) || (i1 == 1))
    {
      paramInt1 = 1;
      if ((paramView != null) && (paramInt2 == 0))
      {
        localaa = (aa)paramView.getLayoutParams();
        if (aa.a(localaa) != 0.0F) {
          break label145;
        }
        b(paramView);
      }
    }
    for (;;)
    {
      if (paramInt1 == this.o) {
        return;
      }
      this.o = paramInt1;
      if (this.y == null) {
        return;
      }
      paramInt2 = this.y.size() - 1;
      while (paramInt2 >= 0)
      {
        ((z)this.y.get(paramInt2)).a(paramInt1);
        paramInt2 -= 1;
      }
      if ((paramInt1 == 2) || (i1 == 2))
      {
        paramInt1 = 2;
        break;
      }
      paramInt1 = 0;
      break;
      label145:
      if (aa.a(localaa) == 1.0F) {
        c(paramView);
      }
    }
  }
  
  public void a(z paramz)
  {
    if (paramz == null) {
      return;
    }
    if (this.y == null) {
      this.y = new ArrayList();
    }
    this.y.add(paramz);
  }
  
  void a(View paramView, float paramFloat)
  {
    if (this.y != null)
    {
      int i1 = this.y.size() - 1;
      while (i1 >= 0)
      {
        ((z)this.y.get(i1)).a(paramView, paramFloat);
        i1 -= 1;
      }
    }
  }
  
  public void a(Object paramObject, boolean paramBoolean)
  {
    this.G = paramObject;
    this.H = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      requestLayout();
      return;
    }
  }
  
  void a(boolean paramBoolean)
  {
    int i5 = getChildCount();
    int i2 = 0;
    int i1 = 0;
    while (i2 < i5)
    {
      View localView = getChildAt(i2);
      aa localaa = (aa)localView.getLayoutParams();
      int i3 = i1;
      if (g(localView))
      {
        if ((paramBoolean) && (!aa.c(localaa))) {
          i3 = i1;
        }
      }
      else
      {
        i2 += 1;
        i1 = i3;
        continue;
      }
      int i4 = localView.getWidth();
      if (a(localView, 3)) {
        i1 |= this.k.a(localView, -i4, localView.getTop());
      }
      for (;;)
      {
        aa.a(localaa, false);
        i4 = i1;
        break;
        i1 |= this.l.a(localView, getWidth(), localView.getTop());
      }
    }
    this.m.a();
    this.n.a();
    if (i1 != 0) {
      invalidate();
    }
  }
  
  boolean a(View paramView, int paramInt)
  {
    return (e(paramView) & paramInt) == paramInt;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i3 = 0;
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i4 = getChildCount();
    int i1 = 0;
    int i2 = 0;
    View localView;
    if (i1 < i4)
    {
      localView = getChildAt(i1);
      if (g(localView)) {
        if (j(localView))
        {
          i2 = 1;
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.M.add(localView);
      }
    }
    if (i2 == 0)
    {
      i2 = this.M.size();
      i1 = i3;
      while (i1 < i2)
      {
        localView = (View)this.M.get(i1);
        if (localView.getVisibility() == 0) {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        i1 += 1;
      }
    }
    this.M.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((a() != null) || (g(paramView))) {
      cb.c(paramView, 4);
    }
    for (;;)
    {
      if (!c) {
        cb.a(paramView, this.e);
      }
      return;
      cb.c(paramView, 1);
    }
  }
  
  public CharSequence b(int paramInt)
  {
    paramInt = android.support.v4.view.v.a(paramInt, cb.h(this));
    if (paramInt == 3) {
      return this.E;
    }
    if (paramInt == 5) {
      return this.F;
    }
    return null;
  }
  
  public void b()
  {
    a(false);
  }
  
  public void b(z paramz)
  {
    if (paramz == null) {}
    while (this.y == null) {
      return;
    }
    this.y.remove(paramz);
  }
  
  void b(View paramView)
  {
    aa localaa = (aa)paramView.getLayoutParams();
    if ((aa.b(localaa) & 0x1) == 1)
    {
      aa.a(localaa, 0);
      if (this.y != null)
      {
        int i1 = this.y.size() - 1;
        while (i1 >= 0)
        {
          ((z)this.y.get(i1)).b(paramView);
          i1 -= 1;
        }
      }
      a(paramView, false);
      if (hasWindowFocus())
      {
        paramView = getRootView();
        if (paramView != null) {
          paramView.sendAccessibilityEvent(32);
        }
      }
    }
  }
  
  void b(View paramView, float paramFloat)
  {
    aa localaa = (aa)paramView.getLayoutParams();
    if (paramFloat == aa.a(localaa)) {
      return;
    }
    aa.a(localaa, paramFloat);
    a(paramView, paramFloat);
  }
  
  View c(int paramInt)
  {
    int i1 = android.support.v4.view.v.a(paramInt, cb.h(this));
    int i2 = getChildCount();
    paramInt = 0;
    while (paramInt < i2)
    {
      View localView = getChildAt(paramInt);
      if ((e(localView) & 0x7) == (i1 & 0x7)) {
        return localView;
      }
      paramInt += 1;
    }
    return null;
  }
  
  void c()
  {
    int i1 = 0;
    if (!this.w)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i2 = getChildCount();
      while (i1 < i2)
      {
        getChildAt(i1).dispatchTouchEvent(localMotionEvent);
        i1 += 1;
      }
      localMotionEvent.recycle();
      this.w = true;
    }
  }
  
  void c(View paramView)
  {
    aa localaa = (aa)paramView.getLayoutParams();
    if ((aa.b(localaa) & 0x1) == 0)
    {
      aa.a(localaa, 1);
      if (this.y != null)
      {
        int i1 = this.y.size() - 1;
        while (i1 >= 0)
        {
          ((z)this.y.get(i1)).a(paramView);
          i1 -= 1;
        }
      }
      a(paramView, true);
      if (hasWindowFocus()) {
        sendAccessibilityEvent(32);
      }
      paramView.requestFocus();
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof aa)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    int i2 = getChildCount();
    float f1 = 0.0F;
    int i1 = 0;
    while (i1 < i2)
    {
      f1 = Math.max(f1, aa.a((aa)getChildAt(i1).getLayoutParams()));
      i1 += 1;
    }
    this.i = f1;
    if ((this.k.a(true) | this.l.a(true))) {
      cb.d(this);
    }
  }
  
  float d(View paramView)
  {
    return aa.a((aa)paramView.getLayoutParams());
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i7 = getHeight();
    boolean bool1 = f(paramView);
    int i3 = 0;
    int i5 = 0;
    int i1 = getWidth();
    int i8 = paramCanvas.save();
    int i2 = i1;
    int i4;
    View localView;
    if (bool1)
    {
      int i9 = getChildCount();
      i4 = 0;
      i3 = i5;
      for (;;)
      {
        if (i4 < i9)
        {
          localView = getChildAt(i4);
          if ((localView != paramView) && (localView.getVisibility() == 0) && (m(localView)) && (g(localView)))
          {
            if (localView.getHeight() < i7)
            {
              i5 = i3;
              i2 = i1;
              i4 += 1;
              i1 = i2;
              i3 = i5;
              continue;
            }
            if (a(localView, 3))
            {
              i2 = localView.getRight();
              if (i2 <= i3) {
                break label534;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      i5 = i2;
      i2 = i1;
      break;
      int i6 = localView.getLeft();
      i2 = i6;
      i5 = i3;
      if (i6 < i1) {
        break;
      }
      i2 = i1;
      i5 = i3;
      break;
      paramCanvas.clipRect(i3, 0, i1, getHeight());
      i2 = i1;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i8);
      if ((this.i > 0.0F) && (bool1))
      {
        i1 = (int)(((this.h & 0xFF000000) >>> 24) * this.i);
        i4 = this.h;
        this.j.setColor(i1 << 24 | i4 & 0xFFFFFF);
        paramCanvas.drawRect(i3, 0.0F, i2, getHeight(), this.j);
      }
      do
      {
        return bool2;
        if ((this.C != null) && (a(paramView, 3)))
        {
          i1 = this.C.getIntrinsicWidth();
          i2 = paramView.getRight();
          i3 = this.k.b();
          f1 = Math.max(0.0F, Math.min(i2 / i3, 1.0F));
          this.C.setBounds(i2, paramView.getTop(), i1 + i2, paramView.getBottom());
          this.C.setAlpha((int)(255.0F * f1));
          this.C.draw(paramCanvas);
          return bool2;
        }
      } while ((this.D == null) || (!a(paramView, 5)));
      i1 = this.D.getIntrinsicWidth();
      i2 = paramView.getLeft();
      i3 = getWidth();
      i4 = this.l.b();
      float f1 = Math.max(0.0F, Math.min((i3 - i2) / i4, 1.0F));
      this.D.setBounds(i2 - i1, paramView.getTop(), i2, paramView.getBottom());
      this.D.setAlpha((int)(255.0F * f1));
      this.D.draw(paramCanvas);
      return bool2;
      label534:
      i2 = i3;
    }
  }
  
  int e(View paramView)
  {
    return android.support.v4.view.v.a(((aa)paramView.getLayoutParams()).a, cb.h(this));
  }
  
  public void e(int paramInt)
  {
    View localView = c(paramInt);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + d(paramInt));
    }
    h(localView);
  }
  
  public void f(int paramInt)
  {
    View localView = c(paramInt);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + d(paramInt));
    }
    i(localView);
  }
  
  boolean f(View paramView)
  {
    return ((aa)paramView.getLayoutParams()).a == 0;
  }
  
  public boolean g(int paramInt)
  {
    View localView = c(paramInt);
    if (localView != null) {
      return j(localView);
    }
    return false;
  }
  
  boolean g(View paramView)
  {
    int i1 = android.support.v4.view.v.a(((aa)paramView.getLayoutParams()).a, cb.h(paramView));
    if ((i1 & 0x3) != 0) {
      return true;
    }
    return (i1 & 0x5) != 0;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new aa(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new aa(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof aa)) {
      return new aa((aa)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new aa((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new aa(paramLayoutParams);
  }
  
  public float getDrawerElevation()
  {
    if (d) {
      return this.f;
    }
    return 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.B;
  }
  
  public void h(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    aa localaa = (aa)paramView.getLayoutParams();
    if (this.q)
    {
      aa.a(localaa, 1.0F);
      aa.a(localaa, 1);
      a(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      aa.b(localaa, 2);
      if (a(paramView, 3)) {
        this.k.a(paramView, 0, paramView.getTop());
      } else {
        this.l.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
      }
    }
  }
  
  public boolean h(int paramInt)
  {
    View localView = c(paramInt);
    if (localView != null) {
      return k(localView);
    }
    return false;
  }
  
  public void i(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    aa localaa = (aa)paramView.getLayoutParams();
    if (this.q)
    {
      aa.a(localaa, 0.0F);
      aa.a(localaa, 0);
    }
    for (;;)
    {
      invalidate();
      return;
      aa.b(localaa, 4);
      if (a(paramView, 3)) {
        this.k.a(paramView, -paramView.getWidth(), paramView.getTop());
      } else {
        this.l.a(paramView, getWidth(), paramView.getTop());
      }
    }
  }
  
  public boolean j(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return (aa.b((aa)paramView.getLayoutParams()) & 0x1) == 1;
  }
  
  public boolean k(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return aa.a((aa)paramView.getLayoutParams()) > 0.0F;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.H) && (this.B != null))
    {
      int i1 = a.a(this.G);
      if (i1 > 0)
      {
        this.B.setBounds(0, 0, getWidth(), i1);
        this.B.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i1 = bf.a(paramMotionEvent);
    boolean bool2 = this.k.a(paramMotionEvent);
    boolean bool3 = this.l.a(paramMotionEvent);
    switch (i1)
    {
    default: 
      i1 = 0;
      if (((bool2 | bool3)) || (i1 != 0) || (i()) || (this.w)) {
        bool1 = true;
      }
      return bool1;
    case 0: 
      label63:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.z = f1;
      this.A = f2;
      if (this.i > 0.0F)
      {
        paramMotionEvent = this.k.d((int)f1, (int)f2);
        if ((paramMotionEvent == null) || (!f(paramMotionEvent))) {
          break;
        }
      }
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      this.v = false;
      this.w = false;
      break label63;
      if (!this.k.d(3)) {
        break;
      }
      this.m.a();
      this.n.a();
      i1 = 0;
      break label63;
      a(true);
      this.v = false;
      this.w = false;
      break;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (j()))
    {
      android.support.v4.view.aa.b(paramKeyEvent);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = k();
      if ((paramKeyEvent != null) && (a(paramKeyEvent) == 0)) {
        b();
      }
      return paramKeyEvent != null;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = true;
    int i4 = paramInt3 - paramInt1;
    int i5 = getChildCount();
    paramInt3 = 0;
    if (paramInt3 < i5)
    {
      View localView = getChildAt(paramInt3);
      if (localView.getVisibility() == 8) {}
      aa localaa;
      for (;;)
      {
        paramInt3 += 1;
        break;
        localaa = (aa)localView.getLayoutParams();
        if (!f(localView)) {
          break label113;
        }
        localView.layout(localaa.leftMargin, localaa.topMargin, localaa.leftMargin + localView.getMeasuredWidth(), localaa.topMargin + localView.getMeasuredHeight());
      }
      label113:
      int i6 = localView.getMeasuredWidth();
      int i7 = localView.getMeasuredHeight();
      int i1;
      float f1;
      label167:
      int i2;
      if (a(localView, 3))
      {
        paramInt1 = -i6;
        i1 = (int)(i6 * aa.a(localaa)) + paramInt1;
        f1 = (i6 + i1) / i6;
        if (f1 == aa.a(localaa)) {
          break label314;
        }
        i2 = 1;
        label181:
        switch (localaa.a & 0x70)
        {
        default: 
          localView.layout(i1, localaa.topMargin, i6 + i1, i7 + localaa.topMargin);
          label241:
          if (i2 != 0) {
            b(localView, f1);
          }
          if (aa.a(localaa) <= 0.0F) {
            break;
          }
        }
      }
      for (paramInt1 = 0; localView.getVisibility() != paramInt1; paramInt1 = 4)
      {
        localView.setVisibility(paramInt1);
        break;
        i1 = i4 - (int)(i6 * aa.a(localaa));
        f1 = (i4 - i1) / i6;
        break label167;
        label314:
        i2 = 0;
        break label181;
        paramInt1 = paramInt4 - paramInt2;
        localView.layout(i1, paramInt1 - localaa.bottomMargin - localView.getMeasuredHeight(), i6 + i1, paramInt1 - localaa.bottomMargin);
        break label241;
        int i8 = paramInt4 - paramInt2;
        int i3 = (i8 - i7) / 2;
        if (i3 < localaa.topMargin) {
          paramInt1 = localaa.topMargin;
        }
        for (;;)
        {
          localView.layout(i1, paramInt1, i6 + i1, i7 + paramInt1);
          break;
          paramInt1 = i3;
          if (i3 + i7 > i8 - localaa.bottomMargin) {
            paramInt1 = i8 - localaa.bottomMargin - i7;
          }
        }
      }
    }
    this.p = false;
    this.q = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i5 = View.MeasureSpec.getMode(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getSize(paramInt2);
    int i2;
    if (i5 == 1073741824)
    {
      i2 = i1;
      if (i4 == 1073741824) {}
    }
    else if (isInEditMode())
    {
      if (i5 == Integer.MIN_VALUE)
      {
        if (i4 != Integer.MIN_VALUE) {
          break label162;
        }
        i2 = i1;
        i1 = i3;
      }
    }
    for (;;)
    {
      label71:
      setMeasuredDimension(i2, i1);
      if ((this.G != null) && (cb.x(this))) {}
      int i8;
      int i6;
      View localView;
      for (i5 = 1;; i5 = 0)
      {
        i8 = cb.h(this);
        i3 = 0;
        i4 = 0;
        int i9 = getChildCount();
        i6 = 0;
        for (;;)
        {
          if (i6 >= i9) {
            break label581;
          }
          localView = getChildAt(i6);
          if (localView.getVisibility() != 8) {
            break;
          }
          i6 += 1;
        }
        if (i5 != 0) {
          break;
        }
        i1 = 300;
        break;
        label162:
        i2 = i1;
        if (i4 != 0) {
          break label582;
        }
        i2 = i1;
        i1 = 300;
        break label71;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
      }
      aa localaa = (aa)localView.getLayoutParams();
      int i7;
      if (i5 != 0)
      {
        i7 = android.support.v4.view.v.a(localaa.a, i8);
        if (!cb.x(localView)) {
          break label304;
        }
        a.a(localView, this.G, i7);
      }
      for (;;)
      {
        if (!f(localView)) {
          break label323;
        }
        localView.measure(View.MeasureSpec.makeMeasureSpec(i2 - localaa.leftMargin - localaa.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - localaa.topMargin - localaa.bottomMargin, 1073741824));
        break;
        label304:
        a.a(localaa, this.G, i7);
      }
      label323:
      if (g(localView))
      {
        if ((d) && (cb.u(localView) != this.f)) {
          cb.j(localView, this.f);
        }
        int i10 = e(localView) & 0x7;
        if (i10 == 3) {}
        for (i7 = 1; ((i7 != 0) && (i3 != 0)) || ((i7 == 0) && (i4 != 0)); i7 = 0) {
          throw new IllegalStateException("Child drawer has absolute gravity " + d(i10) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
        }
        if (i7 != 0) {
          i3 = 1;
        }
        for (;;)
        {
          localView.measure(getChildMeasureSpec(paramInt1, this.g + localaa.leftMargin + localaa.rightMargin, localaa.width), getChildMeasureSpec(paramInt2, localaa.topMargin + localaa.bottomMargin, localaa.height));
          break;
          i4 = 1;
        }
      }
      throw new IllegalStateException("Child " + localView + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
      label581:
      return;
      label582:
      i1 = i3;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof DrawerLayout.SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    do
    {
      return;
      paramParcelable = (DrawerLayout.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      if (paramParcelable.a != 0)
      {
        View localView = c(paramParcelable.a);
        if (localView != null) {
          h(localView);
        }
      }
      if (paramParcelable.b != 3) {
        a(paramParcelable.b, 3);
      }
      if (paramParcelable.c != 3) {
        a(paramParcelable.c, 5);
      }
      if (paramParcelable.d != 3) {
        a(paramParcelable.d, 8388611);
      }
    } while (paramParcelable.e == 3);
    a(paramParcelable.e, 8388613);
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    f();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    DrawerLayout.SavedState localSavedState = new DrawerLayout.SavedState(super.onSaveInstanceState());
    int i4 = getChildCount();
    int i1 = 0;
    for (;;)
    {
      aa localaa;
      int i2;
      if (i1 < i4)
      {
        localaa = (aa)getChildAt(i1).getLayoutParams();
        if (aa.b(localaa) != 1) {
          break label119;
        }
        i2 = 1;
        if (aa.b(localaa) != 2) {
          break label124;
        }
      }
      label119:
      label124:
      for (int i3 = 1;; i3 = 0)
      {
        if ((i2 == 0) && (i3 == 0)) {
          break label129;
        }
        localSavedState.a = localaa.a;
        localSavedState.b = this.r;
        localSavedState.c = this.s;
        localSavedState.d = this.t;
        localSavedState.e = this.u;
        return localSavedState;
        i2 = 0;
        break;
      }
      label129:
      i1 += 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.k.b(paramMotionEvent);
    this.l.b(paramMotionEvent);
    float f1;
    float f2;
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
      return true;
    case 0: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.z = f1;
      this.A = f2;
      this.v = false;
      this.w = false;
      return true;
    case 1: 
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      paramMotionEvent = this.k.d((int)f2, (int)f1);
      if ((paramMotionEvent != null) && (f(paramMotionEvent)))
      {
        f2 -= this.z;
        f1 -= this.A;
        int i1 = this.k.d();
        if (f2 * f2 + f1 * f1 < i1 * i1)
        {
          paramMotionEvent = a();
          if (paramMotionEvent != null) {
            if (a(paramMotionEvent) == 2) {
              bool = true;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      a(bool);
      this.v = false;
      return true;
      bool = false;
      continue;
      a(true);
      this.v = false;
      this.w = false;
      return true;
      bool = true;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.v = paramBoolean;
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.p) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.f = paramFloat;
    int i1 = 0;
    while (i1 < getChildCount())
    {
      View localView = getChildAt(i1);
      if (g(localView)) {
        cb.j(localView, this.f);
      }
      i1 += 1;
    }
  }
  
  @Deprecated
  public void setDrawerListener(z paramz)
  {
    if (this.x != null) {
      b(this.x);
    }
    if (paramz != null) {
      a(paramz);
    }
    this.x = paramz;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = c.a(getContext(), paramInt);; localDrawable = null)
    {
      this.B = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.B = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.B = new ColorDrawable(paramInt);
    invalidate();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */