package com.sagar.taxiapp.b;

import android.content.Context;
import android.support.v4.b.a;
import com.sagar.taxiapp.beans.OlaBookingObject;
import com.scootapp.tv.b.c;
import java.util.List;

final class g
  extends a<List<OlaBookingObject>>
{
  public g(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(List<OlaBookingObject> paramList)
  {
    super.b(paramList);
    f.a(paramList);
  }
  
  public List<OlaBookingObject> u()
  {
    try
    {
      f.a().clear();
      f.b().clear();
      c.a(f.a());
      return f.a();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */