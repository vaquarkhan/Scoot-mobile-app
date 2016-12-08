package com.scootapp.tv.services;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.parse.ParseObject;
import com.sagar.taxiapp.ApplicationTaxi;
import com.scootapp.tv.a.aa;
import com.scootapp.tv.a.z;
import com.scootapp.tv.receivers.OlaTrackRideReceiver;

public class OlaBookingTrackingService
  extends IntentService
{
  private SharedPreferences a;
  private SharedPreferences.Editor b;
  
  public OlaBookingTrackingService()
  {
    super("OlaBookingTrackingService");
  }
  
  public OlaBookingTrackingService(String paramString)
  {
    super(paramString);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    this.a = getSharedPreferences("latestOlaRideFeedBackRecord", 0);
    this.b = this.a.edit();
    Object localObject = paramIntent.getStringExtra(z.s);
    paramIntent = com.scootapp.tv.b.c.a((String)localObject);
    Log.v("Scoot", "Booking Status " + paramIntent + " -- " + "cancelled".equals(paramIntent));
    if (("cancelled".equals(paramIntent)) || ("COMPLETED".equals(paramIntent)))
    {
      localObject = new Intent(getApplicationContext(), OlaTrackRideReceiver.class);
      ((Intent)localObject).putExtra(z.s, "");
      localObject = PendingIntent.getBroadcast(getApplicationContext(), 1, (Intent)localObject, 268435456);
      ((AlarmManager)getSystemService("alarm")).cancel((PendingIntent)localObject);
      localObject = ParseObject.createWithoutData("OlaRideBookings", getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""));
      ((ParseObject)localObject).put("status", paramIntent);
      ((ParseObject)localObject).saveInBackground();
      Log.v("Scoot", "In Service Ride Cancelled / Completed");
      return;
    }
    Log.v("Scoot", "In Service");
    aa.a = "?booking_id=" + (String)localObject;
    paramIntent = new c(this, "https://devapi.olacabs.com/v1/bookings/track_ride" + aa.a, null, new a(this, (String)localObject), new b(this));
    ApplicationTaxi.a().a(paramIntent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\services\OlaBookingTrackingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */