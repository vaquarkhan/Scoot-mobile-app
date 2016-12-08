package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class by
  implements TextWatcher
{
  by(TextInputLayout paramTextInputLayout) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    TextInputLayout.a(this.a, true);
    if (TextInputLayout.a(this.a)) {
      TextInputLayout.a(this.a, paramEditable.length());
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */