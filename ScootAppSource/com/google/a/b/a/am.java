package com.google.a.b.a;

import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.net.InetAddress;

final class am
  extends com.google.a.am<InetAddress>
{
  public InetAddress a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    return InetAddress.getByName(parama.h());
  }
  
  public void a(d paramd, InetAddress paramInetAddress)
  {
    if (paramInetAddress == null) {}
    for (paramInetAddress = null;; paramInetAddress = paramInetAddress.getHostAddress())
    {
      paramd.b(paramInetAddress);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */