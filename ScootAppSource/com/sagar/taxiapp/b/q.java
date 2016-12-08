package com.sagar.taxiapp.b;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

final class q
  implements TextWatcher
{
  q(h paramh) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (h.a(this.a).getText().toString().length() > 0)
    {
      h.b(this.a).setVisibility(0);
      return;
    }
    h.b(this.a).setVisibility(4);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */