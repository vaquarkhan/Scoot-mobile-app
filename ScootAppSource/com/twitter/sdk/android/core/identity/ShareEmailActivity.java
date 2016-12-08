package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.TextView;
import b.a.a.a.f;
import com.twitter.sdk.android.core.R.id;
import com.twitter.sdk.android.core.R.layout;
import com.twitter.sdk.android.core.R.string;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.x;

public class ShareEmailActivity
  extends Activity
{
  h a;
  private x b;
  
  private ResultReceiver a(Intent paramIntent)
  {
    paramIntent = (ResultReceiver)paramIntent.getParcelableExtra("result_receiver");
    if (paramIntent == null) {
      throw new IllegalArgumentException("ResultReceiver must not be null. This activity should not be started directly.");
    }
    return paramIntent;
  }
  
  private x b(Intent paramIntent)
  {
    long l = paramIntent.getLongExtra("session_id", -1L);
    paramIntent = (x)com.twitter.sdk.android.core.t.d().i().a(l);
    if (paramIntent == null) {
      throw new IllegalArgumentException("No TwitterSession for id:" + l);
    }
    return paramIntent;
  }
  
  void a(Context paramContext, TextView paramTextView)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    paramTextView.setText(getResources().getString(R.string.tw__share_email_desc, new Object[] { localPackageManager.getApplicationLabel(paramContext.getApplicationInfo()), this.b.a() }));
  }
  
  public void onBackPressed()
  {
    this.a.c();
    super.onBackPressed();
  }
  
  public void onClickAllow(View paramView)
  {
    this.a.a();
    finish();
  }
  
  public void onClickNotNow(View paramView)
  {
    this.a.c();
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.tw__activity_share_email);
    try
    {
      paramBundle = getIntent();
      ResultReceiver localResultReceiver = a(paramBundle);
      this.b = b(paramBundle);
      this.a = new h(new ShareEmailClient(this.b), localResultReceiver);
      a(this, (TextView)findViewById(R.id.tw__share_email_desc));
      return;
    }
    catch (IllegalArgumentException paramBundle)
    {
      f.h().e("Twitter", "Failed to create ShareEmailActivity.", paramBundle);
      finish();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\ShareEmailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */