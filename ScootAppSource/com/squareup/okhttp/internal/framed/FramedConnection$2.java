package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class FramedConnection$2
  extends NamedRunnable
{
  FramedConnection$2(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, int paramInt, long paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      this.this$0.frameWriter.windowUpdate(this.val$streamId, this.val$unacknowledgedBytesRead);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */