package com.facebook.login;

import android.os.Bundle;
import com.facebook.b.ay;
import com.facebook.p;
import org.json.JSONException;
import org.json.JSONObject;

final class d
  implements ay
{
  d(GetTokenLoginMethodHandler paramGetTokenLoginMethodHandler, Bundle paramBundle, LoginClient.Request paramRequest) {}
  
  public void a(p paramp)
  {
    this.c.b.b(LoginClient.Result.a(this.c.b.c(), "Caught exception", paramp.getMessage()));
  }
  
  public void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.getString("id");
      this.a.putString("com.facebook.platform.extra.USER_ID", paramJSONObject);
      this.c.b(this.b, this.a);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      this.c.b.b(LoginClient.Result.a(this.c.b.c(), "Caught exception", paramJSONObject.getMessage()));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */