package com.parse;

import a.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

@ParseClassName("_User")
public class ParseUser
  extends ParseObject
{
  private static final String KEY_AUTH_DATA = "authData";
  private static final String KEY_EMAIL = "email";
  private static final String KEY_PASSWORD = "password";
  private static final String KEY_SESSION_TOKEN = "sessionToken";
  private static final String KEY_USERNAME = "username";
  private static final List<String> READ_ONLY_KEYS = Collections.unmodifiableList(Arrays.asList(new String[] { "sessionToken", "authData" }));
  private static boolean autoUserEnabled;
  private static final Object isAutoUserEnabledMutex = new Object();
  private boolean isCurrentUser = false;
  
  public static ParseUser become(String paramString)
  {
    return (ParseUser)ParseTaskUtils.wait(becomeInBackground(paramString));
  }
  
  public static o<ParseUser> becomeInBackground(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Must specify a sessionToken for the user to log in with");
    }
    return getUserController().getUserAsync(paramString).d(new ParseUser.10());
  }
  
  public static void becomeInBackground(String paramString, LogInCallback paramLogInCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(becomeInBackground(paramString), paramLogInCallback);
  }
  
  static void disableAutomaticUser()
  {
    synchronized (isAutoUserEnabledMutex)
    {
      autoUserEnabled = false;
      return;
    }
  }
  
  public static void enableAutomaticUser()
  {
    synchronized (isAutoUserEnabledMutex)
    {
      autoUserEnabled = true;
      return;
    }
  }
  
  public static o<Void> enableRevocableSessionInBackground()
  {
    ParseCorePlugins.getInstance().registerUserController(new NetworkUserController(ParsePlugins.get().restClient(), true));
    return getCurrentUserController().getAsync(false).d(new ParseUser.17());
  }
  
  private Map<String, String> getAuthData(String paramString)
  {
    return (Map)getAuthData().get(paramString);
  }
  
  static ParseAuthenticationManager getAuthenticationManager()
  {
    return ParseCorePlugins.getInstance().getAuthenticationManager();
  }
  
  static String getCurrentSessionToken()
  {
    ParseUser localParseUser = getCurrentUser();
    if (localParseUser != null) {
      return localParseUser.getSessionToken();
    }
    return null;
  }
  
  static o<String> getCurrentSessionTokenAsync()
  {
    return getCurrentUserController().getCurrentSessionTokenAsync();
  }
  
  public static ParseUser getCurrentUser()
  {
    return getCurrentUser(isAutomaticUserEnabled());
  }
  
  private static ParseUser getCurrentUser(boolean paramBoolean)
  {
    try
    {
      ParseUser localParseUser = (ParseUser)ParseTaskUtils.wait(getCurrentUserController().getAsync(paramBoolean));
      return localParseUser;
    }
    catch (ParseException localParseException) {}
    return null;
  }
  
  static o<ParseUser> getCurrentUserAsync()
  {
    return getCurrentUserController().getAsync();
  }
  
  static ParseCurrentUserController getCurrentUserController()
  {
    return ParseCorePlugins.getInstance().getCurrentUserController();
  }
  
  public static ParseQuery<ParseUser> getQuery()
  {
    return ParseQuery.getQuery(ParseUser.class);
  }
  
  static ParseUserController getUserController()
  {
    return ParseCorePlugins.getInstance().getUserController();
  }
  
  static boolean isAutomaticUserEnabled()
  {
    synchronized (isAutoUserEnabledMutex)
    {
      boolean bool = autoUserEnabled;
      return bool;
    }
  }
  
  private o<Void> linkWithAsync(String paramString1, Map<String, String> paramMap, o<Void> paramo, String paramString2)
  {
    synchronized (this.mutex)
    {
      boolean bool = isLazy();
      Map localMap = getAuthData("anonymous");
      stripAnonymity();
      putAuthData(paramString1, paramMap);
      paramString1 = saveAsync(paramString2, bool, paramo).b(new ParseUser.14(this, localMap, paramString1));
      return paramString1;
    }
  }
  
  private o<Void> linkWithAsync(String paramString1, Map<String, String> paramMap, String paramString2)
  {
    return this.taskQueue.enqueue(new ParseUser.15(this, paramString1, paramMap, paramString2));
  }
  
  public static ParseUser logIn(String paramString1, String paramString2)
  {
    return (ParseUser)ParseTaskUtils.wait(logInInBackground(paramString1, paramString2));
  }
  
  public static o<ParseUser> logInInBackground(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Must specify a username for the user to log in with");
    }
    if (paramString2 == null) {
      throw new IllegalArgumentException("Must specify a password for the user to log in with");
    }
    return getUserController().logInAsync(paramString1, paramString2).d(new ParseUser.9());
  }
  
  public static void logInInBackground(String paramString1, String paramString2, LogInCallback paramLogInCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(logInInBackground(paramString1, paramString2), paramLogInCallback);
  }
  
  public static o<ParseUser> logInWithInBackground(String paramString, Map<String, String> paramMap)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Invalid authType: " + null);
    }
    ParseUser.11 local11 = new ParseUser.11(paramString, paramMap);
    return getCurrentUserController().getAsync(false).d(new ParseUser.12(paramString, paramMap, local11));
  }
  
  public static void logOut()
  {
    try
    {
      ParseTaskUtils.wait(logOutInBackground());
      return;
    }
    catch (ParseException localParseException) {}
  }
  
  public static o<Void> logOutInBackground()
  {
    return getCurrentUserController().logOutAsync();
  }
  
  public static void logOutInBackground(LogOutCallback paramLogOutCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(logOutInBackground(), paramLogOutCallback);
  }
  
  static o<Void> pinCurrentUserIfNeededAsync(ParseUser paramParseUser)
  {
    if (!Parse.isLocalDatastoreEnabled()) {
      throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }
    return getCurrentUserController().setIfNeededAsync(paramParseUser);
  }
  
  public static void registerAuthenticationCallback(String paramString, AuthenticationCallback paramAuthenticationCallback)
  {
    getAuthenticationManager().register(paramString, paramAuthenticationCallback);
  }
  
  private void removeAuthData(String paramString)
  {
    synchronized (this.mutex)
    {
      Map localMap = getAuthData();
      localMap.remove(paramString);
      performPut("authData", localMap);
      return;
    }
  }
  
  public static void requestPasswordReset(String paramString)
  {
    ParseTaskUtils.wait(requestPasswordResetInBackground(paramString));
  }
  
  public static o<Void> requestPasswordResetInBackground(String paramString)
  {
    return getUserController().requestPasswordResetAsync(paramString);
  }
  
  public static void requestPasswordResetInBackground(String paramString, RequestPasswordResetCallback paramRequestPasswordResetCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(requestPasswordResetInBackground(paramString), paramRequestPasswordResetCallback);
  }
  
  private void restoreAnonymity(Map<String, String> paramMap)
  {
    Object localObject = this.mutex;
    if (paramMap != null) {}
    try
    {
      putAuthData("anonymous", paramMap);
      return;
    }
    finally {}
  }
  
  private static o<Void> saveCurrentUserAsync(ParseUser paramParseUser)
  {
    return getCurrentUserController().setAsync(paramParseUser);
  }
  
  private o<Void> setSessionTokenInBackground(String paramString)
  {
    synchronized (this.mutex)
    {
      ParseUser.State localState = getState();
      if (paramString.equals(localState.sessionToken()))
      {
        paramString = o.a(null);
        return paramString;
      }
      setState(localState.newBuilder().sessionToken(paramString).build());
      paramString = saveCurrentUserAsync(this);
      return paramString;
    }
  }
  
  private void stripAnonymity()
  {
    synchronized (this.mutex)
    {
      if (ParseAnonymousUtils.isLinked(this))
      {
        if (getObjectId() != null) {
          putAuthData("anonymous", null);
        }
      }
      else {
        return;
      }
      removeAuthData("anonymous");
    }
  }
  
  private o<Void> synchronizeAuthDataAsync(ParseAuthenticationManager paramParseAuthenticationManager, String paramString, Map<String, String> paramMap)
  {
    return paramParseAuthenticationManager.restoreAuthenticationAsync(paramString, paramMap).b(new ParseUser.13(this, paramString));
  }
  
  private o<Void> upgradeToRevocableSessionAsync(o<Void> paramo)
  {
    return paramo.b(new ParseUser.20(this, getSessionToken())).d(new ParseUser.19(this));
  }
  
  o<Void> cleanUpAuthDataAsync()
  {
    Object localObject1 = getAuthenticationManager();
    Map localMap;
    synchronized (this.mutex)
    {
      localMap = getState().authData();
      if (localMap.size() == 0)
      {
        localObject1 = o.a(null);
        return (o<Void>)localObject1;
      }
      ??? = new ArrayList();
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (localEntry.getValue() == null)
        {
          localIterator.remove();
          ((List)???).add(((ParseAuthenticationManager)localObject1).restoreAuthenticationAsync((String)localEntry.getKey(), null).k());
        }
      }
    }
    setState(getState().newBuilder().authData(localMap).build());
    return o.a((Collection)???);
  }
  
  public ParseUser fetch()
  {
    return (ParseUser)super.fetch();
  }
  
  <T extends ParseObject> o<T> fetchAsync(String paramString, o<Void> paramo)
  {
    if (isLazy()) {
      paramString = o.a(this);
    }
    do
    {
      return paramString;
      paramo = super.fetchAsync(paramString, paramo);
      paramString = paramo;
    } while (!isCurrentUser());
    return paramo.d(new ParseUser.5(this)).d(new ParseUser.4(this)).c(new ParseUser.3(this));
  }
  
  <T extends ParseObject> o<T> fetchFromLocalDatastoreAsync()
  {
    if (isLazy()) {
      return o.a(this);
    }
    return super.fetchFromLocalDatastoreAsync();
  }
  
  public ParseUser fetchIfNeeded()
  {
    return (ParseUser)super.fetchIfNeeded();
  }
  
  Map<String, Map<String, String>> getAuthData()
  {
    synchronized (this.mutex)
    {
      Map localMap = getMap("authData");
      Object localObject1 = localMap;
      if (localMap == null) {
        localObject1 = new HashMap();
      }
      return (Map<String, Map<String, String>>)localObject1;
    }
  }
  
  public String getEmail()
  {
    return getString("email");
  }
  
  String getPassword()
  {
    return getString("password");
  }
  
  public String getSessionToken()
  {
    return getState().sessionToken();
  }
  
  ParseUser.State getState()
  {
    return (ParseUser.State)super.getState();
  }
  
  public String getUsername()
  {
    return getString("username");
  }
  
  o<Void> handleSaveResultAsync(ParseObject.State paramState, ParseOperationSet paramParseOperationSet)
  {
    if (paramState != null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        paramParseOperationSet.remove("password");
      }
      return super.handleSaveResultAsync(paramState, paramParseOperationSet);
    }
  }
  
  public boolean isAuthenticated()
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        ParseUser localParseUser = getCurrentUser();
        if (!isLazy())
        {
          if ((getState().sessionToken() == null) || (localParseUser == null) || (!getObjectId().equals(localParseUser.getObjectId()))) {
            break label63;
          }
          break label58;
          return bool;
        }
      }
      label58:
      boolean bool = true;
      continue;
      label63:
      bool = false;
    }
  }
  
  boolean isCurrentUser()
  {
    synchronized (this.mutex)
    {
      boolean bool = this.isCurrentUser;
      return bool;
    }
  }
  
  boolean isKeyMutable(String paramString)
  {
    return !READ_ONLY_KEYS.contains(paramString);
  }
  
  boolean isLazy()
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if ((getObjectId() == null) && (ParseAnonymousUtils.isLinked(this)))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean isLinked(String paramString)
  {
    Map localMap = getAuthData();
    return (localMap.containsKey(paramString)) && (localMap.get(paramString) != null);
  }
  
  public boolean isNew()
  {
    return getState().isNew();
  }
  
  public o<Void> linkWithInBackground(String paramString, Map<String, String> paramMap)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Invalid authType: " + null);
    }
    return linkWithAsync(paramString, paramMap, getSessionToken());
  }
  
  o<Void> logOutAsync()
  {
    return logOutAsync(true);
  }
  
  o<Void> logOutAsync(boolean paramBoolean)
  {
    Object localObject2 = getAuthenticationManager();
    ArrayList localArrayList = new ArrayList();
    String str;
    synchronized (this.mutex)
    {
      str = getState().sessionToken();
      Iterator localIterator = getAuthData().entrySet().iterator();
      if (localIterator.hasNext()) {
        localArrayList.add(((ParseAuthenticationManager)localObject2).deauthenticateAsync((String)((Map.Entry)localIterator.next()).getKey()));
      }
    }
    localObject2 = getState().newBuilder().sessionToken(null).isNew(false).build();
    this.isCurrentUser = false;
    setState((ParseObject.State)localObject2);
    if (paramBoolean) {
      localCollection.add(ParseSession.revokeAsync(str));
    }
    return o.a(localCollection);
  }
  
  boolean needsDefaultACL()
  {
    return false;
  }
  
  ParseUser.State.Builder newStateBuilder(String paramString)
  {
    return new ParseUser.State.Builder();
  }
  
  public void put(String paramString, Object paramObject)
  {
    synchronized (this.mutex)
    {
      if ("username".equals(paramString)) {
        stripAnonymity();
      }
      super.put(paramString, paramObject);
      return;
    }
  }
  
  void putAuthData(String paramString, Map<String, String> paramMap)
  {
    synchronized (this.mutex)
    {
      Map localMap = getAuthData();
      localMap.put(paramString, paramMap);
      performPut("authData", localMap);
      return;
    }
  }
  
  public void remove(String paramString)
  {
    if ("username".equals(paramString)) {
      throw new IllegalArgumentException("Can't remove the username key.");
    }
    super.remove(paramString);
  }
  
  o<Void> resolveLazinessAsync(o<Void> paramo)
  {
    synchronized (this.mutex)
    {
      if (getAuthData().size() == 0)
      {
        paramo = signUpAsync(paramo);
        return paramo;
      }
      paramo = paramo.d(new ParseUser.16(this, startSave()));
      return paramo;
    }
  }
  
  o<Void> saveAsync(String paramString, o<Void> paramo)
  {
    return saveAsync(paramString, isLazy(), paramo);
  }
  
  o<Void> saveAsync(String paramString, boolean paramBoolean, o<Void> paramo)
  {
    if (paramBoolean) {}
    for (paramString = resolveLazinessAsync(paramo);; paramString = super.saveAsync(paramString, paramo))
    {
      paramo = paramString;
      if (isCurrentUser()) {
        paramo = paramString.d(new ParseUser.2(this)).d(new ParseUser.1(this));
      }
      return paramo;
    }
  }
  
  public void setEmail(String paramString)
  {
    put("email", paramString);
  }
  
  void setIsCurrentUser(boolean paramBoolean)
  {
    synchronized (this.mutex)
    {
      this.isCurrentUser = paramBoolean;
      return;
    }
  }
  
  public void setPassword(String paramString)
  {
    put("password", paramString);
  }
  
  void setState(ParseObject.State paramState)
  {
    Object localObject = paramState;
    if (isCurrentUser())
    {
      localObject = (ParseUser.State.Builder)paramState.newBuilder();
      if ((getSessionToken() != null) && (paramState.get("sessionToken") == null)) {
        ((ParseUser.State.Builder)localObject).put("sessionToken", getSessionToken());
      }
      if ((getAuthData().size() > 0) && (paramState.get("authData") == null)) {
        ((ParseUser.State.Builder)localObject).put("authData", getAuthData());
      }
      localObject = ((ParseUser.State.Builder)localObject).build();
    }
    super.setState((ParseObject.State)localObject);
  }
  
  public void setUsername(String paramString)
  {
    put("username", paramString);
  }
  
  public void signUp()
  {
    ParseTaskUtils.wait(signUpInBackground());
  }
  
  o<Void> signUpAsync(o<Void> paramo)
  {
    Object localObject2 = getCurrentUser();
    Object localObject1 = this.mutex;
    if (localObject2 != null) {}
    for (;;)
    {
      try
      {
        str1 = ((ParseUser)localObject2).getSessionToken();
        if (ParseTextUtils.isEmpty(getUsername()))
        {
          paramo = o.a(new IllegalArgumentException("Username cannot be missing or blank"));
          return paramo;
        }
        if (ParseTextUtils.isEmpty(getPassword()))
        {
          paramo = o.a(new IllegalArgumentException("Password cannot be missing or blank"));
          return paramo;
        }
      }
      finally {}
      if (getObjectId() != null)
      {
        localObject2 = getAuthData();
        if ((((Map)localObject2).containsKey("anonymous")) && (((Map)localObject2).get("anonymous") == null))
        {
          paramo = saveAsync(str1, paramo);
          return paramo;
        }
        paramo = o.a(new IllegalArgumentException("Cannot sign up a user that has already signed up."));
        return paramo;
      }
      if (this.operationSetQueue.size() > 1)
      {
        paramo = o.a(new IllegalArgumentException("Cannot sign up a user that is already signing up."));
        return paramo;
      }
      if ((localObject2 != null) && (ParseAnonymousUtils.isLinked((ParseUser)localObject2)))
      {
        if (this == localObject2)
        {
          paramo = o.a(new IllegalArgumentException("Attempt to merge currentUser with itself."));
          return paramo;
        }
        boolean bool = ((ParseUser)localObject2).isLazy();
        String str2 = ((ParseUser)localObject2).getUsername();
        String str3 = ((ParseUser)localObject2).getPassword();
        Map localMap = ((ParseUser)localObject2).getAuthData("anonymous");
        ((ParseUser)localObject2).copyChangesFrom(this);
        ((ParseUser)localObject2).setUsername(getUsername());
        ((ParseUser)localObject2).setPassword(getPassword());
        revert();
        paramo = ((ParseUser)localObject2).saveAsync(str1, bool, paramo).b(new ParseUser.7(this, (ParseUser)localObject2, str2, str3, localMap));
        return paramo;
      }
      paramo = paramo.d(new ParseUser.8(this, startSave(), str1));
      return paramo;
      String str1 = null;
    }
  }
  
  public o<Void> signUpInBackground()
  {
    return this.taskQueue.enqueue(new ParseUser.6(this));
  }
  
  public void signUpInBackground(SignUpCallback paramSignUpCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(signUpInBackground(), paramSignUpCallback);
  }
  
  o<Void> synchronizeAllAuthDataAsync()
  {
    synchronized (this.mutex)
    {
      if (!isCurrentUser())
      {
        localObject2 = o.a(null);
        return (o<Void>)localObject2;
      }
      Object localObject2 = getAuthData();
      ??? = new ArrayList(((Map)localObject2).size());
      localObject2 = ((Map)localObject2).keySet().iterator();
      if (((Iterator)localObject2).hasNext()) {
        ((List)???).add(synchronizeAuthDataAsync((String)((Iterator)localObject2).next()));
      }
    }
    return o.a((Collection)???);
  }
  
  o<Void> synchronizeAuthDataAsync(String paramString)
  {
    synchronized (this.mutex)
    {
      if (!isCurrentUser())
      {
        paramString = o.a(null);
        return paramString;
      }
      Map localMap = getAuthData(paramString);
      return synchronizeAuthDataAsync(getAuthenticationManager(), paramString, localMap);
    }
  }
  
  JSONObject toRest(ParseObject.State paramState, List<ParseOperationSet> paramList, ParseEncoder paramParseEncoder)
  {
    int i = 0;
    Object localObject2;
    for (Object localObject1 = paramList; i < paramList.size(); localObject1 = localObject2)
    {
      ParseOperationSet localParseOperationSet = (ParseOperationSet)paramList.get(i);
      localObject2 = localObject1;
      if (localParseOperationSet.containsKey("password"))
      {
        localObject2 = localObject1;
        if (localObject1 == paramList) {
          localObject2 = new LinkedList(paramList);
        }
        localObject1 = new ParseOperationSet(localParseOperationSet);
        ((ParseOperationSet)localObject1).remove("password");
        ((List)localObject2).set(i, localObject1);
      }
      i += 1;
    }
    return super.toRest(paramState, (List)localObject1, paramParseEncoder);
  }
  
  public o<Void> unlinkFromInBackground(String paramString)
  {
    if (paramString == null) {
      return o.a(null);
    }
    synchronized (this.mutex)
    {
      if (!getAuthData().containsKey(paramString))
      {
        paramString = o.a(null);
        return paramString;
      }
    }
    putAuthData(paramString, null);
    return saveInBackground();
  }
  
  o<Void> upgradeToRevocableSessionAsync()
  {
    return this.taskQueue.enqueue(new ParseUser.18(this));
  }
  
  void validateDelete()
  {
    synchronized (this.mutex)
    {
      super.validateDelete();
      if ((!isAuthenticated()) && (isDirty())) {
        throw new IllegalArgumentException("Cannot delete a ParseUser that is not authenticated.");
      }
    }
  }
  
  void validateSave()
  {
    synchronized (this.mutex)
    {
      if (getObjectId() == null) {
        throw new IllegalArgumentException("Cannot save a ParseUser until it has been signed up. Call signUp first.");
      }
    }
    if ((isAuthenticated()) || (!isDirty()) || (isCurrentUser())) {
      return;
    }
    if (!Parse.isLocalDatastoreEnabled())
    {
      ??? = getCurrentUser();
      if ((??? != null) && (getObjectId().equals(((ParseUser)???).getObjectId()))) {}
    }
    else
    {
      throw new IllegalArgumentException("Cannot save a ParseUser that is not authenticated.");
    }
  }
  
  void validateSaveEventually()
  {
    if (isDirty("password")) {
      throw new ParseException(-1, "Unable to saveEventually on a ParseUser with dirty password");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */