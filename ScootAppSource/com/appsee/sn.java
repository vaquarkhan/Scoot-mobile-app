package com.appsee;

import android.view.Menu;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class sn
{
  private static sn G;
  private String A;
  private boolean l;
  
  public static sn C()
  {
    try
    {
      if (G == null) {
        G = new sn();
      }
      sn localsn = G;
      return localsn;
    }
    finally {}
  }
  
  public void C()
  {
    C(null, null);
  }
  
  public void C(q paramq, int paramInt)
  {
    Object localObject2 = ab.C(paramq.C(), AbsListView.class);
    AbsListView localAbsListView = (AbsListView)ab.a((List)localObject2);
    if (localAbsListView == null) {}
    Object localObject1;
    do
    {
      return;
      localObject1 = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (View)((Iterator)localObject2).next();
        if ((((View)localObject3).isShown()) && (((View)localObject3).getWidth() > 0) && (((View)localObject3).getHeight() > 0))
        {
          localObject3 = (AbsListView)localObject3;
          paramInt = 0;
          for (int i = 0; paramInt < ((AbsListView)localObject3).getChildCount(); i = paramInt)
          {
            Iterator localIterator = ab.C(((AbsListView)localObject3).getChildAt(i), TextView.class).iterator();
            while (localIterator.hasNext()) {
              ((List)localObject1).add(((TextView)localIterator.next()).getText().toString());
            }
            paramInt = i + 1;
          }
        }
      }
      localObject2 = new StringBuilder(((List)localObject1).size() * 50);
      ((StringBuilder)localObject2).append(((List)localObject1).size());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((StringBuilder)localObject2).append((String)((Iterator)localObject1).next());
      }
      localObject1 = String.format(kl.C("~\"]2\0264"), new Object[] { bb.a(((StringBuilder)localObject2).toString()) });
    } while (!C(paramq, (String)localObject1));
    if (ab.H(localAbsListView)) {}
    for (paramq = xc.l;; paramq = xc.M)
    {
      zc.C().C((String)localObject1, xc.M, true);
      return;
    }
  }
  
  public void H()
  {
    if (!C()) {}
    Object localObject2;
    Object localObject3;
    Object localObject1;
    do
    {
      return;
      localObject2 = kb.C().C();
      localObject3 = ((q)localObject2).C();
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = localObject2;
      }
      localObject3 = C(localObject1);
      switch (lo.l[localObject3.ordinal()])
      {
      default: 
        localObject2 = C((q)localObject1);
      }
    } while (!C(localObject1, (String)localObject2));
    zc.C().C((String)localObject2, (xc)localObject3, true);
    vd.C(1, lb.C("]QnP\036u[l\036zKoQ;MxL~[u\004;\033h"), new Object[] { localObject2 });
    return;
    if ((localObject1 instanceof Menu))
    {
      C((q)localObject2, (Menu)localObject1);
      return;
    }
    C((q)localObject1, 0);
    return;
    H((q)localObject1, 0);
  }
  
  public boolean H()
  {
    return this.l;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\sn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */