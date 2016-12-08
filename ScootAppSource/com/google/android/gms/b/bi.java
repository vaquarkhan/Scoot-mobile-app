package com.google.android.gms.b;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.b;

final class bi
  implements Runnable
{
  private bi(bg parambg) {}
  
  public void run()
  {
    if (!this.a.a) {
      return;
    }
    if (bg.a(this.a).a())
    {
      this.a.d.startActivityForResult(GoogleApiActivity.b(this.a.e(), bg.a(this.a).d(), bg.b(this.a), false), 1);
      return;
    }
    if (this.a.c.a(bg.a(this.a).c()))
    {
      this.a.c.a(this.a.e(), this.a.d, bg.a(this.a).c(), 2, this.a);
      return;
    }
    if (bg.a(this.a).c() == 18)
    {
      Dialog localDialog = this.a.c.a(this.a.e(), this.a);
      this.a.c.a(this.a.e().getApplicationContext(), new bj(this, localDialog));
      return;
    }
    this.a.a(bg.a(this.a), bg.b(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */