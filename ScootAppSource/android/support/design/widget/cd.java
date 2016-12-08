package android.support.design.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.l;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

final class cd
  extends a
{
  private cd(TextInputLayout paramTextInputLayout) {}
  
  public void a(View paramView, l paraml)
  {
    super.a(paramView, paraml);
    paraml.b(TextInputLayout.class.getSimpleName());
    paramView = TextInputLayout.c(this.a).f();
    if (!TextUtils.isEmpty(paramView)) {
      paraml.c(paramView);
    }
    if (TextInputLayout.d(this.a) != null) {
      paraml.e(TextInputLayout.d(this.a));
    }
    if (TextInputLayout.b(this.a) != null) {}
    for (paramView = TextInputLayout.b(this.a).getText();; paramView = null)
    {
      if (!TextUtils.isEmpty(paramView))
      {
        paraml.j(true);
        paraml.e(paramView);
      }
      return;
    }
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.b(paramView, paramAccessibilityEvent);
    paramView = TextInputLayout.c(this.a).f();
    if (!TextUtils.isEmpty(paramView)) {
      paramAccessibilityEvent.getText().add(paramView);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */