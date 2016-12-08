package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class IdToken
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<IdToken> CREATOR = new i();
  final int a;
  private final String b;
  private final String c;
  
  IdToken(int paramInt, String paramString1, String paramString2)
  {
    a.a(paramString1);
    if (!TextUtils.isEmpty(paramString2)) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "id token string cannot be null or empty");
      this.a = paramInt;
      this.b = paramString1;
      this.c = paramString2;
      return;
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\IdToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */