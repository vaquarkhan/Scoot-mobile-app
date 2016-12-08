package jp.wasabeef.recyclerview.a;

import android.animation.Animator;
import android.support.v7.widget.ed;
import android.support.v7.widget.ef;
import android.support.v7.widget.fd;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public abstract class a
  extends ed<fd>
{
  private ed<fd> a;
  private int b = 300;
  private Interpolator c = new LinearInterpolator();
  private int d = -1;
  private boolean e = true;
  
  public a(ed<fd> paramed)
  {
    this.a = paramed;
  }
  
  public int a()
  {
    return this.a.a();
  }
  
  public int a(int paramInt)
  {
    return this.a.a(paramInt);
  }
  
  public fd a(ViewGroup paramViewGroup, int paramInt)
  {
    return this.a.a(paramViewGroup, paramInt);
  }
  
  public void a(ef paramef)
  {
    super.a(paramef);
    this.a.a(paramef);
  }
  
  public void a(fd paramfd, int paramInt)
  {
    this.a.a(paramfd, paramInt);
    if ((!this.e) || (paramInt > this.d))
    {
      paramfd = a(paramfd.a);
      int j = paramfd.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramfd[i];
        ((Animator)localObject).setDuration(this.b).start();
        ((Animator)localObject).setInterpolator(this.c);
        i += 1;
      }
      this.d = paramInt;
      return;
    }
    jp.wasabeef.recyclerview.b.a.a(paramfd.a);
  }
  
  protected abstract Animator[] a(View paramView);
  
  public long b(int paramInt)
  {
    return this.a.b(paramInt);
  }
  
  public void b(ef paramef)
  {
    super.b(paramef);
    this.a.b(paramef);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\jp\wasabeef\recyclerview\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */