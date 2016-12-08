package d;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class u
  extends a
{
  u(Socket paramSocket) {}
  
  protected IOException newTimeoutException(IOException paramIOException)
  {
    SocketTimeoutException localSocketTimeoutException = new SocketTimeoutException("timeout");
    if (paramIOException != null) {
      localSocketTimeoutException.initCause(paramIOException);
    }
    return localSocketTimeoutException;
  }
  
  protected void timedOut()
  {
    try
    {
      this.a.close();
      return;
    }
    catch (Exception localException)
    {
      r.a().log(Level.WARNING, "Failed to close timed out socket " + this.a, localException);
      return;
    }
    catch (AssertionError localAssertionError)
    {
      if ((localAssertionError.getCause() != null) && (localAssertionError.getMessage() != null) && (localAssertionError.getMessage().contains("getsockname failed")))
      {
        r.a().log(Level.WARNING, "Failed to close timed out socket " + this.a, localAssertionError);
        return;
      }
      throw localAssertionError;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */