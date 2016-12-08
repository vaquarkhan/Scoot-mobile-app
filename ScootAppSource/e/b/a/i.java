package e.b.a;

import e.b.a.d.b;
import e.b.a.e.h;
import e.b.a.e.k;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;

public abstract class i
  implements Serializable
{
  public static final i a = y.b;
  private static final AtomicReference<k> b = new AtomicReference();
  private static final AtomicReference<e.b.a.e.j> c = new AtomicReference();
  private static final AtomicReference<i> d = new AtomicReference();
  private final String e;
  
  protected i(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Id must not be null");
    }
    this.e = paramString;
  }
  
  public static i a()
  {
    Object localObject3 = (i)d.get();
    Object localObject5 = localObject3;
    if (localObject3 == null) {
      localObject1 = localObject3;
    }
    try
    {
      localObject5 = System.getProperty("user.timezone");
      localObject1 = localObject3;
      if (localObject5 != null)
      {
        localObject1 = localObject3;
        localObject5 = a((String)localObject5);
        localObject1 = localObject5;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localObject4 = localObject1;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Object localObject4;
        Object localObject2 = localObject4;
      }
    }
    localObject3 = localObject1;
    if (localObject1 == null) {
      localObject3 = a(TimeZone.getDefault());
    }
    localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = a;
    }
    localObject5 = localObject1;
    if (!d.compareAndSet(null, localObject1)) {
      localObject5 = (i)d.get();
    }
    return (i)localObject5;
  }
  
  @FromString
  public static i a(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = a();
    }
    i locali;
    do
    {
      return (i)localObject;
      if (paramString.equals("UTC")) {
        return a;
      }
      locali = c().a(paramString);
      localObject = locali;
    } while (locali != null);
    if ((paramString.startsWith("+")) || (paramString.startsWith("-")))
    {
      int i = c(paramString);
      if (i == 0L) {
        return a;
      }
      return a(a(i), i);
    }
    throw new IllegalArgumentException("The datetime zone id '" + paramString + "' is not recognised");
  }
  
  private static i a(String paramString, int paramInt)
  {
    if (paramInt == 0) {
      return a;
    }
    return new e.b.a.e.i(paramString, null, paramInt, paramInt);
  }
  
  public static i a(TimeZone paramTimeZone)
  {
    Object localObject;
    if (paramTimeZone == null) {
      localObject = a();
    }
    String str1;
    String str2;
    do
    {
      return (i)localObject;
      str1 = paramTimeZone.getID();
      if (str1 == null) {
        throw new IllegalArgumentException("The TimeZone id must not be null");
      }
      if (str1.equals("UTC")) {
        return a;
      }
      localObject = null;
      str2 = b(str1);
      k localk = c();
      if (str2 != null) {
        localObject = localk.a(str2);
      }
      paramTimeZone = (TimeZone)localObject;
      if (localObject == null) {
        paramTimeZone = localk.a(str1);
      }
      localObject = paramTimeZone;
    } while (paramTimeZone != null);
    if ((str2 == null) && ((str1.startsWith("GMT+")) || (str1.startsWith("GMT-"))))
    {
      int i = c(str1.substring(3));
      if (i == 0L) {
        return a;
      }
      return a(a(i), i);
    }
    throw new IllegalArgumentException("The datetime zone id '" + str1 + "' is not recognised");
  }
  
  private static String a(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramInt >= 0) {
      localStringBuffer.append('+');
    }
    for (;;)
    {
      i = paramInt / 3600000;
      e.b.a.d.y.a(localStringBuffer, i, 2);
      paramInt -= i * 3600000;
      i = paramInt / 60000;
      localStringBuffer.append(':');
      e.b.a.d.y.a(localStringBuffer, i, 2);
      paramInt -= i * 60000;
      if (paramInt != 0) {
        break;
      }
      return localStringBuffer.toString();
      localStringBuffer.append('-');
      paramInt = -paramInt;
    }
    int i = paramInt / 1000;
    localStringBuffer.append(':');
    e.b.a.d.y.a(localStringBuffer, i, 2);
    paramInt -= i * 1000;
    if (paramInt == 0) {
      return localStringBuffer.toString();
    }
    localStringBuffer.append('.');
    e.b.a.d.y.a(localStringBuffer, paramInt, 3);
    return localStringBuffer.toString();
  }
  
  public static void a(k paramk)
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null) {
      localSecurityManager.checkPermission(new r("DateTimeZone.setProvider"));
    }
    if (paramk == null) {
      paramk = g();
    }
    for (;;)
    {
      b.set(paramk);
      return;
      b(paramk);
    }
  }
  
  public static void a(i parami)
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null) {
      localSecurityManager.checkPermission(new r("DateTimeZone.setDefault"));
    }
    if (parami == null) {
      throw new IllegalArgumentException("The datetime zone must not be null");
    }
    d.set(parami);
  }
  
  private static k b(k paramk)
  {
    Set localSet = paramk.a();
    if ((localSet == null) || (localSet.size() == 0)) {
      throw new IllegalArgumentException("The provider doesn't have any available ids");
    }
    if (!localSet.contains("UTC")) {
      throw new IllegalArgumentException("The provider doesn't support UTC");
    }
    if (!a.equals(paramk.a("UTC"))) {
      throw new IllegalArgumentException("Invalid UTC zone provided");
    }
    return paramk;
  }
  
  private static String b(String paramString)
  {
    return (String)j.a.get(paramString);
  }
  
  public static Set<String> b()
  {
    return c().a();
  }
  
  private static int c(String paramString)
  {
    return -(int)j.b.a(paramString);
  }
  
  public static k c()
  {
    k localk2 = (k)b.get();
    k localk1 = localk2;
    if (localk2 == null)
    {
      localk2 = g();
      localk1 = localk2;
      if (!b.compareAndSet(null, localk2)) {
        localk1 = (k)b.get();
      }
    }
    return localk1;
  }
  
  public static e.b.a.e.j d()
  {
    e.b.a.e.j localj2 = (e.b.a.e.j)c.get();
    e.b.a.e.j localj1 = localj2;
    if (localj2 == null)
    {
      localj2 = h();
      localj1 = localj2;
      if (!c.compareAndSet(null, localj2)) {
        localj1 = (e.b.a.e.j)c.get();
      }
    }
    return localj1;
  }
  
  /* Error */
  private static k g()
  {
    // Byte code:
    //   0: ldc -13
    //   2: invokestatic 62	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_0
    //   6: aload_0
    //   7: ifnull +30 -> 37
    //   10: aload_0
    //   11: invokestatic 249	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   14: invokevirtual 252	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   17: checkcast 94	e/b/a/e/k
    //   20: invokestatic 187	e/b/a/i:b	(Le/b/a/e/k;)Le/b/a/e/k;
    //   23: astore_0
    //   24: aload_0
    //   25: areturn
    //   26: astore_0
    //   27: new 50	java/lang/RuntimeException
    //   30: dup
    //   31: aload_0
    //   32: invokespecial 255	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   35: athrow
    //   36: astore_0
    //   37: ldc_w 257
    //   40: invokestatic 62	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   43: astore_0
    //   44: aload_0
    //   45: ifnull +35 -> 80
    //   48: new 259	e/b/a/e/m
    //   51: dup
    //   52: new 261	java/io/File
    //   55: dup
    //   56: aload_0
    //   57: invokespecial 262	java/io/File:<init>	(Ljava/lang/String;)V
    //   60: invokespecial 265	e/b/a/e/m:<init>	(Ljava/io/File;)V
    //   63: invokestatic 187	e/b/a/i:b	(Le/b/a/e/k;)Le/b/a/e/k;
    //   66: astore_0
    //   67: aload_0
    //   68: areturn
    //   69: astore_0
    //   70: new 50	java/lang/RuntimeException
    //   73: dup
    //   74: aload_0
    //   75: invokespecial 255	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   78: athrow
    //   79: astore_0
    //   80: new 259	e/b/a/e/m
    //   83: dup
    //   84: ldc_w 267
    //   87: invokespecial 268	e/b/a/e/m:<init>	(Ljava/lang/String;)V
    //   90: invokestatic 187	e/b/a/i:b	(Le/b/a/e/k;)Le/b/a/e/k;
    //   93: astore_0
    //   94: aload_0
    //   95: areturn
    //   96: astore_0
    //   97: aload_0
    //   98: invokevirtual 271	java/lang/Exception:printStackTrace	()V
    //   101: new 273	e/b/a/e/l
    //   104: dup
    //   105: invokespecial 274	e/b/a/e/l:<init>	()V
    //   108: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	20	0	localObject1	Object
    //   26	6	0	localException1	Exception
    //   36	1	0	localSecurityException1	SecurityException
    //   43	25	0	localObject2	Object
    //   69	6	0	localException2	Exception
    //   79	1	0	localSecurityException2	SecurityException
    //   93	2	0	localk	k
    //   96	2	0	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   10	24	26	java/lang/Exception
    //   0	6	36	java/lang/SecurityException
    //   10	24	36	java/lang/SecurityException
    //   27	36	36	java/lang/SecurityException
    //   48	67	69	java/lang/Exception
    //   37	44	79	java/lang/SecurityException
    //   48	67	79	java/lang/SecurityException
    //   70	79	79	java/lang/SecurityException
    //   80	94	96	java/lang/Exception
  }
  
  private static e.b.a.e.j h()
  {
    for (;;)
    {
      try
      {
        localObject1 = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
        if (localObject1 == null) {
          continue;
        }
      }
      catch (SecurityException localSecurityException)
      {
        Object localObject1;
        Object localObject3;
        Object localObject2 = null;
        continue;
        localObject2 = null;
        continue;
      }
      try
      {
        localObject1 = (e.b.a.e.j)Class.forName((String)localObject1).newInstance();
        localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = new h();
        }
        return (e.b.a.e.j)localObject3;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
  }
  
  public long a(long paramLong, boolean paramBoolean)
  {
    long l2 = Long.MAX_VALUE;
    int i = b(paramLong);
    int j = b(paramLong - i);
    long l3;
    long l1;
    if ((i != j) && ((paramBoolean) || (i < 0)))
    {
      l3 = g(paramLong - i);
      l1 = l3;
      if (l3 == paramLong - i) {
        l1 = Long.MAX_VALUE;
      }
      l3 = g(paramLong - j);
      if (l3 != paramLong - j) {
        break label164;
      }
    }
    for (;;)
    {
      if (l1 != l2) {
        if (paramBoolean) {
          throw new p(paramLong, e());
        }
      }
      for (;;)
      {
        l1 = paramLong - i;
        if (((paramLong ^ l1) < 0L) && ((i ^ paramLong) < 0L)) {
          throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }
        return l1;
        i = j;
      }
      label164:
      l2 = l3;
    }
  }
  
  public long a(long paramLong1, boolean paramBoolean, long paramLong2)
  {
    int i = b(paramLong2);
    paramLong2 = paramLong1 - i;
    if (b(paramLong2) == i) {
      return paramLong2;
    }
    return a(paramLong1, paramBoolean);
  }
  
  public abstract String a(long paramLong);
  
  public String a(long paramLong, Locale paramLocale)
  {
    Object localObject = paramLocale;
    if (paramLocale == null) {
      localObject = Locale.getDefault();
    }
    paramLocale = a(paramLong);
    if (paramLocale == null)
    {
      localObject = this.e;
      return (String)localObject;
    }
    e.b.a.e.j localj = d();
    if ((localj instanceof h)) {}
    for (paramLocale = ((h)localj).a((Locale)localObject, this.e, paramLocale, d(paramLong));; paramLocale = localj.a((Locale)localObject, this.e, paramLocale))
    {
      localObject = paramLocale;
      if (paramLocale != null) {
        break;
      }
      return a(b(paramLong));
    }
  }
  
  public abstract int b(long paramLong);
  
  public String b(long paramLong, Locale paramLocale)
  {
    Object localObject = paramLocale;
    if (paramLocale == null) {
      localObject = Locale.getDefault();
    }
    paramLocale = a(paramLong);
    if (paramLocale == null)
    {
      localObject = this.e;
      return (String)localObject;
    }
    e.b.a.e.j localj = d();
    if ((localj instanceof h)) {}
    for (paramLocale = ((h)localj).b((Locale)localObject, this.e, paramLocale, d(paramLong));; paramLocale = localj.b((Locale)localObject, this.e, paramLocale))
    {
      localObject = paramLocale;
      if (paramLocale != null) {
        break;
      }
      return a(b(paramLong));
    }
  }
  
  public abstract int c(long paramLong);
  
  public boolean d(long paramLong)
  {
    return b(paramLong) == c(paramLong);
  }
  
  public int e(long paramLong)
  {
    long l2 = Long.MAX_VALUE;
    int j = b(paramLong);
    long l1 = paramLong - j;
    int m = b(l1);
    long l3;
    if (j != m)
    {
      if (j - m >= 0) {
        break label150;
      }
      l3 = g(l1);
      l1 = l3;
      if (l3 == paramLong - j) {
        l1 = Long.MAX_VALUE;
      }
      l3 = g(paramLong - m);
      if (l3 != paramLong - m) {
        break label153;
      }
    }
    label150:
    label153:
    for (paramLong = l2;; paramLong = l3)
    {
      if (l1 != paramLong)
      {
        int i = j;
        int k;
        do
        {
          return i;
          if (j < 0) {
            break;
          }
          paramLong = h(l1);
          if (paramLong >= l1) {
            break;
          }
          k = b(paramLong);
          i = k;
        } while (l1 - paramLong <= k - j);
      }
      return m;
    }
  }
  
  @ToString
  public final String e()
  {
    return this.e;
  }
  
  public abstract boolean equals(Object paramObject);
  
  public long f(long paramLong)
  {
    int i = b(paramLong);
    long l = i + paramLong;
    if (((paramLong ^ l) < 0L) && ((i ^ paramLong) >= 0L)) {
      throw new ArithmeticException("Adding time zone offset caused overflow");
    }
    return l;
  }
  
  public abstract boolean f();
  
  public abstract long g(long paramLong);
  
  public abstract long h(long paramLong);
  
  public int hashCode()
  {
    return e().hashCode() + 57;
  }
  
  public String toString()
  {
    return e();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */