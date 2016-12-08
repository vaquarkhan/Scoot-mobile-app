package android.support.v4.f;

abstract class n
  implements h
{
  private final m a;
  
  public n(m paramm)
  {
    this.a = paramm;
  }
  
  private boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    switch (this.a.a(paramCharSequence, paramInt1, paramInt2))
    {
    default: 
      return a();
    case 0: 
      return true;
    }
    return false;
  }
  
  protected abstract boolean a();
  
  public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramCharSequence.length() - paramInt2 < paramInt1)) {
      throw new IllegalArgumentException();
    }
    if (this.a == null) {
      return a();
    }
    return b(paramCharSequence, paramInt1, paramInt2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\f\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */