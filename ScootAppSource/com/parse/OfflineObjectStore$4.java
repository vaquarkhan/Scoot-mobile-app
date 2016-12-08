package com.parse;

import a.m;
import a.o;
import java.util.List;

class OfflineObjectStore$4
  implements m<List<T>, o<T>>
{
  OfflineObjectStore$4(OfflineObjectStore paramOfflineObjectStore) {}
  
  public o<T> then(o<List<T>> paramo)
  {
    paramo = (List)paramo.f();
    if (paramo != null)
    {
      if (paramo.size() == 1) {
        return o.a(paramo.get(0));
      }
      return ParseObject.unpinAllInBackground(OfflineObjectStore.access$000(this.this$0)).j();
    }
    return o.a(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineObjectStore$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */