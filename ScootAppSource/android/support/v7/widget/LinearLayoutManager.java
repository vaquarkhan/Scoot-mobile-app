package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.ar;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends en
{
  private db a;
  private boolean b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = true;
  private boolean f;
  int i;
  du j;
  boolean k = false;
  int l = -1;
  int m = Integer.MIN_VALUE;
  LinearLayoutManager.SavedState n = null;
  final cz o = new cz(this);
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    b(paramInt);
    b(paramBoolean);
    c(true);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    b(paramContext.a);
    b(paramContext.c);
    a(paramContext.d);
    c(true);
  }
  
  private void I()
  {
    boolean bool = true;
    if ((this.i == 1) || (!g()))
    {
      this.k = this.c;
      return;
    }
    if (!this.c) {}
    for (;;)
    {
      this.k = bool;
      return;
      bool = false;
    }
  }
  
  private View J()
  {
    if (this.k) {}
    for (int i1 = t() - 1;; i1 = 0) {
      return h(i1);
    }
  }
  
  private View K()
  {
    if (this.k) {}
    for (int i1 = 0;; i1 = t() - 1) {
      return h(i1);
    }
  }
  
  private int a(int paramInt, eu parameu, fa paramfa, boolean paramBoolean)
  {
    int i1 = this.j.d() - paramInt;
    if (i1 > 0)
    {
      int i2 = -c(-i1, parameu, paramfa);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = this.j.d() - (paramInt + i2);
        i1 = i2;
        if (paramInt > 0)
        {
          this.j.a(paramInt);
          i1 = i2 + paramInt;
        }
      }
      return i1;
    }
    return 0;
  }
  
  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k) {
      return a(t() - 1, -1, paramBoolean1, paramBoolean2);
    }
    return a(0, t(), paramBoolean1, paramBoolean2);
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, fa paramfa)
  {
    int i1 = -1;
    int i2 = 1;
    this.a.l = j();
    this.a.h = a(paramfa);
    this.a.f = paramInt1;
    if (paramInt1 == 1)
    {
      paramfa = this.a;
      paramfa.h += this.j.g();
      paramfa = K();
      localdb = this.a;
      if (this.k) {}
      for (paramInt1 = i1;; paramInt1 = 1)
      {
        localdb.e = paramInt1;
        this.a.d = (d(paramfa) + this.a.e);
        this.a.b = this.j.b(paramfa);
        paramInt1 = this.j.b(paramfa) - this.j.d();
        this.a.c = paramInt2;
        if (paramBoolean)
        {
          paramfa = this.a;
          paramfa.c -= paramInt1;
        }
        this.a.g = paramInt1;
        return;
      }
    }
    paramfa = J();
    db localdb = this.a;
    localdb.h += this.j.c();
    localdb = this.a;
    if (this.k) {}
    for (paramInt1 = i2;; paramInt1 = -1)
    {
      localdb.e = paramInt1;
      this.a.d = (d(paramfa) + this.a.e);
      this.a.b = this.j.a(paramfa);
      paramInt1 = -this.j.a(paramfa) + this.j.c();
      break;
    }
  }
  
  private void a(cz paramcz)
  {
    e(paramcz.a, paramcz.b);
  }
  
  private void a(eu parameu, int paramInt)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i2 = t();
      int i1;
      View localView;
      if (this.k)
      {
        i1 = i2 - 1;
        while (i1 >= 0)
        {
          localView = h(i1);
          if (this.j.b(localView) > paramInt)
          {
            a(parameu, i2 - 1, i1);
            return;
          }
          i1 -= 1;
        }
      }
      else
      {
        i1 = 0;
        while (i1 < i2)
        {
          localView = h(i1);
          if (this.j.b(localView) > paramInt)
          {
            a(parameu, 0, i1);
            return;
          }
          i1 += 1;
        }
      }
    }
  }
  
  private void a(eu parameu, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      int i1 = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2 -= 1;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, parameu);
          paramInt2 -= 1;
        }
      }
      else
      {
        while (i1 > paramInt2)
        {
          a(i1, parameu);
          i1 -= 1;
        }
      }
    }
  }
  
  private void a(eu parameu, db paramdb)
  {
    if ((!paramdb.a) || (paramdb.l)) {
      return;
    }
    if (paramdb.f == -1)
    {
      b(parameu, paramdb.g);
      return;
    }
    a(parameu, paramdb.g);
  }
  
  private void a(eu parameu, fa paramfa, cz paramcz)
  {
    if (a(paramfa, paramcz)) {}
    while (b(parameu, paramfa, paramcz)) {
      return;
    }
    paramcz.b();
    if (this.d) {}
    for (int i1 = paramfa.e() - 1;; i1 = 0)
    {
      paramcz.a = i1;
      return;
    }
  }
  
  private boolean a(fa paramfa, cz paramcz)
  {
    boolean bool = false;
    if ((paramfa.a()) || (this.l == -1)) {
      return false;
    }
    if ((this.l < 0) || (this.l >= paramfa.e()))
    {
      this.l = -1;
      this.m = Integer.MIN_VALUE;
      return false;
    }
    paramcz.a = this.l;
    if ((this.n != null) && (this.n.a()))
    {
      paramcz.c = this.n.c;
      if (paramcz.c)
      {
        paramcz.b = (this.j.d() - this.n.b);
        return true;
      }
      paramcz.b = (this.j.c() + this.n.b);
      return true;
    }
    if (this.m == Integer.MIN_VALUE)
    {
      paramfa = c(this.l);
      int i1;
      if (paramfa != null)
      {
        if (this.j.c(paramfa) > this.j.f())
        {
          paramcz.b();
          return true;
        }
        if (this.j.a(paramfa) - this.j.c() < 0)
        {
          paramcz.b = this.j.c();
          paramcz.c = false;
          return true;
        }
        if (this.j.d() - this.j.b(paramfa) < 0)
        {
          paramcz.b = this.j.d();
          paramcz.c = true;
          return true;
        }
        if (paramcz.c) {}
        for (i1 = this.j.b(paramfa) + this.j.b();; i1 = this.j.a(paramfa))
        {
          paramcz.b = i1;
          return true;
        }
      }
      if (t() > 0)
      {
        i1 = d(h(0));
        if (this.l >= i1) {
          break label351;
        }
      }
      label351:
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 == this.k) {
          bool = true;
        }
        paramcz.c = bool;
        paramcz.b();
        return true;
      }
    }
    paramcz.c = this.k;
    if (this.k)
    {
      paramcz.b = (this.j.d() - this.m);
      return true;
    }
    paramcz.b = (this.j.c() + this.m);
    return true;
  }
  
  private int b(int paramInt, eu parameu, fa paramfa, boolean paramBoolean)
  {
    int i1 = paramInt - this.j.c();
    if (i1 > 0)
    {
      int i2 = -c(i1, parameu, paramfa);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = paramInt + i2 - this.j.c();
        i1 = i2;
        if (paramInt > 0)
        {
          this.j.a(-paramInt);
          i1 = i2 - paramInt;
        }
      }
      return i1;
    }
    return 0;
  }
  
  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k) {
      return a(0, t(), paramBoolean1, paramBoolean2);
    }
    return a(t() - 1, -1, paramBoolean1, paramBoolean2);
  }
  
  private void b(cz paramcz)
  {
    f(paramcz.a, paramcz.b);
  }
  
  private void b(eu parameu, int paramInt)
  {
    int i1 = t();
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i2 = this.j.e() - paramInt;
      View localView;
      if (this.k)
      {
        paramInt = 0;
        while (paramInt < i1)
        {
          localView = h(paramInt);
          if (this.j.a(localView) < i2)
          {
            a(parameu, 0, paramInt);
            return;
          }
          paramInt += 1;
        }
      }
      else
      {
        paramInt = i1 - 1;
        while (paramInt >= 0)
        {
          localView = h(paramInt);
          if (this.j.a(localView) < i2)
          {
            a(parameu, i1 - 1, paramInt);
            return;
          }
          paramInt -= 1;
        }
      }
    }
  }
  
  private void b(eu parameu, fa paramfa, int paramInt1, int paramInt2)
  {
    if ((!paramfa.b()) || (t() == 0) || (paramfa.a()) || (!b())) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    List localList = parameu.b();
    int i5 = localList.size();
    int i6 = d(h(0));
    int i3 = 0;
    if (i3 < i5)
    {
      fd localfd = (fd)localList.get(i3);
      int i4;
      if (localfd.q())
      {
        i4 = i2;
        i2 = i1;
        i1 = i4;
      }
      for (;;)
      {
        i4 = i3 + 1;
        i3 = i2;
        i2 = i1;
        i1 = i3;
        i3 = i4;
        break;
        int i7;
        if (localfd.d() < i6)
        {
          i7 = 1;
          label143:
          if (i7 == this.k) {
            break label195;
          }
        }
        label195:
        for (i4 = -1;; i4 = 1)
        {
          if (i4 != -1) {
            break label201;
          }
          i4 = this.j.c(localfd.a) + i1;
          i1 = i2;
          i2 = i4;
          break;
          i7 = 0;
          break label143;
        }
        label201:
        i4 = this.j.c(localfd.a) + i2;
        i2 = i1;
        i1 = i4;
      }
    }
    this.a.k = localList;
    if (i1 > 0)
    {
      f(d(J()), paramInt1);
      this.a.h = i1;
      this.a.c = 0;
      this.a.a();
      a(parameu, this.a, paramfa, false);
    }
    if (i2 > 0)
    {
      e(d(K()), paramInt2);
      this.a.h = i2;
      this.a.c = 0;
      this.a.a();
      a(parameu, this.a, paramfa, false);
    }
    this.a.k = null;
  }
  
  private boolean b(eu parameu, fa paramfa, cz paramcz)
  {
    int i1 = 0;
    if (t() == 0) {}
    do
    {
      return false;
      View localView = C();
      if ((localView != null) && (cz.a(paramcz, localView, paramfa)))
      {
        paramcz.a(localView);
        return true;
      }
    } while (this.b != this.d);
    if (paramcz.c)
    {
      parameu = f(parameu, paramfa);
      label66:
      if (parameu == null) {
        break label165;
      }
      paramcz.b(parameu);
      if ((!paramfa.a()) && (b()))
      {
        if ((this.j.a(parameu) >= this.j.d()) || (this.j.b(parameu) < this.j.c())) {
          i1 = 1;
        }
        if (i1 != 0) {
          if (!paramcz.c) {
            break label167;
          }
        }
      }
    }
    label165:
    label167:
    for (i1 = this.j.d();; i1 = this.j.c())
    {
      paramcz.b = i1;
      return true;
      parameu = g(parameu, paramfa);
      break label66;
      break;
    }
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    this.a.c = (this.j.d() - paramInt2);
    db localdb = this.a;
    if (this.k) {}
    for (int i1 = -1;; i1 = 1)
    {
      localdb.e = i1;
      this.a.d = paramInt1;
      this.a.f = 1;
      this.a.b = paramInt2;
      this.a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private View f(eu parameu, fa paramfa)
  {
    if (this.k) {
      return h(parameu, paramfa);
    }
    return i(parameu, paramfa);
  }
  
  private void f(int paramInt1, int paramInt2)
  {
    this.a.c = (paramInt2 - this.j.c());
    this.a.d = paramInt1;
    db localdb = this.a;
    if (this.k) {}
    for (paramInt1 = 1;; paramInt1 = -1)
    {
      localdb.e = paramInt1;
      this.a.f = -1;
      this.a.b = paramInt2;
      this.a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private View g(eu parameu, fa paramfa)
  {
    if (this.k) {
      return i(parameu, paramfa);
    }
    return h(parameu, paramfa);
  }
  
  private int h(fa paramfa)
  {
    boolean bool2 = false;
    if (t() == 0) {
      return 0;
    }
    h();
    du localdu = this.j;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return fl.a(paramfa, localdu, localView, b(bool1, true), this, this.e, this.k);
    }
  }
  
  private View h(eu parameu, fa paramfa)
  {
    return a(parameu, paramfa, 0, t(), paramfa.e());
  }
  
  private int i(fa paramfa)
  {
    boolean bool2 = false;
    if (t() == 0) {
      return 0;
    }
    h();
    du localdu = this.j;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return fl.a(paramfa, localdu, localView, b(bool1, true), this, this.e);
    }
  }
  
  private View i(eu parameu, fa paramfa)
  {
    return a(parameu, paramfa, t() - 1, -1, paramfa.e());
  }
  
  private int j(fa paramfa)
  {
    boolean bool2 = false;
    if (t() == 0) {
      return 0;
    }
    h();
    du localdu = this.j;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return fl.b(paramfa, localdu, localView, b(bool1, true), this, this.e);
    }
  }
  
  public int a(int paramInt, eu parameu, fa paramfa)
  {
    if (this.i == 1) {
      return 0;
    }
    return c(paramInt, parameu, paramfa);
  }
  
  int a(eu parameu, db paramdb, fa paramfa, boolean paramBoolean)
  {
    int i3 = paramdb.c;
    if (paramdb.g != Integer.MIN_VALUE)
    {
      if (paramdb.c < 0) {
        paramdb.g += paramdb.c;
      }
      a(parameu, paramdb);
    }
    int i1 = paramdb.c + paramdb.h;
    da localda = new da();
    if (((paramdb.l) || (i1 > 0)) && (paramdb.a(paramfa)))
    {
      localda.a();
      a(parameu, paramfa, paramdb, localda);
      if (!localda.b) {
        break label111;
      }
    }
    for (;;)
    {
      return i3 - paramdb.c;
      label111:
      paramdb.b += localda.a * paramdb.f;
      int i2;
      if ((localda.c) && (this.a.k == null))
      {
        i2 = i1;
        if (paramfa.a()) {}
      }
      else
      {
        paramdb.c -= localda.a;
        i2 = i1 - localda.a;
      }
      if (paramdb.g != Integer.MIN_VALUE)
      {
        paramdb.g += localda.a;
        if (paramdb.c < 0) {
          paramdb.g += paramdb.c;
        }
        a(parameu, paramdb);
      }
      i1 = i2;
      if (!paramBoolean) {
        break;
      }
      i1 = i2;
      if (!localda.d) {
        break;
      }
    }
  }
  
  protected int a(fa paramfa)
  {
    if (paramfa.d()) {
      return this.j.f();
    }
    return 0;
  }
  
  public ep a()
  {
    return new ep(-2, -2);
  }
  
  View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    h();
    int i2 = this.j.c();
    int i3 = this.j.d();
    if (paramInt2 > paramInt1) {}
    Object localObject;
    View localView;
    for (int i1 = 1;; i1 = -1)
    {
      localObject = null;
      if (paramInt1 == paramInt2) {
        break label130;
      }
      localView = h(paramInt1);
      int i4 = this.j.a(localView);
      int i5 = this.j.b(localView);
      if ((i4 >= i3) || (i5 <= i2)) {
        break label133;
      }
      if ((paramBoolean1) && ((i4 < i2) || (i5 > i3))) {
        break;
      }
      return localView;
    }
    if ((paramBoolean2) && (localObject == null)) {
      localObject = localView;
    }
    label130:
    label133:
    for (;;)
    {
      paramInt1 += i1;
      break;
      return (View)localObject;
    }
  }
  
  View a(eu parameu, fa paramfa, int paramInt1, int paramInt2, int paramInt3)
  {
    paramfa = null;
    h();
    int i2 = this.j.c();
    int i3 = this.j.d();
    int i1;
    label35:
    Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      parameu = null;
      if (paramInt1 == paramInt2) {
        break label157;
      }
      localObject1 = h(paramInt1);
      int i4 = d((View)localObject1);
      if ((i4 < 0) || (i4 >= paramInt3)) {
        break label172;
      }
      if (!((ep)((View)localObject1).getLayoutParams()).c()) {
        break label113;
      }
      if (parameu != null) {
        break label172;
      }
      parameu = paramfa;
      paramfa = (fa)localObject1;
    }
    for (;;)
    {
      paramInt1 += i1;
      localObject1 = paramfa;
      paramfa = parameu;
      parameu = (eu)localObject1;
      break label35;
      i1 = -1;
      break;
      label113:
      Object localObject2;
      if (this.j.a((View)localObject1) < i3)
      {
        localObject2 = localObject1;
        if (this.j.b((View)localObject1) >= i2) {}
      }
      else
      {
        if (paramfa != null) {
          break label172;
        }
        paramfa = parameu;
        parameu = (eu)localObject1;
        continue;
        label157:
        if (paramfa == null) {
          break label167;
        }
      }
      for (;;)
      {
        localObject2 = paramfa;
        return (View)localObject2;
        label167:
        paramfa = parameu;
      }
      label172:
      localObject1 = parameu;
      parameu = paramfa;
      paramfa = (fa)localObject1;
    }
  }
  
  public View a(View paramView, int paramInt, eu parameu, fa paramfa)
  {
    I();
    if (t() == 0) {}
    label42:
    label134:
    label136:
    label142:
    for (;;)
    {
      return null;
      paramInt = e(paramInt);
      if (paramInt != Integer.MIN_VALUE)
      {
        h();
        if (paramInt == -1)
        {
          paramView = g(parameu, paramfa);
          if (paramView == null) {
            break label134;
          }
          h();
          a(paramInt, (int)(0.33333334F * this.j.f()), false, paramfa);
          this.a.g = Integer.MIN_VALUE;
          this.a.a = false;
          a(parameu, this.a, paramfa, true);
          if (paramInt != -1) {
            break label136;
          }
        }
        for (parameu = J();; parameu = K())
        {
          if ((parameu == paramView) || (!parameu.isFocusable())) {
            break label142;
          }
          return parameu;
          paramView = f(parameu, paramfa);
          break label42;
          break;
        }
      }
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof LinearLayoutManager.SavedState))
    {
      this.n = ((LinearLayoutManager.SavedState)paramParcelable);
      n();
    }
  }
  
  public void a(RecyclerView paramRecyclerView, eu parameu)
  {
    super.a(paramRecyclerView, parameu);
    if (this.f)
    {
      c(parameu);
      parameu.a();
    }
  }
  
  void a(eu parameu, fa paramfa, cz paramcz, int paramInt) {}
  
  void a(eu parameu, fa paramfa, db paramdb, da paramda)
  {
    parameu = paramdb.a(parameu);
    if (parameu == null)
    {
      paramda.b = true;
      return;
    }
    paramfa = (ep)parameu.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label61:
    int i1;
    int i2;
    label120:
    int i3;
    int i4;
    if (paramdb.k == null)
    {
      bool2 = this.k;
      if (paramdb.f == -1)
      {
        bool1 = true;
        if (bool2 != bool1) {
          break label215;
        }
        b(parameu);
        a(parameu, 0, 0);
        paramda.a = this.j.c(parameu);
        if (this.i != 1) {
          break label322;
        }
        if (!g()) {
          break label271;
        }
        i1 = w() - A();
        i2 = i1 - this.j.d(parameu);
        if (paramdb.f != -1) {
          break label293;
        }
        i3 = paramdb.b;
        i4 = paramdb.b - paramda.a;
      }
    }
    for (;;)
    {
      a(parameu, i2 + paramfa.leftMargin, i4 + paramfa.topMargin, i1 - paramfa.rightMargin, i3 - paramfa.bottomMargin);
      if ((paramfa.c()) || (paramfa.d())) {
        paramda.c = true;
      }
      paramda.d = parameu.isFocusable();
      return;
      bool1 = false;
      break;
      label215:
      b(parameu, 0);
      break label61;
      bool2 = this.k;
      if (paramdb.f == -1) {}
      for (bool1 = true;; bool1 = false)
      {
        if (bool2 != bool1) {
          break label262;
        }
        a(parameu);
        break;
      }
      label262:
      a(parameu, 0);
      break label61;
      label271:
      i2 = y();
      i1 = this.j.d(parameu) + i2;
      break label120;
      label293:
      i4 = paramdb.b;
      i3 = paramdb.b;
      int i5 = paramda.a;
      i3 += i5;
      continue;
      label322:
      i4 = z();
      i3 = this.j.d(parameu) + i4;
      if (paramdb.f == -1)
      {
        i1 = paramdb.b;
        i2 = paramdb.b - paramda.a;
      }
      else
      {
        i2 = paramdb.b;
        i1 = paramdb.b;
        i5 = paramda.a;
        i1 += i5;
      }
    }
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    if (t() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      paramAccessibilityEvent.b(l());
      paramAccessibilityEvent.c(m());
    }
  }
  
  public void a(String paramString)
  {
    if (this.n == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if (this.d == paramBoolean) {
      return;
    }
    this.d = paramBoolean;
    n();
  }
  
  public int b(int paramInt, eu parameu, fa paramfa)
  {
    if (this.i == 0) {
      return 0;
    }
    return c(paramInt, parameu, paramfa);
  }
  
  public int b(fa paramfa)
  {
    return h(paramfa);
  }
  
  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    a(null);
    if (paramInt == this.i) {
      return;
    }
    this.i = paramInt;
    this.j = null;
    n();
  }
  
  public void b(boolean paramBoolean)
  {
    a(null);
    if (paramBoolean == this.c) {
      return;
    }
    this.c = paramBoolean;
    n();
  }
  
  public boolean b()
  {
    return (this.n == null) && (this.b == this.d);
  }
  
  int c(int paramInt, eu parameu, fa paramfa)
  {
    if ((t() == 0) || (paramInt == 0)) {
      return 0;
    }
    this.a.a = true;
    h();
    if (paramInt > 0) {}
    int i2;
    int i3;
    for (int i1 = 1;; i1 = -1)
    {
      i2 = Math.abs(paramInt);
      a(i1, i2, true, paramfa);
      i3 = this.a.g + a(parameu, this.a, paramfa, false);
      if (i3 >= 0) {
        break;
      }
      return 0;
    }
    if (i2 > i3) {
      paramInt = i1 * i3;
    }
    this.j.a(-paramInt);
    this.a.j = paramInt;
    return paramInt;
  }
  
  public int c(fa paramfa)
  {
    return h(paramfa);
  }
  
  public Parcelable c()
  {
    if (this.n != null) {
      return new LinearLayoutManager.SavedState(this.n);
    }
    LinearLayoutManager.SavedState localSavedState = new LinearLayoutManager.SavedState();
    if (t() > 0)
    {
      h();
      boolean bool = this.b ^ this.k;
      localSavedState.c = bool;
      if (bool)
      {
        localView = K();
        localSavedState.b = (this.j.d() - this.j.b(localView));
        localSavedState.a = d(localView);
        return localSavedState;
      }
      View localView = J();
      localSavedState.a = d(localView);
      localSavedState.b = (this.j.a(localView) - this.j.c());
      return localSavedState;
    }
    localSavedState.b();
    return localSavedState;
  }
  
  public View c(int paramInt)
  {
    int i1 = t();
    Object localObject;
    if (i1 == 0) {
      localObject = null;
    }
    View localView;
    do
    {
      return (View)localObject;
      int i2 = paramInt - d(h(0));
      if ((i2 < 0) || (i2 >= i1)) {
        break;
      }
      localView = h(i2);
      localObject = localView;
    } while (d(localView) == paramInt);
    return super.c(paramInt);
  }
  
  public void c(eu parameu, fa paramfa)
  {
    if (((this.n != null) || (this.l != -1)) && (paramfa.e() == 0))
    {
      c(parameu);
      return;
    }
    if ((this.n != null) && (this.n.a())) {
      this.l = this.n.a;
    }
    h();
    this.a.a = false;
    I();
    this.o.a();
    this.o.c = (this.k ^ this.d);
    a(parameu, paramfa, this.o);
    int i1 = a(paramfa);
    int i2;
    int i4;
    int i5;
    int i3;
    Object localObject;
    if (this.a.j >= 0)
    {
      i2 = 0;
      i4 = i2 + this.j.c();
      i5 = i1 + this.j.g();
      i2 = i5;
      i3 = i4;
      if (paramfa.a())
      {
        i2 = i5;
        i3 = i4;
        if (this.l != -1)
        {
          i2 = i5;
          i3 = i4;
          if (this.m != Integer.MIN_VALUE)
          {
            localObject = c(this.l);
            i2 = i5;
            i3 = i4;
            if (localObject != null)
            {
              if (!this.k) {
                break label648;
              }
              i1 = this.j.d() - this.j.b((View)localObject) - this.m;
              label248:
              if (i1 <= 0) {
                break label680;
              }
              i3 = i4 + i1;
              i2 = i5;
            }
          }
        }
      }
      label262:
      if (!this.o.c) {
        break label698;
      }
      if (!this.k) {
        break label693;
      }
      i1 = 1;
      label281:
      a(parameu, paramfa, this.o, i1);
      a(parameu);
      this.a.l = j();
      this.a.i = paramfa.a();
      if (!this.o.c) {
        break label715;
      }
      b(this.o);
      this.a.h = i3;
      a(parameu, this.a, paramfa, false);
      i4 = this.a.b;
      i5 = this.a.d;
      i1 = i2;
      if (this.a.c > 0) {
        i1 = i2 + this.a.c;
      }
      a(this.o);
      this.a.h = i1;
      localObject = this.a;
      ((db)localObject).d += this.a.e;
      a(parameu, this.a, paramfa, false);
      i3 = this.a.b;
      if (this.a.c <= 0) {
        break label960;
      }
      i1 = this.a.c;
      f(i5, i4);
      this.a.h = i1;
      a(parameu, this.a, paramfa, false);
    }
    label521:
    label648:
    label680:
    label693:
    label698:
    label715:
    label915:
    label960:
    for (i1 = this.a.b;; i1 = i4)
    {
      i2 = i1;
      i1 = i3;
      i3 = i1;
      i4 = i2;
      if (t() > 0)
      {
        if (!(this.k ^ this.d)) {
          break label915;
        }
        i3 = a(i1, parameu, paramfa, true);
        i4 = i2 + i3;
        i2 = b(i4, parameu, paramfa, false);
        i4 += i2;
      }
      for (i3 = i1 + i3 + i2;; i3 = i1 + i5)
      {
        b(parameu, paramfa, i4, i3);
        if (!paramfa.a())
        {
          this.l = -1;
          this.m = Integer.MIN_VALUE;
          this.j.a();
        }
        this.b = this.d;
        this.n = null;
        return;
        i2 = i1;
        i1 = 0;
        break;
        i1 = this.j.a((View)localObject);
        i2 = this.j.c();
        i1 = this.m - (i1 - i2);
        break label248;
        i2 = i5 - i1;
        i3 = i4;
        break label262;
        i1 = -1;
        break label281;
        if (this.k)
        {
          i1 = -1;
          break label281;
        }
        i1 = 1;
        break label281;
        a(this.o);
        this.a.h = i2;
        a(parameu, this.a, paramfa, false);
        i4 = this.a.b;
        i5 = this.a.d;
        i1 = i3;
        if (this.a.c > 0) {
          i1 = i3 + this.a.c;
        }
        b(this.o);
        this.a.h = i1;
        localObject = this.a;
        ((db)localObject).d += this.a.e;
        a(parameu, this.a, paramfa, false);
        i3 = this.a.b;
        i1 = i4;
        i2 = i3;
        if (this.a.c <= 0) {
          break label521;
        }
        i1 = this.a.c;
        e(i5, i4);
        this.a.h = i1;
        a(parameu, this.a, paramfa, false);
        i1 = this.a.b;
        i2 = i3;
        break label521;
        i3 = b(i2, parameu, paramfa, true);
        i1 += i3;
        i5 = a(i1, parameu, paramfa, false);
        i4 = i2 + i3 + i5;
      }
    }
  }
  
  public int d(fa paramfa)
  {
    return i(paramfa);
  }
  
  public void d(int paramInt)
  {
    this.l = paramInt;
    this.m = Integer.MIN_VALUE;
    if (this.n != null) {
      this.n.b();
    }
    n();
  }
  
  public boolean d()
  {
    return this.i == 0;
  }
  
  int e(int paramInt)
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
  
  public int e(fa paramfa)
  {
    return i(paramfa);
  }
  
  public boolean e()
  {
    return this.i == 1;
  }
  
  public int f()
  {
    return this.i;
  }
  
  public int f(fa paramfa)
  {
    return j(paramfa);
  }
  
  public int g(fa paramfa)
  {
    return j(paramfa);
  }
  
  protected boolean g()
  {
    return r() == 1;
  }
  
  void h()
  {
    if (this.a == null) {
      this.a = i();
    }
    if (this.j == null) {
      this.j = du.a(this, this.i);
    }
  }
  
  db i()
  {
    return new db();
  }
  
  boolean j()
  {
    return (this.j.h() == 0) && (this.j.e() == 0);
  }
  
  boolean k()
  {
    return (v() != 1073741824) && (u() != 1073741824) && (H());
  }
  
  public int l()
  {
    View localView = a(0, t(), false, true);
    if (localView == null) {
      return -1;
    }
    return d(localView);
  }
  
  public int m()
  {
    View localView = a(t() - 1, -1, false, true);
    if (localView == null) {
      return -1;
    }
    return d(localView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */