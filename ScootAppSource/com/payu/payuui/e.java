package com.payu.payuui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.payu.india.Model.Emi;

final class e
  implements AdapterView.OnItemSelectedListener
{
  e(PayUEmiActivity paramPayUEmiActivity) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    PayUEmiActivity.a(this.a, (Emi)paramAdapterView.getSelectedItem());
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */