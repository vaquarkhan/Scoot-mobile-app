package com.sagar.taxiapp.beans;

import java.util.Comparator;

final class d
  implements Comparator<c>
{
  public int a(c paramc1, c paramc2)
  {
    int j = 0;
    try
    {
      int i;
      if ((!"0".equals(paramc1.g)) && (paramc1.g != null) && (!paramc1.g.equalsIgnoreCase("na")))
      {
        if ((!"0".equals(paramc2.g)) && (paramc2.g != null) && (!paramc2.g.equalsIgnoreCase("na"))) {
          i = Integer.parseInt(paramc1.g);
        }
      }
      else
      {
        int k;
        return 1;
      }
    }
    catch (Exception paramc1)
    {
      for (;;)
      {
        try
        {
          k = Integer.parseInt(paramc2.g);
          j = k;
          return j - i;
        }
        catch (Exception paramc1)
        {
          continue;
        }
        paramc1 = paramc1;
        i = 0;
        paramc1.printStackTrace();
      }
    }
    return -1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */