package com.sagar.taxiapp.b;

import android.content.Context;
import java.util.List;

final class b
  extends android.support.v4.b.a<List<com.sagar.taxiapp.beans.b>>
{
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(List<com.sagar.taxiapp.beans.b> paramList)
  {
    super.b(paramList);
    a.a(paramList);
  }
  
  public List<com.sagar.taxiapp.beans.b> u()
  {
    try
    {
      a.a().clear();
      a.b().clear();
      com.scootapp.tv.b.a.a(a.a());
      return a.a();
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */