package android.support.design.widget;

import android.os.Build.VERSION;
import android.view.View;

final class cy
{
  static final ci a = new cz();
  private static final da b = new db(null);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b = new dc(null);
      return;
    }
  }
  
  static cf a()
  {
    return a.a();
  }
  
  static void a(View paramView)
  {
    b.a(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */