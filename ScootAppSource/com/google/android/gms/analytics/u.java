package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.as;
import com.google.android.gms.analytics.internal.ba;
import com.google.android.gms.analytics.internal.bl;
import java.util.List;
import java.util.ListIterator;

public class u
  extends ac<u>
{
  private final ah b;
  private boolean c;
  
  public u(ah paramah)
  {
    super(paramah.h(), paramah.d());
    this.b = paramah;
  }
  
  protected void a(z paramz)
  {
    paramz = (com.google.android.gms.b.ac)paramz.b(com.google.android.gms.b.ac.class);
    if (TextUtils.isEmpty(paramz.b())) {
      paramz.b(this.b.p().b());
    }
    if ((this.c) && (TextUtils.isEmpty(paramz.d())))
    {
      com.google.android.gms.analytics.internal.b localb = this.b.o();
      paramz.d(localb.c());
      paramz.a(localb.b());
    }
  }
  
  public void a(String paramString)
  {
    com.google.android.gms.common.internal.b.a(paramString);
    b(paramString);
    n().add(new v(this.b, paramString));
  }
  
  public void b(String paramString)
  {
    paramString = v.a(paramString);
    ListIterator localListIterator = n().listIterator();
    while (localListIterator.hasNext()) {
      if (paramString.equals(((ak)localListIterator.next()).a())) {
        localListIterator.remove();
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  ah k()
  {
    return this.b;
  }
  
  public z l()
  {
    z localz = m().a();
    localz.a(this.b.q().c());
    localz.a(this.b.r().b());
    b(localz);
    return localz;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */