package com.mixpanel.android.a.a;

import com.mixpanel.android.a.e;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;

final class c
  implements Runnable
{
  private c(a parama) {}
  
  public void run()
  {
    Thread.currentThread().setName("WebsocketWriteThread");
    try
    {
      while (!Thread.interrupted())
      {
        ByteBuffer localByteBuffer = (ByteBuffer)a.a(this.a).f.take();
        a.b(this.a).write(localByteBuffer.array(), 0, localByteBuffer.limit());
        a.b(this.a).flush();
      }
      return;
    }
    catch (IOException localIOException)
    {
      a.a(this.a).b();
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */