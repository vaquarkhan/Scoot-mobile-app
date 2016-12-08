package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ah
  extends v
{
  List<v> p;
  
  ah(List<v> paramList)
  {
    this.p = paramList;
  }
  
  public v a(v paramv)
  {
    ArrayList localArrayList = new ArrayList(this.p);
    localArrayList.add((v)b.a(paramv));
    return new ah(localArrayList);
  }
  
  public boolean b(char paramChar)
  {
    Iterator localIterator = this.p.iterator();
    while (localIterator.hasNext()) {
      if (((v)localIterator.next()).b(paramChar)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */