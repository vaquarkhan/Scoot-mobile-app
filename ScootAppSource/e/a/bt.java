package e.a;

import java.util.Comparator;

final class bt
  implements Comparator<bs>
{
  public int a(bs parambs1, bs parambs2)
  {
    int j = -1;
    int i;
    if ((parambs1 == null) && (parambs2 == null)) {
      i = 0;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (parambs1 == null);
      if (parambs2 == null) {
        return 1;
      }
      i = j;
    } while (bs.a(parambs1) < bs.a(parambs2));
    if (bs.a(parambs1) == bs.a(parambs2)) {
      return 0;
    }
    return 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */