package android.support.design.widget;

import android.support.v7.widget.AppCompatEditText;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public final class bx
  extends AppCompatEditText
{
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    if ((localInputConnection != null) && (paramEditorInfo.hintText == null))
    {
      ViewParent localViewParent = getParent();
      if ((localViewParent instanceof TextInputLayout)) {
        paramEditorInfo.hintText = ((TextInputLayout)localViewParent).getHint();
      }
    }
    return localInputConnection;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */