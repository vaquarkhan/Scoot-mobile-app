package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class l
{
  private static final q a = new v();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 22)
    {
      a = new o();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new n();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new u();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new t();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new s();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new r();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new p();
      return;
    }
  }
  
  public l(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public static l a(l paraml)
  {
    return a(a.a(paraml.b));
  }
  
  public static l a(View paramView)
  {
    return a(a.a(paramView));
  }
  
  static l a(Object paramObject)
  {
    if (paramObject != null) {
      return new l(paramObject);
    }
    return null;
  }
  
  public static l b()
  {
    return a(a.a());
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "ACTION_UNKNOWN";
    case 1: 
      return "ACTION_FOCUS";
    case 2: 
      return "ACTION_CLEAR_FOCUS";
    case 4: 
      return "ACTION_SELECT";
    case 8: 
      return "ACTION_CLEAR_SELECTION";
    case 16: 
      return "ACTION_CLICK";
    case 32: 
      return "ACTION_LONG_CLICK";
    case 64: 
      return "ACTION_ACCESSIBILITY_FOCUS";
    case 128: 
      return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
    case 256: 
      return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
    case 512: 
      return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
    case 1024: 
      return "ACTION_NEXT_HTML_ELEMENT";
    case 2048: 
      return "ACTION_PREVIOUS_HTML_ELEMENT";
    case 4096: 
      return "ACTION_SCROLL_FORWARD";
    case 8192: 
      return "ACTION_SCROLL_BACKWARD";
    case 65536: 
      return "ACTION_CUT";
    case 16384: 
      return "ACTION_COPY";
    case 32768: 
      return "ACTION_PASTE";
    }
    return "ACTION_SET_SELECTION";
  }
  
  public Object a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public void a(Rect paramRect)
  {
    a.a(this.b, paramRect);
  }
  
  public void a(View paramView, int paramInt)
  {
    a.a(this.b, paramView, paramInt);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    a.d(this.b, paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    a.c(this.b, paramBoolean);
  }
  
  public boolean a(m paramm)
  {
    return a.a(this.b, m.a(paramm));
  }
  
  public void b(Rect paramRect)
  {
    a.c(this.b, paramRect);
  }
  
  public void b(View paramView)
  {
    a.c(this.b, paramView);
  }
  
  public void b(View paramView, int paramInt)
  {
    a.b(this.b, paramView, paramInt);
  }
  
  public void b(CharSequence paramCharSequence)
  {
    a.b(this.b, paramCharSequence);
  }
  
  public void b(Object paramObject)
  {
    a.b(this.b, ((w)paramObject).a);
  }
  
  public void b(boolean paramBoolean)
  {
    a.d(this.b, paramBoolean);
  }
  
  public int c()
  {
    return a.b(this.b);
  }
  
  public void c(Rect paramRect)
  {
    a.b(this.b, paramRect);
  }
  
  public void c(View paramView)
  {
    a.a(this.b, paramView);
  }
  
  public void c(CharSequence paramCharSequence)
  {
    a.e(this.b, paramCharSequence);
  }
  
  public void c(Object paramObject)
  {
    a.c(this.b, x.a((x)paramObject));
  }
  
  public void c(boolean paramBoolean)
  {
    a.h(this.b, paramBoolean);
  }
  
  public void d(Rect paramRect)
  {
    a.d(this.b, paramRect);
  }
  
  public void d(View paramView)
  {
    a.b(this.b, paramView);
  }
  
  public void d(CharSequence paramCharSequence)
  {
    a.c(this.b, paramCharSequence);
  }
  
  public void d(boolean paramBoolean)
  {
    a.i(this.b, paramBoolean);
  }
  
  public boolean d()
  {
    return a.g(this.b);
  }
  
  public void e(View paramView)
  {
    a.d(this.b, paramView);
  }
  
  public void e(CharSequence paramCharSequence)
  {
    a.a(this.b, paramCharSequence);
  }
  
  public void e(boolean paramBoolean)
  {
    a.g(this.b, paramBoolean);
  }
  
  public boolean e()
  {
    return a.h(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (l)paramObject;
        if (this.b != null) {
          break;
        }
      } while (((l)paramObject).b == null);
      return false;
    } while (this.b.equals(((l)paramObject).b));
    return false;
  }
  
  public void f(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }
  
  public boolean f()
  {
    return a.k(this.b);
  }
  
  public void g(boolean paramBoolean)
  {
    a.e(this.b, paramBoolean);
  }
  
  public boolean g()
  {
    return a.l(this.b);
  }
  
  public void h(boolean paramBoolean)
  {
    a.b(this.b, paramBoolean);
  }
  
  public boolean h()
  {
    return a.r(this.b);
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
  
  public void i(boolean paramBoolean)
  {
    a.f(this.b, paramBoolean);
  }
  
  public boolean i()
  {
    return a.s(this.b);
  }
  
  public void j(boolean paramBoolean)
  {
    a.j(this.b, paramBoolean);
  }
  
  public boolean j()
  {
    return a.p(this.b);
  }
  
  public boolean k()
  {
    return a.i(this.b);
  }
  
  public boolean l()
  {
    return a.m(this.b);
  }
  
  public boolean m()
  {
    return a.j(this.b);
  }
  
  public boolean n()
  {
    return a.n(this.b);
  }
  
  public boolean o()
  {
    return a.o(this.b);
  }
  
  public CharSequence p()
  {
    return a.e(this.b);
  }
  
  public CharSequence q()
  {
    return a.c(this.b);
  }
  
  public CharSequence r()
  {
    return a.f(this.b);
  }
  
  public CharSequence s()
  {
    return a.d(this.b);
  }
  
  public void t()
  {
    a.q(this.b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Rect localRect = new Rect();
    a(localRect);
    localStringBuilder.append("; boundsInParent: " + localRect);
    c(localRect);
    localStringBuilder.append("; boundsInScreen: " + localRect);
    localStringBuilder.append("; packageName: ").append(p());
    localStringBuilder.append("; className: ").append(q());
    localStringBuilder.append("; text: ").append(r());
    localStringBuilder.append("; contentDescription: ").append(s());
    localStringBuilder.append("; viewId: ").append(u());
    localStringBuilder.append("; checkable: ").append(d());
    localStringBuilder.append("; checked: ").append(e());
    localStringBuilder.append("; focusable: ").append(f());
    localStringBuilder.append("; focused: ").append(g());
    localStringBuilder.append("; selected: ").append(j());
    localStringBuilder.append("; clickable: ").append(k());
    localStringBuilder.append("; longClickable: ").append(l());
    localStringBuilder.append("; enabled: ").append(m());
    localStringBuilder.append("; password: ").append(n());
    localStringBuilder.append("; scrollable: " + o());
    localStringBuilder.append("; [");
    int i = c();
    while (i != 0)
    {
      int k = 1 << Integer.numberOfTrailingZeros(i);
      int j = i & (k ^ 0xFFFFFFFF);
      localStringBuilder.append(b(k));
      i = j;
      if (j != 0)
      {
        localStringBuilder.append(", ");
        i = j;
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public String u()
  {
    return a.t(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */