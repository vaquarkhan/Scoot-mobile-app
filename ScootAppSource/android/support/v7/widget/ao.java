package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class ao
  extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private aq b;
  private bo c = bo.a(this);
  
  public ao(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public ao(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(gj.a(paramContext), paramAttributeSet, paramInt);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
    this.b = aq.a();
    paramContext = gm.a(getContext(), paramAttributeSet, a, paramInt, 0);
    setCheckMarkDrawable(paramContext.a(0));
    paramContext.a();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    if (this.b != null)
    {
      setCheckMarkDrawable(this.b.a(getContext(), paramInt));
      return;
    }
    super.setCheckMarkDrawable(paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.c != null) {
      this.c.a(paramContext, paramInt);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */