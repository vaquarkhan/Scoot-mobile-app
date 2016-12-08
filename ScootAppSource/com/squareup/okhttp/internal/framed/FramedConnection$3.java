package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class FramedConnection$3
  extends NamedRunnable
{
  FramedConnection$3(FramedConnection paramFramedConnection, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, int paramInt1, int paramInt2, Ping paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      FramedConnection.access$900(this.this$0, this.val$reply, this.val$payload1, this.val$payload2, this.val$ping);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */