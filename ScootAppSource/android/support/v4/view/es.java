package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;

final class es
  implements fe
{
  en a;
  boolean b;
  
  es(en paramen)
  {
    this.a = paramen;
  }
  
  public void a(View paramView)
  {
    this.b = false;
    if (en.c(this.a) >= 0) {
      cb.a(paramView, 2, null);
    }
    if (en.a(this.a) != null)
    {
      localObject = en.a(this.a);
      en.b(this.a, null);
      ((Runnable)localObject).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof fe)) {}
    for (localObject = (fe)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((fe)localObject).a(paramView);
      }
      return;
    }
  }
  
  public void b(View paramView)
  {
    if (en.c(this.a) >= 0)
    {
      cb.a(paramView, en.c(this.a), null);
      en.a(this.a, -1);
    }
    if ((Build.VERSION.SDK_INT >= 16) || (!this.b))
    {
      if (en.b(this.a) != null)
      {
        localObject = en.b(this.a);
        en.a(this.a, null);
        ((Runnable)localObject).run();
      }
      localObject = paramView.getTag(2113929216);
      if (!(localObject instanceof fe)) {
        break label115;
      }
    }
    label115:
    for (Object localObject = (fe)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((fe)localObject).b(paramView);
      }
      this.b = true;
      return;
    }
  }
  
  public void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof fe)) {}
    for (localObject = (fe)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((fe)localObject).c(paramView);
      }
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */