package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

public abstract class em
{
  @Deprecated
  public void a(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  
  public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, fa paramfa)
  {
    a(paramCanvas, paramRecyclerView);
  }
  
  @Deprecated
  public void a(Rect paramRect, int paramInt, RecyclerView paramRecyclerView)
  {
    paramRect.set(0, 0, 0, 0);
  }
  
  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, fa paramfa)
  {
    a(paramRect, ((ep)paramView.getLayoutParams()).e(), paramRecyclerView);
  }
  
  @Deprecated
  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  
  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, fa paramfa)
  {
    b(paramCanvas, paramRecyclerView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */