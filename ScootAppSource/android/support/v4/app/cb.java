package android.support.v4.app;

import android.app.Notification;

final class cb
  extends ca
{
  public Notification a(bu parambu, bv parambv)
  {
    parambv = co.a(parambu.B, parambu.a, parambu.b, parambu.c, parambu.d, parambu.e);
    if (parambu.j > 0) {
      parambv.flags |= 0x80;
    }
    return parambv;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */