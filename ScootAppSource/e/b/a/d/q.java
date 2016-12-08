package e.b.a.d;

import e.b.a.a;
import e.b.a.c;
import e.b.a.d;
import java.util.Locale;

final class q
  extends i
{
  protected q(d paramd, int paramInt, boolean paramBoolean)
  {
    super(paramd, paramInt, paramBoolean);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, e.b.a.i parami, Locale paramLocale)
  {
    try
    {
      y.a(paramAppendable, this.a.a(parama).a(paramLong));
      return;
    }
    catch (RuntimeException parama)
    {
      paramAppendable.append(65533);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */