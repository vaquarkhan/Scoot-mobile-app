package com.parse;

import a.o;
import org.json.JSONException;
import org.json.JSONObject;

abstract class ParseEventuallyQueue
{
  private boolean isConnected;
  private ParseEventuallyQueue.TestHelper testHelper;
  
  public abstract void clear();
  
  protected ParseRESTCommand commandFromJSON(JSONObject paramJSONObject)
  {
    ParseRESTCommand localParseRESTCommand = null;
    if (ParseRESTCommand.isValidCommandJSONObject(paramJSONObject)) {
      localParseRESTCommand = ParseRESTCommand.fromJSONObject(paramJSONObject);
    }
    while (ParseRESTCommand.isValidOldFormatCommandJSONObject(paramJSONObject)) {
      return localParseRESTCommand;
    }
    throw new JSONException("Failed to load command from JSON.");
  }
  
  public abstract o<JSONObject> enqueueEventuallyAsync(ParseRESTCommand paramParseRESTCommand, ParseObject paramParseObject);
  
  void fakeObjectUpdate()
  {
    if (this.testHelper != null)
    {
      this.testHelper.notify(3);
      this.testHelper.notify(1);
      this.testHelper.notify(5);
    }
  }
  
  public ParseEventuallyQueue.TestHelper getTestHelper()
  {
    if (this.testHelper == null) {
      this.testHelper = new ParseEventuallyQueue.TestHelper(null);
    }
    return this.testHelper;
  }
  
  public boolean isConnected()
  {
    return this.isConnected;
  }
  
  protected void notifyTestHelper(int paramInt)
  {
    notifyTestHelper(paramInt, null);
  }
  
  protected void notifyTestHelper(int paramInt, Throwable paramThrowable)
  {
    if (this.testHelper != null) {
      this.testHelper.notify(paramInt, paramThrowable);
    }
  }
  
  public abstract void onDestroy();
  
  public abstract void pause();
  
  public abstract int pendingCount();
  
  public abstract void resume();
  
  public void setConnected(boolean paramBoolean)
  {
    this.isConnected = paramBoolean;
  }
  
  public void setMaxCacheSizeBytes(int paramInt) {}
  
  public void setTimeoutRetryWaitSeconds(double paramDouble) {}
  
  abstract void simulateReboot();
  
  o<JSONObject> waitForOperationSetAndEventuallyPin(ParseOperationSet paramParseOperationSet, EventuallyPin paramEventuallyPin)
  {
    return o.a(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseEventuallyQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */