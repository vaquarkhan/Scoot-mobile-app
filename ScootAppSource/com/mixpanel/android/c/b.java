package com.mixpanel.android.c;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.af;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class b
  implements bf
{
  private static String e = "MixpanelAPI.DynamicEventTracker";
  private final af a;
  private final Handler b;
  private final Runnable c;
  private final Map<e, f> d;
  
  public b(af paramaf, Handler paramHandler)
  {
    this.a = paramaf;
    this.d = new HashMap();
    this.c = new d(this, null);
    this.b = paramHandler;
  }
  
  private static String a(View paramView)
  {
    Object localObject2 = null;
    Object localObject1;
    if ((paramView instanceof TextView))
    {
      paramView = ((TextView)paramView).getText();
      localObject1 = localObject2;
      if (paramView != null) {
        localObject1 = paramView.toString();
      }
    }
    StringBuilder localStringBuilder;
    int j;
    do
    {
      do
      {
        return (String)localObject1;
        localObject1 = localObject2;
      } while (!(paramView instanceof ViewGroup));
      localStringBuilder = new StringBuilder();
      paramView = (ViewGroup)paramView;
      int m = paramView.getChildCount();
      int i = 0;
      int k;
      for (j = 0; (i < m) && (localStringBuilder.length() < 128); j = k)
      {
        localObject1 = a(paramView.getChildAt(i));
        k = j;
        if (localObject1 != null)
        {
          k = j;
          if (((String)localObject1).length() > 0)
          {
            if (j != 0) {
              localStringBuilder.append(", ");
            }
            localStringBuilder.append((String)localObject1);
            k = 1;
          }
        }
        i += 1;
      }
      if (localStringBuilder.length() > 128) {
        return localStringBuilder.substring(0, 128);
      }
      localObject1 = localObject2;
    } while (j == 0);
    return localStringBuilder.toString();
  }
  
  public void a(View paramView, String arg2, boolean paramBoolean)
  {
    long l = System.currentTimeMillis();
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("$text", a(paramView));
      ((JSONObject)localObject).put("$from_binding", true);
      ((JSONObject)localObject).put("time", l / 1000L);
      if (paramBoolean)
      {
        paramView = new e(paramView, ???);
        localObject = new f(???, (JSONObject)localObject, l);
      }
      this.a.a(???, (JSONObject)localObject);
    }
    catch (JSONException localJSONException)
    {
      synchronized (this.d)
      {
        paramBoolean = this.d.isEmpty();
        this.d.put(paramView, localObject);
        if (paramBoolean) {
          this.b.postDelayed(this.c, 1000L);
        }
        return;
        localJSONException = localJSONException;
        Log.e(e, "Can't format properties from view due to JSON issue", localJSONException);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */