package com.parse;

import a.m;
import a.o;
import android.location.Location;

final class ParseGeoPoint$2
  implements m<Location, ParseGeoPoint>
{
  public ParseGeoPoint then(o<Location> paramo)
  {
    paramo = (Location)paramo.f();
    return new ParseGeoPoint(paramo.getLatitude(), paramo.getLongitude());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseGeoPoint$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */