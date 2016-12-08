package d;

import java.util.concurrent.TimeUnit;

public final class o
  extends ae
{
  private ae a;
  
  public o(ae paramae)
  {
    if (paramae == null) {
      throw new IllegalArgumentException("delegate == null");
    }
    this.a = paramae;
  }
  
  public final ae a()
  {
    return this.a;
  }
  
  public final o a(ae paramae)
  {
    if (paramae == null) {
      throw new IllegalArgumentException("delegate == null");
    }
    this.a = paramae;
    return this;
  }
  
  public ae clearDeadline()
  {
    return this.a.clearDeadline();
  }
  
  public ae clearTimeout()
  {
    return this.a.clearTimeout();
  }
  
  public long deadlineNanoTime()
  {
    return this.a.deadlineNanoTime();
  }
  
  public ae deadlineNanoTime(long paramLong)
  {
    return this.a.deadlineNanoTime(paramLong);
  }
  
  public boolean hasDeadline()
  {
    return this.a.hasDeadline();
  }
  
  public void throwIfReached()
  {
    this.a.throwIfReached();
  }
  
  public ae timeout(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.a.timeout(paramLong, paramTimeUnit);
  }
  
  public long timeoutNanos()
  {
    return this.a.timeoutNanos();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */