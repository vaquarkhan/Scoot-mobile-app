package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.ar;
import android.support.v4.view.a.l;
import android.support.v4.view.a.w;
import android.support.v4.view.a.x;
import android.support.v4.view.cb;
import android.support.v7.recyclerview.R.styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class en
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = true;
  private int d;
  private int e;
  private int f;
  private int g;
  by p;
  RecyclerView q;
  ey r;
  boolean s = false;
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int j = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = i;
    switch (j)
    {
    default: 
      paramInt1 = Math.max(paramInt2, paramInt3);
    case 1073741824: 
      return paramInt1;
    }
    return Math.min(i, Math.max(paramInt2, paramInt3));
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int j = 0;
    int k = 0;
    int i = Math.max(0, paramInt1 - paramInt3);
    if (paramBoolean) {
      if (paramInt4 >= 0)
      {
        paramInt1 = 1073741824;
        paramInt3 = paramInt4;
      }
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, paramInt1);
      if (paramInt4 == -1)
      {
        switch (paramInt2)
        {
        default: 
          paramInt2 = 0;
          paramInt1 = j;
        }
        for (;;)
        {
          paramInt3 = paramInt1;
          paramInt1 = paramInt2;
          break;
          paramInt1 = i;
          continue;
          paramInt2 = 0;
          paramInt1 = j;
        }
      }
      if (paramInt4 == -2)
      {
        paramInt3 = 0;
        paramInt1 = k;
        continue;
        if (paramInt4 >= 0)
        {
          paramInt1 = 1073741824;
          paramInt3 = paramInt4;
          continue;
        }
        if (paramInt4 == -1)
        {
          paramInt1 = paramInt2;
          paramInt3 = i;
          continue;
        }
        if (paramInt4 == -2)
        {
          if (paramInt2 != Integer.MIN_VALUE)
          {
            paramInt1 = k;
            paramInt3 = i;
            if (paramInt2 != 1073741824) {
              continue;
            }
          }
          paramInt1 = Integer.MIN_VALUE;
          paramInt3 = i;
          continue;
        }
      }
      paramInt3 = 0;
      paramInt1 = k;
    }
  }
  
  public static eo a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    eo localeo = new eo();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecyclerView, paramInt1, paramInt2);
    localeo.a = paramContext.getInt(R.styleable.RecyclerView_android_orientation, 1);
    localeo.b = paramContext.getInt(R.styleable.RecyclerView_spanCount, 1);
    localeo.c = paramContext.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
    localeo.d = paramContext.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
    paramContext.recycle();
    return localeo;
  }
  
  private void a(int paramInt, View paramView)
  {
    this.p.d(paramInt);
  }
  
  private void a(eu parameu, int paramInt, View paramView)
  {
    fd localfd = RecyclerView.c(paramView);
    if (localfd.c()) {
      return;
    }
    if ((localfd.n()) && (!localfd.q()) && (!RecyclerView.f(this.q).b()))
    {
      f(paramInt);
      parameu.b(localfd);
      return;
    }
    g(paramInt);
    parameu.c(paramView);
    this.q.e.h(localfd);
  }
  
  private void a(ey paramey)
  {
    if (this.r == paramey) {
      this.r = null;
    }
  }
  
  private void a(View paramView, int paramInt, boolean paramBoolean)
  {
    fd localfd = RecyclerView.c(paramView);
    ep localep;
    if ((paramBoolean) || (localfd.q()))
    {
      this.q.e.e(localfd);
      localep = (ep)paramView.getLayoutParams();
      if ((!localfd.k()) && (!localfd.i())) {
        break label128;
      }
      if (!localfd.i()) {
        break label120;
      }
      localfd.j();
      label68:
      this.p.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    for (;;)
    {
      if (localep.d)
      {
        localfd.a.invalidate();
        localep.d = false;
      }
      return;
      this.q.e.f(localfd);
      break;
      label120:
      localfd.l();
      break label68;
      label128:
      if (paramView.getParent() == this.q)
      {
        int j = this.p.b(paramView);
        int i = paramInt;
        if (paramInt == -1) {
          i = this.p.b();
        }
        if (j == -1) {
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(paramView));
        }
        if (j != i) {
          this.q.f.c(j, i);
        }
      }
      else
      {
        this.p.a(paramView, paramInt, false);
        localep.c = true;
        if ((this.r != null) && (this.r.c())) {
          this.r.b(paramView);
        }
      }
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = true;
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    boolean bool1;
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
        switch (i)
        {
        case 0: 
        default: 
          return false;
        case -2147483648: 
          bool1 = bool2;
        }
      } while (paramInt2 >= paramInt1);
      return false;
      bool1 = bool2;
    } while (paramInt2 == paramInt1);
    return false;
  }
  
  public int A()
  {
    if (this.q != null) {
      return this.q.getPaddingRight();
    }
    return 0;
  }
  
  public int B()
  {
    if (this.q != null) {
      return this.q.getPaddingBottom();
    }
    return 0;
  }
  
  public View C()
  {
    if (this.q == null) {}
    View localView;
    do
    {
      return null;
      localView = this.q.getFocusedChild();
    } while ((localView == null) || (this.p.c(localView)));
    return localView;
  }
  
  public int D()
  {
    return cb.q(this.q);
  }
  
  public int E()
  {
    return cb.r(this.q);
  }
  
  void F()
  {
    if (this.r != null) {
      this.r.a();
    }
  }
  
  public void G()
  {
    this.a = true;
  }
  
  boolean H()
  {
    boolean bool2 = false;
    int j = t();
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        ViewGroup.LayoutParams localLayoutParams = h(i).getLayoutParams();
        if ((localLayoutParams.width < 0) && (localLayoutParams.height < 0)) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  public int a(int paramInt, eu parameu, fa paramfa)
  {
    return 0;
  }
  
  public int a(eu parameu, fa paramfa)
  {
    if ((this.q == null) || (RecyclerView.f(this.q) == null)) {}
    while (!e()) {
      return 1;
    }
    return RecyclerView.f(this.q).a();
  }
  
  public abstract ep a();
  
  public ep a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new ep(paramContext, paramAttributeSet);
  }
  
  public ep a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ep)) {
      return new ep((ep)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new ep((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new ep(paramLayoutParams);
  }
  
  public View a(View paramView, int paramInt, eu parameu, fa paramfa)
  {
    return null;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.f = View.MeasureSpec.getSize(paramInt1);
    this.d = View.MeasureSpec.getMode(paramInt1);
    if ((this.d == 0) && (!RecyclerView.a)) {
      this.f = 0;
    }
    this.g = View.MeasureSpec.getSize(paramInt2);
    this.e = View.MeasureSpec.getMode(paramInt2);
    if ((this.e == 0) && (!RecyclerView.a)) {
      this.g = 0;
    }
  }
  
  public void a(int paramInt, eu parameu)
  {
    View localView = h(paramInt);
    f(paramInt);
    parameu.a(localView);
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = y();
    int k = A();
    int m = paramRect.height();
    int n = z();
    int i1 = B();
    d(a(paramInt1, i + j + k, D()), a(paramInt2, m + n + i1, E()));
  }
  
  public void a(Parcelable paramParcelable) {}
  
  void a(l paraml)
  {
    a(this.q.b, this.q.h, paraml);
  }
  
  public void a(RecyclerView paramRecyclerView) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    c(paramRecyclerView, paramInt1, paramInt2);
  }
  
  public void a(RecyclerView paramRecyclerView, eu parameu)
  {
    e(paramRecyclerView);
  }
  
  public void a(ed paramed1, ed paramed2) {}
  
  public void a(eu parameu)
  {
    int i = t() - 1;
    while (i >= 0)
    {
      a(parameu, i, h(i));
      i -= 1;
    }
  }
  
  public void a(eu parameu, fa paramfa, int paramInt1, int paramInt2)
  {
    this.q.d(paramInt1, paramInt2);
  }
  
  public void a(eu parameu, fa paramfa, l paraml)
  {
    if ((cb.b(this.q, -1)) || (cb.a(this.q, -1)))
    {
      paraml.a(8192);
      paraml.i(true);
    }
    if ((cb.b(this.q, 1)) || (cb.a(this.q, 1)))
    {
      paraml.a(4096);
      paraml.i(true);
    }
    paraml.b(w.a(a(parameu, paramfa), b(parameu, paramfa), e(parameu, paramfa), d(parameu, paramfa)));
  }
  
  public void a(eu parameu, fa paramfa, View paramView, l paraml)
  {
    int i;
    if (e())
    {
      i = d(paramView);
      if (!d()) {
        break label51;
      }
    }
    label51:
    for (int j = d(paramView);; j = 0)
    {
      paraml.c(x.a(i, 1, j, 1, false, false));
      return;
      i = 0;
      break;
    }
  }
  
  public void a(eu parameu, fa paramfa, AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = true;
    parameu = a.a(paramAccessibilityEvent);
    if ((this.q == null) || (parameu == null)) {
      return;
    }
    boolean bool1 = bool2;
    if (!cb.b(this.q, 1))
    {
      bool1 = bool2;
      if (!cb.b(this.q, -1))
      {
        bool1 = bool2;
        if (!cb.a(this.q, -1)) {
          if (!cb.a(this.q, 1)) {
            break label111;
          }
        }
      }
    }
    label111:
    for (bool1 = bool2;; bool1 = false)
    {
      parameu.a(bool1);
      if (RecyclerView.f(this.q) == null) {
        break;
      }
      parameu.a(RecyclerView.f(this.q).a());
      return;
    }
  }
  
  public void a(View paramView)
  {
    a(paramView, -1);
  }
  
  public void a(View paramView, int paramInt)
  {
    a(paramView, paramInt, true);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2)
  {
    ep localep = (ep)paramView.getLayoutParams();
    Rect localRect = this.q.h(paramView);
    int k = localRect.left;
    int m = localRect.right;
    int i = localRect.top;
    int j = localRect.bottom;
    paramInt1 = a(w(), u(), k + m + paramInt1 + (y() + A() + localep.leftMargin + localep.rightMargin), localep.width, d());
    paramInt2 = a(x(), v(), j + i + paramInt2 + (z() + B() + localep.topMargin + localep.bottomMargin), localep.height, e());
    if (b(paramView, paramInt1, paramInt2, localep)) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((ep)paramView.getLayoutParams()).b;
    paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }
  
  public void a(View paramView, int paramInt, ep paramep)
  {
    fd localfd = RecyclerView.c(paramView);
    if (localfd.q()) {
      this.q.e.e(localfd);
    }
    for (;;)
    {
      this.p.a(paramView, paramInt, paramep, localfd.q());
      return;
      this.q.e.f(localfd);
    }
  }
  
  public void a(View paramView, Rect paramRect)
  {
    if (this.q == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramRect.set(this.q.h(paramView));
  }
  
  void a(View paramView, l paraml)
  {
    fd localfd = RecyclerView.c(paramView);
    if ((localfd != null) && (!localfd.q()) && (!this.p.c(localfd.a))) {
      a(this.q.b, this.q.h, paramView, paraml);
    }
  }
  
  public void a(View paramView, eu parameu)
  {
    c(paramView);
    parameu.a(paramView);
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    a(this.q.b, this.q.h, paramAccessibilityEvent);
  }
  
  public void a(String paramString)
  {
    if (this.q != null) {
      this.q.a(paramString);
    }
  }
  
  boolean a(int paramInt, Bundle paramBundle)
  {
    return a(this.q.b, this.q.h, paramInt, paramBundle);
  }
  
  public boolean a(RecyclerView paramRecyclerView, fa paramfa, View paramView1, View paramView2)
  {
    return a(paramRecyclerView, paramView1, paramView2);
  }
  
  public boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i2 = y();
    int m = z();
    int i3 = w() - A();
    int i1 = x();
    int i6 = B();
    int i4 = paramView.getLeft() + paramRect.left - paramView.getScrollX();
    int n = paramView.getTop() + paramRect.top - paramView.getScrollY();
    int i5 = i4 + paramRect.width();
    int i7 = paramRect.height();
    int i = Math.min(0, i4 - i2);
    int j = Math.min(0, n - m);
    int k = Math.max(0, i5 - i3);
    i1 = Math.max(0, n + i7 - (i1 - i6));
    if (r() == 1) {
      if (k != 0)
      {
        i = k;
        if (j == 0) {
          break label217;
        }
        label154:
        if ((i == 0) && (j == 0)) {
          break label243;
        }
        if (!paramBoolean) {
          break label232;
        }
        paramRecyclerView.scrollBy(i, j);
      }
    }
    for (;;)
    {
      return true;
      i = Math.max(i, i5 - i3);
      break;
      if (i != 0) {
        break;
      }
      for (;;)
      {
        i = Math.min(i4 - i2, k);
      }
      label217:
      j = Math.min(n - m, i1);
      break label154;
      label232:
      paramRecyclerView.a(i, j);
    }
    label243:
    return false;
  }
  
  @Deprecated
  public boolean a(RecyclerView paramRecyclerView, View paramView1, View paramView2)
  {
    return (q()) || (paramRecyclerView.j());
  }
  
  public boolean a(RecyclerView paramRecyclerView, ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean a(ep paramep)
  {
    return paramep != null;
  }
  
  public boolean a(eu parameu, fa paramfa, int paramInt, Bundle paramBundle)
  {
    if (this.q == null) {}
    int i;
    do
    {
      return false;
      switch (paramInt)
      {
      default: 
        paramInt = 0;
        i = 0;
      }
    } while ((i == 0) && (paramInt == 0));
    this.q.scrollBy(paramInt, i);
    return true;
    if (cb.b(this.q, -1)) {}
    for (paramInt = -(x() - z() - B());; paramInt = 0)
    {
      i = paramInt;
      int j;
      if (cb.a(this.q, -1))
      {
        j = -(w() - y() - A());
        i = paramInt;
        paramInt = j;
        break;
        if (!cb.b(this.q, 1)) {
          break label207;
        }
      }
      label207:
      for (paramInt = x() - z() - B();; paramInt = 0)
      {
        i = paramInt;
        if (cb.a(this.q, 1))
        {
          j = w();
          int k = y();
          int m = A();
          i = paramInt;
          paramInt = j - k - m;
          break;
        }
        paramInt = 0;
        break;
      }
    }
  }
  
  public boolean a(eu parameu, fa paramfa, View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  boolean a(View paramView, int paramInt1, int paramInt2, ep paramep)
  {
    return (!this.c) || (!b(paramView.getMeasuredWidth(), paramInt1, paramep.width)) || (!b(paramView.getMeasuredHeight(), paramInt2, paramep.height));
  }
  
  boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a(this.q.b, this.q.h, paramView, paramInt, paramBundle);
  }
  
  public boolean a(Runnable paramRunnable)
  {
    if (this.q != null) {
      return this.q.removeCallbacks(paramRunnable);
    }
    return false;
  }
  
  public int b(int paramInt, eu parameu, fa paramfa)
  {
    return 0;
  }
  
  public int b(eu parameu, fa paramfa)
  {
    if ((this.q == null) || (RecyclerView.f(this.q) == null)) {}
    while (!d()) {
      return 1;
    }
    return RecyclerView.f(this.q).a();
  }
  
  public int b(fa paramfa)
  {
    return 0;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int j = Integer.MAX_VALUE;
    int i = Integer.MIN_VALUE;
    int i5 = t();
    if (i5 == 0)
    {
      this.q.d(paramInt1, paramInt2);
      return;
    }
    int n = 0;
    int k = Integer.MIN_VALUE;
    int m = Integer.MAX_VALUE;
    int i1;
    int i3;
    int i2;
    if (n < i5)
    {
      View localView = h(n);
      ep localep = (ep)localView.getLayoutParams();
      int i4 = h(localView) - localep.leftMargin;
      i1 = j(localView);
      i3 = localep.rightMargin + i1;
      i2 = i(localView) - localep.topMargin;
      i1 = k(localView);
      i1 = localep.bottomMargin + i1;
      if (i4 >= m) {
        break label221;
      }
      m = i4;
    }
    label221:
    for (;;)
    {
      if (i3 > k) {
        k = i3;
      }
      for (;;)
      {
        if (i2 < j) {
          j = i2;
        }
        for (;;)
        {
          if (i1 > i) {
            i = i1;
          }
          for (;;)
          {
            n += 1;
            break;
            RecyclerView.s(this.q).set(m, j, k, i);
            a(RecyclerView.s(this.q), paramInt1, paramInt2);
            return;
          }
        }
      }
    }
  }
  
  void b(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.q = null;
      this.p = null;
      this.f = 0;
    }
    for (this.g = 0;; this.g = paramRecyclerView.getHeight())
    {
      this.d = 1073741824;
      this.e = 1073741824;
      return;
      this.q = paramRecyclerView;
      this.p = paramRecyclerView.d;
      this.f = paramRecyclerView.getWidth();
    }
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  void b(RecyclerView paramRecyclerView, eu parameu)
  {
    this.s = false;
    a(paramRecyclerView, parameu);
  }
  
  void b(eu parameu)
  {
    int j = parameu.d();
    int i = j - 1;
    if (i >= 0)
    {
      View localView = parameu.e(i);
      fd localfd = RecyclerView.c(localView);
      if (localfd.c()) {}
      for (;;)
      {
        i -= 1;
        break;
        localfd.a(false);
        if (localfd.r()) {
          this.q.removeDetachedView(localView, false);
        }
        if (this.q.g != null) {
          this.q.g.c(localfd);
        }
        localfd.a(true);
        parameu.b(localView);
      }
    }
    parameu.e();
    if (j > 0) {
      this.q.invalidate();
    }
  }
  
  public void b(View paramView)
  {
    b(paramView, -1);
  }
  
  public void b(View paramView, int paramInt)
  {
    a(paramView, paramInt, false);
  }
  
  public boolean b()
  {
    return false;
  }
  
  boolean b(View paramView, int paramInt1, int paramInt2, ep paramep)
  {
    return (paramView.isLayoutRequested()) || (!this.c) || (!b(paramView.getWidth(), paramInt1, paramep.width)) || (!b(paramView.getHeight(), paramInt2, paramep.height));
  }
  
  public int c(fa paramfa)
  {
    return 0;
  }
  
  public Parcelable c()
  {
    return null;
  }
  
  public View c(int paramInt)
  {
    int j = t();
    int i = 0;
    if (i < j)
    {
      View localView = h(i);
      fd localfd = RecyclerView.c(localView);
      if (localfd == null) {}
      while ((localfd.d() != paramInt) || (localfd.c()) || ((!this.q.h.a()) && (localfd.q())))
      {
        i += 1;
        break;
      }
      return localView;
    }
    return null;
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    View localView = h(paramInt1);
    if (localView == null) {
      throw new IllegalArgumentException("Cannot move a child from non-existing index:" + paramInt1);
    }
    g(paramInt1);
    c(localView, paramInt2);
  }
  
  void c(RecyclerView paramRecyclerView)
  {
    this.s = true;
    d(paramRecyclerView);
  }
  
  public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void c(eu parameu)
  {
    int i = t() - 1;
    while (i >= 0)
    {
      if (!RecyclerView.c(h(i)).c()) {
        a(i, parameu);
      }
      i -= 1;
    }
  }
  
  public void c(eu parameu, fa paramfa)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public void c(View paramView)
  {
    this.p.a(paramView);
  }
  
  public void c(View paramView, int paramInt)
  {
    a(paramView, paramInt, (ep)paramView.getLayoutParams());
  }
  
  public void c(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public int d(eu parameu, fa paramfa)
  {
    return 0;
  }
  
  public int d(fa paramfa)
  {
    return 0;
  }
  
  public int d(View paramView)
  {
    return ((ep)paramView.getLayoutParams()).e();
  }
  
  public View d(View paramView, int paramInt)
  {
    return null;
  }
  
  public void d(int paramInt) {}
  
  public void d(int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.q, paramInt1, paramInt2);
  }
  
  public void d(RecyclerView paramRecyclerView) {}
  
  public boolean d()
  {
    return false;
  }
  
  public int e(fa paramfa)
  {
    return 0;
  }
  
  public View e(View paramView)
  {
    if (this.q == null) {}
    do
    {
      return null;
      paramView = this.q.b(paramView);
    } while ((paramView == null) || (this.p.c(paramView)));
    return paramView;
  }
  
  @Deprecated
  public void e(RecyclerView paramRecyclerView) {}
  
  public boolean e()
  {
    return false;
  }
  
  public boolean e(eu parameu, fa paramfa)
  {
    return false;
  }
  
  public int f(fa paramfa)
  {
    return 0;
  }
  
  public int f(View paramView)
  {
    Rect localRect = ((ep)paramView.getLayoutParams()).b;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    return localRect.right + (i + j);
  }
  
  public void f(int paramInt)
  {
    if (h(paramInt) != null) {
      this.p.a(paramInt);
    }
  }
  
  void f(RecyclerView paramRecyclerView)
  {
    a(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
  }
  
  public int g(fa paramfa)
  {
    return 0;
  }
  
  public int g(View paramView)
  {
    Rect localRect = ((ep)paramView.getLayoutParams()).b;
    int i = paramView.getMeasuredHeight();
    int j = localRect.top;
    return localRect.bottom + (i + j);
  }
  
  public void g(int paramInt)
  {
    a(paramInt, h(paramInt));
  }
  
  public int h(View paramView)
  {
    return paramView.getLeft() - n(paramView);
  }
  
  public View h(int paramInt)
  {
    if (this.p != null) {
      return this.p.b(paramInt);
    }
    return null;
  }
  
  public int i(View paramView)
  {
    return paramView.getTop() - l(paramView);
  }
  
  public void i(int paramInt)
  {
    if (this.q != null) {
      this.q.b(paramInt);
    }
  }
  
  public int j(View paramView)
  {
    return paramView.getRight() + o(paramView);
  }
  
  public void j(int paramInt)
  {
    if (this.q != null) {
      this.q.a(paramInt);
    }
  }
  
  public int k(View paramView)
  {
    return paramView.getBottom() + m(paramView);
  }
  
  public void k(int paramInt) {}
  
  boolean k()
  {
    return false;
  }
  
  public int l(View paramView)
  {
    return ((ep)paramView.getLayoutParams()).b.top;
  }
  
  public int m(View paramView)
  {
    return ((ep)paramView.getLayoutParams()).b.bottom;
  }
  
  public int n(View paramView)
  {
    return ((ep)paramView.getLayoutParams()).b.left;
  }
  
  public void n()
  {
    if (this.q != null) {
      this.q.requestLayout();
    }
  }
  
  public int o(View paramView)
  {
    return ((ep)paramView.getLayoutParams()).b.right;
  }
  
  public boolean o()
  {
    return this.s;
  }
  
  public boolean p()
  {
    return (this.q != null) && (RecyclerView.t(this.q));
  }
  
  public boolean q()
  {
    return (this.r != null) && (this.r.c());
  }
  
  public int r()
  {
    return cb.h(this.q);
  }
  
  public int s()
  {
    return -1;
  }
  
  public int t()
  {
    if (this.p != null) {
      return this.p.b();
    }
    return 0;
  }
  
  public int u()
  {
    return this.d;
  }
  
  public int v()
  {
    return this.e;
  }
  
  public int w()
  {
    return this.f;
  }
  
  public int x()
  {
    return this.g;
  }
  
  public int y()
  {
    if (this.q != null) {
      return this.q.getPaddingLeft();
    }
    return 0;
  }
  
  public int z()
  {
    if (this.q != null) {
      return this.q.getPaddingTop();
    }
    return 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */