package com.appsee;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.util.List;

class fd
  implements c, p, z
{
  private static fd A;
  private boolean B;
  private Runnable D;
  private boolean G;
  private boolean M;
  private Handler f;
  private boolean l;
  
  public static fd C()
  {
    try
    {
      if (A == null) {
        A = new fd();
      }
      fd localfd = A;
      return localfd;
    }
    finally {}
  }
  
  public void A(boolean paramBoolean)
  {
    this.l = false;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.appsee.Action.UploadMode", paramBoolean);
    ei.C(kj.f, localBundle);
  }
  
  public void C()
  {
    if (fc.C().C()) {
      sn.C().H();
    }
  }
  
  public void C(he paramhe)
  {
    if (fc.C().C())
    {
      k.C().a();
      vd.H(2, wc.C("'S\007E\035Y\032\026\027D\025E\034S\020\032TC\004Z\033W\020_\032Q"));
      fc.C().C(true);
      fc.C().C(paramhe);
      this.l = false;
      H(true);
    }
    while (!k.C().a()) {
      return;
    }
    this.l = false;
    H(true);
  }
  
  public void C(ml paramml)
  {
    fc.C().C(paramml);
  }
  
  public void C(q paramq)
  {
    paramq.K();
    if (fc.C().C()) {
      paramq.C();
    }
  }
  
  public void C(q paramq, List<View> paramList)
  {
    paramq.H(paramList);
  }
  
  public void C(String paramString)
  {
    uj.C().C(paramString);
  }
  
  public void C(boolean paramBoolean)
  {
    kl localkl = uj.C().C(tl.E);
    if ((localkl != null) && (fc.C().C() - localkl.C() <= 1250L))
    {
      vd.C(1, wc.C("'S\000B\035X\023\026\022C\030Z\007U\006S\021XT]\021O\026Y\025D\020\026\025U\000_\033XTS\002S\032BN\026QT"), new Object[] { Boolean.valueOf(paramBoolean) });
      if (!paramBoolean) {
        break label68;
      }
    }
    label68:
    for (String str = wc.C("\000D\001S");; str = wc.C("P\025Z\007S"))
    {
      localkl.H(str);
      return;
    }
  }
  
  public void C(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      uj localuj = uj.C();
      tl localtl = tl.E;
      if (paramBoolean2) {}
      for (String str = wc.C("\000D\001S");; str = wc.C("P\025Z\007S"))
      {
        localuj.C(localtl, str, null, null);
        return;
      }
    }
    uj.C().C(tl.B, null, null, null);
  }
  
  public void H()
  {
    ei.C(new cc(this));
  }
  
  public void H(String paramString)
  {
    if (this.M)
    {
      vd.H(2, wc.C("w\004F\007S\021\026\025Z\006S\025R\r\026\006C\032X\035X\023\030"));
      if ((!id.C()) && (!bp.H())) {
        id.C().H(wc.C("\025F\004E\021STD\021E\000W\006B\021R"));
      }
    }
    do
    {
      return;
      if (Build.VERSION.SDK_INT < 8)
      {
        vd.H(3, wc.C("w\004F\007S\021\026\006C\032ETY\032\026'r?\026\002S\006E\035Y\032\026L\026\\p\006Y\rY]\026\033DT^\035Q\034S\006\030"));
        ye.C().y(false);
        ye.C().O(false);
        return;
      }
      if (!this.B)
      {
        if (lc.C())
        {
          vd.H(3, wc.C("5F\004E\021SZE\000W\006B\\\037TE\034Y\001Z\020\026\026STU\025Z\030S\020\026\022D\033[TW\032\0265U\000_\002_\000OTW\032RTX\033BTP\006Y\031\026\000^\021\0265F\004Z\035U\025B\035Y\032\026\027Z\025E\007\032TW\026Y\006B\035X\023\030"));
          return;
        }
        if (!lc.H())
        {
          vd.H(3, wc.C("5F\004E\021SZE\000W\006B\\\037TE\034Y\001Z\020\026\026STU\025Z\030S\020\026\022D\033[TW\032\0265U\000_\002_\000OZY\032u\006S\025B\021\036]\026\033DTY\032d\021E\001[\021\036]\026\031S\000^\033R\007\026\033X\030OU\032TW\026Y\006B\035X\023\030"));
          return;
        }
      }
      if (!bp.C())
      {
        vd.H(3, wc.C("7W\032X\033BTQ\021BTW\004F\030_\027W\000_\033XTU\033X\000S\fB"));
        return;
      }
    } while (!C());
    this.M = true;
    hp.C();
    if ((!id.C()) && (bp.H()))
    {
      vd.H(3, wc.C("r\021B\021U\000S\020\026\001X\035BTB\021E\000_\032QX\026\007^\001B\000_\032QTR\033A\032\030Z\030"));
      return;
    }
    ye.C().K(paramString);
    kb.C().C(this);
    id.C().C(this);
    rd.C().C(this);
    id.C().K();
    kb.C().h();
    fb.C().C();
    ei.C(kj.l);
  }
  
  /* Error */
  public void H(boolean paramBoolean)
  {
    // Byte code:
    //   0: invokestatic 168	com/appsee/fc:C	()Lcom/appsee/fc;
    //   3: invokevirtual 170	com/appsee/fc:C	()Z
    //   6: istore_2
    //   7: invokestatic 118	com/appsee/ye:C	()Lcom/appsee/ye;
    //   10: invokevirtual 122	com/appsee/ye:a	()Ljava/lang/String;
    //   13: astore 4
    //   15: invokestatic 118	com/appsee/ye:C	()Lcom/appsee/ye;
    //   18: invokevirtual 346	com/appsee/ye:K	()I
    //   21: ifle +14 -> 35
    //   24: aload_0
    //   25: getfield 348	com/appsee/fd:f	Landroid/os/Handler;
    //   28: aload_0
    //   29: getfield 38	com/appsee/fd:D	Ljava/lang/Runnable;
    //   32: invokevirtual 354	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   35: invokestatic 168	com/appsee/fc:C	()Lcom/appsee/fc;
    //   38: invokevirtual 170	com/appsee/fc:C	()Z
    //   41: istore_3
    //   42: iload_3
    //   43: ifeq +9 -> 52
    //   46: invokestatic 168	com/appsee/fc:C	()Lcom/appsee/fc;
    //   49: invokevirtual 355	com/appsee/fc:H	()V
    //   52: invokestatic 183	com/appsee/k:C	()Lcom/appsee/k;
    //   55: invokevirtual 356	com/appsee/k:H	()Z
    //   58: istore_3
    //   59: iload_3
    //   60: ifeq +10 -> 70
    //   63: invokestatic 183	com/appsee/k:C	()Lcom/appsee/k;
    //   66: iconst_1
    //   67: invokevirtual 357	com/appsee/k:H	(Z)V
    //   70: invokestatic 183	com/appsee/k:C	()Lcom/appsee/k;
    //   73: invokevirtual 359	com/appsee/k:I	()V
    //   76: invokestatic 118	com/appsee/ye:C	()Lcom/appsee/ye;
    //   79: invokevirtual 362	com/appsee/ye:C	()Lcom/appsee/ro;
    //   82: getstatic 367	com/appsee/ro:l	Lcom/appsee/ro;
    //   85: if_acmpne +7 -> 92
    //   88: iconst_0
    //   89: invokestatic 368	com/appsee/vd:C	(Z)V
    //   92: new 370	com/appsee/pc
    //   95: dup
    //   96: aload_0
    //   97: aload 4
    //   99: invokespecial 373	com/appsee/pc:<init>	(Lcom/appsee/fd;Ljava/lang/String;)V
    //   102: iconst_1
    //   103: invokestatic 376	com/appsee/ei:C	(Lcom/appsee/o;Z)V
    //   106: iload_1
    //   107: ifeq +23 -> 130
    //   110: aload_0
    //   111: getfield 29	com/appsee/fd:l	Z
    //   114: ifne +16 -> 130
    //   117: iload_2
    //   118: ifeq +6 -> 124
    //   121: invokestatic 377	com/appsee/vd:C	()V
    //   124: invokestatic 382	com/appsee/qc:C	()Lcom/appsee/qc;
    //   127: invokevirtual 383	com/appsee/qc:H	()V
    //   130: return
    //   131: astore 5
    //   133: aload 5
    //   135: ldc_w 385
    //   138: invokestatic 47	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   141: invokestatic 145	com/appsee/ue:C	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   144: goto -92 -> 52
    //   147: astore 5
    //   149: invokestatic 183	com/appsee/k:C	()Lcom/appsee/k;
    //   152: invokevirtual 359	com/appsee/k:I	()V
    //   155: invokestatic 118	com/appsee/ye:C	()Lcom/appsee/ye;
    //   158: invokevirtual 362	com/appsee/ye:C	()Lcom/appsee/ro;
    //   161: getstatic 367	com/appsee/ro:l	Lcom/appsee/ro;
    //   164: if_acmpne +7 -> 171
    //   167: iconst_0
    //   168: invokestatic 368	com/appsee/vd:C	(Z)V
    //   171: new 370	com/appsee/pc
    //   174: dup
    //   175: aload_0
    //   176: aload 4
    //   178: invokespecial 373	com/appsee/pc:<init>	(Lcom/appsee/fd;Ljava/lang/String;)V
    //   181: iconst_1
    //   182: invokestatic 376	com/appsee/ei:C	(Lcom/appsee/o;Z)V
    //   185: iload_1
    //   186: ifeq +23 -> 209
    //   189: aload_0
    //   190: getfield 29	com/appsee/fd:l	Z
    //   193: ifne +16 -> 209
    //   196: iload_2
    //   197: ifeq +6 -> 203
    //   200: invokestatic 377	com/appsee/vd:C	()V
    //   203: invokestatic 382	com/appsee/qc:C	()Lcom/appsee/qc;
    //   206: invokevirtual 383	com/appsee/qc:H	()V
    //   209: aload 5
    //   211: athrow
    //   212: astore 5
    //   214: aload 5
    //   216: ldc_w 387
    //   219: invokestatic 47	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   222: invokestatic 145	com/appsee/ue:C	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   225: goto -155 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	this	fd
    //   0	228	1	paramBoolean	boolean
    //   6	191	2	bool1	boolean
    //   41	19	3	bool2	boolean
    //   13	164	4	str	String
    //   131	3	5	localException1	Exception
    //   147	63	5	localObject	Object
    //   212	3	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   46	52	131	java/lang/Exception
    //   35	42	147	finally
    //   46	52	147	finally
    //   52	59	147	finally
    //   63	70	147	finally
    //   133	144	147	finally
    //   214	225	147	finally
    //   63	70	212	java/lang/Exception
  }
  
  public boolean H()
  {
    return this.M;
  }
  
  public void J()
  {
    vd.C(2, wc.C("3Y\000\026\007S\007E\035Y\032\026\035RN\026QE"), new Object[] { ye.C().a() });
    if (ye.C().C() == ro.l)
    {
      vd.C(1);
      vd.C(true);
    }
    if (!ye.C().O())
    {
      M();
      return;
    }
    if (hp.C(ye.C().D()))
    {
      vd.C(2, wc.C("r\035D\021U\000Y\006OTB\033YTZ\025D\023SX\026\025T\033D\000_\032QTE\021E\007_\033X"));
      M();
      return;
    }
    if (ye.C().B())
    {
      if (!this.G)
      {
        vd.H(1, wc.C("&S\023_\007B\021D\021RTU\006W\007^\021E"));
        am.C();
        AppseeNativeExtensions.a();
        this.G = true;
      }
      AppseeNativeExtensions.a();
    }
    if (ye.C().d()) {
      D();
    }
    sn.C().C();
    fc.C().K();
    if (ye.C().J()) {
      sb.C().C();
    }
    if (ye.C().F()) {}
    try
    {
      k.C().i();
      if ((!ye.C().l()) || (ye.C().K() > 0))
      {
        int i = ye.C().K() * 1000;
        vd.C(1, wc.C("q\033BT@\035R\021YT[\025NTZ\021X\023B\034\032TW\020R\035X\023\026\027W\030ZTB\033\026\007B\033FT_\032\026QR"), new Object[] { Integer.valueOf(i) });
        if (this.f == null) {
          this.f = new Handler(Looper.getMainLooper());
        }
        this.f.postDelayed(this.D, i);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        ue.C(localException, wc.C("p\025_\030S\020\026\000YTE\000W\006BT@\035R\021YTD\021U\033D\020_\032Q"));
        ye.C().y(false);
      }
    }
    A();
    ei.C(new md(this), true);
  }
  
  public void K()
  {
    if (a())
    {
      vd.H(1, wc.C("w\004F\007S\021\026\003Y\032\021\000\026\007B\025D\000\026\033XTW\032\026\033F\000S\020\033\033C\000\026\020S\002_\027S"));
      return;
    }
    vd.H(2, wc.C("\034^\034^\026'B\025D\000_\032QTX\021ATE\021E\007_\033XT\034^\034^\034"));
    hp.H();
    gb.C();
    ye.C().y(false);
    ye.C().O(false);
    fc.C().H(false);
    k.C().c();
    qc.C().A();
  }
  
  public void K(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public void M()
  {
    vd.H(1, wc.C("w\026Y\006B\035X\023\026\007S\007E\035Y\032\030Z\030"));
    try
    {
      kb.C().D();
      if (fc.C().C()) {
        fc.C().H(true);
      }
      if (!k.C().H()) {}
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          k.C().H(true);
          File localFile1 = hp.H(String.format(wc.C("\023\007\030QE"), new Object[] { ye.C().a(), "mp4" }));
          File localFile2 = hp.H(String.format(wc.C("\023\007\030QE"), new Object[] { ye.C().a(), "h264" }));
          hp.C(localFile1);
          hp.C(localFile2);
          return;
        }
        catch (Exception localException2)
        {
          ue.C(localException2, wc.C("1D\006Y\006\026\022_\032_\007^\035X\023\026\002_\020S\033\026\006S\027Y\006R\035X\023\030"));
        }
        localException1 = localException1;
        ue.C(localException1, wc.C("1D\006Y\006\026\007B\033F\004_\032QTE\027D\021S\032\026\020S\000S\027B\035Y\032\030"));
      }
    }
  }
  
  public void a()
  {
    ei.C(new tc(this));
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean != a())
    {
      if (!gb.C(paramBoolean)) {
        break label70;
      }
      vd.C(String.format(wc.C(";F\000\033\033C\000\026\007B\025B\001ETU\034W\032Q\021RTB\033\026QT"), new Object[] { Boolean.valueOf(paramBoolean) }));
    }
    for (;;)
    {
      if (this.M)
      {
        if (!paramBoolean) {
          break;
        }
        fc.C().C(wc.C("5F\004E\021S;F\000y\001B"), null);
        C().A(false);
      }
      return;
      label70:
      ue.C(null, wc.C("1D\006Y\006\026\007W\002_\032QTW\004F\007S\021\026\033F\000\026\033C\000\026\007B\025B\001E"));
    }
    fc.C().C(wc.C("w\004F\007S\021y\004B=X"), null);
    ei.C(kj.l);
  }
  
  public boolean a()
  {
    return gb.C();
  }
  
  public void c()
  {
    if (!k.C().C())
    {
      vd.H(2, wc.C("$W\001E\035X\023\026\002_\020S\033\030"));
      k.C().C(true);
      fc.C().C(wc.C("w\004F\007S\021f\025C\007S"), null);
    }
  }
  
  public void h()
  {
    if (k.C().H()) {
      k.C().H(false);
    }
  }
  
  public void i()
  {
    if (k.C().C())
    {
      vd.H(2, wc.C("d\021E\001[\035X\023\026\002_\020S\033\030"));
      k.C().C(false);
      fc.C().C(wc.C("5F\004E\021S&S\007C\031S"), null);
    }
  }
  
  public void j()
  {
    vd.H(1, wc.C("^\034^\026\001E\021DTU\025Z\030S\020\026\007B\033F"));
    fc.C().C(wc.C("5F\004E\021S'B\033F"), null);
    ei.C(kj.D);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */