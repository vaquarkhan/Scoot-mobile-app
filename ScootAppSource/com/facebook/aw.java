package com.facebook;

import android.net.Uri;
import com.facebook.b.ay;
import org.json.JSONObject;

final class aw
  implements ay
{
  public void a(p paramp) {}
  
  public void a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("id");
    if (str1 == null) {
      return;
    }
    String str6 = paramJSONObject.optString("link");
    String str2 = paramJSONObject.optString("first_name");
    String str3 = paramJSONObject.optString("middle_name");
    String str4 = paramJSONObject.optString("last_name");
    String str5 = paramJSONObject.optString("name");
    if (str6 != null) {}
    for (paramJSONObject = Uri.parse(str6);; paramJSONObject = null)
    {
      Profile.a(new Profile(str1, str2, str3, str4, str5, paramJSONObject));
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */