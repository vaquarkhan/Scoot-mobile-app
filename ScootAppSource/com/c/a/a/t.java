package com.c.a.a;

import b.a.a.a.a.c.a.c;
import java.util.Random;

final class t
  implements c
{
  final c a;
  final Random b;
  final double c;
  
  public t(c paramc, double paramDouble)
  {
    this(paramc, paramDouble, new Random());
  }
  
  public t(c paramc, double paramDouble, Random paramRandom)
  {
    if ((paramDouble < 0.0D) || (paramDouble > 1.0D)) {
      throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
    }
    if (paramc == null) {
      throw new NullPointerException("backoff must not be null");
    }
    if (paramRandom == null) {
      throw new NullPointerException("random must not be null");
    }
    this.a = paramc;
    this.c = paramDouble;
    this.b = paramRandom;
  }
  
  double a()
  {
    double d = 1.0D - this.c;
    return d + (this.c + 1.0D - d) * this.b.nextDouble();
  }
  
  public long a(int paramInt)
  {
    return (a() * this.a.a(paramInt));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */