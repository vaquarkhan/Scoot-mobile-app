package com.google.android.gms.b;

public final class a
  extends g<a>
{
  public String[] a;
  public int[] b;
  public byte[][] c;
  
  public a()
  {
    a();
  }
  
  public static a a(byte[] paramArrayOfByte)
  {
    return (a)m.a(new a(), paramArrayOfByte);
  }
  
  public a a()
  {
    this.a = p.f;
    this.b = p.a;
    this.c = p.g;
    this.d = null;
    this.e = -1;
    return this;
  }
  
  public a a(d paramd)
  {
    for (;;)
    {
      int i = paramd.a();
      int j;
      Object localObject;
      switch (i)
      {
      default: 
        if (super.a(paramd, i)) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = p.a(paramd, 10);
        if (this.a == null) {}
        for (i = 0;; i = this.a.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(this.a, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramd.d();
            paramd.a();
            j += 1;
          }
        }
        localObject[j] = paramd.d();
        this.a = ((String[])localObject);
        break;
      case 16: 
        j = p.a(paramd, 16);
        if (this.b == null) {}
        for (i = 0;; i = this.b.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(this.b, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramd.c();
            paramd.a();
            j += 1;
          }
        }
        localObject[j] = paramd.c();
        this.b = ((int[])localObject);
        break;
      case 18: 
        int k = paramd.c(paramd.f());
        i = paramd.k();
        j = 0;
        while (paramd.i() > 0)
        {
          paramd.c();
          j += 1;
        }
        paramd.e(i);
        if (this.b == null) {}
        for (i = 0;; i = this.b.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(this.b, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramd.c();
            j += 1;
          }
        }
        this.b = ((int[])localObject);
        paramd.d(k);
        break;
      case 26: 
        j = p.a(paramd, 26);
        if (this.c == null) {}
        for (i = 0;; i = this.c.length)
        {
          localObject = new byte[j + i][];
          j = i;
          if (i != 0)
          {
            System.arraycopy(this.c, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramd.e();
            paramd.a();
            j += 1;
          }
        }
        localObject[j] = paramd.e();
        this.c = ((byte[][])localObject);
      }
    }
  }
  
  public void a(e parame)
  {
    int j = 0;
    int i;
    Object localObject;
    if ((this.a != null) && (this.a.length > 0))
    {
      i = 0;
      while (i < this.a.length)
      {
        localObject = this.a[i];
        if (localObject != null) {
          parame.a(1, (String)localObject);
        }
        i += 1;
      }
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      i = 0;
      while (i < this.b.length)
      {
        parame.a(2, this.b[i]);
        i += 1;
      }
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      i = j;
      while (i < this.c.length)
      {
        localObject = this.c[i];
        if (localObject != null) {
          parame.a(3, (byte[])localObject);
        }
        i += 1;
      }
    }
    super.a(parame);
  }
  
  protected int b()
  {
    int i1 = 0;
    int i2 = super.b();
    int i;
    int k;
    Object localObject;
    int n;
    int m;
    if ((this.a != null) && (this.a.length > 0))
    {
      i = 0;
      j = 0;
      for (k = 0; i < this.a.length; k = m)
      {
        localObject = this.a[i];
        n = j;
        m = k;
        if (localObject != null)
        {
          m = k + 1;
          n = j + e.b((String)localObject);
        }
        i += 1;
        j = n;
      }
    }
    for (int j = i2 + j + k * 1;; j = i2)
    {
      i = j;
      if (this.b != null)
      {
        i = j;
        if (this.b.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.b.length)
          {
            k += e.b(this.b[i]);
            i += 1;
          }
          i = j + k + this.b.length * 1;
        }
      }
      j = i;
      if (this.c != null)
      {
        j = i;
        if (this.c.length > 0)
        {
          k = 0;
          m = 0;
          j = i1;
          while (j < this.c.length)
          {
            localObject = this.c[j];
            i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + e.c((byte[])localObject);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 1;
        }
      }
      return j;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return bool1;
              bool1 = bool2;
            } while (!(paramObject instanceof a));
            paramObject = (a)paramObject;
            bool1 = bool2;
          } while (!k.a(this.a, ((a)paramObject).a));
          bool1 = bool2;
        } while (!k.a(this.b, ((a)paramObject).b));
        bool1 = bool2;
      } while (!k.a(this.c, ((a)paramObject).c));
      if ((this.d != null) && (!this.d.b())) {
        break label111;
      }
      if (((a)paramObject).d == null) {
        break;
      }
      bool1 = bool2;
    } while (!((a)paramObject).d.b());
    return true;
    label111:
    return this.d.equals(((a)paramObject).d);
  }
  
  public int hashCode()
  {
    int j = getClass().getName().hashCode();
    int k = k.a(this.a);
    int m = k.a(this.b);
    int n = k.a(this.c);
    if ((this.d == null) || (this.d.b())) {}
    for (int i = 0;; i = this.d.hashCode()) {
      return i + ((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */