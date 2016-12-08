package com.scootapp.tv.d;

import java.util.Comparator;

final class b
  implements Comparator<String>
{
  public int a(String paramString1, String paramString2)
  {
    int j = 0;
    for (;;)
    {
      try
      {
        int i = Integer.parseInt(paramString1);
        int k;
        paramString1.printStackTrace();
      }
      catch (Exception paramString1)
      {
        try
        {
          k = Integer.parseInt(paramString2);
          j = k;
          return j - i;
        }
        catch (Exception paramString1)
        {
          for (;;) {}
        }
        paramString1 = paramString1;
        i = 0;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */