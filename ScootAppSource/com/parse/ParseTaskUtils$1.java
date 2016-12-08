package com.parse;

final class ParseTaskUtils$1
  implements ParseCallback2<Void, ParseException>
{
  ParseTaskUtils$1(ParseCallback1 paramParseCallback1) {}
  
  public void done(Void paramVoid, ParseException paramParseException)
  {
    this.val$callback.done(paramParseException);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseTaskUtils$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */