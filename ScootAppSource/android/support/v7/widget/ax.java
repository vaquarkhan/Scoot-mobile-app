package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v4.b.c;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class ax
{
  private final ImageView a;
  private final aq b;
  
  public ax(ImageView paramImageView, aq paramaq)
  {
    this.a = paramImageView;
    this.b = paramaq;
  }
  
  public void a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.b != null) {}
      for (Drawable localDrawable = this.b.a(this.a.getContext(), paramInt);; localDrawable = c.a(this.a.getContext(), paramInt))
      {
        if (localDrawable != null) {
          cq.b(localDrawable);
        }
        this.a.setImageDrawable(localDrawable);
        return;
      }
    }
    this.a.setImageDrawable(null);
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = gm.a(this.a.getContext(), paramAttributeSet, R.styleable.AppCompatImageView, paramInt, 0);
    try
    {
      Drawable localDrawable = paramAttributeSet.b(R.styleable.AppCompatImageView_android_src);
      if (localDrawable != null) {
        this.a.setImageDrawable(localDrawable);
      }
      paramInt = paramAttributeSet.g(R.styleable.AppCompatImageView_srcCompat, -1);
      if (paramInt != -1)
      {
        localDrawable = this.b.a(this.a.getContext(), paramInt);
        if (localDrawable != null) {
          this.a.setImageDrawable(localDrawable);
        }
      }
      localDrawable = this.a.getDrawable();
      if (localDrawable != null) {
        cq.b(localDrawable);
      }
      return;
    }
    finally
    {
      paramAttributeSet.a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */