package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.g.q;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class ag<E>
  extends ae
{
  private final Activity a;
  final Context b;
  final int c;
  final aj d = new aj();
  private final Handler e;
  private q<String, bd> f;
  private boolean g;
  private bf h;
  private boolean i;
  private boolean j;
  
  ag(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramContext;
    this.e = paramHandler;
    this.c = paramInt;
  }
  
  ag(aa paramaa)
  {
    this(paramaa, paramaa, paramaa.a, 0);
  }
  
  bf a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f == null) {
      this.f = new q();
    }
    bf localbf = (bf)this.f.get(paramString);
    if (localbf == null)
    {
      if (paramBoolean2)
      {
        localbf = new bf(paramString, this, paramBoolean1);
        this.f.put(paramString, localbf);
      }
      return localbf;
    }
    localbf.a(this);
    return localbf;
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt != -1) {
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    this.b.startActivity(paramIntent);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt) {}
  
  void a(q<String, bd> paramq)
  {
    this.f = paramq;
  }
  
  void a(String paramString)
  {
    if (this.f != null)
    {
      bf localbf = (bf)this.f.get(paramString);
      if ((localbf != null) && (!localbf.f))
      {
        localbf.h();
        this.f.remove(paramString);
      }
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (this.h == null) {}
    while (!this.j) {
      return;
    }
    this.j = false;
    if (paramBoolean)
    {
      this.h.d();
      return;
    }
    this.h.c();
  }
  
  public boolean a()
  {
    return true;
  }
  
  public boolean a(Fragment paramFragment)
  {
    return true;
  }
  
  public LayoutInflater b()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }
  
  void b(Fragment paramFragment) {}
  
  void b(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.j);
    if (this.h != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
      paramPrintWriter.println(":");
      this.h.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public void c() {}
  
  public boolean d()
  {
    return true;
  }
  
  public int e()
  {
    return this.c;
  }
  
  Activity f()
  {
    return this.a;
  }
  
  Context g()
  {
    return this.b;
  }
  
  Handler h()
  {
    return this.e;
  }
  
  aj i()
  {
    return this.d;
  }
  
  bf j()
  {
    if (this.h != null) {
      return this.h;
    }
    this.i = true;
    this.h = a("(root)", this.j, true);
    return this.h;
  }
  
  boolean k()
  {
    return this.g;
  }
  
  void l()
  {
    if (this.j) {
      return;
    }
    this.j = true;
    if (this.h != null) {
      this.h.b();
    }
    for (;;)
    {
      this.i = true;
      return;
      if (!this.i)
      {
        this.h = a("(root)", this.j, false);
        if ((this.h != null) && (!this.h.e)) {
          this.h.b();
        }
      }
    }
  }
  
  void m()
  {
    if (this.h == null) {
      return;
    }
    this.h.h();
  }
  
  void n()
  {
    if (this.f != null)
    {
      int m = this.f.size();
      bf[] arrayOfbf = new bf[m];
      int k = m - 1;
      while (k >= 0)
      {
        arrayOfbf[k] = ((bf)this.f.c(k));
        k -= 1;
      }
      k = 0;
      while (k < m)
      {
        bf localbf = arrayOfbf[k];
        localbf.e();
        localbf.g();
        k += 1;
      }
    }
  }
  
  q<String, bd> o()
  {
    int m = 0;
    int n;
    if (this.f != null)
    {
      int i1 = this.f.size();
      bf[] arrayOfbf = new bf[i1];
      int k = i1 - 1;
      while (k >= 0)
      {
        arrayOfbf[k] = ((bf)this.f.c(k));
        k -= 1;
      }
      k = 0;
      n = k;
      if (m < i1)
      {
        bf localbf = arrayOfbf[m];
        if (localbf.f) {
          k = 1;
        }
        for (;;)
        {
          m += 1;
          break;
          localbf.h();
          this.f.remove(localbf.d);
        }
      }
    }
    else
    {
      n = 0;
    }
    if (n != 0) {
      return this.f;
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */