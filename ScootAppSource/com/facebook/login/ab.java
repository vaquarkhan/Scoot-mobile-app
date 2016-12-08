package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.b.ba;
import com.facebook.b.bf;

final class ab
  extends bf
{
  private String a;
  private boolean b;
  
  public ab(Context paramContext, String paramString, Bundle paramBundle)
  {
    super(paramContext, paramString, "oauth", paramBundle);
  }
  
  public ba a()
  {
    Bundle localBundle = e();
    localBundle.putString("redirect_uri", "fbconnect://success");
    localBundle.putString("client_id", b());
    localBundle.putString("e2e", this.a);
    localBundle.putString("response_type", "token,signed_request");
    localBundle.putString("return_scopes", "true");
    if (this.b) {
      localBundle.putString("auth_type", "rerequest");
    }
    return new ba(c(), "oauth", localBundle, d(), f());
  }
  
  public ab a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public ab a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */