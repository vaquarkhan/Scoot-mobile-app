package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.a.aj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class gj
  extends ContextWrapper
{
  private static final ArrayList<WeakReference<gj>> a = new ArrayList();
  private Resources b;
  private final Resources.Theme c;
  
  private gj(Context paramContext)
  {
    super(paramContext);
    if (gx.a())
    {
      this.c = getResources().newTheme();
      this.c.setTo(paramContext.getTheme());
      return;
    }
    this.c = null;
  }
  
  public static Context a(Context paramContext)
  {
    Object localObject = paramContext;
    int j;
    int i;
    if (b(paramContext))
    {
      j = a.size();
      i = 0;
    }
    while (i < j)
    {
      localObject = (WeakReference)a.get(i);
      if (localObject != null) {}
      for (localObject = (gj)((WeakReference)localObject).get(); (localObject != null) && (((gj)localObject).getBaseContext() == paramContext); localObject = null) {
        return (Context)localObject;
      }
      i += 1;
    }
    paramContext = new gj(paramContext);
    a.add(new WeakReference(paramContext));
    return paramContext;
  }
  
  private static boolean b(Context paramContext)
  {
    if (((paramContext instanceof gj)) || ((paramContext.getResources() instanceof gl)) || ((paramContext.getResources() instanceof gx))) {}
    while ((aj.k()) && (Build.VERSION.SDK_INT > 20)) {
      return false;
    }
    return true;
  }
  
  public Resources getResources()
  {
    if (this.b == null) {
      if (this.c != null) {
        break label37;
      }
    }
    label37:
    for (Object localObject = new gl(this, super.getResources());; localObject = new gx(this, super.getResources()))
    {
      this.b = ((Resources)localObject);
      return this.b;
    }
  }
  
  public Resources.Theme getTheme()
  {
    if (this.c == null) {
      return super.getTheme();
    }
    return this.c;
  }
  
  public void setTheme(int paramInt)
  {
    if (this.c == null)
    {
      super.setTheme(paramInt);
      return;
    }
    this.c.applyStyle(paramInt, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */