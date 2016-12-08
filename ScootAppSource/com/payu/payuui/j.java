package com.payu.payuui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridLayout;
import android.widget.LinearLayout;

final class j
  implements View.OnClickListener
{
  j(PayUNetBankingActivity paramPayUNetBankingActivity, int paramInt, GridLayout paramGridLayout) {}
  
  public void onClick(View paramView)
  {
    int j = paramView.getId();
    int i = 0;
    while (i < this.a)
    {
      if (i != j) {
        ((LinearLayout)this.b.getChildAt(i)).setSelected(false);
      }
      i += 1;
    }
    paramView.setSelected(true);
    switch (j)
    {
    default: 
      return;
    case 0: 
      PayUNetBankingActivity.a(this.c, "SBIB");
      return;
    case 1: 
      PayUNetBankingActivity.a(this.c, "CABB");
      return;
    case 2: 
      PayUNetBankingActivity.a(this.c, "AXIB");
      return;
    case 3: 
      PayUNetBankingActivity.a(this.c, "YESB");
      return;
    case 4: 
      PayUNetBankingActivity.a(this.c, "HDFB");
      return;
    }
    PayUNetBankingActivity.a(this.c, "BOIB");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */