package com.parse;

import a.m;
import a.o;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

class ParseFileController$2
  implements m<JSONObject, ParseFile.State>
{
  ParseFileController$2(ParseFileController paramParseFileController, ParseFile.State paramState, File paramFile) {}
  
  public ParseFile.State then(o<JSONObject> paramo)
  {
    paramo = (JSONObject)paramo.f();
    paramo = new ParseFile.State.Builder(this.val$state).name(paramo.getString("name")).url(paramo.getString("url")).build();
    try
    {
      ParseFileUtils.copyFile(this.val$file, this.this$0.getCacheFile(paramo));
      return paramo;
    }
    catch (IOException localIOException) {}
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFileController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */