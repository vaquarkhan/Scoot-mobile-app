package com.parse;

import android.os.Build.VERSION;

class NotificationCompat
{
  public static final int FLAG_HIGH_PRIORITY = 128;
  private static final NotificationCompat.NotificationCompatImpl IMPL = new NotificationCompat.NotificationCompatImplBase();
  public static final int PRIORITY_DEFAULT = 0;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      IMPL = new NotificationCompat.NotificationCompatPostJellyBean();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NotificationCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */