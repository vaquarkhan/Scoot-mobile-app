package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.g.d;
import android.support.v4.g.q;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final q<String, Class<?>> a = new q();
  static final Object j = new Object();
  int A;
  aj B;
  ag C;
  aj D;
  Fragment E;
  int F;
  int G;
  String H;
  boolean I;
  boolean J;
  boolean K;
  boolean L;
  boolean M;
  boolean N = true;
  boolean O;
  int P;
  ViewGroup Q;
  View R;
  View S;
  boolean T;
  boolean U = true;
  bf V;
  boolean W;
  boolean X;
  Object Y = null;
  Object Z = j;
  Object aa = null;
  Object ab = j;
  Object ac = null;
  Object ad = j;
  Boolean ae;
  Boolean af;
  dh ag = null;
  dh ah = null;
  int k = 0;
  View l;
  int m;
  Bundle n;
  SparseArray<Parcelable> o;
  int p = -1;
  String q;
  Bundle r;
  Fragment s;
  int t = -1;
  int u;
  boolean v;
  boolean w;
  boolean x;
  boolean y;
  boolean z;
  
  public static Fragment a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  public static Fragment a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass2 = (Class)a.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass1);
      }
      paramContext = (Fragment)localClass1.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.r = paramBundle;
      }
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new y("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new y("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new y("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public", paramContext);
    }
  }
  
  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Class localClass2 = (Class)a.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass1);
      }
      boolean bool = Fragment.class.isAssignableFrom(localClass1);
      return bool;
    }
    catch (ClassNotFoundException paramContext) {}
    return false;
  }
  
  public void A() {}
  
  public Object B()
  {
    return this.Y;
  }
  
  public Object C()
  {
    if (this.Z == j) {
      return B();
    }
    return this.Z;
  }
  
  public Object D()
  {
    return this.aa;
  }
  
  public Object E()
  {
    if (this.ab == j) {
      return D();
    }
    return this.ab;
  }
  
  public Object F()
  {
    return this.ac;
  }
  
  public Object G()
  {
    if (this.ad == j) {
      return F();
    }
    return this.ad;
  }
  
  public boolean H()
  {
    if (this.af == null) {
      return true;
    }
    return this.af.booleanValue();
  }
  
  public boolean I()
  {
    if (this.ae == null) {
      return true;
    }
    return this.ae.booleanValue();
  }
  
  void J()
  {
    this.D = new aj();
    this.D.a(this.C, new x(this), this);
  }
  
  void K()
  {
    if (this.D != null)
    {
      this.D.i();
      this.D.e();
    }
    this.k = 4;
    this.O = false;
    f();
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onStart()");
    }
    if (this.D != null) {
      this.D.l();
    }
    if (this.V != null) {
      this.V.g();
    }
  }
  
  void L()
  {
    if (this.D != null)
    {
      this.D.i();
      this.D.e();
    }
    this.k = 5;
    this.O = false;
    w();
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onResume()");
    }
    if (this.D != null)
    {
      this.D.m();
      this.D.e();
    }
  }
  
  void M()
  {
    onLowMemory();
    if (this.D != null) {
      this.D.s();
    }
  }
  
  void N()
  {
    if (this.D != null) {
      this.D.n();
    }
    this.k = 4;
    this.O = false;
    x();
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onPause()");
    }
  }
  
  void O()
  {
    if (this.D != null) {
      this.D.o();
    }
    this.k = 3;
    this.O = false;
    g();
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onStop()");
    }
  }
  
  void P()
  {
    if (this.D != null) {
      this.D.p();
    }
    this.k = 2;
    if (this.W)
    {
      this.W = false;
      if (!this.X)
      {
        this.X = true;
        this.V = this.C.a(this.q, this.W, false);
      }
      if (this.V != null)
      {
        if (!this.C.k()) {
          break label88;
        }
        this.V.d();
      }
    }
    return;
    label88:
    this.V.c();
  }
  
  void Q()
  {
    if (this.D != null) {
      this.D.q();
    }
    this.k = 1;
    this.O = false;
    h();
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onDestroyView()");
    }
    if (this.V != null) {
      this.V.f();
    }
  }
  
  void R()
  {
    if (this.D != null) {
      this.D.r();
    }
    this.k = 0;
    this.O = false;
    y();
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onDestroy()");
    }
  }
  
  Fragment a(String paramString)
  {
    if (paramString.equals(this.q)) {
      return this;
    }
    if (this.D != null) {
      return this.D.b(paramString);
    }
    return null;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public Animation a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public final String a(int paramInt)
  {
    return m().getString(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, Fragment paramFragment)
  {
    this.p = paramInt;
    if (paramFragment != null)
    {
      this.q = (paramFragment.q + ":" + this.p);
      return;
    }
    this.q = ("android:fragment:" + this.p);
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  @Deprecated
  public void a(Activity paramActivity)
  {
    this.O = true;
  }
  
  @Deprecated
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.O = true;
  }
  
  public void a(Context paramContext)
  {
    this.O = true;
    if (this.C == null) {}
    for (paramContext = null;; paramContext = this.C.f())
    {
      if (paramContext != null)
      {
        this.O = false;
        a(paramContext);
      }
      return;
    }
  }
  
  public void a(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.O = true;
    if (this.C == null) {}
    for (paramContext = null;; paramContext = this.C.f())
    {
      if (paramContext != null)
      {
        this.O = false;
        a(paramContext, paramAttributeSet, paramBundle);
      }
      return;
    }
  }
  
  public void a(Intent paramIntent)
  {
    a(paramIntent, null);
  }
  
  public void a(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (this.C == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.C.a(this, paramIntent, paramInt, paramBundle);
  }
  
  public void a(Intent paramIntent, Bundle paramBundle)
  {
    if (this.C == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.C.a(this, paramIntent, -1, paramBundle);
  }
  
  void a(Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
    if (this.D != null) {
      this.D.a(paramConfiguration);
    }
  }
  
  public void a(Fragment.SavedState paramSavedState)
  {
    if (this.p >= 0) {
      throw new IllegalStateException("Fragment already active");
    }
    if ((paramSavedState != null) && (paramSavedState.a != null)) {}
    for (paramSavedState = paramSavedState.a;; paramSavedState = null)
    {
      this.n = paramSavedState;
      return;
    }
  }
  
  public void a(Menu paramMenu) {}
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public void a(View paramView, Bundle paramBundle) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.F));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.G));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.H);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.k);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.p);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.q);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.A);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.v);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.w);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.x);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.y);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.I);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.J);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.N);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.M);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.K);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.L);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.U);
    if (this.B != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.B);
    }
    if (this.C != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.C);
    }
    if (this.E != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.E);
    }
    if (this.r != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.r);
    }
    if (this.n != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.n);
    }
    if (this.o != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.o);
    }
    if (this.s != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.s);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.u);
    }
    if (this.P != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(this.P);
    }
    if (this.Q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.Q);
    }
    if (this.R != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.R);
    }
    if (this.S != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.R);
    }
    if (this.l != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(this.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(this.m);
    }
    if (this.V != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      this.V.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.D != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + this.D + ":");
      this.D.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void a(String[] paramArrayOfString, int paramInt)
  {
    if (this.C == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.C.a(this, paramArrayOfString, paramInt);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void a_(Bundle paramBundle)
  {
    this.O = true;
  }
  
  public LayoutInflater b(Bundle paramBundle)
  {
    paramBundle = this.C.b();
    o();
    android.support.v4.view.ah.a(paramBundle, this.D.t());
    return paramBundle;
  }
  
  View b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.D != null) {
      this.D.i();
    }
    return a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void b(Menu paramMenu) {}
  
  boolean b(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool2 = false;
    boolean bool3 = false;
    if (!this.I)
    {
      boolean bool1 = bool3;
      if (this.M)
      {
        bool1 = bool3;
        if (this.N)
        {
          bool1 = true;
          a(paramMenu, paramMenuInflater);
        }
      }
      bool2 = bool1;
      if (this.D != null) {
        bool2 = bool1 | this.D.a(paramMenu, paramMenuInflater);
      }
    }
    return bool2;
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void c(boolean paramBoolean) {}
  
  boolean c(Menu paramMenu)
  {
    boolean bool2 = false;
    boolean bool3 = false;
    if (!this.I)
    {
      boolean bool1 = bool3;
      if (this.M)
      {
        bool1 = bool3;
        if (this.N)
        {
          bool1 = true;
          a(paramMenu);
        }
      }
      bool2 = bool1;
      if (this.D != null) {
        bool2 = bool1 | this.D.a(paramMenu);
      }
    }
    return bool2;
  }
  
  boolean c(MenuItem paramMenuItem)
  {
    if (!this.I)
    {
      if ((this.M) && (this.N) && (a(paramMenuItem))) {}
      while ((this.D != null) && (this.D.a(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void d(Bundle paramBundle)
  {
    this.O = true;
  }
  
  void d(Menu paramMenu)
  {
    if (!this.I)
    {
      if ((this.M) && (this.N)) {
        b(paramMenu);
      }
      if (this.D != null) {
        this.D.b(paramMenu);
      }
    }
  }
  
  public void d(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.E != null)) {
      throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
    }
    this.K = paramBoolean;
  }
  
  boolean d(MenuItem paramMenuItem)
  {
    if (!this.I)
    {
      if (b(paramMenuItem)) {}
      while ((this.D != null) && (this.D.b(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void e()
  {
    this.O = true;
  }
  
  public void e(Bundle paramBundle) {}
  
  public void e(boolean paramBoolean)
  {
    if (this.N != paramBoolean)
    {
      this.N = paramBoolean;
      if ((this.M) && (p()) && (!s())) {
        this.C.c();
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public void f()
  {
    this.O = true;
    if (!this.W)
    {
      this.W = true;
      if (!this.X)
      {
        this.X = true;
        this.V = this.C.a(this.q, this.W, false);
      }
      if (this.V != null) {
        this.V.b();
      }
    }
  }
  
  final void f(Bundle paramBundle)
  {
    if (this.o != null)
    {
      this.S.restoreHierarchyState(this.o);
      this.o = null;
    }
    this.O = false;
    h(paramBundle);
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }
  }
  
  public void f(boolean paramBoolean)
  {
    if ((!this.U) && (paramBoolean) && (this.k < 4)) {
      this.B.b(this);
    }
    this.U = paramBoolean;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.T = paramBoolean;
      return;
    }
  }
  
  public void g()
  {
    this.O = true;
  }
  
  public void g(Bundle paramBundle)
  {
    if (this.p >= 0) {
      throw new IllegalStateException("Fragment already active");
    }
    this.r = paramBundle;
  }
  
  public void h()
  {
    this.O = true;
  }
  
  public void h(Bundle paramBundle)
  {
    this.O = true;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  void i(Bundle paramBundle)
  {
    if (this.D != null) {
      this.D.i();
    }
    this.k = 1;
    this.O = false;
    a_(paramBundle);
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onCreate()");
    }
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getParcelable("android:support:fragments");
      if (paramBundle != null)
      {
        if (this.D == null) {
          J();
        }
        this.D.a(paramBundle, null);
        this.D.j();
      }
    }
  }
  
  final boolean i()
  {
    return this.A > 0;
  }
  
  public final Bundle j()
  {
    return this.r;
  }
  
  void j(Bundle paramBundle)
  {
    if (this.D != null) {
      this.D.i();
    }
    this.k = 2;
    this.O = false;
    d(paramBundle);
    if (!this.O) {
      throw new di("Fragment " + this + " did not call through to super.onActivityCreated()");
    }
    if (this.D != null) {
      this.D.k();
    }
  }
  
  public Context k()
  {
    if (this.C == null) {
      return null;
    }
    return this.C.g();
  }
  
  void k(Bundle paramBundle)
  {
    e(paramBundle);
    if (this.D != null)
    {
      Parcelable localParcelable = this.D.h();
      if (localParcelable != null) {
        paramBundle.putParcelable("android:support:fragments", localParcelable);
      }
    }
  }
  
  public final aa l()
  {
    if (this.C == null) {
      return null;
    }
    return (aa)this.C.f();
  }
  
  public final Resources m()
  {
    if (this.C == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    return this.C.g().getResources();
  }
  
  public final ah n()
  {
    return this.B;
  }
  
  public final ah o()
  {
    if (this.D == null)
    {
      J();
      if (this.k < 5) {
        break label31;
      }
      this.D.m();
    }
    for (;;)
    {
      return this.D;
      label31:
      if (this.k >= 4) {
        this.D.l();
      } else if (this.k >= 2) {
        this.D.k();
      } else if (this.k >= 1) {
        this.D.j();
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.O = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    l().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    this.O = true;
  }
  
  public final boolean p()
  {
    return (this.C != null) && (this.v);
  }
  
  public final boolean q()
  {
    return this.J;
  }
  
  public final boolean r()
  {
    return this.w;
  }
  
  public final boolean s()
  {
    return this.I;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    a(paramIntent, paramInt, null);
  }
  
  public final boolean t()
  {
    return this.K;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    d.a(this, localStringBuilder);
    if (this.p >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.p);
    }
    if (this.F != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.F));
    }
    if (this.H != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.H);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public bd u()
  {
    if (this.V != null) {
      return this.V;
    }
    if (this.C == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.X = true;
    this.V = this.C.a(this.q, this.W, true);
    return this.V;
  }
  
  public View v()
  {
    return this.R;
  }
  
  public void w()
  {
    this.O = true;
  }
  
  public void x()
  {
    this.O = true;
  }
  
  public void y()
  {
    this.O = true;
    if (!this.X)
    {
      this.X = true;
      this.V = this.C.a(this.q, this.W, false);
    }
    if (this.V != null) {
      this.V.h();
    }
  }
  
  void z()
  {
    this.p = -1;
    this.q = null;
    this.v = false;
    this.w = false;
    this.x = false;
    this.y = false;
    this.z = false;
    this.A = 0;
    this.B = null;
    this.D = null;
    this.C = null;
    this.F = 0;
    this.G = 0;
    this.H = null;
    this.I = false;
    this.J = false;
    this.L = false;
    this.V = null;
    this.W = false;
    this.X = false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\Fragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */