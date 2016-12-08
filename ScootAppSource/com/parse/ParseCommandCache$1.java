package com.parse;

import a.o;
import android.content.Context;
import android.content.Intent;

class ParseCommandCache$1
  implements ConnectivityNotifier.ConnectivityListener
{
  ParseCommandCache$1(ParseCommandCache paramParseCommandCache) {}
  
  public void networkConnectivityStatusChanged(Context paramContext, Intent paramIntent)
  {
    o.a(new ParseCommandCache.1.1(this, paramIntent.getBooleanExtra("noConnectivity", false), ConnectivityNotifier.isConnected(paramContext)), ParseExecutors.io());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCommandCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */