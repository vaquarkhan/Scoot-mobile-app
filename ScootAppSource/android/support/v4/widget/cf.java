package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

public final class cf
{
  static final cl a = new ch();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new cg();
      return;
    }
    if (i >= 18)
    {
      a = new cj();
      return;
    }
    if (i >= 17)
    {
      a = new ci();
      return;
    }
    if (i >= 16)
    {
      a = new ck();
      return;
    }
  }
  
  public static void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    a.a(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */