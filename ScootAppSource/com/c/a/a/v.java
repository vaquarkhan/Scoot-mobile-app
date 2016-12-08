package com.c.a.a;

import java.util.Set;

final class v
  implements r
{
  static final Set<ae> b = new w();
  final int a;
  
  public v(int paramInt)
  {
    this.a = paramInt;
  }
  
  public boolean a(ab paramab)
  {
    int i;
    if ((b.contains(paramab.c)) && (paramab.a.g == null))
    {
      i = 1;
      if (Math.abs(paramab.a.c.hashCode() % this.a) == 0) {
        break label65;
      }
    }
    label65:
    for (int j = 1;; j = 0)
    {
      if ((i == 0) || (j == 0)) {
        break label70;
      }
      return true;
      i = 0;
      break;
    }
    label70:
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */