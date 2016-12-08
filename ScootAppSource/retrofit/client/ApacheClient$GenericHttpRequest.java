package retrofit.client;

import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicHeader;

class ApacheClient$GenericHttpRequest
  extends HttpRequestBase
{
  private final String method;
  
  public ApacheClient$GenericHttpRequest(Request paramRequest)
  {
    this.method = paramRequest.getMethod();
    setURI(URI.create(paramRequest.getUrl()));
    paramRequest = paramRequest.getHeaders().iterator();
    while (paramRequest.hasNext())
    {
      Header localHeader = (Header)paramRequest.next();
      addHeader(new BasicHeader(localHeader.getName(), localHeader.getValue()));
    }
  }
  
  public String getMethod()
  {
    return this.method;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\client\ApacheClient$GenericHttpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */