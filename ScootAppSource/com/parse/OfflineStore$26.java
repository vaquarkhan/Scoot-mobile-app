package com.parse;

import a.m;
import a.o;

class OfflineStore$26
  implements m<ParseObject, o<Void>>
{
  OfflineStore$26(OfflineStore paramOfflineStore, ParseObject paramParseObject) {}
  
  public o<Void> then(o<ParseObject> paramo)
  {
    if (paramo.e())
    {
      if (((paramo.g() instanceof ParseException)) && (((ParseException)paramo.g()).getCode() == 120)) {
        return o.a(null);
      }
      return paramo.k();
    }
    return OfflineStore.access$1300(this.this$0).getWritableDatabaseAsync().b(new OfflineStore.26.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$26.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */