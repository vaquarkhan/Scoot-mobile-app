package com.parse;

class ParseQuery$6
  implements ParseCallback2<Integer, ParseException>
{
  ParseQuery$6(ParseQuery paramParseQuery, CountCallback paramCountCallback) {}
  
  public void done(Integer paramInteger, ParseException paramParseException)
  {
    CountCallback localCountCallback = this.val$callback;
    if (paramParseException == null) {}
    for (int i = paramInteger.intValue();; i = -1)
    {
      localCountCallback.done(i, paramParseException);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */