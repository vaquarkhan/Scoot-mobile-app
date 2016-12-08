package b.a.a.a.a.e;

import b.a.a.a.t;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class b
  implements n
{
  private final t a;
  private p b;
  private SSLSocketFactory c;
  private boolean d;
  
  public b()
  {
    this(new b.a.a.a.e());
  }
  
  public b(t paramt)
  {
    this.a = paramt;
  }
  
  private void a()
  {
    try
    {
      this.d = false;
      this.c = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean a(String paramString)
  {
    return (paramString != null) && (paramString.toLowerCase(Locale.US).startsWith("https"));
  }
  
  private SSLSocketFactory b()
  {
    try
    {
      if ((this.c == null) && (!this.d)) {
        this.c = c();
      }
      SSLSocketFactory localSSLSocketFactory = this.c;
      return localSSLSocketFactory;
    }
    finally {}
  }
  
  /* Error */
  private SSLSocketFactory c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 29	b/a/a/a/a/e/b:d	Z
    //   7: aload_0
    //   8: getfield 56	b/a/a/a/a/e/b:b	Lb/a/a/a/a/e/p;
    //   11: invokestatic 61	b/a/a/a/a/e/o:a	(Lb/a/a/a/a/e/p;)Ljavax/net/ssl/SSLSocketFactory;
    //   14: astore_1
    //   15: aload_0
    //   16: getfield 27	b/a/a/a/a/e/b:a	Lb/a/a/a/t;
    //   19: ldc 63
    //   21: ldc 65
    //   23: invokeinterface 70 3 0
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: areturn
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 27	b/a/a/a/a/e/b:a	Lb/a/a/a/t;
    //   37: ldc 63
    //   39: ldc 72
    //   41: aload_1
    //   42: invokeinterface 76 4 0
    //   47: aconst_null
    //   48: astore_1
    //   49: goto -21 -> 28
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	b
    //   14	17	1	localSSLSocketFactory	SSLSocketFactory
    //   32	10	1	localException	Exception
    //   48	1	1	localObject1	Object
    //   52	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   7	28	32	java/lang/Exception
    //   2	7	52	finally
    //   7	28	52	finally
    //   33	47	52	finally
  }
  
  public e a(int paramInt, String paramString, Map<String, String> paramMap)
  {
    switch (c.a[(paramInt - 1)])
    {
    default: 
      throw new IllegalArgumentException("Unsupported HTTP method!");
    case 1: 
      paramMap = e.a(paramString, paramMap, true);
    }
    for (;;)
    {
      if ((a(paramString)) && (this.b != null))
      {
        paramString = b();
        if (paramString != null) {
          ((HttpsURLConnection)paramMap.a()).setSSLSocketFactory(paramString);
        }
      }
      return paramMap;
      paramMap = e.b(paramString, paramMap, true);
      continue;
      paramMap = e.d(paramString);
      continue;
      paramMap = e.e(paramString);
    }
  }
  
  public void a(p paramp)
  {
    if (this.b != paramp)
    {
      this.b = paramp;
      a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */