package com.parse;

import a.m;
import a.o;
import java.util.List;

class AbstractQueryController$1
  implements m<List<T>, T>
{
  AbstractQueryController$1(AbstractQueryController paramAbstractQueryController) {}
  
  public T then(o<List<T>> paramo)
  {
    if (paramo.e()) {
      throw paramo.g();
    }
    if ((paramo.f() != null) && (((List)paramo.f()).size() > 0)) {
      return (ParseObject)((List)paramo.f()).get(0);
    }
    throw new ParseException(101, "no results found for query");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\AbstractQueryController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */