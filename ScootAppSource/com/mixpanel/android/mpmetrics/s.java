package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.mixpanel.android.R.id;

final class s
  implements Runnable
{
  s(q paramq) {}
  
  public void run()
  {
    q.b(this.a).setVisibility(0);
    q.b(this.a).setBackgroundColor(q.c(this.a).b());
    q.b(this.a).setOnTouchListener(new t(this));
    ImageView localImageView = (ImageView)q.b(this.a).findViewById(R.id.com_mixpanel_android_notification_image);
    float f = TypedValue.applyDimension(1, 75.0F, q.e(this.a).getResources().getDisplayMetrics());
    Object localObject = new TranslateAnimation(0.0F, 0.0F, f, 0.0F);
    ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator());
    ((TranslateAnimation)localObject).setDuration(200L);
    q.b(this.a).startAnimation((Animation)localObject);
    localObject = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, f / 2.0F, f / 2.0F);
    ((ScaleAnimation)localObject).setInterpolator(new v(this.a));
    ((ScaleAnimation)localObject).setDuration(400L);
    ((ScaleAnimation)localObject).setStartOffset(200L);
    localImageView.startAnimation((Animation)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */