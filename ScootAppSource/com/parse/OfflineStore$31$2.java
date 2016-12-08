package com.parse;

import a.m;
import a.o;

class OfflineStore$31$2
  implements m<ParseObject, o<ParsePin>>
{
  OfflineStore$31$2(OfflineStore.31 param31) {}
  
  public o<ParsePin> then(o<ParseObject> paramo)
  {
    paramo = (ParsePin)paramo.f();
    return this.this$1.this$0.fetchLocallyAsync(paramo, this.this$1.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$31$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */