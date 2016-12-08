package com.twitter.sdk.android.core;

import com.google.a.a.c;

public class x
  extends l<TwitterAuthToken>
{
  @c(a="user_name")
  private final String a;
  
  public String a()
  {
    return this.a;
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
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (x)paramObject;
      if (this.a == null) {
        break;
      }
    } while (this.a.equals(((x)paramObject).a));
    for (;;)
    {
      return false;
      if (((x)paramObject).a == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int j = super.hashCode();
    if (this.a != null) {}
    for (int i = this.a.hashCode();; i = 0) {
      return i + j * 31;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */