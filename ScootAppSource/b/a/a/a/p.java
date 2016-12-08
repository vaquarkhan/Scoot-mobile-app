package b.a.a.a;

import b.a.a.a.a.b.aj;

final class p<Result>
  extends b.a.a.a.a.c.p<Void, Void, Result>
{
  final q<Result> a;
  
  public p(q<Result> paramq)
  {
    this.a = paramq;
  }
  
  private aj a(String paramString)
  {
    paramString = new aj(this.a.b() + "." + paramString, "KitInitialization");
    paramString.a();
    return paramString;
  }
  
  protected Result a(Void... paramVarArgs)
  {
    aj localaj = a("doInBackground");
    paramVarArgs = null;
    if (!e()) {
      paramVarArgs = this.a.e();
    }
    localaj.b();
    return paramVarArgs;
  }
  
  /* Error */
  protected void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 71	b/a/a/a/a/c/p:a	()V
    //   4: aload_0
    //   5: ldc 73
    //   7: invokespecial 56	b/a/a/a/p:a	(Ljava/lang/String;)Lb/a/a/a/a/b/aj;
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 15	b/a/a/a/p:a	Lb/a/a/a/q;
    //   15: invokevirtual 76	b/a/a/a/q:h_	()Z
    //   18: istore_1
    //   19: aload_2
    //   20: invokevirtual 65	b/a/a/a/a/b/aj:b	()V
    //   23: iload_1
    //   24: ifne +9 -> 33
    //   27: aload_0
    //   28: iconst_1
    //   29: invokevirtual 79	b/a/a/a/p:a	(Z)Z
    //   32: pop
    //   33: return
    //   34: astore_3
    //   35: aload_3
    //   36: athrow
    //   37: astore_3
    //   38: aload_2
    //   39: invokevirtual 65	b/a/a/a/a/b/aj:b	()V
    //   42: aload_0
    //   43: iconst_1
    //   44: invokevirtual 79	b/a/a/a/p:a	(Z)Z
    //   47: pop
    //   48: aload_3
    //   49: athrow
    //   50: astore_3
    //   51: invokestatic 85	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   54: ldc 87
    //   56: ldc 89
    //   58: aload_3
    //   59: invokeinterface 94 4 0
    //   64: aload_2
    //   65: invokevirtual 65	b/a/a/a/a/b/aj:b	()V
    //   68: aload_0
    //   69: iconst_1
    //   70: invokevirtual 79	b/a/a/a/p:a	(Z)Z
    //   73: pop
    //   74: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	p
    //   18	6	1	bool	boolean
    //   10	55	2	localaj	aj
    //   34	2	3	localz	b.a.a.a.a.c.z
    //   37	12	3	localObject	Object
    //   50	9	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   11	19	34	b/a/a/a/a/c/z
    //   11	19	37	finally
    //   35	37	37	finally
    //   51	64	37	finally
    //   11	19	50	java/lang/Exception
  }
  
  protected void a(Result paramResult)
  {
    this.a.a(paramResult);
    this.a.h.a(paramResult);
  }
  
  public int b()
  {
    return b.a.a.a.a.c.o.c;
  }
  
  protected void b(Result paramResult)
  {
    this.a.b(paramResult);
    paramResult = new o(this.a.b() + " Initialization was cancelled");
    this.a.h.a(paramResult);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */