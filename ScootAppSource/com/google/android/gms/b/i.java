package com.google.android.gms.b;

public final class i
  implements Cloneable
{
  private static final j a = new j();
  private boolean b = false;
  private int[] c;
  private j[] d;
  private int e;
  
  i()
  {
    this(10);
  }
  
  i(int paramInt)
  {
    paramInt = c(paramInt);
    this.c = new int[paramInt];
    this.d = new j[paramInt];
    this.e = 0;
  }
  
  private boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i]) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private boolean a(j[] paramArrayOfj1, j[] paramArrayOfj2, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      if (!paramArrayOfj1[i].equals(paramArrayOfj2[i])) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private int c(int paramInt)
  {
    return d(paramInt * 4) / 4;
  }
  
  private int d(int paramInt)
  {
    int i = 4;
    for (;;)
    {
      int j = paramInt;
      if (i < 32)
      {
        if (paramInt <= (1 << i) - 12) {
          j = (1 << i) - 12;
        }
      }
      else {
        return j;
      }
      i += 1;
    }
  }
  
  private void d()
  {
    int m = this.e;
    int[] arrayOfInt = this.c;
    j[] arrayOfj = this.d;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      j localj = arrayOfj[i];
      k = j;
      if (localj != a)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfj[j] = localj;
          arrayOfj[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.b = false;
    this.e = j;
  }
  
  private int e(int paramInt)
  {
    int i = 0;
    int j = this.e - 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.c[k];
      if (m < paramInt) {
        i = k + 1;
      } else if (m > paramInt) {
        j = k - 1;
      } else {
        return k;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
  
  int a()
  {
    if (this.b) {
      d();
    }
    return this.e;
  }
  
  j a(int paramInt)
  {
    paramInt = e(paramInt);
    if ((paramInt < 0) || (this.d[paramInt] == a)) {
      return null;
    }
    return this.d[paramInt];
  }
  
  void a(int paramInt, j paramj)
  {
    int i = e(paramInt);
    if (i >= 0)
    {
      this.d[i] = paramj;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramInt;
      this.d[j] = paramj;
      return;
    }
    i = j;
    if (this.b)
    {
      i = j;
      if (this.e >= this.c.length)
      {
        d();
        i = e(paramInt) ^ 0xFFFFFFFF;
      }
    }
    if (this.e >= this.c.length)
    {
      j = c(this.e + 1);
      int[] arrayOfInt = new int[j];
      j[] arrayOfj = new j[j];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfj, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfj;
    }
    if (this.e - i != 0)
    {
      System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
      System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
    }
    this.c[i] = paramInt;
    this.d[i] = paramj;
    this.e += 1;
  }
  
  j b(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.d[paramInt];
  }
  
  public boolean b()
  {
    return a() == 0;
  }
  
  public final i c()
  {
    int j = a();
    i locali = new i(j);
    System.arraycopy(this.c, 0, locali.c, 0, j);
    int i = 0;
    while (i < j)
    {
      if (this.d[i] != null) {
        locali.d[i] = ((j)this.d[i].clone());
      }
      i += 1;
    }
    locali.e = j;
    return locali;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof i)) {
        return false;
      }
      paramObject = (i)paramObject;
      if (a() != ((i)paramObject).a()) {
        return false;
      }
    } while ((a(this.c, ((i)paramObject).c, this.e)) && (a(this.d, ((i)paramObject).d, this.e)));
    return false;
  }
  
  public int hashCode()
  {
    if (this.b) {
      d();
    }
    int j = 17;
    int i = 0;
    while (i < this.e)
    {
      j = (j * 31 + this.c[i]) * 31 + this.d[i].hashCode();
      i += 1;
    }
    return j;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */