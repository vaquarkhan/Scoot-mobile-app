package com.parse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class GcmRegistrar$Request$1
  extends BroadcastReceiver
{
  GcmRegistrar$Request$1(GcmRegistrar.Request paramRequest) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getIntExtra("random", 0) == GcmRegistrar.Request.access$300(this.this$0))) {
      GcmRegistrar.Request.access$600(this.this$0);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar$Request$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */