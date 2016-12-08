package com.sagar.taxiapp;

import android.text.Editable;
import android.text.TextWatcher;

final class dr
  implements TextWatcher
{
  dr(SocialAccountSignup paramSocialAccountSignup) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    SocialAccountSignup.j(this.a);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */