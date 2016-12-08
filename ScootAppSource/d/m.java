package d;

public abstract class m
  implements ac
{
  private final ac delegate;
  
  public m(ac paramac)
  {
    if (paramac == null) {
      throw new IllegalArgumentException("delegate == null");
    }
    this.delegate = paramac;
  }
  
  public void close()
  {
    this.delegate.close();
  }
  
  public final ac delegate()
  {
    return this.delegate;
  }
  
  public void flush()
  {
    this.delegate.flush();
  }
  
  public ae timeout()
  {
    return this.delegate.timeout();
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
  }
  
  public void write(f paramf, long paramLong)
  {
    this.delegate.write(paramf, paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */