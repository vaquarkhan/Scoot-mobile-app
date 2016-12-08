package com.mixpanel.android.c;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Message;
import android.util.DisplayMetrics;
import com.mixpanel.android.mpmetrics.ab;
import com.mixpanel.android.mpmetrics.bl;
import java.util.Map;
import org.json.JSONArray;

@TargetApi(16)
public class af
  implements ac, ae, bg
{
  private final ab a;
  private final com.mixpanel.android.mpmetrics.af b;
  private final b c;
  private final m d;
  private final bl e;
  private final Map<String, String> f;
  private final am g;
  private final float h;
  
  public af(Context paramContext, String paramString, com.mixpanel.android.mpmetrics.af paramaf, bl parambl)
  {
    this.a = ab.a(paramContext);
    this.d = new m();
    this.e = parambl;
    this.f = paramaf.d();
    this.h = Resources.getSystem().getDisplayMetrics().scaledDensity;
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new aj(this));
    parambl = new HandlerThread(af.class.getCanonicalName());
    parambl.setPriority(10);
    parambl.start();
    this.g = new am(this, paramContext, paramString, parambl.getLooper(), this);
    this.c = new b(paramaf, this.g);
    this.b = paramaf;
    this.e.a(new ag(this));
  }
  
  public void a()
  {
    this.g.a();
    this.g.sendMessage(this.g.obtainMessage(0));
  }
  
  public void a(bb parambb)
  {
    Message localMessage = this.g.obtainMessage();
    localMessage.what = 12;
    localMessage.obj = parambb;
    this.g.sendMessage(localMessage);
  }
  
  public void a(String paramString)
  {
    Message localMessage = this.g.obtainMessage();
    localMessage.what = 7;
    localMessage.obj = paramString;
    this.g.sendMessage(localMessage);
  }
  
  public void a(JSONArray paramJSONArray)
  {
    Message localMessage = this.g.obtainMessage(5);
    localMessage.obj = paramJSONArray;
    this.g.sendMessage(localMessage);
  }
  
  public void b(JSONArray paramJSONArray)
  {
    Message localMessage = this.g.obtainMessage(9);
    localMessage.obj = paramJSONArray;
    this.g.sendMessage(localMessage);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */