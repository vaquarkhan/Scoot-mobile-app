package com.google.android.gms.common.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

public abstract interface k
  extends h
{
  public abstract void a(bb parambb, Set<Scope> paramSet);
  
  public abstract void a(o paramo);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract boolean d();
  
  public abstract Intent e();
  
  public abstract void g();
  
  public abstract boolean h();
  
  public abstract boolean i();
  
  public abstract boolean j();
  
  public abstract boolean k();
  
  public abstract IBinder l();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */