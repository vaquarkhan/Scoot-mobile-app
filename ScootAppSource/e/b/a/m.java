package e.b.a;

import java.io.Serializable;

public abstract class m
  implements Serializable
{
  static final m a = new n("eras", (byte)1);
  static final m b = new n("centuries", (byte)2);
  static final m c = new n("weekyears", (byte)3);
  static final m d = new n("years", (byte)4);
  static final m e = new n("months", (byte)5);
  static final m f = new n("weeks", (byte)6);
  static final m g = new n("days", (byte)7);
  static final m h = new n("halfdays", (byte)8);
  static final m i = new n("hours", (byte)9);
  static final m j = new n("minutes", (byte)10);
  static final m k = new n("seconds", (byte)11);
  static final m l = new n("millis", (byte)12);
  private final String m;
  
  protected m(String paramString)
  {
    this.m = paramString;
  }
  
  public static m a()
  {
    return l;
  }
  
  public static m b()
  {
    return k;
  }
  
  public static m c()
  {
    return j;
  }
  
  public static m d()
  {
    return i;
  }
  
  public static m e()
  {
    return h;
  }
  
  public static m f()
  {
    return g;
  }
  
  public static m g()
  {
    return f;
  }
  
  public static m h()
  {
    return c;
  }
  
  public static m i()
  {
    return e;
  }
  
  public static m j()
  {
    return d;
  }
  
  public static m k()
  {
    return b;
  }
  
  public static m l()
  {
    return a;
  }
  
  public abstract l a(a parama);
  
  public String m()
  {
    return this.m;
  }
  
  public String toString()
  {
    return m();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */