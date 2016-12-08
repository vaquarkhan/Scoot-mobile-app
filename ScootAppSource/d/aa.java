package d;

final class aa
{
  static z a;
  static long b;
  
  static z a()
  {
    try
    {
      if (a != null)
      {
        z localz = a;
        a = localz.f;
        localz.f = null;
        b -= 2048L;
        return localz;
      }
      return new z();
    }
    finally {}
  }
  
  static void a(z paramz)
  {
    if ((paramz.f != null) || (paramz.g != null)) {
      throw new IllegalArgumentException();
    }
    if (paramz.d) {
      return;
    }
    try
    {
      if (b + 2048L > 65536L) {
        return;
      }
    }
    finally {}
    b += 2048L;
    paramz.f = a;
    paramz.c = 0;
    paramz.b = 0;
    a = paramz;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */