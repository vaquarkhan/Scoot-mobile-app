package com.mixpanel.android.a;

import com.mixpanel.android.a.e.h;
import com.mixpanel.android.a.e.i;
import java.net.InetSocketAddress;

public abstract class d
  implements f
{
  public i a(a parama, com.mixpanel.android.a.b.a parama1, com.mixpanel.android.a.e.a parama2)
  {
    return new com.mixpanel.android.a.e.e();
  }
  
  public String a(a parama)
  {
    parama = parama.a();
    if (parama == null) {
      throw new com.mixpanel.android.a.c.d("socket not bound");
    }
    StringBuffer localStringBuffer = new StringBuffer(90);
    localStringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
    localStringBuffer.append(parama.getPort());
    localStringBuffer.append("\" /></cross-domain-policy>\000");
    return localStringBuffer.toString();
  }
  
  public void a(a parama, com.mixpanel.android.a.d.d paramd) {}
  
  public void a(a parama, com.mixpanel.android.a.e.a parama1) {}
  
  public void a(a parama, com.mixpanel.android.a.e.a parama1, h paramh) {}
  
  public void b(a parama, com.mixpanel.android.a.d.d paramd)
  {
    paramd = new com.mixpanel.android.a.d.f(paramd);
    paramd.a(com.mixpanel.android.a.d.e.e);
    parama.a(paramd);
  }
  
  public void c(a parama, com.mixpanel.android.a.d.d paramd) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */