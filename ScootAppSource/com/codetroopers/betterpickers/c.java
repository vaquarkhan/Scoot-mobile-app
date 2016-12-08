package com.codetroopers.betterpickers;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import com.d.a.ai;
import com.d.a.o;
import com.d.a.s;
import com.d.c.a.a;

public final class c
{
  public static int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Invalid Month");
    case 0: 
    case 2: 
    case 4: 
    case 6: 
    case 7: 
    case 9: 
    case 11: 
      return 31;
    case 3: 
    case 5: 
    case 8: 
    case 10: 
      return 30;
    }
    if (((paramInt2 % 4 == 0) && (paramInt2 % 100 != 0)) || (paramInt2 % 400 == 0)) {
      return 29;
    }
    return 28;
  }
  
  public static s a(View paramView, float paramFloat1, float paramFloat2)
  {
    Object localObject1 = o.a(0.0F, 1.0F);
    Object localObject2 = o.a(0.275F, paramFloat1);
    o localo1 = o.a(0.69F, paramFloat2);
    o localo2 = o.a(1.0F, 1.0F);
    ai localai = ai.a("scaleX", new o[] { localObject1, localObject2, localo1, localo2 });
    localObject2 = ai.a("scaleY", new o[] { localObject1, localObject2, localo1, localo2 });
    localObject1 = paramView;
    if (a.a) {
      localObject1 = a.a(paramView);
    }
    paramView = s.a(localObject1, new ai[] { localai, localObject2 });
    paramView.a(544L);
    return paramView;
  }
  
  @SuppressLint({"NewApi"})
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if ((a()) && (paramView != null) && (paramCharSequence != null)) {
      paramView.announceForAccessibility(paramCharSequence);
    }
  }
  
  public static boolean a()
  {
    return Build.VERSION.SDK_INT >= 16;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */