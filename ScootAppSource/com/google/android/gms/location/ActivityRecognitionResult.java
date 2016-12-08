package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ActivityRecognitionResult
  extends AbstractSafeParcelable
{
  public static final a CREATOR = new a();
  List<DetectedActivity> a;
  long b;
  long c;
  int d;
  Bundle e;
  private final int f;
  
  public ActivityRecognitionResult(int paramInt1, List<DetectedActivity> paramList, long paramLong1, long paramLong2, int paramInt2, Bundle paramBundle)
  {
    this.f = paramInt1;
    this.a = paramList;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramInt2;
    this.e = paramBundle;
  }
  
  private static boolean a(Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((paramBundle1 == null) && (paramBundle2 == null)) {
      return true;
    }
    if (((paramBundle1 == null) && (paramBundle2 != null)) || ((paramBundle1 != null) && (paramBundle2 == null))) {
      return false;
    }
    if (paramBundle1.size() != paramBundle2.size()) {
      return false;
    }
    Iterator localIterator = paramBundle1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramBundle2.containsKey(str)) {
        return false;
      }
      if (paramBundle1.get(str) == null)
      {
        if (paramBundle2.get(str) != null) {
          return false;
        }
      }
      else if ((paramBundle1.get(str) instanceof Bundle))
      {
        if (!a(paramBundle1.getBundle(str), paramBundle2.getBundle(str))) {
          return false;
        }
      }
      else if (!paramBundle1.get(str).equals(paramBundle2.get(str))) {
        return false;
      }
    }
    return true;
  }
  
  public int a()
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
      paramObject = (ActivityRecognitionResult)paramObject;
    } while ((this.b == ((ActivityRecognitionResult)paramObject).b) && (this.c == ((ActivityRecognitionResult)paramObject).c) && (this.d == ((ActivityRecognitionResult)paramObject).d) && (br.a(this.a, ((ActivityRecognitionResult)paramObject).a)) && (a(this.e, ((ActivityRecognitionResult)paramObject).e)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), this.a, this.e });
  }
  
  public String toString()
  {
    String str = String.valueOf(this.a);
    long l1 = this.b;
    long l2 = this.c;
    return String.valueOf(str).length() + 124 + "ActivityRecognitionResult [probableActivities=" + str + ", timeMillis=" + l1 + ", elapsedRealtimeMillis=" + l2 + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\ActivityRecognitionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */