package android.support.v7.widget;

import android.content.Context;
import android.view.View;

final class br
  implements bv
{
  private fh i(bs parambs)
  {
    return (fh)parambs.c();
  }
  
  public float a(bs parambs)
  {
    return i(parambs).a();
  }
  
  public void a() {}
  
  public void a(bs parambs, float paramFloat)
  {
    i(parambs).a(paramFloat);
  }
  
  public void a(bs parambs, int paramInt)
  {
    i(parambs).a(paramInt);
  }
  
  public void a(bs parambs, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    parambs.a(new fh(paramInt, paramFloat1));
    paramContext = parambs.d();
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    b(parambs, paramFloat3);
  }
  
  public float b(bs parambs)
  {
    return d(parambs) * 2.0F;
  }
  
  public void b(bs parambs, float paramFloat)
  {
    i(parambs).a(paramFloat, parambs.a(), parambs.b());
    f(parambs);
  }
  
  public float c(bs parambs)
  {
    return d(parambs) * 2.0F;
  }
  
  public void c(bs parambs, float paramFloat)
  {
    parambs.d().setElevation(paramFloat);
  }
  
  public float d(bs parambs)
  {
    return i(parambs).b();
  }
  
  public float e(bs parambs)
  {
    return parambs.d().getElevation();
  }
  
  public void f(bs parambs)
  {
    if (!parambs.a())
    {
      parambs.a(0, 0, 0, 0);
      return;
    }
    float f1 = a(parambs);
    float f2 = d(parambs);
    int i = (int)Math.ceil(fi.b(f1, f2, parambs.b()));
    int j = (int)Math.ceil(fi.a(f1, f2, parambs.b()));
    parambs.a(i, j, i, j);
  }
  
  public void g(bs parambs)
  {
    b(parambs, a(parambs));
  }
  
  public void h(bs parambs)
  {
    b(parambs, a(parambs));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */