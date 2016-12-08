package android.support.v7.a;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.aq;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class be
  extends ContentFrameLayout
{
  public be(at paramat, Context paramContext)
  {
    super(paramContext);
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 < -5) || (paramInt2 < -5) || (paramInt1 > getWidth() + 5) || (paramInt2 > getHeight() + 5);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (this.a.a(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (a((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
    {
      at.d(this.a, 0);
      return true;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundResource(int paramInt)
  {
    setBackgroundDrawable(aq.a().a(getContext(), paramInt));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */