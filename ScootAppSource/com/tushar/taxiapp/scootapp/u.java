package com.tushar.taxiapp.scootapp;

import android.util.Log;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import java.util.List;

final class u
  implements FindCallback<ParseObject>
{
  u(OlaBooking paramOlaBooking, int paramInt, ParseUser paramParseUser) {}
  
  public void done(List<ParseObject> paramList, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      if (paramList.size() > 0)
      {
        paramList = (ParseObject)paramList.get(0);
        paramList.put("percentSaved", Integer.valueOf((paramList.getInt("percentSaved") + this.a) / 2));
        paramList.saveInBackground();
        return;
      }
      paramList = new ParseObject("olaSavedMoney");
      paramList.put("emailId", this.b.getEmail());
      paramList.put("percentSaved", Integer.valueOf(this.a));
      paramList.saveInBackground();
      return;
    }
    Log.d("score", "Error: " + paramParseException.getMessage());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */