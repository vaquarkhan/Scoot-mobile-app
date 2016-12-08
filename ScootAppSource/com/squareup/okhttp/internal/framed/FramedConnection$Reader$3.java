package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class FramedConnection$Reader$3
  extends NamedRunnable
{
  FramedConnection$Reader$3(FramedConnection.Reader paramReader, String paramString, Object[] paramArrayOfObject, Settings paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      this.this$1.this$0.frameWriter.ackSettings(this.val$peerSettings);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$Reader$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */