package com.parse;

import a.o;
import java.util.Map;

class CachedCurrentUserController
  implements ParseCurrentUserController
{
  ParseUser currentUser;
  boolean currentUserMatchesDisk = false;
  private final Object mutex = new Object();
  private final ParseObjectStore<ParseUser> store;
  private final TaskQueue taskQueue = new TaskQueue();
  
  public CachedCurrentUserController(ParseObjectStore<ParseUser> paramParseObjectStore)
  {
    this.store = paramParseObjectStore;
  }
  
  private ParseUser lazyLogIn()
  {
    return lazyLogIn("anonymous", ParseAnonymousUtils.getAuthData());
  }
  
  public void clearFromDisk()
  {
    synchronized (this.mutex)
    {
      this.currentUser = null;
      this.currentUserMatchesDisk = false;
    }
  }
  
  public void clearFromMemory()
  {
    synchronized (this.mutex)
    {
      this.currentUser = null;
      this.currentUserMatchesDisk = false;
      return;
    }
  }
  
  public o<Boolean> existsAsync()
  {
    synchronized (this.mutex)
    {
      if (this.currentUser != null)
      {
        o localo = o.a(Boolean.valueOf(true));
        return localo;
      }
      return this.taskQueue.enqueue(new CachedCurrentUserController.2(this));
    }
  }
  
  public o<ParseUser> getAsync()
  {
    return getAsync(ParseUser.isAutomaticUserEnabled());
  }
  
  public o<ParseUser> getAsync(boolean paramBoolean)
  {
    synchronized (this.mutex)
    {
      if (this.currentUser != null)
      {
        o localo = o.a(this.currentUser);
        return localo;
      }
      return this.taskQueue.enqueue(new CachedCurrentUserController.5(this, paramBoolean));
    }
  }
  
  public o<String> getCurrentSessionTokenAsync()
  {
    return getAsync(false).c(new CachedCurrentUserController.3(this));
  }
  
  public boolean isCurrent(ParseUser paramParseUser)
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if (this.currentUser == paramParseUser)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  ParseUser lazyLogIn(String arg1, Map<String, String> paramMap)
  {
    ParseUser localParseUser = (ParseUser)ParseObject.create(ParseUser.class);
    synchronized (localParseUser.mutex)
    {
      localParseUser.setIsCurrentUser(true);
      localParseUser.putAuthData(???, paramMap);
    }
    synchronized (this.mutex)
    {
      this.currentUserMatchesDisk = false;
      this.currentUser = localParseUser;
      return localParseUser;
      ??? = finally;
      throw ???;
    }
  }
  
  public o<Void> logOutAsync()
  {
    return this.taskQueue.enqueue(new CachedCurrentUserController.4(this));
  }
  
  public o<Void> setAsync(ParseUser paramParseUser)
  {
    return this.taskQueue.enqueue(new CachedCurrentUserController.1(this, paramParseUser));
  }
  
  public o<Void> setIfNeededAsync(ParseUser paramParseUser)
  {
    synchronized (this.mutex)
    {
      if ((!paramParseUser.isCurrentUser()) || (this.currentUserMatchesDisk))
      {
        paramParseUser = o.a(null);
        return paramParseUser;
      }
      return setAsync(paramParseUser);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */