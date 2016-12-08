package com.parse;

public abstract interface RefreshCallback
  extends ParseCallback2<ParseObject, ParseException>
{
  public abstract void done(ParseObject paramParseObject, ParseException paramParseException);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\RefreshCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */