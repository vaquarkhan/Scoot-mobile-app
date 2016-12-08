package com.google.android.gms.analytics.internal;

public abstract class af
  extends ae
{
  private boolean a;
  
  protected af(ah paramah)
  {
    super(paramah);
  }
  
  public boolean C()
  {
    return this.a;
  }
  
  protected void D()
  {
    if (!C()) {
      throw new IllegalStateException("Not initialized");
    }
  }
  
  public void E()
  {
    a();
    this.a = true;
  }
  
  protected abstract void a();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */