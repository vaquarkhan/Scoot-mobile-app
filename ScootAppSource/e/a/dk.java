package e.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class dk
{
  public static dl<List<ag>> a(List<ag> paramList, bz parambz, long paramLong)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    paramList = paramList.listIterator();
    ag localag;
    for (long l = 0L;; l = localag.a() + l)
    {
      if (paramList.hasNext())
      {
        localag = (ag)paramList.next();
        if (localag.a() + l <= paramLong) {
          break label206;
        }
        int i = (int)(paramLong - l);
        int j = parambz.a(i);
        parambz = new ag(i, localag.b(), 1.0F);
        localag = new ag(localag.a() - i, j + localag.b(), 1.0F);
        paramList.remove();
        if (parambz.a() > 0L)
        {
          paramList.add(parambz);
          localArrayList1.add(parambz);
        }
        if (localag.a() > 0L)
        {
          paramList.add(localag);
          localArrayList2.add(localag);
        }
      }
      while (paramList.hasNext()) {
        localArrayList2.add(paramList.next());
      }
      label206:
      localArrayList1.add(localag);
    }
    return new dl(localArrayList1, localArrayList2);
  }
  
  public static List<ag> a(bz parambz, List<ag> paramList1, List<ag> paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    paramList1 = new ArrayList(paramList1);
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext())
    {
      ag localag = (ag)paramList2.next();
      long l = parambz.a(localag.b());
      paramList1 = a((List)a(paramList1, parambz.c(), l).b(), parambz.c(), l + localag.a());
      localArrayList.addAll((Collection)paramList1.a());
      paramList1 = (List)paramList1.b();
    }
    return localArrayList;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */