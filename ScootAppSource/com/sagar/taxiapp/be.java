package com.sagar.taxiapp;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import com.sagar.taxiapp.a.bq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

final class be
  extends AsyncTask<String, Integer, List<HashMap<String, String>>>
{
  JSONObject a;
  
  private be(CarRentalPrePaymentPage paramCarRentalPrePaymentPage) {}
  
  protected List<HashMap<String, String>> a(String... paramVarArgs)
  {
    dg localdg = new dg();
    try
    {
      this.a = new JSONObject(paramVarArgs[0]);
      paramVarArgs = localdg.a(this.a);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      Log.d("Exception", paramVarArgs.toString());
    }
    return null;
  }
  
  protected void a(List<HashMap<String, String>> paramList)
  {
    Object localObject = new ArrayList();
    if (paramList == null) {
      return;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((ArrayList)localObject).add(((HashMap)localIterator.next()).get("description"));
    }
    localObject = new bq(this.b.getBaseContext(), 2130968695, 16908308, 2131755584, (List)localObject);
    CarRentalPrePaymentPage.e(this.b).setAdapter((ListAdapter)localObject);
    CarRentalPrePaymentPage.e(this.b).setOnItemClickListener(new bf(this, paramList));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */