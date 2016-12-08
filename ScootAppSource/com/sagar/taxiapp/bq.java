package com.sagar.taxiapp;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import java.util.HashMap;
import java.util.List;

final class bq
  implements AdapterView.OnItemClickListener
{
  bq(bp parambp, List paramList) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Log.e("placeid", (String)((HashMap)this.a.get(paramInt)).get("place_id"));
    LocalCarRentalPrePaymentPage.N(this.b.b);
    LocalCarRentalPrePaymentPage.e(this.b.b).setSelection(0);
    LocalCarRentalPrePaymentPage.e(this.b.b).clearFocus();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */