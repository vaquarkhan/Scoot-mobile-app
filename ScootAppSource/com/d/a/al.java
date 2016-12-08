package com.d.a;

import android.util.Log;
import com.d.b.b;
import com.d.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class al
  extends ai
{
  n h;
  int i;
  private b j;
  
  public al(String paramString, n paramn)
  {
    super(paramString, null);
    this.d = Integer.TYPE;
    this.e = paramn;
    this.h = ((n)this.e);
  }
  
  void a(float paramFloat)
  {
    this.i = this.h.b(paramFloat);
  }
  
  void a(Class paramClass)
  {
    if (this.b != null) {
      return;
    }
    super.a(paramClass);
  }
  
  void b(Object paramObject)
  {
    if (this.j != null) {
      this.j.a(paramObject, this.i);
    }
    do
    {
      return;
      if (this.b != null)
      {
        this.b.a(paramObject, Integer.valueOf(this.i));
        return;
      }
    } while (this.c == null);
    try
    {
      this.g[0] = Integer.valueOf(this.i);
      this.c.invoke(paramObject, this.g);
      return;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.e("PropertyValuesHolder", ((InvocationTargetException)paramObject).toString());
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("PropertyValuesHolder", ((IllegalAccessException)paramObject).toString());
    }
  }
  
  Object d()
  {
    return Integer.valueOf(this.i);
  }
  
  public al e()
  {
    al localal = (al)super.a();
    localal.h = ((n)localal.e);
    return localal;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */