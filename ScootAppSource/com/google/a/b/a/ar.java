package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.util.Locale;
import java.util.StringTokenizer;

final class ar
  extends am<Locale>
{
  public Locale a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    Object localObject = new StringTokenizer(parama.h(), "_");
    if (((StringTokenizer)localObject).hasMoreElements()) {}
    for (parama = ((StringTokenizer)localObject).nextToken();; parama = null)
    {
      if (((StringTokenizer)localObject).hasMoreElements()) {}
      for (String str = ((StringTokenizer)localObject).nextToken();; str = null)
      {
        if (((StringTokenizer)localObject).hasMoreElements()) {}
        for (localObject = ((StringTokenizer)localObject).nextToken();; localObject = null)
        {
          if ((str == null) && (localObject == null)) {
            return new Locale(parama);
          }
          if (localObject == null) {
            return new Locale(parama, str);
          }
          return new Locale(parama, str, (String)localObject);
        }
      }
    }
  }
  
  public void a(d paramd, Locale paramLocale)
  {
    if (paramLocale == null) {}
    for (paramLocale = null;; paramLocale = paramLocale.toString())
    {
      paramd.b(paramLocale);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */