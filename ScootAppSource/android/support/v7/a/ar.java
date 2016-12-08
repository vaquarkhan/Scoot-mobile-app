package android.support.v7.a;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

final class ar
  extends ap
{
  private final UiModeManager r;
  
  ar(Context paramContext, Window paramWindow, ai paramai)
  {
    super(paramContext, paramWindow, paramai);
    this.r = ((UiModeManager)paramContext.getSystemService("uimode"));
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new as(this, paramCallback);
  }
  
  int d(int paramInt)
  {
    if ((paramInt == 0) && (this.r.getNightMode() == 0)) {
      return -1;
    }
    return super.d(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */