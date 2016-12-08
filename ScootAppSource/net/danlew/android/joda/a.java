package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import e.b.a.i;
import java.io.IOException;

public final class a
{
  private static boolean a = false;
  
  public static void a(Context paramContext)
  {
    if (a) {
      return;
    }
    a = true;
    try
    {
      i.a(new c(paramContext));
      paramContext.getApplicationContext().registerReceiver(new d(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
      return;
    }
    catch (IOException paramContext)
    {
      throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", paramContext);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\net\danlew\android\joda\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */