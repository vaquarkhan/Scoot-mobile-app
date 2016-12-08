package e.b.a.d;

final class v
  implements ab
{
  private final r a;
  
  private v(r paramr)
  {
    this.a = paramr;
  }
  
  static ab a(r paramr)
  {
    if ((paramr instanceof ac)) {
      return (ab)paramr;
    }
    if (paramr == null) {
      return null;
    }
    return new v(paramr);
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    return this.a.a(params, paramCharSequence.toString(), paramInt);
  }
  
  r a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.a.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */