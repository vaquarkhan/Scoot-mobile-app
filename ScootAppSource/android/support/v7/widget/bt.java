package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;

class bt
  implements bv
{
  final RectF a = new RectF();
  
  private fi a(Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return new fi(paramContext.getResources(), paramInt, paramFloat1, paramFloat2, paramFloat3);
  }
  
  private fi i(bs parambs)
  {
    return (fi)parambs.c();
  }
  
  public float a(bs parambs)
  {
    return i(parambs).c();
  }
  
  public void a()
  {
    fi.c = new bu(this);
  }
  
  public void a(bs parambs, float paramFloat)
  {
    i(parambs).a(paramFloat);
    f(parambs);
  }
  
  public void a(bs parambs, int paramInt)
  {
    i(parambs).a(paramInt);
  }
  
  public void a(bs parambs, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = a(paramContext, paramInt, paramFloat1, paramFloat2, paramFloat3);
    paramContext.a(parambs.b());
    parambs.a(paramContext);
    f(parambs);
  }
  
  public float b(bs parambs)
  {
    return i(parambs).d();
  }
  
  public void b(bs parambs, float paramFloat)
  {
    i(parambs).c(paramFloat);
    f(parambs);
  }
  
  public float c(bs parambs)
  {
    return i(parambs).e();
  }
  
  public void c(bs parambs, float paramFloat)
  {
    i(parambs).b(paramFloat);
  }
  
  public float d(bs parambs)
  {
    return i(parambs).a();
  }
  
  public float e(bs parambs)
  {
    return i(parambs).b();
  }
  
  public void f(bs parambs)
  {
    Rect localRect = new Rect();
    i(parambs).a(localRect);
    parambs.a((int)Math.ceil(b(parambs)), (int)Math.ceil(c(parambs)));
    parambs.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  public void g(bs parambs) {}
  
  public void h(bs parambs)
  {
    i(parambs).a(parambs.b());
    f(parambs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */