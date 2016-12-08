package com.sagar.taxiapp.b;

import android.support.v4.widget.SwipeRefreshLayout;
import com.parse.FunctionCallback;
import com.parse.ParseException;

final class z
  implements FunctionCallback<Object>
{
  z(v paramv, String paramString1, String paramString2) {}
  
  public void done(Object paramObject, ParseException paramParseException)
  {
    this.c.au = 0;
    if ((paramObject != null) && (!paramObject.toString().isEmpty())) {
      if (paramObject.toString().equalsIgnoreCase("success")) {
        v.b(this.c, this.a, this.b);
      }
    }
    while (paramParseException == null)
    {
      return;
      if (paramObject.toString().equalsIgnoreCase("distance_exceeded"))
      {
        this.c.e.setRefreshing(false);
        this.c.b("Distance is more than 100 miles");
        return;
      }
      this.c.e.setRefreshing(false);
      this.c.b("Some error occured on Server");
      return;
    }
    paramParseException.printStackTrace();
    v.b(this.c, this.a, this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */