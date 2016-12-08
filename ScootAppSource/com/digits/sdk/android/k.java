package com.digits.sdk.android;

import android.os.Bundle;

final class k
{
  static boolean a(Bundle paramBundle, String... paramVarArgs)
  {
    if ((paramBundle == null) || (paramVarArgs == null)) {
      return false;
    }
    int j = paramVarArgs.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label37;
      }
      if (!paramBundle.containsKey(paramVarArgs[i])) {
        break;
      }
      i += 1;
    }
    label37:
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */