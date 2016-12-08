package com.appsee;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class gc
  implements d
{
  private String A;
  private int B;
  private String D;
  private int E;
  private int G;
  private List<Long> M = new ArrayList();
  private boolean c;
  private int e = 0;
  private boolean f;
  private boolean g;
  private int j;
  private qi l = bc.C().C(kl.C("}&G.E\"v)P(W\""));
  
  public void C()
  {
    this.l.C();
    if (!this.c) {
      throw new Exception(qi.C("+:\r;\n1\034t\007'N:\001 N=\000=\032=\017 \0130"));
    }
    vd.C(1, kl.C("u.].@/\023\"]$\\#Z)Tk\023\"]$\\#V#\023!A&^\"\023$\\2]3\tg\026#"), new Object[] { Integer.valueOf(this.e) });
    boolean bool = AppseeNativeExtensions.C();
    if (!bool) {
      vd.H(1, qi.C(" 5\032=\0301N1\0007\0010\007:\tt\b=\000=\035<\0130N#\007 \006t\013&\034;\034'"));
    }
    vd.H(1, kl.C("~2K.] \0231Z#V("));
    try
    {
      this.g = true;
      qi localqi = bc.C().C(qi.C("#!\026=\0003"));
      localqi.K();
      H();
      localqi.H();
      localqi.C();
      this.g = false;
      if (!bool) {
        throw new Exception(kl.C("v5A(AgU.].@/Z)TgV)P(W.] \0231Z#V("));
      }
    }
    finally
    {
      this.g = false;
    }
  }
  
  public void C(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean)
  {
    this.E = paramInt1;
    this.j = paramInt2;
    this.B = paramInt3;
    this.G = paramInt4;
    this.A = paramString;
    this.D = String.format(qi.C("q\035zK'"), new Object[] { ye.C().a(), "h264" });
    this.f = paramBoolean;
    this.M.clear();
    this.e = 0;
    vd.H(1, kl.C("\016].G.R+Z=Vg]&G.E\"\0231Z#V(\023\"]$\\#V5"));
    Object localObject = ye.C().a();
    paramString = new String[((List)localObject).size()];
    int[] arrayOfInt = new int[((List)localObject).size()];
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt2 < ((List)localObject).size(); paramInt1 = paramInt2)
    {
      paramString[paramInt1] = ((m)((List)localObject).get(paramInt1)).l;
      paramInt3 = ((m)((List)localObject).get(paramInt1)).A.intValue();
      paramInt2 = paramInt1 + 1;
      arrayOfInt[paramInt1] = paramInt3;
    }
    localObject = hp.H(this.D).getAbsolutePath();
    paramInt1 = this.E;
    paramInt2 = this.j;
    paramInt3 = this.G;
    paramInt4 = this.B;
    boolean bool = ye.C().a();
    if (vd.C() <= 1) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.c = AppseeNativeExtensions.C((String)localObject, paramInt1, paramInt2, paramInt3, paramInt4, paramString, arrayOfInt, bool, paramBoolean, this.f);
      if (this.c) {
        break;
      }
      throw new Exception(qi.C("-5\000:\001 N7\0341\017 \013t\0005\032=\0301N\"\0070\013;N1\0007\0010\013&"));
    }
  }
  
  public void C(bd parambd, long paramLong)
  {
    if (!this.c) {
      throw new Exception(qi.C("\032\017 \007\"\013t\013:\r;\n1\034t\007'N:\001 N=\000=\032=\017 \0130"));
    }
    this.l.K();
    if (this.f) {
      vd.H(1, kl.C("\024V)W.] \023!A&^\"\023!\\5\023)R3Z1VgV)P(W.] "));
    }
    this.e += 1;
    this.M.add(Long.valueOf(paramLong));
    AppseeNativeExtensions.C(this.E, this.j, parambd.C(), paramLong, this.f);
    this.l.H();
  }
  
  public boolean C()
  {
    return this.g;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */