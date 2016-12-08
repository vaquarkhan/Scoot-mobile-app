package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class ParsePinningEventuallyQueue$13$1$2
  implements m<Void, o<Void>>
{
  ParsePinningEventuallyQueue$13$1$2(ParsePinningEventuallyQueue.13.1 param1, o paramo) {}
  
  public o<Void> then(o<Void> paramo)
  {
    Object localObject = (JSONObject)this.val$executeTask.f();
    if (this.this$2.val$type == 1) {
      localObject = this.this$2.val$object.handleSaveEventuallyResultAsync((JSONObject)localObject, this.this$2.this$1.val$operationSet);
    }
    do
    {
      do
      {
        return (o<Void>)localObject;
        localObject = paramo;
      } while (this.this$2.val$type != 2);
      localObject = paramo;
    } while (this.val$executeTask.e());
    return this.this$2.val$object.handleDeleteEventuallyResultAsync();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$13$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */