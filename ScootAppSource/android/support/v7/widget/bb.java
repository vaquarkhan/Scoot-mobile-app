package android.support.v7.widget;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class bb
  implements ViewTreeObserver.OnScrollChangedListener
{
  bb(Field paramField, PopupWindow paramPopupWindow, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener) {}
  
  public void onScrollChanged()
  {
    try
    {
      WeakReference localWeakReference = (WeakReference)this.a.get(this.b);
      if (localWeakReference != null)
      {
        if (localWeakReference.get() == null) {
          return;
        }
        this.c.onScrollChanged();
        return;
      }
    }
    catch (IllegalAccessException localIllegalAccessException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */