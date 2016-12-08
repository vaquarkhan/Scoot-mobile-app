package d;

public abstract class n
  implements ad
{
  private final ad delegate;
  
  public n(ad paramad)
  {
    if (paramad == null) {
      throw new IllegalArgumentException("delegate == null");
    }
    this.delegate = paramad;
  }
  
  public void close()
  {
    this.delegate.close();
  }
  
  public final ad delegate()
  {
    return this.delegate;
  }
  
  public long read(f paramf, long paramLong)
  {
    return this.delegate.read(paramf, paramLong);
  }
  
  public ae timeout()
  {
    return this.delegate.timeout();
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */