package com.parse;

import a.o;
import java.util.HashMap;
import java.util.Map;

class ParseAuthenticationManager
{
  private final Map<String, AuthenticationCallback> callbacks = new HashMap();
  private final ParseCurrentUserController controller;
  private final Object lock = new Object();
  
  public ParseAuthenticationManager(ParseCurrentUserController paramParseCurrentUserController)
  {
    this.controller = paramParseCurrentUserController;
  }
  
  public o<Void> deauthenticateAsync(String paramString)
  {
    synchronized (this.lock)
    {
      paramString = (AuthenticationCallback)this.callbacks.get(paramString);
      if (paramString != null) {
        return o.a(new ParseAuthenticationManager.3(this, paramString), ParseExecutors.io());
      }
    }
    return o.a(null);
  }
  
  public void register(String paramString, AuthenticationCallback paramAuthenticationCallback)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Invalid authType: " + null);
    }
    synchronized (this.lock)
    {
      if (this.callbacks.containsKey(paramString)) {
        throw new IllegalStateException("Callback already registered for <" + paramString + ">: " + this.callbacks.get(paramString));
      }
    }
    this.callbacks.put(paramString, paramAuthenticationCallback);
    if ("anonymous".equals(paramString)) {
      return;
    }
    this.controller.getAsync(false).d(new ParseAuthenticationManager.1(this, paramString));
  }
  
  public o<Boolean> restoreAuthenticationAsync(String paramString, Map<String, String> paramMap)
  {
    synchronized (this.lock)
    {
      paramString = (AuthenticationCallback)this.callbacks.get(paramString);
      if (paramString == null) {
        return o.a(Boolean.valueOf(true));
      }
    }
    return o.a(new ParseAuthenticationManager.2(this, paramString, paramMap), ParseExecutors.io());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAuthenticationManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */