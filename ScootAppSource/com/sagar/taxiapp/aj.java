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

final class aj
  implements FunctionCallback<String>
{
  aj(CarRentalCabListings paramCarRentalCabListings) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null) {
      Log.v("Scoot", paramString);
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
            break label779;
          }
          c localc = new c();
          JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(j);
          localc.a = paramParseException;
          localc.H = n.a(paramParseException);
          localc.f = localJSONObject.optString("ac/nonAc");
          localc.b = localJSONObject.optString("carName");
          localc.c = Integer.parseInt(localJSONObject.optString("seatingCapacity"));
          a.a(localJSONObject.optString("seatingCapacity"));
          localc.g = localJSONObject.optString("totalAmount");
          localJSONObject = localJSONObject.optJSONObject("extraParams");
          localc.e = localJSONObject.optString("bookingId");
          localc.d = localJSONObject.optString("preference");
          localc.h = localJSONObject.optString("pickupCity");
          localc.i = localJSONObject.optString("dropCity");
          localc.J = localJSONObject.optString("pickupCityCode");
          localc.K = localJSONObject.optString("dropCityCode");
          localc.k = localJSONObject.optString("pickupDate");
          localc.j = localJSONObject.optString("pickupTime");
          localc.L = localJSONObject.optString("pickupDateTime");
          localc.l = localJSONObject.optString("travelTypeOption");
          localc.m = localJSONObject.optString("tripTypeOption");
          localc.n = localJSONObject.optString("perKmRateCharge");
          localc.o = localJSONObject.optString("approxDistance");
          localc.p = localJSONObject.optString("onewayPerKmRate");
          localc.q = localJSONObject.optString("driverCharges");
          localc.r = localJSONObject.optString("nightHalt");
          localc.s = localJSONObject.optString("totalAmount");
          localc.t = localJSONObject.optString("days");
          localc.u = localJSONObject.optString("userId");
          localc.v = localJSONObject.optString("userIPAddress");
          localc.E = localJSONObject.optString("PricePerKm");
          localc.F = localJSONObject.optString("DriverAllowance");
          localc.G = localJSONObject.optString("NightDetention");
          localc.I = localJSONObject.optString("scootTime");
          localc.B = localJSONObject.optString("carId");
          if (localJSONObject.optString("natureId") != null) {
            localc.A = localJSONObject.optString("natureId");
          }
          if (localJSONObject.optString("carId") != null) {
            localc.B = localJSONObject.optString("carId");
          }
          localc.w = localJSONObject.optString("minimumChargedDistance");
          CarRentalCabListings.c(this.a).add(localc);
          j += 1;
          continue;
        }
        CarRentalCabListings.B(this.a);
        if (a.c() > 0)
        {
          a.d();
          CarRentalCabListings.a(this.a, (ArrayList)CarRentalCabListings.c(this.a).clone());
          CarRentalCabListings.c(this.a).clear();
          paramString = CarRentalCabListings.h(this.a).iterator();
          if (paramString.hasNext())
          {
            paramParseException = (c)paramString.next();
            paramParseException.c = a.b(String.valueOf(paramParseException.c));
            CarRentalCabListings.c(this.a).add(paramParseException);
            continue;
            CarRentalCabListings.A(this.a).setRefreshing(false);
          }
        }
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
      for (;;)
      {
        return;
        CarRentalCabListings.h(this.a).clear();
        if (!CarRentalCabListings.c(this.a).isEmpty()) {
          Collections.sort(CarRentalCabListings.c(this.a), c.N);
        }
        CarRentalCabListings.j(this.a).a(CarRentalCabListings.c(this.a));
        continue;
        Log.e(CarRentalCabListings.class.getName(), "Error occured in getCarRentalListings() " + paramParseException);
        Toast.makeText(this.a, "Oops! Connection Error. Please Try Again.", 1).show();
      }
      label779:
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */