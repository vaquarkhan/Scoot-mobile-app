package com.codetroopers.betterpickers.radialtimepicker;

import android.view.View;
import android.view.View.OnClickListener;

final class q
  implements View.OnClickListener
{
  q(l paraml) {}
  
  public void onClick(View paramView)
  {
    int i = 1;
    this.a.S();
    int j = l.d(this.a).getIsCurrentlyAmOrPm();
    if (j == 0) {}
    for (;;)
    {
      l.a(this.a, i);
      l.d(this.a).setAmOrPm(i);
      return;
      if (j == 1) {
        i = 0;
      } else {
        i = j;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */