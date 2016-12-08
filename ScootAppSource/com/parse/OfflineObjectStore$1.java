package com.parse;

import a.m;
import a.o;
import java.util.Arrays;

final class OfflineObjectStore$1
  implements m<T, o<T>>
{
  OfflineObjectStore$1(ParseObjectStore paramParseObjectStore1, ParseObjectStore paramParseObjectStore2) {}
  
  public o<T> then(o<T> paramo)
  {
    ParseObject localParseObject = (ParseObject)paramo.f();
    if (localParseObject == null) {
      return paramo;
    }
    return o.a(Arrays.asList(new o[] { this.val$from.deleteAsync(), this.val$to.setAsync(localParseObject) })).a(new OfflineObjectStore.1.1(this, localParseObject));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineObjectStore$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */