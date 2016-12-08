package jp.wasabeef.recyclerview.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.widget.ed;
import android.view.View;

public final class b
  extends a
{
  private final float a;
  
  public b(ed paramed)
  {
    this(paramed, 0.5F);
  }
  
  public b(ed paramed, float paramFloat)
  {
    super(paramed);
    this.a = paramFloat;
  }
  
  protected Animator[] a(View paramView)
  {
    return new ObjectAnimator[] { ObjectAnimator.ofFloat(paramView, "scaleX", new float[] { this.a, 1.0F }), ObjectAnimator.ofFloat(paramView, "scaleY", new float[] { this.a, 1.0F }) };
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\jp\wasabeef\recyclerview\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */