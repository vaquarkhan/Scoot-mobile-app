package android.support.v4.view;

import android.support.v4.view.a.l;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class ch
  extends cf
{
  static Field b;
  static boolean c = false;
  
  public void a(View paramView, l paraml)
  {
    ct.b(paramView, paraml.a());
  }
  
  public void a(View paramView, a parama)
  {
    if (parama == null) {}
    for (parama = null;; parama = parama.a())
    {
      ct.a(paramView, parama);
      return;
    }
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ct.a(paramView, paramAccessibilityEvent);
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    ct.a(paramView, paramBoolean);
  }
  
  public boolean a(View paramView, int paramInt)
  {
    return ct.a(paramView, paramInt);
  }
  
  /* Error */
  public boolean b(View paramView)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: getstatic 12	android/support/v4/view/ch:c	Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: getstatic 48	android/support/v4/view/ch:b	Ljava/lang/reflect/Field;
    //   13: ifnonnull +20 -> 33
    //   16: ldc 50
    //   18: ldc 52
    //   20: invokevirtual 58	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   23: putstatic 48	android/support/v4/view/ch:b	Ljava/lang/reflect/Field;
    //   26: getstatic 48	android/support/v4/view/ch:b	Ljava/lang/reflect/Field;
    //   29: iconst_1
    //   30: invokevirtual 64	java/lang/reflect/Field:setAccessible	(Z)V
    //   33: getstatic 48	android/support/v4/view/ch:b	Ljava/lang/reflect/Field;
    //   36: aload_1
    //   37: invokevirtual 68	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   40: astore_1
    //   41: aload_1
    //   42: ifnull +12 -> 54
    //   45: iload_2
    //   46: ireturn
    //   47: astore_1
    //   48: iconst_1
    //   49: putstatic 12	android/support/v4/view/ch:c	Z
    //   52: iconst_0
    //   53: ireturn
    //   54: iconst_0
    //   55: istore_2
    //   56: goto -11 -> 45
    //   59: astore_1
    //   60: iconst_1
    //   61: putstatic 12	android/support/v4/view/ch:c	Z
    //   64: iconst_0
    //   65: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	ch
    //   0	66	1	paramView	View
    //   1	55	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	33	47	java/lang/Throwable
    //   33	41	59	java/lang/Throwable
  }
  
  public boolean b(View paramView, int paramInt)
  {
    return ct.b(paramView, paramInt);
  }
  
  public en u(View paramView)
  {
    if (this.a == null) {
      this.a = new WeakHashMap();
    }
    en localen2 = (en)this.a.get(paramView);
    en localen1 = localen2;
    if (localen2 == null)
    {
      localen1 = new en(paramView);
      this.a.put(paramView, localen1);
    }
    return localen1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */