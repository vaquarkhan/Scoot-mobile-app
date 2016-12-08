package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

final class fa
{
  public static void a(View paramView, fe paramfe)
  {
    if (paramfe != null)
    {
      paramView.animate().setListener(new fb(paramfe, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */