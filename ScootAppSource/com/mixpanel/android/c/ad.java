package com.mixpanel.android.c;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class ad<T>
{
  private Set<T> a = new HashSet();
  
  public Set<T> a()
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }
    return Collections.unmodifiableSet(this.a);
  }
  
  public void a(T paramT)
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }
    this.a.remove(paramT);
  }
  
  public void b(T paramT)
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      throw new RuntimeException("Can't add an activity when not on the UI thread");
    }
    this.a.add(paramT);
  }
  
  public boolean b()
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      throw new RuntimeException("Can't check isEmpty() when not on the UI thread");
    }
    return this.a.isEmpty();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */