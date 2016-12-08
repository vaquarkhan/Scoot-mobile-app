package com.parse;

import a.o;
import java.util.Map;

abstract interface ParseUserController
{
  public abstract o<ParseUser.State> getUserAsync(String paramString);
  
  public abstract o<ParseUser.State> logInAsync(ParseUser.State paramState, ParseOperationSet paramParseOperationSet);
  
  public abstract o<ParseUser.State> logInAsync(String paramString1, String paramString2);
  
  public abstract o<ParseUser.State> logInAsync(String paramString, Map<String, String> paramMap);
  
  public abstract o<Void> requestPasswordResetAsync(String paramString);
  
  public abstract o<ParseUser.State> signUpAsync(ParseObject.State paramState, ParseOperationSet paramParseOperationSet, String paramString);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUserController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */