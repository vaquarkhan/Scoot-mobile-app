package com.mixpanel.android.surveys;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.mixpanel.android.R.drawable;

final class m
  implements View.OnTouchListener
{
  m(k paramk) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      paramView.setBackgroundResource(R.drawable.com_mixpanel_android_cta_button_highlight);
    }
    for (;;)
    {
      return false;
      paramView.setBackgroundResource(R.drawable.com_mixpanel_android_cta_button);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */