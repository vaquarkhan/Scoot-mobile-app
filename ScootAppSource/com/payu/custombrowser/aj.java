package com.payu.custombrowser;

import android.os.Handler;

final class aj
  implements Runnable
{
  aj(DotsProgressBar paramDotsProgressBar) {}
  
  public void run()
  {
    DotsProgressBar.a(this.a, DotsProgressBar.a(this.a) + DotsProgressBar.b(this.a));
    if (DotsProgressBar.a(this.a) < 0)
    {
      DotsProgressBar.a(this.a, 1);
      DotsProgressBar.b(this.a, 1);
    }
    for (;;)
    {
      this.a.invalidate();
      DotsProgressBar.e(this.a).postDelayed(DotsProgressBar.d(this.a), 400L);
      return;
      if (DotsProgressBar.a(this.a) > DotsProgressBar.c(this.a) - 1)
      {
        DotsProgressBar.a(this.a, 0);
        DotsProgressBar.b(this.a, 1);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */