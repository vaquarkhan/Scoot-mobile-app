package com.scootapp.tv.a;

import android.util.Log;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.sagar.taxiapp.beans.OlaBookingObject;
import com.scootapp.tv.b.a;
import com.scootapp.tv.b.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class y
  implements FunctionCallback<String>
{
  public void a(String paramString, ParseException paramParseException)
  {
    int j = 0;
    int i;
    Object localObject1;
    Object localObject2;
    if ((paramString != null) && (!"null".equals(paramString)))
    {
      Log.v("Scoot", "Booking History Response " + paramString);
      try
      {
        paramString = new JSONObject(paramString);
        paramParseException = paramString.optJSONArray("onDemandCabs");
        k = paramParseException.length();
        if (k > 0)
        {
          c.c();
          i = 0;
          if (i < k)
          {
            localObject1 = paramParseException.optJSONObject(i);
            if (localObject1 == null) {
              break label733;
            }
            localObject2 = new OlaBookingObject();
            ((OlaBookingObject)localObject2).a(((JSONObject)localObject1).optString("booking_id"));
            ((OlaBookingObject)localObject2).f(((JSONObject)localObject1).optString("model"));
            ((OlaBookingObject)localObject2).e(((JSONObject)localObject1).optString("provName"));
            ((OlaBookingObject)localObject2).g(((JSONObject)localObject1).optString("distance"));
            ((OlaBookingObject)localObject2).c(((JSONObject)localObject1).optString("date"));
            ((OlaBookingObject)localObject2).d(((JSONObject)localObject1).optString("time"));
            ((OlaBookingObject)localObject2).a((float)((JSONObject)localObject1).optLong("surcharge"));
            ((OlaBookingObject)localObject2).i(((JSONObject)localObject1).optString("location"));
            String str = ((JSONObject)localObject1).optString("destination");
            if (str.isEmpty()) {
              ((OlaBookingObject)localObject2).b("N/A");
            }
            for (;;)
            {
              ((OlaBookingObject)localObject2).h(((JSONObject)localObject1).optString("status"));
              ((OlaBookingObject)localObject2).a(((JSONObject)localObject1).optInt("amount"));
              c.a((OlaBookingObject)localObject2);
              if (!"NO_BOOKING".equalsIgnoreCase(((OlaBookingObject)localObject2).h())) {
                break;
              }
              c.a(((OlaBookingObject)localObject2).a(), "cancelled");
              break;
              ((OlaBookingObject)localObject2).b(str);
            }
            return;
          }
        }
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
    }
    label293:
    paramParseException = paramString.optJSONArray("rentalCabs");
    int k = paramParseException.length();
    if (k > 0)
    {
      com.scootapp.tv.b.b.c();
      i = 0;
    }
    for (;;)
    {
      if (i < k)
      {
        localObject1 = paramParseException.optJSONObject(i);
        if (localObject1 != null)
        {
          localObject2 = new com.sagar.taxiapp.beans.b();
          ((com.sagar.taxiapp.beans.b)localObject2).e(((JSONObject)localObject1).optString("totalAmount"));
          ((com.sagar.taxiapp.beans.b)localObject2).f(((JSONObject)localObject1).optString("carName"));
          ((com.sagar.taxiapp.beans.b)localObject2).d("");
          ((com.sagar.taxiapp.beans.b)localObject2).a(((JSONObject)localObject1).optString("pickupDateTime"));
          ((com.sagar.taxiapp.beans.b)localObject2).b(((JSONObject)localObject1).optString("pickupAddress"));
          ((com.sagar.taxiapp.beans.b)localObject2).c(((JSONObject)localObject1).optString("tripId"));
          ((com.sagar.taxiapp.beans.b)localObject2).g(((JSONObject)localObject1).optString("mobileNum"));
          ((com.sagar.taxiapp.beans.b)localObject2).h(((JSONObject)localObject1).optString("userIpAddress"));
          ((com.sagar.taxiapp.beans.b)localObject2).i(((JSONObject)localObject1).optString("userId"));
          ((com.sagar.taxiapp.beans.b)localObject2).j(((JSONObject)localObject1).optString("mihPayId"));
          ((com.sagar.taxiapp.beans.b)localObject2).k(((JSONObject)localObject1).optString("cars"));
          ((com.sagar.taxiapp.beans.b)localObject2).l(((JSONObject)localObject1).optString("providerName"));
          com.scootapp.tv.b.b.a((com.sagar.taxiapp.beans.b)localObject2);
          if ("cancelled".equalsIgnoreCase(((JSONObject)localObject1).optString("status"))) {
            com.scootapp.tv.b.b.a(((com.sagar.taxiapp.beans.b)localObject2).c());
          }
        }
      }
      else
      {
        paramString = paramString.optJSONArray("interCityCabs");
        k = paramString.length();
        if (k <= 0) {
          break label293;
        }
        a.c();
        i = j;
        while (i < k)
        {
          paramParseException = paramString.optJSONObject(i);
          if (paramParseException != null)
          {
            localObject1 = new com.sagar.taxiapp.beans.b();
            ((com.sagar.taxiapp.beans.b)localObject1).e(paramParseException.optString("totalAmount"));
            ((com.sagar.taxiapp.beans.b)localObject1).f(paramParseException.optString("carName"));
            ((com.sagar.taxiapp.beans.b)localObject1).d(paramParseException.optString("distance"));
            ((com.sagar.taxiapp.beans.b)localObject1).a(paramParseException.optString("pickupDateTime"));
            ((com.sagar.taxiapp.beans.b)localObject1).b(paramParseException.optString("pickupAddress"));
            ((com.sagar.taxiapp.beans.b)localObject1).c(paramParseException.optString("tripId"));
            ((com.sagar.taxiapp.beans.b)localObject1).g(paramParseException.optString("mobileNum"));
            ((com.sagar.taxiapp.beans.b)localObject1).h(paramParseException.optString("userIpAddress"));
            ((com.sagar.taxiapp.beans.b)localObject1).i(paramParseException.optString("userId"));
            ((com.sagar.taxiapp.beans.b)localObject1).j(paramParseException.optString("mihPayId"));
            ((com.sagar.taxiapp.beans.b)localObject1).k(paramParseException.optString("cars"));
            ((com.sagar.taxiapp.beans.b)localObject1).l(paramParseException.optString("providerName"));
            a.a((com.sagar.taxiapp.beans.b)localObject1);
            if ("cancelled".equalsIgnoreCase(paramParseException.optString("status"))) {
              a.a(((com.sagar.taxiapp.beans.b)localObject1).c());
            }
          }
          i += 1;
        }
        break label293;
        label733:
        i += 1;
        break;
      }
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */