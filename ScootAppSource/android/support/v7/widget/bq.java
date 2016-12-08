package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

final class bq
  implements bs
{
  private Drawable b;
  
  bq(CardView paramCardView) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 > CardView.c(this.a)) {
      CardView.a(this.a, paramInt1);
    }
    if (paramInt2 > CardView.d(this.a)) {
      CardView.b(this.a, paramInt2);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    CardView.a(this.a).set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardView.a(this.a, CardView.b(this.a).left + paramInt1, CardView.b(this.a).top + paramInt2, CardView.b(this.a).right + paramInt3, CardView.b(this.a).bottom + paramInt4);
  }
  
  public void a(Drawable paramDrawable)
  {
    this.b = paramDrawable;
    this.a.setBackgroundDrawable(paramDrawable);
  }
  
  public boolean a()
  {
    return this.a.getUseCompatPadding();
  }
  
  public boolean b()
  {
    return this.a.getPreventCornerOverlap();
  }
  
  public Drawable c()
  {
    return this.b;
  }
  
  public View d()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */