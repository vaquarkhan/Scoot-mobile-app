package com.d.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

final class n
  extends r
{
  private int g;
  private int h;
  private int i;
  private boolean j = true;
  
  public n(q... paramVarArgs)
  {
    super(paramVarArgs);
  }
  
  public n a()
  {
    ArrayList localArrayList = this.e;
    int m = this.e.size();
    q[] arrayOfq = new q[m];
    int k = 0;
    while (k < m)
    {
      arrayOfq[k] = ((q)((o)localArrayList.get(k)).f());
      k += 1;
    }
    return new n(arrayOfq);
  }
  
  public Object a(float paramFloat)
  {
    return Integer.valueOf(b(paramFloat));
  }
  
  public int b(float paramFloat)
  {
    int k = 1;
    float f1;
    if (this.a == 2)
    {
      if (this.j)
      {
        this.j = false;
        this.g = ((q)this.e.get(0)).g();
        this.h = ((q)this.e.get(1)).g();
        this.i = (this.h - this.g);
      }
      f1 = paramFloat;
      if (this.d != null) {
        f1 = this.d.getInterpolation(paramFloat);
      }
      if (this.f == null) {
        return this.g + (int)(this.i * f1);
      }
      return ((Number)this.f.a(f1, Integer.valueOf(this.g), Integer.valueOf(this.h))).intValue();
    }
    q localq;
    int m;
    float f2;
    float f3;
    if (paramFloat <= 0.0F)
    {
      localObject = (q)this.e.get(0);
      localq = (q)this.e.get(1);
      k = ((q)localObject).g();
      m = localq.g();
      f2 = ((q)localObject).c();
      f3 = localq.c();
      localObject = localq.d();
      f1 = paramFloat;
      if (localObject != null) {
        f1 = ((Interpolator)localObject).getInterpolation(paramFloat);
      }
      paramFloat = (f1 - f2) / (f3 - f2);
      if (this.f == null) {
        return (int)(paramFloat * (m - k)) + k;
      }
      return ((Number)this.f.a(paramFloat, Integer.valueOf(k), Integer.valueOf(m))).intValue();
    }
    if (paramFloat >= 1.0F)
    {
      localObject = (q)this.e.get(this.a - 2);
      localq = (q)this.e.get(this.a - 1);
      k = ((q)localObject).g();
      m = localq.g();
      f2 = ((q)localObject).c();
      f3 = localq.c();
      localObject = localq.d();
      f1 = paramFloat;
      if (localObject != null) {
        f1 = ((Interpolator)localObject).getInterpolation(paramFloat);
      }
      paramFloat = (f1 - f2) / (f3 - f2);
      if (this.f == null) {
        return (int)(paramFloat * (m - k)) + k;
      }
      return ((Number)this.f.a(paramFloat, Integer.valueOf(k), Integer.valueOf(m))).intValue();
    }
    for (Object localObject = (q)this.e.get(0); k < this.a; localObject = localq)
    {
      localq = (q)this.e.get(k);
      if (paramFloat < localq.c())
      {
        Interpolator localInterpolator = localq.d();
        f1 = paramFloat;
        if (localInterpolator != null) {
          f1 = localInterpolator.getInterpolation(paramFloat);
        }
        paramFloat = (f1 - ((q)localObject).c()) / (localq.c() - ((q)localObject).c());
        k = ((q)localObject).g();
        m = localq.g();
        if (this.f == null) {
          return (int)((m - k) * paramFloat) + k;
        }
        return ((Number)this.f.a(paramFloat, Integer.valueOf(k), Integer.valueOf(m))).intValue();
      }
      k += 1;
    }
    return ((Number)((o)this.e.get(this.a - 1)).b()).intValue();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */