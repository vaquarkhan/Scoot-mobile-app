package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class gr
  extends b
{
  int b = 0;
  
  public gr(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }
  
  public gr(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public gr(b paramb)
  {
    super(paramb);
  }
  
  public gr(gr paramgr)
  {
    super(paramgr);
    this.b = paramgr.b;
  }
  
  public gr(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public gr(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    a(paramMarginLayoutParams);
  }
  
  void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    this.leftMargin = paramMarginLayoutParams.leftMargin;
    this.topMargin = paramMarginLayoutParams.topMargin;
    this.rightMargin = paramMarginLayoutParams.rightMargin;
    this.bottomMargin = paramMarginLayoutParams.bottomMargin;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */