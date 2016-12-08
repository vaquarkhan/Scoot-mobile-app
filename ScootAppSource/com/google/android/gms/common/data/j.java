package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.br;

public abstract class j
{
  protected final DataHolder a;
  protected int b;
  private int c;
  
  public j(DataHolder paramDataHolder, int paramInt)
  {
    this.a = ((DataHolder)b.a(paramDataHolder));
    a(paramInt);
  }
  
  protected void a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.a.g())) {}
    for (boolean bool = true;; bool = false)
    {
      b.a(bool);
      this.b = paramInt;
      this.c = this.a.a(this.b);
      return;
    }
  }
  
  public boolean a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  protected int b(String paramString)
  {
    return this.a.a(paramString, this.b, this.c);
  }
  
  protected boolean c(String paramString)
  {
    return this.a.c(paramString, this.b, this.c);
  }
  
  protected String d(String paramString)
  {
    return this.a.b(paramString, this.b, this.c);
  }
  
  protected float e(String paramString)
  {
    return this.a.d(paramString, this.b, this.c);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      bool1 = bool2;
      if (br.a(Integer.valueOf(((j)paramObject).b), Integer.valueOf(this.b)))
      {
        bool1 = bool2;
        if (br.a(Integer.valueOf(((j)paramObject).c), Integer.valueOf(this.c)))
        {
          bool1 = bool2;
          if (((j)paramObject).a == this.a) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  protected byte[] f(String paramString)
  {
    return this.a.e(paramString, this.b, this.c);
  }
  
  protected boolean g(String paramString)
  {
    return this.a.f(paramString, this.b, this.c);
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), this.a });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */