package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

final class c
  implements Comparator<Scope>
{
  public int a(Scope paramScope1, Scope paramScope2)
  {
    return paramScope1.a().compareTo(paramScope2.a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */