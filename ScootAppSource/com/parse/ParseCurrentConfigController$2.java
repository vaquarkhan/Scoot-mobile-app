package com.parse;

import java.util.concurrent.Callable;

class ParseCurrentConfigController$2
  implements Callable<ParseConfig>
{
  ParseCurrentConfigController$2(ParseCurrentConfigController paramParseCurrentConfigController) {}
  
  public ParseConfig call()
  {
    synchronized (ParseCurrentConfigController.access$000(this.this$0))
    {
      if (this.this$0.currentConfig == null)
      {
        localParseConfig = this.this$0.getFromDisk();
        ParseCurrentConfigController localParseCurrentConfigController = this.this$0;
        if (localParseConfig != null) {
          localParseCurrentConfigController.currentConfig = localParseConfig;
        }
      }
      else
      {
        return this.this$0.currentConfig;
      }
      ParseConfig localParseConfig = new ParseConfig();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCurrentConfigController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */