package com.digits.sdk.android;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class ax
  implements TextView.OnEditorActionListener
{
  ax(as paramas, bn parambn, Activity paramActivity) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 5)
    {
      this.a.d();
      this.a.a(this.b);
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */