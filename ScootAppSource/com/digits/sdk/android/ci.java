package com.digits.sdk.android;

import com.google.a.a.c;

public final class ci
{
  @c(a="address")
  final String a;
  @c(a="is_verified")
  final boolean b;
  
  ci(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
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
      paramObject = (ci)paramObject;
    } while ((this.b == ((ci)paramObject).b) && (this.a.equals(((ci)paramObject).a)));
    return false;
  }
  
  public int hashCode()
  {
    int j = this.a.hashCode();
    if (this.b) {}
    for (int i = 1;; i = 0) {
      return i + j * 31;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */