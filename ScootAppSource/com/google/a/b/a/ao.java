package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.c.a;
import com.google.a.k;
import java.sql.Timestamp;
import java.util.Date;

final class ao
  implements an
{
  public <T> am<T> a(k paramk, a<T> parama)
  {
    if (parama.a() != Timestamp.class) {
      return null;
    }
    return new ap(this, paramk.a(Date.class));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */