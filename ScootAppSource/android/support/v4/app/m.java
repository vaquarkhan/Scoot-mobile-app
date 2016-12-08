package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.g.a;
import android.support.v4.g.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class m
  extends av
  implements Runnable
{
  static final boolean a;
  final aj b;
  q c;
  q d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  boolean l;
  boolean m = true;
  String n;
  boolean o;
  int p = -1;
  int q;
  CharSequence r;
  int s;
  CharSequence t;
  ArrayList<String> u;
  ArrayList<String> v;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public m(aj paramaj)
  {
    this.b = paramaj;
  }
  
  private r a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, boolean paramBoolean)
  {
    int i5 = 0;
    r localr = new r(this);
    localr.d = new View(this.b.o.g());
    int i2 = 0;
    int i1 = 0;
    int i3 = i5;
    int i4 = i1;
    if (i2 < paramSparseArray1.size())
    {
      if (!a(paramSparseArray1.keyAt(i2), localr, paramBoolean, paramSparseArray1, paramSparseArray2)) {
        break label164;
      }
      i1 = 1;
    }
    label164:
    for (;;)
    {
      i2 += 1;
      break;
      while (i3 < paramSparseArray2.size())
      {
        i2 = paramSparseArray2.keyAt(i3);
        i1 = i4;
        if (paramSparseArray1.get(i2) == null)
        {
          i1 = i4;
          if (a(i2, localr, paramBoolean, paramSparseArray1, paramSparseArray2)) {
            i1 = 1;
          }
        }
        i3 += 1;
        i4 = i1;
      }
      paramSparseArray1 = localr;
      if (i4 == 0) {
        paramSparseArray1 = null;
      }
      return paramSparseArray1;
    }
  }
  
  private a<String, View> a(r paramr, Fragment paramFragment, boolean paramBoolean)
  {
    a locala2 = new a();
    a locala1 = locala2;
    if (this.u != null)
    {
      aw.a(locala2, paramFragment.v());
      if (!paramBoolean) {
        break label82;
      }
      locala2.a(this.v);
    }
    label82:
    for (locala1 = locala2; paramBoolean; locala1 = a(this.u, this.v, locala2))
    {
      if (paramFragment.ag != null) {
        paramFragment.ag.a(this.v, locala1);
      }
      a(paramr, locala1, false);
      return locala1;
    }
    if (paramFragment.ah != null) {
      paramFragment.ah.a(this.v, locala1);
    }
    b(paramr, locala1, false);
    return locala1;
  }
  
  private a<String, View> a(r paramr, boolean paramBoolean, Fragment paramFragment)
  {
    a locala = b(paramr, paramFragment, paramBoolean);
    if (paramBoolean)
    {
      if (paramFragment.ah != null) {
        paramFragment.ah.a(this.v, locala);
      }
      a(paramr, locala, true);
      return locala;
    }
    if (paramFragment.ag != null) {
      paramFragment.ag.a(this.v, locala);
    }
    b(paramr, locala, true);
    return locala;
  }
  
  private static a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, a<String, View> parama)
  {
    if (parama.isEmpty()) {
      return parama;
    }
    a locala = new a();
    int i2 = paramArrayList1.size();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = (View)parama.get(paramArrayList1.get(i1));
      if (localView != null) {
        locala.put(paramArrayList2.get(i1), localView);
      }
      i1 += 1;
    }
    return locala;
  }
  
  private static Object a(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 == null) || (paramFragment2 == null)) {
      return null;
    }
    if (paramBoolean) {}
    for (paramFragment1 = paramFragment2.G();; paramFragment1 = paramFragment1.F()) {
      return aw.b(paramFragment1);
    }
  }
  
  private static Object a(Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {}
    for (paramFragment = paramFragment.E();; paramFragment = paramFragment.B()) {
      return aw.a(paramFragment);
    }
  }
  
  private static Object a(Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, a<String, View> parama, View paramView)
  {
    Object localObject = paramObject;
    if (paramObject != null) {
      localObject = aw.a(paramObject, paramFragment.v(), paramArrayList, parama, paramView);
    }
    return localObject;
  }
  
  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    paramFragment.B = this.b;
    if (paramString != null)
    {
      if ((paramFragment.H != null) && (!paramString.equals(paramFragment.H))) {
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.H + " now " + paramString);
      }
      paramFragment.H = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramFragment.F != 0) && (paramFragment.F != paramInt1)) {
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.F + " now " + paramInt1);
      }
      paramFragment.F = paramInt1;
      paramFragment.G = paramInt1;
    }
    paramString = new q();
    paramString.c = paramInt2;
    paramString.d = paramFragment;
    a(paramString);
  }
  
  private void a(r paramr, int paramInt, Object paramObject)
  {
    if (this.b.g != null)
    {
      int i1 = 0;
      if (i1 < this.b.g.size())
      {
        Fragment localFragment = (Fragment)this.b.g.get(i1);
        if ((localFragment.R != null) && (localFragment.Q != null) && (localFragment.G == paramInt))
        {
          if (!localFragment.I) {
            break label125;
          }
          if (!paramr.b.contains(localFragment.R))
          {
            aw.a(paramObject, localFragment.R, true);
            paramr.b.add(localFragment.R);
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          label125:
          aw.a(paramObject, localFragment.R, false);
          paramr.b.remove(localFragment.R);
        }
      }
    }
  }
  
  private void a(r paramr, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, a<String, View> parama)
  {
    if (paramBoolean) {}
    for (paramr = paramFragment2.ag;; paramr = paramFragment1.ag)
    {
      if (paramr != null) {
        paramr.b(new ArrayList(parama.keySet()), new ArrayList(parama.values()), null);
      }
      return;
    }
  }
  
  private void a(r paramr, a<String, View> parama, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13:
    String str;
    Object localObject;
    if (this.v == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      str = (String)this.u.get(i2);
      localObject = (View)parama.get((String)this.v.get(i2));
      if (localObject != null)
      {
        localObject = aw.a((View)localObject);
        if (!paramBoolean) {
          break label103;
        }
        a(paramr.a, str, (String)localObject);
      }
    }
    for (;;)
    {
      i2 += 1;
      break label13;
      i1 = this.v.size();
      break;
      label103:
      a(paramr.a, (String)localObject, str);
    }
  }
  
  private void a(r paramr, View paramView, Object paramObject, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList<View> paramArrayList)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new o(this, paramView, paramObject, paramArrayList, paramr, paramBoolean, paramFragment1, paramFragment2));
  }
  
  private static void a(r paramr, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if (paramArrayList1 != null)
    {
      int i1 = 0;
      while (i1 < paramArrayList1.size())
      {
        String str1 = (String)paramArrayList1.get(i1);
        String str2 = (String)paramArrayList2.get(i1);
        a(paramr.a, str1, str2);
        i1 += 1;
      }
    }
  }
  
  private void a(a<String, View> parama, r paramr)
  {
    if ((this.v != null) && (!parama.isEmpty()))
    {
      parama = (View)parama.get(this.v.get(0));
      if (parama != null) {
        paramr.c.a = parama;
      }
    }
  }
  
  private static void a(a<String, String> parama, String paramString1, String paramString2)
  {
    int i1;
    if ((paramString1 != null) && (paramString2 != null)) {
      i1 = 0;
    }
    while (i1 < parama.size())
    {
      if (paramString1.equals(parama.c(i1)))
      {
        parama.a(i1, paramString2);
        return;
      }
      i1 += 1;
    }
    parama.put(paramString1, paramString2);
  }
  
  private static void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.G;
      if ((i1 != 0) && (!paramFragment.s()))
      {
        if ((paramFragment.p()) && (paramFragment.v() != null) && (paramSparseArray1.get(i1) == null)) {
          paramSparseArray1.put(i1, paramFragment);
        }
        if (paramSparseArray2.get(i1) == paramFragment) {
          paramSparseArray2.remove(i1);
        }
      }
    }
  }
  
  private void a(View paramView, r paramr, int paramInt, Object paramObject)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new p(this, paramView, paramr, paramInt, paramObject));
  }
  
  private boolean a(int paramInt, r paramr, boolean paramBoolean, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.b.p.a(paramInt);
    if (localViewGroup == null) {
      return false;
    }
    Object localObject2 = (Fragment)paramSparseArray2.get(paramInt);
    Object localObject4 = (Fragment)paramSparseArray1.get(paramInt);
    Object localObject3 = a((Fragment)localObject2, paramBoolean);
    paramSparseArray2 = a((Fragment)localObject2, (Fragment)localObject4, paramBoolean);
    Object localObject5 = b((Fragment)localObject4, paramBoolean);
    paramSparseArray1 = null;
    ArrayList localArrayList1 = new ArrayList();
    if (paramSparseArray2 != null)
    {
      localObject1 = a(paramr, (Fragment)localObject4, paramBoolean);
      if (((a)localObject1).isEmpty())
      {
        paramSparseArray1 = null;
        paramSparseArray2 = null;
        if ((localObject3 != null) || (paramSparseArray2 != null) || (localObject5 != null)) {
          break label208;
        }
        return false;
      }
      if (!paramBoolean) {
        break label198;
      }
    }
    label198:
    for (paramSparseArray1 = ((Fragment)localObject4).ag;; paramSparseArray1 = ((Fragment)localObject2).ag)
    {
      if (paramSparseArray1 != null) {
        paramSparseArray1.a(new ArrayList(((a)localObject1).keySet()), new ArrayList(((a)localObject1).values()), null);
      }
      a(paramr, localViewGroup, paramSparseArray2, (Fragment)localObject2, (Fragment)localObject4, paramBoolean, localArrayList1);
      paramSparseArray1 = (SparseArray<Fragment>)localObject1;
      break;
    }
    label208:
    Object localObject1 = new ArrayList();
    localObject4 = a(localObject5, (Fragment)localObject4, (ArrayList)localObject1, paramSparseArray1, paramr.d);
    if ((this.v != null) && (paramSparseArray1 != null))
    {
      localObject5 = (View)paramSparseArray1.get(this.v.get(0));
      if (localObject5 != null)
      {
        if (localObject4 != null) {
          aw.a(localObject4, (View)localObject5);
        }
        if (paramSparseArray2 != null) {
          aw.a(paramSparseArray2, (View)localObject5);
        }
      }
    }
    localObject5 = new n(this, (Fragment)localObject2);
    ArrayList localArrayList2 = new ArrayList();
    a locala = new a();
    boolean bool = true;
    if (localObject2 != null) {
      if (!paramBoolean) {
        break label462;
      }
    }
    label462:
    for (bool = ((Fragment)localObject2).I();; bool = ((Fragment)localObject2).H())
    {
      localObject2 = aw.a(localObject3, localObject4, paramSparseArray2, bool);
      if (localObject2 != null)
      {
        aw.a(localObject3, paramSparseArray2, localViewGroup, (bc)localObject5, paramr.d, paramr.c, paramr.a, localArrayList2, paramSparseArray1, locala, localArrayList1);
        a(localViewGroup, paramr, paramInt, localObject2);
        aw.a(localObject2, paramr.d, true);
        a(paramr, paramInt, localObject2);
        aw.a(localViewGroup, localObject2);
        aw.a(localViewGroup, paramr.d, localObject3, localArrayList2, localObject4, (ArrayList)localObject1, paramSparseArray2, localArrayList1, localObject2, paramr.b, locala);
      }
      if (localObject2 == null) {
        break;
      }
      return true;
    }
    return false;
  }
  
  private a<String, View> b(r paramr, Fragment paramFragment, boolean paramBoolean)
  {
    a locala = new a();
    paramFragment = paramFragment.v();
    paramr = locala;
    if (paramFragment != null)
    {
      paramr = locala;
      if (this.u != null)
      {
        aw.a(locala, paramFragment);
        if (!paramBoolean) {
          break label57;
        }
        paramr = a(this.u, this.v, locala);
      }
    }
    return paramr;
    label57:
    locala.a(this.v);
    return locala;
  }
  
  private static Object b(Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {}
    for (paramFragment = paramFragment.C();; paramFragment = paramFragment.D()) {
      return aw.a(paramFragment);
    }
  }
  
  private void b(r paramr, a<String, View> parama, boolean paramBoolean)
  {
    int i2 = parama.size();
    int i1 = 0;
    if (i1 < i2)
    {
      String str1 = (String)parama.b(i1);
      String str2 = aw.a((View)parama.c(i1));
      if (paramBoolean) {
        a(paramr.a, str1, str2);
      }
      for (;;)
      {
        i1 += 1;
        break;
        a(paramr.a, str2, str1);
      }
    }
  }
  
  private void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.b.p.a()) {}
    q localq;
    do
    {
      return;
      localq = this.c;
    } while (localq == null);
    switch (localq.c)
    {
    }
    for (;;)
    {
      localq = localq.a;
      break;
      b(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      Object localObject1 = localq.d;
      if (this.b.g != null)
      {
        int i1 = 0;
        if (i1 < this.b.g.size())
        {
          Fragment localFragment = (Fragment)this.b.g.get(i1);
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (localFragment.G != ((Fragment)localObject1).G) {}
          }
          else
          {
            if (localFragment != localObject1) {
              break label197;
            }
            localObject2 = null;
            paramSparseArray2.remove(localFragment.G);
          }
          for (;;)
          {
            i1 += 1;
            localObject1 = localObject2;
            break;
            label197:
            a(paramSparseArray1, paramSparseArray2, localFragment);
            localObject2 = localObject1;
          }
        }
      }
      b(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localq.d);
    }
  }
  
  private void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.G;
      if (i1 != 0)
      {
        if (!paramFragment.p()) {
          paramSparseArray2.put(i1, paramFragment);
        }
        if (paramSparseArray1.get(i1) == paramFragment) {
          paramSparseArray1.remove(i1);
        }
      }
      if ((paramFragment.k < 1) && (this.b.n >= 1))
      {
        this.b.d(paramFragment);
        this.b.a(paramFragment, 1, 0, 0, false);
      }
    }
  }
  
  public int a()
  {
    return a(false);
  }
  
  int a(boolean paramBoolean)
  {
    if (this.o) {
      throw new IllegalStateException("commit already called");
    }
    if (aj.a)
    {
      Log.v("FragmentManager", "Commit: " + this);
      a("  ", null, new PrintWriter(new e("FragmentManager")), null);
    }
    this.o = true;
    if (this.l) {}
    for (this.p = this.b.a(this);; this.p = -1)
    {
      this.b.a(this, paramBoolean);
      return this.p;
    }
  }
  
  public av a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, 0, 0);
  }
  
  public av a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramInt4;
    return this;
  }
  
  public av a(int paramInt, Fragment paramFragment)
  {
    a(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public av a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  public av a(Fragment paramFragment)
  {
    q localq = new q();
    localq.c = 3;
    localq.d = paramFragment;
    a(localq);
    return this;
  }
  
  public av a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }
  
  public r a(boolean paramBoolean, r paramr, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (aj.a)
    {
      Log.v("FragmentManager", "popFromBackStack: " + this);
      a("  ", null, new PrintWriter(new e("FragmentManager")), null);
    }
    r localr = paramr;
    if (a)
    {
      localr = paramr;
      if (this.b.n >= 1)
      {
        if (paramr != null) {
          break label239;
        }
        if (paramSparseArray1.size() == 0)
        {
          localr = paramr;
          if (paramSparseArray2.size() == 0) {}
        }
        else
        {
          localr = a(paramSparseArray1, paramSparseArray2, true);
        }
      }
    }
    label114:
    a(-1);
    int i1;
    label127:
    int i2;
    label135:
    int i3;
    if (localr != null)
    {
      i1 = 0;
      if (localr == null) {
        break label273;
      }
      i2 = 0;
      paramr = this.d;
      if (paramr == null) {
        break label562;
      }
      if (localr == null) {
        break label282;
      }
      i3 = 0;
      label152:
      if (localr == null) {
        break label291;
      }
    }
    label239:
    label273:
    label282:
    label291:
    for (int i4 = 0;; i4 = paramr.h) {
      switch (paramr.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + paramr.c);
        localr = paramr;
        if (paramBoolean) {
          break label114;
        }
        a(paramr, this.v, this.u);
        localr = paramr;
        break label114;
        i1 = this.k;
        break label127;
        i2 = this.j;
        break label135;
        i3 = paramr.g;
        break label152;
      }
    }
    paramSparseArray1 = paramr.d;
    paramSparseArray1.P = i4;
    this.b.a(paramSparseArray1, aj.c(i2), i1);
    for (;;)
    {
      paramr = paramr.b;
      break;
      paramSparseArray1 = paramr.d;
      if (paramSparseArray1 != null)
      {
        paramSparseArray1.P = i4;
        this.b.a(paramSparseArray1, aj.c(i2), i1);
      }
      if (paramr.i != null)
      {
        i4 = 0;
        while (i4 < paramr.i.size())
        {
          paramSparseArray1 = (Fragment)paramr.i.get(i4);
          paramSparseArray1.P = i3;
          this.b.a(paramSparseArray1, false);
          i4 += 1;
        }
        paramSparseArray1 = paramr.d;
        paramSparseArray1.P = i3;
        this.b.a(paramSparseArray1, false);
        continue;
        paramSparseArray1 = paramr.d;
        paramSparseArray1.P = i3;
        this.b.c(paramSparseArray1, aj.c(i2), i1);
        continue;
        paramSparseArray1 = paramr.d;
        paramSparseArray1.P = i4;
        this.b.b(paramSparseArray1, aj.c(i2), i1);
        continue;
        paramSparseArray1 = paramr.d;
        paramSparseArray1.P = i3;
        this.b.e(paramSparseArray1, aj.c(i2), i1);
        continue;
        paramSparseArray1 = paramr.d;
        paramSparseArray1.P = i3;
        this.b.d(paramSparseArray1, aj.c(i2), i1);
      }
    }
    label562:
    if (paramBoolean)
    {
      this.b.a(this.b.n, aj.c(i2), i1, true);
      localr = null;
    }
    if (this.p >= 0)
    {
      this.b.b(this.p);
      this.p = -1;
    }
    return localr;
  }
  
  void a(int paramInt)
  {
    if (!this.l) {}
    for (;;)
    {
      return;
      if (aj.a) {
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + paramInt);
      }
      for (q localq = this.c; localq != null; localq = localq.a)
      {
        Fragment localFragment;
        if (localq.d != null)
        {
          localFragment = localq.d;
          localFragment.A += paramInt;
          if (aj.a) {
            Log.v("FragmentManager", "Bump nesting of " + localq.d + " to " + localq.d.A);
          }
        }
        if (localq.i != null)
        {
          int i1 = localq.i.size() - 1;
          while (i1 >= 0)
          {
            localFragment = (Fragment)localq.i.get(i1);
            localFragment.A += paramInt;
            if (aj.a) {
              Log.v("FragmentManager", "Bump nesting of " + localFragment + " to " + localFragment.A);
            }
            i1 -= 1;
          }
        }
      }
    }
  }
  
  void a(q paramq)
  {
    if (this.c == null)
    {
      this.d = paramq;
      this.c = paramq;
    }
    for (;;)
    {
      paramq.e = this.f;
      paramq.f = this.g;
      paramq.g = this.h;
      paramq.h = this.i;
      this.e += 1;
      return;
      paramq.b = this.d;
      this.d.a = paramq;
      this.d = paramq;
    }
  }
  
  public void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.b.p.a()) {}
    q localq;
    do
    {
      return;
      localq = this.d;
    } while (localq == null);
    switch (localq.c)
    {
    }
    for (;;)
    {
      localq = localq.b;
      break;
      a(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      if (localq.i != null)
      {
        int i1 = localq.i.size() - 1;
        while (i1 >= 0)
        {
          b(paramSparseArray1, paramSparseArray2, (Fragment)localq.i.get(i1));
          i1 -= 1;
        }
      }
      a(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localq.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localq.d);
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.o);
      if (this.j != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.k));
      }
      if ((this.f != 0) || (this.g != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      }
      if ((this.h != 0) || (this.i != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.h));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.i));
      }
      if ((this.q != 0) || (this.r != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.q));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.r);
      }
      if ((this.s != 0) || (this.t != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.s));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.t);
      }
    }
    if (this.c != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str2 = paramString + "    ";
      q localq = this.c;
      int i1 = 0;
      while (localq != null)
      {
        String str1;
        int i2;
        switch (localq.c)
        {
        default: 
          str1 = "cmd=" + localq.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str1);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localq.d);
          if (paramBoolean)
          {
            if ((localq.e != 0) || (localq.f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localq.e));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localq.f));
            }
            if ((localq.g != 0) || (localq.h != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localq.g));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localq.h));
            }
          }
          if ((localq.i == null) || (localq.i.size() <= 0)) {
            break label807;
          }
          i2 = 0;
          label641:
          if (i2 >= localq.i.size()) {
            break label807;
          }
          paramPrintWriter.print(str2);
          if (localq.i.size() == 1) {
            paramPrintWriter.print("Removed: ");
          }
          break;
        }
        for (;;)
        {
          paramPrintWriter.println(localq.i.get(i2));
          i2 += 1;
          break label641;
          str1 = "NULL";
          break;
          str1 = "ADD";
          break;
          str1 = "REPLACE";
          break;
          str1 = "REMOVE";
          break;
          str1 = "HIDE";
          break;
          str1 = "SHOW";
          break;
          str1 = "DETACH";
          break;
          str1 = "ATTACH";
          break;
          if (i2 == 0) {
            paramPrintWriter.println("Removed:");
          }
          paramPrintWriter.print(str2);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label807:
        localq = localq.a;
        i1 += 1;
      }
    }
  }
  
  public int b()
  {
    return a(true);
  }
  
  public av b(Fragment paramFragment)
  {
    q localq = new q();
    localq.c = 4;
    localq.d = paramFragment;
    a(localq);
    return this;
  }
  
  public av c(Fragment paramFragment)
  {
    q localq = new q();
    localq.c = 5;
    localq.d = paramFragment;
    a(localq);
    return this;
  }
  
  public String c()
  {
    return this.n;
  }
  
  public av d(Fragment paramFragment)
  {
    q localq = new q();
    localq.c = 6;
    localq.d = paramFragment;
    a(localq);
    return this;
  }
  
  public av e(Fragment paramFragment)
  {
    q localq = new q();
    localq.c = 7;
    localq.d = paramFragment;
    a(localq);
    return this;
  }
  
  public void run()
  {
    if (aj.a) {
      Log.v("FragmentManager", "Run: " + this);
    }
    if ((this.l) && (this.p < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    a(1);
    Object localObject1;
    if ((a) && (this.b.n >= 1))
    {
      localObject1 = new SparseArray();
      localObject2 = new SparseArray();
      b((SparseArray)localObject1, (SparseArray)localObject2);
    }
    for (Object localObject2 = a((SparseArray)localObject1, (SparseArray)localObject2, false);; localObject2 = null)
    {
      int i1;
      label124:
      int i2;
      label131:
      q localq;
      int i3;
      if (localObject2 != null)
      {
        i1 = 0;
        if (localObject2 == null) {
          break label244;
        }
        i2 = 0;
        localq = this.c;
        if (localq == null) {
          break label733;
        }
        if (localObject2 == null) {
          break label252;
        }
        i3 = 0;
        label149:
        if (localObject2 == null) {
          break label261;
        }
      }
      label244:
      label252:
      label261:
      for (int i4 = 0;; i4 = localq.f) {
        switch (localq.c)
        {
        default: 
          throw new IllegalArgumentException("Unknown cmd: " + localq.c);
          i1 = this.k;
          break label124;
          i2 = this.j;
          break label131;
          i3 = localq.e;
          break label149;
        }
      }
      localObject1 = localq.d;
      ((Fragment)localObject1).P = i3;
      this.b.a((Fragment)localObject1, false);
      for (;;)
      {
        localq = localq.a;
        break;
        localObject1 = localq.d;
        int i6 = ((Fragment)localObject1).G;
        Object localObject3 = localObject1;
        if (this.b.g != null)
        {
          int i5 = this.b.g.size() - 1;
          localObject3 = localObject1;
          if (i5 >= 0)
          {
            localObject3 = (Fragment)this.b.g.get(i5);
            if (aj.a) {
              Log.v("FragmentManager", "OP_REPLACE: adding=" + localObject1 + " old=" + localObject3);
            }
            if (((Fragment)localObject3).G == i6) {
              if (localObject3 == localObject1)
              {
                localObject1 = null;
                localq.d = null;
              }
            }
            for (;;)
            {
              i5 -= 1;
              break;
              if (localq.i == null) {
                localq.i = new ArrayList();
              }
              localq.i.add(localObject3);
              ((Fragment)localObject3).P = i4;
              if (this.l)
              {
                ((Fragment)localObject3).A += 1;
                if (aj.a) {
                  Log.v("FragmentManager", "Bump nesting of " + localObject3 + " to " + ((Fragment)localObject3).A);
                }
              }
              this.b.a((Fragment)localObject3, i2, i1);
            }
          }
        }
        if (localObject3 != null)
        {
          ((Fragment)localObject3).P = i3;
          this.b.a((Fragment)localObject3, false);
          continue;
          localObject1 = localq.d;
          ((Fragment)localObject1).P = i4;
          this.b.a((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localq.d;
          ((Fragment)localObject1).P = i4;
          this.b.b((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localq.d;
          ((Fragment)localObject1).P = i3;
          this.b.c((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localq.d;
          ((Fragment)localObject1).P = i4;
          this.b.d((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localq.d;
          ((Fragment)localObject1).P = i3;
          this.b.e((Fragment)localObject1, i2, i1);
        }
      }
      label733:
      this.b.a(this.b.n, i2, i1, true);
      if (this.l) {
        this.b.b(this);
      }
      return;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.p >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.p);
    }
    if (this.n != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.n);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */