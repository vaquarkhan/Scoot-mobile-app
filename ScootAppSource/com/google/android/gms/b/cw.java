package com.google.android.gms.b;

import android.os.Handler;
import com.google.android.gms.common.api.ae;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class cw
  extends PhantomReference<ae<?>>
{
  private final int b;
  
  public cw(ae paramae, int paramInt, ReferenceQueue<ae<?>> paramReferenceQueue)
  {
    super(paramInt, localReferenceQueue);
    this.b = paramReferenceQueue;
  }
  
  public void a()
  {
    cv.a(this.a).sendMessage(cv.a(this.a).obtainMessage(2, this.b, 2));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */