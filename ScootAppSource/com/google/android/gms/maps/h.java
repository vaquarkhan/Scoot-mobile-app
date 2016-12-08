package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.a.b;
import com.google.android.gms.a.m;
import com.google.android.gms.a.n;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.an;
import com.google.android.gms.maps.a.ar;
import com.google.android.gms.maps.a.j;
import com.google.android.gms.maps.model.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class h
  extends b<f>
{
  protected n<f> a;
  private final Fragment b;
  private Activity c;
  private final List<e> d = new ArrayList();
  
  h(Fragment paramFragment)
  {
    this.b = paramFragment;
  }
  
  private void a(Activity paramActivity)
  {
    this.c = paramActivity;
    g();
  }
  
  protected void a(n<f> paramn)
  {
    this.a = paramn;
    g();
  }
  
  public void a(e parame)
  {
    if (a() != null)
    {
      ((f)a()).a(parame);
      return;
    }
    this.d.add(parame);
  }
  
  public void g()
  {
    if ((this.c != null) && (this.a != null) && (a() == null)) {
      try
      {
        d.a(this.c);
        Object localObject = an.a(this.c).b(m.a(this.c));
        if (localObject == null) {
          return;
        }
        this.a.a(new f(this.b, (j)localObject));
        localObject = this.d.iterator();
        while (((Iterator)localObject).hasNext())
        {
          e locale = (e)((Iterator)localObject).next();
          ((f)a()).a(locale);
        }
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new g(localRemoteException);
        this.d.clear();
        return;
      }
      catch (c localc) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */