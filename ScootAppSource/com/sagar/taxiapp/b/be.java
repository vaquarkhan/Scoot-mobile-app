package com.sagar.taxiapp.b;

import android.support.v4.b.c;
import android.text.Editable;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AutoCompleteTextView;

final class be
  implements Animation.AnimationListener
{
  be(av paramav, AutoCompleteTextView paramAutoCompleteTextView, String paramString) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.setHintTextColor(c.c(this.c.l(), 2131689629));
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.a.getEditableText().clear();
    this.a.setHint(this.b);
    this.a.setHintTextColor(c.c(this.c.l(), 2131689677));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */