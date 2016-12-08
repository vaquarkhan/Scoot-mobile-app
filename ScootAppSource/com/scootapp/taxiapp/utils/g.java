package com.scootapp.taxiapp.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

final class g
  extends LinearLayout
{
  private final int a;
  private final Paint b;
  private final int c;
  private final Paint d;
  private int e;
  private float f;
  private f g;
  private final i h;
  
  g(Context paramContext)
  {
    this(paramContext, null);
  }
  
  g(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setWillNotDraw(false);
    float f1 = getResources().getDisplayMetrics().density;
    paramAttributeSet = new TypedValue();
    paramContext.getTheme().resolveAttribute(16842800, paramAttributeSet, true);
    int i = a(paramAttributeSet.data, (byte)38);
    this.h = new i(null);
    this.h.a(new int[] { -13388315 });
    this.a = ((int)(0.0F * f1));
    this.b = new Paint();
    this.b.setColor(i);
    this.c = ((int)(f1 * 3.0F));
    this.d = new Paint();
  }
  
  private static int a(int paramInt, byte paramByte)
  {
    return Color.argb(paramByte, Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
  }
  
  private static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.red(paramInt1);
    float f3 = Color.red(paramInt2);
    float f4 = Color.green(paramInt1);
    float f5 = Color.green(paramInt2);
    float f6 = Color.blue(paramInt1);
    float f7 = Color.blue(paramInt2);
    return Color.rgb((int)(f2 * paramFloat + f3 * f1), (int)(f4 * paramFloat + f5 * f1), (int)(f1 * f7 + f6 * paramFloat));
  }
  
  void a(int paramInt, float paramFloat)
  {
    this.e = paramInt;
    this.f = paramFloat;
    invalidate();
  }
  
  void a(f paramf)
  {
    this.g = paramf;
    invalidate();
  }
  
  void a(int... paramVarArgs)
  {
    this.g = null;
    this.h.a(paramVarArgs);
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int n = getHeight();
    int i = getChildCount();
    Object localObject;
    int k;
    int m;
    int j;
    if (this.g != null)
    {
      localObject = this.g;
      if (i > 0)
      {
        View localView = getChildAt(this.e);
        k = localView.getLeft();
        m = localView.getRight();
        j = ((f)localObject).a(this.e);
        if ((this.f <= 0.0F) || (this.e >= getChildCount() - 1)) {
          break label279;
        }
        int i1 = ((f)localObject).a(this.e + 1);
        i = j;
        if (j != i1) {
          i = a(i1, j, this.f);
        }
        localObject = getChildAt(this.e + 1);
        float f1 = this.f;
        float f2 = ((View)localObject).getLeft();
        float f3 = this.f;
        k = (int)(k * (1.0F - f3) + f1 * f2);
        f1 = this.f;
        f2 = ((View)localObject).getRight();
        f3 = this.f;
        m = (int)(m * (1.0F - f3) + f2 * f1);
        j = i;
      }
    }
    for (;;)
    {
      this.d.setColor(j);
      paramCanvas.drawRect(k, n - this.c, m, n, this.d);
      paramCanvas.drawRect(0.0F, n - this.a, getWidth(), n, this.b);
      return;
      localObject = this.h;
      break;
      label279:
      i = m;
      m = i;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */