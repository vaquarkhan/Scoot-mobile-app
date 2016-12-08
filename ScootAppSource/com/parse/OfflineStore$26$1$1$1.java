package com.parse;

import a.m;
import a.o;

class OfflineStore$26$1$1$1
  implements m<Void, o<Void>>
{
  OfflineStore$26$1$1$1(OfflineStore.26.1.1 param1) {}
  
  public o<Void> then(o<Void> paramo)
  {
    this.this$3.val$db.endTransactionAsync();
    this.this$3.val$db.closeAsync();
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$26$1$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */