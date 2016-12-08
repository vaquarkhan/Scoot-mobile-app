package e.b.a;

import e.b.a.d.a;
import e.b.a.d.b;

public final class p
  extends IllegalArgumentException
{
  public p(long paramLong, String paramString)
  {
    super(a(paramLong, paramString));
  }
  
  public p(String paramString)
  {
    super(paramString);
  }
  
  private static String a(long paramLong, String paramString)
  {
    String str = a.a("yyyy-MM-dd'T'HH:mm:ss.SSS").a(new q(paramLong));
    if (paramString != null) {}
    for (paramString = " (" + paramString + ")";; paramString = "") {
      return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + str + paramString;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */