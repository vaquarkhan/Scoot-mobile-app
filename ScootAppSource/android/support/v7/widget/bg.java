package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class bg
  extends bc
{
  private static final int[] b = { 16843074 };
  private final SeekBar c;
  
  bg(SeekBar paramSeekBar, aq paramaq)
  {
    super(paramSeekBar, paramaq);
    this.c = paramSeekBar;
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    paramAttributeSet = gm.a(this.c.getContext(), paramAttributeSet, b, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.b(0);
    if (localDrawable != null) {
      this.c.setThumb(localDrawable);
    }
    paramAttributeSet.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */