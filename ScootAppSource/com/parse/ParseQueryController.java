package com.parse;

import a.o;
import java.util.List;

abstract interface ParseQueryController
{
  public abstract <T extends ParseObject> o<Integer> countAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo);
  
  public abstract <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo);
  
  public abstract <T extends ParseObject> o<T> getFirstAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQueryController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */