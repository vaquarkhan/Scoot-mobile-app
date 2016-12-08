package e.a;

import java.util.EnumSet;
import java.util.Iterator;

public enum bo
{
  private final int o;
  private final String p;
  
  private bo(int paramInt, String paramString)
  {
    this.o = paramInt;
    this.p = paramString;
  }
  
  public static bo a(int paramInt)
  {
    Iterator localIterator = EnumSet.allOf(bo.class).iterator();
    while (localIterator.hasNext())
    {
      bo localbo = (bo)localIterator.next();
      if (localbo.o == paramInt) {
        return localbo;
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */