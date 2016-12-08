package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.b.n;
import android.support.v4.g.d;
import android.support.v4.g.r;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class bf
  extends bd
{
  static boolean a = false;
  final r<bg> b = new r();
  final r<bg> c = new r();
  final String d;
  boolean e;
  boolean f;
  boolean g;
  private ag h;
  
  bf(String paramString, ag paramag, boolean paramBoolean)
  {
    this.d = paramString;
    this.h = paramag;
    this.e = paramBoolean;
  }
  
  private bg c(int paramInt, Bundle paramBundle, be<Object> parambe)
  {
    bg localbg = new bg(this, paramInt, paramBundle, parambe);
    localbg.d = parambe.a(paramInt, paramBundle);
    return localbg;
  }
  
  private bg d(int paramInt, Bundle paramBundle, be<Object> parambe)
  {
    try
    {
      this.g = true;
      paramBundle = c(paramInt, paramBundle, parambe);
      a(paramBundle);
      return paramBundle;
    }
    finally
    {
      this.g = false;
    }
  }
  
  public <D> n<D> a(int paramInt, Bundle paramBundle, be<D> parambe)
  {
    if (this.g) {
      throw new IllegalStateException("Called while creating a loader");
    }
    bg localbg = (bg)this.b.a(paramInt);
    if (a) {
      Log.v("LoaderManager", "initLoader in " + this + ": args=" + paramBundle);
    }
    if (localbg == null)
    {
      parambe = d(paramInt, paramBundle, parambe);
      paramBundle = parambe;
      if (a) {
        Log.v("LoaderManager", "  Created new loader " + parambe);
      }
    }
    for (paramBundle = parambe;; paramBundle = localbg)
    {
      if ((paramBundle.e) && (this.e)) {
        paramBundle.b(paramBundle.d, paramBundle.g);
      }
      return paramBundle.d;
      if (a) {
        Log.v("LoaderManager", "  Re-using existing loader " + localbg);
      }
      localbg.c = parambe;
    }
  }
  
  void a(ag paramag)
  {
    this.h = paramag;
  }
  
  void a(bg parambg)
  {
    this.b.b(parambg.a, parambg);
    if (this.e) {
      parambg.a();
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    String str;
    int i;
    bg localbg;
    if (this.b.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      str = paramString + "    ";
      i = 0;
      while (i < this.b.b())
      {
        localbg = (bg)this.b.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localbg.toString());
        localbg.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
    if (this.c.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      str = paramString + "    ";
      i = j;
      while (i < this.c.b())
      {
        localbg = (bg)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localbg.toString());
        localbg.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
  }
  
  public boolean a()
  {
    int j = this.b.b();
    int i = 0;
    boolean bool2 = false;
    if (i < j)
    {
      bg localbg = (bg)this.b.e(i);
      if ((localbg.h) && (!localbg.f)) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 |= bool1;
        i += 1;
        break;
      }
    }
    return bool2;
  }
  
  public <D> n<D> b(int paramInt, Bundle paramBundle, be<D> parambe)
  {
    if (this.g) {
      throw new IllegalStateException("Called while creating a loader");
    }
    bg localbg1 = (bg)this.b.a(paramInt);
    if (a) {
      Log.v("LoaderManager", "restartLoader in " + this + ": args=" + paramBundle);
    }
    if (localbg1 != null)
    {
      bg localbg2 = (bg)this.c.a(paramInt);
      if (localbg2 == null) {
        break label323;
      }
      if (!localbg1.e) {
        break label173;
      }
      if (a) {
        Log.v("LoaderManager", "  Removing last inactive loader: " + localbg1);
      }
      localbg2.f = false;
      localbg2.g();
      localbg1.d.o();
      this.c.b(paramInt, localbg1);
    }
    for (;;)
    {
      return d(paramInt, paramBundle, parambe).d;
      label173:
      if (!localbg1.h)
      {
        if (a) {
          Log.v("LoaderManager", "  Current loader is stopped; replacing");
        }
        this.b.b(paramInt, null);
        localbg1.g();
      }
      else
      {
        if (a) {
          Log.v("LoaderManager", "  Current loader is running; attempting to cancel");
        }
        localbg1.f();
        if (localbg1.n != null)
        {
          if (a) {
            Log.v("LoaderManager", "  Removing pending loader: " + localbg1.n);
          }
          localbg1.n.g();
          localbg1.n = null;
        }
        if (a) {
          Log.v("LoaderManager", "  Enqueuing as new pending loader");
        }
        localbg1.n = c(paramInt, paramBundle, parambe);
        return localbg1.n.d;
        label323:
        if (a) {
          Log.v("LoaderManager", "  Making last loader inactive: " + localbg1);
        }
        localbg1.d.o();
        this.c.b(paramInt, localbg1);
      }
    }
  }
  
  void b()
  {
    if (a) {
      Log.v("LoaderManager", "Starting in " + this);
    }
    if (this.e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.e = true;
      int i = this.b.b() - 1;
      while (i >= 0)
      {
        ((bg)this.b.e(i)).a();
        i -= 1;
      }
    }
  }
  
  void c()
  {
    if (a) {
      Log.v("LoaderManager", "Stopping in " + this);
    }
    if (!this.e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
      return;
    }
    int i = this.b.b() - 1;
    while (i >= 0)
    {
      ((bg)this.b.e(i)).e();
      i -= 1;
    }
    this.e = false;
  }
  
  void d()
  {
    if (a) {
      Log.v("LoaderManager", "Retaining in " + this);
    }
    if (!this.e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.f = true;
      this.e = false;
      int i = this.b.b() - 1;
      while (i >= 0)
      {
        ((bg)this.b.e(i)).b();
        i -= 1;
      }
    }
  }
  
  void e()
  {
    if (this.f)
    {
      if (a) {
        Log.v("LoaderManager", "Finished Retaining in " + this);
      }
      this.f = false;
      int i = this.b.b() - 1;
      while (i >= 0)
      {
        ((bg)this.b.e(i)).c();
        i -= 1;
      }
    }
  }
  
  void f()
  {
    int i = this.b.b() - 1;
    while (i >= 0)
    {
      ((bg)this.b.e(i)).k = true;
      i -= 1;
    }
  }
  
  void g()
  {
    int i = this.b.b() - 1;
    while (i >= 0)
    {
      ((bg)this.b.e(i)).d();
      i -= 1;
    }
  }
  
  void h()
  {
    if (!this.f)
    {
      if (a) {
        Log.v("LoaderManager", "Destroying Active in " + this);
      }
      i = this.b.b() - 1;
      while (i >= 0)
      {
        ((bg)this.b.e(i)).g();
        i -= 1;
      }
      this.b.c();
    }
    if (a) {
      Log.v("LoaderManager", "Destroying Inactive in " + this);
    }
    int i = this.c.b() - 1;
    while (i >= 0)
    {
      ((bg)this.c.e(i)).g();
      i -= 1;
    }
    this.c.c();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    d.a(this.h, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */