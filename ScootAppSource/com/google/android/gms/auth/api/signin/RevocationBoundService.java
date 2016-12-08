package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.s;

public final class RevocationBoundService
  extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(paramIntent.getAction()))
    {
      if (Log.isLoggable("RevocationService", 2)) {
        Log.v("RevocationService", "RevocationBoundService handling disconnect.");
      }
      return new s(this);
    }
    paramIntent = String.valueOf(paramIntent.getAction());
    if (paramIntent.length() != 0) {}
    for (paramIntent = "Unknown action sent to RevocationBoundService: ".concat(paramIntent);; paramIntent = new String("Unknown action sent to RevocationBoundService: "))
    {
      Log.w("RevocationService", paramIntent);
      return null;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\RevocationBoundService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */