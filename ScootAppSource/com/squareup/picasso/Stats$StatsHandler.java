package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class Stats$StatsHandler
  extends Handler
{
  private final Stats stats;
  
  public Stats$StatsHandler(Looper paramLooper, Stats paramStats)
  {
    super(paramLooper);
    this.stats = paramStats;
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Picasso.HANDLER.post(new Stats.StatsHandler.1(this, paramMessage));
      return;
    case 0: 
      this.stats.performCacheHit();
      return;
    case 1: 
      this.stats.performCacheMiss();
      return;
    case 2: 
      this.stats.performBitmapDecoded(paramMessage.arg1);
      return;
    case 3: 
      this.stats.performBitmapTransformed(paramMessage.arg1);
      return;
    }
    this.stats.performDownloadFinished((Long)paramMessage.obj);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Stats$StatsHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */