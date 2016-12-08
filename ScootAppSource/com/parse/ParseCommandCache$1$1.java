package com.parse;

import java.util.concurrent.Callable;

class ParseCommandCache$1$1
  implements Callable<Void>
{
  ParseCommandCache$1$1(ParseCommandCache.1 param1, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public Void call()
  {
    if (this.val$connectionLost) {
      this.this$1.this$0.setConnected(false);
    }
    for (;;)
    {
      return null;
      this.this$1.this$0.setConnected(this.val$isConnected);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCommandCache$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */