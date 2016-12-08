package com.google.android.gms.common.a;

import java.util.Collections;
import java.util.Set;

public final class d
{
  public static <T> Set<T> a(T paramT1, T paramT2, T paramT3)
  {
    a locala = new a(3);
    locala.add(paramT1);
    locala.add(paramT2);
    locala.add(paramT3);
    return Collections.unmodifiableSet(locala);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */