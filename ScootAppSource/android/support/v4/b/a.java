package android.support.v4.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.g.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public abstract class a<D>
  extends n<D>
{
  volatile a<D>.b a;
  volatile a<D>.b b;
  long c;
  long d = -10000L;
  Handler e;
  private final Executor o;
  
  public a(Context paramContext)
  {
    this(paramContext, u.c);
  }
  
  private a(Context paramContext, Executor paramExecutor)
  {
    super(paramContext);
    this.o = paramExecutor;
  }
  
  protected void a()
  {
    super.a();
    k();
    this.a = new b(this);
    c();
  }
  
  void a(a<D>.b parama, D paramD)
  {
    a(paramD);
    if (this.b == parama)
    {
      t();
      this.d = SystemClock.uptimeMillis();
      this.b = null;
      g();
      c();
    }
  }
  
  public void a(D paramD) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.a.a);
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.b);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.b.a);
    }
    if (this.c != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      s.a(this.c, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      s.a(this.d, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  void b(a<D>.b parama, D paramD)
  {
    if (this.a != parama)
    {
      a(parama, paramD);
      return;
    }
    if (h())
    {
      a(paramD);
      return;
    }
    s();
    this.d = SystemClock.uptimeMillis();
    this.a = null;
    b(paramD);
  }
  
  protected boolean b()
  {
    if (this.a != null)
    {
      if (this.b != null)
      {
        if (this.a.a)
        {
          this.a.a = false;
          this.e.removeCallbacks(this.a);
        }
        this.a = null;
      }
    }
    else {
      return false;
    }
    if (this.a.a)
    {
      this.a.a = false;
      this.e.removeCallbacks(this.a);
      this.a = null;
      return false;
    }
    boolean bool = this.a.a(false);
    if (bool)
    {
      this.b = this.a;
      f();
    }
    this.a = null;
    return bool;
  }
  
  void c()
  {
    if ((this.b == null) && (this.a != null))
    {
      if (this.a.a)
      {
        this.a.a = false;
        this.e.removeCallbacks(this.a);
      }
      if ((this.c > 0L) && (SystemClock.uptimeMillis() < this.d + this.c))
      {
        this.a.a = true;
        this.e.postAtTime(this.a, this.d + this.c);
      }
    }
    else
    {
      return;
    }
    this.a.a(this.o, (Void[])null);
  }
  
  public abstract D d();
  
  protected D e()
  {
    return (D)d();
  }
  
  public void f() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */