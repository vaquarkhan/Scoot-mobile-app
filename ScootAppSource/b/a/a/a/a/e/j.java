package b.a.a.a.a.e;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class j
  implements i
{
  public HttpURLConnection a(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public HttpURLConnection a(URL paramURL, Proxy paramProxy)
  {
    return (HttpURLConnection)paramURL.openConnection(paramProxy);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */