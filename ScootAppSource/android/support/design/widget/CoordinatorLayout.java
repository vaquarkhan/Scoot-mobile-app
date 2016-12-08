package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.design.R.style;
import android.support.design.R.styleable;
import android.support.v4.b.c;
import android.support.v4.c.a.a;
import android.support.v4.view.bf;
import android.support.v4.view.bq;
import android.support.v4.view.br;
import android.support.v4.view.cb;
import android.support.v4.view.fh;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout
  extends ViewGroup
  implements bq
{
  static final String a;
  static final Class<?>[] b;
  static final ThreadLocal<Map<String, Constructor<r>>> c;
  static final Comparator<View> e;
  static final y f;
  private final br A = new br(this);
  final Comparator<View> d = new p(this);
  private final List<View> g = new ArrayList();
  private final List<View> h = new ArrayList();
  private final List<View> i = new ArrayList();
  private final Rect j = new Rect();
  private final Rect k = new Rect();
  private final Rect l = new Rect();
  private final int[] m = new int[2];
  private Paint n;
  private boolean o;
  private boolean p;
  private int[] q;
  private View r;
  private View s;
  private View t;
  private v u;
  private boolean v;
  private fh w;
  private boolean x;
  private Drawable y;
  private ViewGroup.OnHierarchyChangeListener z;
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    if (localObject != null)
    {
      localObject = ((Package)localObject).getName();
      a = (String)localObject;
      if (Build.VERSION.SDK_INT < 21) {
        break label80;
      }
      e = new x();
    }
    for (f = new z();; f = null)
    {
      b = new Class[] { Context.class, AttributeSet.class };
      c = new ThreadLocal();
      return;
      localObject = null;
      break;
      label80:
      e = null;
    }
  }
  
  public CoordinatorLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ce.a(paramContext);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CoordinatorLayout, paramInt, R.style.Widget_Design_CoordinatorLayout);
    paramInt = paramAttributeSet.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getResources();
      this.q = paramContext.getIntArray(paramInt);
      float f1 = paramContext.getDisplayMetrics().density;
      int i2 = this.q.length;
      paramInt = i1;
      while (paramInt < i2)
      {
        paramContext = this.q;
        paramContext[paramInt] = ((int)(paramContext[paramInt] * f1));
        paramInt += 1;
      }
    }
    this.y = paramAttributeSet.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
    paramAttributeSet.recycle();
    if (f != null) {
      f.a(this, new q(this, null));
    }
    super.setOnHierarchyChangeListener(new t(this, null));
  }
  
  private int a(int paramInt)
  {
    if (this.q == null)
    {
      Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + paramInt);
      return 0;
    }
    if ((paramInt < 0) || (paramInt >= this.q.length))
    {
      Log.e("CoordinatorLayout", "Keyline index " + paramInt + " out of range for " + this);
      return 0;
    }
    return this.q[paramInt];
  }
  
  static r a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    String str;
    if (paramString.startsWith(".")) {
      str = paramContext.getPackageName() + paramString;
    }
    label228:
    for (;;)
    {
      try
      {
        paramString = (Map)c.get();
        if (paramString != null) {
          break label228;
        }
        paramString = new HashMap();
        c.set(paramString);
        Constructor localConstructor2 = (Constructor)paramString.get(str);
        Constructor localConstructor1 = localConstructor2;
        if (localConstructor2 == null)
        {
          localConstructor1 = Class.forName(str, true, paramContext.getClassLoader()).getConstructor(b);
          localConstructor1.setAccessible(true);
          paramString.put(str, localConstructor1);
        }
        paramContext = (r)localConstructor1.newInstance(new Object[] { paramContext, paramAttributeSet });
        return paramContext;
      }
      catch (Exception paramContext)
      {
        throw new RuntimeException("Could not inflate Behavior subclass " + str, paramContext);
      }
      str = paramString;
      if (paramString.indexOf('.') < 0)
      {
        str = paramString;
        if (!TextUtils.isEmpty(a)) {
          str = a + '.' + paramString;
        }
      }
    }
  }
  
  private fh a(fh paramfh)
  {
    boolean bool2 = true;
    fh localfh = paramfh;
    if (this.w != paramfh)
    {
      this.w = paramfh;
      if ((paramfh == null) || (paramfh.b() <= 0)) {
        break label71;
      }
      bool1 = true;
      this.x = bool1;
      if ((this.x) || (getBackground() != null)) {
        break label76;
      }
    }
    label71:
    label76:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      setWillNotDraw(bool1);
      localfh = b(paramfh);
      requestLayout();
      return localfh;
      bool1 = false;
      break;
    }
  }
  
  private void a(View paramView1, View paramView2, int paramInt)
  {
    Object localObject = (u)paramView1.getLayoutParams();
    localObject = this.j;
    Rect localRect = this.k;
    a(paramView2, (Rect)localObject);
    a(paramView1, paramInt, (Rect)localObject, localRect);
    paramView1.layout(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  private void a(List<View> paramList)
  {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int i3 = getChildCount();
    int i1 = i3 - 1;
    if (i1 >= 0)
    {
      if (bool) {}
      for (int i2 = getChildDrawingOrder(i3, i1);; i2 = i1)
      {
        paramList.add(getChildAt(i2));
        i1 -= 1;
        break;
      }
    }
    if (e != null) {
      Collections.sort(paramList, e);
    }
  }
  
  private static void a(List<View> paramList, Comparator<View> paramComparator)
  {
    if ((paramList == null) || (paramList.size() < 2)) {}
    for (;;)
    {
      return;
      View[] arrayOfView = new View[paramList.size()];
      paramList.toArray(arrayOfView);
      int i5 = arrayOfView.length;
      int i1 = 0;
      while (i1 < i5)
      {
        int i2 = i1 + 1;
        int i4;
        for (int i3 = i1; i2 < i5; i3 = i4)
        {
          i4 = i3;
          if (paramComparator.compare(arrayOfView[i2], arrayOfView[i3]) < 0) {
            i4 = i2;
          }
          i2 += 1;
        }
        if (i1 != i3)
        {
          View localView = arrayOfView[i3];
          arrayOfView[i3] = arrayOfView[i1];
          arrayOfView[i1] = localView;
        }
        i1 += 1;
      }
      paramList.clear();
      i1 = 0;
      while (i1 < i5)
      {
        paramList.add(arrayOfView[i1]);
        i1 += 1;
      }
    }
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int i1 = 0;
    MotionEvent localMotionEvent = null;
    int i3 = bf.a(paramMotionEvent);
    List localList = this.h;
    a(localList);
    int i4 = localList.size();
    int i2 = 0;
    View localView;
    r localr;
    if (i2 < i4)
    {
      localView = (View)localList.get(i2);
      u localu = (u)localView.getLayoutParams();
      localr = localu.b();
      if (((bool1) || (i1 != 0)) && (i3 != 0))
      {
        if (localr == null) {
          break label330;
        }
        if (localMotionEvent == null)
        {
          long l1 = SystemClock.uptimeMillis();
          localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
          switch (paramInt)
          {
          }
          for (;;)
          {
            label140:
            i2 += 1;
            break;
            localr.a(this, localView, localMotionEvent);
            continue;
            localr.b(this, localView, localMotionEvent);
          }
        }
      }
      else
      {
        boolean bool2 = bool1;
        if (!bool1)
        {
          bool2 = bool1;
          if (localr == null) {}
        }
        switch (paramInt)
        {
        default: 
          label220:
          bool2 = bool1;
          if (bool1)
          {
            this.r = localView;
            bool2 = bool1;
          }
          bool1 = bool2;
          bool2 = localu.e();
          boolean bool3 = localu.a(this, localView);
          if ((bool3) && (!bool2))
          {
            i1 = 1;
            label272:
            if ((!bool3) || (i1 != 0)) {
              break label324;
            }
          }
          break;
        }
      }
    }
    for (;;)
    {
      localList.clear();
      return bool1;
      bool1 = localr.a(this, localView, paramMotionEvent);
      break label220;
      bool1 = localr.b(this, localView, paramMotionEvent);
      break label220;
      i1 = 0;
      break label272;
      label324:
      break label140;
      break;
      label330:
      break label140;
    }
  }
  
  private static int b(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == 0) {
      i1 = 8388659;
    }
    return i1;
  }
  
  private fh b(fh paramfh)
  {
    if (paramfh.e()) {
      return paramfh;
    }
    int i2 = getChildCount();
    int i1 = 0;
    Object localObject;
    if (i1 < i2)
    {
      localObject = getChildAt(i1);
      if (cb.x((View)localObject))
      {
        r localr = ((u)((View)localObject).getLayoutParams()).b();
        if (localr != null)
        {
          localObject = localr.a(this, (View)localObject, paramfh);
          paramfh = (fh)localObject;
          if (!((fh)localObject).e()) {}
        }
      }
    }
    for (;;)
    {
      return (fh)localObject;
      i1 += 1;
      break;
      localObject = paramfh;
    }
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    u localu = (u)paramView.getLayoutParams();
    int i6 = android.support.v4.view.v.a(c(localu.c), paramInt2);
    int i5 = getWidth();
    int i4 = getHeight();
    int i2 = paramView.getMeasuredWidth();
    int i3 = paramView.getMeasuredHeight();
    int i1 = paramInt1;
    if (paramInt2 == 1) {
      i1 = i5 - paramInt1;
    }
    paramInt1 = a(i1) - i2;
    paramInt2 = 0;
    switch (i6 & 0x7)
    {
    default: 
      switch (i6 & 0x70)
      {
      }
      break;
    }
    for (;;)
    {
      paramInt1 = Math.max(getPaddingLeft() + localu.leftMargin, Math.min(paramInt1, i5 - getPaddingRight() - i2 - localu.rightMargin));
      paramInt2 = Math.max(getPaddingTop() + localu.topMargin, Math.min(paramInt2, i4 - getPaddingBottom() - i3 - localu.bottomMargin));
      paramView.layout(paramInt1, paramInt2, paramInt1 + i2, paramInt2 + i3);
      return;
      paramInt1 += i2;
      break;
      paramInt1 += i2 / 2;
      break;
      paramInt2 = 0 + i3;
      continue;
      paramInt2 = 0 + i3 / 2;
    }
  }
  
  private static int c(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == 0) {
      i1 = 8388661;
    }
    return i1;
  }
  
  private void c(View paramView, int paramInt)
  {
    u localu = (u)paramView.getLayoutParams();
    Rect localRect1 = this.j;
    localRect1.set(getPaddingLeft() + localu.leftMargin, getPaddingTop() + localu.topMargin, getWidth() - getPaddingRight() - localu.rightMargin, getHeight() - getPaddingBottom() - localu.bottomMargin);
    if ((this.w != null) && (cb.x(this)) && (!cb.x(paramView)))
    {
      localRect1.left += this.w.a();
      localRect1.top += this.w.b();
      localRect1.right -= this.w.c();
      localRect1.bottom -= this.w.d();
    }
    Rect localRect2 = this.k;
    android.support.v4.view.v.a(b(localu.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
    paramView.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
  }
  
  private static int d(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == 0) {
      i1 = 17;
    }
    return i1;
  }
  
  private void e()
  {
    if (this.r != null)
    {
      r localr = ((u)this.r.getLayoutParams()).b();
      if (localr != null)
      {
        long l1 = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        localr.b(this, this.r, localMotionEvent);
        localMotionEvent.recycle();
      }
      this.r = null;
    }
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      ((u)getChildAt(i1).getLayoutParams()).f();
      i1 += 1;
    }
    this.o = false;
  }
  
  private void f()
  {
    this.g.clear();
    int i1 = 0;
    int i2 = getChildCount();
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      a(localView).b(this, localView);
      this.g.add(localView);
      i1 += 1;
    }
    a(this.g, this.d);
  }
  
  public u a(AttributeSet paramAttributeSet)
  {
    return new u(getContext(), paramAttributeSet);
  }
  
  u a(View paramView)
  {
    u localu = (u)paramView.getLayoutParams();
    View localView;
    if (!localu.b)
    {
      Class localClass = paramView.getClass();
      paramView = null;
      for (;;)
      {
        localView = paramView;
        if (localClass == null) {
          break;
        }
        paramView = (s)localClass.getAnnotation(s.class);
        localView = paramView;
        if (paramView != null) {
          break;
        }
        localClass = localClass.getSuperclass();
      }
      if (localView == null) {}
    }
    try
    {
      localu.a((r)localView.a().newInstance());
      localu.b = true;
      return localu;
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        Log.e("CoordinatorLayout", "Default behavior class " + localView.a().getName() + " could not be instantiated. Did you forget a default constructor?", paramView);
      }
    }
  }
  
  protected u a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof u)) {
      return new u((u)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new u((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new u(paramLayoutParams);
  }
  
  void a()
  {
    int i4 = 0;
    int i2 = getChildCount();
    int i1 = 0;
    for (;;)
    {
      int i3 = i4;
      if (i1 < i2)
      {
        if (e(getChildAt(i1))) {
          i3 = 1;
        }
      }
      else
      {
        if (i3 != this.v)
        {
          if (i3 == 0) {
            break;
          }
          b();
        }
        return;
      }
      i1 += 1;
    }
    c();
  }
  
  public void a(View paramView, int paramInt)
  {
    u localu = (u)paramView.getLayoutParams();
    if (localu.d()) {
      throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }
    if (localu.g != null)
    {
      a(paramView, localu.g, paramInt);
      return;
    }
    if (localu.e >= 0)
    {
      b(paramView, localu.e, paramInt);
      return;
    }
    c(paramView, paramInt);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    u localu = (u)paramView.getLayoutParams();
    int i5 = android.support.v4.view.v.a(d(localu.c), paramInt);
    int i1 = android.support.v4.view.v.a(b(localu.d), paramInt);
    int i3 = paramView.getMeasuredWidth();
    int i4 = paramView.getMeasuredHeight();
    label122:
    int i2;
    switch (i1 & 0x7)
    {
    default: 
      paramInt = paramRect1.left;
      switch (i1 & 0x70)
      {
      default: 
        i1 = paramRect1.top;
        i2 = paramInt;
        switch (i5 & 0x7)
        {
        default: 
          i2 = paramInt - i3;
        case 5: 
          label162:
          paramInt = i1;
          switch (i5 & 0x70)
          {
          }
          break;
        }
        break;
      }
      break;
    }
    for (paramInt = i1 - i4;; paramInt = i1 - i4 / 2)
    {
      i5 = getWidth();
      i1 = getHeight();
      i2 = Math.max(getPaddingLeft() + localu.leftMargin, Math.min(i2, i5 - getPaddingRight() - i3 - localu.rightMargin));
      paramInt = Math.max(getPaddingTop() + localu.topMargin, Math.min(paramInt, i1 - getPaddingBottom() - i4 - localu.bottomMargin));
      paramRect2.set(i2, paramInt, i2 + i3, paramInt + i4);
      return;
      paramInt = paramRect1.right;
      break;
      paramInt = paramRect1.left;
      paramInt = paramRect1.width() / 2 + paramInt;
      break;
      i1 = paramRect1.bottom;
      break label122;
      i1 = paramRect1.top + paramRect1.height() / 2;
      break label122;
      i2 = paramInt - i3 / 2;
      break label162;
    }
  }
  
  void a(View paramView, Rect paramRect)
  {
    cq.b(this, paramView, paramRect);
  }
  
  void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((paramView.isLayoutRequested()) || (paramView.getVisibility() == 8))
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    if (paramBoolean)
    {
      a(paramView, paramRect);
      return;
    }
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  void a(boolean paramBoolean)
  {
    int i3 = cb.h(this);
    int i4 = this.g.size();
    int i1 = 0;
    while (i1 < i4)
    {
      View localView = (View)this.g.get(i1);
      Object localObject1 = (u)localView.getLayoutParams();
      int i2 = 0;
      while (i2 < i1)
      {
        localObject2 = (View)this.g.get(i2);
        if (((u)localObject1).h == localObject2) {
          b(localView, i3);
        }
        i2 += 1;
      }
      localObject1 = this.j;
      Object localObject2 = this.k;
      c(localView, (Rect)localObject1);
      a(localView, true, (Rect)localObject2);
      if (((Rect)localObject1).equals(localObject2))
      {
        i1 += 1;
      }
      else
      {
        b(localView, (Rect)localObject2);
        i2 = i1 + 1;
        label155:
        r localr;
        if (i2 < i4)
        {
          localObject1 = (View)this.g.get(i2);
          localObject2 = (u)((View)localObject1).getLayoutParams();
          localr = ((u)localObject2).b();
          if ((localr != null) && (localr.b(this, (View)localObject1, localView)))
          {
            if ((paramBoolean) || (!((u)localObject2).i())) {
              break label235;
            }
            ((u)localObject2).j();
          }
        }
        for (;;)
        {
          i2 += 1;
          break label155;
          break;
          label235:
          boolean bool = localr.c(this, (View)localObject1, localView);
          if (paramBoolean) {
            ((u)localObject2).b(bool);
          }
        }
      }
    }
  }
  
  public boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = this.j;
    a(paramView, localRect);
    return localRect.contains(paramInt1, paramInt2);
  }
  
  public boolean a(View paramView1, View paramView2)
  {
    if ((paramView1.getVisibility() == 0) && (paramView2.getVisibility() == 0))
    {
      Rect localRect = this.j;
      if (paramView1.getParent() != this)
      {
        bool = true;
        a(paramView1, bool, localRect);
        paramView1 = this.k;
        if (paramView2.getParent() == this) {
          break label115;
        }
      }
      label115:
      for (boolean bool = true;; bool = false)
      {
        a(paramView2, bool, paramView1);
        if ((localRect.left > paramView1.right) || (localRect.top > paramView1.bottom) || (localRect.right < paramView1.left) || (localRect.bottom < paramView1.top)) {
          break label120;
        }
        return true;
        bool = false;
        break;
      }
      label120:
      return false;
    }
    return false;
  }
  
  void b()
  {
    if (this.p)
    {
      if (this.u == null) {
        this.u = new v(this);
      }
      getViewTreeObserver().addOnPreDrawListener(this.u);
    }
    this.v = true;
  }
  
  void b(View paramView)
  {
    int i3 = this.g.size();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i3)
    {
      View localView = (View)this.g.get(i2);
      if (localView == paramView) {
        i1 = 1;
      }
      for (;;)
      {
        i2 += 1;
        break;
        if (i1 != 0)
        {
          u localu = (u)localView.getLayoutParams();
          r localr = localu.b();
          if ((localr != null) && (localu.a(this, localView, paramView))) {
            localr.d(this, localView, paramView);
          }
        }
      }
    }
  }
  
  void b(View paramView, int paramInt)
  {
    u localu = (u)paramView.getLayoutParams();
    if (localu.g != null)
    {
      Object localObject = this.j;
      Rect localRect1 = this.k;
      Rect localRect2 = this.l;
      a(localu.g, (Rect)localObject);
      a(paramView, false, localRect1);
      a(paramView, paramInt, (Rect)localObject, localRect2);
      paramInt = localRect2.left - localRect1.left;
      int i1 = localRect2.top - localRect1.top;
      if (paramInt != 0) {
        paramView.offsetLeftAndRight(paramInt);
      }
      if (i1 != 0) {
        paramView.offsetTopAndBottom(i1);
      }
      if ((paramInt != 0) || (i1 != 0))
      {
        localObject = localu.b();
        if (localObject != null) {
          ((r)localObject).c(this, paramView, localu.g);
        }
      }
    }
  }
  
  void b(View paramView, Rect paramRect)
  {
    ((u)paramView.getLayoutParams()).a(paramRect);
  }
  
  void c()
  {
    if ((this.p) && (this.u != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.u);
    }
    this.v = false;
  }
  
  public void c(View paramView)
  {
    int i3 = this.g.size();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i3)
    {
      View localView = (View)this.g.get(i2);
      if (localView == paramView) {
        i1 = 1;
      }
      for (;;)
      {
        i2 += 1;
        break;
        if (i1 != 0)
        {
          u localu = (u)localView.getLayoutParams();
          r localr = localu.b();
          if ((localr != null) && (localu.a(this, localView, paramView))) {
            localr.c(this, localView, paramView);
          }
        }
      }
    }
  }
  
  void c(View paramView, Rect paramRect)
  {
    paramRect.set(((u)paramView.getLayoutParams()).c());
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof u)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  protected u d()
  {
    return new u(-2, -2);
  }
  
  public List<View> d(View paramView)
  {
    u localu = (u)paramView.getLayoutParams();
    List localList = this.i;
    localList.clear();
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (localView == paramView) {}
      for (;;)
      {
        i1 += 1;
        break;
        if (localu.a(this, paramView, localView)) {
          localList.add(localView);
        }
      }
    }
    return localList;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    u localu = (u)paramView.getLayoutParams();
    if ((localu.a != null) && (localu.a.d(this, paramView) > 0.0F))
    {
      if (this.n == null) {
        this.n = new Paint();
      }
      this.n.setColor(localu.a.c(this, paramView));
      paramCanvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.n);
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool2 = false;
    Drawable localDrawable = this.y;
    boolean bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful()) {
        bool1 = false | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  boolean e(View paramView)
  {
    u localu = (u)paramView.getLayoutParams();
    if (localu.g != null) {
      return true;
    }
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (localView == paramView) {}
      while (!localu.a(this, paramView, localView))
      {
        i1 += 1;
        break;
      }
      return true;
    }
    return false;
  }
  
  public int getNestedScrollAxes()
  {
    return this.A.a();
  }
  
  public Drawable getStatusBarBackground()
  {
    return this.y;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth()
  {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e();
    if (this.v)
    {
      if (this.u == null) {
        this.u = new v(this);
      }
      getViewTreeObserver().addOnPreDrawListener(this.u);
    }
    if ((this.w == null) && (cb.x(this))) {
      cb.w(this);
    }
    this.p = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    e();
    if ((this.v) && (this.u != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.u);
    }
    if (this.t != null) {
      onStopNestedScroll(this.t);
    }
    this.p = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.x) && (this.y != null)) {
      if (this.w == null) {
        break label61;
      }
    }
    label61:
    for (int i1 = this.w.b();; i1 = 0)
    {
      if (i1 > 0)
      {
        this.y.setBounds(0, 0, getWidth(), i1);
        this.y.draw(paramCanvas);
      }
      return;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = bf.a(paramMotionEvent);
    if (i1 == 0) {
      e();
    }
    boolean bool = a(paramMotionEvent, 0);
    if (0 != 0) {
      throw new NullPointerException();
    }
    if ((i1 == 1) || (i1 == 3)) {
      e();
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = cb.h(this);
    paramInt3 = this.g.size();
    paramInt1 = 0;
    while (paramInt1 < paramInt3)
    {
      View localView = (View)this.g.get(paramInt1);
      r localr = ((u)localView.getLayoutParams()).b();
      if ((localr == null) || (!localr.a(this, localView, paramInt2))) {
        a(localView, paramInt2);
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    f();
    a();
    int i10 = getPaddingLeft();
    int i11 = getPaddingTop();
    int i12 = getPaddingRight();
    int i13 = getPaddingBottom();
    int i14 = cb.h(this);
    int i2;
    int i7;
    int i6;
    int i3;
    label100:
    int i4;
    int i5;
    label117:
    View localView;
    u localu;
    int i8;
    int i1;
    int i9;
    int i20;
    if (i14 == 1)
    {
      i2 = 1;
      int i15 = View.MeasureSpec.getMode(paramInt1);
      int i16 = View.MeasureSpec.getSize(paramInt1);
      int i17 = View.MeasureSpec.getMode(paramInt2);
      int i18 = View.MeasureSpec.getSize(paramInt2);
      i7 = getSuggestedMinimumWidth();
      i6 = getSuggestedMinimumHeight();
      if ((this.w == null) || (!cb.x(this))) {
        break label443;
      }
      i3 = 1;
      int i19 = this.g.size();
      i4 = 0;
      i5 = 0;
      if (i4 >= i19) {
        break label490;
      }
      localView = (View)this.g.get(i4);
      localu = (u)localView.getLayoutParams();
      i8 = 0;
      i1 = i8;
      if (localu.e >= 0)
      {
        i1 = i8;
        if (i15 != 0)
        {
          i9 = a(localu.e);
          i20 = android.support.v4.view.v.a(c(localu.c), i14) & 0x7;
          if (((i20 != 3) || (i2 != 0)) && ((i20 != 5) || (i2 == 0))) {
            break label449;
          }
          i1 = Math.max(0, i16 - i12 - i9);
        }
      }
      label236:
      if ((i3 == 0) || (cb.x(localView))) {
        break label518;
      }
      i8 = this.w.a();
      int i21 = this.w.c();
      i9 = this.w.b();
      i20 = this.w.d();
      i8 = View.MeasureSpec.makeMeasureSpec(i16 - (i8 + i21), i15);
      i9 = View.MeasureSpec.makeMeasureSpec(i18 - (i9 + i20), i17);
    }
    for (;;)
    {
      r localr = localu.b();
      if ((localr == null) || (!localr.a(this, localView, i8, i1, i9, 0))) {
        a(localView, i8, i1, i9, 0);
      }
      i7 = Math.max(i7, localView.getMeasuredWidth() + (i10 + i12) + localu.leftMargin + localu.rightMargin);
      i6 = Math.max(i6, localView.getMeasuredHeight() + (i11 + i13) + localu.topMargin + localu.bottomMargin);
      i5 = cb.a(i5, cb.l(localView));
      i4 += 1;
      break label117;
      i2 = 0;
      break;
      label443:
      i3 = 0;
      break label100;
      label449:
      if ((i20 != 5) || (i2 != 0))
      {
        i1 = i8;
        if (i20 != 3) {
          break label236;
        }
        i1 = i8;
        if (i2 == 0) {
          break label236;
        }
      }
      i1 = Math.max(0, i9 - i10);
      break label236;
      label490:
      setMeasuredDimension(cb.a(i7, paramInt1, 0xFF000000 & i5), cb.a(i6, paramInt2, i5 << 16));
      return;
      label518:
      i9 = paramInt2;
      i8 = paramInt1;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i2 = getChildCount();
    int i1 = 0;
    boolean bool = false;
    View localView;
    Object localObject;
    if (i1 < i2)
    {
      localView = getChildAt(i1);
      localObject = (u)localView.getLayoutParams();
      if (((u)localObject).h()) {}
    }
    for (;;)
    {
      i1 += 1;
      break;
      localObject = ((u)localObject).b();
      if (localObject != null)
      {
        bool = ((r)localObject).a(this, localView, paramView, paramFloat1, paramFloat2, paramBoolean) | bool;
        continue;
        if (bool) {
          a(true);
        }
        return bool;
      }
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i2 = getChildCount();
    int i1 = 0;
    boolean bool = false;
    View localView;
    Object localObject;
    if (i1 < i2)
    {
      localView = getChildAt(i1);
      localObject = (u)localView.getLayoutParams();
      if (((u)localObject).h()) {}
    }
    for (;;)
    {
      i1 += 1;
      break;
      localObject = ((u)localObject).b();
      if (localObject != null)
      {
        bool = ((r)localObject).a(this, localView, paramView, paramFloat1, paramFloat2) | bool;
        continue;
        return bool;
      }
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i2 = 0;
    int i1 = 0;
    int i3 = 0;
    int i6 = getChildCount();
    int i4 = 0;
    View localView;
    Object localObject;
    int i5;
    if (i4 < i6)
    {
      localView = getChildAt(i4);
      localObject = (u)localView.getLayoutParams();
      if (!((u)localObject).h())
      {
        i5 = i3;
        i3 = i2;
        i2 = i1;
        i1 = i5;
      }
    }
    for (;;)
    {
      i5 = i4 + 1;
      i4 = i3;
      i3 = i1;
      i1 = i2;
      i2 = i4;
      i4 = i5;
      break;
      localObject = ((u)localObject).b();
      if (localObject != null)
      {
        int[] arrayOfInt = this.m;
        this.m[1] = 0;
        arrayOfInt[0] = 0;
        ((r)localObject).a(this, localView, paramView, paramInt1, paramInt2, this.m);
        if (paramInt1 > 0)
        {
          i3 = Math.max(i2, this.m[0]);
          label158:
          if (paramInt2 <= 0) {
            break label201;
          }
        }
        label201:
        for (i1 = Math.max(i1, this.m[1]);; i1 = Math.min(i1, this.m[1]))
        {
          i2 = i1;
          i1 = 1;
          break;
          i3 = Math.min(i2, this.m[0]);
          break label158;
        }
        paramArrayOfInt[0] = i2;
        paramArrayOfInt[1] = i1;
        if (i3 != 0) {
          a(true);
        }
        return;
      }
      i5 = i3;
      i3 = i2;
      i2 = i1;
      i1 = i5;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3 = getChildCount();
    int i1 = 0;
    int i2 = 0;
    View localView;
    Object localObject;
    if (i2 < i3)
    {
      localView = getChildAt(i2);
      localObject = (u)localView.getLayoutParams();
      if (((u)localObject).h()) {}
    }
    for (;;)
    {
      i2 += 1;
      break;
      localObject = ((u)localObject).b();
      if (localObject != null)
      {
        ((r)localObject).a(this, localView, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        i1 = 1;
        continue;
        if (i1 != 0) {
          a(true);
        }
        return;
      }
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.A.a(paramView1, paramView2, paramInt);
    this.s = paramView1;
    this.t = paramView2;
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      Object localObject = (u)localView.getLayoutParams();
      if (!((u)localObject).h()) {}
      for (;;)
      {
        i1 += 1;
        break;
        localObject = ((u)localObject).b();
        if (localObject != null) {
          ((r)localObject).b(this, localView, paramView1, paramView2, paramInt);
        }
      }
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof CoordinatorLayout.SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (CoordinatorLayout.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      paramParcelable = paramParcelable.a;
      int i2 = getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = getChildAt(i1);
        int i3 = localView.getId();
        r localr = a(localView).b();
        if ((i3 != -1) && (localr != null))
        {
          Parcelable localParcelable = (Parcelable)paramParcelable.get(i3);
          if (localParcelable != null) {
            localr.a(this, localView, localParcelable);
          }
        }
        i1 += 1;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    CoordinatorLayout.SavedState localSavedState = new CoordinatorLayout.SavedState(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = getChildAt(i1);
      int i3 = ((View)localObject).getId();
      r localr = ((u)((View)localObject).getLayoutParams()).b();
      if ((i3 != -1) && (localr != null))
      {
        localObject = localr.b(this, (View)localObject);
        if (localObject != null) {
          localSparseArray.append(i3, localObject);
        }
      }
      i1 += 1;
    }
    localSavedState.a = localSparseArray;
    return localSavedState;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i2 = getChildCount();
    int i1 = 0;
    boolean bool1 = false;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      u localu = (u)localView.getLayoutParams();
      r localr = localu.b();
      if (localr != null)
      {
        boolean bool2 = localr.a(this, localView, paramView1, paramView2, paramInt);
        bool1 |= bool2;
        localu.a(bool2);
      }
      for (;;)
      {
        i1 += 1;
        break;
        localu.a(false);
      }
    }
    return bool1;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.A.a(paramView);
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      u localu = (u)localView.getLayoutParams();
      if (!localu.h()) {}
      for (;;)
      {
        i1 += 1;
        break;
        r localr = localu.b();
        if (localr != null) {
          localr.a(this, localView, paramView);
        }
        localu.g();
        localu.j();
      }
    }
    this.s = null;
    this.t = null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = null;
    int i1 = bf.a(paramMotionEvent);
    boolean bool2;
    if (this.r == null)
    {
      bool2 = a(paramMotionEvent, 1);
      if (!bool2) {}
    }
    for (;;)
    {
      r localr = ((u)this.r.getLayoutParams()).b();
      boolean bool1;
      if (localr != null) {
        bool1 = localr.b(this, this.r, paramMotionEvent);
      }
      for (;;)
      {
        boolean bool3;
        if (this.r == null)
        {
          bool3 = bool1 | super.onTouchEvent(paramMotionEvent);
          paramMotionEvent = (MotionEvent)localObject;
        }
        do
        {
          if (((bool3) || (i1 != 0)) || (paramMotionEvent != null)) {
            paramMotionEvent.recycle();
          }
          if ((i1 == 1) || (i1 == 3)) {
            e();
          }
          return bool3;
          paramMotionEvent = (MotionEvent)localObject;
          bool3 = bool1;
        } while (!bool2);
        long l1;
        if (0 == 0) {
          l1 = SystemClock.uptimeMillis();
        }
        for (paramMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);; paramMotionEvent = null)
        {
          super.onTouchEvent(paramMotionEvent);
          bool3 = bool1;
          break;
        }
        bool1 = false;
        continue;
        bool1 = false;
      }
      bool2 = false;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!this.o))
    {
      e();
      this.o = true;
    }
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    this.z = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = null;
    if (this.y != paramDrawable)
    {
      if (this.y != null) {
        this.y.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable = paramDrawable.mutate();
      }
      this.y = localDrawable;
      if (this.y != null)
      {
        if (this.y.isStateful()) {
          this.y.setState(getDrawableState());
        }
        a.b(this.y, cb.h(this));
        paramDrawable = this.y;
        if (getVisibility() != 0) {
          break label113;
        }
      }
    }
    label113:
    for (boolean bool = true;; bool = false)
    {
      paramDrawable.setVisible(bool, false);
      this.y.setCallback(this);
      cb.d(this);
      return;
    }
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    setStatusBarBackground(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = c.a(getContext(), paramInt);; localDrawable = null)
    {
      setStatusBarBackground(localDrawable);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((this.y != null) && (this.y.isVisible() != bool)) {
        this.y.setVisible(bool, false);
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.y);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */