package com.parse;

import a.o;

class CachedCurrentInstallationController
  implements ParseCurrentInstallationController
{
  static final String TAG = "com.parse.CachedCurrentInstallationController";
  ParseInstallation currentInstallation;
  private final InstallationId installationId;
  private final Object mutex = new Object();
  private final ParseObjectStore<ParseInstallation> store;
  private final TaskQueue taskQueue = new TaskQueue();
  
  public CachedCurrentInstallationController(ParseObjectStore<ParseInstallation> paramParseObjectStore, InstallationId paramInstallationId)
  {
    this.store = paramParseObjectStore;
    this.installationId = paramInstallationId;
  }
  
  public void clearFromDisk()
  {
    synchronized (this.mutex)
    {
      this.currentInstallation = null;
    }
    try
    {
      this.installationId.clear();
      ParseTaskUtils.wait(this.store.deleteAsync());
      return;
    }
    catch (ParseException localParseException) {}
    localObject2 = finally;
    throw ((Throwable)localObject2);
  }
  
  public void clearFromMemory()
  {
    synchronized (this.mutex)
    {
      this.currentInstallation = null;
      return;
    }
  }
  
  public o<Boolean> existsAsync()
  {
    synchronized (this.mutex)
    {
      if (this.currentInstallation != null)
      {
        o localo = o.a(Boolean.valueOf(true));
        return localo;
      }
      return this.taskQueue.enqueue(new CachedCurrentInstallationController.3(this));
    }
  }
  
  public o<ParseInstallation> getAsync()
  {
    synchronized (this.mutex)
    {
      if (this.currentInstallation != null)
      {
        o localo = o.a(this.currentInstallation);
        return localo;
      }
      return this.taskQueue.enqueue(new CachedCurrentInstallationController.2(this));
    }
  }
  
  public boolean isCurrent(ParseInstallation paramParseInstallation)
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if (this.currentInstallation == paramParseInstallation)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public o<Void> setAsync(ParseInstallation paramParseInstallation)
  {
    if (!isCurrent(paramParseInstallation)) {
      return o.a(null);
    }
    return this.taskQueue.enqueue(new CachedCurrentInstallationController.1(this, paramParseInstallation));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentInstallationController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */