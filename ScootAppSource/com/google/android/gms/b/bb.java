package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class bb
  implements t
{
  public final int a;
  public final q b;
  public final t c;
  
  public bb(ba paramba, int paramInt, q paramq, t paramt)
  {
    this.a = paramInt;
    this.b = paramq;
    this.c = paramt;
    paramq.a(this);
  }
  
  public void a()
  {
    this.b.b(this);
    this.b.g();
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    String str = String.valueOf(paramConnectionResult);
    Log.d("AutoManageHelper", String.valueOf(str).length() + 27 + "beginFailureResolution for " + str);
    this.d.b(paramConnectionResult, this.a);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("GoogleApiClient #").print(this.a);
    paramPrintWriter.println(":");
    this.b.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */