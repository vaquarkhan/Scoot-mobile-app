package com.sagar.taxiapp;

import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.sagar.taxiapp.a.k;
import com.sagar.taxiapp.beans.c;
import com.scootapp.tv.d.a;
import com.scootapp.tv.d.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class as
  implements FunctionCallback<String>
{
  as(CarRentalCabsListingLocal paramCarRentalCabsListingLocal) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null) {
      Log.v("Scoot", "CarRentalCabListing Response : " + paramString);
    }
    for (;;)
    {
      int i;
      try
      {
        paramString = new JSONObject(paramString).optJSONArray("providers");
        i = 0;
        if (i < paramString.length())
        {
          Object localObject = paramString.optJSONObject(i);
          paramParseException = ((JSONObject)localObject).optString("provName");
          localObject = ((JSONObject)localObject).optJSONArray("provList");
          int j = 0;
          if (j >= ((JSONArray)localObject).length()) {
            break label738;
          }
          c localc = new c();
          JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(j);
          localc.a = paramParseException;
          localc.H = n.a(paramParseException);
          localc.f = localJSONObject.optString("ac/nonAc");
          localc.b = localJSONObject.optString("carName");
          localc.c = Integer.parseInt(localJSONObject.optString("seatingCapacity"));
          a.a(localJSONObject.optString("seatingCapacity"));
          localc.g = localJSONObject.optString("costOfTrip");
          localJSONObject = localJSONObject.optJSONObject("extraParams");
          localc.h = localJSONObject.optString("pickupCity");
          localc.J = localJSONObject.optString("pickupCityCode");
          localc.k = localJSONObject.optString("pickupDate");
          localc.j = localJSONObject.optString("pickupTime");
          localc.L = localJSONObject.optString("pickupDateTime");
          localc.l = localJSONObject.optString("travelTypeOption");
          localc.m = localJSONObject.optString("tripTypeOption");
          localc.n = localJSONObject.optString("perKmRateCharge");
          localc.o = localJSONObject.optString("approxDistance");
          localc.r = localJSONObject.optString("nightHalt");
          localc.s = localJSONObject.optString("totalAmount");
          localc.t = localJSONObject.optString("days");
          localc.u = localJSONObject.optString("userId");
          localc.v = localJSONObject.optString("userIPAddress");
          localc.x = localJSONObject.optString("localBasicRate");
          localc.y = localJSONObject.optString("extraHourRate");
          localc.C = localJSONObject.optString("PriceExtraPerKm");
          localc.D = localJSONObject.optString("PriceExtraPerHrs");
          localc.I = localJSONObject.optString("scootTime");
          if (localJSONObject.optString("natureId") != null) {
            localc.A = localJSONObject.optString("natureId");
          }
          if (localJSONObject.optString("carId") != null) {
            localc.B = localJSONObject.optString("carId");
          }
          CarRentalCabsListingLocal.c(this.a).add(localc);
          j += 1;
          continue;
        }
        CarRentalCabsListingLocal.B(this.a);
        if (a.c() > 0)
        {
          a.d();
          CarRentalCabsListingLocal.a(this.a, (ArrayList)CarRentalCabsListingLocal.c(this.a).clone());
          CarRentalCabsListingLocal.c(this.a).clear();
          paramString = CarRentalCabsListingLocal.h(this.a).iterator();
          if (paramString.hasNext())
          {
            paramParseException = (c)paramString.next();
            paramParseException.c = a.b(String.valueOf(paramParseException.c));
            CarRentalCabsListingLocal.c(this.a).add(paramParseException);
            continue;
            CarRentalCabsListingLocal.A(this.a).setRefreshing(false);
          }
        }
      }
      catch (JSONException paramString)
      {
        Log.e(CarRentalCabsListingLocal.class.getName(), "Error occured in getCarRentalListings() " + paramString);
      }
      for (;;)
      {
        return;
        CarRentalCabsListingLocal.h(this.a).clear();
        if (!CarRentalCabsListingLocal.c(this.a).isEmpty()) {
          Collections.sort(CarRentalCabsListingLocal.c(this.a), c.N);
        }
        CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.c(this.a));
        continue;
        Log.e(CarRentalCabsListingLocal.class.getName(), "Error occured in getCarRentalListings() " + paramParseException);
        Toast.makeText(this.a, "Oops! Connection Error. Please Try Again.", 1).show();
      }
      label738:
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */