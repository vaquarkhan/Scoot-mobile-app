package com.sagar.taxiapp;

import android.text.Editable;
import android.text.TextWatcher;

final class cx
  implements TextWatcher
{
  cx(OnDemandSearchAddress paramOnDemandSearchAddress) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0)) {
      if (OnDemandSearchAddress.a(this.a) != null) {
        OnDemandSearchAddress.a(this.a).cancel(true);
      }
    }
    try
    {
      OnDemandSearchAddress.a(this.a, new db(this.a, null));
      paramCharSequence = paramCharSequence.toString().trim().replaceAll(" ", "+");
      OnDemandSearchAddress.a(this.a).execute(new String[] { paramCharSequence });
      return;
    }
    catch (Exception paramCharSequence)
    {
      paramCharSequence.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */