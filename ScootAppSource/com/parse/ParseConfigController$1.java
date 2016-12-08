package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class ParseConfigController$1
  implements m<JSONObject, o<ParseConfig>>
{
  ParseConfigController$1(ParseConfigController paramParseConfigController) {}
  
  public o<ParseConfig> then(o<JSONObject> paramo)
  {
    paramo = ParseConfig.decode((JSONObject)paramo.f(), ParseDecoder.get());
    return ParseConfigController.access$000(this.this$0).setCurrentConfigAsync(paramo).a(new ParseConfigController.1.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseConfigController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */