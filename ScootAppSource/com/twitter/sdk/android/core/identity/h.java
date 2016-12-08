package com.twitter.sdk.android.core.identity;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.twitter.sdk.android.core.u;

final class h
{
  private final ShareEmailClient a;
  private final ResultReceiver b;
  
  public h(ShareEmailClient paramShareEmailClient, ResultReceiver paramResultReceiver)
  {
    this.a = paramShareEmailClient;
    this.b = paramResultReceiver;
  }
  
  public void a()
  {
    this.a.a(b());
  }
  
  void a(com.twitter.sdk.android.core.a.f paramf)
  {
    if (paramf.a == null)
    {
      a(new u("Your application may not have access to email addresses or the user may not have an email address. To request access, please visit https://support.twitter.com/forms/platform."));
      return;
    }
    if ("".equals(paramf.a))
    {
      a(new u("This user does not have an email address."));
      return;
    }
    a(paramf.a);
  }
  
  void a(u paramu)
  {
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("error", paramu);
    this.b.send(1, localBundle);
  }
  
  void a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("email", paramString);
    this.b.send(-1, localBundle);
  }
  
  com.twitter.sdk.android.core.f<com.twitter.sdk.android.core.a.f> b()
  {
    return new i(this);
  }
  
  public void c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("msg", "The user chose not to share their email address at this time.");
    this.b.send(0, localBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */