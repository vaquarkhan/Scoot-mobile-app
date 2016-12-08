package com.parse;

import a.o;

class ParsePushChannelsController
{
  private static final String TAG = "com.parse.ParsePushChannelsController";
  private static boolean loggedManifestError = false;
  
  private static void checkManifestAndLogErrorIfNecessary()
  {
    if ((!loggedManifestError) && (ManifestInfo.getPushType() == PushType.NONE))
    {
      loggedManifestError = true;
      PLog.e("com.parse.ParsePushChannelsController", "Tried to subscribe or unsubscribe from a channel, but push is not enabled correctly. " + ManifestInfo.getNonePushTypeLogMessage());
    }
  }
  
  private static ParseCurrentInstallationController getCurrentInstallationController()
  {
    return ParseCorePlugins.getInstance().getCurrentInstallationController();
  }
  
  public o<Void> subscribeInBackground(String paramString)
  {
    
    if (paramString == null) {
      throw new IllegalArgumentException("Can't subscribe to null channel.");
    }
    return getCurrentInstallationController().getAsync().d(new ParsePushChannelsController.1(this, paramString));
  }
  
  public o<Void> unsubscribeInBackground(String paramString)
  {
    
    if (paramString == null) {
      throw new IllegalArgumentException("Can't unsubscribe from null channel.");
    }
    return getCurrentInstallationController().getAsync().d(new ParsePushChannelsController.2(this, paramString));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePushChannelsController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */