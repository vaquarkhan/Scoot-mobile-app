package retrofit;

public final class Endpoints
{
  private static final String DEFAULT_NAME = "default";
  
  public static Endpoint newFixedEndpoint(String paramString)
  {
    return new Endpoints.FixedEndpoint(paramString, "default");
  }
  
  public static Endpoint newFixedEndpoint(String paramString1, String paramString2)
  {
    return new Endpoints.FixedEndpoint(paramString1, paramString2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Endpoints.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */