package com.d.a;

import java.util.ArrayList;

final class e
  extends c
{
  boolean a = false;
  
  e(d paramd, ArrayList paramArrayList) {}
  
  public void b(a parama)
  {
    if (!this.a)
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        parama = (j)this.b.get(i);
        parama.a.a();
        d.a(this.c).add(parama.a);
        i += 1;
      }
    }
  }
  
  public void c(a parama)
  {
    this.a = true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */