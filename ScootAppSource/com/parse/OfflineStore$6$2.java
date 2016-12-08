package com.parse;

import a.l;
import a.m;
import a.o;

class OfflineStore$6$2
  implements m<T, o<Boolean>>
{
  OfflineStore$6$2(OfflineStore.6 param6, l paraml, OfflineQueryLogic.ConstraintMatcher paramConstraintMatcher) {}
  
  public o<Boolean> then(o<T> paramo)
  {
    if (!((ParseObject)this.val$object.a()).isDataAvailable()) {
      return o.a(Boolean.valueOf(false));
    }
    return this.val$matcher.matchesAsync((ParseObject)this.val$object.a(), this.this$1.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$6$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */