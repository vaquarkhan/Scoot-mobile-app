package com.parse;

import a.o;
import java.util.Map;

public final class ParseCloud
{
  public static <T> T callFunction(String paramString, Map<String, ?> paramMap)
  {
    return (T)ParseTaskUtils.wait(callFunctionInBackground(paramString, paramMap));
  }
  
  public static <T> o<T> callFunctionInBackground(String paramString, Map<String, ?> paramMap)
  {
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseCloud.1(paramString, paramMap));
  }
  
  public static <T> void callFunctionInBackground(String paramString, Map<String, ?> paramMap, FunctionCallback<T> paramFunctionCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(callFunctionInBackground(paramString, paramMap), paramFunctionCallback);
  }
  
  static ParseCloudCodeController getCloudCodeController()
  {
    return ParseCorePlugins.getInstance().getCloudCodeController();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCloud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */