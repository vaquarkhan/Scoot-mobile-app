package com.google.a;

import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.e;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class ab
{
  /* Error */
  public w a(a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 21	com/google/a/d/a:p	()Z
    //   4: istore_2
    //   5: aload_1
    //   6: iconst_1
    //   7: invokevirtual 24	com/google/a/d/a:a	(Z)V
    //   10: aload_1
    //   11: invokestatic 28	com/google/a/b/ag:a	(Lcom/google/a/d/a;)Lcom/google/a/w;
    //   14: astore_3
    //   15: aload_1
    //   16: iload_2
    //   17: invokevirtual 24	com/google/a/d/a:a	(Z)V
    //   20: aload_3
    //   21: areturn
    //   22: astore_3
    //   23: new 30	com/google/a/aa
    //   26: dup
    //   27: new 32	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 33	java/lang/StringBuilder:<init>	()V
    //   34: ldc 35
    //   36: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: aload_1
    //   40: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   43: ldc 44
    //   45: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: aload_3
    //   52: invokespecial 51	com/google/a/aa:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   55: athrow
    //   56: astore_3
    //   57: aload_1
    //   58: iload_2
    //   59: invokevirtual 24	com/google/a/d/a:a	(Z)V
    //   62: aload_3
    //   63: athrow
    //   64: astore_3
    //   65: new 30	com/google/a/aa
    //   68: dup
    //   69: new 32	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 33	java/lang/StringBuilder:<init>	()V
    //   76: ldc 35
    //   78: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: aload_1
    //   82: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   85: ldc 44
    //   87: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: aload_3
    //   94: invokespecial 51	com/google/a/aa:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	ab
    //   0	98	1	parama	a
    //   4	55	2	bool	boolean
    //   14	7	3	localw	w
    //   22	30	3	localStackOverflowError	StackOverflowError
    //   56	7	3	localObject	Object
    //   64	30	3	localOutOfMemoryError	OutOfMemoryError
    // Exception table:
    //   from	to	target	type
    //   10	15	22	java/lang/StackOverflowError
    //   10	15	56	finally
    //   23	56	56	finally
    //   65	98	56	finally
    //   10	15	64	java/lang/OutOfMemoryError
  }
  
  public w a(Reader paramReader)
  {
    w localw;
    try
    {
      paramReader = new a(paramReader);
      localw = a(paramReader);
      if ((!localw.j()) && (paramReader.f() != c.j)) {
        throw new af("Did not consume the entire document.");
      }
    }
    catch (e paramReader)
    {
      throw new af(paramReader);
    }
    catch (IOException paramReader)
    {
      throw new x(paramReader);
    }
    catch (NumberFormatException paramReader)
    {
      throw new af(paramReader);
    }
    return localw;
  }
  
  public w a(String paramString)
  {
    return a(new StringReader(paramString));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */