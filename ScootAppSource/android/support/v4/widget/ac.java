package android.support.v4.widget;

import android.view.View;

final class ac
  extends cs
{
  private final int b;
  private cp c;
  private final Runnable d = new ad(this);
  
  public ac(DrawerLayout paramDrawerLayout, int paramInt)
  {
    this.b = paramInt;
  }
  
  private void b()
  {
    int i = 3;
    if (this.b == 3) {
      i = 5;
    }
    View localView = this.a.c(i);
    if (localView != null) {
      this.a.i(localView);
    }
  }
  
  private void c()
  {
    int j = 0;
    int k = this.c.b();
    int i;
    View localView;
    if (this.b == 3)
    {
      i = 1;
      if (i == 0) {
        break label150;
      }
      localView = this.a.c(3);
      if (localView != null) {
        j = -localView.getWidth();
      }
      j += k;
    }
    for (;;)
    {
      if ((localView != null) && (((i != 0) && (localView.getLeft() < j)) || ((i == 0) && (localView.getLeft() > j) && (this.a.a(localView) == 0))))
      {
        aa localaa = (aa)localView.getLayoutParams();
        this.c.a(localView, j, localView.getTop());
        aa.a(localaa, true);
        this.a.invalidate();
        b();
        this.a.c();
      }
      return;
      i = 0;
      break;
      label150:
      localView = this.a.c(5);
      j = this.a.getWidth();
      j -= k;
    }
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public void a()
  {
    this.a.removeCallbacks(this.d);
  }
  
  public void a(int paramInt)
  {
    this.a.a(this.b, paramInt, this.c.c());
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.postDelayed(this.d, 160L);
  }
  
  public void a(cp paramcp)
  {
    this.c = paramcp;
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    paramFloat2 = this.a.d(paramView);
    int k = paramView.getWidth();
    int i;
    if (this.a.a(paramView, 3)) {
      if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (paramFloat2 > 0.5F))) {
        i = 0;
      }
    }
    for (;;)
    {
      this.c.a(i, paramView.getTop());
      this.a.invalidate();
      return;
      i = -k;
      continue;
      int j = this.a.getWidth();
      if (paramFloat1 >= 0.0F)
      {
        i = j;
        if (paramFloat1 == 0.0F)
        {
          i = j;
          if (paramFloat2 <= 0.5F) {}
        }
      }
      else
      {
        i = j - k;
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = paramView.getWidth();
    float f;
    if (this.a.a(paramView, 3))
    {
      f = (paramInt2 + paramInt1) / paramInt2;
      this.a.b(paramView, f);
      if (f != 0.0F) {
        break label76;
      }
    }
    label76:
    for (paramInt1 = 4;; paramInt1 = 0)
    {
      paramView.setVisibility(paramInt1);
      this.a.invalidate();
      return;
      f = (this.a.getWidth() - paramInt1) / paramInt2;
      break;
    }
  }
  
  public boolean a(View paramView, int paramInt)
  {
    return (this.a.g(paramView)) && (this.a.a(paramView, this.b)) && (this.a.a(paramView) == 0);
  }
  
  public int b(View paramView)
  {
    if (this.a.g(paramView)) {
      return paramView.getWidth();
    }
    return 0;
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    if (this.a.a(paramView, 3)) {
      return Math.max(-paramView.getWidth(), Math.min(paramInt1, 0));
    }
    paramInt2 = this.a.getWidth();
    return Math.max(paramInt2 - paramView.getWidth(), Math.min(paramInt1, paramInt2));
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0x1) == 1) {}
    for (View localView = this.a.c(3);; localView = this.a.c(5))
    {
      if ((localView != null) && (this.a.a(localView) == 0)) {
        this.c.a(localView, paramInt2);
      }
      return;
    }
  }
  
  public void b(View paramView, int paramInt)
  {
    aa.a((aa)paramView.getLayoutParams(), false);
    b();
  }
  
  public boolean b(int paramInt)
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */