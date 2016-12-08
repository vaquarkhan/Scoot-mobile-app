package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.b.as;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile
  implements Parcelable
{
  public static final Parcelable.Creator<Profile> CREATOR = new ax();
  private final String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final Uri f;
  
  private Profile(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    paramParcel = paramParcel.readString();
    if (paramParcel == null) {}
    for (paramParcel = null;; paramParcel = Uri.parse(paramParcel))
    {
      this.f = paramParcel;
      return;
    }
  }
  
  public Profile(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Uri paramUri)
  {
    com.facebook.b.az.a(paramString1, "id");
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramUri;
  }
  
  Profile(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.optString("id", null);
    this.b = paramJSONObject.optString("first_name", null);
    this.c = paramJSONObject.optString("middle_name", null);
    this.d = paramJSONObject.optString("last_name", null);
    this.e = paramJSONObject.optString("name", null);
    paramJSONObject = paramJSONObject.optString("link_uri", null);
    if (paramJSONObject == null) {}
    for (paramJSONObject = (JSONObject)localObject;; paramJSONObject = Uri.parse(paramJSONObject))
    {
      this.f = paramJSONObject;
      return;
    }
  }
  
  public static Profile a()
  {
    return az.a().b();
  }
  
  public static void a(Profile paramProfile)
  {
    az.a().a(paramProfile);
  }
  
  public static void b()
  {
    AccessToken localAccessToken = AccessToken.a();
    if (localAccessToken == null)
    {
      a(null);
      return;
    }
    as.a(localAccessToken.b(), new aw());
  }
  
  JSONObject c()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("id", this.a);
      localJSONObject.put("first_name", this.b);
      localJSONObject.put("middle_name", this.c);
      localJSONObject.put("last_name", this.d);
      localJSONObject.put("name", this.e);
      if (this.f != null) {
        localJSONObject.put("link_uri", this.f.toString());
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return true;
              if (!(paramObject instanceof Profile)) {
                return false;
              }
              paramObject = (Profile)paramObject;
              if ((!this.a.equals(((Profile)paramObject).a)) || (this.b != null)) {
                break;
              }
            } while (((Profile)paramObject).b == null);
            return false;
            if ((!this.b.equals(((Profile)paramObject).b)) || (this.c != null)) {
              break;
            }
          } while (((Profile)paramObject).c == null);
          return false;
          if ((!this.c.equals(((Profile)paramObject).c)) || (this.d != null)) {
            break;
          }
        } while (((Profile)paramObject).d == null);
        return false;
        if ((!this.d.equals(((Profile)paramObject).d)) || (this.e != null)) {
          break;
        }
      } while (((Profile)paramObject).e == null);
      return false;
      if ((!this.e.equals(((Profile)paramObject).e)) || (this.f != null)) {
        break;
      }
    } while (((Profile)paramObject).f == null);
    return false;
    return this.f.equals(((Profile)paramObject).f);
  }
  
  public int hashCode()
  {
    int j = this.a.hashCode() + 527;
    int i = j;
    if (this.b != null) {
      i = j * 31 + this.b.hashCode();
    }
    j = i;
    if (this.c != null) {
      j = i * 31 + this.c.hashCode();
    }
    i = j;
    if (this.d != null) {
      i = j * 31 + this.d.hashCode();
    }
    j = i;
    if (this.e != null) {
      j = i * 31 + this.e.hashCode();
    }
    i = j;
    if (this.f != null) {
      i = j * 31 + this.f.hashCode();
    }
    return i;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    if (this.f == null) {}
    for (String str = null;; str = this.f.toString())
    {
      paramParcel.writeString(str);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\Profile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */