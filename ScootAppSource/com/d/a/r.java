package com.d.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

class r
{
  int a;
  o b;
  o c;
  Interpolator d;
  ArrayList<o> e;
  am f;
  
  public r(o... paramVarArgs)
  {
    this.a = paramVarArgs.length;
    this.e = new ArrayList();
    this.e.addAll(Arrays.asList(paramVarArgs));
    this.b = ((o)this.e.get(0));
    this.c = ((o)this.e.get(this.a - 1));
    this.d = this.c.d();
  }
  
  public static r a(float... paramVarArgs)
  {
    int i = 1;
    int j = paramVarArgs.length;
    p[] arrayOfp = new p[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfp[0] = ((p)o.a(0.0F));
      arrayOfp[1] = ((p)o.a(1.0F, paramVarArgs[0]));
    }
    for (;;)
    {
      return new l(arrayOfp);
      arrayOfp[0] = ((p)o.a(0.0F, paramVarArgs[0]));
      while (i < j)
      {
        arrayOfp[i] = ((p)o.a(i / (j - 1), paramVarArgs[i]));
        i += 1;
      }
    }
  }
  
  public static r a(o... paramVarArgs)
  {
    int n = 0;
    int i1 = paramVarArgs.length;
    int i = 0;
    int m = 0;
    int k = 0;
    int j = 0;
    if (i < i1)
    {
      if ((paramVarArgs[i] instanceof p)) {
        j = 1;
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramVarArgs[i] instanceof q)) {
          k = 1;
        } else {
          m = 1;
        }
      }
    }
    Object localObject;
    if ((j != 0) && (k == 0) && (m == 0))
    {
      localObject = new p[i1];
      i = n;
      while (i < i1)
      {
        localObject[i] = ((p)paramVarArgs[i]);
        i += 1;
      }
      return new l((p[])localObject);
    }
    if ((k != 0) && (j == 0) && (m == 0))
    {
      localObject = new q[i1];
      i = 0;
      while (i < i1)
      {
        localObject[i] = ((q)paramVarArgs[i]);
        i += 1;
      }
      return new n((q[])localObject);
    }
    return new r(paramVarArgs);
  }
  
  public Object a(float paramFloat)
  {
    float f1;
    if (this.a == 2)
    {
      f1 = paramFloat;
      if (this.d != null) {
        f1 = this.d.getInterpolation(paramFloat);
      }
      return this.f.a(f1, this.b.b(), this.c.b());
    }
    Object localObject2;
    if (paramFloat <= 0.0F)
    {
      localObject1 = (o)this.e.get(1);
      localObject2 = ((o)localObject1).d();
      f1 = paramFloat;
      if (localObject2 != null) {
        f1 = ((Interpolator)localObject2).getInterpolation(paramFloat);
      }
      paramFloat = this.b.c();
      paramFloat = (f1 - paramFloat) / (((o)localObject1).c() - paramFloat);
      return this.f.a(paramFloat, this.b.b(), ((o)localObject1).b());
    }
    if (paramFloat >= 1.0F)
    {
      localObject1 = (o)this.e.get(this.a - 2);
      localObject2 = this.c.d();
      f1 = paramFloat;
      if (localObject2 != null) {
        f1 = ((Interpolator)localObject2).getInterpolation(paramFloat);
      }
      paramFloat = ((o)localObject1).c();
      paramFloat = (f1 - paramFloat) / (this.c.c() - paramFloat);
      return this.f.a(paramFloat, ((o)localObject1).b(), this.c.b());
    }
    Object localObject1 = this.b;
    int i = 1;
    while (i < this.a)
    {
      localObject2 = (o)this.e.get(i);
      if (paramFloat < ((o)localObject2).c())
      {
        Interpolator localInterpolator = ((o)localObject2).d();
        f1 = paramFloat;
        if (localInterpolator != null) {
          f1 = localInterpolator.getInterpolation(paramFloat);
        }
        paramFloat = ((o)localObject1).c();
        paramFloat = (f1 - paramFloat) / (((o)localObject2).c() - paramFloat);
        return this.f.a(paramFloat, ((o)localObject1).b(), ((o)localObject2).b());
      }
      i += 1;
      localObject1 = localObject2;
    }
    return this.c.b();
  }
  
  public void a(am paramam)
  {
    this.f = paramam;
  }
  
  public r b()
  {
    ArrayList localArrayList = this.e;
    int j = this.e.size();
    o[] arrayOfo = new o[j];
    int i = 0;
    while (i < j)
    {
      arrayOfo[i] = ((o)localArrayList.get(i)).f();
      i += 1;
    }
    return new r(arrayOfo);
  }
  
  public String toString()
  {
    String str = " ";
    int i = 0;
    while (i < this.a)
    {
      str = str + ((o)this.e.get(i)).b() + "  ";
      i += 1;
    }
    return str;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */