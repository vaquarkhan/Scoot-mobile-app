package com.tushar.taxiapp.scootapp;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;

final class l
  implements GetCallback<ParseObject>
{
  l(k paramk) {}
  
  public void done(ParseObject paramParseObject, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      paramParseObject.put("cancellationReason", BookingConfirmation.h(this.a.a.h));
      paramParseObject.saveInBackground();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */