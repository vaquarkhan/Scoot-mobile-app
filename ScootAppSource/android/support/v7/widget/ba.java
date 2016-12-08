package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.bd;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

public final class ba
  extends PopupWindow
{
  private static final boolean a;
  private boolean b;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public ba(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = gm.a(paramContext, paramAttributeSet, R.styleable.PopupWindow, paramInt, 0);
    if (paramContext.f(R.styleable.PopupWindow_overlapAnchor)) {
      a(paramContext.a(R.styleable.PopupWindow_overlapAnchor, false));
    }
    setBackgroundDrawable(paramContext.a(R.styleable.PopupWindow_android_popupBackground));
    paramContext.a();
    if (Build.VERSION.SDK_INT < 14) {
      a(this);
    }
  }
  
  private static void a(PopupWindow paramPopupWindow)
  {
    try
    {
      Field localField1 = PopupWindow.class.getDeclaredField("mAnchor");
      localField1.setAccessible(true);
      Field localField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
      localField2.setAccessible(true);
      localField2.set(paramPopupWindow, new bb(localField1, paramPopupWindow, (ViewTreeObserver.OnScrollChangedListener)localField2.get(paramPopupWindow)));
      return;
    }
    catch (Exception paramPopupWindow)
    {
      Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", paramPopupWindow);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (a)
    {
      this.b = paramBoolean;
      return;
    }
    bd.a(this, paramBoolean);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  @TargetApi(19)
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((a) && (this.b)) {
      paramInt2 -= paramView.getHeight();
    }
    for (;;)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */