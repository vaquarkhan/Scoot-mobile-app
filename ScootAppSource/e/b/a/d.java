package e.b.a;

import java.io.Serializable;

public abstract class d
  implements Serializable
{
  private static final d a = new e("era", (byte)1, m.l(), null);
  private static final d b = new e("yearOfEra", (byte)2, m.j(), m.l());
  private static final d c = new e("centuryOfEra", (byte)3, m.k(), m.l());
  private static final d d = new e("yearOfCentury", (byte)4, m.j(), m.k());
  private static final d e = new e("year", (byte)5, m.j(), null);
  private static final d f = new e("dayOfYear", (byte)6, m.f(), m.j());
  private static final d g = new e("monthOfYear", (byte)7, m.i(), m.j());
  private static final d h = new e("dayOfMonth", (byte)8, m.f(), m.i());
  private static final d i = new e("weekyearOfCentury", (byte)9, m.h(), m.k());
  private static final d j = new e("weekyear", (byte)10, m.h(), null);
  private static final d k = new e("weekOfWeekyear", (byte)11, m.g(), m.h());
  private static final d l = new e("dayOfWeek", (byte)12, m.f(), m.g());
  private static final d m = new e("halfdayOfDay", (byte)13, m.e(), m.f());
  private static final d n = new e("hourOfHalfday", (byte)14, m.d(), m.e());
  private static final d o = new e("clockhourOfHalfday", (byte)15, m.d(), m.e());
  private static final d p = new e("clockhourOfDay", (byte)16, m.d(), m.f());
  private static final d q = new e("hourOfDay", (byte)17, m.d(), m.f());
  private static final d r = new e("minuteOfDay", (byte)18, m.c(), m.f());
  private static final d s = new e("minuteOfHour", (byte)19, m.c(), m.d());
  private static final d t = new e("secondOfDay", (byte)20, m.b(), m.f());
  private static final d u = new e("secondOfMinute", (byte)21, m.b(), m.c());
  private static final d v = new e("millisOfDay", (byte)22, m.a(), m.f());
  private static final d w = new e("millisOfSecond", (byte)23, m.a(), m.b());
  private final String x;
  
  protected d(String paramString)
  {
    this.x = paramString;
  }
  
  public static d a()
  {
    return w;
  }
  
  public static d b()
  {
    return v;
  }
  
  public static d c()
  {
    return u;
  }
  
  public static d d()
  {
    return t;
  }
  
  public static d e()
  {
    return s;
  }
  
  public static d f()
  {
    return r;
  }
  
  public static d g()
  {
    return q;
  }
  
  public static d h()
  {
    return p;
  }
  
  public static d i()
  {
    return n;
  }
  
  public static d j()
  {
    return o;
  }
  
  public static d k()
  {
    return m;
  }
  
  public static d l()
  {
    return l;
  }
  
  public static d m()
  {
    return h;
  }
  
  public static d n()
  {
    return f;
  }
  
  public static d o()
  {
    return k;
  }
  
  public static d p()
  {
    return j;
  }
  
  public static d q()
  {
    return i;
  }
  
  public static d r()
  {
    return g;
  }
  
  public static d s()
  {
    return e;
  }
  
  public static d t()
  {
    return b;
  }
  
  public static d u()
  {
    return d;
  }
  
  public static d v()
  {
    return c;
  }
  
  public static d w()
  {
    return a;
  }
  
  public abstract c a(a parama);
  
  public String toString()
  {
    return x();
  }
  
  public String x()
  {
    return this.x;
  }
  
  public abstract m y();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */