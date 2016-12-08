package com.mixpanel.android.c;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

final class ay
  implements TextWatcher
{
  private final View b;
  
  public ay(ax paramax, View paramView)
  {
    this.b = paramView;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    this.a.c(this.b);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */