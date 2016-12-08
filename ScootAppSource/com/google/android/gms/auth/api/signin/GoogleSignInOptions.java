package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions
  extends AbstractSafeParcelable
  implements f
{
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new g();
  public static final Scope a = new Scope("profile");
  public static final Scope b = new Scope("email");
  public static final Scope c = new Scope("openid");
  public static final GoogleSignInOptions d = new d().a().c().d();
  private static Comparator<Scope> m = new c();
  final int e;
  private final ArrayList<Scope> f;
  private Account g;
  private boolean h;
  private final boolean i;
  private final boolean j;
  private String k;
  private String l;
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this.e = paramInt;
    this.f = paramArrayList;
    this.g = paramAccount;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramString1;
    this.l = paramString2;
  }
  
  private GoogleSignInOptions(Set<Scope> paramSet, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this(2, new ArrayList(paramSet), paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2);
  }
  
  public static GoogleSignInOptions a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    HashSet localHashSet = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int i1 = paramString.length();
    int n = 0;
    while (n < i1)
    {
      localHashSet.add(new Scope(paramString.getString(n)));
      n += 1;
    }
    paramString = localJSONObject.optString("accountName", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = new Account(paramString, "com.google");; paramString = null) {
      return new GoogleSignInOptions(localHashSet, paramString, localJSONObject.getBoolean("idTokenRequested"), localJSONObject.getBoolean("serverAuthRequested"), localJSONObject.getBoolean("forceCodeForRefreshToken"), localJSONObject.optString("serverClientId", null), localJSONObject.optString("hostedDomain", null));
    }
  }
  
  private JSONObject i()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(this.f, m);
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((Scope)localIterator.next()).a());
      }
      localJSONException.put("scopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    if (this.g != null) {
      localJSONException.put("accountName", this.g.name);
    }
    localJSONException.put("idTokenRequested", this.h);
    localJSONException.put("forceCodeForRefreshToken", this.j);
    localJSONException.put("serverAuthRequested", this.i);
    if (!TextUtils.isEmpty(this.k)) {
      localJSONException.put("serverClientId", this.k);
    }
    if (!TextUtils.isEmpty(this.l)) {
      localJSONException.put("hostedDomain", this.l);
    }
    return localJSONException;
  }
  
  public ArrayList<Scope> a()
  {
    return new ArrayList(this.f);
  }
  
  public Account b()
  {
    return this.g;
  }
  
  public boolean c()
  {
    return this.h;
  }
  
  public boolean d()
  {
    return this.i;
  }
  
  public boolean e()
  {
    return this.j;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramObject = (GoogleSignInOptions)paramObject;
        if ((this.f.size() != ((GoogleSignInOptions)paramObject).a().size()) || (!this.f.containsAll(((GoogleSignInOptions)paramObject).a()))) {
          continue;
        }
        if (this.g == null)
        {
          if (((GoogleSignInOptions)paramObject).b() != null) {
            continue;
          }
          label56:
          if (!TextUtils.isEmpty(this.k)) {
            break label128;
          }
          if (!TextUtils.isEmpty(((GoogleSignInOptions)paramObject).f())) {
            continue;
          }
        }
        while ((this.j == ((GoogleSignInOptions)paramObject).e()) && (this.h == ((GoogleSignInOptions)paramObject).c()) && (this.i == ((GoogleSignInOptions)paramObject).d()))
        {
          return true;
          if (!this.g.equals(((GoogleSignInOptions)paramObject).b())) {
            break;
          }
          break label56;
          label128:
          boolean bool = this.k.equals(((GoogleSignInOptions)paramObject).f());
          if (!bool) {
            break;
          }
        }
        return false;
      }
      catch (ClassCastException paramObject) {}
    }
  }
  
  public String f()
  {
    return this.k;
  }
  
  public String g()
  {
    return this.l;
  }
  
  public String h()
  {
    return i().toString();
  }
  
  public int hashCode()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((Scope)localIterator.next()).a());
    }
    Collections.sort(localArrayList);
    return new j().a(localArrayList).a(this.g).a(this.k).a(this.j).a(this.h).a(this.i).a();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */