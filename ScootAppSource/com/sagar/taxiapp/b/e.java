package com.sagar.taxiapp.b;

import android.content.Context;
import android.support.v4.b.a;
import java.util.List;

final class e
  extends a<List<com.sagar.taxiapp.beans.b>>
{
  public e(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(List<com.sagar.taxiapp.beans.b> paramList)
  {
    super.b(paramList);
    d.a(paramList);
  }
  
  public List<com.sagar.taxiapp.beans.b> u()
  {
    try
    {
      d.a().clear();
      d.b().clear();
      com.scootapp.tv.b.b.a(d.a());
      return d.a();
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */