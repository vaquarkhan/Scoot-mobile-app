package com.parse;

import a.ac;
import a.m;
import a.o;
import java.util.concurrent.Executor;

final class ParseTaskUtils$2
  implements m<T, Void>
{
  ParseTaskUtils$2(boolean paramBoolean, ac paramac, ParseCallback2 paramParseCallback2) {}
  
  public Void then(o<T> paramo)
  {
    if ((paramo.d()) && (!this.val$reportCancellation))
    {
      this.val$tcs.c();
      return null;
    }
    ParseExecutors.main().execute(new ParseTaskUtils.2.1(this, paramo));
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseTaskUtils$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */