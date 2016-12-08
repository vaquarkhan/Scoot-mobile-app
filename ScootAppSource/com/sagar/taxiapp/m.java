package com.sagar.taxiapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.ah;
import android.support.v4.app.as;
import java.util.ArrayList;
import java.util.List;

final class m
  extends as
{
  private final List<Fragment> b = new ArrayList();
  private final List<String> c = new ArrayList();
  
  public m(ActivityMainNew paramActivityMainNew, ah paramah)
  {
    super(paramah);
  }
  
  public Fragment a(int paramInt)
  {
    return (Fragment)this.b.get(paramInt);
  }
  
  public void a(Fragment paramFragment, String paramString)
  {
    this.b.add(paramFragment);
    this.c.add(paramString);
  }
  
  public int b()
  {
    return this.b.size();
  }
  
  public CharSequence c(int paramInt)
  {
    return (CharSequence)this.c.get(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */