package com.appsee;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class rc
{
  private static rc l;
  private HashMap<WeakReference<View>, Rect> A;
  private HashSet<WeakReference<View>> G;
  
  public static rc C()
  {
    try
    {
      if (l == null) {
        l = new rc();
      }
      rc localrc = l;
      return localrc;
    }
    finally {}
  }
  
  public HashMap<WeakReference<View>, Rect> C()
  {
    return this.A;
  }
  
  public void C(View paramView)
  {
    ArrayList localArrayList;
    synchronized (this.G)
    {
      localArrayList = new ArrayList();
      Iterator localIterator = this.G.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference.get() == null) || (((View)localWeakReference.get()).equals(paramView))) {
          localArrayList.add(localWeakReference);
        }
      }
    }
    this.G.removeAll(localArrayList);
  }
  
  public void C(List<View> paramList)
  {
    int i;
    int j;
    do
    {
      synchronized (this.A)
      {
        this.A.clear();
        if ((!fc.C().C()) || (paramList == null) || (paramList.isEmpty())) {
          return;
        }
      }
      i = 0;
      j = 0;
    } while (i >= paramList.size());
    ??? = (View)paramList.get(j);
    if (C((View)???)) {}
    for (;;)
    {
      i = j + 1;
      j = i;
      break;
      if (((View)???).isShown()) {
        C((View)???, paramList);
      }
    }
  }
  
  public boolean C()
  {
    Object localObject = ye.C().H();
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (str.startsWith(nc.C(",'-!:*")))
        {
          str = str.split(kl.C("}"))[1];
          wc localwc = zc.C().C();
          if ((localwc != null) && (localwc.C().equalsIgnoreCase(str))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public void H(View paramView)
  {
    synchronized (this.G)
    {
      this.G.add(new WeakReference(paramView));
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */