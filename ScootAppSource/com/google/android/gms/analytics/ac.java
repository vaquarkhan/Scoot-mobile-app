package com.google.android.gms.analytics;

import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ac<T extends ac>
{
  protected final z a;
  private final ad b;
  private final List<aa> c;
  
  protected ac(ad paramad, c paramc)
  {
    b.a(paramad);
    this.b = paramad;
    this.c = new ArrayList();
    paramad = new z(this, paramc);
    paramad.k();
    this.a = paramad;
  }
  
  protected void a(z paramz) {}
  
  protected void b(z paramz)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((aa)localIterator.next()).a(this, paramz);
    }
  }
  
  public z l()
  {
    z localz = this.a.a();
    b(localz);
    return localz;
  }
  
  public z m()
  {
    return this.a;
  }
  
  public List<ak> n()
  {
    return this.a.c();
  }
  
  protected ad o()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */