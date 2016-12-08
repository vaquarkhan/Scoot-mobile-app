package com.mixpanel.android.c;

import android.view.View;

final class e
{
  private final int a;
  
  public e(View paramView, String paramString)
  {
    this.a = (paramView.hashCode() ^ paramString.hashCode());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof e))
    {
      bool1 = bool2;
      if (this.a == paramObject.hashCode()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */