package e.b.a.d;

import e.b.a.i;

final class u
{
  final i a;
  final Integer b;
  final t[] c;
  final int d;
  
  u(s params)
  {
    this.a = s.a(params);
    this.b = s.b(params);
    this.c = s.c(params);
    this.d = s.d(params);
  }
  
  boolean a(s params)
  {
    if (params != this.e) {
      return false;
    }
    s.a(params, this.a);
    s.a(params, this.b);
    s.a(params, this.c);
    if (this.d < s.d(params)) {
      s.a(params, true);
    }
    s.a(params, this.d);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */