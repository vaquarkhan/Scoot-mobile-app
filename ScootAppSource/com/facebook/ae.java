package com.facebook;

import com.facebook.b.ag;
import org.json.JSONArray;
import org.json.JSONObject;

final class ae
  implements ai
{
  ae(GraphRequest paramGraphRequest, ai paramai) {}
  
  public void a(as paramas)
  {
    Object localObject1 = paramas.b();
    JSONArray localJSONArray;
    label28:
    int i;
    label35:
    label65:
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).optJSONObject("__debug__");
      if (localObject1 == null) {
        break label181;
      }
      localJSONArray = ((JSONObject)localObject1).optJSONArray("messages");
      if (localJSONArray == null) {
        break label204;
      }
      i = 0;
      if (i >= localJSONArray.length()) {
        break label204;
      }
      localObject3 = localJSONArray.optJSONObject(i);
      if (localObject3 == null) {
        break label187;
      }
      localObject1 = ((JSONObject)localObject3).optString("message");
      if (localObject3 == null) {
        break label192;
      }
      localObject2 = ((JSONObject)localObject3).optString("type");
      label79:
      if (localObject3 == null) {
        break label198;
      }
    }
    label181:
    label187:
    label192:
    label198:
    for (Object localObject3 = ((JSONObject)localObject3).optString("link");; localObject3 = null)
    {
      if ((localObject1 != null) && (localObject2 != null))
      {
        av localav = av.h;
        if (((String)localObject2).equals("warning")) {
          localav = av.g;
        }
        localObject2 = localObject1;
        if (!com.facebook.b.as.a((String)localObject3)) {
          localObject2 = (String)localObject1 + " Link: " + (String)localObject3;
        }
        ag.a(localav, GraphRequest.a, (String)localObject2);
      }
      i += 1;
      break label35;
      localObject1 = null;
      break;
      localJSONArray = null;
      break label28;
      localObject1 = null;
      break label65;
      localObject2 = null;
      break label79;
    }
    label204:
    if (this.a != null) {
      this.a.a(paramas);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */