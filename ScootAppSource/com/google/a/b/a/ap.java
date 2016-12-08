package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.d;
import java.sql.Timestamp;
import java.util.Date;

final class ap
  extends am<Timestamp>
{
  ap(ao paramao, am paramam) {}
  
  public Timestamp a(a parama)
  {
    parama = (Date)this.a.b(parama);
    if (parama != null) {
      return new Timestamp(parama.getTime());
    }
    return null;
  }
  
  public void a(d paramd, Timestamp paramTimestamp)
  {
    this.a.a(paramd, paramTimestamp);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */