package com.payu.payuui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.payu.india.Model.PaymentDetails;
import java.util.ArrayList;

final class a
  extends ArrayAdapter<PaymentDetails>
{
  Context a;
  ArrayList<PaymentDetails> b;
  
  public a(Context paramContext, int paramInt, ArrayList<PaymentDetails> paramArrayList)
  {
    super(paramContext, paramInt, paramArrayList);
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public int getCount()
  {
    if (this.b != null) {
      return this.b.size();
    }
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(R.layout.cash_card_list_item, null);
      paramViewGroup = new b(this, paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      PaymentDetails localPaymentDetails = (PaymentDetails)this.b.get(paramInt);
      paramViewGroup.a.setText(localPaymentDetails.a());
      return paramView;
      paramViewGroup = (b)paramView.getTag();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */