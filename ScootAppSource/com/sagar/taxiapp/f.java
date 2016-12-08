package com.sagar.taxiapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.ah;
import android.support.v4.app.au;
import com.sagar.taxiapp.b.a;
import com.sagar.taxiapp.b.d;
import java.util.ArrayList;
import java.util.List;

final class f
  extends au
{
  private final List<String> a = new ArrayList();
  
  public f(ah paramah)
  {
    super(paramah);
  }
  
  public Fragment a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new com.sagar.taxiapp.b.f();
    case 0: 
      return new com.sagar.taxiapp.b.f();
    case 1: 
      return new a();
    }
    return new d();
  }
  
  public void a(String paramString)
  {
    this.a.add(paramString);
  }
  
  public int b()
  {
    return this.a.size();
  }
  
  public CharSequence c(int paramInt)
  {
    return (CharSequence)this.a.get(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */