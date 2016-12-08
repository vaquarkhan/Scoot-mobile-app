package com.b.a;

import android.content.Intent;

public final class a
  extends ad
{
  private Intent b;
  
  public a() {}
  
  public a(n paramn)
  {
    super(paramn);
  }
  
  public String getMessage()
  {
    if (this.b != null) {
      return "User needs to (re)enter credentials.";
    }
    return super.getMessage();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */