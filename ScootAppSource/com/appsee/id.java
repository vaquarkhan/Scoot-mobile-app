package com.appsee;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.PowerManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;

class id
{
  private static id c;
  private static final int l = 2000;
  private Object A;
  private boolean B;
  private Object D;
  private sd E;
  private Object G;
  private boolean M;
  private z e;
  private HashMap<WeakReference<Activity>, Boolean> f;
  private PowerManager g;
  
  public static id C()
  {
    try
    {
      if (c == null) {
        c = new id();
      }
      id localid = c;
      return localid;
    }
    finally {}
  }
  
  public static boolean C()
  {
    return Build.VERSION.SDK_INT >= 14;
  }
  
  public ad C()
  {
    return new ad(this);
  }
  
  public void C()
  {
    if (!this.g.isScreenOn()) {
      C(rd.C("v;W=@6\0051VxJ>C"));
    }
  }
  
  public void C(int paramInt) {}
  
  public void C(Activity paramActivity, boolean paramBoolean)
  {
    C(paramActivity, paramBoolean, false);
  }
  
  public void C(z paramz)
  {
    this.e = paramz;
  }
  
  public void H(String paramString)
  {
    C(paramString, false);
  }
  
  @TargetApi(14)
  public void K()
  {
    if ((C()) && (this.E == null))
    {
      this.E = new sd(this, null);
      bp.C().registerActivityLifecycleCallbacks(this.E);
    }
  }
  
  public void a()
  {
    if (this.M)
    {
      vd.H(1, rd.C("v3L(U1K?\005(D-V=\005.D4L<D,L7KxD(UxD4W=D<\\xL6\005:D;N?W7P6A"));
      return;
    }
    synchronized (this.A)
    {
      this.A.wait(2000L);
      if (sn.C().H())
      {
        vd.H(1, qi.C("\022\001!\0000N5\r \007\"\007 \027t\r<\001;\0351\034xN&\013 \034-\007:\tt\0365\033'\013t\0305\002=\n5\032=\001:"));
        ei.C(kj.G);
        return;
      }
    }
    synchronized (this.G)
    {
      if (!this.B) {
        C(rd.C("\024D+QxD;Q1S1Q!\005/D+\005(D-V=A"));
      }
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */