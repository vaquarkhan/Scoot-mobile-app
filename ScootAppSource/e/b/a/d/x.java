package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.io.Writer;
import java.util.Locale;

final class x
  implements ad
{
  private final w a;
  
  private x(w paramw)
  {
    this.a = paramw;
  }
  
  static ad a(w paramw)
  {
    if ((paramw instanceof ae)) {
      return (ad)paramw;
    }
    if (paramw == null) {
      return null;
    }
    return new x(paramw);
  }
  
  public int a()
  {
    return this.a.a();
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    if ((paramAppendable instanceof StringBuffer))
    {
      localObject = (StringBuffer)paramAppendable;
      this.a.a((StringBuffer)localObject, paramLong, parama, paramInt, parami, paramLocale);
    }
    if ((paramAppendable instanceof Writer))
    {
      localObject = (Writer)paramAppendable;
      this.a.a((Writer)localObject, paramLong, parama, paramInt, parami, paramLocale);
    }
    Object localObject = new StringBuffer(a());
    this.a.a((StringBuffer)localObject, paramLong, parama, paramInt, parami, paramLocale);
    paramAppendable.append((CharSequence)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */