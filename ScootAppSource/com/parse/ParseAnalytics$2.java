package com.parse;

import a.m;
import a.o;
import java.util.Map;

final class ParseAnalytics$2
  implements m<String, o<Void>>
{
  ParseAnalytics$2(String paramString, Map paramMap) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    return ParseAnalytics.getAnalyticsController().trackEventInBackground(this.val$name, this.val$dimensionsCopy, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAnalytics$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */