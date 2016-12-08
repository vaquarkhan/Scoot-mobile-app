package com.payu.payuui;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class c
  implements TextWatcher
{
  String a;
  Drawable b;
  
  c(PayUCreditDebitCardActivity paramPayUCreditDebitCardActivity) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() > 5)
    {
      if (this.a == null) {
        this.a = PayUCreditDebitCardActivity.a(this.c).c(paramCharSequence.toString());
      }
      if ((this.a != null) && (this.a.length() > 1) && (this.b == null))
      {
        this.b = PayUCreditDebitCardActivity.a(this.c, this.a);
        if (!this.a.contentEquals("SMAE")) {
          break label143;
        }
        PayUCreditDebitCardActivity.b(this.c).setVisibility(8);
        PayUCreditDebitCardActivity.c(this.c).setVisibility(8);
        PayUCreditDebitCardActivity.d(this.c).setVisibility(8);
      }
    }
    for (;;)
    {
      PayUCreditDebitCardActivity.e(this.c).setCompoundDrawablesWithIntrinsicBounds(null, null, this.b, null);
      return;
      label143:
      PayUCreditDebitCardActivity.b(this.c).setVisibility(0);
      PayUCreditDebitCardActivity.c(this.c).setVisibility(0);
      PayUCreditDebitCardActivity.d(this.c).setVisibility(0);
      continue;
      this.a = null;
      this.b = null;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */