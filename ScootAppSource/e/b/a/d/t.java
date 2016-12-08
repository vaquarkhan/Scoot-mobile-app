package e.b.a.d;

import e.b.a.c;
import java.util.Locale;

final class t
  implements Comparable<t>
{
  c a;
  int b;
  String c;
  Locale d;
  
  public int a(t paramt)
  {
    paramt = paramt.a;
    int i = s.a(this.a.e(), paramt.e());
    if (i != 0) {
      return i;
    }
    return s.a(this.a.d(), paramt.d());
  }
  
  long a(long paramLong, boolean paramBoolean)
  {
    if (this.c == null) {}
    for (paramLong = this.a.c(paramLong, this.b);; paramLong = this.a.a(paramLong, this.c, this.d))
    {
      long l = paramLong;
      if (paramBoolean) {
        l = this.a.d(paramLong);
      }
      return l;
    }
  }
  
  void a(c paramc, int paramInt)
  {
    this.a = paramc;
    this.b = paramInt;
    this.c = null;
    this.d = null;
  }
  
  void a(c paramc, String paramString, Locale paramLocale)
  {
    this.a = paramc;
    this.b = 0;
    this.c = paramString;
    this.d = paramLocale;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */