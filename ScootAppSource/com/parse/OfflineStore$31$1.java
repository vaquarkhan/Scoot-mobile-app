package com.parse;

import a.m;
import a.o;
import java.util.List;

class OfflineStore$31$1
  implements m<ParsePin, o<Void>>
{
  OfflineStore$31$1(OfflineStore.31 param31, String paramString) {}
  
  public o<Void> then(o<ParsePin> paramo)
  {
    ParsePin localParsePin = (ParsePin)paramo.f();
    List localList = localParsePin.getObjects();
    if ((localList == null) || (!localList.contains(this.this$1.val$object))) {
      return paramo.k();
    }
    localList.remove(this.this$1.val$object);
    if (localList.size() == 0) {
      return OfflineStore.access$1000(this.this$1.this$0, this.val$uuid, this.this$1.val$db);
    }
    localParsePin.setObjects(localList);
    return OfflineStore.access$1500(this.this$1.this$0, localParsePin, true, this.this$1.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$31$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */