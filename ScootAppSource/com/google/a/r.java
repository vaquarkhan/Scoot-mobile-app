package com.google.a;

import com.google.a.b.a.z;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r
{
  private com.google.a.b.s a = com.google.a.b.s.a;
  private ag b = ag.a;
  private j c = d.a;
  private final Map<Type, s<?>> d = new HashMap();
  private final List<an> e = new ArrayList();
  private final List<an> f = new ArrayList();
  private boolean g;
  private String h;
  private int i = 2;
  private int j = 2;
  private boolean k;
  private boolean l;
  private boolean m = true;
  private boolean n;
  private boolean o;
  
  private void a(String paramString, int paramInt1, int paramInt2, List<an> paramList)
  {
    if ((paramString != null) && (!"".equals(paramString.trim()))) {}
    for (paramString = new a(paramString);; paramString = new a(paramInt1, paramInt2))
    {
      paramList.add(aj.a(com.google.a.c.a.b(java.util.Date.class), paramString));
      paramList.add(aj.a(com.google.a.c.a.b(Timestamp.class), paramString));
      paramList.add(aj.a(com.google.a.c.a.b(java.sql.Date.class), paramString));
      do
      {
        return;
      } while ((paramInt1 == 2) || (paramInt2 == 2));
    }
  }
  
  public k a()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.e);
    Collections.reverse(localArrayList);
    localArrayList.addAll(this.f);
    a(this.h, this.i, this.j, localArrayList);
    return new k(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, localArrayList);
  }
  
  public r a(an paraman)
  {
    this.e.add(paraman);
    return this;
  }
  
  public r a(d paramd)
  {
    this.c = paramd;
    return this;
  }
  
  public r a(Type paramType, Object paramObject)
  {
    if (((paramObject instanceof ae)) || ((paramObject instanceof v)) || ((paramObject instanceof s)) || ((paramObject instanceof am))) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.a.b.a.a(bool);
      if ((paramObject instanceof s)) {
        this.d.put(paramType, (s)paramObject);
      }
      if (((paramObject instanceof ae)) || ((paramObject instanceof v)))
      {
        com.google.a.c.a locala = com.google.a.c.a.a(paramType);
        this.e.add(aj.b(locala, paramObject));
      }
      if ((paramObject instanceof am)) {
        this.e.add(z.a(com.google.a.c.a.a(paramType), (am)paramObject));
      }
      return this;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */