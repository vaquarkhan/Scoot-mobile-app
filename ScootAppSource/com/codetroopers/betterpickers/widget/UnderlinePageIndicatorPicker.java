package com.codetroopers.betterpickers.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bf;
import android.support.v4.view.bt;
import android.support.v4.view.db;
import android.support.v4.view.ea;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.styleable;

public class UnderlinePageIndicatorPicker
  extends View
  implements a
{
  private int a;
  private final Paint b = new Paint(1);
  private ViewPager c;
  private ea d;
  private int e;
  private int f;
  private float g;
  private int h;
  private float i = -1.0F;
  private int j = -1;
  private boolean k;
  private b l = null;
  private Paint m;
  
  public UnderlinePageIndicatorPicker(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public UnderlinePageIndicatorPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public UnderlinePageIndicatorPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = getResources().getColor(R.color.dialog_text_color_holo_dark);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.BetterPickersDialogFragment, paramInt, 0);
    this.a = paramAttributeSet.getColor(R.styleable.BetterPickersDialogFragment_bpKeyboardIndicatorColor, this.a);
    this.m = new Paint();
    this.m.setAntiAlias(true);
    this.m.setStyle(Paint.Style.FILL);
    paramAttributeSet.recycle();
    this.h = db.a(ViewConfiguration.get(paramContext));
  }
  
  public void a(int paramInt)
  {
    if (this.e == 0)
    {
      this.f = paramInt;
      this.g = 0.0F;
      invalidate();
    }
    if (this.d != null) {
      this.d.a(paramInt);
    }
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramFloat;
    invalidate();
    if (this.d != null) {
      this.d.a(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
    if (this.d != null) {
      this.d.b(paramInt);
    }
  }
  
  public int getSelectedColor()
  {
    return this.b.getColor();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int n = this.c.getAdapter().b();
    if ((isInEditMode()) || (n == 0)) {}
    while (this.l == null) {
      return;
    }
    View localView = this.l.a(this.f);
    float f4 = localView.getLeft();
    float f3 = localView.getRight();
    float f2 = f4;
    float f1 = f3;
    if (this.g > 0.0F)
    {
      f2 = f4;
      f1 = f3;
      if (this.f < n - 1)
      {
        localView = this.l.a(this.f + 1);
        f2 = localView.getLeft();
        f1 = localView.getRight();
        float f5 = this.g;
        f2 = f4 * (1.0F - this.g) + f2 * f5;
        f1 = f1 * this.g + (1.0F - this.g) * f3;
      }
    }
    paramCanvas.drawRect(f2, getPaddingBottom(), f1, getHeight() - getPaddingBottom(), this.b);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (UnderlinePageIndicatorPicker.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.f = paramParcelable.a;
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    UnderlinePageIndicatorPicker.SavedState localSavedState = new UnderlinePageIndicatorPicker.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.f;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = 0;
    if (super.onTouchEvent(paramMotionEvent)) {}
    label316:
    do
    {
      do
      {
        float f1;
        float f2;
        do
        {
          do
          {
            do
            {
              return true;
              if ((this.c == null) || (this.c.getAdapter().b() == 0)) {
                return false;
              }
              i1 = paramMotionEvent.getAction() & 0xFF;
              switch (i1)
              {
              case 4: 
              default: 
                return true;
              case 0: 
                this.j = bf.b(paramMotionEvent, 0);
                this.i = paramMotionEvent.getX();
                return true;
              case 2: 
                f1 = bf.c(paramMotionEvent, bf.a(paramMotionEvent, this.j));
                f2 = f1 - this.i;
                if ((!this.k) && (Math.abs(f2) > this.h)) {
                  this.k = true;
                }
                break;
              }
            } while (!this.k);
            this.i = f1;
          } while ((!this.c.f()) && (!this.c.d()));
          this.c.b(f2);
          return true;
          if (this.k) {
            break label316;
          }
          n = this.c.getAdapter().b();
          int i2 = getWidth();
          f1 = i2 / 2.0F;
          f2 = i2 / 6.0F;
          if ((this.f <= 0) || (paramMotionEvent.getX() >= f1 - f2)) {
            break;
          }
        } while (i1 == 3);
        this.c.setCurrentItem(this.f - 1);
        return true;
        if ((this.f >= n - 1) || (paramMotionEvent.getX() <= f2 + f1)) {
          break;
        }
      } while (i1 == 3);
      this.c.setCurrentItem(this.f + 1);
      return true;
      this.k = false;
      this.j = -1;
    } while (!this.c.f());
    this.c.e();
    return true;
    n = bf.b(paramMotionEvent);
    this.i = bf.c(paramMotionEvent, n);
    this.j = bf.b(paramMotionEvent, n);
    return true;
    int i1 = bf.b(paramMotionEvent);
    if (bf.b(paramMotionEvent, i1) == this.j)
    {
      if (i1 == 0) {
        n = 1;
      }
      this.j = bf.b(paramMotionEvent, n);
    }
    this.i = bf.c(paramMotionEvent, bf.a(paramMotionEvent, this.j));
    return true;
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (this.c == null) {
      throw new IllegalStateException("ViewPager has not been bound.");
    }
    this.c.setCurrentItem(paramInt);
    this.f = paramInt;
    invalidate();
  }
  
  public void setOnPageChangeListener(ea paramea)
  {
    this.d = paramea;
  }
  
  public void setSelectedColor(int paramInt)
  {
    this.b.setColor(paramInt);
    invalidate();
  }
  
  public void setTitleView(b paramb)
  {
    this.l = paramb;
    invalidate();
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    if (this.c == paramViewPager) {
      return;
    }
    if (this.c != null) {
      this.c.setOnPageChangeListener(null);
    }
    if (paramViewPager.getAdapter() == null) {
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    this.c = paramViewPager;
    this.c.setOnPageChangeListener(this);
    invalidate();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\widget\UnderlinePageIndicatorPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */