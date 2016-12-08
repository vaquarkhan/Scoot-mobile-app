package com.appsee;

import android.view.Display;

public class zk
{
  private static final int D = 500;
  private Dimension[] A = new Dimension[2];
  private ml B;
  private long G;
  private long M;
  private long l;
  
  public zk()
  {
    this.A[0] = new Dimension();
    this.A[1] = new Dimension();
  }
  
  public Dimension C()
  {
    return C(false);
  }
  
  public Dimension C(boolean paramBoolean)
  {
    if ((paramBoolean) || (wn.C() - this.l > 500L)) {
      H();
    }
    return this.A[1];
  }
  
  public ml C()
  {
    return C(false);
  }
  
  public ml C(boolean paramBoolean)
  {
    if ((paramBoolean) || (wn.C() - this.M > 500L)) {
      a();
    }
    return this.B;
  }
  
  public void C()
  {
    Display localDisplay = wn.H();
    this.B = wn.H(localDisplay);
    wn.H(this.A, localDisplay, this.B);
    long l1 = wn.C();
    this.M = l1;
    this.l = l1;
    this.G = l1;
  }
  
  public boolean C(boolean paramBoolean)
  {
    return wn.C(C(paramBoolean));
  }
  
  public Dimension[] C()
  {
    return C(false);
  }
  
  public Dimension[] C(boolean paramBoolean)
  {
    if ((paramBoolean) || (wn.C() - this.G > 500L)) {
      C();
    }
    return this.A;
  }
  
  public void a()
  {
    this.B = wn.H(wn.H());
    this.M = wn.C();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */