package com.payu.custombrowser;

import android.content.Context;
import android.view.View;

public final class ai
{
  public static void a(Context paramContext, View paramView)
  {
    paramView.setVisibility(0);
    b(paramContext, paramView);
  }
  
  public static void a(View paramView)
  {
    paramView.setVisibility(8);
  }
  
  private static void b(Context paramContext, View paramView)
  {
    paramContext = (DotsProgressBar)paramView.findViewById(R.id.dotsProgressBar);
    paramContext.setDotsCount(5);
    paramContext.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */