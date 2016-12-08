package com.payu.custombrowser;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class n
  implements View.OnTouchListener
{
  n(a parama, EditText paramEditText) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (this.a.isFocused()))
    {
      Rect localRect = new Rect();
      this.a.getGlobalVisibleRect(localRect);
      if (!localRect.contains((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY()))
      {
        this.a.clearFocus();
        ((InputMethodManager)paramView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      }
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */