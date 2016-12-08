package com.parse;

import com.parse.http.ParseHttpRequest.Method;
import org.json.JSONObject;

abstract class ParseRESTCommand$Init<T extends Init<T>>
{
  private String httpPath;
  private String installationId;
  private JSONObject jsonParameters;
  private String localId;
  public String masterKey;
  private ParseHttpRequest.Method method = ParseHttpRequest.Method.GET;
  private String operationSetUUID;
  private String sessionToken;
  
  public T httpPath(String paramString)
  {
    this.httpPath = paramString;
    return self();
  }
  
  public T installationId(String paramString)
  {
    this.installationId = paramString;
    return self();
  }
  
  public T jsonParameters(JSONObject paramJSONObject)
  {
    this.jsonParameters = paramJSONObject;
    return self();
  }
  
  public T localId(String paramString)
  {
    this.localId = paramString;
    return self();
  }
  
  public T masterKey(String paramString)
  {
    this.masterKey = paramString;
    return self();
  }
  
  public T method(ParseHttpRequest.Method paramMethod)
  {
    this.method = paramMethod;
    return self();
  }
  
  public T operationSetUUID(String paramString)
  {
    this.operationSetUUID = paramString;
    return self();
  }
  
  abstract T self();
  
  public T sessionToken(String paramString)
  {
    this.sessionToken = paramString;
    return self();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTCommand$Init.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */