package com.payu.payuui;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.payu.india.Model.PaymentDetails;
import java.util.ArrayList;

final class k
  extends BaseAdapter
{
  Context a;
  ArrayList<PaymentDetails> b;
  
  public k(Context paramContext, ArrayList<PaymentDetails> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public int getCount()
  {
    return this.b.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b != null) {
      return this.b.get(paramInt);
    }
    return Integer.valueOf(0);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(R.layout.netbanking_list_item, null);
      paramViewGroup = new l(this, paramView);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      PaymentDetails localPaymentDetails = (PaymentDetails)this.b.get(paramInt);
      Log.v("Payu", "Payment Details Bank Code " + localPaymentDetails.b() + " Bank Name " + localPaymentDetails.a());
      paramViewGroup.a.setText(localPaymentDetails.a());
      return paramView;
      paramViewGroup = (l)paramView.getTag();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */