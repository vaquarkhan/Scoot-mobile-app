package com.google.a;

import com.google.a.b.ag;
import com.google.a.d.d;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class w
{
  public Number a()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public String b()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public double c()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public long d()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public int e()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public boolean f()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public boolean g()
  {
    return this instanceof t;
  }
  
  public boolean h()
  {
    return this instanceof z;
  }
  
  public boolean i()
  {
    return this instanceof ac;
  }
  
  public boolean j()
  {
    return this instanceof y;
  }
  
  public z k()
  {
    if (h()) {
      return (z)this;
    }
    throw new IllegalStateException("Not a JSON Object: " + this);
  }
  
  public t l()
  {
    if (g()) {
      return (t)this;
    }
    throw new IllegalStateException("This is not a JSON Array.");
  }
  
  public ac m()
  {
    if (i()) {
      return (ac)this;
    }
    throw new IllegalStateException("This is not a JSON Primitive.");
  }
  
  Boolean n()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public String toString()
  {
    try
    {
      Object localObject = new StringWriter();
      d locald = new d((Writer)localObject);
      locald.b(true);
      ag.a(this, locald);
      localObject = ((StringWriter)localObject).toString();
      return (String)localObject;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */