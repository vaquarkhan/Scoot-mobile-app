package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ep
  extends ViewGroup.MarginLayoutParams
{
  fd a;
  final Rect b = new Rect();
  boolean c = true;
  boolean d = false;
  
  public ep(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public ep(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ep(ep paramep)
  {
    super(paramep);
  }
  
  public ep(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public ep(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public boolean c()
  {
    return this.a.q();
  }
  
  public boolean d()
  {
    return this.a.x();
  }
  
  public int e()
  {
    return this.a.d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */