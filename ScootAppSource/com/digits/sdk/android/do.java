package com.digits.sdk.android;

import b.a.a.a.a.c.a;

final class do
  extends a<Void, Void, dg>
{
  private final dp a;
  private final dq d;
  private final String e;
  
  protected do(dq paramdq, dp paramdp)
  {
    if (paramdq == null) {
      throw new NullPointerException("phoneNumberUtils can't be null");
    }
    this.a = paramdp;
    this.d = paramdq;
    this.e = "";
  }
  
  protected do(dq paramdq, String paramString, dp paramdp)
  {
    if (paramdq == null) {
      throw new NullPointerException("phoneNumberUtils can't be null");
    }
    this.a = paramdp;
    this.d = paramdq;
    this.e = paramString;
  }
  
  protected dg a(Void... paramVarArgs)
  {
    return this.d.a(this.e);
  }
  
  protected void a(dg paramdg)
  {
    if (this.a != null) {
      this.a.a(paramdg);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */