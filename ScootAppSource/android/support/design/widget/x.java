package android.support.design.widget;

import android.support.v4.view.cb;
import android.view.View;
import java.util.Comparator;

final class x
  implements Comparator<View>
{
  public int a(View paramView1, View paramView2)
  {
    float f1 = cb.G(paramView1);
    float f2 = cb.G(paramView2);
    if (f1 > f2) {
      return -1;
    }
    if (f1 < f2) {
      return 1;
    }
    return 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */