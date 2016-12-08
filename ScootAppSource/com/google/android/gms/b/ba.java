package com.google.android.gms.b;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ba
  extends bg
{
  private final SparseArray<bb> e = new SparseArray();
  
  private ba(dj paramdj)
  {
    super(paramdj);
    this.d.a("AutoManageHelper", this);
  }
  
  public static ba a(dh paramdh)
  {
    paramdh = b(paramdh);
    ba localba = (ba)paramdh.a("AutoManageHelper", ba.class);
    if (localba != null) {
      return localba;
    }
    return new ba(paramdh);
  }
  
  public void a()
  {
    super.a();
    boolean bool = this.a;
    String str = String.valueOf(this.e);
    Log.d("AutoManageHelper", String.valueOf(str).length() + 14 + "onStart " + bool + " " + str);
    if (!this.b)
    {
      int i = 0;
      while (i < this.e.size())
      {
        ((bb)this.e.valueAt(i)).b.e();
        i += 1;
      }
    }
  }
  
  public void a(int paramInt)
  {
    bb localbb = (bb)this.e.get(paramInt);
    this.e.remove(paramInt);
    if (localbb != null) {
      localbb.a();
    }
  }
  
  public void a(int paramInt, q paramq, t paramt)
  {
    b.a(paramq, "GoogleApiClient instance cannot be null");
    if (this.e.indexOfKey(paramInt) < 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      b.a(bool1, 54 + "Already managing a GoogleApiClient with id " + paramInt);
      bool1 = this.a;
      boolean bool2 = this.b;
      Log.d("AutoManageHelper", 54 + "starting AutoManage for client " + paramInt + " " + bool1 + " " + bool2);
      paramt = new bb(this, paramInt, paramq, paramt);
      this.e.put(paramInt, paramt);
      if ((this.a) && (!this.b))
      {
        paramt = String.valueOf(paramq);
        Log.d("AutoManageHelper", String.valueOf(paramt).length() + 11 + "connecting " + paramt);
        paramq.e();
      }
      return;
    }
  }
  
  protected void a(ConnectionResult paramConnectionResult, int paramInt)
  {
    Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
    if (paramInt < 0) {
      Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
    }
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = (bb)this.e.get(paramInt);
      } while (localObject == null);
      a(paramInt);
      localObject = ((bb)localObject).c;
    } while (localObject == null);
    ((t)localObject).a(paramConnectionResult);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    while (i < this.e.size())
    {
      ((bb)this.e.valueAt(i)).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      i += 1;
    }
  }
  
  public void b()
  {
    super.b();
    int i = 0;
    while (i < this.e.size())
    {
      ((bb)this.e.valueAt(i)).b.g();
      i += 1;
    }
  }
  
  protected void c()
  {
    int i = 0;
    while (i < this.e.size())
    {
      ((bb)this.e.valueAt(i)).b.e();
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */