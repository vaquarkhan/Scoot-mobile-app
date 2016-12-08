package com.parse;

import a.o;

abstract interface ParseCurrentUserController
  extends ParseObjectCurrentController<ParseUser>
{
  public abstract o<ParseUser> getAsync(boolean paramBoolean);
  
  public abstract o<String> getCurrentSessionTokenAsync();
  
  public abstract o<Void> logOutAsync();
  
  public abstract o<Void> setIfNeededAsync(ParseUser paramParseUser);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCurrentUserController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */