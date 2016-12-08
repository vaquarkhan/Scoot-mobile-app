package e.b.a.d;

import e.b.a.i;
import java.util.ArrayList;
import java.util.Map;

public final class c
{
  private ArrayList<Object> a = new ArrayList();
  private Object b;
  
  static int a(CharSequence paramCharSequence, int paramInt, String paramString)
  {
    int j = paramCharSequence.length() - paramInt;
    int k = paramString.length();
    int m = Math.min(j, k);
    int i = 0;
    while (i < m)
    {
      int n = paramString.charAt(i) - paramCharSequence.charAt(paramInt + i);
      if (n != 0) {
        return n;
      }
      i += 1;
    }
    return k - j;
  }
  
  private c a(ad paramad, ab paramab)
  {
    this.b = null;
    this.a.add(paramad);
    this.a.add(paramab);
    return this;
  }
  
  private c a(Object paramObject)
  {
    this.b = null;
    this.a.add(paramObject);
    this.a.add(paramObject);
    return this;
  }
  
  private void a(w paramw)
  {
    if (paramw == null) {
      throw new IllegalArgumentException("No printer supplied");
    }
  }
  
  static void a(Appendable paramAppendable, int paramInt)
  {
    for (;;)
    {
      paramInt -= 1;
      if (paramInt < 0) {
        break;
      }
      paramAppendable.append(65533);
    }
  }
  
  static boolean b(CharSequence paramCharSequence, int paramInt, String paramString)
  {
    int j = paramString.length();
    if (paramCharSequence.length() - paramInt < j) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label53;
      }
      if (paramCharSequence.charAt(paramInt + i) != paramString.charAt(i)) {
        break;
      }
      i += 1;
    }
    label53:
    return true;
  }
  
  private boolean b(Object paramObject)
  {
    if ((paramObject instanceof ad))
    {
      if ((paramObject instanceof e)) {
        return ((e)paramObject).c();
      }
      return true;
    }
    return false;
  }
  
  private void c(r paramr)
  {
    if (paramr == null) {
      throw new IllegalArgumentException("No parser supplied");
    }
  }
  
  static boolean c(CharSequence paramCharSequence, int paramInt, String paramString)
  {
    int j = paramString.length();
    if (paramCharSequence.length() - paramInt < j) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label95;
      }
      char c2 = paramCharSequence.charAt(paramInt + i);
      char c1 = paramString.charAt(i);
      if (c2 != c1)
      {
        c2 = Character.toUpperCase(c2);
        c1 = Character.toUpperCase(c1);
        if ((c2 != c1) && (Character.toLowerCase(c2) != Character.toLowerCase(c1))) {
          break;
        }
      }
      i += 1;
    }
    label95:
    return true;
  }
  
  private boolean c(Object paramObject)
  {
    if ((paramObject instanceof ab))
    {
      if ((paramObject instanceof e)) {
        return ((e)paramObject).d();
      }
      return true;
    }
    return false;
  }
  
  private Object k()
  {
    Object localObject2 = this.b;
    Object localObject1 = localObject2;
    Object localObject3;
    Object localObject4;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (this.a.size() == 2)
      {
        localObject3 = this.a.get(0);
        localObject4 = this.a.get(1);
        if (localObject3 == null) {
          break label89;
        }
        if (localObject3 != localObject4)
        {
          localObject1 = localObject2;
          if (localObject4 != null) {
            break label62;
          }
        }
      }
    }
    label62:
    label89:
    for (localObject1 = localObject3;; localObject1 = localObject4)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new e(this.a);
      }
      this.b = localObject2;
      localObject1 = localObject2;
      return localObject1;
    }
  }
  
  public b a()
  {
    Object localObject = k();
    if (b(localObject)) {}
    for (ad localad = (ad)localObject;; localad = null)
    {
      if (c(localObject)) {}
      for (localObject = (ab)localObject;; localObject = null)
      {
        if ((localad != null) || (localObject != null)) {
          return new b(localad, (ab)localObject);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
      }
    }
  }
  
  public c a(char paramChar)
  {
    return a(new d(paramChar));
  }
  
  public c a(int paramInt)
  {
    return a(e.b.a.d.c(), paramInt, 2);
  }
  
  public c a(int paramInt1, int paramInt2)
  {
    return c(e.b.a.d.d(), paramInt1, paramInt2);
  }
  
  public c a(int paramInt, boolean paramBoolean)
  {
    return a(new p(e.b.a.d.s(), paramInt, paramBoolean));
  }
  
  public c a(b paramb)
  {
    if (paramb == null) {
      throw new IllegalArgumentException("No formatter supplied");
    }
    return a(paramb.a(), paramb.c());
  }
  
  public c a(r paramr)
  {
    c(paramr);
    return a(null, v.a(paramr));
  }
  
  public c a(w paramw, r[] paramArrayOfr)
  {
    int i = 0;
    if (paramw != null) {
      a(paramw);
    }
    if (paramArrayOfr == null) {
      throw new IllegalArgumentException("No parsers supplied");
    }
    int j = paramArrayOfr.length;
    if (j == 1)
    {
      if (paramArrayOfr[0] == null) {
        throw new IllegalArgumentException("No parser supplied");
      }
      return a(x.a(paramw), v.a(paramArrayOfr[0]));
    }
    ab[] arrayOfab = new ab[j];
    while (i < j - 1)
    {
      ab localab = v.a(paramArrayOfr[i]);
      arrayOfab[i] = localab;
      if (localab == null) {
        throw new IllegalArgumentException("Incomplete parser array");
      }
      i += 1;
    }
    arrayOfab[i] = v.a(paramArrayOfr[i]);
    return a(x.a(paramw), new h(arrayOfab));
  }
  
  public c a(e.b.a.d paramd)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("Field type must not be null");
    }
    return a(new l(paramd, false));
  }
  
  public c a(e.b.a.d paramd, int paramInt)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("Field type must not be null");
    }
    if (paramInt <= 0) {
      throw new IllegalArgumentException("Illegal number of digits: " + paramInt);
    }
    return a(new f(paramd, paramInt, false));
  }
  
  public c a(e.b.a.d paramd, int paramInt1, int paramInt2)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("Field type must not be null");
    }
    int i = paramInt2;
    if (paramInt2 < paramInt1) {
      i = paramInt1;
    }
    if ((paramInt1 < 0) || (i <= 0)) {
      throw new IllegalArgumentException();
    }
    if (paramInt1 <= 1) {
      return a(new q(paramd, i, false));
    }
    return a(new j(paramd, i, false, paramInt1));
  }
  
  public c a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Literal must not be null");
    }
    c localc = this;
    switch (paramString.length())
    {
    default: 
      localc = a(new k(paramString));
    case 0: 
      return localc;
    }
    return a(new d(paramString.charAt(0)));
  }
  
  public c a(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    return a(new o(paramString1, paramString2, paramBoolean, paramInt1, paramInt2));
  }
  
  public c a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    return a(new o(paramString, paramString, paramBoolean, paramInt1, paramInt2));
  }
  
  public c a(Map<String, i> paramMap)
  {
    paramMap = new n(1, paramMap);
    return a(paramMap, paramMap);
  }
  
  public c b(int paramInt)
  {
    return a(e.b.a.d.e(), paramInt, 2);
  }
  
  public c b(int paramInt1, int paramInt2)
  {
    return c(e.b.a.d.f(), paramInt1, paramInt2);
  }
  
  public c b(int paramInt, boolean paramBoolean)
  {
    return a(new p(e.b.a.d.p(), paramInt, paramBoolean));
  }
  
  public c b(r paramr)
  {
    c(paramr);
    return a(null, new h(new ab[] { v.a(paramr), null }));
  }
  
  public c b(e.b.a.d paramd)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("Field type must not be null");
    }
    return a(new l(paramd, true));
  }
  
  public c b(e.b.a.d paramd, int paramInt1, int paramInt2)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("Field type must not be null");
    }
    int i = paramInt2;
    if (paramInt2 < paramInt1) {
      i = paramInt1;
    }
    if ((paramInt1 < 0) || (i <= 0)) {
      throw new IllegalArgumentException();
    }
    if (paramInt1 <= 1) {
      return a(new q(paramd, i, true));
    }
    return a(new j(paramd, i, true, paramInt1));
  }
  
  public r b()
  {
    Object localObject = k();
    if (c(localObject)) {
      return ac.a((ab)localObject);
    }
    throw new UnsupportedOperationException("Parsing is not supported");
  }
  
  public c c()
  {
    return a(e.b.a.d.k());
  }
  
  public c c(int paramInt)
  {
    return a(e.b.a.d.g(), paramInt, 2);
  }
  
  public c c(int paramInt1, int paramInt2)
  {
    return c(e.b.a.d.g(), paramInt1, paramInt2);
  }
  
  public c c(e.b.a.d paramd, int paramInt1, int paramInt2)
  {
    if (paramd == null) {
      throw new IllegalArgumentException("Field type must not be null");
    }
    int i = paramInt2;
    if (paramInt2 < paramInt1) {
      i = paramInt1;
    }
    if ((paramInt1 < 0) || (i <= 0)) {
      throw new IllegalArgumentException();
    }
    return a(new g(paramd, paramInt1, i));
  }
  
  public c d()
  {
    return a(e.b.a.d.l());
  }
  
  public c d(int paramInt)
  {
    return a(e.b.a.d.h(), paramInt, 2);
  }
  
  public c d(int paramInt1, int paramInt2)
  {
    return b(e.b.a.d.p(), paramInt1, paramInt2);
  }
  
  public c e()
  {
    return b(e.b.a.d.l());
  }
  
  public c e(int paramInt)
  {
    return a(e.b.a.d.i(), paramInt, 2);
  }
  
  public c e(int paramInt1, int paramInt2)
  {
    return b(e.b.a.d.s(), paramInt1, paramInt2);
  }
  
  public c f()
  {
    return a(e.b.a.d.r());
  }
  
  public c f(int paramInt)
  {
    return a(e.b.a.d.j(), paramInt, 2);
  }
  
  public c f(int paramInt1, int paramInt2)
  {
    return a(e.b.a.d.t(), paramInt1, paramInt2);
  }
  
  public c g()
  {
    return b(e.b.a.d.r());
  }
  
  public c g(int paramInt)
  {
    return a(e.b.a.d.l(), paramInt, 1);
  }
  
  public c g(int paramInt1, int paramInt2)
  {
    return b(e.b.a.d.v(), paramInt1, paramInt2);
  }
  
  public c h()
  {
    return a(e.b.a.d.w());
  }
  
  public c h(int paramInt)
  {
    return a(e.b.a.d.m(), paramInt, 2);
  }
  
  public c i()
  {
    return a(new n(0, null), null);
  }
  
  public c i(int paramInt)
  {
    return a(e.b.a.d.n(), paramInt, 3);
  }
  
  public c j()
  {
    return a(m.a, m.a);
  }
  
  public c j(int paramInt)
  {
    return a(e.b.a.d.o(), paramInt, 2);
  }
  
  public c k(int paramInt)
  {
    return a(e.b.a.d.r(), paramInt, 2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */