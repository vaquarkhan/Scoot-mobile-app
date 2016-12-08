package com.tushar.taxiapp.scootapp;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;

final class y
  implements GetCallback<ParseObject>
{
  y(x paramx) {}
  
  public void done(ParseObject paramParseObject, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      paramParseObject.put("cancellationReason", "Changed my mind");
      paramParseObject.saveInBackground();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */