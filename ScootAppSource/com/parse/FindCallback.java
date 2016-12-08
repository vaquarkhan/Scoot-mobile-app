package com.parse;

import java.util.List;

public abstract interface FindCallback<T extends ParseObject>
  extends ParseCallback2<List<T>, ParseException>
{
  public abstract void done(List<T> paramList, ParseException paramParseException);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\FindCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */