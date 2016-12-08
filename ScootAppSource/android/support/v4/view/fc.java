package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

final class fc
{
  public static void a(View paramView, fg paramfg)
  {
    fd localfd = null;
    if (paramfg != null) {
      localfd = new fd(paramfg, paramView);
    }
    paramView.animate().setUpdateListener(localfd);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */