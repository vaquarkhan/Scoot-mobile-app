package android.support.v7.widget;

import android.view.View;

public abstract class du
{
  protected final en a;
  private int b = Integer.MIN_VALUE;
  
  private du(en paramen)
  {
    this.a = paramen;
  }
  
  public static du a(en paramen)
  {
    return new dv(paramen);
  }
  
  public static du a(en paramen, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("invalid orientation");
    case 0: 
      return a(paramen);
    }
    return b(paramen);
  }
  
  public static du b(en paramen)
  {
    return new dw(paramen);
  }
  
  public abstract int a(View paramView);
  
  public void a()
  {
    this.b = f();
  }
  
  public abstract void a(int paramInt);
  
  public int b()
  {
    if (Integer.MIN_VALUE == this.b) {
      return 0;
    }
    return f() - this.b;
  }
  
  public abstract int b(View paramView);
  
  public abstract int c();
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int d(View paramView);
  
  public abstract int e();
  
  public abstract int f();
  
  public abstract int g();
  
  public abstract int h();
  
  public abstract int i();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */