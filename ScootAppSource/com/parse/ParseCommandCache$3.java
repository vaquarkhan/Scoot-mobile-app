package com.parse;

import a.l;
import a.m;
import a.o;

class ParseCommandCache$3
  implements m<T, Void>
{
  ParseCommandCache$3(ParseCommandCache paramParseCommandCache, l paraml) {}
  
  public Void then(o<T> arg1)
  {
    this.val$finished.a(Boolean.valueOf(true));
    synchronized (ParseCommandCache.access$100())
    {
      ParseCommandCache.access$100().notifyAll();
      return null;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCommandCache$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */