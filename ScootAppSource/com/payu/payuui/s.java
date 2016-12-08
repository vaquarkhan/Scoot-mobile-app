package com.payu.payuui;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;
import com.payu.custombrowser.a;

final class s
  extends a
{
  s(PaymentsActivity paramPaymentsActivity) {}
  
  public void S()
  {
    this.b.findViewById(R.id.parent).setVisibility(0);
  }
  
  public void a(BroadcastReceiver paramBroadcastReceiver)
  {
    if (PaymentsActivity.a(this.b) != null)
    {
      this.b.unregisterReceiver(PaymentsActivity.a(this.b));
      PaymentsActivity.a(this.b, null);
    }
  }
  
  public void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    PaymentsActivity.a(this.b, paramBroadcastReceiver);
    this.b.registerReceiver(paramBroadcastReceiver, paramIntentFilter);
  }
  
  public void d()
  {
    this.b.findViewById(R.id.parent).setVisibility(8);
    this.b.findViewById(R.id.trans_overlay).setVisibility(8);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */