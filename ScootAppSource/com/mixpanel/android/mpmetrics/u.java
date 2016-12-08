package com.mixpanel.android.mpmetrics;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

final class u
  implements GestureDetector.OnGestureListener
{
  u(q paramq) {}
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 > 0.0F) {
      q.a(this.a);
    }
    return true;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  /* Error */
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/mixpanel/android/mpmetrics/u:a	Lcom/mixpanel/android/mpmetrics/q;
    //   4: invokestatic 37	com/mixpanel/android/mpmetrics/q:c	(Lcom/mixpanel/android/mpmetrics/q;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    //   7: invokevirtual 42	com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState:c	()Lcom/mixpanel/android/mpmetrics/InAppNotification;
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 48	com/mixpanel/android/mpmetrics/InAppNotification:k	()Ljava/lang/String;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnull +55 -> 72
    //   20: aload_2
    //   21: invokevirtual 54	java/lang/String:length	()I
    //   24: ifle +48 -> 72
    //   27: aload_2
    //   28: invokestatic 60	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   31: astore_2
    //   32: new 62	android/content/Intent
    //   35: dup
    //   36: ldc 64
    //   38: aload_2
    //   39: invokespecial 67	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   42: astore_3
    //   43: aload_0
    //   44: getfield 12	com/mixpanel/android/mpmetrics/u:a	Lcom/mixpanel/android/mpmetrics/q;
    //   47: invokestatic 71	com/mixpanel/android/mpmetrics/q:e	(Lcom/mixpanel/android/mpmetrics/q;)Landroid/app/Activity;
    //   50: aload_3
    //   51: invokevirtual 77	android/app/Activity:startActivity	(Landroid/content/Intent;)V
    //   54: aload_0
    //   55: getfield 12	com/mixpanel/android/mpmetrics/u:a	Lcom/mixpanel/android/mpmetrics/q;
    //   58: invokestatic 81	com/mixpanel/android/mpmetrics/q:f	(Lcom/mixpanel/android/mpmetrics/q;)Lcom/mixpanel/android/mpmetrics/af;
    //   61: invokevirtual 86	com/mixpanel/android/mpmetrics/af:c	()Lcom/mixpanel/android/mpmetrics/ak;
    //   64: ldc 88
    //   66: aload_1
    //   67: invokeinterface 93 3 0
    //   72: aload_0
    //   73: getfield 12	com/mixpanel/android/mpmetrics/u:a	Lcom/mixpanel/android/mpmetrics/q;
    //   76: invokestatic 24	com/mixpanel/android/mpmetrics/q:a	(Lcom/mixpanel/android/mpmetrics/q;)V
    //   79: iconst_1
    //   80: ireturn
    //   81: astore_1
    //   82: ldc 95
    //   84: ldc 97
    //   86: aload_1
    //   87: invokestatic 103	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   90: pop
    //   91: iconst_1
    //   92: ireturn
    //   93: astore_1
    //   94: ldc 95
    //   96: new 105	java/lang/StringBuilder
    //   99: dup
    //   100: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   103: ldc 108
    //   105: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload_2
    //   109: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokestatic 121	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   118: pop
    //   119: goto -47 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	u
    //   0	122	1	paramMotionEvent	MotionEvent
    //   15	94	2	localObject	Object
    //   42	9	3	localIntent	android.content.Intent
    // Exception table:
    //   from	to	target	type
    //   27	32	81	java/lang/IllegalArgumentException
    //   32	72	93	android/content/ActivityNotFoundException
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */