package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.a.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new f();
  public static c a = e.c();
  private static Comparator<Scope> n = new a();
  final int b;
  List<Scope> c;
  private String d;
  private String e;
  private String f;
  private String g;
  private Uri h;
  private String i;
  private long j;
  private String k;
  private String l;
  private String m;
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8)
  {
    this.b = paramInt;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramUri;
    this.i = paramString5;
    this.j = paramLong;
    this.k = paramString6;
    this.c = paramList;
    this.l = paramString7;
    this.m = paramString8;
  }
  
  public static GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = Uri.parse(paramString);; paramString = null)
    {
      long l1 = Long.parseLong(localJSONObject.getString("expirationTime"));
      HashSet localHashSet = new HashSet();
      JSONArray localJSONArray = localJSONObject.getJSONArray("grantedScopes");
      int i2 = localJSONArray.length();
      int i1 = 0;
      while (i1 < i2)
      {
        localHashSet.add(new Scope(localJSONArray.getString(i1)));
        i1 += 1;
      }
      return a(localJSONObject.optString("id"), localJSONObject.optString("tokenId", null), localJSONObject.optString("email", null), localJSONObject.optString("displayName", null), localJSONObject.optString("givenName", null), localJSONObject.optString("familyName", null), paramString, Long.valueOf(l1), localJSONObject.getString("obfuscatedIdentifier"), localHashSet).b(localJSONObject.optString("serverAuthCode", null));
    }
  }
  
  public static GoogleSignInAccount a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri, Long paramLong, String paramString7, Set<Scope> paramSet)
  {
    Long localLong = paramLong;
    if (paramLong == null) {
      localLong = Long.valueOf(a.a() / 1000L);
    }
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, localLong.longValue(), b.a(paramString7), new ArrayList((Collection)b.a(paramSet)), paramString5, paramString6);
  }
  
  private JSONObject m()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (a() != null) {
        localJSONObject.put("id", a());
      }
      if (b() != null) {
        localJSONObject.put("tokenId", b());
      }
      if (c() != null) {
        localJSONObject.put("email", c());
      }
      if (d() != null) {
        localJSONObject.put("displayName", d());
      }
      if (e() != null) {
        localJSONObject.put("givenName", e());
      }
      if (f() != null) {
        localJSONObject.put("familyName", f());
      }
      if (g() != null) {
        localJSONObject.put("photoUrl", g().toString());
      }
      if (h() != null) {
        localJSONObject.put("serverAuthCode", h());
      }
      localJSONObject.put("expirationTime", this.j);
      localJSONObject.put("obfuscatedIdentifier", j());
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(this.c, n);
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((Scope)localIterator.next()).a());
      }
      localJSONException.put("grantedScopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    return localJSONException;
  }
  
  public String a()
  {
    return this.d;
  }
  
  public GoogleSignInAccount b(String paramString)
  {
    this.i = paramString;
    return this;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public String c()
  {
    return this.f;
  }
  
  public String d()
  {
    return this.g;
  }
  
  public String e()
  {
    return this.l;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    return ((GoogleSignInAccount)paramObject).k().equals(k());
  }
  
  public String f()
  {
    return this.m;
  }
  
  public Uri g()
  {
    return this.h;
  }
  
  public String h()
  {
    return this.i;
  }
  
  public long i()
  {
    return this.j;
  }
  
  public String j()
  {
    return this.k;
  }
  
  public String k()
  {
    return m().toString();
  }
  
  public String l()
  {
    JSONObject localJSONObject = m();
    localJSONObject.remove("serverAuthCode");
    return localJSONObject.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */