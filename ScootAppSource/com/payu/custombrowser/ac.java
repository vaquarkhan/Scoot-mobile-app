package com.payu.custombrowser;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

final class ac
  implements TextWatcher
{
  ac(ab paramab, View paramView, Button paramButton) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (((EditText)this.a.findViewById(R.id.otp_sms)).getText().toString().length() > 5)
    {
      a.B(this.c.a).a(this.a);
      this.b.setOnClickListener(a.B(this.c.a));
      this.b.setClickable(true);
      ah.a(1.0F, this.b);
      return;
    }
    this.b.setClickable(false);
    ah.a(0.3F, this.b);
    this.b.setOnClickListener(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */