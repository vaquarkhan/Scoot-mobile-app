package com.facebook.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

public class ab
  extends ba
{
  private static final String a = ab.class.getName();
  private boolean b;
  
  public ab(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    b(paramString2);
  }
  
  protected Bundle a(String paramString)
  {
    Bundle localBundle = as.b(Uri.parse(paramString).getQuery());
    paramString = localBundle.getString("bridge_args");
    localBundle.remove("bridge_args");
    if (!as.a(paramString)) {}
    try
    {
      localBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", i.a(new JSONObject(paramString)));
      String str = localBundle.getString("method_results");
      localBundle.remove("method_results");
      if (!as.a(str))
      {
        paramString = str;
        if (as.a(str)) {
          paramString = "{}";
        }
      }
    }
    catch (JSONException paramString)
    {
      try
      {
        localBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", i.a(new JSONObject(paramString)));
        localBundle.remove("version");
        localBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", ah.a());
        return localBundle;
        paramString = paramString;
        as.a(a, "Unable to parse bridge_args JSON", paramString);
      }
      catch (JSONException paramString)
      {
        for (;;)
        {
          as.a(a, "Unable to parse bridge_args JSON", paramString);
        }
      }
    }
  }
  
  public void cancel()
  {
    WebView localWebView = c();
    if ((!b()) || (a()) || (localWebView == null) || (!localWebView.isShown())) {
      super.cancel();
    }
    while (this.b) {
      return;
    }
    this.b = true;
    localWebView.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
    new Handler(Looper.getMainLooper()).postDelayed(new ac(this), 1500L);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */