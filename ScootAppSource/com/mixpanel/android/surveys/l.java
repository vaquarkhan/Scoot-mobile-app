package com.mixpanel.android.surveys;

import android.view.View.OnClickListener;
import com.mixpanel.android.mpmetrics.InAppNotification;

final class l
  implements View.OnClickListener
{
  l(k paramk, InAppNotification paramInAppNotification) {}
  
  /* Error */
  public void onClick(android.view.View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/mixpanel/android/surveys/l:a	Lcom/mixpanel/android/mpmetrics/InAppNotification;
    //   4: invokevirtual 32	com/mixpanel/android/mpmetrics/InAppNotification:k	()Ljava/lang/String;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnull +55 -> 64
    //   12: aload_1
    //   13: invokevirtual 38	java/lang/String:length	()I
    //   16: ifle +48 -> 64
    //   19: aload_1
    //   20: invokestatic 44	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   23: astore_1
    //   24: new 46	android/content/Intent
    //   27: dup
    //   28: ldc 48
    //   30: aload_1
    //   31: invokespecial 51	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 14	com/mixpanel/android/surveys/l:b	Lcom/mixpanel/android/surveys/k;
    //   39: aload_1
    //   40: invokevirtual 57	com/mixpanel/android/surveys/k:startActivity	(Landroid/content/Intent;)V
    //   43: aload_0
    //   44: getfield 14	com/mixpanel/android/surveys/l:b	Lcom/mixpanel/android/surveys/k;
    //   47: invokestatic 60	com/mixpanel/android/surveys/k:a	(Lcom/mixpanel/android/surveys/k;)Lcom/mixpanel/android/mpmetrics/af;
    //   50: invokevirtual 66	com/mixpanel/android/mpmetrics/af:c	()Lcom/mixpanel/android/mpmetrics/ak;
    //   53: ldc 68
    //   55: aload_0
    //   56: getfield 16	com/mixpanel/android/surveys/l:a	Lcom/mixpanel/android/mpmetrics/InAppNotification;
    //   59: invokeinterface 73 3 0
    //   64: aload_0
    //   65: getfield 14	com/mixpanel/android/surveys/l:b	Lcom/mixpanel/android/surveys/k;
    //   68: invokevirtual 76	com/mixpanel/android/surveys/k:finish	()V
    //   71: aload_0
    //   72: getfield 14	com/mixpanel/android/surveys/l:b	Lcom/mixpanel/android/surveys/k;
    //   75: invokestatic 79	com/mixpanel/android/surveys/k:b	(Lcom/mixpanel/android/surveys/k;)I
    //   78: invokestatic 84	com/mixpanel/android/mpmetrics/UpdateDisplayState:a	(I)V
    //   81: return
    //   82: astore_1
    //   83: ldc 86
    //   85: ldc 88
    //   87: aload_1
    //   88: invokestatic 94	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   91: pop
    //   92: return
    //   93: astore_1
    //   94: ldc 86
    //   96: ldc 96
    //   98: invokestatic 99	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   101: pop
    //   102: goto -38 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	l
    //   0	105	1	paramView	android.view.View
    // Exception table:
    //   from	to	target	type
    //   19	24	82	java/lang/IllegalArgumentException
    //   24	64	93	android/content/ActivityNotFoundException
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */