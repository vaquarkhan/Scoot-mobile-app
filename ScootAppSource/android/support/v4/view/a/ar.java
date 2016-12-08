package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.View;

public final class ar
{
  private static final au a = new aw();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new av();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new at();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new as();
      return;
    }
  }
  
  public ar(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }
  
  public void a(View paramView, int paramInt)
  {
    a.a(this.b, paramView, paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }
  
  public void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public void c(int paramInt)
  {
    a.e(this.b, paramInt);
  }
  
  public void d(int paramInt)
  {
    a.c(this.b, paramInt);
  }
  
  public void e(int paramInt)
  {
    a.d(this.b, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (ar)paramObject;
        if (this.b != null) {
          break;
        }
      } while (((ar)paramObject).b == null);
      return false;
    } while (this.b.equals(((ar)paramObject).b));
    return false;
  }
  
  public void f(int paramInt)
  {
    a.f(this.b, paramInt);
  }
  
  public void g(int paramInt)
  {
    a.g(this.b, paramInt);
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\a\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */