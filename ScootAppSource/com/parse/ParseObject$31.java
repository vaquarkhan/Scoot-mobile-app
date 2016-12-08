package com.parse;

import a.m;
import a.o;

class ParseObject$31
  implements m<Void, o<Void>>
{
  ParseObject$31(ParseObject paramParseObject, OfflineStore paramOfflineStore) {}
  
  public o<Void> then(o<Void> arg1)
  {
    synchronized (this.this$0.mutex)
    {
      if (this.this$0.isDeleted)
      {
        this.val$store.unregisterObject(this.this$0);
        localo = this.val$store.deleteDataForObjectAsync(this.this$0);
        return localo;
      }
      o localo = this.val$store.updateDataForObjectAsync(this.this$0);
      return localo;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */