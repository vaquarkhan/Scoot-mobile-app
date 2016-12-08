package com.parse;

import a.o;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ParseAnonymousUtils
{
  static final String AUTH_TYPE = "anonymous";
  
  static Map<String, String> getAuthData()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", UUID.randomUUID().toString());
    return localHashMap;
  }
  
  public static boolean isLinked(ParseUser paramParseUser)
  {
    return paramParseUser.isLinked("anonymous");
  }
  
  public static void logIn(LogInCallback paramLogInCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(logInInBackground(), paramLogInCallback);
  }
  
  public static o<ParseUser> logInInBackground()
  {
    return ParseUser.logInWithInBackground("anonymous", getAuthData());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAnonymousUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */