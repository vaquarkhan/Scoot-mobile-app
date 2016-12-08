package com.google.a;

import com.google.a.b.a.g;
import com.google.a.b.a.h;
import com.google.a.b.a.z;
import com.google.a.b.f;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k
{
  final u a = new l(this);
  final ad b = new m(this);
  private final ThreadLocal<Map<com.google.a.c.a<?>, q<?>>> c = new ThreadLocal();
  private final Map<com.google.a.c.a<?>, am<?>> d = Collections.synchronizedMap(new HashMap());
  private final List<an> e;
  private final f f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  
  public k()
  {
    this(com.google.a.b.s.a, d.a, Collections.emptyMap(), false, false, false, true, false, false, ag.a, Collections.emptyList());
  }
  
  k(com.google.a.b.s params, j paramj, Map<Type, s<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, ag paramag, List<an> paramList)
  {
    this.f = new f(paramMap);
    this.g = paramBoolean1;
    this.i = paramBoolean3;
    this.h = paramBoolean4;
    this.j = paramBoolean5;
    paramMap = new ArrayList();
    paramMap.add(z.Q);
    paramMap.add(com.google.a.b.a.n.a);
    paramMap.add(params);
    paramMap.addAll(paramList);
    paramMap.add(z.x);
    paramMap.add(z.m);
    paramMap.add(z.g);
    paramMap.add(z.i);
    paramMap.add(z.k);
    paramMap.add(z.a(Long.TYPE, Long.class, a(paramag)));
    paramMap.add(z.a(Double.TYPE, Double.class, a(paramBoolean6)));
    paramMap.add(z.a(Float.TYPE, Float.class, b(paramBoolean6)));
    paramMap.add(z.r);
    paramMap.add(z.t);
    paramMap.add(z.z);
    paramMap.add(z.B);
    paramMap.add(z.a(BigDecimal.class, z.v));
    paramMap.add(z.a(BigInteger.class, z.w));
    paramMap.add(z.D);
    paramMap.add(z.F);
    paramMap.add(z.J);
    paramMap.add(z.O);
    paramMap.add(z.H);
    paramMap.add(z.d);
    paramMap.add(com.google.a.b.a.e.a);
    paramMap.add(z.M);
    paramMap.add(com.google.a.b.a.w.a);
    paramMap.add(com.google.a.b.a.u.a);
    paramMap.add(z.K);
    paramMap.add(com.google.a.b.a.a.a);
    paramMap.add(z.R);
    paramMap.add(z.b);
    paramMap.add(new com.google.a.b.a.c(this.f));
    paramMap.add(new com.google.a.b.a.l(this.f, paramBoolean2));
    paramMap.add(new g(this.f));
    paramMap.add(new com.google.a.b.a.q(this.f, paramj, params));
    this.e = Collections.unmodifiableList(paramMap);
  }
  
  private am<Number> a(ag paramag)
  {
    if (paramag == ag.a) {
      return z.n;
    }
    return new p(this);
  }
  
  private am<Number> a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return z.p;
    }
    return new n(this);
  }
  
  private com.google.a.d.d a(Writer paramWriter)
  {
    if (this.i) {
      paramWriter.write(")]}'\n");
    }
    paramWriter = new com.google.a.d.d(paramWriter);
    if (this.j) {
      paramWriter.c("  ");
    }
    paramWriter.d(this.g);
    return paramWriter;
  }
  
  private void a(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) {
      throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }
  }
  
  private static void a(Object paramObject, com.google.a.d.a parama)
  {
    if (paramObject != null) {
      try
      {
        if (parama.f() != com.google.a.d.c.j) {
          throw new x("JSON document was not fully consumed.");
        }
      }
      catch (com.google.a.d.e paramObject)
      {
        throw new af((Throwable)paramObject);
      }
      catch (IOException paramObject)
      {
        throw new x((Throwable)paramObject);
      }
    }
  }
  
  private am<Number> b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return z.o;
    }
    return new o(this);
  }
  
  public <T> am<T> a(an paraman, com.google.a.c.a<T> parama)
  {
    Iterator localIterator = this.e.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (an)localIterator.next();
      if (k == 0)
      {
        if (localObject == paraman) {
          k = 1;
        }
      }
      else
      {
        localObject = ((an)localObject).a(this, parama);
        if (localObject != null) {
          return (am<T>)localObject;
        }
      }
    }
    throw new IllegalArgumentException("GSON cannot serialize " + parama);
  }
  
  public <T> am<T> a(com.google.a.c.a<T> parama)
  {
    Object localObject1 = (am)this.d.get(parama);
    if (localObject1 != null) {
      return (am<T>)localObject1;
    }
    Object localObject3 = (Map)this.c.get();
    int k = 0;
    if (localObject3 == null)
    {
      localObject3 = new HashMap();
      this.c.set(localObject3);
      k = 1;
    }
    for (;;)
    {
      Object localObject4 = (q)((Map)localObject3).get(parama);
      localObject1 = localObject4;
      if (localObject4 != null) {
        break;
      }
      try
      {
        localObject1 = new q();
        ((Map)localObject3).put(parama, localObject1);
        Iterator localIterator = this.e.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            localObject4 = ((an)localIterator.next()).a(this, parama);
            if (localObject4 != null)
            {
              ((q)localObject1).a((am)localObject4);
              this.d.put(parama, localObject4);
              ((Map)localObject3).remove(parama);
              localObject1 = localObject4;
              if (k == 0) {
                break;
              }
              this.c.remove();
              return (am<T>)localObject4;
            }
          }
        }
        throw new IllegalArgumentException("GSON cannot handle " + parama);
      }
      finally
      {
        ((Map)localObject3).remove(parama);
        if (k != 0) {
          this.c.remove();
        }
      }
    }
  }
  
  public <T> am<T> a(Class<T> paramClass)
  {
    return a(com.google.a.c.a.b(paramClass));
  }
  
  public w a(Object paramObject)
  {
    if (paramObject == null) {
      return y.a;
    }
    return a(paramObject, paramObject.getClass());
  }
  
  public w a(Object paramObject, Type paramType)
  {
    com.google.a.b.a.j localj = new com.google.a.b.a.j();
    a(paramObject, paramType, localj);
    return localj.a();
  }
  
  /* Error */
  public <T> T a(com.google.a.d.a parama, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 446	com/google/a/d/a:p	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iconst_1
    //   10: invokevirtual 448	com/google/a/d/a:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 327	com/google/a/d/a:f	()Lcom/google/a/d/c;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: aload_2
    //   22: invokestatic 451	com/google/a/c/a:a	(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;
    //   25: invokevirtual 416	com/google/a/k:a	(Lcom/google/a/c/a;)Lcom/google/a/am;
    //   28: aload_1
    //   29: invokevirtual 454	com/google/a/am:b	(Lcom/google/a/d/a;)Ljava/lang/Object;
    //   32: astore_2
    //   33: aload_1
    //   34: iload 4
    //   36: invokevirtual 448	com/google/a/d/a:a	(Z)V
    //   39: aload_2
    //   40: areturn
    //   41: astore_2
    //   42: iload_3
    //   43: ifeq +11 -> 54
    //   46: aload_1
    //   47: iload 4
    //   49: invokevirtual 448	com/google/a/d/a:a	(Z)V
    //   52: aconst_null
    //   53: areturn
    //   54: new 339	com/google/a/af
    //   57: dup
    //   58: aload_2
    //   59: invokespecial 342	com/google/a/af:<init>	(Ljava/lang/Throwable;)V
    //   62: athrow
    //   63: astore_2
    //   64: aload_1
    //   65: iload 4
    //   67: invokevirtual 448	com/google/a/d/a:a	(Z)V
    //   70: aload_2
    //   71: athrow
    //   72: astore_2
    //   73: new 339	com/google/a/af
    //   76: dup
    //   77: aload_2
    //   78: invokespecial 342	com/google/a/af:<init>	(Ljava/lang/Throwable;)V
    //   81: athrow
    //   82: astore_2
    //   83: new 339	com/google/a/af
    //   86: dup
    //   87: aload_2
    //   88: invokespecial 342	com/google/a/af:<init>	(Ljava/lang/Throwable;)V
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	k
    //   0	92	1	parama	com.google.a.d.a
    //   0	92	2	paramType	Type
    //   1	42	3	k	int
    //   6	60	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   13	18	41	java/io/EOFException
    //   20	33	41	java/io/EOFException
    //   13	18	63	finally
    //   20	33	63	finally
    //   54	63	63	finally
    //   73	82	63	finally
    //   83	92	63	finally
    //   13	18	72	java/lang/IllegalStateException
    //   20	33	72	java/lang/IllegalStateException
    //   13	18	82	java/io/IOException
    //   20	33	82	java/io/IOException
  }
  
  public <T> T a(w paramw, Class<T> paramClass)
  {
    paramw = a(paramw, paramClass);
    return (T)com.google.a.b.af.a(paramClass).cast(paramw);
  }
  
  public <T> T a(w paramw, Type paramType)
  {
    if (paramw == null) {
      return null;
    }
    return (T)a(new h(paramw), paramType);
  }
  
  public <T> T a(Reader paramReader, Type paramType)
  {
    paramReader = new com.google.a.d.a(paramReader);
    paramType = a(paramReader, paramType);
    a(paramType, paramReader);
    return paramType;
  }
  
  public <T> T a(String paramString, Class<T> paramClass)
  {
    paramString = a(paramString, paramClass);
    return (T)com.google.a.b.af.a(paramClass).cast(paramString);
  }
  
  public <T> T a(String paramString, Type paramType)
  {
    if (paramString == null) {
      return null;
    }
    return (T)a(new StringReader(paramString), paramType);
  }
  
  public String a(w paramw)
  {
    StringWriter localStringWriter = new StringWriter();
    a(paramw, localStringWriter);
    return localStringWriter.toString();
  }
  
  public void a(w paramw, com.google.a.d.d paramd)
  {
    boolean bool1 = paramd.g();
    paramd.b(true);
    boolean bool2 = paramd.h();
    paramd.c(this.h);
    boolean bool3 = paramd.i();
    paramd.d(this.g);
    try
    {
      com.google.a.b.ag.a(paramw, paramd);
      return;
    }
    catch (IOException paramw)
    {
      throw new x(paramw);
    }
    finally
    {
      paramd.b(bool1);
      paramd.c(bool2);
      paramd.d(bool3);
    }
  }
  
  public void a(w paramw, Appendable paramAppendable)
  {
    try
    {
      a(paramw, a(com.google.a.b.ag.a(paramAppendable)));
      return;
    }
    catch (IOException paramw)
    {
      throw new RuntimeException(paramw);
    }
  }
  
  public void a(Object paramObject, Type paramType, com.google.a.d.d paramd)
  {
    paramType = a(com.google.a.c.a.a(paramType));
    boolean bool1 = paramd.g();
    paramd.b(true);
    boolean bool2 = paramd.h();
    paramd.c(this.h);
    boolean bool3 = paramd.i();
    paramd.d(this.g);
    try
    {
      paramType.a(paramd, paramObject);
      return;
    }
    catch (IOException paramObject)
    {
      throw new x((Throwable)paramObject);
    }
    finally
    {
      paramd.b(bool1);
      paramd.c(bool2);
      paramd.d(bool3);
    }
  }
  
  public void a(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      a(paramObject, paramType, a(com.google.a.b.ag.a(paramAppendable)));
      return;
    }
    catch (IOException paramObject)
    {
      throw new x((Throwable)paramObject);
    }
  }
  
  public String b(Object paramObject)
  {
    if (paramObject == null) {
      return a(y.a);
    }
    return b(paramObject, paramObject.getClass());
  }
  
  public String b(Object paramObject, Type paramType)
  {
    StringWriter localStringWriter = new StringWriter();
    a(paramObject, paramType, localStringWriter);
    return localStringWriter.toString();
  }
  
  public String toString()
  {
    return "{serializeNulls:" + this.g + "factories:" + this.e + ",instanceCreators:" + this.f + "}";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */