package retrofit;

import retrofit.appengine.UrlFetchClient;
import retrofit.client.Client.Provider;

class Platform$AppEngine
  extends Platform.Base
{
  private Platform$AppEngine()
  {
    super(null);
  }
  
  Client.Provider defaultClient()
  {
    return new Platform.AppEngine.1(this, new UrlFetchClient());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Platform$AppEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */