package e.b.a.c;

import e.b.a.c;
import e.b.a.d;
import java.io.Serializable;
import java.util.Locale;

public abstract class a
  implements Serializable
{
  public abstract c a();
  
  public String a(Locale paramLocale)
  {
    return a().a(b(), paramLocale);
  }
  
  protected abstract long b();
  
  public String b(Locale paramLocale)
  {
    return a().b(b(), paramLocale);
  }
  
  public int c(Locale paramLocale)
  {
    return a().a(paramLocale);
  }
  
  protected e.b.a.a c()
  {
    throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
  }
  
  public d d()
  {
    return a().a();
  }
  
  public String e()
  {
    return a().b();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
    } while ((f() == ((a)paramObject).f()) && (d().equals(((a)paramObject).d())) && (g.a(c(), ((a)paramObject).c())));
    return false;
  }
  
  public int f()
  {
    return a().a(b());
  }
  
  public int g()
  {
    return a().g();
  }
  
  public int h()
  {
    return a().h();
  }
  
  public int hashCode()
  {
    return f() * 17 + d().hashCode() + c().hashCode();
  }
  
  public String toString()
  {
    return "Property[" + e() + "]";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */