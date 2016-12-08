package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddPlaceRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AddPlaceRequest> CREATOR = new s();
  final int a;
  private final String b;
  private final LatLng c;
  private final String d;
  private final List<Integer> e;
  private final String f;
  private final Uri g;
  
  AddPlaceRequest(int paramInt, String paramString1, LatLng paramLatLng, String paramString2, List<Integer> paramList, String paramString3, Uri paramUri)
  {
    this.a = paramInt;
    this.b = b.a(paramString1);
    this.c = ((LatLng)b.a(paramLatLng));
    this.d = b.a(paramString2);
    this.e = new ArrayList((Collection)b.a(paramList));
    if (!this.e.isEmpty()) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      b.b(bool1, "At least one place type should be provided.");
      if (TextUtils.isEmpty(paramString3))
      {
        bool1 = bool2;
        if (paramUri == null) {}
      }
      else
      {
        bool1 = true;
      }
      b.b(bool1, "One of phone number or URI should be provided.");
      this.f = paramString3;
      this.g = paramUri;
      return;
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public LatLng b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public List<Integer> d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public Uri f()
  {
    return this.g;
  }
  
  public String toString()
  {
    return br.a(this).a("name", this.b).a("latLng", this.c).a("address", this.d).a("placeTypes", this.e).a("phoneNumer", this.f).a("websiteUri", this.g).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\AddPlaceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */