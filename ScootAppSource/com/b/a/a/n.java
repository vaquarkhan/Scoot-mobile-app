package com.b.a.a;

import com.b.a.p;
import com.b.a.w;
import com.b.a.x;
import com.b.a.y;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class n
  extends o<JSONObject>
{
  public n(int paramInt, String paramString, JSONObject paramJSONObject, y<JSONObject> paramy, x paramx) {}
  
  public n(String paramString, JSONObject paramJSONObject, y<JSONObject> paramy, x paramx) {}
  
  protected w<JSONObject> a(com.b.a.n paramn)
  {
    try
    {
      paramn = w.a(new JSONObject(new String(paramn.b, j.a(paramn.c, "utf-8"))), j.a(paramn));
      return paramn;
    }
    catch (UnsupportedEncodingException paramn)
    {
      return w.a(new p(paramn));
    }
    catch (JSONException paramn) {}
    return w.a(new p(paramn));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */