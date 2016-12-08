package e.b.a;

import java.io.Serializable;

public final class s
  extends e.b.a.a.c
  implements u, Serializable, Cloneable
{
  private c a;
  private int b;
  
  public s() {}
  
  public s(long paramLong, i parami)
  {
    super(paramLong, parami);
  }
  
  public t a(d paramd)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }
    c localc = paramd.a(b());
    if (!localc.c()) {
      throw new IllegalArgumentException("Field '" + paramd + "' is not supported");
    }
    return new t(this, localc);
  }
  
  public void a(long paramLong)
  {
    long l = paramLong;
    switch (this.b)
    {
    default: 
      l = paramLong;
    }
    for (;;)
    {
      super.a(l);
      return;
      l = this.a.d(paramLong);
      continue;
      l = this.a.e(paramLong);
      continue;
      l = this.a.f(paramLong);
      continue;
      l = this.a.g(paramLong);
      continue;
      l = this.a.h(paramLong);
    }
  }
  
  public Object clone()
  {
    try
    {
      Object localObject = super.clone();
      return localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new InternalError("Clone error");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */