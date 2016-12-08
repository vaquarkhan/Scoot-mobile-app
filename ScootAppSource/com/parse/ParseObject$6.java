package com.parse;

import a.m;
import a.o;

class ParseObject$6
  implements m<Void, Void>
{
  ParseObject$6(ParseObject paramParseObject, ParseObject.State paramState, ParseOperationSet paramParseOperationSet) {}
  
  public Void then(o<Void> paramo)
  {
    synchronized (this.this$0.mutex)
    {
      if (this.val$result.isComplete())
      {
        paramo = this.val$result;
        this.this$0.setState(paramo);
        return null;
      }
      paramo = this.this$0.getState().newBuilder().apply(this.val$operationsBeforeSave).apply(this.val$result).build();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */