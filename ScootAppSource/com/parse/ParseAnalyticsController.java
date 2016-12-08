package com.parse;

import a.o;
import java.util.Map;

class ParseAnalyticsController
{
  ParseEventuallyQueue eventuallyQueue;
  
  public ParseAnalyticsController(ParseEventuallyQueue paramParseEventuallyQueue)
  {
    this.eventuallyQueue = paramParseEventuallyQueue;
  }
  
  public o<Void> trackAppOpenedInBackground(String paramString1, String paramString2)
  {
    paramString1 = ParseRESTAnalyticsCommand.trackAppOpenedCommand(paramString1, paramString2);
    return this.eventuallyQueue.enqueueEventuallyAsync(paramString1, null).k();
  }
  
  public o<Void> trackEventInBackground(String paramString1, Map<String, String> paramMap, String paramString2)
  {
    paramString1 = ParseRESTAnalyticsCommand.trackEventCommand(paramString1, paramMap, paramString2);
    return this.eventuallyQueue.enqueueEventuallyAsync(paramString1, null).k();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAnalyticsController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */