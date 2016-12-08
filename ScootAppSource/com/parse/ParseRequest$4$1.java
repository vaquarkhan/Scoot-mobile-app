package com.parse;

import a.ac;
import a.o;

class ParseRequest$4$1
  implements Runnable
{
  ParseRequest$4$1(ParseRequest.4 param4, ac paramac) {}
  
  public void run()
  {
    ParseRequest.access$100(this.this$1.this$0, this.this$1.val$client, this.this$1.val$request, this.this$1.val$attemptsMade + 1, this.this$1.val$delay * 2L, this.this$1.val$downloadProgressCallback, this.this$1.val$cancellationToken).b(new ParseRequest.4.1.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */