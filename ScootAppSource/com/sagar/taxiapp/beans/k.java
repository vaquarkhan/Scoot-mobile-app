package com.sagar.taxiapp.beans;

import java.util.Comparator;

final class k
  implements Comparator<h>
{
  public int a(h paramh1, h paramh2)
  {
    float f2 = 0.0F;
    for (;;)
    {
      try
      {
        float f1 = Float.parseFloat(paramh1.c.split(" ")[0]);
        float f3;
        paramh1.printStackTrace();
      }
      catch (Exception paramh1)
      {
        try
        {
          f3 = Float.parseFloat(paramh2.c.split(" ")[0]);
          f2 = f3;
          return (int)(f2 - f1);
        }
        catch (Exception paramh1)
        {
          for (;;) {}
        }
        paramh1 = paramh1;
        f1 = 0.0F;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */