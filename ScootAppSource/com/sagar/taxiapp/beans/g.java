package com.sagar.taxiapp.beans;

import java.util.Comparator;

final class g
  implements Comparator<c>
{
  public int a(c paramc1, c paramc2)
  {
    float f2 = 0.0F;
    for (;;)
    {
      try
      {
        float f1 = Float.parseFloat(paramc1.j.split(" ")[0]);
        float f3;
        paramc1.printStackTrace();
      }
      catch (Exception paramc1)
      {
        try
        {
          f3 = Float.parseFloat(paramc2.j.split(" ")[0]);
          f2 = f3;
          return (int)(f1 - f2);
        }
        catch (Exception paramc1)
        {
          for (;;) {}
        }
        paramc1 = paramc1;
        f1 = 0.0F;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */