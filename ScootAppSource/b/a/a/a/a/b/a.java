package b.a.a.a.a.b;

import b.a.a.a.a.e.e;
import b.a.a.a.a.e.n;
import b.a.a.a.q;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class a
{
  private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
  protected final q a;
  private final String c;
  private final n d;
  private final int e;
  private final String f;
  
  public a(q paramq, String paramString1, String paramString2, n paramn, int paramInt)
  {
    if (paramString2 == null) {
      throw new IllegalArgumentException("url must not be null.");
    }
    if (paramn == null) {
      throw new IllegalArgumentException("requestFactory must not be null.");
    }
    this.a = paramq;
    this.f = paramString1;
    this.c = a(paramString2);
    this.d = paramn;
    this.e = paramInt;
  }
  
  private String a(String paramString)
  {
    String str = paramString;
    if (!m.c(this.f)) {
      str = b.matcher(paramString).replaceFirst(this.f);
    }
    return str;
  }
  
  protected e a(Map<String, String> paramMap)
  {
    return this.d.a(this.e, a(), paramMap).a(false).a(10000).a("User-Agent", "Crashlytics Android SDK/" + this.a.a()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
  }
  
  protected String a()
  {
    return this.c;
  }
  
  protected e b()
  {
    return a(Collections.emptyMap());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */