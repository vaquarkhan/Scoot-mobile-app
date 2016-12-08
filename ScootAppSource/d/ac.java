package d;

import java.io.Closeable;
import java.io.Flushable;

public abstract interface ac
  extends Closeable, Flushable
{
  public abstract void close();
  
  public abstract void flush();
  
  public abstract ae timeout();
  
  public abstract void write(f paramf, long paramLong);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */