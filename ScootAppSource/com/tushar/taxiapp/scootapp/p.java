package com.tushar.taxiapp.scootapp;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.d;
import com.scootapp.tv.d.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

final class p
  extends AsyncTask<String, Integer, List<List<HashMap<String, String>>>>
{
  private String b;
  
  private p(BookingConfirmation paramBookingConfirmation) {}
  
  protected List<List<HashMap<String, String>>> a(String... paramVarArgs)
  {
    try
    {
      localObject = new JSONObject(paramVarArgs[0]);
      localObject = new h().a((JSONObject)localObject);
      paramVarArgs.printStackTrace();
    }
    catch (Exception paramVarArgs)
    {
      try
      {
        this.b = paramVarArgs[1];
        return (List<List<HashMap<String, String>>>)localObject;
      }
      catch (Exception paramVarArgs)
      {
        Object localObject;
        for (;;) {}
      }
      paramVarArgs = paramVarArgs;
      localObject = null;
    }
    return (List<List<HashMap<String, String>>>)localObject;
  }
  
  protected void a(List<List<HashMap<String, String>>> paramList)
  {
    PolylineOptions localPolylineOptions = null;
    int i = 0;
    while (i < paramList.size())
    {
      ArrayList localArrayList = new ArrayList();
      localPolylineOptions = new PolylineOptions();
      List localList = (List)paramList.get(i);
      j = 0;
      while (j < localList.size())
      {
        Object localObject = (HashMap)localList.get(j);
        localObject = new LatLng(Double.parseDouble((String)((HashMap)localObject).get("lat")), Double.parseDouble((String)((HashMap)localObject).get("lng")));
        localArrayList.add(localObject);
        BookingConfirmation.j(this.a).a((LatLng)localObject);
        j += 1;
      }
      localPolylineOptions.a(localArrayList);
      localPolylineOptions.a(5.0F);
      localPolylineOptions.a(android.support.v4.b.c.c(this.a, Integer.parseInt(this.b)));
      i += 1;
    }
    BookingConfirmation.f(this.a).a(localPolylineOptions);
    paramList = BookingConfirmation.j(this.a).a();
    i = this.a.getResources().getDisplayMetrics().widthPixels;
    int j = this.a.getResources().getDisplayMetrics().heightPixels;
    BookingConfirmation.f(this.a).a(b.a(paramList, i, j, 100));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */