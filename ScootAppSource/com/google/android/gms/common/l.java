package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.j;
import com.google.android.gms.a.m;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.bf;
import com.google.android.gms.common.internal.bg;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class l
  extends bg
{
  private int a;
  
  protected l(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 25) {}
    for (boolean bool = true;; bool = false)
    {
      int i = paramArrayOfByte.length;
      b.b(bool, 55 + "cert hash data has incorrect length. length=" + i);
      this.a = Arrays.hashCode(paramArrayOfByte);
      return;
    }
  }
  
  protected static byte[] a(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ISO-8859-1");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  public j a()
  {
    return m.a(c());
  }
  
  public int b()
  {
    return hashCode();
  }
  
  abstract byte[] c();
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof bf))) {
      return false;
    }
    try
    {
      paramObject = (bf)paramObject;
      if (((bf)paramObject).b() != hashCode()) {
        return false;
      }
      paramObject = ((bf)paramObject).a();
      if (paramObject == null) {
        return false;
      }
      paramObject = (byte[])m.a((j)paramObject);
      boolean bool = Arrays.equals(c(), (byte[])paramObject);
      return bool;
    }
    catch (RemoteException paramObject)
    {
      Log.e("GoogleCertificates", "iCertData failed to retrive data from remote");
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */