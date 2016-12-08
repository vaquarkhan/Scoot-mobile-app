package com.parse;

import android.app.Notification;

public abstract class NotificationCompat$Builder$Style
{
  CharSequence mBigContentTitle;
  NotificationCompat.Builder mBuilder;
  CharSequence mSummaryText;
  boolean mSummaryTextSet = false;
  
  public Notification build()
  {
    Notification localNotification = null;
    if (this.mBuilder != null) {
      localNotification = this.mBuilder.build();
    }
    return localNotification;
  }
  
  public void setBuilder(NotificationCompat.Builder paramBuilder)
  {
    if (this.mBuilder != paramBuilder)
    {
      this.mBuilder = paramBuilder;
      if (this.mBuilder != null) {
        this.mBuilder.setStyle(this);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NotificationCompat$Builder$Style.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */