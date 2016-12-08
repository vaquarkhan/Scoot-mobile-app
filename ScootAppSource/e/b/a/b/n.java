package e.b.a.b;

import e.b.a.c.m;
import e.b.a.l;
import java.util.Locale;

final class n
  extends m
{
  private final d b;
  
  n(d paramd, l paraml)
  {
    super(e.b.a.d.l(), paraml);
    this.b = paramd;
  }
  
  public int a(long paramLong)
  {
    return this.b.g(paramLong);
  }
  
  protected int a(String paramString, Locale paramLocale)
  {
    return p.a(paramLocale).c(paramString);
  }
  
  public int a(Locale paramLocale)
  {
    return p.a(paramLocale).c();
  }
  
  public String a(int paramInt, Locale paramLocale)
  {
    return p.a(paramLocale).d(paramInt);
  }
  
  public String b(int paramInt, Locale paramLocale)
  {
    return p.a(paramLocale).e(paramInt);
  }
  
  public l e()
  {
    return this.b.w();
  }
  
  public int g()
  {
    return 1;
  }
  
  public int h()
  {
    return 7;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */