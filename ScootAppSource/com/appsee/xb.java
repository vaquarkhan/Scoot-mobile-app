package com.appsee;

import android.os.Build.VERSION;
import java.security.InvalidParameterException;
import java.util.List;

class xb
{
  private d A;
  private u l = u.A;
  
  public static List<String> C()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return dd.C();
    }
    return null;
  }
  
  public void C(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean)
  {
    C();
    boolean bool = AppseeNativeExtensions.C(this.l);
    if ((this.A == null) || (!bool)) {
      throw new Exception(sc.C("!h\fg\r}Be\rh\006)\024`\006l\r)\007g\001f\006l\020"));
    }
    this.A.C(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramBoolean);
    vd.C();
  }
  
  public void C(bd parambd, long paramLong)
  {
    if (this.A == null) {
      throw new Exception(sc.C("'g\001f\006l\020)\ff\026)\013g\013}\013h\016`\030l\006)\004f\020)\007g\001f\006`\fnBh\f)\013d\003n\007"));
    }
    if (parambd == null) {
      throw new InvalidParameterException(qc.C("J!t ''r$w8~tn9f3bte!a2b&"));
    }
    if (paramLong < 0L) {
      throw new InvalidParameterException(sc.C("/|\021}By\020l\021l\f}\003}\013f\f]\013d\007\\\021"));
    }
    parambd.H();
    try
    {
      this.A.C(parambd, paramLong);
      return;
    }
    finally
    {
      parambd.C();
    }
  }
  
  public boolean C()
  {
    if (this.A == null) {
      throw new Exception(sc.C("'g\001f\006l\020)\ff\026)\013g\013}\013h\016`\030l\006)\004f\020)\007g\001f\006`\fnBh\f)\013d\003n\007"));
    }
    return this.A.C();
  }
  
  public void H()
  {
    if (this.A == null) {
      throw new Exception(qc.C("\021i7h0b&':h '=i=s=f8n.b0'2h&'1i7h0n:`tf:'=j5`1"));
    }
    this.A.C();
    this.A = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */