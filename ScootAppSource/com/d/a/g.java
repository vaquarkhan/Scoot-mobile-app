package com.d.a;

import java.util.ArrayList;
import java.util.HashMap;

public final class g
{
  private j b;
  
  g(d paramd, a parama)
  {
    this.b = ((j)d.b(paramd).get(parama));
    if (this.b == null)
    {
      this.b = new j(parama);
      d.b(paramd).put(parama, this.b);
      d.d(paramd).add(this.b);
    }
  }
  
  public g a(a parama)
  {
    j localj2 = (j)d.b(this.a).get(parama);
    j localj1 = localj2;
    if (localj2 == null)
    {
      localj1 = new j(parama);
      d.b(this.a).put(parama, localj1);
      d.d(this.a).add(localj1);
    }
    localj1.a(new h(this.b, 0));
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */