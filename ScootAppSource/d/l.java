package d;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class l
  implements ac
{
  private final i a;
  private final Deflater b;
  private boolean c;
  
  public l(ac paramac, Deflater paramDeflater)
  {
    this(r.a(paramac), paramDeflater);
  }
  
  l(i parami, Deflater paramDeflater)
  {
    if (parami == null) {
      throw new IllegalArgumentException("source == null");
    }
    if (paramDeflater == null) {
      throw new IllegalArgumentException("inflater == null");
    }
    this.a = parami;
    this.b = paramDeflater;
  }
  
  @IgnoreJRERequirement
  private void a(boolean paramBoolean)
  {
    f localf = this.a.b();
    z localz;
    label119:
    do
    {
      localz = localf.e(1);
      if (paramBoolean) {}
      for (int i = this.b.deflate(localz.a, localz.c, 2048 - localz.c, 2);; i = this.b.deflate(localz.a, localz.c, 2048 - localz.c))
      {
        if (i <= 0) {
          break label119;
        }
        localz.c += i;
        localf.b += i;
        this.a.w();
        break;
      }
    } while (!this.b.needsInput());
    if (localz.b == localz.c)
    {
      localf.a = localz.a();
      aa.a(localz);
    }
  }
  
  void a()
  {
    this.b.finish();
    a(false);
  }
  
  public void close()
  {
    if (this.c) {}
    for (;;)
    {
      return;
      Object localObject3 = null;
      try
      {
        a();
        try
        {
          this.b.end();
          localObject1 = localObject3;
        }
        catch (Throwable localThrowable1)
        {
          for (;;)
          {
            Object localObject1;
            label34:
            if (localObject3 != null) {
              localObject2 = localObject3;
            }
          }
        }
        try
        {
          this.a.close();
          localObject3 = localObject1;
        }
        catch (Throwable localThrowable3)
        {
          localObject3 = localObject2;
          if (localObject2 != null) {
            break label34;
          }
          localObject3 = localThrowable3;
          break label34;
        }
        this.c = true;
        if (localObject3 == null) {
          continue;
        }
        ag.a((Throwable)localObject3);
        return;
      }
      catch (Throwable localThrowable2)
      {
        Object localObject2;
        for (;;) {}
      }
    }
  }
  
  public void flush()
  {
    a(true);
    this.a.flush();
  }
  
  public ae timeout()
  {
    return this.a.timeout();
  }
  
  public String toString()
  {
    return "DeflaterSink(" + this.a + ")";
  }
  
  public void write(f paramf, long paramLong)
  {
    ag.a(paramf.b, 0L, paramLong);
    while (paramLong > 0L)
    {
      z localz = paramf.a;
      int i = (int)Math.min(paramLong, localz.c - localz.b);
      this.b.setInput(localz.a, localz.b, i);
      a(false);
      paramf.b -= i;
      localz.b += i;
      if (localz.b == localz.c)
      {
        paramf.a = localz.a();
        aa.a(localz);
      }
      paramLong -= i;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */