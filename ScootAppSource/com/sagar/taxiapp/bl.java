package com.sagar.taxiapp;

import android.text.Editable;
import android.text.TextWatcher;

final class bl
  implements TextWatcher
{
  bl(LocalCarRentalPrePaymentPage paramLocalCarRentalPrePaymentPage) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.n != null) {
      this.a.n.cancel(true);
    }
    try
    {
      this.a.n = new br(this.a, null);
      paramCharSequence = paramCharSequence.toString().trim().replaceAll(" ", "+");
      this.a.n.execute(new String[] { paramCharSequence });
      return;
    }
    catch (Exception paramCharSequence)
    {
      paramCharSequence.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */