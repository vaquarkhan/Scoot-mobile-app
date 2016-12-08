package e.b.a.e;

import e.b.a.i;
import java.util.Collections;
import java.util.Set;

public final class l
  implements k
{
  private static final Set<String> a = Collections.singleton("UTC");
  
  public i a(String paramString)
  {
    if ("UTC".equalsIgnoreCase(paramString)) {
      return i.a;
    }
    return null;
  }
  
  public Set<String> a()
  {
    return a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\e\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */