package com.parse;

import a.m;
import a.o;
import java.util.List;

final class ParseObject$50
  implements m<Void, o<Void>>
{
  ParseObject$50(String paramString, List paramList, boolean paramBoolean) {}
  
  public o<Void> then(o<Void> paramo)
  {
    OfflineStore localOfflineStore = Parse.getLocalDatastore();
    if (this.val$name != null) {}
    for (paramo = this.val$name;; paramo = "_default") {
      return localOfflineStore.pinAllObjectsAsync(paramo, this.val$objects, this.val$includeAllChildren);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */