package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R.id;
import com.facebook.R.layout;

public final class n
  extends Fragment
{
  private String a;
  private LoginClient b;
  private LoginClient.Request c;
  
  private void a(LoginClient.Result paramResult)
  {
    this.c = null;
    if (paramResult.a == m.b) {}
    for (int i = 0;; i = -1)
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("com.facebook.LoginFragment:Result", paramResult);
      paramResult = new Intent();
      paramResult.putExtras(localBundle);
      if (p())
      {
        l().setResult(i, paramResult);
        l().finish();
      }
      return;
    }
  }
  
  private void b(Activity paramActivity)
  {
    paramActivity = paramActivity.getCallingActivity();
    if (paramActivity == null) {
      return;
    }
    this.a = paramActivity.getPackageName();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.com_facebook_login_fragment, paramViewGroup, false);
    this.b.a(new p(this, paramLayoutInflater));
    return paramLayoutInflater;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    this.b.a(paramInt1, paramInt2, paramIntent);
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    if (paramBundle != null)
    {
      this.b = ((LoginClient)paramBundle.getParcelable("loginClient"));
      this.b.a(this);
      this.b.a(new o(this));
      paramBundle = l();
      if (paramBundle != null) {
        break label70;
      }
    }
    label70:
    do
    {
      return;
      this.b = new LoginClient(this);
      break;
      b(paramBundle);
    } while (paramBundle.getIntent() == null);
    this.c = ((LoginClient.Request)paramBundle.getIntent().getParcelableExtra("request"));
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("loginClient", this.b);
  }
  
  public void w()
  {
    super.w();
    if (this.a == null)
    {
      Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
      l().finish();
      return;
    }
    this.b.a(this.c);
  }
  
  public void x()
  {
    super.x();
    l().findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
  }
  
  public void y()
  {
    this.b.f();
    super.y();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */