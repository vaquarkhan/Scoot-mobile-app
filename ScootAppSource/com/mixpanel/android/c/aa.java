package com.mixpanel.android.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class aa
{
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final String e;
  public final String f;
  
  public aa(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramString2;
    this.f = paramString3;
  }
  
  public String toString()
  {
    try
    {
      Object localObject = new JSONObject();
      if (this.a == 1) {
        ((JSONObject)localObject).put("prefix", "shortest");
      }
      if (this.b != null) {
        ((JSONObject)localObject).put("view_class", this.b);
      }
      if (this.c > -1) {
        ((JSONObject)localObject).put("index", this.c);
      }
      if (this.d > -1) {
        ((JSONObject)localObject).put("id", this.d);
      }
      if (this.e != null) {
        ((JSONObject)localObject).put("contentDescription", this.e);
      }
      if (this.f != null) {
        ((JSONObject)localObject).put("tag", this.f);
      }
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException("Can't serialize PathElement to String", localJSONException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */