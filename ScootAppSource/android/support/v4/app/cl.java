package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

public final class cl
{
  public static Notification a(Notification paramNotification, Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent)
  {
    paramNotification.setLatestEventInfo(paramContext, paramCharSequence1, paramCharSequence2, paramPendingIntent);
    return paramNotification;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */