package com.digits.sdk.android;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import java.lang.reflect.Field;

final class dz
{
  static int a(double paramDouble, int paramInt1, int paramInt2)
  {
    int k = Color.red(paramInt2);
    int m = Color.red(paramInt1);
    int i = Color.green(paramInt2);
    int j = Color.green(paramInt1);
    paramInt2 = Color.blue(paramInt2);
    paramInt1 = Color.blue(paramInt1);
    double d = k;
    k = (int)(m * paramDouble + (1.0D - paramDouble) * d);
    d = i;
    return Color.rgb(k, (int)(j * paramDouble + (1.0D - paramDouble) * d), (int)((1.0D - paramDouble) * paramInt2 + paramInt1 * paramDouble));
  }
  
  @TargetApi(21)
  static int a(Resources paramResources, Resources.Theme paramTheme)
  {
    Object localObject = a(paramTheme, R.attr.dgts__accentColor);
    if (localObject != null) {
      return ((TypedValue)localObject).data;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = a(paramTheme, 16843829);
      if (localObject != null) {
        return ((TypedValue)localObject).data;
      }
    }
    try
    {
      localObject = R.attr.class.getDeclaredField("colorAccent");
      paramTheme = a(paramTheme, ((Field)localObject).getInt(((Field)localObject).getType()));
      if (paramTheme != null)
      {
        int i = paramTheme.data;
        return i;
      }
    }
    catch (Exception paramTheme) {}
    return paramResources.getColor(R.color.dgts__default_accent);
  }
  
  static Drawable a(Resources.Theme paramTheme)
  {
    TypedValue localTypedValue = new TypedValue();
    int i = R.attr.dgts__logoDrawable;
    return paramTheme.obtainStyledAttributes(localTypedValue.data, new int[] { i }).getDrawable(0);
  }
  
  static TypedValue a(Resources.Theme paramTheme, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    paramTheme.resolveAttribute(paramInt, localTypedValue, true);
    if ((localTypedValue.type >= 28) && (localTypedValue.type <= 31)) {
      return localTypedValue;
    }
    return null;
  }
  
  static boolean a(int paramInt)
  {
    int i = Color.red(paramInt);
    int j = Color.green(paramInt);
    paramInt = Color.blue(paramInt);
    double d = i;
    return j * 0.72D + 0.21D * d + paramInt * 0.07D > 170.0D;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */