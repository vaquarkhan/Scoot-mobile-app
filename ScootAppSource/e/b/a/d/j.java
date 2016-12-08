package e.b.a.d;

import e.b.a.a;
import e.b.a.d;
import java.util.Locale;

class j
  extends i
{
  protected final int d;
  
  protected j(d paramd, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    super(paramd, paramInt1, paramBoolean);
    this.d = paramInt2;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, e.b.a.i parami, Locale paramLocale)
  {
    try
    {
      y.a(paramAppendable, this.a.a(parama).a(paramLong), this.d);
      return;
    }
    catch (RuntimeException parama)
    {
      c.a(paramAppendable, this.d);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */