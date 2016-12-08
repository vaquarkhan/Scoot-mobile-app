package b.a.a.a;

import android.annotation.TargetApi;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class b
{
  private final Set<Application.ActivityLifecycleCallbacks> a = new HashSet();
  private final Application b;
  
  b(Application paramApplication)
  {
    this.b = paramApplication;
  }
  
  @TargetApi(14)
  private void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Application.ActivityLifecycleCallbacks localActivityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)localIterator.next();
      this.b.unregisterActivityLifecycleCallbacks(localActivityLifecycleCallbacks);
    }
  }
  
  @TargetApi(14)
  private boolean a(d paramd)
  {
    if (this.b != null)
    {
      paramd = new c(this, paramd);
      this.b.registerActivityLifecycleCallbacks(paramd);
      this.a.add(paramd);
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */