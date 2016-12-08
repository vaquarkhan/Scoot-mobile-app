package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class ParseObject$14
  implements m<JSONObject, o<Void>>
{
  ParseObject$14(ParseObject paramParseObject, ParseOperationSet paramParseOperationSet) {}
  
  public o<Void> then(o<JSONObject> paramo)
  {
    paramo = (JSONObject)paramo.f();
    return this.this$0.handleSaveEventuallyResultAsync(paramo, this.val$operationSet);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */