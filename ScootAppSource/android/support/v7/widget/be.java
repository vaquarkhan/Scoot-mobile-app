package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.cb;
import android.support.v7.appcompat.R.attr;
import android.util.AttributeSet;
import android.widget.RatingBar;

public final class be
  extends RatingBar
{
  private bc a = new bc(this, this.b);
  private aq b = aq.a();
  
  public be(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.ratingBarStyle);
  }
  
  public be(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap localBitmap = this.a.a();
      if (localBitmap != null) {
        setMeasuredDimension(cb.a(localBitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
      return;
    }
    finally {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */