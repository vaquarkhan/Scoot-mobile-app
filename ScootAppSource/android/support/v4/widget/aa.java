package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class aa
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  private float b;
  private boolean c;
  private int d;
  
  public aa(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public aa(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.d());
    this.a = paramContext.getInt(0, 0);
    paramContext.recycle();
  }
  
  public aa(aa paramaa)
  {
    super(paramaa);
    this.a = paramaa.a;
  }
  
  public aa(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public aa(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */