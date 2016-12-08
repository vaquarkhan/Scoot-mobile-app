package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

final class dc
{
  static RemoteInput[] a(de[] paramArrayOfde)
  {
    if (paramArrayOfde == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfde.length];
    int i = 0;
    while (i < paramArrayOfde.length)
    {
      de localde = paramArrayOfde[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(localde.a()).setLabel(localde.b()).setChoices(localde.c()).setAllowFreeFormInput(localde.d()).addExtras(localde.e()).build();
      i += 1;
    }
    return arrayOfRemoteInput;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */