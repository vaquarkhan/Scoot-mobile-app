package com.appsee;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import java.util.Iterator;
import java.util.List;

class rd
{
  private static final long F = 500L;
  private static final String G = "com.android.internal.view.IInputMethodManager$Stub$Proxy";
  private static final String H = "com.android.internal.view.IInputMethodSession$Stub$Proxy";
  private static final String b = "com.android.internal.view.IInputMethodManager";
  private static Class<?>[] c;
  private static final String d = "com.android.internal.view.IInputMethodSession";
  private static Class<?>[] e;
  private static final String h = "$Stub$Proxy";
  public static final long i = 1000L;
  private static rd j;
  private Object A;
  private InputMethodManager B;
  private DisplayMetrics D;
  private boolean E;
  private int M;
  private boolean f;
  private c g;
  private WindowManager k;
  private long l;
  private Rect m;
  
  public static rd C()
  {
    try
    {
      if (j == null) {
        j = new rd();
      }
      rd localrd = j;
      return localrd;
    }
    finally {}
  }
  
  public static String C(String paramString)
  {
    int n = paramString.length();
    char[] arrayOfChar = new char[n];
    int i1 = n - 1;
    for (n = i1; i1 >= 0; n = i1)
    {
      i1 = paramString.charAt(n);
      int i2 = n - 1;
      arrayOfChar[n] = ((char)(i1 ^ 0x25));
      if (i2 < 0) {
        break;
      }
      i1 = i2 - 1;
      arrayOfChar[i2] = ((char)(paramString.charAt(i2) ^ 0x58));
    }
    return new String(arrayOfChar);
  }
  
  public void C()
  {
    if ((!fc.C().C()) || (!ye.C().g()) || (!ye.C().K())) {}
    do
    {
      do
      {
        return;
        C(c, "com.android.internal.view.IInputMethodManager$Stub$Proxy", lb.C("SH[iHr]~"));
        C(e, "com.android.internal.view.IInputMethodSession$Stub$Proxy", qi.C("\003\027\033&#1\032<\0010"));
      } while (this.E);
      localObject1 = kb.C().C();
    } while ((localObject1 == null) || (((List)localObject1).isEmpty()));
    Object localObject1 = ((List)localObject1).iterator();
    long l1 = 0L;
    boolean bool2 = false;
    label319:
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (q)((Iterator)localObject1).next();
        if (((q)localObject2).C() == null) {
          break;
        }
        localObject2 = ((q)localObject2).C();
        if (localObject2 == null) {
          break;
        }
        this.k.getDefaultDisplay().getMetrics(this.D);
        ((View)localObject2).getWindowVisibleDisplayFrame(this.m);
        if (this.m.width() != this.D.widthPixels) {
          continue;
        }
        if (this.m.bottom != this.D.heightPixels) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          bool2 |= bool1;
          if (this.m.bottom == this.D.heightPixels) {
            break label319;
          }
          l1 = Math.abs(this.D.heightPixels - this.m.bottom);
          break;
        }
      }
      long l2 = wn.C();
      long l3 = this.l;
      if ((C() == bool2) || (l2 - l3 <= 500L)) {
        break;
      }
      C(bool2, String.format(lb.C("}tPo[uJ;V~W|Vo\036W}X;\033"), new Object[] { Long.valueOf(l1) }), true);
      return;
    }
  }
  
  public void C(c paramc)
  {
    this.g = paramc;
  }
  
  public void C(ml paramml)
  {
    if ((paramml == ml.M) || (paramml == ml.l)) {}
    for (boolean bool = true;; bool = false)
    {
      C(bool, true);
      return;
    }
  }
  
  public boolean C()
  {
    synchronized (this.A)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  public boolean H()
  {
    synchronized (this.A)
    {
      boolean bool = this.E;
      return bool;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\rd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */