package com.facebook.b;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.aa;
import com.facebook.p;

public final class u
  extends android.support.v4.app.w
{
  private Dialog ai;
  
  private void a(Bundle paramBundle, p paramp)
  {
    aa localaa = l();
    paramBundle = ah.a(localaa.getIntent(), paramBundle, paramp);
    if (paramp == null) {}
    for (int i = -1;; i = 0)
    {
      localaa.setResult(i, paramBundle);
      localaa.finish();
      return;
    }
  }
  
  private void l(Bundle paramBundle)
  {
    aa localaa = l();
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localIntent.putExtras(localBundle);
    localaa.setResult(-1, localIntent);
    localaa.finish();
  }
  
  public void a(Dialog paramDialog)
  {
    this.ai = paramDialog;
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    Bundle localBundle;
    String str;
    if (this.ai == null)
    {
      paramBundle = l();
      localBundle = ah.c(paramBundle.getIntent());
      if (localBundle.getBoolean("is_fallback", false)) {
        break label99;
      }
      str = localBundle.getString("action");
      localBundle = localBundle.getBundle("params");
      if (as.a(str))
      {
        as.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
        paramBundle.finish();
      }
    }
    else
    {
      return;
    }
    paramBundle = new bf(paramBundle, str, localBundle).a(new v(this)).a();
    for (;;)
    {
      this.ai = paramBundle;
      return;
      label99:
      str = localBundle.getString("url");
      if (as.a(str))
      {
        as.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
        paramBundle.finish();
        return;
      }
      paramBundle = new ab(paramBundle, str, String.format("fb%s://bridge/", new Object[] { com.facebook.w.i() }));
      paramBundle.a(new w(this));
    }
  }
  
  public Dialog c(Bundle paramBundle)
  {
    if (this.ai == null)
    {
      a(null, null);
      b(false);
    }
    return this.ai;
  }
  
  public void h()
  {
    if ((b() != null) && (t())) {
      b().setDismissMessage(null);
    }
    super.h();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if ((this.ai instanceof ba)) {
      ((ba)this.ai).d();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */