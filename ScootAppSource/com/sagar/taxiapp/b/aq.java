package com.sagar.taxiapp.b;

import android.os.AsyncTask;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import android.widget.ListAdapter;
import com.sagar.taxiapp.a.bq;
import com.sagar.taxiapp.dg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

final class aq
  extends AsyncTask<String, Integer, List<HashMap<String, String>>>
{
  JSONObject a;
  
  private aq(v paramv) {}
  
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
    localObject = new bq(v.F(this.b), 2130968695, 16908308, 0, (List)localObject);
    if (v.G(this.b))
    {
      v.g(this.b).setAdapter((ListAdapter)localObject);
      v.g(this.b).setOnItemClickListener(new ar(this, paramList));
    }
    v.d(this.b).setAdapter((ListAdapter)localObject);
    v.d(this.b).setOnItemClickListener(new as(this, paramList));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */