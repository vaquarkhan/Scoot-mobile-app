package android.support.v4.b;

import android.content.Context;
import android.support.v4.g.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class n<D>
{
  int f;
  p<D> g;
  o<D> h;
  Context i;
  boolean j = false;
  boolean k = false;
  boolean l = true;
  boolean m = false;
  boolean n = false;
  
  public n(Context paramContext)
  {
    this.i = paramContext.getApplicationContext();
  }
  
  protected void a() {}
  
  public void a(int paramInt, p<D> paramp)
  {
    if (this.g != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.g = paramp;
    this.f = paramInt;
  }
  
  public void a(o<D> paramo)
  {
    if (this.h != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.h = paramo;
  }
  
  public void a(p<D> paramp)
  {
    if (this.g == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.g != paramp) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.g = null;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.g);
    if ((this.j) || (this.m) || (this.n))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.m);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.n);
    }
    if ((this.k) || (this.l))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.l);
    }
  }
  
  public void b(o<D> paramo)
  {
    if (this.h == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.h != paramo) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.h = null;
  }
  
  public void b(D paramD)
  {
    if (this.g != null) {
      this.g.a(this, paramD);
    }
  }
  
  protected boolean b()
  {
    return false;
  }
  
  public String c(D paramD)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(paramD, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void g()
  {
    if (this.h != null) {
      this.h.a(this);
    }
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public final void i()
  {
    this.j = true;
    this.l = false;
    this.k = false;
    j();
  }
  
  protected void j() {}
  
  public boolean k()
  {
    return b();
  }
  
  public void l()
  {
    a();
  }
  
  public void m()
  {
    this.j = false;
    n();
  }
  
  protected void n() {}
  
  public void o()
  {
    this.k = true;
    p();
  }
  
  protected void p() {}
  
  public void q()
  {
    r();
    this.l = true;
    this.j = false;
    this.k = false;
    this.m = false;
    this.n = false;
  }
  
  protected void r() {}
  
  public void s()
  {
    this.n = false;
  }
  
  public void t()
  {
    if (this.n) {
      this.m = true;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */