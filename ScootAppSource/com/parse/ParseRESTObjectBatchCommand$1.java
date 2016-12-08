package com.parse;

import a.ac;
import a.m;
import a.o;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class ParseRESTObjectBatchCommand$1
  implements m<JSONObject, Void>
{
  ParseRESTObjectBatchCommand$1(int paramInt, List paramList) {}
  
  public Void then(o<JSONObject> paramo)
  {
    int k = 0;
    int i;
    ac localac;
    if ((paramo.e()) || (paramo.d()))
    {
      i = 0;
      if (i < this.val$batchSize)
      {
        localac = (ac)this.val$tcss.get(i);
        if (paramo.e()) {
          localac.b(paramo.g());
        }
        for (;;)
        {
          i += 1;
          break;
          localac.c();
        }
      }
    }
    paramo = ((JSONObject)paramo.f()).getJSONArray("results");
    int m = paramo.length();
    int j = k;
    if (m != this.val$batchSize)
    {
      i = 0;
      for (;;)
      {
        j = k;
        if (i >= this.val$batchSize) {
          break;
        }
        ((ac)this.val$tcss.get(i)).b(new IllegalStateException("Batch command result count expected: " + this.val$batchSize + " but was: " + m));
        i += 1;
      }
    }
    if (j < this.val$batchSize)
    {
      JSONObject localJSONObject = paramo.getJSONObject(j);
      localac = (ac)this.val$tcss.get(j);
      if (localJSONObject.has("success")) {
        localac.b(localJSONObject.getJSONObject("success"));
      }
      for (;;)
      {
        j += 1;
        break;
        if (localJSONObject.has("error"))
        {
          localJSONObject = localJSONObject.getJSONObject("error");
          localac.b(new ParseException(localJSONObject.getInt("code"), localJSONObject.getString("error")));
        }
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTObjectBatchCommand$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */