package com.mixpanel.android.c;

import android.os.Message;
import org.json.JSONObject;

final class ah
  implements r
{
  private ah(af paramaf) {}
  
  public void a()
  {
    Message localMessage = af.a(this.a).obtainMessage(4);
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    Message localMessage = af.a(this.a).obtainMessage(2);
    localMessage.obj = paramJSONObject;
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void b()
  {
    Message localMessage = af.a(this.a).obtainMessage(8);
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void b(JSONObject paramJSONObject)
  {
    Message localMessage = af.a(this.a).obtainMessage(3);
    localMessage.obj = paramJSONObject;
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void c(JSONObject paramJSONObject)
  {
    Message localMessage = af.a(this.a).obtainMessage(10);
    localMessage.obj = paramJSONObject;
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void d(JSONObject paramJSONObject)
  {
    Message localMessage = af.a(this.a).obtainMessage(6);
    localMessage.obj = paramJSONObject;
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void e(JSONObject paramJSONObject)
  {
    Message localMessage = af.a(this.a).obtainMessage(11);
    localMessage.obj = paramJSONObject;
    af.a(this.a).sendMessage(localMessage);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */