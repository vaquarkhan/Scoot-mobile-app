package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.R.id;
import com.twitter.sdk.android.core.R.layout;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.t;

public class OAuthActivity
  extends Activity
  implements d
{
  a a;
  private ProgressBar b;
  private WebView c;
  
  public void a(int paramInt, Intent paramIntent)
  {
    setResult(paramInt, paramIntent);
    finish();
  }
  
  public void onBackPressed()
  {
    this.a.a(0, new q("Authorization failed, request was canceled."));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.tw__activity_oauth);
    this.b = ((ProgressBar)findViewById(R.id.tw__spinner));
    this.c = ((WebView)findViewById(R.id.tw__web_view));
    boolean bool;
    if (paramBundle != null)
    {
      bool = paramBundle.getBoolean("progress", false);
      paramBundle = this.b;
      if (!bool) {
        break label136;
      }
    }
    label136:
    for (int i = 0;; i = 8)
    {
      paramBundle.setVisibility(i);
      paramBundle = t.d();
      this.a = new a(this.b, this.c, (TwitterAuthConfig)getIntent().getParcelableExtra("auth_config"), new OAuth1aService(paramBundle, paramBundle.g(), new l()), this);
      this.a.a();
      return;
      bool = true;
      break;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.b.getVisibility() == 0) {
      paramBundle.putBoolean("progress", true);
    }
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\OAuthActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */