package com.google.android.gms.b;

import com.google.android.gms.auth.api.signin.internal.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.y;

final class cn
  implements y<Status>
{
  cn(cj paramcj, ds paramds, boolean paramBoolean, q paramq) {}
  
  public void a(Status paramStatus)
  {
    u.a(cj.c(this.d)).c();
    if ((paramStatus.f()) && (this.d.i())) {
      this.d.k();
    }
    this.a.b(paramStatus);
    if (this.b) {
      this.c.g();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */