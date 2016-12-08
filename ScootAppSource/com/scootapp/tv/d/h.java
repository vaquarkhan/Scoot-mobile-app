package com.scootapp.tv.d;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  private List<LatLng> a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int i2 = paramString.length();
    int j = 0;
    int k = 0;
    int m;
    int n;
    if (i < i2)
    {
      m = 0;
      n = 0;
    }
    for (int i1 = i;; i1 = i)
    {
      i = i1 + 1;
      i1 = paramString.charAt(i1) - '?';
      n |= (i1 & 0x1F) << m;
      m += 5;
      if (i1 < 32)
      {
        if ((n & 0x1) != 0)
        {
          m = n >> 1 ^ 0xFFFFFFFF;
          label94:
          i1 = k + m;
          k = 0;
          m = 0;
        }
        for (n = i;; n = i)
        {
          i = n + 1;
          n = paramString.charAt(n) - '?';
          m |= (n & 0x1F) << k;
          k += 5;
          if (n < 32)
          {
            if ((m & 0x1) != 0) {}
            for (k = m >> 1 ^ 0xFFFFFFFF;; k = m >> 1)
            {
              j = k + j;
              localArrayList.add(new LatLng(i1 / 100000.0D, j / 100000.0D));
              k = i1;
              break;
              m = n >> 1;
              break label94;
            }
            return localArrayList;
          }
        }
      }
    }
  }
  
  public List<List<HashMap<String, String>>> a(JSONObject paramJSONObject)
  {
    ArrayList localArrayList1 = new ArrayList();
    label257:
    for (;;)
    {
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray("routes");
        int i = 0;
        int k;
        if (i < paramJSONObject.length())
        {
          JSONArray localJSONArray1 = ((JSONObject)paramJSONObject.get(i)).getJSONArray("legs");
          ArrayList localArrayList2 = new ArrayList();
          int j = 0;
          if (j < localJSONArray1.length())
          {
            JSONArray localJSONArray2 = ((JSONObject)localJSONArray1.get(j)).getJSONArray("steps");
            k = 0;
            if (k < localJSONArray2.length())
            {
              List localList = a((String)((JSONObject)((JSONObject)localJSONArray2.get(k)).get("polyline")).get("points"));
              int m = 0;
              if (m >= localList.size()) {
                break label257;
              }
              HashMap localHashMap = new HashMap();
              localHashMap.put("lat", Double.toString(((LatLng)localList.get(m)).a));
              localHashMap.put("lng", Double.toString(((LatLng)localList.get(m)).b));
              localArrayList2.add(localHashMap);
              m += 1;
              continue;
            }
            localArrayList1.add(localArrayList2);
            j += 1;
            continue;
          }
          i += 1;
        }
        k += 1;
      }
      catch (JSONException paramJSONObject)
      {
        paramJSONObject.printStackTrace();
        return localArrayList1;
      }
      catch (Exception paramJSONObject)
      {
        paramJSONObject.printStackTrace();
        return localArrayList1;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */