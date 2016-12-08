package com.appsee;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.UUID;

final class dk
  implements e
{
  dk(StringBuilder paramStringBuilder) {}
  
  public void C()
  {
    Object localObject1 = bp.C();
    if (((Context)localObject1).checkCallingOrSelfPermission(kl.C("&]#A(Z#\0357V5^.@4Z(]ia\002r\003l\027{\b}\002l\024g\006g\002")) != 0)
    {
      this.l.append(String.format(mb.C("-=at"), new Object[] { wn.C() }));
      return;
    }
    Object localObject2 = (TelephonyManager)((Context)localObject1).getSystemService(kl.C("7[(]\""));
    if (localObject2 == null)
    {
      this.l.append(String.format(mb.C("-=at"), new Object[] { wn.C() }));
      return;
    }
    localObject1 = ((TelephonyManager)localObject2).getDeviceId();
    localObject2 = ((TelephonyManager)localObject2).getSimSerialNumber();
    long l1 = wn.C().hashCode();
    long l2 = ((String)localObject1).hashCode();
    localObject1 = new UUID(l1, ((String)localObject2).hashCode() | l2 << 32);
    this.l.append(((UUID)localObject1).toString());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */