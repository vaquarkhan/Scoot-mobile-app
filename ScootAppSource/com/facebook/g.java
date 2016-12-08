package com.facebook;

import org.json.JSONObject;

final class g
  implements ai
{
  g(d paramd, i parami) {}
  
  public void a(as paramas)
  {
    paramas = paramas.b();
    if (paramas == null) {
      return;
    }
    this.a.a = paramas.optString("access_token");
    this.a.b = paramas.optInt("expires_at");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */