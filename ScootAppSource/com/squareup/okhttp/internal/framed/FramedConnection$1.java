package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class FramedConnection$1
  extends NamedRunnable
{
  FramedConnection$1(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, int paramInt, ErrorCode paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      this.this$0.writeSynReset(this.val$streamId, this.val$errorCode);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */