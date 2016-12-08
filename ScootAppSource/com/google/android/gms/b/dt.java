package com.google.android.gms.b;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.ah;
import android.support.v4.app.av;
import android.support.v4.g.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class dt
  extends Fragment
  implements dj
{
  private static WeakHashMap<aa, WeakReference<dt>> a = new WeakHashMap();
  private Map<String, di> b = new a();
  private int c = 0;
  private Bundle d;
  
  public static dt a(aa paramaa)
  {
    Object localObject = (WeakReference)a.get(paramaa);
    if (localObject != null)
    {
      localObject = (dt)((WeakReference)localObject).get();
      if (localObject != null) {
        return (dt)localObject;
      }
    }
    try
    {
      dt localdt = (dt)paramaa.f().a("SupportLifecycleFragmentImpl");
      if (localdt != null)
      {
        localObject = localdt;
        if (!localdt.r()) {}
      }
      else
      {
        localObject = new dt();
        paramaa.f().a().a((Fragment)localObject, "SupportLifecycleFragmentImpl").b();
      }
      a.put(paramaa, new WeakReference(localObject));
      return (dt)localObject;
    }
    catch (ClassCastException paramaa)
    {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", paramaa);
    }
  }
  
  private void b(String paramString, di paramdi)
  {
    if (this.c > 0) {
      new Handler(Looper.getMainLooper()).post(new du(this, paramdi, paramString));
    }
  }
  
  public <T extends di> T a(String paramString, Class<T> paramClass)
  {
    return (di)paramClass.cast(this.b.get(paramString));
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void a(String paramString, di paramdi)
  {
    if (!this.b.containsKey(paramString))
    {
      this.b.put(paramString, paramdi);
      b(paramString, paramdi);
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramString).length() + 59 + "LifecycleCallback with tag " + paramString + " already added to this fragment.");
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    this.c = 1;
    this.d = paramBundle;
    Iterator localIterator = this.b.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      di localdi = (di)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {}
      for (localObject = paramBundle.getBundle((String)((Map.Entry)localObject).getKey());; localObject = null)
      {
        localdi.a((Bundle)localObject);
        break;
      }
    }
  }
  
  public aa b()
  {
    return l();
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.b.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Bundle localBundle = new Bundle();
        ((di)localEntry.getValue()).b(localBundle);
        paramBundle.putBundle((String)localEntry.getKey(), localBundle);
      }
    }
  }
  
  public void f()
  {
    super.g();
    this.c = 2;
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).a();
    }
  }
  
  public void g()
  {
    super.g();
    this.c = 3;
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).b();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */