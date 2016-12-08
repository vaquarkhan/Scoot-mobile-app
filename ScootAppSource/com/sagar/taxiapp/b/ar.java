package com.sagar.taxiapp.b;

import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.HashMap;
import java.util.List;

final class ar
  implements AdapterView.OnItemClickListener
{
  ar(aq paramaq, List paramList) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (String)((HashMap)this.a.get(paramInt)).get("place_id");
    Log.e("placeid", paramAdapterView);
    new ao(this.b.b, paramAdapterView, false).execute(new Void[0]);
    v.g(this.b.b).setSelection(0);
    v.g(this.b.b).clearFocus();
    v.H(this.b.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */