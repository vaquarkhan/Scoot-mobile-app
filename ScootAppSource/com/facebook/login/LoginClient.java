package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import com.facebook.AccessToken;
import com.facebook.R.string;
import com.facebook.b.as;
import com.facebook.b.t;
import com.facebook.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient
  implements Parcelable
{
  public static final Parcelable.Creator<LoginClient> CREATOR = new h();
  LoginMethodHandler[] a;
  int b = -1;
  Fragment c;
  j d;
  i e;
  boolean f;
  LoginClient.Request g;
  Map<String, String> h;
  private q i;
  
  public LoginClient(Parcel paramParcel)
  {
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
    this.a = new LoginMethodHandler[arrayOfParcelable.length];
    int j = 0;
    while (j < arrayOfParcelable.length)
    {
      this.a[j] = ((LoginMethodHandler)arrayOfParcelable[j]);
      this.a[j].a(this);
      j += 1;
    }
    this.b = paramParcel.readInt();
    this.g = ((LoginClient.Request)paramParcel.readParcelable(LoginClient.Request.class.getClassLoader()));
    this.h = as.a(paramParcel);
  }
  
  public LoginClient(Fragment paramFragment)
  {
    this.c = paramFragment;
  }
  
  private void a(String paramString, LoginClient.Result paramResult, Map<String, String> paramMap)
  {
    a(paramString, paramResult.a.a(), paramResult.c, paramResult.d, paramMap);
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap)
  {
    if (this.g == null)
    {
      o().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", paramString1);
      return;
    }
    o().a(this.g.e(), paramString1, paramString2, paramString3, paramString4, paramMap);
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.h == null) {
      this.h = new HashMap();
    }
    String str = paramString2;
    if (this.h.containsKey(paramString1))
    {
      str = paramString2;
      if (paramBoolean) {
        str = (String)this.h.get(paramString1) + "," + paramString2;
      }
    }
    this.h.put(paramString1, str);
  }
  
  private LoginMethodHandler[] c(LoginClient.Request paramRequest)
  {
    ArrayList localArrayList = new ArrayList();
    paramRequest = paramRequest.b();
    if (paramRequest.a())
    {
      localArrayList.add(new GetTokenLoginMethodHandler(this));
      localArrayList.add(new KatanaProxyLoginMethodHandler(this));
    }
    if (paramRequest.b()) {
      localArrayList.add(new WebViewLoginMethodHandler(this));
    }
    paramRequest = new LoginMethodHandler[localArrayList.size()];
    localArrayList.toArray(paramRequest);
    return paramRequest;
  }
  
  public static int d()
  {
    return t.a.a();
  }
  
  private void d(LoginClient.Result paramResult)
  {
    if (this.d != null) {
      this.d.a(paramResult);
    }
  }
  
  static String l()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  private LoginMethodHandler m()
  {
    if (this.b >= 0) {
      return this.a[this.b];
    }
    return null;
  }
  
  private void n()
  {
    b(LoginClient.Result.a(this.g, "Login attempt failed.", null));
  }
  
  private q o()
  {
    if ((this.i == null) || (!this.i.a().equals(this.g.d()))) {
      this.i = new q(b(), this.g.d());
    }
    return this.i;
  }
  
  int a(String paramString)
  {
    return b().checkCallingOrSelfPermission(paramString);
  }
  
  public Fragment a()
  {
    return this.c;
  }
  
  void a(Fragment paramFragment)
  {
    if (this.c != null) {
      throw new p("Can't set fragment once it is already set.");
    }
    this.c = paramFragment;
  }
  
  void a(LoginClient.Request paramRequest)
  {
    if (!e()) {
      b(paramRequest);
    }
  }
  
  void a(LoginClient.Result paramResult)
  {
    if ((paramResult.b != null) && (AccessToken.a() != null))
    {
      c(paramResult);
      return;
    }
    b(paramResult);
  }
  
  void a(i parami)
  {
    this.e = parami;
  }
  
  void a(j paramj)
  {
    this.d = paramj;
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.g != null) {
      return m().a(paramInt1, paramInt2, paramIntent);
    }
    return false;
  }
  
  aa b()
  {
    return this.c.l();
  }
  
  void b(LoginClient.Request paramRequest)
  {
    if (paramRequest == null) {}
    do
    {
      return;
      if (this.g != null) {
        throw new p("Attempted to authorize while a request is pending.");
      }
    } while ((AccessToken.a() != null) && (!g()));
    this.g = paramRequest;
    this.a = c(paramRequest);
    h();
  }
  
  void b(LoginClient.Result paramResult)
  {
    LoginMethodHandler localLoginMethodHandler = m();
    if (localLoginMethodHandler != null) {
      a(localLoginMethodHandler.a(), paramResult, localLoginMethodHandler.a);
    }
    if (this.h != null) {
      paramResult.f = this.h;
    }
    this.a = null;
    this.b = -1;
    this.g = null;
    this.h = null;
    d(paramResult);
  }
  
  public LoginClient.Request c()
  {
    return this.g;
  }
  
  void c(LoginClient.Result paramResult)
  {
    if (paramResult.b == null) {
      throw new p("Can't validate without a token");
    }
    AccessToken localAccessToken1 = AccessToken.a();
    AccessToken localAccessToken2 = paramResult.b;
    if ((localAccessToken1 != null) && (localAccessToken2 != null)) {}
    try
    {
      if (localAccessToken1.i().equals(localAccessToken2.i())) {}
      for (paramResult = LoginClient.Result.a(this.g, paramResult.b);; paramResult = LoginClient.Result.a(this.g, "User logged in as different Facebook user.", null))
      {
        b(paramResult);
        return;
      }
      return;
    }
    catch (Exception paramResult)
    {
      b(LoginClient.Result.a(this.g, "Caught exception", paramResult.getMessage()));
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  boolean e()
  {
    return (this.g != null) && (this.b >= 0);
  }
  
  void f()
  {
    if (this.b >= 0) {
      m().b();
    }
  }
  
  boolean g()
  {
    if (this.f) {
      return true;
    }
    if (a("android.permission.INTERNET") != 0)
    {
      Object localObject = b();
      String str = ((Activity)localObject).getString(R.string.com_facebook_internet_permission_error_title);
      localObject = ((Activity)localObject).getString(R.string.com_facebook_internet_permission_error_message);
      b(LoginClient.Result.a(this.g, str, (String)localObject));
      return false;
    }
    this.f = true;
    return true;
  }
  
  void h()
  {
    if (this.b >= 0) {
      a(m().a(), "skipped", null, null, m().a);
    }
    do
    {
      if ((this.a == null) || (this.b >= this.a.length - 1)) {
        break;
      }
      this.b += 1;
    } while (!i());
    while (this.g == null) {
      return;
    }
    n();
  }
  
  boolean i()
  {
    LoginMethodHandler localLoginMethodHandler = m();
    if ((localLoginMethodHandler.c()) && (!g()))
    {
      a("no_internet_permission", "1", false);
      return false;
    }
    boolean bool = localLoginMethodHandler.a(this.g);
    if (bool)
    {
      o().a(this.g.e(), localLoginMethodHandler.a());
      return bool;
    }
    a("not_tried", localLoginMethodHandler.a(), true);
    return bool;
  }
  
  void j()
  {
    if (this.e != null) {
      this.e.a();
    }
  }
  
  void k()
  {
    if (this.e != null) {
      this.e.b();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelableArray(this.a, paramInt);
    paramParcel.writeInt(this.b);
    paramParcel.writeParcelable(this.g, paramInt);
    as.a(paramParcel, this.h);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\LoginClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */