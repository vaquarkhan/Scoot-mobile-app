package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActivityRecognitionRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ActivityRecognitionRequest> CREATOR = new o();
  private final int a;
  private long b;
  private boolean c;
  private WorkSource d;
  private String e;
  private int[] f;
  private boolean g;
  private String h;
  
  ActivityRecognitionRequest(int paramInt, long paramLong, boolean paramBoolean1, WorkSource paramWorkSource, String paramString1, int[] paramArrayOfInt, boolean paramBoolean2, String paramString2)
  {
    this.a = paramInt;
    this.b = paramLong;
    this.c = paramBoolean1;
    this.d = paramWorkSource;
    this.e = paramString1;
    this.f = paramArrayOfInt;
    this.g = paramBoolean2;
    this.h = paramString2;
  }
  
  public long a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public WorkSource c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public int[] e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public String g()
  {
    return this.h;
  }
  
  int h()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\ActivityRecognitionRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */