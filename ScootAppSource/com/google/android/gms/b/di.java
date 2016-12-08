package com.google.android.gms.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class di
{
  protected final dj d;
  
  protected di(dj paramdj)
  {
    this.d = paramdj;
  }
  
  protected static dj b(dh paramdh)
  {
    if (paramdh.a()) {
      return dt.a(paramdh.c());
    }
    return dk.a(paramdh.b());
  }
  
  public void a() {}
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void a(Bundle paramBundle) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public void b() {}
  
  public void b(Bundle paramBundle) {}
  
  public Activity e()
  {
    return this.d.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */