package android.support.design.widget;

import android.view.View;
import java.util.Comparator;

final class p
  implements Comparator<View>
{
  p(CoordinatorLayout paramCoordinatorLayout) {}
  
  public int a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2) {
      return 0;
    }
    if (((u)paramView1.getLayoutParams()).a(this.a, paramView1, paramView2)) {
      return 1;
    }
    if (((u)paramView2.getLayoutParams()).a(this.a, paramView2, paramView1)) {
      return -1;
    }
    return 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */