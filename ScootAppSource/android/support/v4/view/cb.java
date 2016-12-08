package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class cb
{
  static final co a = new cc();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new cn();
      return;
    }
    if (i >= 21)
    {
      a = new cm();
      return;
    }
    if (i >= 19)
    {
      a = new cl();
      return;
    }
    if (i >= 17)
    {
      a = new cj();
      return;
    }
    if (i >= 16)
    {
      a = new ci();
      return;
    }
    if (i >= 15)
    {
      a = new cg();
      return;
    }
    if (i >= 14)
    {
      a = new ch();
      return;
    }
    if (i >= 11)
    {
      a = new cf();
      return;
    }
    if (i >= 9)
    {
      a = new ce();
      return;
    }
    if (i >= 7)
    {
      a = new cd();
      return;
    }
  }
  
  public static boolean A(View paramView)
  {
    return a.B(paramView);
  }
  
  public static ColorStateList B(View paramView)
  {
    return a.D(paramView);
  }
  
  public static PorterDuff.Mode C(View paramView)
  {
    return a.E(paramView);
  }
  
  public static boolean D(View paramView)
  {
    return a.C(paramView);
  }
  
  public static void E(View paramView)
  {
    a.F(paramView);
  }
  
  public static boolean F(View paramView)
  {
    return a.G(paramView);
  }
  
  public static float G(View paramView)
  {
    return a.H(paramView);
  }
  
  public static boolean H(View paramView)
  {
    return a.I(paramView);
  }
  
  public static boolean I(View paramView)
  {
    return a.J(paramView);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }
  
  public static int a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static fh a(View paramView, fh paramfh)
  {
    return a.a(paramView, paramfh);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    a.a(paramView, paramInt1, paramInt2);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }
  
  public static void a(View paramView, l paraml)
  {
    a.a(paramView, paraml);
  }
  
  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }
  
  public static void a(View paramView, bs parambs)
  {
    a.a(paramView, parambs);
  }
  
  public static void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.a(paramView, paramAccessibilityEvent);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a.a(paramView, paramInt, paramBundle);
  }
  
  public static fh b(View paramView, fh paramfh)
  {
    return a.b(paramView, paramfh);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    a.b(paramView, paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static void c(View paramView, boolean paramBoolean)
  {
    a.c(paramView, paramBoolean);
  }
  
  public static boolean c(View paramView)
  {
    return a.c(paramView);
  }
  
  public static void d(View paramView)
  {
    a.d(paramView);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void d(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }
  
  public static int e(View paramView)
  {
    return a.e(paramView);
  }
  
  public static void e(View paramView, float paramFloat)
  {
    a.e(paramView, paramFloat);
  }
  
  public static void e(View paramView, int paramInt)
  {
    a.f(paramView, paramInt);
  }
  
  public static float f(View paramView)
  {
    return a.f(paramView);
  }
  
  public static void f(View paramView, float paramFloat)
  {
    a.f(paramView, paramFloat);
  }
  
  public static void f(View paramView, int paramInt)
  {
    a.e(paramView, paramInt);
  }
  
  public static int g(View paramView)
  {
    return a.g(paramView);
  }
  
  public static void g(View paramView, float paramFloat)
  {
    a.g(paramView, paramFloat);
  }
  
  public static int h(View paramView)
  {
    return a.h(paramView);
  }
  
  public static void h(View paramView, float paramFloat)
  {
    a.h(paramView, paramFloat);
  }
  
  public static ViewParent i(View paramView)
  {
    return a.i(paramView);
  }
  
  public static void i(View paramView, float paramFloat)
  {
    a.i(paramView, paramFloat);
  }
  
  public static int j(View paramView)
  {
    return a.j(paramView);
  }
  
  public static void j(View paramView, float paramFloat)
  {
    a.j(paramView, paramFloat);
  }
  
  public static int k(View paramView)
  {
    return a.k(paramView);
  }
  
  public static int l(View paramView)
  {
    return a.l(paramView);
  }
  
  public static int m(View paramView)
  {
    return a.m(paramView);
  }
  
  public static int n(View paramView)
  {
    return a.n(paramView);
  }
  
  public static float o(View paramView)
  {
    return a.p(paramView);
  }
  
  public static float p(View paramView)
  {
    return a.q(paramView);
  }
  
  public static int q(View paramView)
  {
    return a.s(paramView);
  }
  
  public static int r(View paramView)
  {
    return a.t(paramView);
  }
  
  public static en s(View paramView)
  {
    return a.u(paramView);
  }
  
  public static float t(View paramView)
  {
    return a.r(paramView);
  }
  
  public static float u(View paramView)
  {
    return a.x(paramView);
  }
  
  public static int v(View paramView)
  {
    return a.v(paramView);
  }
  
  public static void w(View paramView)
  {
    a.w(paramView);
  }
  
  public static boolean x(View paramView)
  {
    return a.z(paramView);
  }
  
  public static void y(View paramView)
  {
    a.A(paramView);
  }
  
  public static boolean z(View paramView)
  {
    return a.o(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */