package com.scootapp.tv.services;

import android.app.IntentService;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import com.scootapp.tv.b.c;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class BookingGeocodeAddressService
  extends IntentService
{
  public BookingGeocodeAddressService()
  {
    super("BookingGeocodeAddressService");
  }
  
  public BookingGeocodeAddressService(String paramString)
  {
    super(paramString);
  }
  
  private void a(String paramString, Address paramAddress)
  {
    if (paramAddress != null)
    {
      String[] arrayOfString = new String[5];
      arrayOfString[2] = (paramAddress.getLocality() + ", ");
      arrayOfString[3] = (paramAddress.getAdminArea() + ", ");
      arrayOfString[4] = paramAddress.getCountryName();
      arrayOfString[0] = (paramAddress.getFeatureName() + ", ");
      arrayOfString[1] = (paramAddress.getSubLocality() + ", ");
      int j = arrayOfString.length;
      paramAddress = "";
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        Object localObject = paramAddress;
        if (!str.equalsIgnoreCase("null, ")) {
          localObject = paramAddress + str;
        }
        i += 1;
        paramAddress = (Address)localObject;
      }
      c.b(paramString, paramAddress);
    }
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    Log.e("BOOK_GEO_ADDY_SERVICE", "onHandleIntent");
    Geocoder localGeocoder = new Geocoder(this, Locale.getDefault());
    String str1 = "";
    int i = paramIntent.getIntExtra("com.scootapp.FETCH_TYPE_EXTRA", 0);
    Log.e("BOOK_GEO_ADDY_SERVICE", "fetchType == " + i);
    String str2 = paramIntent.getStringExtra("com.scootapp.BOOKING_ID");
    if (i == 1) {}
    for (paramIntent = paramIntent.getStringExtra("com.scootapp.LOCATION_NAME_DATA_EXTRA");; paramIntent = null)
    {
      for (;;)
      {
        try
        {
          paramIntent = localGeocoder.getFromLocationName(paramIntent, 1);
          str1 = "";
        }
        catch (IOException paramIntent)
        {
          Log.e("BOOK_GEO_ADDY_SERVICE", "Service not available", paramIntent);
          str1 = "Service not available";
          paramIntent = null;
          continue;
        }
        if ((paramIntent != null) && (paramIntent.size() != 0)) {
          break label277;
        }
        if (str1.isEmpty()) {
          Log.e("BOOK_GEO_ADDY_SERVICE", "Not Found");
        }
        a(str2, null);
        return;
        if (i == 2)
        {
          double d1 = paramIntent.getDoubleExtra("com.scootapp.LOCATION_LATITUDE_DATA_EXTRA", 0.0D);
          double d2 = paramIntent.getDoubleExtra("com.scootapp.LOCATION_LONGITUDE_DATA_EXTRA", 0.0D);
          try
          {
            paramIntent = localGeocoder.getFromLocation(d1, d2, 1);
          }
          catch (IOException paramIntent)
          {
            for (;;)
            {
              str1 = "Service Not Available";
              Log.e("BOOK_GEO_ADDY_SERVICE", "Service Not Available", paramIntent);
              paramIntent = null;
            }
          }
          catch (IllegalArgumentException paramIntent)
          {
            for (;;)
            {
              str1 = "Invalid Latitude or Longitude Used";
              Log.e("BOOK_GEO_ADDY_SERVICE", "Invalid Latitude or Longitude Used" + ". " + "Latitude = " + d1 + ", Longitude = " + d2, paramIntent);
              paramIntent = null;
            }
          }
        }
      }
      str1 = "Unknown Type";
      Log.e("BOOK_GEO_ADDY_SERVICE", "Unknown Type");
    }
    label277:
    paramIntent = (Address)paramIntent.get(0);
    Log.i("BOOK_GEO_ADDY_SERVICE", "Address Found");
    a(str2, paramIntent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\services\BookingGeocodeAddressService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */