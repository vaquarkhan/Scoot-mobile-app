package com.parse;

import a.o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class NetworkQueryController
  extends AbstractQueryController
{
  private static final String TAG = "NetworkQueryController";
  private final ParseHttpClient restClient;
  
  public NetworkQueryController(ParseHttpClient paramParseHttpClient)
  {
    this.restClient = paramParseHttpClient;
  }
  
  <T extends ParseObject> List<T> convertFindResponse(ParseQuery.State<T> paramState, JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.getJSONArray("results");
    if (localJSONArray == null)
    {
      PLog.d("NetworkQueryController", "null results in find response");
      return localArrayList;
    }
    paramJSONObject = paramJSONObject.optString("className", null);
    if (paramJSONObject == null) {
      paramJSONObject = paramState.className();
    }
    for (;;)
    {
      int i = 0;
      label51:
      Object localObject;
      if (i < localJSONArray.length())
      {
        localObject = localJSONArray.getJSONObject(i);
        if (paramState.selectedKeys() != null) {
          break label132;
        }
      }
      label132:
      for (boolean bool = true;; bool = false)
      {
        localObject = ParseObject.fromJSON((JSONObject)localObject, paramJSONObject, bool);
        localArrayList.add(localObject);
        ParseQuery.RelationConstraint localRelationConstraint = (ParseQuery.RelationConstraint)paramState.constraints().get("$relatedTo");
        if (localRelationConstraint != null) {
          localRelationConstraint.getRelation().addKnownObject((ParseObject)localObject);
        }
        i += 1;
        break label51;
        break;
      }
    }
  }
  
  public <T extends ParseObject> o<Integer> countAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    if (paramParseUser != null) {}
    for (paramParseUser = paramParseUser.getSessionToken();; paramParseUser = null) {
      return countAsync(paramState, paramParseUser, true, paramo);
    }
  }
  
  <T extends ParseObject> o<Integer> countAsync(ParseQuery.State<T> paramState, String paramString, boolean paramBoolean, o<Void> paramo)
  {
    paramString = ParseRESTQueryCommand.countCommand(paramState, paramString);
    if (paramBoolean) {
      paramString.enableRetrying();
    }
    return paramString.executeAsync(this.restClient, paramo).d(new NetworkQueryController.3(this, paramState, paramString), o.a).c(new NetworkQueryController.2(this));
  }
  
  public <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    if (paramParseUser != null) {}
    for (paramParseUser = paramParseUser.getSessionToken();; paramParseUser = null) {
      return findAsync(paramState, paramParseUser, true, paramo);
    }
  }
  
  <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, String paramString, boolean paramBoolean, o<Void> paramo)
  {
    long l1 = System.nanoTime();
    paramString = ParseRESTQueryCommand.findCommand(paramState, paramString);
    if (paramBoolean) {
      paramString.enableRetrying();
    }
    long l2 = System.nanoTime();
    return paramString.executeAsync(this.restClient, paramo).c(new NetworkQueryController.1(this, paramState, paramString, l2, l1), o.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkQueryController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */