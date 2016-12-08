package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.cardview.R.color;
import android.support.v7.cardview.R.style;
import android.support.v7.cardview.R.styleable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
{
  private static final int[] a = { 16842801 };
  private static final bv b;
  private boolean c;
  private boolean d;
  private int e;
  private int f;
  private final Rect g = new Rect();
  private final Rect h = new Rect();
  private final bs i = new bq(this);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      b = new br();
    }
    for (;;)
    {
      b.a();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        b = new bw();
      } else {
        b = new bt();
      }
    }
  }
  
  public CardView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CardView, paramInt, R.style.CardView);
    if (paramAttributeSet.hasValue(R.styleable.CardView_cardBackgroundColor))
    {
      paramInt = paramAttributeSet.getColor(R.styleable.CardView_cardBackgroundColor, 0);
      float f4 = paramAttributeSet.getDimension(R.styleable.CardView_cardCornerRadius, 0.0F);
      float f2 = paramAttributeSet.getDimension(R.styleable.CardView_cardElevation, 0.0F);
      float f3 = paramAttributeSet.getDimension(R.styleable.CardView_cardMaxElevation, 0.0F);
      this.c = paramAttributeSet.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
      this.d = paramAttributeSet.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
      int j = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
      this.g.left = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, j);
      this.g.top = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, j);
      this.g.right = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, j);
      this.g.bottom = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, j);
      float f1 = f3;
      if (f2 > f3) {
        f1 = f2;
      }
      this.e = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
      this.f = paramAttributeSet.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
      paramAttributeSet.recycle();
      b.a(this.i, paramContext, paramInt, f4, f2, f1);
      return;
    }
    Object localObject = getContext().obtainStyledAttributes(a);
    paramInt = ((TypedArray)localObject).getColor(0, 0);
    ((TypedArray)localObject).recycle();
    localObject = new float[3];
    Color.colorToHSV(paramInt, (float[])localObject);
    if (localObject[2] > 0.5F) {}
    for (paramInt = getResources().getColor(R.color.cardview_light_background);; paramInt = getResources().getColor(R.color.cardview_dark_background)) {
      break;
    }
  }
  
  public float getCardElevation()
  {
    return b.e(this.i);
  }
  
  public int getContentPaddingBottom()
  {
    return this.g.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.g.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.g.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.g.top;
  }
  
  public float getMaxCardElevation()
  {
    return b.a(this.i);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.d;
  }
  
  public float getRadius()
  {
    return b.d(this.i);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(b instanceof br))
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      switch (j)
      {
      default: 
        j = View.MeasureSpec.getMode(paramInt2);
        switch (j)
        {
        }
        break;
      }
      for (;;)
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(b.b(this.i)), View.MeasureSpec.getSize(paramInt1)), j);
        break;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(b.c(this.i)), View.MeasureSpec.getSize(paramInt2)), j);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    b.a(this.i, paramInt);
  }
  
  public void setCardElevation(float paramFloat)
  {
    b.c(this.i, paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    b.b(this.i, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.f = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.e = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean != this.d)
    {
      this.d = paramBoolean;
      b.h(this.i);
    }
  }
  
  public void setRadius(float paramFloat)
  {
    b.a(this.i, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.c != paramBoolean)
    {
      this.c = paramBoolean;
      b.g(this.i);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */