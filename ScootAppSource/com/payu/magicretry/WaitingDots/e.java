package com.payu.magicretry.WaitingDots;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;

public final class e
  extends ReplacementSpan
{
  private float a = 0.0F;
  private float b = 0.0F;
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    paramCanvas.drawText(paramCharSequence, paramInt1, paramInt2, paramFloat + this.a, paramInt4 + this.b, paramPaint);
  }
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    return (int)paramPaint.measureText(paramCharSequence, paramInt1, paramInt2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\WaitingDots\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */