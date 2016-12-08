package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.b.as;
import com.facebook.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class GetTokenLoginMethodHandler
  extends LoginMethodHandler
{
  public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new e();
  private b c;
  
  GetTokenLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  GetTokenLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  String a()
  {
    return "get_token";
  }
  
  void a(LoginClient.Request paramRequest, Bundle paramBundle)
  {
    if (this.c != null) {
      this.c.a(null);
    }
    this.c = null;
    this.b.k();
    if (paramBundle != null)
    {
      ArrayList localArrayList = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      Object localObject = paramRequest.a();
      if ((localArrayList != null) && ((localObject == null) || (localArrayList.containsAll((Collection)localObject))))
      {
        c(paramRequest, paramBundle);
        return;
      }
      paramBundle = new HashSet();
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!localArrayList.contains(str)) {
          paramBundle.add(str);
        }
      }
      if (!paramBundle.isEmpty()) {
        a("new_permissions", TextUtils.join(",", paramBundle));
      }
      paramRequest.a(paramBundle);
    }
    this.b.h();
  }
  
  boolean a(LoginClient.Request paramRequest)
  {
    this.c = new b(this.b.b(), paramRequest.d());
    if (!this.c.a()) {
      return false;
    }
    this.b.j();
    paramRequest = new c(this, paramRequest);
    this.c.a(paramRequest);
    return true;
  }
  
  void b()
  {
    if (this.c != null)
    {
      this.c.b();
      this.c.a(null);
      this.c = null;
    }
  }
  
  void b(LoginClient.Request paramRequest, Bundle paramBundle)
  {
    paramRequest = a(paramBundle, j.d, paramRequest.d());
    paramRequest = LoginClient.Result.a(this.b.c(), paramRequest);
    this.b.a(paramRequest);
  }
  
  void c(LoginClient.Request paramRequest, Bundle paramBundle)
  {
    String str = paramBundle.getString("com.facebook.platform.extra.USER_ID");
    if ((str == null) || (str.isEmpty()))
    {
      this.b.j();
      as.a(paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new d(this, paramBundle, paramRequest));
      return;
    }
    b(paramRequest, paramBundle);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\GetTokenLoginMethodHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */