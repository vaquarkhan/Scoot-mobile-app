package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.List;
import java.util.Set;

class FramedConnection$5
  extends NamedRunnable
{
  FramedConnection$5(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, int paramInt, List paramList, boolean paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    boolean bool = FramedConnection.access$2700(this.this$0).onHeaders(this.val$streamId, this.val$requestHeaders, this.val$inFinished);
    if (bool) {}
    try
    {
      this.this$0.frameWriter.rstStream(this.val$streamId, ErrorCode.CANCEL);
      if ((bool) || (this.val$inFinished)) {
        synchronized (this.this$0)
        {
          FramedConnection.access$2800(this.this$0).remove(Integer.valueOf(this.val$streamId));
          return;
        }
      }
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */