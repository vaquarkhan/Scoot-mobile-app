package com.google.a;

final class al
  implements an
{
  private final com.google.a.c.a<?> a;
  private final boolean b;
  private final Class<?> c;
  private final ae<?> d;
  private final v<?> e;
  
  private al(Object paramObject, com.google.a.c.a<?> parama, boolean paramBoolean, Class<?> paramClass)
  {
    ae localae;
    if ((paramObject instanceof ae))
    {
      localae = (ae)paramObject;
      this.d = localae;
      if (!(paramObject instanceof v)) {
        break label85;
      }
      paramObject = (v)paramObject;
      label35:
      this.e = ((v)paramObject);
      if ((this.d == null) && (this.e == null)) {
        break label90;
      }
    }
    label85:
    label90:
    for (boolean bool = true;; bool = false)
    {
      com.google.a.b.a.a(bool);
      this.a = parama;
      this.b = paramBoolean;
      this.c = paramClass;
      return;
      localae = null;
      break;
      paramObject = null;
      break label35;
    }
  }
  
  public <T> am<T> a(k paramk, com.google.a.c.a<T> parama)
  {
    boolean bool;
    if (this.a != null) {
      if ((this.a.equals(parama)) || ((this.b) && (this.a.b() == parama.a()))) {
        bool = true;
      }
    }
    while (bool)
    {
      return new aj(this.d, this.e, paramk, parama, this, null);
      bool = false;
      continue;
      bool = this.c.isAssignableFrom(parama.a());
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */