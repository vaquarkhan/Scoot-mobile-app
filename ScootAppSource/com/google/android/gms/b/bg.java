package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;

public abstract class bg
  extends di
  implements DialogInterface.OnCancelListener
{
  protected boolean a;
  protected boolean b;
  protected final b c;
  private ConnectionResult e;
  private int f = -1;
  private final Handler g = new Handler(Looper.getMainLooper());
  
  protected bg(dj paramdj)
  {
    this(paramdj, b.a());
  }
  
  bg(dj paramdj, b paramb)
  {
    super(paramdj);
    this.c = paramb;
  }
  
  public void a()
  {
    super.a();
    this.a = true;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = 0;
      if (paramInt1 != 0)
      {
        d();
        return;
      }
      break;
    case 2: 
      label30:
      j = this.c.a(e());
      if (j != 0) {}
      break;
    }
    for (paramInt2 = i;; paramInt2 = 0)
    {
      paramInt1 = paramInt2;
      if (this.e.c() != 18) {
        break label30;
      }
      paramInt1 = paramInt2;
      if (j != 18) {
        break label30;
      }
      return;
      paramInt1 = j;
      if (paramInt2 == -1) {
        break label30;
      }
      if (paramInt2 != 0) {
        break;
      }
      if (paramIntent != null) {}
      for (paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);; paramInt1 = 13)
      {
        this.e = new ConnectionResult(paramInt1, null);
        break;
        a(this.e, this.f);
        return;
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("resolving_error", false);
      if (this.b)
      {
        this.f = paramBundle.getInt("failed_client_id", -1);
        this.e = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  protected abstract void a(ConnectionResult paramConnectionResult, int paramInt);
  
  public void b()
  {
    super.b();
    this.a = false;
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    paramBundle.putBoolean("resolving_error", this.b);
    if (this.b)
    {
      paramBundle.putInt("failed_client_id", this.f);
      paramBundle.putInt("failed_status", this.e.c());
      paramBundle.putParcelable("failed_resolution", this.e.d());
    }
  }
  
  public void b(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (!this.b)
    {
      this.b = true;
      this.f = paramInt;
      this.e = paramConnectionResult;
      this.g.post(new bi(this, null));
    }
  }
  
  protected abstract void c();
  
  protected void d()
  {
    this.f = -1;
    this.b = false;
    this.e = null;
    c();
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    a(new ConnectionResult(13, null), this.f);
    d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */