package com.parse;

import a.m;
import a.o;
import java.io.IOException;
import org.json.JSONObject;

class ParseFileController$1
  implements m<JSONObject, ParseFile.State>
{
  ParseFileController$1(ParseFileController paramParseFileController, ParseFile.State paramState, byte[] paramArrayOfByte) {}
  
  public ParseFile.State then(o<JSONObject> paramo)
  {
    paramo = (JSONObject)paramo.f();
    paramo = new ParseFile.State.Builder(this.val$state).name(paramo.getString("name")).url(paramo.getString("url")).build();
    try
    {
      ParseFileUtils.writeByteArrayToFile(this.this$0.getCacheFile(paramo), this.val$data);
      return paramo;
    }
    catch (IOException localIOException) {}
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFileController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */