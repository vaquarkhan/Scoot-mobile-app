package b.a.a.a.a.b;

final class b
{
  public final String a;
  public final boolean b;
  
  b(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (b)paramObject;
      if (this.b != ((b)paramObject).b) {
        return false;
      }
      if (this.a == null) {
        break;
      }
    } while (this.a.equals(((b)paramObject).a));
    for (;;)
    {
      return false;
      if (((b)paramObject).a == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int j = 0;
    if (this.a != null) {}
    for (int i = this.a.hashCode();; i = 0)
    {
      if (this.b) {
        j = 1;
      }
      return i * 31 + j;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */