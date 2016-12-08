package com.mixpanel.android.c;

import android.view.View;
import java.util.Comparator;

final class be
  implements Comparator<View>
{
  be(bd parambd) {}
  
  public int a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2) {
      return 0;
    }
    if (paramView1 == null) {
      return -1;
    }
    if (paramView2 == null) {
      return 1;
    }
    return paramView2.hashCode() - paramView1.hashCode();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */