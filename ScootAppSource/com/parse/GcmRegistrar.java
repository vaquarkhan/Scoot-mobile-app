package com.parse;

import a.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class GcmRegistrar
{
  private static final String ERROR_EXTRA = "error";
  private static final String FILENAME_DEVICE_TOKEN_LAST_MODIFIED = "deviceTokenLastModified";
  private static final String PARSE_SENDER_ID = "1076345567071";
  public static final String REGISTER_ACTION = "com.google.android.c2dm.intent.REGISTER";
  private static final String REGISTRATION_ID_EXTRA = "registration_id";
  private static final String SENDER_ID_EXTRA = "com.parse.push.gcm_sender_id";
  private static final String TAG = "com.parse.GcmRegistrar";
  private Context context = null;
  private long localDeviceTokenLastModified;
  private final Object localDeviceTokenLastModifiedMutex = new Object();
  private final Object lock = new Object();
  private GcmRegistrar.Request request = null;
  
  GcmRegistrar(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private static String actualSenderIDFromExtra(Object paramObject)
  {
    if (!(paramObject instanceof String)) {}
    do
    {
      return null;
      paramObject = (String)paramObject;
    } while (!((String)paramObject).startsWith("id:"));
    return ((String)paramObject).substring(3);
  }
  
  static void deleteLocalDeviceTokenLastModifiedFile()
  {
    ParseFileUtils.deleteQuietly(getLocalDeviceTokenLastModifiedFile());
  }
  
  public static GcmRegistrar getInstance()
  {
    return GcmRegistrar.Singleton.INSTANCE;
  }
  
  private o<Long> getLocalDeviceTokenLastModifiedAsync()
  {
    return o.a(new GcmRegistrar.5(this), o.a);
  }
  
  static File getLocalDeviceTokenLastModifiedFile()
  {
    return new File(Parse.getParseCacheDir("GCMRegistrar"), "deviceTokenLastModified");
  }
  
  private o<Void> sendRegistrationRequestAsync()
  {
    for (;;)
    {
      Object localObject5;
      String str;
      synchronized (this.lock)
      {
        if (this.request != null)
        {
          localObject1 = o.a(null);
          return (o<Void>)localObject1;
        }
        localObject5 = ManifestInfo.getApplicationMetadata(this.context);
        str = "1076345567071";
        Object localObject1 = str;
        if (localObject5 != null)
        {
          localObject5 = ((Bundle)localObject5).get("com.parse.push.gcm_sender_id");
          localObject1 = str;
          if (localObject5 != null)
          {
            localObject1 = actualSenderIDFromExtra(localObject5);
            if (localObject1 == null) {
              break label133;
            }
            localObject1 = "1076345567071" + "," + (String)localObject1;
          }
        }
        this.request = GcmRegistrar.Request.createAndSend(this.context, (String)localObject1);
        localObject1 = this.request.getTask().a(new GcmRegistrar.2(this));
        return (o<Void>)localObject1;
      }
      label133:
      PLog.e("com.parse.GcmRegistrar", "Found com.parse.push.gcm_sender_id <meta-data> element with value \"" + localObject5.toString() + "\", but the value is missing the expected \"id:\" prefix.");
      Object localObject3 = str;
    }
  }
  
  int getRequestIdentifier()
  {
    for (;;)
    {
      synchronized (this.lock)
      {
        if (this.request != null)
        {
          i = GcmRegistrar.Request.access$300(this.request);
          return i;
        }
      }
      int i = 0;
    }
  }
  
  public o<Void> handleRegistrationIntentAsync(Intent paramIntent)
  {
    ArrayList localArrayList = new ArrayList();
    ??? = paramIntent.getStringExtra("registration_id");
    if ((??? != null) && (((String)???).length() > 0))
    {
      PLog.v("com.parse.GcmRegistrar", "Received deviceToken <" + (String)??? + "> from GCM.");
      ParseInstallation localParseInstallation = ParseInstallation.getCurrentInstallation();
      if (!((String)???).equals(localParseInstallation.getDeviceToken()))
      {
        localParseInstallation.setPushType(PushType.GCM);
        localParseInstallation.setDeviceToken((String)???);
        localArrayList.add(localParseInstallation.saveInBackground());
      }
      localArrayList.add(updateLocalDeviceTokenLastModifiedAsync());
    }
    synchronized (this.lock)
    {
      if (this.request != null) {
        this.request.onReceiveResponseIntent(paramIntent);
      }
      return o.a(localArrayList);
    }
  }
  
  o<Boolean> isLocalDeviceTokenStaleAsync()
  {
    return getLocalDeviceTokenLastModifiedAsync().d(new GcmRegistrar.3(this));
  }
  
  public o<Void> registerAsync()
  {
    if (ManifestInfo.getPushType() != PushType.GCM) {
      return o.a(null);
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        ParseInstallation localParseInstallation = ParseInstallation.getCurrentInstallation();
        if (localParseInstallation.getDeviceToken() == null)
        {
          o localo1 = o.a(Boolean.valueOf(true));
          localo1 = localo1.d(new GcmRegistrar.1(this, localParseInstallation));
          return localo1;
        }
      }
      o localo2 = isLocalDeviceTokenStaleAsync();
    }
  }
  
  o<Void> updateLocalDeviceTokenLastModifiedAsync()
  {
    return o.a(new GcmRegistrar.4(this), o.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */