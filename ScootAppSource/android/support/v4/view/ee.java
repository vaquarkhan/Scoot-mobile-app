package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

final class ee
  implements Comparator<View>
{
  public int a(View paramView1, View paramView2)
  {
    paramView1 = (dx)paramView1.getLayoutParams();
    paramView2 = (dx)paramView2.getLayoutParams();
    if (paramView1.a != paramView2.a)
    {
      if (paramView1.a) {
        return 1;
      }
      return -1;
    }
    return paramView1.e - paramView2.e;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */