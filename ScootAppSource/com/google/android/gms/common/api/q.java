package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.b.be;
import com.google.android.gms.b.dr;
import com.google.android.gms.b.dv;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class q
{
  private static final Set<q> a = Collections.newSetFromMap(new WeakHashMap());
  
  public static Set<q> a()
  {
    synchronized (a)
    {
      Set localSet2 = a;
      return localSet2;
    }
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public <C extends k> C a(i<C> parami)
  {
    throw new UnsupportedOperationException();
  }
  
  public void a(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public void a(dv paramdv)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void a(t paramt);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public boolean a(dr paramdr)
  {
    throw new UnsupportedOperationException();
  }
  
  public Context b()
  {
    throw new UnsupportedOperationException();
  }
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public void b(dv paramdv)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void b(t paramt);
  
  public Looper c()
  {
    throw new UnsupportedOperationException();
  }
  
  public void d()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void e();
  
  public abstract ConnectionResult f();
  
  public abstract void g();
  
  public abstract u<Status> h();
  
  public abstract boolean i();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */