package e.b.a.d;

final class ac
  implements ab, r
{
  private final ab a;
  
  private ac(ab paramab)
  {
    this.a = paramab;
  }
  
  static r a(ab paramab)
  {
    if ((paramab instanceof v)) {
      return ((v)paramab).a();
    }
    if ((paramab instanceof r)) {
      return (r)paramab;
    }
    if (paramab == null) {
      return null;
    }
    return new ac(paramab);
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    return this.a.a(params, paramCharSequence, paramInt);
  }
  
  public int a(s params, String paramString, int paramInt)
  {
    return this.a.a(params, paramString, paramInt);
  }
  
  public int b()
  {
    return this.a.b();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ac))
    {
      paramObject = (ac)paramObject;
      return this.a.equals(((ac)paramObject).a);
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */