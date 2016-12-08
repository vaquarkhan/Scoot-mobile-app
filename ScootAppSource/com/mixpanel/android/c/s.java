package com.mixpanel.android.c;

import android.util.Log;
import com.mixpanel.android.a.a.a;
import com.mixpanel.android.a.b.f;
import com.mixpanel.android.a.e.h;
import com.mixpanel.android.mpmetrics.ab;
import java.net.Socket;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

final class s
  extends a
{
  public s(p paramp, URI paramURI, int paramInt, Socket paramSocket)
  {
    super(paramURI, new f(), null, paramInt);
    a(paramSocket);
  }
  
  public void a(h paramh)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.EditorCnctn", "Websocket connected");
    }
  }
  
  public void a(Exception paramException)
  {
    if ((paramException != null) && (paramException.getMessage() != null))
    {
      Log.e("MixpanelAPI.EditorCnctn", "Websocket Error: " + paramException.getMessage());
      return;
    }
    Log.e("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
  }
  
  public void a(String paramString)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.EditorCnctn", "Received message from editor:\n" + paramString);
    }
    String str;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      str = localJSONObject.getString("type");
      if (str.equals("device_info_request"))
      {
        p.a(this.c).a();
        return;
      }
      if (str.equals("snapshot_request"))
      {
        p.a(this.c).a(localJSONObject);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      Log.e("MixpanelAPI.EditorCnctn", "Bad JSON received:" + paramString, localJSONException);
      return;
    }
    if (str.equals("change_request"))
    {
      p.a(this.c).b(localJSONException);
      return;
    }
    if (str.equals("event_binding_request"))
    {
      p.a(this.c).d(localJSONException);
      return;
    }
    if (str.equals("clear_request"))
    {
      p.a(this.c).c(localJSONException);
      return;
    }
    if (str.equals("tweak_request")) {
      p.a(this.c).e(localJSONException);
    }
  }
  
  public void b(int paramInt, String paramString, boolean paramBoolean)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.EditorCnctn", "WebSocket closed. Code: " + paramInt + ", reason: " + paramString + "\nURI: " + p.b(this.c));
    }
    p.a(this.c).b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */