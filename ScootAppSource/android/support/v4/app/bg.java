package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.b.n;
import android.support.v4.b.o;
import android.support.v4.b.p;
import android.support.v4.g.d;
import android.support.v4.g.r;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class bg
  implements o<Object>, p<Object>
{
  final int a;
  final Bundle b;
  be<Object> c;
  n<Object> d;
  boolean e;
  boolean f;
  Object g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  bg n;
  
  public bg(int paramInt, Bundle paramBundle, be<Object> parambe)
  {
    this.a = paramBundle;
    this.b = parambe;
    be localbe;
    this.c = localbe;
  }
  
  void a()
  {
    if ((this.i) && (this.j)) {
      this.h = true;
    }
    do
    {
      do
      {
        return;
      } while (this.h);
      this.h = true;
      if (bf.a) {
        Log.v("LoaderManager", "  Starting: " + this);
      }
      if ((this.d == null) && (this.c != null)) {
        this.d = this.c.a(this.a, this.b);
      }
    } while (this.d == null);
    if ((this.d.getClass().isMemberClass()) && (!Modifier.isStatic(this.d.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
    }
    if (!this.m)
    {
      this.d.a(this.a, this);
      this.d.a(this);
      this.m = true;
    }
    this.d.i();
  }
  
  public void a(n<Object> paramn)
  {
    if (bf.a) {
      Log.v("LoaderManager", "onLoadCanceled: " + this);
    }
    if (this.l) {
      if (bf.a) {
        Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
      }
    }
    do
    {
      do
      {
        return;
        if (this.o.b.a(this.a) == this) {
          break;
        }
      } while (!bf.a);
      Log.v("LoaderManager", "  Ignoring load canceled -- not active");
      return;
      paramn = this.n;
    } while (paramn == null);
    if (bf.a) {
      Log.v("LoaderManager", "  Switching to pending loader: " + paramn);
    }
    this.n = null;
    this.o.b.b(this.a, null);
    g();
    this.o.a(paramn);
  }
  
  public void a(n<Object> paramn, Object paramObject)
  {
    if (bf.a) {
      Log.v("LoaderManager", "onLoadComplete: " + this);
    }
    if (this.l) {
      if (bf.a) {
        Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
      }
    }
    do
    {
      do
      {
        return;
        if (this.o.b.a(this.a) == this) {
          break;
        }
      } while (!bf.a);
      Log.v("LoaderManager", "  Ignoring load complete -- not active");
      return;
      bg localbg = this.n;
      if (localbg != null)
      {
        if (bf.a) {
          Log.v("LoaderManager", "  Switching to pending loader: " + localbg);
        }
        this.n = null;
        this.o.b.b(this.a, null);
        g();
        this.o.a(localbg);
        return;
      }
      if ((this.g != paramObject) || (!this.e))
      {
        this.g = paramObject;
        this.e = true;
        if (this.h) {
          b(paramn, paramObject);
        }
      }
      paramn = (bg)this.o.c.a(this.a);
      if ((paramn != null) && (paramn != this))
      {
        paramn.f = false;
        paramn.g();
        this.o.c.c(this.a);
      }
    } while ((bf.a(this.o) == null) || (this.o.a()));
    bf.a(this.o).d.d();
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mArgs=");
    paramPrintWriter.println(this.b);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCallbacks=");
    paramPrintWriter.println(this.c);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    paramPrintWriter.println(this.d);
    if (this.d != null) {
      this.d.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if ((this.e) || (this.f))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHaveData=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print("  mDeliveredData=");
      paramPrintWriter.println(this.f);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(this.g);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mReportNextStart=");
    paramPrintWriter.print(this.k);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.l);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetaining=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mRetainingStarted=");
    paramPrintWriter.print(this.j);
    paramPrintWriter.print(" mListenerRegistered=");
    paramPrintWriter.println(this.m);
    if (this.n != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.n);
      paramPrintWriter.println(":");
      this.n.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  void b()
  {
    if (bf.a) {
      Log.v("LoaderManager", "  Retaining: " + this);
    }
    this.i = true;
    this.j = this.h;
    this.h = false;
    this.c = null;
  }
  
  void b(n<Object> paramn, Object paramObject)
  {
    String str;
    if (this.c != null)
    {
      if (bf.a(this.o) == null) {
        break label161;
      }
      str = bf.a(this.o).d.v;
      bf.a(this.o).d.v = "onLoadFinished";
    }
    for (;;)
    {
      try
      {
        if (bf.a) {
          Log.v("LoaderManager", "  onLoadFinished in " + paramn + ": " + paramn.c(paramObject));
        }
        this.c.a(paramn, paramObject);
        if (bf.a(this.o) != null) {
          bf.a(this.o).d.v = str;
        }
        this.f = true;
        return;
      }
      finally
      {
        if (bf.a(this.o) != null) {
          bf.a(this.o).d.v = str;
        }
      }
      label161:
      str = null;
    }
  }
  
  void c()
  {
    if (this.i)
    {
      if (bf.a) {
        Log.v("LoaderManager", "  Finished Retaining: " + this);
      }
      this.i = false;
      if ((this.h != this.j) && (!this.h)) {
        e();
      }
    }
    if ((this.h) && (this.e) && (!this.k)) {
      b(this.d, this.g);
    }
  }
  
  void d()
  {
    if ((this.h) && (this.k))
    {
      this.k = false;
      if (this.e) {
        b(this.d, this.g);
      }
    }
  }
  
  void e()
  {
    if (bf.a) {
      Log.v("LoaderManager", "  Stopping: " + this);
    }
    this.h = false;
    if ((!this.i) && (this.d != null) && (this.m))
    {
      this.m = false;
      this.d.a(this);
      this.d.b(this);
      this.d.m();
    }
  }
  
  void f()
  {
    if (bf.a) {
      Log.v("LoaderManager", "  Canceling: " + this);
    }
    if ((this.h) && (this.d != null) && (this.m) && (!this.d.k())) {
      a(this.d);
    }
  }
  
  void g()
  {
    if (bf.a) {
      Log.v("LoaderManager", "  Destroying: " + this);
    }
    this.l = true;
    boolean bool = this.f;
    this.f = false;
    String str;
    if ((this.c != null) && (this.d != null) && (this.e) && (bool))
    {
      if (bf.a) {
        Log.v("LoaderManager", "  Reseting: " + this);
      }
      if (bf.a(this.o) == null) {
        break label280;
      }
      str = bf.a(this.o).d.v;
      bf.a(this.o).d.v = "onLoaderReset";
    }
    for (;;)
    {
      try
      {
        this.c.a(this.d);
        if (bf.a(this.o) != null) {
          bf.a(this.o).d.v = str;
        }
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null)
        {
          if (this.m)
          {
            this.m = false;
            this.d.a(this);
            this.d.b(this);
          }
          this.d.q();
        }
        if (this.n != null) {
          this.n.g();
        }
        return;
      }
      finally
      {
        if (bf.a(this.o) != null) {
          bf.a(this.o).d.v = str;
        }
      }
      label280:
      str = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    d.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */