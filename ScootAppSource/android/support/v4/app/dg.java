package android.support.v4.app;

import android.os.Bundle;

final class dg
{
  static Bundle a(de paramde)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("resultKey", paramde.a());
    localBundle.putCharSequence("label", paramde.b());
    localBundle.putCharSequenceArray("choices", paramde.c());
    localBundle.putBoolean("allowFreeFormInput", paramde.d());
    localBundle.putBundle("extras", paramde.e());
    return localBundle;
  }
  
  static Bundle[] a(de[] paramArrayOfde)
  {
    if (paramArrayOfde == null) {
      return null;
    }
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfde.length];
    int i = 0;
    while (i < paramArrayOfde.length)
    {
      arrayOfBundle[i] = a(paramArrayOfde[i]);
      i += 1;
    }
    return arrayOfBundle;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */