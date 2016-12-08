package com.google.android.gms.common.internal;

import java.util.Arrays;

public final class br
{
  public static int a(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static bt a(Object paramObject)
  {
    return new bt(paramObject, null);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */