package com.d.a;

import android.util.Log;
import com.d.b.a;
import com.d.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ak
  extends ai
{
  l h;
  float i;
  private a j;
  
  public ak(c paramc, float... paramVarArgs)
  {
    super(paramc, null);
    a(paramVarArgs);
    if ((paramc instanceof a)) {
      this.j = ((a)this.b);
    }
  }
  
  public ak(String paramString, l paraml)
  {
    super(paramString, null);
    this.d = Float.TYPE;
    this.e = paraml;
    this.h = ((l)this.e);
  }
  
  public ak(String paramString, float... paramVarArgs)
  {
    super(paramString, null);
    a(paramVarArgs);
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
  
  public void a(float... paramVarArgs)
  {
    super.a(paramVarArgs);
    this.h = ((l)this.e);
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
        this.b.a(paramObject, Float.valueOf(this.i));
        return;
      }
    } while (this.c == null);
    try
    {
      this.g[0] = Float.valueOf(this.i);
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
    return Float.valueOf(this.i);
  }
  
  public ak e()
  {
    ak localak = (ak)super.a();
    localak.h = ((l)localak.e);
    return localak;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */