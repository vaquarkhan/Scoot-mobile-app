package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bf
{
  private final int b;
  private final String c;
  private final String d;
  private final List<String> e;
  
  private bf(Survey paramSurvey, JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.getInt("id");
    this.c = paramJSONObject.getString("type");
    this.d = paramJSONObject.getString("prompt");
    Object localObject = Collections.emptyList();
    paramSurvey = (Survey)localObject;
    if (paramJSONObject.has("extra_data"))
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject("extra_data");
      paramSurvey = (Survey)localObject;
      if (localJSONObject.has("$choices"))
      {
        localObject = localJSONObject.getJSONArray("$choices");
        paramSurvey = new ArrayList(((JSONArray)localObject).length());
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          paramSurvey.add(((JSONArray)localObject).getString(i));
          i += 1;
        }
      }
    }
    this.e = Collections.unmodifiableList(paramSurvey);
    if ((d() == bg.b) && (this.e.size() == 0)) {
      throw new j("Question is multiple choice but has no answers:" + paramJSONObject.toString());
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public List<String> c()
  {
    return this.e;
  }
  
  public bg d()
  {
    if (bg.b.toString().equals(this.c)) {
      return bg.b;
    }
    if (bg.c.toString().equals(this.c)) {
      return bg.c;
    }
    return bg.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */