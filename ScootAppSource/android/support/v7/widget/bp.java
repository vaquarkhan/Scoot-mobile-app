package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

final class bp
  extends bo
{
  private static final int[] b = { 16843666, 16843667 };
  private gk c;
  private gk d;
  
  bp(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  void a()
  {
    super.a();
    if ((this.c != null) || (this.d != null))
    {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.c);
      a(arrayOfDrawable[2], this.d);
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    Context localContext = this.a.getContext();
    aq localaq = aq.a();
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    if (paramAttributeSet.hasValue(0)) {
      this.c = a(localContext, localaq, paramAttributeSet.getResourceId(0, 0));
    }
    if (paramAttributeSet.hasValue(1)) {
      this.d = a(localContext, localaq, paramAttributeSet.getResourceId(1, 0));
    }
    paramAttributeSet.recycle();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */