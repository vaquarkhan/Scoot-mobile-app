package com.twitter.sdk.android.core;

public class l<T extends c>
{
  @com.google.a.a.c(a="auth_token")
  private final T a;
  @com.google.a.a.c(a="id")
  private final long b;
  
  public l(T paramT, long paramLong)
  {
    this.a = paramT;
    this.b = paramLong;
  }
  
  public T d()
  {
    return this.a;
  }
  
  public long e()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (l)paramObject;
      if (this.b != ((l)paramObject).b) {
        return false;
      }
      if (this.a == null) {
        break;
      }
    } while (this.a.equals(((l)paramObject).a));
    for (;;)
    {
      return false;
      if (((l)paramObject).a == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    if (this.a != null) {}
    for (int i = this.a.hashCode();; i = 0) {
      return i * 31 + (int)(this.b ^ this.b >>> 32);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */