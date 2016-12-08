package b.a.a.a.a.b;

import b.a.a.a.f;
import b.a.a.a.t;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

final class x
  extends l
{
  x(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit) {}
  
  public void a()
  {
    try
    {
      f.h().a("Fabric", "Executing shutdown hook for " + this.a);
      this.b.shutdown();
      if (!this.b.awaitTermination(this.c, this.d))
      {
        f.h().a("Fabric", this.a + " did not shut down in the" + " allocated time. Requesting immediate shutdown.");
        this.b.shutdownNow();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      f.h().a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] { this.a }));
      this.b.shutdownNow();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */