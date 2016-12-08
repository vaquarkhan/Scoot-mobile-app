package com.mixpanel.android.mpmetrics;

public final class bn
{
  public final int a;
  private final Object b;
  private final Object c;
  private final Number d;
  private final Number e;
  
  private bn(int paramInt, Object paramObject1, Number paramNumber1, Number paramNumber2, Object paramObject2)
  {
    this.a = paramInt;
    this.c = paramObject1;
    this.d = paramNumber1;
    this.e = paramNumber2;
    this.b = paramObject2;
  }
  
  public bn a(Object paramObject)
  {
    return new bn(this.a, this.c, this.d, this.e, paramObject);
  }
  
  public String a()
  {
    Object localObject = null;
    for (;;)
    {
      try
      {
        str = (String)this.c;
        localObject = str;
      }
      catch (ClassCastException localClassCastException2)
      {
        String str;
        continue;
      }
      try
      {
        str = (String)this.b;
        return str;
      }
      catch (ClassCastException localClassCastException1)
      {
        return (String)localObject;
      }
    }
  }
  
  public Number b()
  {
    Object localObject2 = Integer.valueOf(0);
    Object localObject1 = localObject2;
    if (this.c != null) {}
    try
    {
      localObject1 = (Number)this.c;
      localObject2 = localObject1;
      if (this.b != null) {}
      try
      {
        localObject2 = (Number)this.b;
        return (Number)localObject2;
      }
      catch (ClassCastException localClassCastException3)
      {
        return (Number)localObject1;
      }
    }
    catch (ClassCastException localClassCastException1)
    {
      for (;;)
      {
        ClassCastException localClassCastException2 = localClassCastException3;
      }
    }
  }
  
  public Boolean c()
  {
    Object localObject2 = Boolean.valueOf(false);
    Object localObject1 = localObject2;
    if (this.c != null) {}
    try
    {
      localObject1 = (Boolean)this.c;
      localObject2 = localObject1;
      if (this.b != null) {}
      try
      {
        localObject2 = (Boolean)this.b;
        return (Boolean)localObject2;
      }
      catch (ClassCastException localClassCastException3)
      {
        return (Boolean)localObject1;
      }
    }
    catch (ClassCastException localClassCastException1)
    {
      for (;;)
      {
        ClassCastException localClassCastException2 = localClassCastException3;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */