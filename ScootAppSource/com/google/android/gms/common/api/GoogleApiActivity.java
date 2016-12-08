package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b.cv;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;

public class GoogleApiActivity
  extends Activity
  implements DialogInterface.OnCancelListener
{
  protected int a = 0;
  
  public static PendingIntent a(Context paramContext, PendingIntent paramPendingIntent, int paramInt)
  {
    return a(paramContext, paramPendingIntent, paramInt, true);
  }
  
  public static PendingIntent a(Context paramContext, PendingIntent paramPendingIntent, int paramInt, boolean paramBoolean)
  {
    return PendingIntent.getActivity(paramContext, 0, b(paramContext, paramPendingIntent, paramInt, paramBoolean), 134217728);
  }
  
  private void a()
  {
    Object localObject = getIntent().getExtras();
    if (localObject == null)
    {
      Log.e("GoogleApiActivity", "Activity started without extras");
      finish();
      return;
    }
    PendingIntent localPendingIntent = (PendingIntent)((Bundle)localObject).get("pending_intent");
    localObject = (Integer)((Bundle)localObject).get("error_code");
    if ((localPendingIntent == null) && (localObject == null))
    {
      Log.e("GoogleApiActivity", "Activity started without resolution");
      finish();
      return;
    }
    if (localPendingIntent != null) {
      try
      {
        startIntentSenderForResult(localPendingIntent.getIntentSender(), 1, null, 0, 0, 0);
        this.a = 1;
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", localSendIntentException);
        finish();
        return;
      }
    }
    b.a().a(this, ((Integer)localObject).intValue(), 2, this);
    this.a = 1;
  }
  
  private void a(int paramInt, cv paramcv)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramcv.b(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
      return;
    }
    paramcv.b();
  }
  
  public static Intent b(Context paramContext, PendingIntent paramPendingIntent, int paramInt, boolean paramBoolean)
  {
    paramContext = new Intent(paramContext, GoogleApiActivity.class);
    paramContext.putExtra("pending_intent", paramPendingIntent);
    paramContext.putExtra("failing_client_id", paramInt);
    paramContext.putExtra("notify_manager", paramBoolean);
    return paramContext;
  }
  
  protected void a(int paramInt)
  {
    setResult(paramInt);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      this.a = 0;
      paramIntent = cv.a();
      a(paramInt2);
      if (bool) {
        a(paramInt2, paramIntent);
      }
    }
    for (;;)
    {
      finish();
      return;
      if (paramInt1 == 2)
      {
        this.a = 0;
        a(paramInt2);
      }
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a = 0;
    setResult(0);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      this.a = paramBundle.getInt("resolution");
    }
    if (this.a != 1) {
      a();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("resolution", this.a);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\GoogleApiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */