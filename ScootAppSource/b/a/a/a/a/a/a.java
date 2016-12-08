package b.a.a.a.a.a;

import android.content.Context;

public abstract class a<T>
  implements c<T>
{
  private final c<T> a;
  
  public a(c<T> paramc)
  {
    this.a = paramc;
  }
  
  private void b(Context paramContext, T paramT)
  {
    if (paramT == null) {
      throw new NullPointerException();
    }
    a(paramContext, paramT);
  }
  
  protected abstract T a(Context paramContext);
  
  /* Error */
  public final T a(Context paramContext, d<T> paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 32	b/a/a/a/a/a/a:a	(Landroid/content/Context;)Ljava/lang/Object;
    //   7: astore 4
    //   9: aload 4
    //   11: astore_3
    //   12: aload 4
    //   14: ifnonnull +30 -> 44
    //   17: aload_0
    //   18: getfield 17	b/a/a/a/a/a/a:a	Lb/a/a/a/a/a/c;
    //   21: ifnull +27 -> 48
    //   24: aload_0
    //   25: getfield 17	b/a/a/a/a/a/a:a	Lb/a/a/a/a/a/c;
    //   28: aload_1
    //   29: aload_2
    //   30: invokeinterface 34 3 0
    //   35: astore_2
    //   36: aload_0
    //   37: aload_1
    //   38: aload_2
    //   39: invokespecial 36	b/a/a/a/a/a/a:b	(Landroid/content/Context;Ljava/lang/Object;)V
    //   42: aload_2
    //   43: astore_3
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_3
    //   47: areturn
    //   48: aload_2
    //   49: aload_1
    //   50: invokeinterface 41 2 0
    //   55: astore_2
    //   56: goto -20 -> 36
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	a
    //   0	64	1	paramContext	Context
    //   0	64	2	paramd	d<T>
    //   11	36	3	localObject1	Object
    //   7	6	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	59	finally
    //   17	36	59	finally
    //   36	42	59	finally
    //   48	56	59	finally
  }
  
  protected abstract void a(Context paramContext, T paramT);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */