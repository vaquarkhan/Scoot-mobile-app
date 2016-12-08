package android.support.v4.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.RemoteInput;

final class ch
{
  public static void a(Notification.Builder paramBuilder, cm paramcm)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(paramcm.a(), paramcm.b(), paramcm.c());
    if (paramcm.f() != null)
    {
      RemoteInput[] arrayOfRemoteInput = dc.a(paramcm.f());
      int j = arrayOfRemoteInput.length;
      int i = 0;
      while (i < j)
      {
        localBuilder.addRemoteInput(arrayOfRemoteInput[i]);
        i += 1;
      }
    }
    if (paramcm.d() != null) {
      localBuilder.addExtras(paramcm.d());
    }
    paramBuilder.addAction(localBuilder.build());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */