package a;

public class ac<TResult>
{
  private final o<TResult> a = new o();
  
  public o<TResult> a()
  {
    return this.a;
  }
  
  public boolean a(Exception paramException)
  {
    return this.a.b(paramException);
  }
  
  public boolean a(TResult paramTResult)
  {
    return this.a.b(paramTResult);
  }
  
  public void b(Exception paramException)
  {
    if (!a(paramException)) {
      throw new IllegalStateException("Cannot set the error on a completed task.");
    }
  }
  
  public void b(TResult paramTResult)
  {
    if (!a(paramTResult)) {
      throw new IllegalStateException("Cannot set the result of a completed task.");
    }
  }
  
  public boolean b()
  {
    return this.a.l();
  }
  
  public void c()
  {
    if (!b()) {
      throw new IllegalStateException("Cannot cancel a completed task.");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */