package com.sagar.taxiapp;

import android.os.AsyncTask;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import android.widget.ListAdapter;
import com.sagar.taxiapp.a.bq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

final class cz
  extends AsyncTask<String, Integer, List<HashMap<String, String>>>
{
  JSONObject a;
  
  private cz(OnDemandSearchAddress paramOnDemandSearchAddress) {}
  
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
    localObject = new bq(this.b, 2130968695, 16908308, 2131755584, (List)localObject);
    OnDemandSearchAddress.e(this.b).setAdapter((ListAdapter)localObject);
    OnDemandSearchAddress.e(this.b).setOnItemClickListener(new da(this, paramList));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */