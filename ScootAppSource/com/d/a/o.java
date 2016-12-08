package com.d.a;

import android.view.animation.Interpolator;

public abstract class o
  implements Cloneable
{
  float a;
  Class b;
  boolean c = false;
  private Interpolator d = null;
  
  public static o a(float paramFloat)
  {
    return new p(paramFloat);
  }
  
  public static o a(float paramFloat1, float paramFloat2)
  {
    return new p(paramFloat1, paramFloat2);
  }
  
  public void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }
  
  public abstract void a(Object paramObject);
  
  public boolean a()
  {
    return this.c;
  }
  
  public abstract Object b();
  
  public float c()
  {
    return this.a;
  }
  
  public Interpolator d()
  {
    return this.d;
  }
  
  public Class e()
  {
    return this.b;
  }
  
  public abstract o f();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */