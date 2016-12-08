package com.digits.sdk.android;

public final class bb
{
  boolean a = false;
  String b;
  String c;
  g d;
  int e = 0;
  n f;
  
  public ba a()
  {
    if (this.d == null) {
      throw new IllegalArgumentException("AuthCallback must not be null");
    }
    if ((this.f != null) && ((this.b == null) || (this.c == null))) {
      throw new IllegalArgumentException("PhoneNumber and partnerKey must be set when confirmationCodeCallback is used. Please contact support for more information.");
    }
    boolean bool = this.a;
    if (this.b == null) {}
    for (String str = "";; str = this.b) {
      return new ba(bool, str, this.d, this.e, this.f, this.c);
    }
  }
  
  public bb a(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public bb a(g paramg)
  {
    this.d = paramg;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */