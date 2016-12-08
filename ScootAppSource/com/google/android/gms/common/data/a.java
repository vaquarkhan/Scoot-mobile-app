package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class a<T>
  implements b<T>
{
  protected final DataHolder a;
  
  protected a(DataHolder paramDataHolder)
  {
    this.a = paramDataHolder;
    if (this.a != null) {
      this.a.a(this);
    }
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a.close();
    }
  }
  
  public int c()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.g();
  }
  
  @Deprecated
  public final void d()
  {
    a();
  }
  
  public Iterator<T> iterator()
  {
    return new i(this);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */