package com.payu.payuui;

import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.payu.india.Model.StoredCard;
import com.payu.india.c.c;
import java.util.ArrayList;

final class q
  implements TextWatcher
{
  q(p paramp, o paramo) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    EditText localEditText = this.b.i;
    if (o.b(this.b.j).c(((StoredCard)o.a(this.b.j).get(this.b.a)).g()).contentEquals("AMEX")) {}
    for (paramInt1 = 4;; paramInt1 = 3)
    {
      localEditText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt1) });
      if (!o.b(this.b.j).a(((StoredCard)o.a(this.b.j).get(this.b.a)).g(), paramCharSequence.toString())) {
        break;
      }
      this.b.h.setEnabled(true);
      return;
    }
    this.b.h.setEnabled(false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */