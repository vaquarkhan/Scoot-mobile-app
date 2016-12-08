package com.mixpanel.android.surveys;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class g
  implements TextView.OnEditorActionListener
{
  g(f paramf, CardCarouselLayout paramCardCarouselLayout) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66) && (paramKeyEvent.getAction() == 0) && ((paramKeyEvent.getFlags() & 0x20) == 0)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || (paramInt == 6))
      {
        paramTextView.clearComposingText();
        if (CardCarouselLayout.a(this.b.a) != null)
        {
          paramTextView = paramTextView.getText().toString();
          CardCarouselLayout.a(this.b.a).a(f.a(this.b), paramTextView);
        }
        bool = true;
      }
      return bool;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */