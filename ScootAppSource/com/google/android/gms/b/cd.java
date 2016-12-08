package com.google.android.gms.b;

import com.google.android.gms.common.api.k;
import java.util.ArrayList;
import java.util.Iterator;

final class cd
  extends ch
{
  private final ArrayList<k> c;
  
  public cd(ArrayList<k> paramArrayList)
  {
    super(paramArrayList, null);
    ArrayList localArrayList;
    this.c = localArrayList;
  }
  
  public void a()
  {
    bx.d(this.a).g.d = bx.g(this.a);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((k)localIterator.next()).a(bx.h(this.a), bx.d(this.a).g.d);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */