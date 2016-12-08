package com.payu.payuui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import com.payu.india.Model.Emi;

final class d
  implements AdapterView.OnItemSelectedListener
{
  d(PayUEmiActivity paramPayUEmiActivity) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    PayUEmiActivity.a(this.a, new f(this.a, PayUEmiActivity.a(this.a), (Emi)paramAdapterView.getSelectedItem()));
    PayUEmiActivity.c(this.a).setAdapter(PayUEmiActivity.b(this.a));
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */