package com.parse;

import a.ac;
import a.o;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class GcmRegistrar$Request
{
  private static final int BACKOFF_INTERVAL_MS = 3000;
  private static final int MAX_RETRIES = 5;
  private static final String RETRY_ACTION = "com.parse.RetryGcmRegistration";
  private final PendingIntent appIntent;
  private final Context context;
  private final int identifier;
  private final Random random;
  private final PendingIntent retryIntent;
  private final BroadcastReceiver retryReceiver;
  private final String senderId;
  private final ac<String> tcs;
  private final AtomicInteger tries;
  
  private GcmRegistrar$Request(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.senderId = paramString;
    this.random = new Random();
    this.identifier = this.random.nextInt();
    this.tcs = new ac();
    this.appIntent = PendingIntent.getBroadcast(this.context, this.identifier, new Intent(), 0);
    this.tries = new AtomicInteger(0);
    paramString = this.context.getPackageName();
    Object localObject = new Intent("com.parse.RetryGcmRegistration").setPackage(paramString);
    ((Intent)localObject).addCategory(paramString);
    ((Intent)localObject).putExtra("random", this.identifier);
    this.retryIntent = PendingIntent.getBroadcast(this.context, this.identifier, (Intent)localObject, 0);
    this.retryReceiver = new GcmRegistrar.Request.1(this);
    localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("com.parse.RetryGcmRegistration");
    ((IntentFilter)localObject).addCategory(paramString);
    paramContext.registerReceiver(this.retryReceiver, (IntentFilter)localObject);
  }
  
  public static Request createAndSend(Context paramContext, String paramString)
  {
    paramContext = new Request(paramContext, paramString);
    paramContext.send();
    return paramContext;
  }
  
  private void finish(String paramString1, String paramString2)
  {
    if (paramString1 != null) {}
    for (boolean bool = this.tcs.a(paramString1);; bool = this.tcs.a(new Exception("GCM registration error: " + paramString2)))
    {
      if (bool)
      {
        this.appIntent.cancel();
        this.retryIntent.cancel();
        this.context.unregisterReceiver(this.retryReceiver);
      }
      return;
    }
  }
  
  private void send()
  {
    Object localObject1 = new Intent("com.google.android.c2dm.intent.REGISTER");
    ((Intent)localObject1).setPackage("com.google.android.gsf");
    ((Intent)localObject1).putExtra("sender", this.senderId);
    ((Intent)localObject1).putExtra("app", this.appIntent);
    try
    {
      localObject1 = this.context.startService((Intent)localObject1);
      if (localObject1 == null) {
        finish(null, "GSF_PACKAGE_NOT_AVAILABLE");
      }
      this.tries.incrementAndGet();
      PLog.v("com.parse.GcmRegistrar", "Sending GCM registration intent");
      return;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
  }
  
  public o<String> getTask()
  {
    return this.tcs.a();
  }
  
  public void onReceiveResponseIntent(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("registration_id");
    paramIntent = paramIntent.getStringExtra("error");
    if ((str == null) && (paramIntent == null))
    {
      PLog.e("com.parse.GcmRegistrar", "Got no registration info in GCM onReceiveResponseIntent");
      return;
    }
    if (("SERVICE_NOT_AVAILABLE".equals(paramIntent)) && (this.tries.get() < 5))
    {
      ((AlarmManager)this.context.getSystemService("alarm")).set(2, (1 << this.tries.get()) * 3000 + this.random.nextInt(3000) + SystemClock.elapsedRealtime(), this.retryIntent);
      return;
    }
    finish(str, paramIntent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar$Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */