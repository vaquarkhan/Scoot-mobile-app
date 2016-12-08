package com.sagar.taxiapp;

import android.content.SharedPreferences.Editor;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.HashMap;
import java.util.List;

final class da
  implements AdapterView.OnItemClickListener
{
  da(cz paramcz, List paramList) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Log.v("Test", "Inside Function onItemClick");
    paramAdapterView = (String)((HashMap)this.a.get(paramInt)).get("place_id");
    Log.e("placeid", paramAdapterView);
    new cy(this.b.b, paramAdapterView).execute(new Void[0]);
    OnDemandSearchAddress.e(this.b.b).setSelection(0);
    OnDemandSearchAddress.e(this.b.b).clearFocus();
    OnDemandSearchAddress.f(this.b.b);
    this.b.b.r.putString("yourLocation", OnDemandSearchAddress.e(this.b.b).getText().toString()).apply();
    Log.v("Test", "Outside Function onItemClick");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */