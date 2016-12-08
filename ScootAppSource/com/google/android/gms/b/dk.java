package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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

@TargetApi(11)
public final class dk
  extends Fragment
  implements dj
{
  private static WeakHashMap<Activity, WeakReference<dk>> a = new WeakHashMap();
  private Map<String, di> b = new a();
  private int c = 0;
  private Bundle d;
  
  public static dk a(Activity paramActivity)
  {
    Object localObject = (WeakReference)a.get(paramActivity);
    if (localObject != null)
    {
      localObject = (dk)((WeakReference)localObject).get();
      if (localObject != null) {
        return (dk)localObject;
      }
    }
    try
    {
      dk localdk = (dk)paramActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      if (localdk != null)
      {
        localObject = localdk;
        if (!localdk.isRemoving()) {}
      }
      else
      {
        localObject = new dk();
        paramActivity.getFragmentManager().beginTransaction().add((Fragment)localObject, "LifecycleFragmentImpl").commitAllowingStateLoss();
      }
      a.put(paramActivity, new WeakReference(localObject));
      return (dk)localObject;
    }
    catch (ClassCastException paramActivity)
    {
      throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", paramActivity);
    }
  }
  
  private void b(String paramString, di paramdi)
  {
    if (this.c > 0) {
      new Handler(Looper.getMainLooper()).post(new dl(this, paramdi, paramString));
    }
  }
  
  public Activity a()
  {
    return getActivity();
  }
  
  public <T extends di> T a(String paramString, Class<T> paramClass)
  {
    return (di)paramClass.cast(this.b.get(paramString));
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
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
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
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
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
  
  public void onStart()
  {
    super.onStop();
    this.c = 2;
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).a();
    }
  }
  
  public void onStop()
  {
    super.onStop();
    this.c = 3;
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).b();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */