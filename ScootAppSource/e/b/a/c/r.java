package e.b.a.c;

import e.b.a.l;
import e.b.a.m;
import java.io.Serializable;
import java.util.HashMap;

public final class r
  extends l
  implements Serializable
{
  private static HashMap<m, r> a;
  private final m b;
  
  private r(m paramm)
  {
    this.b = paramm;
  }
  
  /* Error */
  public static r a(m paramm)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 22	e/b/a/c/r:a	Ljava/util/HashMap;
    //   6: ifnonnull +46 -> 52
    //   9: new 24	java/util/HashMap
    //   12: dup
    //   13: bipush 7
    //   15: invokespecial 27	java/util/HashMap:<init>	(I)V
    //   18: putstatic 22	e/b/a/c/r:a	Ljava/util/HashMap;
    //   21: aconst_null
    //   22: astore_1
    //   23: aload_1
    //   24: astore_2
    //   25: aload_1
    //   26: ifnonnull +21 -> 47
    //   29: new 2	e/b/a/c/r
    //   32: dup
    //   33: aload_0
    //   34: invokespecial 29	e/b/a/c/r:<init>	(Le/b/a/m;)V
    //   37: astore_2
    //   38: getstatic 22	e/b/a/c/r:a	Ljava/util/HashMap;
    //   41: aload_0
    //   42: aload_2
    //   43: invokevirtual 33	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   46: pop
    //   47: ldc 2
    //   49: monitorexit
    //   50: aload_2
    //   51: areturn
    //   52: getstatic 22	e/b/a/c/r:a	Ljava/util/HashMap;
    //   55: aload_0
    //   56: invokevirtual 37	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   59: checkcast 2	e/b/a/c/r
    //   62: astore_1
    //   63: goto -40 -> 23
    //   66: astore_0
    //   67: ldc 2
    //   69: monitorexit
    //   70: aload_0
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	paramm	m
    //   22	41	1	localr1	r
    //   24	27	2	localr2	r
    // Exception table:
    //   from	to	target	type
    //   3	21	66	finally
    //   29	47	66	finally
    //   52	63	66	finally
  }
  
  private UnsupportedOperationException f()
  {
    return new UnsupportedOperationException(this.b + " field is unsupported");
  }
  
  public int a(l paraml)
  {
    return 0;
  }
  
  public long a(long paramLong, int paramInt)
  {
    throw f();
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    throw f();
  }
  
  public final m a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean c()
  {
    return true;
  }
  
  public long d()
  {
    return 0L;
  }
  
  public String e()
  {
    return this.b.m();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof r)) {
        break label47;
      }
      paramObject = (r)paramObject;
      if (((r)paramObject).e() != null) {
        break;
      }
    } while (e() == null);
    return false;
    return ((r)paramObject).e().equals(e());
    label47:
    return false;
  }
  
  public int hashCode()
  {
    return e().hashCode();
  }
  
  public String toString()
  {
    return "UnsupportedDurationField[" + e() + ']';
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */