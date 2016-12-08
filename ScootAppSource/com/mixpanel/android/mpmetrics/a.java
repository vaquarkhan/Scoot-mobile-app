package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.mixpanel.android.b.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class a
{
  private static final Map<Context, a> d = new HashMap();
  protected final Context a;
  protected final ab b;
  private final c c;
  
  a(Context paramContext)
  {
    this.a = paramContext;
    this.b = c(paramContext);
    this.c = a();
  }
  
  public static a a(Context paramContext)
  {
    synchronized (d)
    {
      Context localContext = paramContext.getApplicationContext();
      if (!d.containsKey(localContext))
      {
        paramContext = new a(localContext);
        d.put(localContext, paramContext);
        return paramContext;
      }
      paramContext = (a)d.get(localContext);
    }
  }
  
  private void a(String paramString)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.Messages", paramString + " (Thread " + Thread.currentThread().getId() + ")");
    }
  }
  
  private void a(String paramString, Throwable paramThrowable)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.Messages", paramString + " (Thread " + Thread.currentThread().getId() + ")", paramThrowable);
    }
  }
  
  protected c a()
  {
    return new c(this);
  }
  
  public void a(b paramb)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramb;
    this.c.a(localMessage);
  }
  
  public void a(o paramo)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 12;
    localMessage.obj = paramo;
    this.c.a(localMessage);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 0;
    localMessage.obj = paramJSONObject;
    this.c.a(localMessage);
  }
  
  protected ac b(Context paramContext)
  {
    return new ac(paramContext);
  }
  
  public void b()
  {
    Message localMessage = Message.obtain();
    localMessage.what = 2;
    this.c.a(localMessage);
  }
  
  protected g c()
  {
    return new com.mixpanel.android.b.c();
  }
  
  protected ab c(Context paramContext)
  {
    return ab.a(paramContext);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */