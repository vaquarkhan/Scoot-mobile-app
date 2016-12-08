package com.sagar.taxiapp.a;

import android.util.Log;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import java.util.List;

final class ad
  implements FindCallback<ParseObject>
{
  ad(ab paramab) {}
  
  public void done(List<ParseObject> paramList, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      ((ParseObject)paramList.get(0)).put("status", "cancelled");
      ((ParseObject)paramList.get(0)).put("refundAmount", "" + this.a.b);
      ((ParseObject)paramList.get(0)).saveInBackground();
      return;
    }
    Log.d("score", "Error: " + paramParseException.getMessage());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */