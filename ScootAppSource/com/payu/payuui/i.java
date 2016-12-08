package com.payu.payuui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.payu.india.Model.PaymentDetails;
import java.util.ArrayList;

final class i
  implements AdapterView.OnItemSelectedListener
{
  i(PayUNetBankingActivity paramPayUNetBankingActivity) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    PayUNetBankingActivity.a(this.a, ((PaymentDetails)PayUNetBankingActivity.a(this.a).get(paramInt)).b());
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */