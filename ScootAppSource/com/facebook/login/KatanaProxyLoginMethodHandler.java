package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import com.facebook.b.ah;
import com.facebook.b.ar;
import com.facebook.b.as;
import com.facebook.j;
import com.facebook.p;
import java.util.Collection;

class KatanaProxyLoginMethodHandler
  extends LoginMethodHandler
{
  public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new f();
  
  KatanaProxyLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  KatanaProxyLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  private LoginClient.Result a(LoginClient.Request paramRequest, Intent paramIntent)
  {
    Object localObject = null;
    paramIntent = paramIntent.getExtras();
    String str1 = a(paramIntent);
    String str2 = paramIntent.getString("error_code");
    String str3 = b(paramIntent);
    String str4 = paramIntent.getString("e2e");
    if (!as.a(str4)) {
      a(str4);
    }
    if ((str1 == null) && (str2 == null) && (str3 == null)) {}
    do
    {
      try
      {
        paramIntent = LoginClient.Result.a(paramRequest, a(paramRequest.a(), paramIntent, j.b, paramRequest.d()));
        return paramIntent;
      }
      catch (p paramIntent)
      {
        return LoginClient.Result.a(paramRequest, null, paramIntent.getMessage());
      }
      paramIntent = (Intent)localObject;
    } while (ar.a.contains(str1));
    if (ar.b.contains(str1)) {
      return LoginClient.Result.a(paramRequest, null);
    }
    return LoginClient.Result.a(paramRequest, str1, str3, str2);
  }
  
  private String a(Bundle paramBundle)
  {
    String str2 = paramBundle.getString("error");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString("error_type");
    }
    return str1;
  }
  
  private LoginClient.Result b(LoginClient.Request paramRequest, Intent paramIntent)
  {
    paramIntent = paramIntent.getExtras();
    String str1 = a(paramIntent);
    String str2 = paramIntent.getString("error_code");
    if ("CONNECTION_FAILURE".equals(str2)) {
      return LoginClient.Result.a(paramRequest, str1, b(paramIntent), str2);
    }
    return LoginClient.Result.a(paramRequest, str1);
  }
  
  private String b(Bundle paramBundle)
  {
    String str2 = paramBundle.getString("error_message");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString("error_description");
    }
    return str1;
  }
  
  String a()
  {
    return "katana_proxy_auth";
  }
  
  boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    LoginClient.Request localRequest = this.b.c();
    if (paramIntent == null)
    {
      paramIntent = LoginClient.Result.a(localRequest, "Operation canceled");
      if (paramIntent == null) {
        break label78;
      }
      this.b.a(paramIntent);
    }
    for (;;)
    {
      return true;
      if (paramInt2 == 0)
      {
        paramIntent = b(localRequest, paramIntent);
        break;
      }
      if (paramInt2 != -1)
      {
        paramIntent = LoginClient.Result.a(localRequest, "Unexpected resultCode from authorization.", null);
        break;
      }
      paramIntent = a(localRequest, paramIntent);
      break;
      label78:
      this.b.h();
    }
  }
  
  protected boolean a(Intent paramIntent, int paramInt)
  {
    if (paramIntent == null) {
      return false;
    }
    try
    {
      this.b.a().startActivityForResult(paramIntent, paramInt);
      return true;
    }
    catch (ActivityNotFoundException paramIntent) {}
    return false;
  }
  
  boolean a(LoginClient.Request paramRequest)
  {
    String str = LoginClient.l();
    paramRequest = ah.a(this.b.b(), paramRequest.d(), paramRequest.a(), str, paramRequest.f(), paramRequest.g(), paramRequest.c());
    a("e2e", str);
    return a(paramRequest, LoginClient.d());
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\KatanaProxyLoginMethodHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */