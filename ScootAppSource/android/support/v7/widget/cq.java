package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.q;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class cq
{
  public static final Rect a = new Rect();
  private static Class<?> b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      b = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
  }
  
  static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    }
    do
    {
      return paramMode;
      return PorterDuff.Mode.SRC_OVER;
      return PorterDuff.Mode.SRC_IN;
      return PorterDuff.Mode.SRC_ATOP;
      return PorterDuff.Mode.MULTIPLY;
      return PorterDuff.Mode.SCREEN;
    } while (Build.VERSION.SDK_INT < 11);
    return PorterDuff.Mode.valueOf("ADD");
  }
  
  public static Rect a(Drawable paramDrawable)
  {
    if (b != null) {}
    for (;;)
    {
      Object localObject;
      Rect localRect;
      int j;
      int i;
      try
      {
        paramDrawable = android.support.v4.c.a.a.g(paramDrawable);
        localObject = paramDrawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(paramDrawable, new Object[0]);
        if (localObject == null) {
          break label215;
        }
        localRect = new Rect();
        Field[] arrayOfField = b.getFields();
        int k = arrayOfField.length;
        j = 0;
        paramDrawable = localRect;
        if (j >= k) {
          break label219;
        }
        paramDrawable = arrayOfField[j];
        str = paramDrawable.getName();
        i = -1;
        switch (str.hashCode())
        {
        case 3317767: 
          if (!str.equals("left")) {
            break label263;
          }
          i = 0;
        }
      }
      catch (Exception paramDrawable)
      {
        String str;
        Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
      }
      if (str.equals("top"))
      {
        i = 1;
        break label263;
        if (str.equals("right"))
        {
          i = 2;
          break label263;
          if (str.equals("bottom"))
          {
            i = 3;
            break label263;
            localRect.left = paramDrawable.getInt(localObject);
            break label296;
            label215:
            paramDrawable = a;
            label219:
            return paramDrawable;
            localRect.top = paramDrawable.getInt(localObject);
            break label296;
            localRect.right = paramDrawable.getInt(localObject);
            break label296;
            localRect.bottom = paramDrawable.getInt(localObject);
            break label296;
          }
        }
      }
      label263:
      switch (i)
      {
      }
      label296:
      j += 1;
    }
  }
  
  static void b(Drawable paramDrawable)
  {
    if ((Build.VERSION.SDK_INT == 21) && ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))) {
      d(paramDrawable);
    }
  }
  
  public static boolean c(Drawable paramDrawable)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramDrawable instanceof LayerDrawable)) {
      if (Build.VERSION.SDK_INT >= 16) {
        bool1 = true;
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                return bool1;
                bool1 = false;
              }
              if (!(paramDrawable instanceof InsetDrawable)) {
                break;
              }
              bool1 = bool2;
            } while (Build.VERSION.SDK_INT >= 14);
            return false;
            if (!(paramDrawable instanceof StateListDrawable)) {
              break;
            }
            bool1 = bool2;
          } while (Build.VERSION.SDK_INT >= 8);
          return false;
          if (!(paramDrawable instanceof GradientDrawable)) {
            break;
          }
          bool1 = bool2;
        } while (Build.VERSION.SDK_INT >= 14);
        return false;
        if (!(paramDrawable instanceof DrawableContainer)) {
          break;
        }
        paramDrawable = paramDrawable.getConstantState();
        bool1 = bool2;
      } while (!(paramDrawable instanceof DrawableContainer.DrawableContainerState));
      paramDrawable = ((DrawableContainer.DrawableContainerState)paramDrawable).getChildren();
      int j = paramDrawable.length;
      int i = 0;
      for (;;)
      {
        bool1 = bool2;
        if (i >= j) {
          break;
        }
        if (!c(paramDrawable[i])) {
          return false;
        }
        i += 1;
      }
      if ((paramDrawable instanceof q)) {
        return c(((q)paramDrawable).a());
      }
      if ((paramDrawable instanceof android.support.v7.b.a.a)) {
        return c(((android.support.v7.b.a.a)paramDrawable).b());
      }
      bool1 = bool2;
    } while (!(paramDrawable instanceof ScaleDrawable));
    return c(((ScaleDrawable)paramDrawable).getDrawable());
  }
  
  private static void d(Drawable paramDrawable)
  {
    int[] arrayOfInt = paramDrawable.getState();
    if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
      paramDrawable.setState(gh.e);
    }
    for (;;)
    {
      paramDrawable.setState(arrayOfInt);
      return;
      paramDrawable.setState(gh.h);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */