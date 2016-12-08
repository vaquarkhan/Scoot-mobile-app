package com.sagar.taxiapp.b;

import android.util.Log;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import java.util.List;

final class ab
  implements FindCallback<ParseObject>
{
  ab(v paramv, int paramInt, ParseUser paramParseUser) {}
  
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */