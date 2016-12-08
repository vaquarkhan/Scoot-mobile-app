package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class et
{
  private SparseArray<ArrayList<fd>> a = new SparseArray();
  private SparseIntArray b = new SparseIntArray();
  private int c = 0;
  
  private ArrayList<fd> b(int paramInt)
  {
    ArrayList localArrayList2 = (ArrayList)this.a.get(paramInt);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList2 = new ArrayList();
      this.a.put(paramInt, localArrayList2);
      localArrayList1 = localArrayList2;
      if (this.b.indexOfKey(paramInt) < 0)
      {
        this.b.put(paramInt, 5);
        localArrayList1 = localArrayList2;
      }
    }
    return localArrayList1;
  }
  
  public fd a(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      paramInt = localArrayList.size() - 1;
      fd localfd = (fd)localArrayList.get(paramInt);
      localArrayList.remove(paramInt);
      return localfd;
    }
    return null;
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  void a(ed paramed)
  {
    this.c += 1;
  }
  
  void a(ed paramed1, ed paramed2, boolean paramBoolean)
  {
    if (paramed1 != null) {
      b();
    }
    if ((!paramBoolean) && (this.c == 0)) {
      a();
    }
    if (paramed2 != null) {
      a(paramed2);
    }
  }
  
  public void a(fd paramfd)
  {
    int i = paramfd.h();
    ArrayList localArrayList = b(i);
    if (this.b.get(i) <= localArrayList.size()) {
      return;
    }
    paramfd.v();
    localArrayList.add(paramfd);
  }
  
  void b()
  {
    this.c -= 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */