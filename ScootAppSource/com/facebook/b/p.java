package com.facebook.b;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;

final class p
  implements q
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    paramObject = (JSONArray)paramObject;
    ArrayList localArrayList = new ArrayList();
    if (((JSONArray)paramObject).length() == 0)
    {
      paramBundle.putStringArrayList(paramString, localArrayList);
      return;
    }
    int i = 0;
    while (i < ((JSONArray)paramObject).length())
    {
      Object localObject = ((JSONArray)paramObject).get(i);
      if ((localObject instanceof String))
      {
        localArrayList.add((String)localObject);
        i += 1;
      }
      else
      {
        throw new IllegalArgumentException("Unexpected type in an array: " + localObject.getClass());
      }
    }
    paramBundle.putStringArrayList(paramString, localArrayList);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */