package com.parse;

import a.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ParseClassName("_Session")
public class ParseSession
  extends ParseObject
{
  private static final String KEY_CREATED_WITH = "createdWith";
  private static final String KEY_EXPIRES_AT = "expiresAt";
  private static final String KEY_INSTALLATION_ID = "installationId";
  private static final String KEY_RESTRICTED = "restricted";
  private static final String KEY_SESSION_TOKEN = "sessionToken";
  private static final String KEY_USER = "user";
  private static final List<String> READ_ONLY_KEYS = Collections.unmodifiableList(Arrays.asList(new String[] { "sessionToken", "createdWith", "restricted", "user", "expiresAt", "installationId" }));
  
  public static o<ParseSession> getCurrentSessionInBackground()
  {
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseSession.1());
  }
  
  public static void getCurrentSessionInBackground(GetCallback<ParseSession> paramGetCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(getCurrentSessionInBackground(), paramGetCallback);
  }
  
  public static ParseQuery<ParseSession> getQuery()
  {
    return ParseQuery.getQuery(ParseSession.class);
  }
  
  private static ParseSessionController getSessionController()
  {
    return ParseCorePlugins.getInstance().getSessionController();
  }
  
  static boolean isRevocableSessionToken(String paramString)
  {
    return paramString.contains("r:");
  }
  
  static o<Void> revokeAsync(String paramString)
  {
    if ((paramString == null) || (!isRevocableSessionToken(paramString))) {
      return o.a(null);
    }
    return getSessionController().revokeAsync(paramString);
  }
  
  static o<String> upgradeToRevocableSessionAsync(String paramString)
  {
    if ((paramString == null) || (isRevocableSessionToken(paramString))) {
      return o.a(paramString);
    }
    return getSessionController().upgradeToRevocable(paramString).c(new ParseSession.2());
  }
  
  public String getSessionToken()
  {
    return getString("sessionToken");
  }
  
  boolean isKeyMutable(String paramString)
  {
    return !READ_ONLY_KEYS.contains(paramString);
  }
  
  boolean needsDefaultACL()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */