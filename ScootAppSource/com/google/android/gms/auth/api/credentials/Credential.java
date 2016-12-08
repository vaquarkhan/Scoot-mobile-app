package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class Credential
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new f();
  final int a;
  private final String b;
  private final String c;
  private final Uri d;
  private final List<IdToken> e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  
  Credential(int paramInt, String paramString1, String paramString2, Uri paramUri, List<IdToken> paramList, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.a = paramInt;
    paramString1 = ((String)b.a(paramString1, "credential identifier cannot be null")).trim();
    b.a(paramString1, "credential identifier cannot be empty");
    this.b = paramString1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2.trim())) {
        paramString1 = null;
      }
    }
    this.c = paramString1;
    this.d = paramUri;
    if (paramList == null) {}
    for (paramString1 = Collections.emptyList();; paramString1 = Collections.unmodifiableList(paramList))
    {
      this.e = paramString1;
      this.f = paramString3;
      if ((paramString3 == null) || (!paramString3.isEmpty())) {
        break;
      }
      throw new IllegalArgumentException("password cannot be empty");
    }
    if (!TextUtils.isEmpty(paramString4)) {
      a.a(paramString4);
    }
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    if ((!TextUtils.isEmpty(this.f)) && (!TextUtils.isEmpty(this.g))) {
      throw new IllegalStateException("password and accountType cannot both be set");
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
  
  public Uri c()
  {
    return this.d;
  }
  
  public List<IdToken> d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Credential)) {
        return false;
      }
      paramObject = (Credential)paramObject;
    } while ((TextUtils.equals(this.b, ((Credential)paramObject).b)) && (TextUtils.equals(this.c, ((Credential)paramObject).c)) && (br.a(this.d, ((Credential)paramObject).d)) && (TextUtils.equals(this.f, ((Credential)paramObject).f)) && (TextUtils.equals(this.g, ((Credential)paramObject).g)) && (TextUtils.equals(this.h, ((Credential)paramObject).h)));
    return false;
  }
  
  public String f()
  {
    return this.h;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public String h()
  {
    return this.i;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, this.c, this.d, this.f, this.g, this.h });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */