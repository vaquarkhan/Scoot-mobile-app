package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.List;
import java.util.Set;

class FramedConnection$4
  extends NamedRunnable
{
  FramedConnection$4(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, int paramInt, List paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    if (FramedConnection.access$2700(this.this$0).onRequest(this.val$streamId, this.val$requestHeaders)) {
      try
      {
        this.this$0.frameWriter.rstStream(this.val$streamId, ErrorCode.CANCEL);
        synchronized (this.this$0)
        {
          FramedConnection.access$2800(this.this$0).remove(Integer.valueOf(this.val$streamId));
          return;
        }
        return;
      }
      catch (IOException localIOException) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */