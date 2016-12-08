package com.parse;

import a.ac;
import a.m;
import a.o;

class ParseQuery$1
  implements m<TResult, o<TResult>>
{
  ParseQuery$1(ParseQuery paramParseQuery) {}
  
  public o<TResult> then(o<TResult> paramo)
  {
    synchronized (ParseQuery.access$1800(this.this$0))
    {
      ParseQuery.access$1902(this.this$0, false);
      if (ParseQuery.access$2000(this.this$0) != null) {
        ParseQuery.access$2000(this.this$0).a(null);
      }
      ParseQuery.access$2002(this.this$0, null);
      return paramo;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */