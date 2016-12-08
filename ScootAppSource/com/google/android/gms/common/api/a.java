package com.google.android.gms.common.api;

public final class a<O extends b>
{
  private final g<?, O> a;
  private final n<?, O> b;
  private final l<?> c;
  private final o<?> d;
  private final String e;
  
  public <C extends k> a(String paramString, g<C, O> paramg, l<C> paraml)
  {
    com.google.android.gms.common.internal.b.a(paramg, "Cannot construct an Api with a null ClientBuilder");
    com.google.android.gms.common.internal.b.a(paraml, "Cannot construct an Api with a null ClientKey");
    this.e = paramString;
    this.a = paramg;
    this.b = null;
    this.c = paraml;
    this.d = null;
  }
  
  public j<?, O> a()
  {
    if (e()) {
      return null;
    }
    return this.a;
  }
  
  public g<?, O> b()
  {
    if (this.a != null) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.b.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.a;
    }
  }
  
  public n<?, O> c()
  {
    com.google.android.gms.common.internal.b.a(false, "This API was constructed with a ClientBuilder. Use getClientBuilder");
    return null;
  }
  
  public i<?> d()
  {
    if (this.c != null) {
      return this.c;
    }
    throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
  }
  
  public boolean e()
  {
    return false;
  }
  
  public String f()
  {
    return this.e;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */