package com.parse;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;

@TargetApi(16)
class NotificationCompat$NotificationCompatPostJellyBean
  implements NotificationCompat.NotificationCompatImpl
{
  private Notification.Builder postJellyBeanBuilder;
  
  public Notification build(NotificationCompat.Builder paramBuilder)
  {
    this.postJellyBeanBuilder = new Notification.Builder(paramBuilder.mContext);
    Object localObject = this.postJellyBeanBuilder.setContentTitle(paramBuilder.mContentTitle).setContentText(paramBuilder.mContentText).setTicker(paramBuilder.mNotification.tickerText).setSmallIcon(paramBuilder.mNotification.icon, paramBuilder.mNotification.iconLevel).setContentIntent(paramBuilder.mContentIntent).setDeleteIntent(paramBuilder.mNotification.deleteIntent);
    if ((paramBuilder.mNotification.flags & 0x10) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      ((Notification.Builder)localObject).setAutoCancel(bool).setLargeIcon(paramBuilder.mLargeIcon).setDefaults(paramBuilder.mNotification.defaults);
      if ((paramBuilder.mStyle != null) && ((paramBuilder.mStyle instanceof NotificationCompat.Builder.BigTextStyle)))
      {
        paramBuilder = (NotificationCompat.Builder.BigTextStyle)paramBuilder.mStyle;
        localObject = new Notification.BigTextStyle(this.postJellyBeanBuilder).setBigContentTitle(paramBuilder.mBigContentTitle).bigText(paramBuilder.mBigText);
        if (paramBuilder.mSummaryTextSet) {
          ((Notification.BigTextStyle)localObject).setSummaryText(paramBuilder.mSummaryText);
        }
      }
      return this.postJellyBeanBuilder.build();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NotificationCompat$NotificationCompatPostJellyBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */