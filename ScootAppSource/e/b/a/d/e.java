package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class e
  implements ab, ad
{
  private final ad[] a;
  private final ab[] b;
  private final int c;
  private final int d;
  
  e(List<Object> paramList)
  {
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    a(paramList, localArrayList2, localArrayList1);
    if ((localArrayList2.contains(null)) || (localArrayList2.isEmpty())) {
      this.a = null;
    }
    for (this.c = 0; (localArrayList1.contains(null)) || (localArrayList1.isEmpty()); this.c = j)
    {
      this.b = null;
      this.d = 0;
      return;
      m = localArrayList2.size();
      this.a = new ad[m];
      i = 0;
      j = 0;
      while (i < m)
      {
        paramList = (ad)localArrayList2.get(i);
        j += paramList.a();
        this.a[i] = paramList;
        i += 1;
      }
    }
    int m = localArrayList1.size();
    this.b = new ab[m];
    int j = 0;
    int i = k;
    while (i < m)
    {
      paramList = (ab)localArrayList1.get(i);
      j += paramList.b();
      this.b[i] = paramList;
      i += 1;
    }
    this.d = j;
  }
  
  private void a(List<Object> paramList1, List<Object> paramList2, List<Object> paramList3)
  {
    int j = paramList1.size();
    int i = 0;
    if (i < j)
    {
      Object localObject = paramList1.get(i);
      if ((localObject instanceof e))
      {
        a(paramList2, ((e)localObject).a);
        label49:
        localObject = paramList1.get(i + 1);
        if (!(localObject instanceof e)) {
          break label103;
        }
        a(paramList3, ((e)localObject).b);
      }
      for (;;)
      {
        i += 2;
        break;
        paramList2.add(localObject);
        break label49;
        label103:
        paramList3.add(localObject);
      }
    }
  }
  
  private void a(List<Object> paramList, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      int i = 0;
      while (i < paramArrayOfObject.length)
      {
        paramList.add(paramArrayOfObject[i]);
        i += 1;
      }
    }
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    ab[] arrayOfab = this.b;
    if (arrayOfab == null) {
      throw new UnsupportedOperationException();
    }
    int k = arrayOfab.length;
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while ((paramInt < k) && (i >= 0))
    {
      i = arrayOfab[paramInt].a(params, paramCharSequence, i);
      paramInt += 1;
    }
    return i;
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    ad[] arrayOfad = this.a;
    if (arrayOfad == null) {
      throw new UnsupportedOperationException();
    }
    if (paramLocale == null) {
      paramLocale = Locale.getDefault();
    }
    for (;;)
    {
      int j = arrayOfad.length;
      int i = 0;
      while (i < j)
      {
        arrayOfad[i].a(paramAppendable, paramLong, parama, paramInt, parami, paramLocale);
        i += 1;
      }
      return;
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  boolean c()
  {
    return this.a != null;
  }
  
  boolean d()
  {
    return this.b != null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */