package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.ac;
import com.facebook.b.as;
import com.facebook.b.ba;
import com.facebook.b.bf;
import com.facebook.b.u;
import com.facebook.j;
import com.facebook.p;
import com.facebook.q;
import com.facebook.s;
import com.facebook.w;
import java.util.Locale;

class WebViewLoginMethodHandler
  extends LoginMethodHandler
{
  public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new aa();
  private ba c;
  private String d;
  
  WebViewLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
    this.d = paramParcel.readString();
  }
  
  WebViewLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  private void b(String paramString)
  {
    this.b.b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", paramString).apply();
  }
  
  private String d()
  {
    return this.b.b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
  }
  
  String a()
  {
    return "web_view";
  }
  
  void a(LoginClient.Request paramRequest, Bundle paramBundle, p paramp)
  {
    if (paramBundle != null) {
      if (paramBundle.containsKey("e2e")) {
        this.d = paramBundle.getString("e2e");
      }
    }
    for (;;)
    {
      try
      {
        paramBundle = a(paramRequest.a(), paramBundle, j.e, paramRequest.d());
        paramRequest = LoginClient.Result.a(this.b.c(), paramBundle);
        CookieSyncManager.createInstance(this.b.b()).sync();
        b(paramBundle.b());
        if (!as.a(this.d)) {
          a(this.d);
        }
        this.b.a(paramRequest);
        return;
      }
      catch (p paramRequest)
      {
        paramRequest = LoginClient.Result.a(this.b.c(), null, paramRequest.getMessage());
        continue;
      }
      if (!(paramp instanceof q)) {
        break;
      }
      paramRequest = LoginClient.Result.a(this.b.c(), "User canceled log in.");
    }
    this.d = null;
    paramRequest = paramp.getMessage();
    if ((paramp instanceof ac))
    {
      paramRequest = ((ac)paramp).a();
      paramBundle = String.format(Locale.ROOT, "%d", new Object[] { Integer.valueOf(paramRequest.b()) });
      paramRequest = paramRequest.toString();
    }
    for (;;)
    {
      paramRequest = LoginClient.Result.a(this.b.c(), null, paramRequest, paramBundle);
      break;
      paramBundle = null;
    }
  }
  
  boolean a(LoginClient.Request paramRequest)
  {
    Bundle localBundle = new Bundle();
    if (!as.a(paramRequest.a()))
    {
      localObject = TextUtils.join(",", paramRequest.a());
      localBundle.putString("scope", (String)localObject);
      a("scope", localObject);
    }
    localBundle.putString("default_audience", paramRequest.c().a());
    Object localObject = AccessToken.a();
    if (localObject != null)
    {
      localObject = ((AccessToken)localObject).b();
      if ((localObject == null) || (!((String)localObject).equals(d()))) {
        break label218;
      }
      localBundle.putString("access_token", (String)localObject);
      a("access_token", "1");
    }
    for (;;)
    {
      z localz = new z(this, paramRequest);
      this.d = LoginClient.l();
      a("e2e", this.d);
      localObject = this.b.b();
      this.c = new ab((Context)localObject, paramRequest.d(), localBundle).a(this.d).a(paramRequest.f()).a(localz).a(w.k()).a();
      paramRequest = new u();
      paramRequest.d(true);
      paramRequest.a(this.c);
      paramRequest.a(((android.support.v4.app.aa)localObject).f(), "FacebookDialogFragment");
      return true;
      localObject = null;
      break;
      label218:
      as.b(this.b.b());
      a("access_token", "0");
    }
  }
  
  void b()
  {
    if (this.c != null)
    {
      this.c.cancel();
      this.c = null;
    }
  }
  
  boolean c()
  {
    return true;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\WebViewLoginMethodHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */