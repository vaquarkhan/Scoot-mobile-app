package com.facebook.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.b.q;
import com.facebook.a.a;
import java.util.Iterator;
import java.util.Set;

public final class h
  extends BroadcastReceiver
{
  private static h a;
  private Context b;
  
  private h(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static h a(Context paramContext)
  {
    if (a != null) {
      return a;
    }
    a = new h(paramContext);
    a.a();
    return a;
  }
  
  private void a()
  {
    q.a(this.b).a(this, new IntentFilter("com.parse.bolts.measurement_event"));
  }
  
  private void b()
  {
    q.a(this.b).a(this);
  }
  
  protected void finalize()
  {
    try
    {
      b();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = a.a(paramContext);
    String str1 = "bf_" + paramIntent.getStringExtra("event_name");
    paramIntent = paramIntent.getBundleExtra("event_args");
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramIntent.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      localBundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)paramIntent.get(str2));
    }
    paramContext.a(str1, localBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */