package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppNotification
  implements Parcelable
{
  public static final Parcelable.Creator<InAppNotification> CREATOR = new w();
  private static final Pattern k = Pattern.compile("(\\.[^./]+$)");
  private Bitmap a;
  private final JSONObject b;
  private final int c;
  private final int d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  
  public InAppNotification(Parcel paramParcel)
  {
    Object localObject = new JSONObject();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramParcel.readString());
      localObject = localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
      }
    }
    this.b = ((JSONObject)localObject);
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.g = paramParcel.readString();
    this.h = paramParcel.readString();
    this.i = paramParcel.readString();
    this.j = paramParcel.readString();
    this.a = ((Bitmap)paramParcel.readParcelable(Bitmap.class.getClassLoader()));
  }
  
  InAppNotification(JSONObject paramJSONObject)
  {
    try
    {
      this.b = paramJSONObject;
      this.c = paramJSONObject.getInt("id");
      this.d = paramJSONObject.getInt("message_id");
      this.e = paramJSONObject.getString("type");
      this.f = paramJSONObject.getString("title");
      this.g = paramJSONObject.getString("body");
      this.h = paramJSONObject.getString("image_url");
      this.a = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
      this.i = paramJSONObject.getString("cta");
      this.j = paramJSONObject.getString("cta_url");
      return;
    }
    catch (JSONException paramJSONObject)
    {
      throw new j("Notification JSON was unexpected or bad", paramJSONObject);
    }
  }
  
  static String a(String paramString1, String paramString2)
  {
    Matcher localMatcher = k.matcher(paramString1);
    if (localMatcher.find()) {
      paramString1 = localMatcher.replaceFirst(paramString2 + "$1");
    }
    return paramString1;
  }
  
  JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("campaign_id", b());
      localJSONObject.put("message_id", c());
      localJSONObject.put("message_type", "inapp");
      localJSONObject.put("message_subtype", this.e);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      Log.e("MixpanelAPI.InAppNotif", "Impossible JSON Exception", localJSONException);
    }
    return localJSONObject;
  }
  
  void a(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public x d()
  {
    if (x.b.toString().equals(this.e)) {
      return x.b;
    }
    if (x.c.toString().equals(this.e)) {
      return x.c;
    }
    return x.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public String g()
  {
    return this.h;
  }
  
  public String h()
  {
    return a(this.h, "@2x");
  }
  
  public String i()
  {
    return a(this.h, "@4x");
  }
  
  public String j()
  {
    return this.i;
  }
  
  public String k()
  {
    return this.j;
  }
  
  public Bitmap l()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b.toString());
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
    paramParcel.writeParcelable(this.a, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\InAppNotification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */