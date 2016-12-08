package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.ar;
import android.support.v4.view.a.l;
import android.support.v4.view.a.x;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

public class StaggeredGridLayoutManager
  extends en
{
  private final Runnable A = new fx(this);
  du a;
  du b;
  boolean c = false;
  int d = -1;
  int e = Integer.MIN_VALUE;
  StaggeredGridLayoutManager.LazySpanLookup f = new StaggeredGridLayoutManager.LazySpanLookup();
  private int g = -1;
  private gc[] h;
  private int i;
  private int j;
  private final cw k;
  private boolean l = false;
  private BitSet m;
  private int n = 2;
  private boolean o;
  private boolean t;
  private StaggeredGridLayoutManager.SavedState u;
  private int v;
  private final Rect w = new Rect();
  private final fy x = new fy(this, null);
  private boolean y = false;
  private boolean z = true;
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    this.i = paramInt2;
    a(paramInt1);
    if (this.n != 0) {}
    for (;;)
    {
      c(bool);
      this.k = new cw();
      m();
      return;
      bool = false;
    }
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    b(paramContext.a);
    a(paramContext.b);
    a(paramContext.c);
    if (this.n != 0) {}
    for (;;)
    {
      c(bool);
      this.k = new cw();
      m();
      return;
      bool = false;
    }
  }
  
  private boolean I()
  {
    if ((t() == 0) || (this.n == 0) || (!o())) {
      return false;
    }
    int i2;
    if (this.c) {
      i2 = L();
    }
    for (int i1 = M(); (i2 == 0) && (f() != null); i1 = L())
    {
      this.f.a();
      G();
      n();
      return true;
      i2 = M();
    }
    if (!this.y) {
      return false;
    }
    if (this.c) {}
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
    for (int i3 = -1;; i3 = 1)
    {
      localFullSpanItem1 = this.f.a(i2, i1 + 1, i3, true);
      if (localFullSpanItem1 != null) {
        break;
      }
      this.y = false;
      this.f.a(i1 + 1);
      return false;
    }
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = this.f.a(i2, localFullSpanItem1.a, i3 * -1, true);
    if (localFullSpanItem2 == null) {
      this.f.a(localFullSpanItem1.a);
    }
    for (;;)
    {
      G();
      n();
      return true;
      this.f.a(localFullSpanItem2.a + 1);
    }
  }
  
  private void J()
  {
    boolean bool = true;
    if ((this.i == 1) || (!h()))
    {
      this.c = this.l;
      return;
    }
    if (!this.l) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
  
  private void K()
  {
    if (this.b.h() == 1073741824) {
      return;
    }
    float f1 = 0.0F;
    int i3 = t();
    int i1 = 0;
    View localView;
    float f2;
    while (i1 < i3)
    {
      localView = h(i1);
      f2 = this.b.c(localView);
      if (f2 < f1)
      {
        label53:
        i1 += 1;
      }
      else
      {
        if (!((fz)localView.getLayoutParams()).a()) {
          break label319;
        }
        f2 = 1.0F * f2 / this.g;
      }
    }
    label155:
    label193:
    label319:
    for (;;)
    {
      f1 = Math.max(f1, f2);
      break label53;
      int i4 = this.j;
      int i2 = Math.round(this.g * f1);
      i1 = i2;
      if (this.b.h() == Integer.MIN_VALUE) {
        i1 = Math.min(i2, this.b.f());
      }
      e(i1);
      if (this.j == i4) {
        break;
      }
      i1 = 0;
      fz localfz;
      if (i1 < i3)
      {
        localView = h(i1);
        localfz = (fz)localView.getLayoutParams();
        if (!localfz.f) {
          break label193;
        }
      }
      for (;;)
      {
        i1 += 1;
        break label155;
        break;
        if ((h()) && (this.i == 1))
        {
          localView.offsetLeftAndRight(-(this.g - 1 - localfz.e.d) * this.j - -(this.g - 1 - localfz.e.d) * i4);
        }
        else
        {
          i2 = localfz.e.d * this.j;
          int i5 = localfz.e.d * i4;
          if (this.i == 1) {
            localView.offsetLeftAndRight(i2 - i5);
          } else {
            localView.offsetTopAndBottom(i2 - i5);
          }
        }
      }
    }
  }
  
  private int L()
  {
    int i1 = t();
    if (i1 == 0) {
      return 0;
    }
    return d(h(i1 - 1));
  }
  
  private int M()
  {
    if (t() == 0) {
      return 0;
    }
    return d(h(0));
  }
  
  private int a(eu parameu, cw paramcw, fa paramfa)
  {
    this.m.set(0, this.g, true);
    int i1;
    int i4;
    label61:
    int i2;
    label64:
    View localView;
    fz localfz;
    int i7;
    int i6;
    label136:
    gc localgc;
    label157:
    label168:
    label189:
    label222:
    int i5;
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    int i3;
    if (this.k.i) {
      if (paramcw.e == 1)
      {
        i1 = Integer.MAX_VALUE;
        e(paramcw.e, i1);
        if (!this.c) {
          break label506;
        }
        i4 = this.a.d();
        i2 = 0;
        if ((!paramcw.a(paramfa)) || ((!this.k.i) && (this.m.isEmpty()))) {
          break label876;
        }
        localView = paramcw.a(parameu);
        localfz = (fz)localView.getLayoutParams();
        i7 = localfz.e();
        i2 = this.f.c(i7);
        if (i2 != -1) {
          break label518;
        }
        i6 = 1;
        if (i6 == 0) {
          break label534;
        }
        if (!localfz.f) {
          break label524;
        }
        localgc = this.h[0];
        this.f.a(i7, localgc);
        localfz.e = localgc;
        if (paramcw.e != 1) {
          break label546;
        }
        b(localView);
        a(localView, localfz, false);
        if (paramcw.e != 1) {
          break label568;
        }
        if (!localfz.f) {
          break label556;
        }
        i2 = q(i4);
        i5 = i2 + this.a.c(localView);
        if ((i6 == 0) || (!localfz.f)) {
          break label967;
        }
        localFullSpanItem = m(i2);
        localFullSpanItem.b = -1;
        localFullSpanItem.a = i7;
        this.f.a(localFullSpanItem);
        i3 = i2;
      }
    }
    for (;;)
    {
      if ((localfz.f) && (paramcw.d == -1))
      {
        if (i6 != 0) {
          this.y = true;
        }
      }
      else
      {
        label309:
        a(localView, localfz, paramcw);
        if ((!h()) || (this.i != 1)) {
          break label768;
        }
        if (!localfz.f) {
          break label738;
        }
        i2 = this.b.d();
        label350:
        i7 = i2 - this.b.c(localView);
        i6 = i2;
        i2 = i7;
        if (this.i != 1) {
          break label825;
        }
        b(localView, i2, i3, i6, i5);
        label394:
        if (!localfz.f) {
          break label842;
        }
        e(this.k.e, i1);
        label415:
        a(parameu, this.k);
        if ((this.k.h) && (localView.isFocusable()))
        {
          if (!localfz.f) {
            break label860;
          }
          this.m.clear();
        }
      }
      for (;;)
      {
        i2 = 1;
        break label64;
        i1 = Integer.MIN_VALUE;
        break;
        if (paramcw.e == 1)
        {
          i1 = paramcw.g + paramcw.b;
          break;
        }
        i1 = paramcw.f - paramcw.b;
        break;
        label506:
        i4 = this.a.c();
        break label61;
        label518:
        i6 = 0;
        break label136;
        label524:
        localgc = a(paramcw);
        break label157;
        label534:
        localgc = this.h[i2];
        break label168;
        label546:
        b(localView, 0);
        break label189;
        label556:
        i2 = localgc.b(i4);
        break label222;
        label568:
        if (localfz.f) {}
        for (i2 = p(i4);; i2 = localgc.a(i4))
        {
          i3 = i2 - this.a.c(localView);
          if ((i6 != 0) && (localfz.f))
          {
            localFullSpanItem = n(i2);
            localFullSpanItem.b = 1;
            localFullSpanItem.a = i7;
            this.f.a(localFullSpanItem);
          }
          i5 = i2;
          break;
        }
        if (paramcw.e == 1) {
          if (!j()) {
            i2 = 1;
          }
        }
        for (;;)
        {
          if (i2 == 0) {
            break label736;
          }
          localFullSpanItem = this.f.f(i7);
          if (localFullSpanItem != null) {
            localFullSpanItem.d = true;
          }
          this.y = true;
          break;
          i2 = 0;
          continue;
          if (!l()) {
            i2 = 1;
          } else {
            i2 = 0;
          }
        }
        label736:
        break label309;
        label738:
        i2 = this.b.d() - (this.g - 1 - localgc.d) * this.j;
        break label350;
        label768:
        if (localfz.f) {}
        for (i2 = this.b.c();; i2 = localgc.d * this.j + this.b.c())
        {
          i6 = i2 + this.b.c(localView);
          break;
        }
        label825:
        b(localView, i3, i2, i5, i6);
        break label394;
        label842:
        a(localgc, this.k.e, i1);
        break label415;
        label860:
        this.m.set(localgc.d, false);
      }
      label876:
      if (i2 == 0) {
        a(parameu, this.k);
      }
      if (this.k.e == -1) {
        i1 = p(this.a.c());
      }
      for (i1 = this.a.c() - i1; i1 > 0; i1 = q(this.a.d()) - this.a.d()) {
        return Math.min(paramcw.b, i1);
      }
      return 0;
      label967:
      i3 = i2;
    }
  }
  
  private int a(fa paramfa)
  {
    boolean bool2 = false;
    if (t() == 0) {
      return 0;
    }
    du localdu = this.a;
    if (!this.z) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.z) {
        bool1 = true;
      }
      return fl.a(paramfa, localdu, localView, b(bool1, true), this, this.z, this.c);
    }
  }
  
  private gc a(cw paramcw)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    int i2 = -1;
    int i1;
    int i3;
    int i6;
    int i5;
    int i4;
    if (s(paramcw.e))
    {
      i1 = this.g - 1;
      i3 = -1;
      if (paramcw.e != 1) {
        break label121;
      }
      i6 = this.a.c();
      i5 = Integer.MAX_VALUE;
      i4 = i1;
      paramcw = (cw)localObject1;
      i1 = i5;
      label59:
      localObject1 = paramcw;
      if (i4 == i3) {
        break label192;
      }
      localObject1 = this.h[i4];
      i5 = ((gc)localObject1).b(i6);
      if (i5 >= i1) {
        break label198;
      }
      paramcw = (cw)localObject1;
      i1 = i5;
    }
    label121:
    label192:
    label195:
    label198:
    for (;;)
    {
      i4 += i2;
      break label59;
      i3 = this.g;
      i1 = 0;
      i2 = 1;
      break;
      i6 = this.a.d();
      i5 = Integer.MIN_VALUE;
      i4 = i1;
      paramcw = (cw)localObject2;
      i1 = i5;
      localObject1 = paramcw;
      if (i4 != i3)
      {
        localObject1 = this.h[i4];
        i5 = ((gc)localObject1).a(i6);
        if (i5 <= i1) {
          break label195;
        }
        paramcw = (cw)localObject1;
        i1 = i5;
      }
      for (;;)
      {
        i4 += i2;
        break;
        return (gc)localObject1;
      }
    }
  }
  
  private void a(int paramInt, fa paramfa)
  {
    boolean bool2 = false;
    this.k.b = 0;
    this.k.c = paramInt;
    int i1;
    boolean bool1;
    if (q())
    {
      i1 = paramfa.c();
      if (i1 != -1)
      {
        boolean bool3 = this.c;
        if (i1 < paramInt)
        {
          bool1 = true;
          if (bool3 != bool1) {
            break label171;
          }
          paramInt = this.a.f();
          i1 = 0;
        }
      }
    }
    for (;;)
    {
      label67:
      if (p())
      {
        this.k.f = (this.a.c() - i1);
        this.k.g = (paramInt + this.a.d());
      }
      for (;;)
      {
        this.k.h = false;
        this.k.a = true;
        paramfa = this.k;
        bool1 = bool2;
        if (this.a.h() == 0)
        {
          bool1 = bool2;
          if (this.a.e() == 0) {
            bool1 = true;
          }
        }
        paramfa.i = bool1;
        return;
        bool1 = false;
        break;
        label171:
        i1 = this.a.f();
        paramInt = 0;
        break label67;
        this.k.g = (paramInt + this.a.e());
        this.k.f = (-i1);
      }
      paramInt = 0;
      i1 = 0;
    }
  }
  
  private void a(eu parameu, int paramInt)
  {
    for (;;)
    {
      View localView;
      fz localfz;
      if (t() > 0)
      {
        localView = h(0);
        if (this.a.b(localView) <= paramInt)
        {
          localfz = (fz)localView.getLayoutParams();
          if (!localfz.f) {
            break label105;
          }
          i1 = 0;
          if (i1 >= this.g) {
            break label79;
          }
          if (gc.a(this.h[i1]).size() != 1) {
            break label72;
          }
        }
      }
      label72:
      label79:
      label105:
      while (gc.a(localfz.e).size() == 1)
      {
        for (;;)
        {
          return;
          i1 += 1;
        }
        int i1 = 0;
        while (i1 < this.g)
        {
          this.h[i1].h();
          i1 += 1;
        }
      }
      localfz.e.h();
      a(localView, parameu);
    }
  }
  
  private void a(eu parameu, cw paramcw)
  {
    if ((!paramcw.a) || (paramcw.i)) {
      return;
    }
    if (paramcw.b == 0)
    {
      if (paramcw.e == -1)
      {
        b(parameu, paramcw.g);
        return;
      }
      a(parameu, paramcw.f);
      return;
    }
    if (paramcw.e == -1)
    {
      i1 = paramcw.f - o(paramcw.f);
      if (i1 < 0) {}
      for (i1 = paramcw.g;; i1 = paramcw.g - Math.min(i1, paramcw.b))
      {
        b(parameu, i1);
        return;
      }
    }
    int i1 = r(paramcw.g) - paramcw.g;
    if (i1 < 0) {}
    int i2;
    for (i1 = paramcw.f;; i1 = Math.min(i1, paramcw.b) + i2)
    {
      a(parameu, i1);
      return;
      i2 = paramcw.f;
    }
  }
  
  private void a(eu parameu, fa paramfa, boolean paramBoolean)
  {
    fy localfy = this.x;
    localfy.a();
    if (((this.u != null) || (this.d != -1)) && (paramfa.e() == 0))
    {
      c(parameu);
      return;
    }
    if (this.u != null) {
      a(localfy);
    }
    for (;;)
    {
      a(paramfa, localfy);
      if ((this.u == null) && ((localfy.c != this.o) || (h() != this.t)))
      {
        this.f.a();
        localfy.d = true;
      }
      if ((t() <= 0) || ((this.u != null) && (this.u.c >= 1))) {
        break label247;
      }
      if (!localfy.d) {
        break;
      }
      i1 = 0;
      while (i1 < this.g)
      {
        this.h[i1].e();
        if (localfy.b != Integer.MIN_VALUE) {
          this.h[i1].c(localfy.b);
        }
        i1 += 1;
      }
      J();
      localfy.c = this.c;
    }
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].a(this.c, localfy.b);
      i1 += 1;
    }
    label247:
    a(parameu);
    this.k.a = false;
    this.y = false;
    e(this.b.f());
    a(localfy.a, paramfa);
    if (localfy.c)
    {
      l(-1);
      a(parameu, this.k, paramfa);
      l(1);
      this.k.c = (localfy.a + this.k.d);
      a(parameu, this.k, paramfa);
      label346:
      K();
      if (t() > 0)
      {
        if (!this.c) {
          break label545;
        }
        b(parameu, paramfa, true);
        c(parameu, paramfa, false);
      }
      label378:
      if ((!paramBoolean) || (paramfa.a())) {
        break label574;
      }
      if ((this.n == 0) || (t() <= 0) || ((!this.y) && (f() == null))) {
        break label562;
      }
      i1 = 1;
      label420:
      if (i1 == 0) {
        break label568;
      }
      a(this.A);
      if (!I()) {
        break label568;
      }
      i1 = 1;
      label444:
      this.d = -1;
      this.e = Integer.MIN_VALUE;
    }
    for (;;)
    {
      this.o = localfy.c;
      this.t = h();
      this.u = null;
      if (i1 == 0) {
        break;
      }
      a(parameu, paramfa, false);
      return;
      l(1);
      a(parameu, this.k, paramfa);
      l(-1);
      this.k.c = (localfy.a + this.k.d);
      a(parameu, this.k, paramfa);
      break label346;
      label545:
      c(parameu, paramfa, true);
      b(parameu, paramfa, false);
      break label378;
      label562:
      i1 = 0;
      break label420;
      label568:
      i1 = 0;
      break label444;
      label574:
      i1 = 0;
    }
  }
  
  private void a(fy paramfy)
  {
    if (this.u.c > 0) {
      if (this.u.c == this.g)
      {
        int i2 = 0;
        if (i2 < this.g)
        {
          this.h[i2].e();
          int i3 = this.u.d[i2];
          int i1 = i3;
          if (i3 != Integer.MIN_VALUE) {
            if (!this.u.i) {
              break label102;
            }
          }
          label102:
          for (i1 = i3 + this.a.d();; i1 = i3 + this.a.c())
          {
            this.h[i2].c(i1);
            i2 += 1;
            break;
          }
        }
      }
      else
      {
        this.u.a();
        this.u.a = this.u.b;
      }
    }
    this.t = this.u.j;
    a(this.u.h);
    J();
    if (this.u.a != -1) {
      this.d = this.u.a;
    }
    for (paramfy.c = this.u.i;; paramfy.c = this.c)
    {
      if (this.u.e > 1)
      {
        this.f.a = this.u.f;
        this.f.b = this.u.g;
      }
      return;
    }
  }
  
  private void a(gc paramgc, int paramInt1, int paramInt2)
  {
    int i1 = paramgc.i();
    if (paramInt1 == -1) {
      if (i1 + paramgc.b() <= paramInt2) {
        this.m.set(paramgc.d, false);
      }
    }
    while (paramgc.d() - i1 < paramInt2) {
      return;
    }
    this.m.set(paramgc.d, false);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramView, this.w);
    fz localfz = (fz)paramView.getLayoutParams();
    paramInt1 = b(paramInt1, localfz.leftMargin + this.w.left, localfz.rightMargin + this.w.right);
    paramInt2 = b(paramInt2, localfz.topMargin + this.w.top, localfz.bottomMargin + this.w.bottom);
    if (paramBoolean) {}
    for (paramBoolean = a(paramView, paramInt1, paramInt2, localfz);; paramBoolean = b(paramView, paramInt1, paramInt2, localfz))
    {
      if (paramBoolean) {
        paramView.measure(paramInt1, paramInt2);
      }
      return;
    }
  }
  
  private void a(View paramView, fz paramfz, cw paramcw)
  {
    if (paramcw.e == 1)
    {
      if (paramfz.f)
      {
        p(paramView);
        return;
      }
      paramfz.e.b(paramView);
      return;
    }
    if (paramfz.f)
    {
      q(paramView);
      return;
    }
    paramfz.e.a(paramView);
  }
  
  private void a(View paramView, fz paramfz, boolean paramBoolean)
  {
    if (paramfz.f)
    {
      if (this.i == 1)
      {
        a(paramView, this.v, a(x(), v(), 0, paramfz.height, true), paramBoolean);
        return;
      }
      a(paramView, a(w(), u(), 0, paramfz.width, true), this.v, paramBoolean);
      return;
    }
    if (this.i == 1)
    {
      a(paramView, a(this.j, u(), 0, paramfz.width, false), a(x(), v(), 0, paramfz.height, true), paramBoolean);
      return;
    }
    a(paramView, a(w(), u(), 0, paramfz.width, true), a(this.j, v(), 0, paramfz.height, false), paramBoolean);
  }
  
  private boolean a(gc paramgc)
  {
    boolean bool = true;
    if (this.c)
    {
      if (paramgc.d() < this.a.d()) {
        return !paramgc.c((View)gc.a(paramgc).get(gc.a(paramgc).size() - 1)).f;
      }
    }
    else if (paramgc.b() > this.a.c())
    {
      if (!paramgc.c((View)gc.a(paramgc).get(0)).f) {}
      for (;;)
      {
        return bool;
        bool = false;
      }
    }
    return false;
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i1;
    do
    {
      return paramInt1;
      i1 = View.MeasureSpec.getMode(paramInt1);
    } while ((i1 != Integer.MIN_VALUE) && (i1 != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i1);
  }
  
  private void b(eu parameu, int paramInt)
  {
    int i1 = t() - 1;
    for (;;)
    {
      View localView;
      fz localfz;
      if (i1 >= 0)
      {
        localView = h(i1);
        if (this.a.a(localView) >= paramInt)
        {
          localfz = (fz)localView.getLayoutParams();
          if (!localfz.f) {
            break label119;
          }
          i2 = 0;
          if (i2 >= this.g) {
            break label88;
          }
          if (gc.a(this.h[i2]).size() != 1) {
            break label79;
          }
        }
      }
      label79:
      label88:
      label119:
      while (gc.a(localfz.e).size() == 1)
      {
        for (;;)
        {
          return;
          i2 += 1;
        }
        int i2 = 0;
        while (i2 < this.g)
        {
          this.h[i2].g();
          i2 += 1;
        }
      }
      localfz.e.g();
      a(localView, parameu);
      i1 -= 1;
    }
  }
  
  private void b(eu parameu, fa paramfa, boolean paramBoolean)
  {
    int i1 = q(Integer.MIN_VALUE);
    if (i1 == Integer.MIN_VALUE) {}
    do
    {
      do
      {
        return;
        i1 = this.a.d() - i1;
      } while (i1 <= 0);
      i1 -= -c(-i1, parameu, paramfa);
    } while ((!paramBoolean) || (i1 <= 0));
    this.a.a(i1);
  }
  
  private void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    fz localfz = (fz)paramView.getLayoutParams();
    a(paramView, paramInt1 + localfz.leftMargin, paramInt2 + localfz.topMargin, paramInt3 - localfz.rightMargin, paramInt4 - localfz.bottomMargin);
  }
  
  private void c(int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    int i2;
    int i1;
    if (this.c)
    {
      i3 = L();
      if (paramInt3 != 8) {
        break label104;
      }
      if (paramInt1 >= paramInt2) {
        break label93;
      }
      i2 = paramInt2 + 1;
      i1 = paramInt1;
      label32:
      this.f.b(i1);
      switch (paramInt3)
      {
      default: 
        label76:
        if (i2 > i3) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      i3 = M();
      break;
      label93:
      i2 = paramInt1 + 1;
      i1 = paramInt2;
      break label32;
      label104:
      i2 = paramInt1 + paramInt2;
      i1 = paramInt1;
      break label32;
      this.f.b(paramInt1, paramInt2);
      break label76;
      this.f.a(paramInt1, paramInt2);
      break label76;
      this.f.a(paramInt1, 1);
      this.f.b(paramInt2, 1);
      break label76;
      if (this.c) {}
      for (paramInt1 = M(); i1 <= paramInt1; paramInt1 = L())
      {
        n();
        return;
      }
    }
  }
  
  private void c(eu parameu, fa paramfa, boolean paramBoolean)
  {
    int i1 = p(Integer.MAX_VALUE);
    if (i1 == Integer.MAX_VALUE) {}
    do
    {
      do
      {
        return;
        i1 -= this.a.c();
      } while (i1 <= 0);
      i1 -= c(i1, parameu, paramfa);
    } while ((!paramBoolean) || (i1 <= 0));
    this.a.a(-i1);
  }
  
  private boolean c(fa paramfa, fy paramfy)
  {
    if (this.o) {}
    for (int i1 = v(paramfa.e());; i1 = u(paramfa.e()))
    {
      paramfy.a = i1;
      paramfy.b = Integer.MIN_VALUE;
      return true;
    }
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (i1 < this.g)
    {
      if (gc.a(this.h[i1]).isEmpty()) {}
      for (;;)
      {
        i1 += 1;
        break;
        a(this.h[i1], paramInt1, paramInt2);
      }
    }
  }
  
  private int h(fa paramfa)
  {
    boolean bool2 = false;
    if (t() == 0) {
      return 0;
    }
    du localdu = this.a;
    if (!this.z) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.z) {
        bool1 = true;
      }
      return fl.a(paramfa, localdu, localView, b(bool1, true), this, this.z);
    }
  }
  
  private int i(fa paramfa)
  {
    boolean bool2 = false;
    if (t() == 0) {
      return 0;
    }
    du localdu = this.a;
    if (!this.z) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.z) {
        bool1 = true;
      }
      return fl.b(paramfa, localdu, localView, b(bool1, true), this, this.z);
    }
  }
  
  private void l(int paramInt)
  {
    int i1 = 1;
    this.k.e = paramInt;
    cw localcw = this.k;
    boolean bool2 = this.c;
    boolean bool1;
    if (paramInt == -1)
    {
      bool1 = true;
      if (bool2 != bool1) {
        break label49;
      }
    }
    label49:
    for (paramInt = i1;; paramInt = -1)
    {
      localcw.d = paramInt;
      return;
      bool1 = false;
      break;
    }
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem m(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.c = new int[this.g];
    int i1 = 0;
    while (i1 < this.g)
    {
      localFullSpanItem.c[i1] = (paramInt - this.h[i1].b(paramInt));
      i1 += 1;
    }
    return localFullSpanItem;
  }
  
  private void m()
  {
    this.a = du.a(this, this.i);
    this.b = du.a(this, 1 - this.i);
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem n(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.c = new int[this.g];
    int i1 = 0;
    while (i1 < this.g)
    {
      localFullSpanItem.c[i1] = (this.h[i1].a(paramInt) - paramInt);
      i1 += 1;
    }
    return localFullSpanItem;
  }
  
  private int o(int paramInt)
  {
    int i2 = this.h[0].a(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].a(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private int p(int paramInt)
  {
    int i2 = this.h[0].a(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].a(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private void p(View paramView)
  {
    int i1 = this.g - 1;
    while (i1 >= 0)
    {
      this.h[i1].b(paramView);
      i1 -= 1;
    }
  }
  
  private int q(int paramInt)
  {
    int i2 = this.h[0].b(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].b(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private void q(View paramView)
  {
    int i1 = this.g - 1;
    while (i1 >= 0)
    {
      this.h[i1].a(paramView);
      i1 -= 1;
    }
  }
  
  private int r(int paramInt)
  {
    int i2 = this.h[0].b(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].b(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private boolean s(int paramInt)
  {
    int i1;
    if (this.i == 0) {
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 == this.c) {
          break label29;
        }
      }
    }
    label29:
    label63:
    label66:
    for (;;)
    {
      return true;
      i1 = 0;
      break;
      return false;
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 != this.c) {
          break label63;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == h()) {
          break label66;
        }
        return false;
        i1 = 0;
        break;
      }
    }
  }
  
  private int t(int paramInt)
  {
    int i1 = -1;
    if (t() == 0)
    {
      if (this.c) {
        return 1;
      }
      return -1;
    }
    int i2;
    if (paramInt < M())
    {
      i2 = 1;
      if (i2 == this.c) {
        break label47;
      }
    }
    label47:
    for (paramInt = i1;; paramInt = 1)
    {
      return paramInt;
      i2 = 0;
      break;
    }
  }
  
  private int u(int paramInt)
  {
    int i2 = t();
    int i1 = 0;
    while (i1 < i2)
    {
      int i3 = d(h(i1));
      if ((i3 >= 0) && (i3 < paramInt)) {
        return i3;
      }
      i1 += 1;
    }
    return 0;
  }
  
  private int v(int paramInt)
  {
    int i1 = t() - 1;
    while (i1 >= 0)
    {
      int i2 = d(h(i1));
      if ((i2 >= 0) && (i2 < paramInt)) {
        return i2;
      }
      i1 -= 1;
    }
    return 0;
  }
  
  private int w(int paramInt)
  {
    int i2 = -1;
    int i3 = 1;
    int i4 = Integer.MIN_VALUE;
    int i1 = i2;
    switch (paramInt)
    {
    default: 
      i1 = Integer.MIN_VALUE;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      do
      {
        do
        {
          return i1;
          return 1;
          i1 = i2;
        } while (this.i == 1);
        return Integer.MIN_VALUE;
        paramInt = i4;
        if (this.i == 1) {
          paramInt = 1;
        }
        return paramInt;
        i1 = i2;
      } while (this.i == 0);
      return Integer.MIN_VALUE;
    }
    if (this.i == 0) {}
    for (paramInt = i3;; paramInt = Integer.MIN_VALUE) {
      return paramInt;
    }
  }
  
  public int a(int paramInt, eu parameu, fa paramfa)
  {
    return c(paramInt, parameu, paramfa);
  }
  
  public int a(eu parameu, fa paramfa)
  {
    if (this.i == 0) {
      return this.g;
    }
    return super.a(parameu, paramfa);
  }
  
  public ep a()
  {
    if (this.i == 0) {
      return new fz(-2, -1);
    }
    return new fz(-1, -2);
  }
  
  public ep a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new fz(paramContext, paramAttributeSet);
  }
  
  public ep a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new fz((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new fz(paramLayoutParams);
  }
  
  public View a(View paramView, int paramInt, eu parameu, fa paramfa)
  {
    int i1 = 0;
    if (t() == 0) {
      return null;
    }
    paramView = e(paramView);
    if (paramView == null) {
      return null;
    }
    J();
    int i2 = w(paramInt);
    if (i2 == Integer.MIN_VALUE) {
      return null;
    }
    Object localObject = (fz)paramView.getLayoutParams();
    boolean bool = ((fz)localObject).f;
    localObject = ((fz)localObject).e;
    if (i2 == 1) {}
    for (paramInt = L();; paramInt = M())
    {
      a(paramInt, paramfa);
      l(i2);
      this.k.c = (this.k.d + paramInt);
      this.k.b = ((int)(0.33333334F * this.a.f()));
      this.k.h = true;
      this.k.a = false;
      a(parameu, this.k, paramfa);
      this.o = this.c;
      if (bool) {
        break;
      }
      parameu = ((gc)localObject).a(paramInt, i2);
      if ((parameu == null) || (parameu == paramView)) {
        break;
      }
      return parameu;
    }
    if (s(i2))
    {
      i1 = this.g - 1;
      while (i1 >= 0)
      {
        parameu = this.h[i1].a(paramInt, i2);
        if ((parameu != null) && (parameu != paramView)) {
          return parameu;
        }
        i1 -= 1;
      }
    }
    do
    {
      i1 += 1;
      if (i1 >= this.g) {
        break;
      }
      parameu = this.h[i1].a(paramInt, i2);
    } while ((parameu == null) || (parameu == paramView));
    return parameu;
    return null;
  }
  
  View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = this.a.c();
    int i3 = this.a.d();
    int i4 = t();
    int i1 = 0;
    Object localObject1 = null;
    if (i1 < i4)
    {
      View localView = h(i1);
      int i5 = this.a.a(localView);
      Object localObject2 = localObject1;
      if (this.a.b(localView) > i2)
      {
        if (i5 < i3) {
          break label93;
        }
        localObject2 = localObject1;
      }
      for (;;)
      {
        i1 += 1;
        localObject1 = localObject2;
        break;
        label93:
        if ((i5 >= i2) || (!paramBoolean1)) {
          return localView;
        }
        localObject2 = localObject1;
        if (paramBoolean2)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
      }
    }
    return (View)localObject1;
  }
  
  public void a(int paramInt)
  {
    a(null);
    if (paramInt != this.g)
    {
      g();
      this.g = paramInt;
      this.m = new BitSet(this.g);
      this.h = new gc[this.g];
      paramInt = 0;
      while (paramInt < this.g)
      {
        this.h[paramInt] = new gc(this, paramInt, null);
        paramInt += 1;
      }
      n();
    }
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = y();
    int i2 = A() + i1;
    int i3 = z() + B();
    if (this.i == 1)
    {
      i1 = a(paramInt2, i3 + paramRect.height(), E());
      paramInt2 = a(paramInt1, i2 + this.j * this.g, D());
      paramInt1 = i1;
    }
    for (;;)
    {
      d(paramInt2, paramInt1);
      return;
      i1 = a(paramInt1, i2 + paramRect.width(), D());
      paramInt1 = a(paramInt2, i3 + this.j * this.g, E());
      paramInt2 = i1;
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof StaggeredGridLayoutManager.SavedState))
    {
      this.u = ((StaggeredGridLayoutManager.SavedState)paramParcelable);
      n();
    }
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.f.a();
    n();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, 1);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    c(paramInt1, paramInt2, 8);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    c(paramInt1, paramInt2, 4);
  }
  
  public void a(RecyclerView paramRecyclerView, eu parameu)
  {
    a(this.A);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].e();
      i1 += 1;
    }
  }
  
  public void a(eu parameu, fa paramfa, View paramView, l paraml)
  {
    parameu = paramView.getLayoutParams();
    if (!(parameu instanceof fz))
    {
      super.a(paramView, paraml);
      return;
    }
    parameu = (fz)parameu;
    if (this.i == 0)
    {
      i2 = parameu.b();
      if (parameu.f) {}
      for (i1 = this.g;; i1 = 1)
      {
        paraml.c(x.a(i2, i1, -1, -1, parameu.f, false));
        return;
      }
    }
    int i2 = parameu.b();
    if (parameu.f) {}
    for (int i1 = this.g;; i1 = 1)
    {
      paraml.c(x.a(-1, -1, i2, i1, parameu.f, false));
      return;
    }
  }
  
  void a(fa paramfa, fy paramfy)
  {
    if (b(paramfa, paramfy)) {}
    while (c(paramfa, paramfy)) {
      return;
    }
    paramfy.b();
    paramfy.a = 0;
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (t() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      localView1 = a(false, true);
      localView2 = b(false, true);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i1 = d(localView1);
    int i2 = d(localView2);
    if (i1 < i2)
    {
      paramAccessibilityEvent.b(i1);
      paramAccessibilityEvent.c(i2);
      return;
    }
    paramAccessibilityEvent.b(i2);
    paramAccessibilityEvent.c(i1);
  }
  
  public void a(String paramString)
  {
    if (this.u == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if ((this.u != null) && (this.u.h != paramBoolean)) {
      this.u.h = paramBoolean;
    }
    this.l = paramBoolean;
    n();
  }
  
  public boolean a(ep paramep)
  {
    return paramep instanceof fz;
  }
  
  public int b(int paramInt, eu parameu, fa paramfa)
  {
    return c(paramInt, parameu, paramfa);
  }
  
  public int b(eu parameu, fa paramfa)
  {
    if (this.i == 1) {
      return this.g;
    }
    return super.b(parameu, paramfa);
  }
  
  public int b(fa paramfa)
  {
    return a(paramfa);
  }
  
  View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = this.a.c();
    int i3 = this.a.d();
    int i1 = t() - 1;
    Object localObject1 = null;
    if (i1 >= 0)
    {
      View localView = h(i1);
      int i4 = this.a.a(localView);
      int i5 = this.a.b(localView);
      Object localObject2 = localObject1;
      if (i5 > i2)
      {
        if (i4 < i3) {
          break label94;
        }
        localObject2 = localObject1;
      }
      for (;;)
      {
        i1 -= 1;
        localObject1 = localObject2;
        break;
        label94:
        if ((i5 <= i3) || (!paramBoolean1)) {
          return localView;
        }
        localObject2 = localObject1;
        if (paramBoolean2)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
      }
    }
    return (View)localObject1;
  }
  
  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    a(null);
    if (paramInt == this.i) {
      return;
    }
    this.i = paramInt;
    du localdu = this.a;
    this.a = this.b;
    this.b = localdu;
    n();
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, 2);
  }
  
  public boolean b()
  {
    return this.u == null;
  }
  
  boolean b(fa paramfa, fy paramfy)
  {
    boolean bool = false;
    if ((paramfa.a()) || (this.d == -1)) {
      return false;
    }
    if ((this.d < 0) || (this.d >= paramfa.e()))
    {
      this.d = -1;
      this.e = Integer.MIN_VALUE;
      return false;
    }
    if ((this.u == null) || (this.u.a == -1) || (this.u.c < 1))
    {
      paramfa = c(this.d);
      if (paramfa != null)
      {
        if (this.c) {}
        for (int i1 = L();; i1 = M())
        {
          paramfy.a = i1;
          if (this.e == Integer.MIN_VALUE) {
            break label188;
          }
          if (!paramfy.c) {
            break;
          }
          paramfy.b = (this.a.d() - this.e - this.a.b(paramfa));
          return true;
        }
        paramfy.b = (this.a.c() + this.e - this.a.a(paramfa));
        return true;
        label188:
        if (this.a.c(paramfa) > this.a.f())
        {
          if (paramfy.c) {}
          for (i1 = this.a.d();; i1 = this.a.c())
          {
            paramfy.b = i1;
            return true;
          }
        }
        i1 = this.a.a(paramfa) - this.a.c();
        if (i1 < 0)
        {
          paramfy.b = (-i1);
          return true;
        }
        i1 = this.a.d() - this.a.b(paramfa);
        if (i1 < 0)
        {
          paramfy.b = i1;
          return true;
        }
        paramfy.b = Integer.MIN_VALUE;
        return true;
      }
      paramfy.a = this.d;
      if (this.e == Integer.MIN_VALUE)
      {
        if (t(paramfy.a) == 1) {
          bool = true;
        }
        paramfy.c = bool;
        paramfy.b();
      }
      for (;;)
      {
        paramfy.d = true;
        return true;
        paramfy.a(this.e);
      }
    }
    paramfy.b = Integer.MIN_VALUE;
    paramfy.a = this.d;
    return true;
  }
  
  int c(int paramInt, eu parameu, fa paramfa)
  {
    int i2;
    int i1;
    if (paramInt > 0)
    {
      i2 = L();
      i1 = 1;
      this.k.a = true;
      a(i2, paramfa);
      l(i1);
      this.k.c = (this.k.d + i2);
      i2 = Math.abs(paramInt);
      this.k.b = i2;
      i1 = a(parameu, this.k, paramfa);
      if (i2 >= i1) {
        break label116;
      }
    }
    for (;;)
    {
      this.a.a(-paramInt);
      this.o = this.c;
      return paramInt;
      i1 = -1;
      i2 = M();
      break;
      label116:
      if (paramInt < 0) {
        paramInt = -i1;
      } else {
        paramInt = i1;
      }
    }
  }
  
  public int c(fa paramfa)
  {
    return a(paramfa);
  }
  
  public Parcelable c()
  {
    if (this.u != null) {
      return new StaggeredGridLayoutManager.SavedState(this.u);
    }
    StaggeredGridLayoutManager.SavedState localSavedState = new StaggeredGridLayoutManager.SavedState();
    localSavedState.h = this.l;
    localSavedState.i = this.o;
    localSavedState.j = this.t;
    int i1;
    label126:
    int i2;
    label163:
    int i3;
    if ((this.f != null) && (this.f.a != null))
    {
      localSavedState.f = this.f.a;
      localSavedState.e = localSavedState.f.length;
      localSavedState.g = this.f.b;
      if (t() <= 0) {
        break label273;
      }
      if (!this.o) {
        break label232;
      }
      i1 = L();
      localSavedState.a = i1;
      localSavedState.b = i();
      localSavedState.c = this.g;
      localSavedState.d = new int[this.g];
      i2 = 0;
      if (i2 >= this.g) {
        break label291;
      }
      if (!this.o) {
        break label240;
      }
      i3 = this.h[i2].b(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - this.a.d();
      }
    }
    for (;;)
    {
      localSavedState.d[i2] = i1;
      i2 += 1;
      break label163;
      localSavedState.e = 0;
      break;
      label232:
      i1 = M();
      break label126;
      label240:
      i3 = this.h[i2].a(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - this.a.c();
      }
    }
    label273:
    localSavedState.a = -1;
    localSavedState.b = -1;
    localSavedState.c = 0;
    label291:
    return localSavedState;
  }
  
  public void c(eu parameu, fa paramfa)
  {
    a(parameu, paramfa, true);
  }
  
  public int d(fa paramfa)
  {
    return h(paramfa);
  }
  
  public void d(int paramInt)
  {
    if ((this.u != null) && (this.u.a != paramInt)) {
      this.u.b();
    }
    this.d = paramInt;
    this.e = Integer.MIN_VALUE;
    n();
  }
  
  public boolean d()
  {
    return this.i == 0;
  }
  
  public int e(fa paramfa)
  {
    return h(paramfa);
  }
  
  void e(int paramInt)
  {
    this.j = (paramInt / this.g);
    this.v = View.MeasureSpec.makeMeasureSpec(paramInt, this.b.h());
  }
  
  public boolean e()
  {
    return this.i == 1;
  }
  
  public int f(fa paramfa)
  {
    return i(paramfa);
  }
  
  View f()
  {
    int i1 = t() - 1;
    BitSet localBitSet = new BitSet(this.g);
    localBitSet.set(0, this.g, true);
    int i2;
    int i3;
    if ((this.i == 1) && (h()))
    {
      i2 = 1;
      if (!this.c) {
        break label128;
      }
      i3 = -1;
      label57:
      if (i1 >= i3) {
        break label137;
      }
    }
    int i5;
    View localView;
    fz localfz;
    label128:
    label137:
    for (int i4 = 1;; i4 = -1)
    {
      i5 = i1;
      if (i5 == i3) {
        break label343;
      }
      localView = h(i5);
      localfz = (fz)localView.getLayoutParams();
      if (!localBitSet.get(localfz.e.d)) {
        break label156;
      }
      if (!a(localfz.e)) {
        break label143;
      }
      return localView;
      i2 = -1;
      break;
      i3 = i1 + 1;
      i1 = 0;
      break label57;
    }
    label143:
    localBitSet.clear(localfz.e.d);
    label156:
    if (localfz.f) {}
    label275:
    label337:
    label341:
    label343:
    label345:
    label348:
    for (;;)
    {
      i5 += i4;
      break;
      if (i5 + i4 != i3)
      {
        Object localObject = h(i5 + i4);
        int i6;
        if (this.c)
        {
          i1 = this.a.b(localView);
          i6 = this.a.b((View)localObject);
          if (i1 < i6) {
            return localView;
          }
          if (i1 != i6) {
            break label345;
          }
          i1 = 1;
        }
        for (;;)
        {
          if (i1 == 0) {
            break label348;
          }
          localObject = (fz)((View)localObject).getLayoutParams();
          if (localfz.e.d - ((fz)localObject).e.d < 0)
          {
            i1 = 1;
            if (i2 >= 0) {
              break label337;
            }
          }
          for (i6 = 1;; i6 = 0)
          {
            if (i1 == i6) {
              break label341;
            }
            return localView;
            i1 = this.a.a(localView);
            i6 = this.a.a((View)localObject);
            if (i1 > i6) {
              return localView;
            }
            if (i1 != i6) {
              break label345;
            }
            i1 = 1;
            break;
            i1 = 0;
            break label275;
          }
          break;
          return null;
          i1 = 0;
        }
      }
    }
  }
  
  public int g(fa paramfa)
  {
    return i(paramfa);
  }
  
  public void g()
  {
    this.f.a();
    n();
  }
  
  boolean h()
  {
    return r() == 1;
  }
  
  int i()
  {
    if (this.c) {}
    for (View localView = b(true, true); localView == null; localView = a(true, true)) {
      return -1;
    }
    return d(localView);
  }
  
  public void i(int paramInt)
  {
    super.i(paramInt);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  public void j(int paramInt)
  {
    super.j(paramInt);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  boolean j()
  {
    boolean bool2 = true;
    int i2 = this.h[0].b(Integer.MIN_VALUE);
    int i1 = 1;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < this.g)
      {
        if (this.h[i1].b(Integer.MIN_VALUE) != i2) {
          bool1 = false;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  public void k(int paramInt)
  {
    if (paramInt == 0) {
      I();
    }
  }
  
  boolean l()
  {
    boolean bool2 = true;
    int i2 = this.h[0].a(Integer.MIN_VALUE);
    int i1 = 1;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < this.g)
      {
        if (this.h[i1].a(Integer.MIN_VALUE) != i2) {
          bool1 = false;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */