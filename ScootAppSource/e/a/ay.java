package e.a;

import java.lang.reflect.Array;

public final class ay<T>
{
  private Object[] a = new Object[''];
  private int b;
  
  public T a(int paramInt)
  {
    if (paramInt >= this.a.length) {
      return null;
    }
    return (T)this.a[paramInt];
  }
  
  public void a(int paramInt, T paramT)
  {
    if (this.a.length <= paramInt)
    {
      Object[] arrayOfObject = new Object[this.a.length + 128];
      System.arraycopy(this.a, 0, arrayOfObject, 0, this.a.length);
      this.a = arrayOfObject;
    }
    if (this.a[paramInt] == null) {
      this.b += 1;
    }
    this.a[paramInt] = paramT;
  }
  
  public T[] a(T[] paramArrayOfT)
  {
    int j = 0;
    paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.b);
    int i = 0;
    while (i < this.a.length)
    {
      int k = j;
      if (this.a[i] != null)
      {
        paramArrayOfT[j] = this.a[i];
        k = j + 1;
      }
      i += 1;
      j = k;
    }
    return paramArrayOfT;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */