package com.parse;

public abstract interface FunctionCallback<T>
  extends ParseCallback2<T, ParseException>
{
  public abstract void done(T paramT, ParseException paramParseException);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\FunctionCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */