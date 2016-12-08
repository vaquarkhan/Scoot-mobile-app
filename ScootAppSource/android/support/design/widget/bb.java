package android.support.design.widget;

import android.os.Handler;

final class bb
  implements bp
{
  bb(Snackbar paramSnackbar) {}
  
  public void a()
  {
    Snackbar.d().sendMessage(Snackbar.d().obtainMessage(0, this.a));
  }
  
  public void a(int paramInt)
  {
    Snackbar.d().sendMessage(Snackbar.d().obtainMessage(1, paramInt, 0, this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */