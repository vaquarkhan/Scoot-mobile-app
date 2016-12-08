package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import d.f;
import java.io.IOException;
import java.util.Set;

class FramedConnection$6
  extends NamedRunnable
{
  FramedConnection$6(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, int paramInt1, f paramf, int paramInt2, boolean paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      boolean bool = FramedConnection.access$2700(this.this$0).onData(this.val$streamId, this.val$buffer, this.val$byteCount, this.val$inFinished);
      if (bool) {
        this.this$0.frameWriter.rstStream(this.val$streamId, ErrorCode.CANCEL);
      }
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */