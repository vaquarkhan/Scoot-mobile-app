package com.appsee;

import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

class k
{
  private static final int E = 100;
  private static k H;
  private static final int e = 10;
  private static final int k = 2000;
  private Thread A;
  private long B;
  private long C;
  private Dimension D;
  private List<vc> F;
  private xb G;
  private qi I;
  private Dimension J;
  private final Rect K;
  private String L;
  private int M;
  private int O;
  private boolean R;
  private qi S;
  private final List<String> a;
  private pd b;
  private boolean c;
  private Paint d;
  private Exception f;
  private boolean g;
  private final List<Class<?>> h;
  private boolean i;
  private qi j;
  private mb l;
  private long m;
  private boolean n;
  private qi o;
  private final HashMap<View, Rect> p;
  private long q;
  private int r;
  private final Object t;
  private bd v;
  
  public static k C()
  {
    try
    {
      if (H == null) {
        H = new k();
      }
      k localk = H;
      return localk;
    }
    finally {}
  }
  
  public long C()
  {
    return this.q;
  }
  
  public bd C()
  {
    synchronized (this.t)
    {
      bd localbd = this.v;
      this.v = null;
      return localbd;
    }
  }
  
  public void C(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean C()
  {
    return this.c;
  }
  
  public bd H()
  {
    for (;;)
    {
      synchronized (this.t)
      {
        bd localbd = this.v;
        if (localbd == null) {
          try
          {
            this.v = this.b.C();
            localbd = this.v;
            return localbd;
          }
          catch (Exception localException)
          {
            this.v = null;
            continue;
          }
        }
      }
      vd.C(1, nc.C("\0136&-1#00d/13(0(-<!\003\023d=19\":6\"06*0d-!>70*"));
    }
  }
  
  public void H(boolean paramBoolean)
  {
    int i1 = 100;
    int i3 = 0;
    int i4 = 0;
    int i2 = 0;
    try
    {
      String str1;
      if (!this.i)
      {
        ue.C(nc.C("\034%3(: \"6*677\026:'06;-1#37!1d1++d-!<+- 6*8j"));
        if (this.l != null)
        {
          this.l.C();
          this.l = null;
        }
        this.n = true;
        this.i = false;
        vd.H(1, nc.C("\t>64!;d-!<+- 6*8dbd\021\013"));
        i3 = i1;
        for (;;)
        {
          if ((this.g) || (i2 >= i3)) {
            break label147;
          }
          str1 = nc.C("\023>-+-1#\"0626 :+00d=!6:%;=");
          i4 = i2 + 1;
          vd.H(1, str1);
          Thread.sleep(100L);
          i1 = i3;
          i2 = i4;
          if (this.G == null) {
            break;
          }
          i1 = i3;
          i2 = i4;
          if (!this.G.C()) {
            break;
          }
          i3 = 300;
          i2 = i4;
        }
        label147:
        a();
        c();
        if (paramBoolean) {
          I();
        }
        if (i2 >= i3)
        {
          this.A.interrupt();
          j();
          ue.H(new Exception(), nc.C("\013-2!01+d(%606*8d9+-d)-;!0d++&:d-!> &j"));
        }
        return;
      }
      this.o.C();
      this.j.C();
      this.I.C();
      this.S.C();
      return;
    }
    finally
    {
      if (this.l != null)
      {
        this.l.C();
        this.l = null;
      }
      this.n = true;
      this.i = false;
      vd.H(1, nc.C("\t>64!;d-!<+- 6*8dbd\021\013"));
      i2 = i4;
      i3 = i1;
      for (;;)
      {
        if ((this.g) || (i2 >= i3)) {
          break label523;
        }
        String str2 = nc.C("\023>-+-1#\"0626 :+00d=!6:%;=");
        i4 = i2 + 1;
        vd.H(1, str2);
        Thread.sleep(100L);
        i1 = i3;
        i2 = i4;
        if (this.G == null) {
          break;
        }
        i1 = i3;
        i2 = i4;
        if (!this.G.C()) {
          break;
        }
        i3 = 300;
        i2 = i4;
      }
      label523:
      a();
      c();
      if (paramBoolean) {
        I();
      }
      if (i2 >= i3)
      {
        this.A.interrupt();
        j();
        ue.H(new Exception(), nc.C("\013-2!01+d(%606*8d9+-d)-;!0d++&:d-!> &j"));
      }
    }
  }
  
  public boolean H()
  {
    return this.i;
  }
  
  public void I()
  {
    this.q = 0L;
  }
  
  public void a()
  {
    this.n = false;
  }
  
  public void a(boolean paramBoolean)
  {
    this.R = paramBoolean;
  }
  
  public boolean a()
  {
    return this.n;
  }
  
  public void c()
  {
    this.i = false;
    this.C = 0L;
    this.M = 0;
    this.R = true;
    if (this.l != null) {
      this.l.C();
    }
    this.o.a();
    this.j.a();
    this.I.a();
    this.S.a();
    if (this.b != null)
    {
      this.b.C();
      C();
    }
  }
  
  public void i()
  {
    if (this.i)
    {
      ue.C(nc.C("\034%3(: 4-!/%-!\036*;\027+%-0\r!<+- 6*8d(,:*%36:%;=6:'06;-1#"));
      return;
    }
    if (this.J == null) {
      this.J = wn.C().C(true);
    }
    this.D = new Dimension(ye.C().A(), ye.C().C());
    this.r = (ye.C().a() * 1024);
    this.O = ((int)ye.C().a());
    c();
    I();
    if (this.b == null) {
      this.b = new pd(2, this.D.getWidth(), this.D.getHeight());
    }
    synchronized (this.F)
    {
      this.F.clear();
      this.L = hp.H(String.format(nc.C("a,jz7"), new Object[] { ye.C().a(), "mp4" })).getAbsolutePath();
      vd.C(1, nc.C("\0226 :+4>07dbdz7"), new Object[] { this.L });
      ??? = new CountDownLatch(1);
      this.A = new Thread(new y(this, (CountDownLatch)???), nc.C("\0364/7:!\t-;!0\024-+<!,706"));
      this.i = true;
      this.g = false;
      this.A.start();
      ((CountDownLatch)???).await();
      if (this.f != null)
      {
        throw this.f;
        this.b.H(2, this.D.getWidth(), this.D.getHeight());
      }
    }
    C();
    this.l = new mb(new s(this), 1000 / this.O);
    this.l.H();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */