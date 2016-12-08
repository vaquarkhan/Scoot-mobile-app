package android.support.v7.widget;

import android.content.Context;
import android.support.v7.appcompat.R.attr;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class bf
  extends SeekBar
{
  private bg a = new bg(this, this.b);
  private aq b = aq.a();
  
  public bf(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.seekBarStyle);
  }
  
  public bf(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */