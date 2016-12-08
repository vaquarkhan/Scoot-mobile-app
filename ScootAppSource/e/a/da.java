package e.a;

import java.util.Comparator;

final class da
  implements Comparator<bs>
{
  da(cz paramcz) {}
  
  public int a(bs parambs1, bs parambs2)
  {
    int j = 1;
    int i;
    if ((parambs1 == null) && (parambs2 == null)) {
      i = 0;
    }
    do
    {
      do
      {
        return i;
        if (parambs1 == null) {
          return -1;
        }
        i = j;
      } while (parambs2 == null);
      i = j;
    } while (parambs1.f() > parambs2.f());
    if (parambs1.f() == parambs2.f()) {
      return 0;
    }
    return -1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */