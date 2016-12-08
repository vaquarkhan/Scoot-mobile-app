package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;

public class DetectedActivity
  extends AbstractSafeParcelable
{
  public static final c CREATOR = new c();
  public static final Comparator<DetectedActivity> a = new b();
  public static final int[] b = { 9, 10 };
  public static final int[] c = { 0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14 };
  int d;
  int e;
  private final int f;
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.f = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    default: 
      return Integer.toString(paramInt);
    case 0: 
      return "IN_VEHICLE";
    case 1: 
      return "ON_BICYCLE";
    case 2: 
      return "ON_FOOT";
    case 3: 
      return "STILL";
    case 4: 
      return "UNKNOWN";
    case 5: 
      return "TILTING";
    case 7: 
      return "WALKING";
    }
    return "RUNNING";
  }
  
  private int b(int paramInt)
  {
    int i = paramInt;
    if (paramInt > 15) {
      i = 4;
    }
    return i;
  }
  
  public int a()
  {
    return b(this.d);
  }
  
  public int b()
  {
    return this.e;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (DetectedActivity)paramObject;
    } while ((this.d == ((DetectedActivity)paramObject).d) && (this.e == ((DetectedActivity)paramObject).e));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.d), Integer.valueOf(this.e) });
  }
  
  public String toString()
  {
    String str = String.valueOf(a(a()));
    int i = this.e;
    return String.valueOf(str).length() + 48 + "DetectedActivity [type=" + str + ", confidence=" + i + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\DetectedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */