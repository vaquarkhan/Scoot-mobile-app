package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.av;
import com.facebook.b.u;
import com.facebook.login.n;

public class FacebookActivity
  extends aa
{
  public static String m = "PassThrough";
  private static String n = "SingleFragment";
  private Fragment o;
  
  private void h()
  {
    Intent localIntent = getIntent();
    setResult(0, com.facebook.b.ah.a(localIntent, null, com.facebook.b.ah.a(com.facebook.b.ah.c(localIntent))));
    finish();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.o != null) {
      this.o.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.com_facebook_activity_layout);
    Intent localIntent = getIntent();
    if (m.equals(localIntent.getAction()))
    {
      h();
      return;
    }
    android.support.v4.app.ah localah = f();
    Fragment localFragment = localah.a(n);
    paramBundle = localFragment;
    if (localFragment == null)
    {
      if (!"FacebookDialogFragment".equals(localIntent.getAction())) {
        break label96;
      }
      paramBundle = new u();
      paramBundle.d(true);
      paramBundle.a(localah, n);
    }
    for (;;)
    {
      this.o = paramBundle;
      return;
      label96:
      paramBundle = new n();
      paramBundle.d(true);
      localah.a().a(R.id.com_facebook_fragment_container, paramBundle, n).a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\FacebookActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */