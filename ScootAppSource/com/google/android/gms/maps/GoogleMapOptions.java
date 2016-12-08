package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.af;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final i CREATOR = new i();
  private final int a;
  private Boolean b;
  private Boolean c;
  private int d = -1;
  private CameraPosition e;
  private Boolean f;
  private Boolean g;
  private Boolean h;
  private Boolean i;
  private Boolean j;
  private Boolean k;
  private Boolean l;
  private Boolean m;
  private Boolean n;
  
  public GoogleMapOptions()
  {
    this.a = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10, byte paramByte11)
  {
    this.a = paramInt1;
    this.b = af.a(paramByte1);
    this.c = af.a(paramByte2);
    this.d = paramInt2;
    this.e = paramCameraPosition;
    this.f = af.a(paramByte3);
    this.g = af.a(paramByte4);
    this.h = af.a(paramByte5);
    this.i = af.a(paramByte6);
    this.j = af.a(paramByte7);
    this.k = af.a(paramByte8);
    this.l = af.a(paramByte9);
    this.m = af.a(paramByte10);
    this.n = af.a(paramByte11);
  }
  
  public static GoogleMapOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.MapAttrs);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(R.styleable.MapAttrs_mapType)) {
      localGoogleMapOptions.a(localTypedArray.getInt(R.styleable.MapAttrs_mapType, -1));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
      localGoogleMapOptions.a(localTypedArray.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
      localGoogleMapOptions.b(localTypedArray.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiCompass)) {
      localGoogleMapOptions.d(localTypedArray.getBoolean(R.styleable.MapAttrs_uiCompass, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
      localGoogleMapOptions.h(localTypedArray.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
      localGoogleMapOptions.e(localTypedArray.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
      localGoogleMapOptions.g(localTypedArray.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
      localGoogleMapOptions.f(localTypedArray.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
      localGoogleMapOptions.c(localTypedArray.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_liteMode)) {
      localGoogleMapOptions.i(localTypedArray.getBoolean(R.styleable.MapAttrs_liteMode, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
      localGoogleMapOptions.j(localTypedArray.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
      localGoogleMapOptions.k(localTypedArray.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
    }
    localGoogleMapOptions.a(CameraPosition.a(paramContext, paramAttributeSet));
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }
  
  int a()
  {
    return this.a;
  }
  
  public GoogleMapOptions a(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public GoogleMapOptions a(CameraPosition paramCameraPosition)
  {
    this.e = paramCameraPosition;
    return this;
  }
  
  public GoogleMapOptions a(boolean paramBoolean)
  {
    this.b = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte b()
  {
    return af.a(this.b);
  }
  
  public GoogleMapOptions b(boolean paramBoolean)
  {
    this.c = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte c()
  {
    return af.a(this.c);
  }
  
  public GoogleMapOptions c(boolean paramBoolean)
  {
    this.f = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte d()
  {
    return af.a(this.f);
  }
  
  public GoogleMapOptions d(boolean paramBoolean)
  {
    this.g = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  byte e()
  {
    return af.a(this.g);
  }
  
  public GoogleMapOptions e(boolean paramBoolean)
  {
    this.h = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte f()
  {
    return af.a(this.h);
  }
  
  public GoogleMapOptions f(boolean paramBoolean)
  {
    this.i = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte g()
  {
    return af.a(this.i);
  }
  
  public GoogleMapOptions g(boolean paramBoolean)
  {
    this.j = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte h()
  {
    return af.a(this.j);
  }
  
  public GoogleMapOptions h(boolean paramBoolean)
  {
    this.k = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte i()
  {
    return af.a(this.k);
  }
  
  public GoogleMapOptions i(boolean paramBoolean)
  {
    this.l = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte j()
  {
    return af.a(this.l);
  }
  
  public GoogleMapOptions j(boolean paramBoolean)
  {
    this.m = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte k()
  {
    return af.a(this.m);
  }
  
  public GoogleMapOptions k(boolean paramBoolean)
  {
    this.n = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte l()
  {
    return af.a(this.n);
  }
  
  public int m()
  {
    return this.d;
  }
  
  public CameraPosition n()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\GoogleMapOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */