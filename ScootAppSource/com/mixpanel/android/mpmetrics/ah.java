package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class ah
  extends BroadcastReceiver
{
  ah(af paramaf) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = new JSONObject();
    Bundle localBundle = paramIntent.getBundleExtra("event_args");
    if (localBundle != null)
    {
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          paramContext.put(str, localBundle.get(str));
        }
        catch (JSONException localJSONException)
        {
          Log.e("MixpanelAPI.AL", "failed to add key \"" + str + "\" to properties for tracking bolts event", localJSONException);
        }
      }
    }
    this.a.a("$" + paramIntent.getStringExtra("event_name"), paramContext);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */