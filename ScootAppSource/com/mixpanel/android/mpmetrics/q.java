package com.mixpanel.android.mpmetrics;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mixpanel.android.R.anim;
import com.mixpanel.android.R.id;
import com.mixpanel.android.R.layout;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
public final class q
  extends Fragment
{
  private af a;
  private Activity b;
  private GestureDetector c;
  private Handler d;
  private int e;
  private UpdateDisplayState.DisplayState.InAppNotificationState f;
  private Runnable g;
  private Runnable h;
  private View i;
  private boolean j;
  
  private void a()
  {
    if (!this.j)
    {
      this.d.removeCallbacks(this.g);
      this.d.removeCallbacks(this.h);
      UpdateDisplayState.a(this.e);
      this.b.getFragmentManager().beginTransaction().remove(this).commit();
    }
    this.j = true;
  }
  
  private void b()
  {
    if ((this.b != null) && (!this.j))
    {
      this.d.removeCallbacks(this.g);
      this.d.removeCallbacks(this.h);
      this.b.getFragmentManager().beginTransaction().setCustomAnimations(0, R.anim.com_mixpanel_android_slide_down).remove(this).commit();
      UpdateDisplayState.a(this.e);
      this.j = true;
    }
  }
  
  public void a(af paramaf, int paramInt, UpdateDisplayState.DisplayState.InAppNotificationState paramInAppNotificationState)
  {
    this.a = paramaf;
    this.e = paramInt;
    this.f = paramInAppNotificationState;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.b = paramActivity;
    if (this.f == null)
    {
      a();
      return;
    }
    this.d = new Handler();
    this.g = new r(this);
    this.h = new s(this);
    this.c = new GestureDetector(paramActivity, new u(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.j = false;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    if (this.f == null) {
      a();
    }
    for (;;)
    {
      return this.i;
      this.i = paramLayoutInflater.inflate(R.layout.com_mixpanel_android_activity_notification_mini, paramViewGroup, false);
      paramLayoutInflater = (TextView)this.i.findViewById(R.id.com_mixpanel_android_notification_title);
      paramViewGroup = (ImageView)this.i.findViewById(R.id.com_mixpanel_android_notification_image);
      paramBundle = this.f.c();
      paramLayoutInflater.setText(paramBundle.e());
      paramViewGroup.setImageBitmap(paramBundle.l());
      this.d.postDelayed(this.g, 10000L);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    a();
  }
  
  public void onResume()
  {
    super.onResume();
    this.d.postDelayed(this.h, 500L);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    a();
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStart()
  {
    super.onStart();
    if (this.j) {
      this.b.getFragmentManager().beginTransaction().remove(this).commit();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */