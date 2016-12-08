package com.appsee;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class zc
{
  private static zc l;
  private List<wc> A;
  private List<yc> G;
  
  public static zc C()
  {
    try
    {
      if (l == null) {
        l = new zc();
      }
      zc localzc = l;
      return localzc;
    }
    finally {}
  }
  
  public wc C()
  {
    synchronized (this.A)
    {
      if (!this.A.isEmpty())
      {
        wc localwc = (wc)this.A.get(this.A.size() - 1);
        return localwc;
      }
      return null;
    }
  }
  
  public JSONArray C()
  {
    synchronized (this.A)
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.A.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((wc)localIterator.next()).C());
      }
      return localJSONArray;
    }
  }
  
  public void C()
  {
    synchronized (this.A)
    {
      this.A.clear();
    }
    synchronized (this.G)
    {
      this.G.clear();
      return;
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
  }
  
  public void C(yc paramyc, String arg2)
  {
    if ((!fc.C().C()) || (!ye.C().h())) {
      return;
    }
    synchronized (this.G)
    {
      this.G.add(paramyc);
      vd.C(1, zb.C("nxKyK<AyX<_s_i_<K}[}\025<\no"), new Object[] { paramyc.a() });
      return;
    }
  }
  
  public void C(String arg1, xc paramxc, boolean paramBoolean)
  {
    if (??? == null) {
      ??? = "";
    }
    for (;;)
    {
      Object localObject;
      if (paramBoolean)
      {
        localObject = new AppseeScreenInfo(???);
        ei.C(new kc(this, (AppseeScreenInfo)localObject), false);
        if (bb.C(((AppseeScreenInfo)localObject).getScreenName())) {
          return;
        }
        if (!???.equals(((AppseeScreenInfo)localObject).getScreenName()))
        {
          ??? = ((AppseeScreenInfo)localObject).getScreenName();
          paramBoolean = false;
        }
      }
      for (;;)
      {
        wc localwc = C();
        if ((localwc != null) && (bb.C(localwc.C(), ???)))
        {
          vd.C(1, nc.C("\r8*066*8d,%2!7<6:!1d+36':drdz7"), new Object[] { ??? });
          return;
        }
        localObject = new wc(???, fc.C().C(), paramBoolean, paramxc);
        if (((wc)localObject).C() < 0L) {
          ((wc)localObject).C(0L);
        }
        if ((localwc != null) && (localwc.C() == ((wc)localObject).C()) && (localwc.C() != 0L)) {
          vd.H(1, zb.C(".\017oLnJyAo\003<\\}By\017hFqJ0\017pNo[<Fo\017kFrAuA{"));
        }
        synchronized (this.A)
        {
          this.A.remove(localwc);
          vd.C(1, nc.C("\027+%-06*8d,'-!:*!)!10edz70&4:dbdz7%+dz "), new Object[] { ???, paramxc.toString(), Long.valueOf(((wc)localObject).C()) });
          synchronized (this.A)
          {
            this.A.add(localObject);
            return;
          }
        }
      }
    }
  }
  
  public JSONArray H()
  {
    synchronized (this.G)
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.G.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((yc)localIterator.next()).C());
      }
      return localJSONArray;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */