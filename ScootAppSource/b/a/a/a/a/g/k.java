package b.a.a.a.a.g;

import b.a.a.a.a.b.r;
import org.json.JSONObject;

final class k
  implements y
{
  private long a(r paramr, long paramLong, JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("expires_at")) {
      return paramJSONObject.getLong("expires_at");
    }
    return paramr.a() + 1000L * paramLong;
  }
  
  private e a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.getString("identifier");
    String str2 = paramJSONObject.getString("status");
    String str3 = paramJSONObject.getString("url");
    String str4 = paramJSONObject.getString("reports_url");
    boolean bool = paramJSONObject.optBoolean("update_required", false);
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramJSONObject.has("icon"))
    {
      localObject1 = localObject2;
      if (paramJSONObject.getJSONObject("icon").has("hash")) {
        localObject1 = b(paramJSONObject.getJSONObject("icon"));
      }
    }
    return new e(str1, str2, str3, str4, bool, (c)localObject1);
  }
  
  private c b(JSONObject paramJSONObject)
  {
    return new c(paramJSONObject.getString("hash"), paramJSONObject.getInt("width"), paramJSONObject.getInt("height"));
  }
  
  private m c(JSONObject paramJSONObject)
  {
    return new m(paramJSONObject.optBoolean("prompt_enabled", false), paramJSONObject.optBoolean("collect_logged_exceptions", true), paramJSONObject.optBoolean("collect_reports", true), paramJSONObject.optBoolean("collect_analytics", false));
  }
  
  private b d(JSONObject paramJSONObject)
  {
    return new b(paramJSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), paramJSONObject.optInt("flush_interval_secs", 600), paramJSONObject.optInt("max_byte_size_per_file", 8000), paramJSONObject.optInt("max_file_count_per_send", 1), paramJSONObject.optInt("max_pending_send_file_count", 100), paramJSONObject.optBoolean("track_custom_events", true), paramJSONObject.optBoolean("track_predefined_events", true), paramJSONObject.optInt("sampling_rate", 1), paramJSONObject.optBoolean("flush_on_background", true));
  }
  
  private p e(JSONObject paramJSONObject)
  {
    return new p(paramJSONObject.optInt("log_buffer_size", 64000), paramJSONObject.optInt("max_chained_exception_depth", 8), paramJSONObject.optInt("max_custom_exception_events", 64), paramJSONObject.optInt("max_custom_key_value_pairs", 64), paramJSONObject.optInt("identifier_mask", 255), paramJSONObject.optBoolean("send_session_without_crash", false));
  }
  
  private o f(JSONObject paramJSONObject)
  {
    return new o(paramJSONObject.optString("title", "Send Crash Report?"), paramJSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), paramJSONObject.optString("send_button_title", "Send"), paramJSONObject.optBoolean("show_cancel_button", true), paramJSONObject.optString("cancel_button_title", "Don't Send"), paramJSONObject.optBoolean("show_always_send_button", true), paramJSONObject.optString("always_send_button_title", "Always Send"));
  }
  
  private f g(JSONObject paramJSONObject)
  {
    return new f(paramJSONObject.optString("update_endpoint", x.a), paramJSONObject.optInt("update_suspend_duration", 3600));
  }
  
  public w a(r paramr, JSONObject paramJSONObject)
  {
    int i = paramJSONObject.optInt("settings_version", 0);
    int j = paramJSONObject.optInt("cache_duration", 3600);
    e locale = a(paramJSONObject.getJSONObject("app"));
    p localp = e(paramJSONObject.getJSONObject("session"));
    o localo = f(paramJSONObject.getJSONObject("prompt"));
    m localm = c(paramJSONObject.getJSONObject("features"));
    b localb = d(paramJSONObject.getJSONObject("analytics"));
    f localf = g(paramJSONObject.getJSONObject("beta"));
    return new w(a(paramr, j, paramJSONObject), locale, localp, localo, localm, localb, localf, i, j);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\g\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */