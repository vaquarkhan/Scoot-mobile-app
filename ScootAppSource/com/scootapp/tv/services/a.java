package com.scootapp.tv.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.b.a.y;
import com.parse.ParseObject;
import com.sagar.taxiapp.beans.o;
import com.scootapp.tv.a.z;
import com.scootapp.tv.b.c;
import com.scootapp.tv.receivers.OlaTrackRideReceiver;
import org.json.JSONObject;

final class a
  implements y<JSONObject>
{
  a(OlaBookingTrackingService paramOlaBookingTrackingService, String paramString) {}
  
  public void a(JSONObject paramJSONObject)
  {
    for (Object localObject1 = paramJSONObject.optString("booking_status");; localObject1 = "mins")
    {
      Object localObject2;
      Object localObject3;
      Object localObject4;
      try
      {
        OlaBookingTrackingService.a(this.b).putString("olaBookingId", this.a).apply();
        if ("PENDING".equalsIgnoreCase((String)localObject1))
        {
          localObject2 = new Intent();
          ((Intent)localObject2).setAction("BOOKING_UPDATED");
          ((Intent)localObject2).putExtra("BOOKING_UPDATED", "ALLOTMENT_FAILED");
          this.b.sendBroadcast((Intent)localObject2);
        }
        if ("ALLOTMENT_FAILED".equalsIgnoreCase((String)localObject1))
        {
          c.a(this.a, "cancelled");
          paramJSONObject = new Intent(this.b.getApplicationContext(), OlaTrackRideReceiver.class);
          paramJSONObject.putExtra(z.s, "");
          PendingIntent.getBroadcast(this.b.getApplicationContext(), 1, paramJSONObject, 268435456);
          paramJSONObject = new Intent();
          paramJSONObject.setAction("BOOKING_UPDATED");
          paramJSONObject.putExtra("BOOKING_UPDATED", "ALLOTMENT_FAILED");
          this.b.sendBroadcast(paramJSONObject);
          paramJSONObject = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
          paramJSONObject.put("status", "cancelled");
          paramJSONObject.saveInBackground();
          return;
        }
        if ("CALL_DRIVER".equals(localObject1))
        {
          localObject3 = new Intent();
          ((Intent)localObject3).setAction("BOOKING_UPDATED");
          ((Intent)localObject3).putExtra("BOOKING_UPDATED", "CALL_DRIVER");
          localObject4 = this.b.getApplicationContext().getSharedPreferences("olaBookingDetails", 0).edit();
          ((SharedPreferences.Editor)localObject4).putString("driverLat", paramJSONObject.optString("driver_lat")).apply();
          ((SharedPreferences.Editor)localObject4).putString("driverLng", paramJSONObject.optString("driver_lng")).apply();
          JSONObject localJSONObject = paramJSONObject.optJSONObject("duration");
          if (localJSONObject != null)
          {
            localObject2 = localJSONObject.optString("unit");
            if ("MINUTE".equals(localObject2)) {
              continue;
            }
            localObject1 = localObject2;
            if ("MINUTES".equals(localObject2)) {
              continue;
            }
            ((Intent)localObject3).putExtra("driverETA", String.format("%s %s", new Object[] { localJSONObject.optString("value"), localObject1 }));
            Log.v("Scoot", "In Service Driver ETA " + String.format("%s %s", new Object[] { localJSONObject.optString("value"), localObject1 }));
          }
          if (paramJSONObject.optString("vehicle_type").equalsIgnoreCase("auto"))
          {
            ((SharedPreferences.Editor)localObject4).putString("driver_name", paramJSONObject.optString("driver_name")).apply();
            ((SharedPreferences.Editor)localObject4).putString("driver_number", paramJSONObject.optString("driver_number")).apply();
            ((SharedPreferences.Editor)localObject4).putString("vehicle_type", paramJSONObject.optString("vehicle_type")).apply();
            ((SharedPreferences.Editor)localObject4).putString("vehicle_number", paramJSONObject.optString("vehicle_number")).apply();
          }
          Log.v("Scoot", "In Service Driver Lat " + paramJSONObject.optString("driver_lat") + " Lng " + paramJSONObject.optString("driver_lng"));
          this.b.sendBroadcast((Intent)localObject3);
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        localObject1 = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
        ((ParseObject)localObject1).put("exception", paramJSONObject.getMessage());
        ((ParseObject)localObject1).saveInBackground();
        return;
      }
      if ("IN_PROGRESS".equals(localObject1))
      {
        localObject1 = this.b.getApplicationContext().getSharedPreferences("olaBookingDetails", 0).edit();
        ((SharedPreferences.Editor)localObject1).putString("driverLat", paramJSONObject.optString("driver_lat")).apply();
        ((SharedPreferences.Editor)localObject1).putString("driverLng", paramJSONObject.optString("driver_lng")).apply();
        Log.v("Scoot", "In Service Driver Lat " + paramJSONObject.optString("driver_lat") + " Lng " + paramJSONObject.optString("driver_lng"));
        paramJSONObject = new Intent();
        paramJSONObject.setAction("BOOKING_UPDATED");
        paramJSONObject.putExtra("BOOKING_UPDATED", "IN_PROGRESS");
        this.b.sendBroadcast(paramJSONObject);
        return;
      }
      if ("NO_BOOKING".equals(localObject1))
      {
        c.a(this.a, "cancelled");
        paramJSONObject = new Intent(this.b.getApplicationContext(), OlaTrackRideReceiver.class);
        paramJSONObject.putExtra(z.s, "");
        paramJSONObject = PendingIntent.getBroadcast(this.b.getApplicationContext(), 1, paramJSONObject, 268435456);
        ((AlarmManager)this.b.getSystemService("alarm")).cancel(paramJSONObject);
        paramJSONObject = new Intent();
        paramJSONObject.setAction("BOOKING_UPDATED");
        paramJSONObject.putExtra("BOOKING_UPDATED", "NO_BOOKING");
        this.b.sendBroadcast(paramJSONObject);
        paramJSONObject = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
        paramJSONObject.put("status", "cancelled");
        paramJSONObject.saveInBackground();
        Log.v("Scoot", "In Service No Booking ");
        return;
      }
      if ("BOOKING_CANCELLED".equalsIgnoreCase((String)localObject1))
      {
        c.a(this.a, "cancelled");
        paramJSONObject = new Intent(this.b.getApplicationContext(), OlaTrackRideReceiver.class);
        paramJSONObject.putExtra(z.s, "");
        paramJSONObject = PendingIntent.getBroadcast(this.b.getApplicationContext(), 1, paramJSONObject, 268435456);
        ((AlarmManager)this.b.getSystemService("alarm")).cancel(paramJSONObject);
        paramJSONObject = new Intent();
        paramJSONObject.setAction("BOOKING_UPDATED");
        paramJSONObject.putExtra("BOOKING_UPDATED", "cancelled");
        this.b.sendBroadcast(paramJSONObject);
        paramJSONObject = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
        paramJSONObject.put("status", "cancelled");
        paramJSONObject.saveInBackground();
        Log.v("Scoot", "In Service No Booking ");
        return;
      }
      if ("COMPLETED".equals(localObject1))
      {
        Log.v("Scoot", "In Service Booking Complete ");
        paramJSONObject = paramJSONObject.optJSONObject("trip_info");
        OlaBookingTrackingService.a(this.b).putString("olaBookingId", this.a).apply();
        OlaBookingTrackingService.a(this.b).putBoolean("showFeedbackScreen", true).apply();
        if (paramJSONObject != null)
        {
          c.a(this.a, "COMPLETED");
          localObject2 = new o();
          try
          {
            ((o)localObject2).a(this.a);
            ((o)localObject2).a(paramJSONObject.optInt("amount"));
            localObject3 = paramJSONObject.optJSONObject("distance");
            if (localObject3 == null) {
              break label1567;
            }
            ((o)localObject2).b(((JSONObject)localObject3).optLong("value") + " " + ((JSONObject)localObject3).optString("unit"));
            localObject3 = new Intent();
            ((Intent)localObject3).setAction("BOOKING_UPDATED");
            ((Intent)localObject3).putExtra("BOOKING_UPDATED", "COMPLETED");
            ((Intent)localObject3).putExtra(z.p, ((o)localObject2).b());
            ((Intent)localObject3).putExtra(z.g, ((o)localObject2).c());
            this.b.sendBroadcast((Intent)localObject3);
            c.a((o)localObject2);
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              localObject4 = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
              ((ParseObject)localObject4).put("exception", localException2.getMessage());
              ((ParseObject)localObject4).saveInBackground();
            }
          }
          localObject3 = new Intent(this.b.getApplicationContext(), OlaTrackRideReceiver.class);
          ((Intent)localObject3).putExtra(z.s, "");
          localObject3 = PendingIntent.getBroadcast(this.b.getApplicationContext(), 1, (Intent)localObject3, 268435456);
          ((AlarmManager)this.b.getSystemService("alarm")).cancel((PendingIntent)localObject3);
          localObject3 = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
          ((ParseObject)localObject3).put("rideCompleteResp", paramJSONObject);
          ((ParseObject)localObject3).put("amount", Integer.valueOf(((o)localObject2).b()));
          ((ParseObject)localObject3).put("distance", ((o)localObject2).c());
          ((ParseObject)localObject3).put("status", localObject1);
          ((ParseObject)localObject3).saveInBackground();
        }
        for (;;)
        {
          if ("N/A".equals(this.b.getSharedPreferences("shareddata", 0).getString("yourDestination", "N/A")))
          {
            paramJSONObject = this.b.getSharedPreferences("olaBookingDetails", 0);
            localObject1 = new Intent(this.b.getApplicationContext(), BookingGeocodeAddressService.class);
            ((Intent)localObject1).putExtra("com.scootapp.FETCH_TYPE_EXTRA", 2);
            ((Intent)localObject1).putExtra("com.scootapp.BOOKING_ID", this.a);
            ((Intent)localObject1).putExtra("com.scootapp.LOCATION_LATITUDE_DATA_EXTRA", Double.parseDouble(paramJSONObject.getString("driverLat", "")));
            ((Intent)localObject1).putExtra("com.scootapp.LOCATION_LONGITUDE_DATA_EXTRA", Double.parseDouble(paramJSONObject.getString("driverLng", "")));
            this.b.startService((Intent)localObject1);
            return;
            label1567:
            ((o)localObject2).b("OE");
            break;
            c.a(this.a, "COMPLETED");
            paramJSONObject = new o();
            try
            {
              paramJSONObject.a(this.a);
              paramJSONObject.a(0);
              paramJSONObject.b("OEN");
              localObject2 = new Intent();
              ((Intent)localObject2).setAction("BOOKING_UPDATED");
              ((Intent)localObject2).putExtra("BOOKING_UPDATED", "COMPLETED");
              ((Intent)localObject2).putExtra(z.p, paramJSONObject.b());
              ((Intent)localObject2).putExtra(z.g, paramJSONObject.c());
              this.b.sendBroadcast((Intent)localObject2);
              c.a(paramJSONObject);
              localObject2 = new Intent(this.b.getApplicationContext(), OlaTrackRideReceiver.class);
              ((Intent)localObject2).putExtra(z.s, "");
              localObject2 = PendingIntent.getBroadcast(this.b.getApplicationContext(), 1, (Intent)localObject2, 268435456);
              ((AlarmManager)this.b.getSystemService("alarm")).cancel((PendingIntent)localObject2);
              localObject2 = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
              ((ParseObject)localObject2).put("amount", Integer.valueOf(paramJSONObject.b()));
              ((ParseObject)localObject2).put("distance", paramJSONObject.c());
              ((ParseObject)localObject2).put("status", localObject1);
              ((ParseObject)localObject2).saveInBackground();
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                ParseObject localParseObject = ParseObject.createWithoutData("OlaRideBookings", this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
                localParseObject.put("exception", localException1.getMessage());
                localParseObject.saveInBackground();
              }
            }
          }
        }
      }
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\services\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */