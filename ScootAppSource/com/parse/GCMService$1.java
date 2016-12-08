package com.parse;

import android.content.Intent;

class GCMService$1
  implements Runnable
{
  GCMService$1(GCMService paramGCMService, Intent paramIntent, int paramInt) {}
  
  public void run()
  {
    try
    {
      GCMService.access$000(this.this$0, this.val$intent);
      return;
    }
    finally
    {
      ServiceUtils.completeWakefulIntent(this.val$intent);
      GCMService.access$100(this.this$0, this.val$startId);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GCMService$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */