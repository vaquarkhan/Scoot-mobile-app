package com.c.a.a;

import b.a.a.a.a.c.a.d;
import b.a.a.a.a.c.a.e;
import b.a.a.a.a.c.a.h;
import b.a.a.a.a.d.o;
import java.io.File;
import java.util.List;

final class l
  implements o
{
  private final y a;
  private final u b;
  
  l(y paramy, u paramu)
  {
    this.a = paramy;
    this.b = paramu;
  }
  
  public static l a(y paramy)
  {
    return new l(paramy, new u(new h(new t(new e(1000L, 8), 0.1D), new d(5))));
  }
  
  public boolean a(List<File> paramList)
  {
    boolean bool = false;
    long l = System.nanoTime();
    if (this.b.a(l))
    {
      if (this.a.a(paramList))
      {
        this.b.a();
        bool = true;
      }
    }
    else {
      return bool;
    }
    this.b.b(l);
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */