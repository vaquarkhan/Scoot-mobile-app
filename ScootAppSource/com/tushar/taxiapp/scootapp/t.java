package com.tushar.taxiapp.scootapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

final class t
  implements FunctionCallback<String>
{
  t(OlaBooking paramOlaBooking) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      Object localObject;
      try
      {
        paramParseException = new JSONObject(paramString);
        localObject = paramParseException.optString("status");
        String str = paramParseException.optString("booking_id");
        Log.v("Scoot", "Ola Booking Response " + paramString);
        if ("".equalsIgnoreCase(str)) {
          break label771;
        }
        ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Book Cab Successful").a());
        paramString = Calendar.getInstance();
        paramParseException.put("date", DateFormat.format("dd/MM/yyyy", paramString.getTime()).toString());
        paramParseException.put("time", DateFormat.format("HH:mm a", paramString.getTime()).toString());
        this.a.m();
        if (OlaBooking.d(this.a).equalsIgnoreCase("auto"))
        {
          localObject = this.a.getSharedPreferences("olaBookingDetails", 0).edit();
          ((SharedPreferences.Editor)localObject).putString("booking_id", paramParseException.getString("booking_id")).apply();
          ((SharedPreferences.Editor)localObject).putString("enteredLat", OlaBooking.e(this.a)).apply();
          ((SharedPreferences.Editor)localObject).putString("enteredLng", OlaBooking.f(this.a)).apply();
          ((SharedPreferences.Editor)localObject).putString("vehicle_type", "auto").apply();
          ((SharedPreferences.Editor)localObject).putString("date", DateFormat.format("dd/MM/yyyy", paramString.getTime()).toString()).apply();
          ((SharedPreferences.Editor)localObject).putString("time", DateFormat.format("HH:mm a", paramString.getTime()).toString()).apply();
        }
        for (;;)
        {
          OlaBooking.a(this.a, 0);
          OlaBooking.a(this.a, paramParseException);
          if (OlaBooking.d(this.a).equalsIgnoreCase("auto")) {
            break;
          }
          paramString = new Intent(this.a, BookingConfirmation.class);
          this.a.startActivity(paramString);
          this.a.finish();
          return;
          localObject = this.a.getSharedPreferences("olaBookingDetails", 0).edit();
          ((SharedPreferences.Editor)localObject).putString("booking_id", paramParseException.getString("booking_id")).apply();
          ((SharedPreferences.Editor)localObject).putString("crn", paramParseException.optString("crn")).apply();
          ((SharedPreferences.Editor)localObject).putString("driver_name", paramParseException.optString("driver_name")).apply();
          ((SharedPreferences.Editor)localObject).putString("car_model", paramParseException.optString("car_model")).apply();
          ((SharedPreferences.Editor)localObject).putString("cab_number", paramParseException.optString("cab_number")).apply();
          ((SharedPreferences.Editor)localObject).putString("driver_number", paramParseException.optString("driver_number")).apply();
          ((SharedPreferences.Editor)localObject).putString("eta", paramParseException.optString("eta") + " mins").apply();
          ((SharedPreferences.Editor)localObject).putInt("etaValue", paramParseException.optInt("eta")).apply();
          ((SharedPreferences.Editor)localObject).putString("etaUnit", "mins").apply();
          ((SharedPreferences.Editor)localObject).putString("date", DateFormat.format("dd/MM/yyyy", paramString.getTime()).toString()).apply();
          ((SharedPreferences.Editor)localObject).putString("time", DateFormat.format("HH:mm a", paramString.getTime()).toString()).apply();
          ((SharedPreferences.Editor)localObject).putString("enteredLat", OlaBooking.e(this.a)).apply();
          ((SharedPreferences.Editor)localObject).putString("enteredLng", OlaBooking.f(this.a)).apply();
          ((SharedPreferences.Editor)localObject).putString("driverLat", paramParseException.optString("driver_lat")).apply();
          ((SharedPreferences.Editor)localObject).putString("driverLng", paramParseException.optString("driver_lng")).apply();
          ((SharedPreferences.Editor)localObject).putString("vehicle_type", "cab").apply();
        }
        this.a.n();
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      return;
      label771:
      boolean bool = ((String)localObject).equalsIgnoreCase("FAILURE");
      if (!bool) {}
    }
    try
    {
      OlaBooking.g(this.a).dismiss();
      Toast.makeText(this.a, paramParseException.optString("message"), 1).show();
      this.a.finish();
      return;
      try
      {
        OlaBooking.g(this.a).dismiss();
        Toast.makeText(this.a, "Sorry !! Booking Failed", 1).show();
        this.a.finish();
        return;
        paramParseException.printStackTrace();
        OlaBooking.h(this.a);
        if (OlaBooking.i(this.a) < 3)
        {
          this.a.l();
          return;
        }
        OlaBooking.g(this.a).dismiss();
        Toast.makeText(this.a, "Ola servers are down! Please try again.", 1).show();
        this.a.finish();
        return;
      }
      catch (NullPointerException paramString)
      {
        for (;;) {}
      }
    }
    catch (NullPointerException paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */