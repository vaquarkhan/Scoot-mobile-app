package com.google.android.gms.b;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.af;
import java.lang.ref.WeakReference;

final class ea
  implements IBinder.DeathRecipient, eb
{
  private final WeakReference<be<?, ?>> a;
  private final WeakReference<af> b;
  private final WeakReference<IBinder> c;
  
  private ea(be<?, ?> parambe, af paramaf, IBinder paramIBinder)
  {
    this.b = new WeakReference(paramaf);
    this.a = new WeakReference(parambe);
    this.c = new WeakReference(paramIBinder);
  }
  
  private void a()
  {
    Object localObject = (be)this.a.get();
    af localaf = (af)this.b.get();
    if ((localaf != null) && (localObject != null)) {
      localaf.a(((be)localObject).a().intValue());
    }
    localObject = (IBinder)this.c.get();
    if (this.c != null) {
      ((IBinder)localObject).unlinkToDeath(this, 0);
    }
  }
  
  public void a(be<?, ?> parambe)
  {
    a();
  }
  
  public void binderDied()
  {
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */