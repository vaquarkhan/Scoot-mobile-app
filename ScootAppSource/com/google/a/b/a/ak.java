package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import com.google.a.x;
import java.net.URI;
import java.net.URISyntaxException;

final class ak
  extends am<URI>
{
  public URI a(a parama)
  {
    if (parama.f() == c.i) {
      parama.j();
    }
    for (;;)
    {
      return null;
      try
      {
        parama = parama.h();
        if ("null".equals(parama)) {
          continue;
        }
        parama = new URI(parama);
        return parama;
      }
      catch (URISyntaxException parama)
      {
        throw new x(parama);
      }
    }
  }
  
  public void a(d paramd, URI paramURI)
  {
    if (paramURI == null) {}
    for (paramURI = null;; paramURI = paramURI.toASCIIString())
    {
      paramd.b(paramURI);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */