package com.tushar.taxiapp.scootapp;

import android.widget.RatingBar;
import android.widget.Toast;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;

final class ak
  implements GetCallback<ParseObject>
{
  ak(aj paramaj) {}
  
  public void done(ParseObject paramParseObject, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      paramParseObject.put("rating", Float.valueOf(RideCompletionActivity.j(this.a.a).getRating()));
      paramParseObject.put("ratingReasons", RideCompletionActivity.n(this.a.a));
      paramParseObject.put("comments", RideCompletionActivity.o(this.a.a));
      paramParseObject.saveInBackground();
      return;
    }
    Toast.makeText(this.a.a, "Oops something went wrong. Please try again.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */