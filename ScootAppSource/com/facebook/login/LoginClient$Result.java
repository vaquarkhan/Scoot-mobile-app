package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.b.as;
import com.facebook.b.az;
import java.util.Map;

public class LoginClient$Result
  implements Parcelable
{
  public static final Parcelable.Creator<Result> CREATOR = new l();
  final m a;
  final AccessToken b;
  final String c;
  final String d;
  final LoginClient.Request e;
  public Map<String, String> f;
  
  private LoginClient$Result(Parcel paramParcel)
  {
    this.a = m.valueOf(paramParcel.readString());
    this.b = ((AccessToken)paramParcel.readParcelable(AccessToken.class.getClassLoader()));
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = ((LoginClient.Request)paramParcel.readParcelable(LoginClient.Request.class.getClassLoader()));
    this.f = as.a(paramParcel);
  }
  
  LoginClient$Result(LoginClient.Request paramRequest, m paramm, AccessToken paramAccessToken, String paramString1, String paramString2)
  {
    az.a(paramm, "code");
    this.e = paramRequest;
    this.b = paramAccessToken;
    this.c = paramString1;
    this.a = paramm;
    this.d = paramString2;
  }
  
  static Result a(LoginClient.Request paramRequest, AccessToken paramAccessToken)
  {
    return new Result(paramRequest, m.a, paramAccessToken, null, null);
  }
  
  static Result a(LoginClient.Request paramRequest, String paramString)
  {
    return new Result(paramRequest, m.b, null, paramString, null);
  }
  
  static Result a(LoginClient.Request paramRequest, String paramString1, String paramString2)
  {
    return a(paramRequest, paramString1, paramString2, null);
  }
  
  static Result a(LoginClient.Request paramRequest, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = TextUtils.join(": ", as.b(new String[] { paramString1, paramString2 }));
    return new Result(paramRequest, m.c, null, paramString1, paramString3);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a.name());
    paramParcel.writeParcelable(this.b, paramInt);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeParcelable(this.e, paramInt);
    as.a(paramParcel, this.f);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\LoginClient$Result.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */