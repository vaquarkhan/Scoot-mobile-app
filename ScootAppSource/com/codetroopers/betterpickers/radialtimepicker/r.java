package com.codetroopers.betterpickers.radialtimepicker;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class r
  implements View.OnKeyListener
{
  private r(l paraml) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    return (paramKeyEvent.getAction() == 1) && (l.b(this.a, paramInt));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */