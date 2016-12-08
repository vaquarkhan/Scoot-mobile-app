package com.parse;

import a.m;
import a.o;
import java.util.Map;

final class ParseCloud$1
  implements m<String, o<T>>
{
  ParseCloud$1(String paramString, Map paramMap) {}
  
  public o<T> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    return ParseCloud.getCloudCodeController().callFunctionInBackground(this.val$name, this.val$params, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCloud$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */