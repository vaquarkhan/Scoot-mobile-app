package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.b.as;
import com.facebook.b.az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken
  implements Parcelable
{
  public static final Parcelable.Creator<AccessToken> CREATOR = new a();
  private static final Date a = new Date(Long.MAX_VALUE);
  private static final Date b = a;
  private static final Date c = new Date();
  private static final j d = j.b;
  private final Date e;
  private final Set<String> f;
  private final Set<String> g;
  private final String h;
  private final j i;
  private final Date j;
  private final String k;
  private final String l;
  
  AccessToken(Parcel paramParcel)
  {
    this.e = new Date(paramParcel.readLong());
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    this.f = Collections.unmodifiableSet(new HashSet(localArrayList));
    localArrayList.clear();
    paramParcel.readStringList(localArrayList);
    this.g = Collections.unmodifiableSet(new HashSet(localArrayList));
    this.h = paramParcel.readString();
    this.i = j.valueOf(paramParcel.readString());
    this.j = new Date(paramParcel.readLong());
    this.k = paramParcel.readString();
    this.l = paramParcel.readString();
  }
  
  public AccessToken(String paramString1, String paramString2, String paramString3, Collection<String> paramCollection1, Collection<String> paramCollection2, j paramj, Date paramDate1, Date paramDate2)
  {
    az.a(paramString1, "accessToken");
    az.a(paramString2, "applicationId");
    az.a(paramString3, "userId");
    if (paramDate1 != null)
    {
      this.e = paramDate1;
      if (paramCollection1 == null) {
        break label129;
      }
      paramCollection1 = new HashSet(paramCollection1);
      label49:
      this.f = Collections.unmodifiableSet(paramCollection1);
      if (paramCollection2 == null) {
        break label141;
      }
      paramCollection1 = new HashSet(paramCollection2);
      label74:
      this.g = Collections.unmodifiableSet(paramCollection1);
      this.h = paramString1;
      if (paramj == null) {
        break label153;
      }
      label93:
      this.i = paramj;
      if (paramDate2 == null) {
        break label161;
      }
    }
    for (;;)
    {
      this.j = paramDate2;
      this.k = paramString2;
      this.l = paramString3;
      return;
      paramDate1 = b;
      break;
      label129:
      paramCollection1 = new HashSet();
      break label49;
      label141:
      paramCollection1 = new HashSet();
      break label74;
      label153:
      paramj = d;
      break label93;
      label161:
      paramDate2 = c;
    }
  }
  
  public static AccessToken a()
  {
    return d.a().b();
  }
  
  static AccessToken a(Bundle paramBundle)
  {
    List localList1 = a(paramBundle, "com.facebook.TokenCachingStrategy.Permissions");
    List localList2 = a(paramBundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
    String str2 = au.d(paramBundle);
    String str1 = str2;
    if (as.a(str2)) {
      str1 = w.i();
    }
    str2 = au.b(paramBundle);
    Object localObject = as.d(str2);
    try
    {
      localObject = ((JSONObject)localObject).getString("id");
      return new AccessToken(str2, str1, (String)localObject, localList1, localList2, au.c(paramBundle), au.a(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), au.a(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }
    catch (JSONException paramBundle) {}
    return null;
  }
  
  static AccessToken a(JSONObject paramJSONObject)
  {
    if (paramJSONObject.getInt("version") > 1) {
      throw new p("Unknown AccessToken serialization format.");
    }
    String str = paramJSONObject.getString("token");
    Date localDate1 = new Date(paramJSONObject.getLong("expires_at"));
    JSONArray localJSONArray1 = paramJSONObject.getJSONArray("permissions");
    JSONArray localJSONArray2 = paramJSONObject.getJSONArray("declined_permissions");
    Date localDate2 = new Date(paramJSONObject.getLong("last_refresh"));
    j localj = j.valueOf(paramJSONObject.getString("source"));
    return new AccessToken(str, paramJSONObject.getString("application_id"), paramJSONObject.getString("user_id"), as.a(localJSONArray1), as.a(localJSONArray2), localj, localDate1, localDate2);
  }
  
  static List<String> a(Bundle paramBundle, String paramString)
  {
    paramBundle = paramBundle.getStringArrayList(paramString);
    if (paramBundle == null) {
      return Collections.emptyList();
    }
    return Collections.unmodifiableList(new ArrayList(paramBundle));
  }
  
  public static void a(AccessToken paramAccessToken)
  {
    d.a().a(paramAccessToken);
  }
  
  private void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(" permissions:");
    if (this.f == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    paramStringBuilder.append("[");
    paramStringBuilder.append(TextUtils.join(", ", this.f));
    paramStringBuilder.append("]");
  }
  
  private String k()
  {
    if (this.h == null) {
      return "null";
    }
    if (w.a(av.b)) {
      return this.h;
    }
    return "ACCESS_TOKEN_REMOVED";
  }
  
  public String b()
  {
    return this.h;
  }
  
  public Date c()
  {
    return this.e;
  }
  
  public Set<String> d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Set<String> e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if (!(paramObject instanceof AccessToken)) {
        return false;
      }
      paramObject = (AccessToken)paramObject;
      if ((this.e.equals(((AccessToken)paramObject).e)) && (this.f.equals(((AccessToken)paramObject).f)) && (this.g.equals(((AccessToken)paramObject).g)) && (this.h.equals(((AccessToken)paramObject).h)) && (this.i == ((AccessToken)paramObject).i) && (this.j.equals(((AccessToken)paramObject).j)))
      {
        if (this.k != null) {
          break label136;
        }
        if (((AccessToken)paramObject).k != null) {}
      }
      while (!this.l.equals(((AccessToken)paramObject).l)) {
        label136:
        do
        {
          return false;
        } while (!this.k.equals(((AccessToken)paramObject).k));
      }
    }
  }
  
  public j f()
  {
    return this.i;
  }
  
  public Date g()
  {
    return this.j;
  }
  
  public String h()
  {
    return this.k;
  }
  
  public int hashCode()
  {
    int n = this.e.hashCode();
    int i1 = this.f.hashCode();
    int i2 = this.g.hashCode();
    int i3 = this.h.hashCode();
    int i4 = this.i.hashCode();
    int i5 = this.j.hashCode();
    if (this.k == null) {}
    for (int m = 0;; m = this.k.hashCode()) {
      return (m + ((((((n + 527) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31) * 31 + this.l.hashCode();
    }
  }
  
  public String i()
  {
    return this.l;
  }
  
  JSONObject j()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("version", 1);
    localJSONObject.put("token", this.h);
    localJSONObject.put("expires_at", this.e.getTime());
    localJSONObject.put("permissions", new JSONArray(this.f));
    localJSONObject.put("declined_permissions", new JSONArray(this.g));
    localJSONObject.put("last_refresh", this.j.getTime());
    localJSONObject.put("source", this.i.name());
    localJSONObject.put("application_id", this.k);
    localJSONObject.put("user_id", this.l);
    return localJSONObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{AccessToken");
    localStringBuilder.append(" token:").append(k());
    a(localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.e.getTime());
    paramParcel.writeStringList(new ArrayList(this.f));
    paramParcel.writeStringList(new ArrayList(this.g));
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i.name());
    paramParcel.writeLong(this.j.getTime());
    paramParcel.writeString(this.k);
    paramParcel.writeString(this.l);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\AccessToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */