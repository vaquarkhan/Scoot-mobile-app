package net.danlew.android.joda;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import e.b.a.i;
import java.util.TimeZone;

public final class d
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getStringExtra("time-zone");
    try
    {
      i.a(i.a(TimeZone.getDefault()));
      Log.d("joda-time-android", "TIMEZONE_CHANGED received, changed default timezone to \"" + paramContext + "\"");
      return;
    }
    catch (IllegalArgumentException paramIntent)
    {
      Log.e("joda-time-android", "Could not recognize timezone id \"" + paramContext + "\"", paramIntent);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\net\danlew\android\joda\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */