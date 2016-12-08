package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

final class ae
  implements ad, w
{
  private final ad a;
  
  public int a()
  {
    return this.a.a();
  }
  
  public void a(Writer paramWriter, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    this.a.a(paramWriter, paramLong, parama, paramInt, parami, paramLocale);
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    this.a.a(paramAppendable, paramLong, parama, paramInt, parami, paramLocale);
  }
  
  public void a(StringBuffer paramStringBuffer, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    try
    {
      this.a.a(paramStringBuffer, paramLong, parama, paramInt, parami, paramLocale);
      return;
    }
    catch (IOException paramStringBuffer) {}
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ae))
    {
      paramObject = (ae)paramObject;
      return this.a.equals(((ae)paramObject).a);
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */