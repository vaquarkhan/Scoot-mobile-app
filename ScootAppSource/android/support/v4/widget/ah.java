package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class ah
{
  private static final ak b = new ai();
  private Object a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b = new al();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new aj();
      return;
    }
  }
  
  public ah(Context paramContext)
  {
    this.a = b.a(paramContext);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    b.a(this.a, paramInt1, paramInt2);
  }
  
  public boolean a()
  {
    return b.a(this.a);
  }
  
  public boolean a(float paramFloat)
  {
    return b.a(this.a, paramFloat);
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return b.a(this.a, paramFloat1, paramFloat2);
  }
  
  public boolean a(int paramInt)
  {
    return b.a(this.a, paramInt);
  }
  
  public boolean a(Canvas paramCanvas)
  {
    return b.a(this.a, paramCanvas);
  }
  
  public void b()
  {
    b.b(this.a);
  }
  
  public boolean c()
  {
    return b.c(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */