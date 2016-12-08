package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.util.Locale;

final class k
  implements ab, ad
{
  private final String a;
  
  k(String paramString)
  {
    this.a = paramString;
  }
  
  public int a()
  {
    return this.a.length();
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    if (c.c(paramCharSequence, paramInt, this.a)) {
      return this.a.length() + paramInt;
    }
    return paramInt ^ 0xFFFFFFFF;
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    paramAppendable.append(this.a);
  }
  
  public int b()
  {
    return this.a.length();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */