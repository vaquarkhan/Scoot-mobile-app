package com.parse;

import a.o;
import java.util.Map;
import org.json.JSONObject;

class ParseCloudCodeController
{
  final ParseHttpClient restClient;
  
  public ParseCloudCodeController(ParseHttpClient paramParseHttpClient)
  {
    this.restClient = paramParseHttpClient;
  }
  
  public <T> o<T> callFunctionInBackground(String paramString1, Map<String, ?> paramMap, String paramString2)
  {
    return ParseRESTCloudCommand.callFunctionCommand(paramString1, paramMap, paramString2).executeAsync(this.restClient).c(new ParseCloudCodeController.1(this));
  }
  
  Object convertCloudResponse(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof JSONObject)) {
      localObject = ((JSONObject)paramObject).opt("result");
    }
    paramObject = ParseDecoder.get().decode(localObject);
    if (paramObject != null) {
      localObject = paramObject;
    }
    return localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCloudCodeController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */