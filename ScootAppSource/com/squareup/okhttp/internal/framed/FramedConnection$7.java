package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.util.Set;

class FramedConnection$7
  extends NamedRunnable
{
  FramedConnection$7(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, int paramInt, ErrorCode paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    FramedConnection.access$2700(this.this$0).onReset(this.val$streamId, this.val$errorCode);
    synchronized (this.this$0)
    {
      FramedConnection.access$2800(this.this$0).remove(Integer.valueOf(this.val$streamId));
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */