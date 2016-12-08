package com.mixpanel.android.c;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class m
  extends ad<Activity>
{
  private final Handler a = new Handler(Looper.getMainLooper());
  private final Map<String, List<at>> b = new HashMap();
  private final Set<o> c = new HashSet();
  
  private void a(View paramView, List<at> paramList)
  {
    synchronized (this.c)
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        o localo = new o(paramView, (at)paramList.get(i), this.a);
        this.c.add(localo);
        i += 1;
      }
      return;
    }
  }
  
  private void c()
  {
    if (Thread.currentThread() == this.a.getLooper().getThread())
    {
      d();
      return;
    }
    this.a.post(new n(this));
  }
  
  private void d()
  {
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      ??? = (Activity)localIterator.next();
      Object localObject3 = ???.getClass().getCanonicalName();
      View localView = ((Activity)???).getWindow().getDecorView().getRootView();
      synchronized (this.b)
      {
        localObject3 = (List)this.b.get(localObject3);
        List localList = (List)this.b.get(null);
        if (localObject3 != null) {
          a(localView, (List)localObject3);
        }
        if (localList != null) {
          a(localView, localList);
        }
      }
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.b(paramActivity);
    c();
  }
  
  public void a(Map<String, List<at>> paramMap)
  {
    synchronized (this.c)
    {
      Iterator localIterator = this.c.iterator();
      if (localIterator.hasNext()) {
        ((o)localIterator.next()).a();
      }
    }
    this.c.clear();
    synchronized (this.b)
    {
      this.b.clear();
      this.b.putAll(paramMap);
      c();
      return;
    }
  }
  
  public void b(Activity paramActivity)
  {
    super.a(paramActivity);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */