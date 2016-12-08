package com.parse;

import android.content.Context;
import android.content.Intent;

class ParsePinningEventuallyQueue$1
  implements ConnectivityNotifier.ConnectivityListener
{
  ParsePinningEventuallyQueue$1(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue) {}
  
  public void networkConnectivityStatusChanged(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getBooleanExtra("noConnectivity", false))
    {
      this.this$0.setConnected(false);
      return;
    }
    this.this$0.setConnected(ConnectivityNotifier.isConnected(paramContext));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */