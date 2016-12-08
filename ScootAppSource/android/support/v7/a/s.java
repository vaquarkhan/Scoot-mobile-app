package android.support.v7.a;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class s
  implements View.OnClickListener
{
  s(r paramr) {}
  
  public void onClick(View paramView)
  {
    if ((paramView == r.a(this.a)) && (r.b(this.a) != null)) {
      paramView = Message.obtain(r.b(this.a));
    }
    for (;;)
    {
      if (paramView != null) {
        paramView.sendToTarget();
      }
      r.h(this.a).obtainMessage(1, r.g(this.a)).sendToTarget();
      return;
      if ((paramView == r.c(this.a)) && (r.d(this.a) != null)) {
        paramView = Message.obtain(r.d(this.a));
      } else if ((paramView == r.e(this.a)) && (r.f(this.a) != null)) {
        paramView = Message.obtain(r.f(this.a));
      } else {
        paramView = null;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */