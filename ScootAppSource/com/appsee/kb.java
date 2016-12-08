package com.appsee;

import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class kb
  implements b
{
  private static final int M = 200;
  private static kb g;
  private final ArrayList<q> A;
  private int B;
  private int D;
  private ArrayList<Class<?>> E;
  private WeakReference<q> F;
  private final e G;
  private Object H;
  private boolean b;
  private final ArrayList<Object> c;
  private p e;
  private ml f;
  private ArrayList<Class<?>> h;
  private int i;
  private qi j;
  private mb k;
  private WeakReference<LinearLayout> l;
  private Object m;
  
  public static kb C()
  {
    try
    {
      if (g == null) {
        g = new kb();
      }
      kb localkb = g;
      return localkb;
    }
    finally {}
  }
  
  public q C()
  {
    if (this.F != null) {
      return (q)this.F.get();
    }
    return null;
  }
  
  public q C(View paramView)
  {
    Iterator localIterator = C().iterator();
    while (localIterator.hasNext())
    {
      q localq = (q)localIterator.next();
      if (localq.C() == paramView) {
        return localq;
      }
    }
    return null;
  }
  
  public List<q> C()
  {
    return Collections.unmodifiableList(this.A);
  }
  
  public void C(p paramp)
  {
    this.e = paramp;
  }
  
  public void C(q paramq, List<View> paramList)
  {
    if (this.e != null) {
      this.e.C(paramq, paramList);
    }
  }
  
  public void C(String paramString)
  {
    int i1 = 0;
    Object localObject1 = "";
    int n = 0;
    while (n < this.A.size())
    {
      Object localObject2 = (q)this.A.get(i1);
      WindowManager.LayoutParams localLayoutParams = ((q)localObject2).C().getAttributes();
      localObject1 = new StringBuilder().insert(0, (String)localObject1).append(C((q)localObject2)).append(wc.C("\036")).append(((q)localObject2).C().isShown()).append(lb.C("!")).append(localLayoutParams.type);
      localObject2 = wc.C("]\032");
      n = i1 + 1;
      localObject1 = (String)localObject2;
      i1 = n;
    }
    vd.H(1, lb.C("\036LwUzTiH\004;") + (String)localObject1);
  }
  
  public Object[] C()
  {
    Object localObject = lc.C(this.H, wc.C("\031`\035S\003E"));
    if ((localObject instanceof Object[])) {
      return (Object[])localObject;
    }
    if ((localObject instanceof List)) {
      return ((List)localObject).toArray();
    }
    this.D += 1;
    if (this.D > 4) {
      throw new Exception(lb.C("ku_yR~\036oQ;Y~J;LtQo\036mW~Ih\036zLi_b\036}LtS;IrPQl\036v_u_|[i"));
    }
    return null;
  }
  
  public void D()
  {
    this.j.C();
    if (this.k != null) {
      this.k.C();
    }
    i();
  }
  
  public void M()
  {
    ei.H(this.G);
  }
  
  public void h()
  {
    try
    {
      if (this.H == null) {
        K();
      }
      this.b = false;
      this.D = 0;
      this.f = wn.C().C(true);
      this.l = null;
      this.F = null;
      this.B = 0;
      this.i = 0;
      this.k = new mb(new nb(this), 200);
      this.k.H();
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, lb.C("{iLtL;Y~JoWuY;JtN;R~H~R;IrPQl\036v_u_|[i\022;_yQiJrP|\036h]i[~P;Z~J~]oWtP5\0205"));
      throw localException;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */