package com.sagar.taxiapp.beans;

import java.util.Comparator;

final class i
  implements Comparator<h>
{
  public int a(h paramh1, h paramh2)
  {
    float f2 = 0.0F;
    try
    {
      float f1;
      if ((!"0".equals(paramh1.a)) && (paramh1.a != null) && (!paramh1.a.equalsIgnoreCase("na")))
      {
        if (("0".equals(paramh2.a)) || (paramh2.a == null) || (paramh2.a.equalsIgnoreCase("na"))) {
          break label219;
        }
        paramh1 = paramh1.a;
        paramh2 = paramh2.a;
        if (paramh1.substring(1, paramh1.length()).contains("-")) {
          f1 = Float.parseFloat(paramh1.substring(1, paramh1.length()).split("-")[0]);
        }
      }
      float f3;
      return 1;
    }
    catch (Exception paramh1)
    {
      for (;;)
      {
        try
        {
          if (paramh2.substring(1, paramh2.length()).contains("-"))
          {
            f3 = Float.parseFloat(paramh2.substring(1, paramh2.length()).split("-")[0]);
            f2 = f3;
            return (int)(f2 - f1);
            f1 = Float.parseFloat(paramh1.substring(1, paramh1.length()));
            continue;
          }
          f3 = Float.parseFloat(paramh2.substring(1, paramh2.length()));
          f2 = f3;
          continue;
          paramh1 = paramh1;
          f1 = 0.0F;
        }
        catch (Exception paramh1)
        {
          continue;
        }
        paramh1.printStackTrace();
      }
    }
    label219:
    return -1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */