package com.parse;

import java.util.concurrent.Callable;

class ParseCurrentConfigController$1
  implements Callable<Void>
{
  ParseCurrentConfigController$1(ParseCurrentConfigController paramParseCurrentConfigController, ParseConfig paramParseConfig) {}
  
  public Void call()
  {
    synchronized (ParseCurrentConfigController.access$000(this.this$0))
    {
      this.this$0.currentConfig = this.val$config;
      this.this$0.saveToDisk(this.val$config);
      return null;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCurrentConfigController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */