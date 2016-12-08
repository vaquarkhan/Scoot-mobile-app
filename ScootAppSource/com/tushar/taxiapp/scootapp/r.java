package com.tushar.taxiapp.scootapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

final class r
  implements SaveCallback
{
  r(OlaBooking paramOlaBooking, ParseObject paramParseObject) {}
  
  public void done(ParseException paramParseException)
  {
    Log.v("Scoot", "Object Id " + this.a.getObjectId());
    this.b.getSharedPreferences("olaBookingDetails", 0).edit().putString("objectId", this.a.getObjectId()).apply();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */