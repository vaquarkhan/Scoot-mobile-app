package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

final class u
  extends ArrayAdapter<String>
{
  public u(Context paramContext, int paramInt, List<String> paramList)
  {
    super(paramInt, paramList, localList);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = (TextViewWithCircularIndicator)super.getView(paramInt, paramView, paramViewGroup);
    paramView.requestLayout();
    paramInt = s.a(this.a, paramView);
    paramView.setBackgroundColor(s.a(this.a));
    paramView.setCircleColor(s.b(this.a));
    paramView.setTextColor(s.c(this.a));
    if (s.d(this.a).c_().a == paramInt) {}
    for (boolean bool = true;; bool = false)
    {
      paramView.a(bool);
      if (bool) {
        s.a(this.a, paramView);
      }
      return paramView;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */