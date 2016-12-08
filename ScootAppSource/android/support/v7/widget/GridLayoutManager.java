package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.l;
import android.support.v4.view.a.x;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager
  extends LinearLayoutManager
{
  boolean a = false;
  int b = -1;
  int[] c;
  View[] d;
  final SparseIntArray e = new SparseIntArray();
  final SparseIntArray f = new SparseIntArray();
  cv g = new ct();
  final Rect h = new Rect();
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    a(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    a(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(a(paramContext, paramAttributeSet, paramInt1, paramInt2).b);
  }
  
  private void I()
  {
    this.e.clear();
    this.f.clear();
  }
  
  private void J()
  {
    int j = t();
    int i = 0;
    while (i < j)
    {
      cu localcu = (cu)h(i).getLayoutParams();
      int k = localcu.e();
      this.e.put(k, localcu.b());
      this.f.put(k, localcu.a());
      i += 1;
    }
  }
  
  private void K()
  {
    if (f() == 1) {}
    for (int i = w() - A() - y();; i = x() - B() - z())
    {
      l(i);
      return;
    }
  }
  
  private void L()
  {
    if ((this.d == null) || (this.d.length != this.b)) {
      this.d = new View[this.b];
    }
  }
  
  private int a(eu parameu, fa paramfa, int paramInt)
  {
    if (!paramfa.a()) {
      return this.g.c(paramInt, this.b);
    }
    int i = parameu.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + paramInt);
      return 0;
    }
    return this.g.c(i, this.b);
  }
  
  private void a(float paramFloat, int paramInt)
  {
    l(Math.max(Math.round(this.b * paramFloat), paramInt));
  }
  
  private void a(eu parameu, fa paramfa, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    label43:
    cu localcu;
    if (paramBoolean)
    {
      i = 1;
      paramInt2 = 0;
      j = paramInt1;
      paramInt1 = paramInt2;
      if ((this.i != 1) || (!g())) {
        break label150;
      }
      paramInt2 = this.b - 1;
      k = -1;
      if (paramInt1 == j) {
        return;
      }
      View localView = this.d[paramInt1];
      localcu = (cu)localView.getLayoutParams();
      cu.a(localcu, c(parameu, paramfa, d(localView)));
      if ((k != -1) || (cu.b(localcu) <= 1)) {
        break label159;
      }
      cu.b(localcu, paramInt2 - (cu.b(localcu) - 1));
    }
    for (;;)
    {
      paramInt2 += cu.b(localcu) * k;
      paramInt1 += i;
      break label43;
      paramInt1 -= 1;
      i = -1;
      j = -1;
      break;
      label150:
      paramInt2 = 0;
      k = 1;
      break label43;
      label159:
      cu.b(localcu, paramInt2);
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramView, this.h);
    ep localep = (ep)paramView.getLayoutParams();
    int i;
    if (!paramBoolean1)
    {
      i = paramInt1;
      if (this.i != 1) {}
    }
    else
    {
      i = b(paramInt1, localep.leftMargin + this.h.left, localep.rightMargin + this.h.right);
    }
    if (!paramBoolean1)
    {
      paramInt1 = paramInt2;
      if (this.i != 0) {}
    }
    else
    {
      paramInt1 = b(paramInt2, localep.topMargin + this.h.top, localep.bottomMargin + this.h.bottom);
    }
    if (paramBoolean2) {}
    for (paramBoolean1 = a(paramView, i, paramInt1, localep);; paramBoolean1 = b(paramView, i, paramInt1, localep))
    {
      if (paramBoolean1) {
        paramView.measure(i, paramInt1);
      }
      return;
    }
  }
  
  static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int k = 0;
    int[] arrayOfInt;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length == paramInt1 + 1))
    {
      arrayOfInt = paramArrayOfInt;
      if (paramArrayOfInt[(paramArrayOfInt.length - 1)] == paramInt2) {}
    }
    else
    {
      arrayOfInt = new int[paramInt1 + 1];
    }
    arrayOfInt[0] = 0;
    int m = paramInt2 / paramInt1;
    int n = paramInt2 % paramInt1;
    int i = 1;
    int j = 0;
    paramInt2 = k;
    if (i <= paramInt1)
    {
      paramInt2 += n;
      if ((paramInt2 <= 0) || (paramInt1 - paramInt2 >= n)) {
        break label113;
      }
      k = m + 1;
      paramInt2 -= paramInt1;
    }
    for (;;)
    {
      j += k;
      arrayOfInt[i] = j;
      i += 1;
      break;
      return arrayOfInt;
      label113:
      k = m;
    }
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    } while ((i != Integer.MIN_VALUE) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }
  
  private int b(eu parameu, fa paramfa, int paramInt)
  {
    if (!paramfa.a()) {
      i = this.g.b(paramInt, this.b);
    }
    int j;
    do
    {
      return i;
      j = this.f.get(paramInt, -1);
      i = j;
    } while (j != -1);
    int i = parameu.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 0;
    }
    return this.g.b(i, this.b);
  }
  
  private void b(eu parameu, fa paramfa, cz paramcz, int paramInt)
  {
    int i = 1;
    if (paramInt == 1) {}
    for (;;)
    {
      paramInt = b(parameu, paramfa, paramcz.a);
      if (i == 0) {
        break;
      }
      while ((paramInt > 0) && (paramcz.a > 0))
      {
        paramcz.a -= 1;
        paramInt = b(parameu, paramfa, paramcz.a);
      }
      i = 0;
    }
    int k = paramfa.e();
    i = paramcz.a;
    while (i < k - 1)
    {
      int j = b(parameu, paramfa, i + 1);
      if (j <= paramInt) {
        break;
      }
      i += 1;
      paramInt = j;
    }
    paramcz.a = i;
  }
  
  private int c(eu parameu, fa paramfa, int paramInt)
  {
    if (!paramfa.a()) {
      i = this.g.a(paramInt);
    }
    int j;
    do
    {
      return i;
      j = this.e.get(paramInt, -1);
      i = j;
    } while (j != -1);
    int i = parameu.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 1;
    }
    return this.g.a(i);
  }
  
  private void l(int paramInt)
  {
    this.c = a(this.c, this.b, paramInt);
  }
  
  public int a(int paramInt, eu parameu, fa paramfa)
  {
    K();
    L();
    return super.a(paramInt, parameu, paramfa);
  }
  
  public int a(eu parameu, fa paramfa)
  {
    if (this.i == 0) {
      return this.b;
    }
    if (paramfa.e() < 1) {
      return 0;
    }
    return a(parameu, paramfa, paramfa.e() - 1) + 1;
  }
  
  public ep a()
  {
    if (this.i == 0) {
      return new cu(-2, -1);
    }
    return new cu(-1, -2);
  }
  
  public ep a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new cu(paramContext, paramAttributeSet);
  }
  
  public ep a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new cu((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new cu(paramLayoutParams);
  }
  
  View a(eu parameu, fa paramfa, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    h();
    int j = this.j.c();
    int k = this.j.d();
    int i;
    Object localObject1;
    label37:
    Object localObject3;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label197;
      }
      localObject3 = h(paramInt1);
      int m = d((View)localObject3);
      if ((m < 0) || (m >= paramInt3)) {
        break label216;
      }
      if (b(parameu, paramfa, m) == 0) {
        break label119;
      }
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    for (;;)
    {
      paramInt1 += i;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label37;
      i = -1;
      break;
      label119:
      if (((ep)((View)localObject3).getLayoutParams()).c())
      {
        if (localObject1 == null)
        {
          localObject1 = localObject2;
          localObject2 = localObject3;
        }
      }
      else
      {
        Object localObject4;
        if (this.j.a((View)localObject3) < k)
        {
          localObject4 = localObject3;
          if (this.j.b((View)localObject3) >= j) {}
        }
        else
        {
          if (localObject2 != null) {
            break label216;
          }
          localObject2 = localObject1;
          localObject1 = localObject3;
          continue;
          label197:
          if (localObject2 == null) {
            break label209;
          }
        }
        for (;;)
        {
          localObject4 = localObject2;
          return (View)localObject4;
          label209:
          localObject2 = localObject1;
        }
      }
      label216:
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  public View a(View paramView, int paramInt, eu parameu, fa paramfa)
  {
    View localView = e(paramView);
    if (localView == null)
    {
      parameu = null;
      return parameu;
    }
    cu localcu = (cu)localView.getLayoutParams();
    int i4 = cu.a(localcu);
    int i5 = cu.a(localcu) + cu.b(localcu);
    if (super.a(paramView, paramInt, parameu, paramfa) == null) {
      return null;
    }
    int i8;
    label83:
    int m;
    int k;
    if (e(paramInt) == 1)
    {
      i8 = 1;
      if (i8 == this.k) {
        break label162;
      }
      paramInt = 1;
      if (paramInt == 0) {
        break label167;
      }
      paramInt = t() - 1;
      m = -1;
      k = -1;
      label100:
      if ((this.i != 1) || (!g())) {
        break label181;
      }
    }
    int j;
    int i;
    int i1;
    label132:
    label162:
    label167:
    label181:
    for (int n = 1;; n = 0)
    {
      paramView = null;
      j = -1;
      i = 0;
      i1 = paramInt;
      paramInt = j;
      if (i1 != k)
      {
        paramfa = h(i1);
        if (paramfa != localView) {
          break label187;
        }
      }
      return paramView;
      i8 = 0;
      break;
      paramInt = 0;
      break label83;
      k = t();
      paramInt = 0;
      m = 1;
      break label100;
    }
    label187:
    if (!paramfa.isFocusable())
    {
      j = i;
      i = paramInt;
      paramInt = j;
    }
    for (;;)
    {
      i1 += m;
      j = i;
      i = paramInt;
      paramInt = j;
      break label132;
      localcu = (cu)paramfa.getLayoutParams();
      int i6 = cu.a(localcu);
      int i7 = cu.a(localcu) + cu.b(localcu);
      if (i6 == i4)
      {
        parameu = paramfa;
        if (i7 == i5) {
          break;
        }
      }
      int i3 = 0;
      if (paramView == null) {
        j = 1;
      }
      for (;;)
      {
        if (j != 0)
        {
          i = cu.a(localcu);
          paramInt = Math.min(i7, i5) - Math.max(i6, i4);
          paramView = paramfa;
          break;
          j = Math.max(i6, i4);
          int i2 = Math.min(i7, i5) - j;
          if (i2 > i)
          {
            j = 1;
          }
          else
          {
            j = i3;
            if (i2 == i)
            {
              if (i6 > paramInt) {}
              for (i2 = 1;; i2 = 0)
              {
                j = i3;
                if (n != i2) {
                  break;
                }
                j = 1;
                break;
              }
            }
          }
        }
      }
      j = paramInt;
      paramInt = i;
      i = j;
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == this.b) {
      return;
    }
    this.a = true;
    if (paramInt < 1) {
      throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
    }
    this.b = paramInt;
    this.g.a();
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (this.c == null) {
      super.a(paramRect, paramInt1, paramInt2);
    }
    int i = y();
    int j = A() + i;
    int k = z() + B();
    if (this.i == 1)
    {
      i = a(paramInt2, k + paramRect.height(), E());
      paramInt2 = a(paramInt1, j + this.c[(this.c.length - 1)], D());
      paramInt1 = i;
    }
    for (;;)
    {
      d(paramInt2, paramInt1);
      return;
      i = a(paramInt1, j + paramRect.width(), D());
      paramInt1 = a(paramInt2, k + this.c[(this.c.length - 1)], E());
      paramInt2 = i;
    }
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.g.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.g.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.g.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.g.a();
  }
  
  public void a(cv paramcv)
  {
    this.g = paramcv;
  }
  
  void a(eu parameu, fa paramfa, cz paramcz, int paramInt)
  {
    super.a(parameu, paramfa, paramcz, paramInt);
    K();
    if ((paramfa.e() > 0) && (!paramfa.a())) {
      b(parameu, paramfa, paramcz, paramInt);
    }
    L();
  }
  
  void a(eu parameu, fa paramfa, db paramdb, da paramda)
  {
    int i3 = this.j.i();
    int j;
    int k;
    label37:
    boolean bool1;
    label57:
    int i1;
    int i2;
    int n;
    if (i3 != 1073741824)
    {
      j = 1;
      if (t() <= 0) {
        break label225;
      }
      k = this.c[this.b];
      if (j != 0) {
        K();
      }
      if (paramdb.e != 1) {
        break label231;
      }
      bool1 = true;
      i1 = 0;
      i2 = 0;
      i = this.b;
      n = i1;
      m = i2;
      if (!bool1)
      {
        i = b(parameu, paramfa, paramdb.d) + c(parameu, paramfa, paramdb.d);
        m = i2;
        n = i1;
      }
    }
    for (;;)
    {
      if ((n < this.b) && (paramdb.a(paramfa)) && (i > 0))
      {
        i2 = paramdb.d;
        i1 = c(parameu, paramfa, i2);
        if (i1 > this.b)
        {
          throw new IllegalArgumentException("Item at position " + i2 + " requires " + i1 + " spans but GridLayoutManager has only " + this.b + " spans.");
          j = 0;
          break;
          label225:
          k = 0;
          break label37;
          label231:
          bool1 = false;
          break label57;
        }
        i -= i1;
        if (i >= 0) {
          break label261;
        }
      }
      label261:
      View localView;
      do
      {
        if (n != 0) {
          break;
        }
        paramda.b = true;
        return;
        localView = paramdb.a(parameu);
      } while (localView == null);
      m += i1;
      this.d[n] = localView;
      n += 1;
    }
    a(parameu, paramfa, n, m, bool1);
    int m = 0;
    float f1 = 0.0F;
    int i = 0;
    label351:
    label399:
    label447:
    boolean bool2;
    if (m < n)
    {
      parameu = this.d[m];
      if (paramdb.k == null) {
        if (bool1)
        {
          b(parameu);
          paramfa = (cu)parameu.getLayoutParams();
          i2 = this.c[(cu.a(paramfa) + cu.b(paramfa))];
          int i4 = this.c[cu.a(paramfa)];
          if (this.i != 0) {
            break label583;
          }
          i1 = paramfa.height;
          i2 = a(i2 - i4, i3, 0, i1, false);
          i4 = this.j.f();
          int i5 = this.j.h();
          if (this.i != 1) {
            break label592;
          }
          i1 = paramfa.height;
          i1 = a(i4, i5, 0, i1, true);
          if (this.i != 1) {
            break label607;
          }
          if (paramfa.height != -1) {
            break label601;
          }
          bool2 = true;
          label479:
          a(parameu, i2, i1, bool2, false);
          i1 = this.j.c(parameu);
          if (i1 <= i) {
            break label1459;
          }
          i = i1;
        }
      }
    }
    label583:
    label592:
    label601:
    label607:
    label729:
    label777:
    label809:
    label848:
    label857:
    label959:
    label1003:
    label1012:
    label1101:
    label1360:
    label1396:
    label1444:
    label1453:
    label1459:
    for (;;)
    {
      float f2 = 1.0F * this.j.d(parameu) / cu.b(paramfa);
      if (f2 > f1) {
        f1 = f2;
      }
      for (;;)
      {
        m += 1;
        break;
        b(parameu, 0);
        break label351;
        if (bool1)
        {
          a(parameu);
          break label351;
        }
        a(parameu, 0);
        break label351;
        i1 = paramfa.width;
        break label399;
        i1 = paramfa.width;
        break label447;
        bool2 = false;
        break label479;
        if (paramfa.width == -1) {}
        for (bool2 = true;; bool2 = false)
        {
          a(parameu, i1, i2, bool2, false);
          break;
        }
        m = i;
        if (j != 0)
        {
          a(f1, k);
          i = 0;
          j = 0;
          m = i;
          if (j < n)
          {
            parameu = this.d[j];
            paramfa = (cu)parameu.getLayoutParams();
            m = this.c[(cu.a(paramfa) + cu.b(paramfa))];
            i1 = this.c[cu.a(paramfa)];
            if (this.i == 0)
            {
              k = paramfa.height;
              m = a(m - i1, 1073741824, 0, k, false);
              i1 = this.j.f();
              i2 = this.j.h();
              if (this.i != 1) {
                break label848;
              }
              k = paramfa.height;
              k = a(i1, i2, 0, k, true);
              if (this.i != 1) {
                break label857;
              }
              a(parameu, m, k, false, true);
              k = this.j.c(parameu);
              if (k <= i) {
                break label1453;
              }
              i = k;
            }
          }
        }
        for (;;)
        {
          j += 1;
          break;
          k = paramfa.width;
          break label729;
          k = paramfa.width;
          break label777;
          a(parameu, k, m, false, true);
          break label809;
          k = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
          i = 0;
          if (i < n)
          {
            parameu = this.d[i];
            if (this.j.c(parameu) != m)
            {
              paramfa = (cu)parameu.getLayoutParams();
              i1 = this.c[(cu.a(paramfa) + cu.b(paramfa))];
              i2 = this.c[cu.a(paramfa)];
              if (this.i != 0) {
                break label1003;
              }
              j = paramfa.height;
              j = a(i1 - i2, 1073741824, 0, j, false);
              if (this.i != 1) {
                break label1012;
              }
              a(parameu, j, k, true, true);
            }
            for (;;)
            {
              i += 1;
              break;
              j = paramfa.width;
              break label959;
              a(parameu, k, j, true, true);
            }
          }
          paramda.a = m;
          j = 0;
          k = 0;
          if (this.i == 1) {
            if (paramdb.f == -1)
            {
              k = paramdb.b;
              m = k - m;
              i = 0;
              j = 0;
              i3 = 0;
              i1 = i;
              i2 = k;
              k = i3;
              i = j;
              j = i1;
              i1 = i2;
              if (k >= n) {
                break label1444;
              }
              parameu = this.d[k];
              paramfa = (cu)parameu.getLayoutParams();
              if (this.i != 1) {
                break label1396;
              }
              if (!g()) {
                break label1360;
              }
              j = y() + this.c[(cu.a(paramfa) + cu.b(paramfa))];
              i2 = this.j.d(parameu);
              i = j;
              j -= i2;
            }
          }
          for (;;)
          {
            a(parameu, j + paramfa.leftMargin, m + paramfa.topMargin, i - paramfa.rightMargin, i1 - paramfa.bottomMargin);
            if ((paramfa.c()) || (paramfa.d())) {
              paramda.c = true;
            }
            paramda.d |= parameu.isFocusable();
            i2 = k + 1;
            k = j;
            j = i;
            i = k;
            k = i2;
            break label1101;
            i = paramdb.b;
            k = i + m;
            i1 = 0;
            j = 0;
            m = i;
            i = i1;
            break;
            if (paramdb.f == -1)
            {
              i = paramdb.b;
              i1 = i - m;
              m = j;
              j = i1;
              break;
            }
            i1 = paramdb.b;
            i = m + i1;
            m = j;
            j = i1;
            break;
            i = y();
            j = this.c[cu.a(paramfa)] + i;
            i = this.j.d(parameu) + j;
            continue;
            m = z();
            m = this.c[cu.a(paramfa)] + m;
            i1 = this.j.d(parameu) + m;
            i2 = i;
            i = j;
            j = i2;
          }
          Arrays.fill(this.d, null);
          return;
        }
      }
    }
  }
  
  public void a(eu parameu, fa paramfa, View paramView, l paraml)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof cu))
    {
      super.a(paramView, paraml);
      return;
    }
    paramView = (cu)localLayoutParams;
    int i = a(parameu, paramfa, paramView.e());
    if (this.i == 0)
    {
      j = paramView.a();
      k = paramView.b();
      if ((this.b > 1) && (paramView.b() == this.b)) {}
      for (bool = true;; bool = false)
      {
        paraml.c(x.a(j, k, i, 1, bool, false));
        return;
      }
    }
    int j = paramView.a();
    int k = paramView.b();
    if ((this.b > 1) && (paramView.b() == this.b)) {}
    for (boolean bool = true;; bool = false)
    {
      paraml.c(x.a(i, 1, j, k, bool, false));
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    super.a(false);
  }
  
  public boolean a(ep paramep)
  {
    return paramep instanceof cu;
  }
  
  public int b(int paramInt, eu parameu, fa paramfa)
  {
    K();
    L();
    return super.b(paramInt, parameu, paramfa);
  }
  
  public int b(eu parameu, fa paramfa)
  {
    if (this.i == 1) {
      return this.b;
    }
    if (paramfa.e() < 1) {
      return 0;
    }
    return a(parameu, paramfa, paramfa.e() - 1) + 1;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.g.a();
  }
  
  public boolean b()
  {
    return (this.n == null) && (!this.a);
  }
  
  public void c(eu parameu, fa paramfa)
  {
    if (paramfa.a()) {
      J();
    }
    super.c(parameu, paramfa);
    I();
    if (!paramfa.a()) {
      this.a = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */