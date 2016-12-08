package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Survey
  implements Parcelable
{
  public static Parcelable.Creator<Survey> a = new be();
  private final JSONObject b;
  private final int c;
  private final int d;
  private final List<bf> e;
  
  Survey(JSONObject paramJSONObject)
  {
    try
    {
      this.b = paramJSONObject;
      this.c = paramJSONObject.getInt("id");
      this.d = paramJSONObject.getJSONArray("collections").getJSONObject(0).getInt("id");
      paramJSONObject = paramJSONObject.getJSONArray("questions");
      if (paramJSONObject.length() == 0) {
        throw new j("Survey has no questions.");
      }
    }
    catch (JSONException paramJSONObject)
    {
      throw new j("Survey JSON was unexpected or bad", paramJSONObject);
    }
    ArrayList localArrayList = new ArrayList(paramJSONObject.length());
    while (i < paramJSONObject.length())
    {
      localArrayList.add(new bf(this, paramJSONObject.getJSONObject(i), null));
      i += 1;
    }
    this.e = Collections.unmodifiableList(localArrayList);
  }
  
  String a()
  {
    return this.b.toString();
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public List<bf> d()
  {
    return this.e;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\Survey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */