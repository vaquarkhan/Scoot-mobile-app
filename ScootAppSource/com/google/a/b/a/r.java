package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.d;
import com.google.a.k;
import java.lang.reflect.Field;

final class r
  extends t
{
  final am<?> a = q.a(this.f, this.b, this.c, this.d);
  
  r(q paramq, String paramString, boolean paramBoolean1, boolean paramBoolean2, k paramk, Field paramField, com.google.a.c.a parama, boolean paramBoolean3)
  {
    super(paramString, paramBoolean1, paramBoolean2);
  }
  
  void a(com.google.a.d.a parama, Object paramObject)
  {
    parama = this.a.b(parama);
    if ((parama != null) || (!this.e)) {
      this.c.set(paramObject, parama);
    }
  }
  
  void a(d paramd, Object paramObject)
  {
    paramObject = this.c.get(paramObject);
    new y(this.b, this.a, this.d.b()).a(paramd, paramObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */