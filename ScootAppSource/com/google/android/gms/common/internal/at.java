package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class at
  implements Handler.Callback
{
  final ArrayList<s> a = new ArrayList();
  private final au b;
  private final ArrayList<s> c = new ArrayList();
  private final ArrayList<t> d = new ArrayList();
  private volatile boolean e = false;
  private final AtomicInteger f = new AtomicInteger(0);
  private boolean g = false;
  private final Handler h;
  private final Object i = new Object();
  
  public at(Looper paramLooper, au paramau)
  {
    this.b = paramau;
    this.h = new Handler(paramLooper, this);
  }
  
  public void a()
  {
    this.e = false;
    this.f.incrementAndGet();
  }
  
  public void a(int paramInt)
  {
    boolean bool = false;
    if (Looper.myLooper() == this.h.getLooper()) {
      bool = true;
    }
    b.a(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.h.removeMessages(1);
    synchronized (this.i)
    {
      this.g = true;
      Object localObject2 = new ArrayList(this.c);
      int j = this.f.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      s locals;
      do
      {
        if (((Iterator)localObject2).hasNext())
        {
          locals = (s)((Iterator)localObject2).next();
          if ((this.e) && (this.f.get() == j)) {}
        }
        else
        {
          this.a.clear();
          this.g = false;
          return;
        }
      } while (!this.c.contains(locals));
      locals.c_(paramInt);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() == this.h.getLooper())
    {
      bool1 = true;
      b.a(bool1, "onConnectionSuccess must only be called on the Handler thread");
    }
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.g) {
          break label206;
        }
        bool1 = true;
        b.a(bool1);
        this.h.removeMessages(1);
        this.g = true;
        if (this.a.size() != 0) {
          break label211;
        }
        bool1 = bool2;
        b.a(bool1);
        Object localObject2 = new ArrayList(this.c);
        int j = this.f.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        s locals;
        if (((Iterator)localObject2).hasNext())
        {
          locals = (s)((Iterator)localObject2).next();
          if ((this.e) && (this.b.h()) && (this.f.get() == j)) {}
        }
        else
        {
          this.a.clear();
          this.g = false;
          return;
        }
        if (this.a.contains(locals)) {
          continue;
        }
        locals.a(paramBundle);
      }
      bool1 = false;
      break;
      label206:
      bool1 = false;
      continue;
      label211:
      bool1 = false;
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (Looper.myLooper() == this.h.getLooper()) {}
    for (boolean bool = true;; bool = false)
    {
      b.a(bool, "onConnectionFailure must only be called on the Handler thread");
      this.h.removeMessages(1);
      synchronized (this.i)
      {
        Object localObject2 = new ArrayList(this.d);
        int j = this.f.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          t localt = (t)((Iterator)localObject2).next();
          if ((!this.e) || (this.f.get() != j)) {
            return;
          }
          if (this.d.contains(localt)) {
            localt.a(paramConnectionResult);
          }
        }
      }
      return;
    }
  }
  
  public void a(s params)
  {
    b.a(params);
    synchronized (this.i)
    {
      if (this.c.contains(params))
      {
        String str = String.valueOf(params);
        Log.w("GmsClientEvents", String.valueOf(str).length() + 62 + "registerConnectionCallbacks(): listener " + str + " is already registered");
        if (this.b.h()) {
          this.h.sendMessage(this.h.obtainMessage(1, params));
        }
        return;
      }
      this.c.add(params);
    }
  }
  
  public void a(t paramt)
  {
    b.a(paramt);
    synchronized (this.i)
    {
      if (this.d.contains(paramt))
      {
        paramt = String.valueOf(paramt);
        Log.w("GmsClientEvents", String.valueOf(paramt).length() + 67 + "registerConnectionFailedListener(): listener " + paramt + " is already registered");
        return;
      }
      this.d.add(paramt);
    }
  }
  
  public void b()
  {
    this.e = true;
  }
  
  public void b(t paramt)
  {
    b.a(paramt);
    synchronized (this.i)
    {
      if (!this.d.remove(paramt))
      {
        paramt = String.valueOf(paramt);
        Log.w("GmsClientEvents", String.valueOf(paramt).length() + 57 + "unregisterConnectionFailedListener(): listener " + paramt + " not found");
      }
      return;
    }
  }
  
  public boolean handleMessage(Message arg1)
  {
    if (???.what == 1)
    {
      s locals = (s)???.obj;
      synchronized (this.i)
      {
        if ((this.e) && (this.b.h()) && (this.c.contains(locals))) {
          locals.a(this.b.s());
        }
        return true;
      }
    }
    int j = ???.what;
    Log.wtf("GmsClientEvents", 45 + "Don't know how to handle message: " + j, new Exception());
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */