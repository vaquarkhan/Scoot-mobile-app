package android.support.v7.widget;

import android.view.View;

final class df
  implements Runnable
{
  df(dd paramdd) {}
  
  public void run()
  {
    View localView = this.a.e();
    if ((localView != null) && (localView.getWindowToken() != null)) {
      this.a.c();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */