package com.parse;

import a.o;

abstract interface ParseSessionController
{
  public abstract o<ParseObject.State> getSessionAsync(String paramString);
  
  public abstract o<Void> revokeAsync(String paramString);
  
  public abstract o<ParseObject.State> upgradeToRevocable(String paramString);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSessionController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */