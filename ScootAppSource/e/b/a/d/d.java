package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.util.Locale;

final class d
  implements ab, ad
{
  private final char a;
  
  d(char paramChar)
  {
    this.a = paramChar;
  }
  
  public int a()
  {
    return 1;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    if (paramInt >= paramCharSequence.length()) {
      return paramInt ^ 0xFFFFFFFF;
    }
    char c2 = paramCharSequence.charAt(paramInt);
    char c1 = this.a;
    if (c2 != c1)
    {
      c2 = Character.toUpperCase(c2);
      c1 = Character.toUpperCase(c1);
      if ((c2 != c1) && (Character.toLowerCase(c2) != Character.toLowerCase(c1))) {
        return paramInt ^ 0xFFFFFFFF;
      }
    }
    return paramInt + 1;
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    paramAppendable.append(this.a);
  }
  
  public int b()
  {
    return 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */