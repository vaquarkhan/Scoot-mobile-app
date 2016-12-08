package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.a.d;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Set;

public final class UserDataType
  extends AbstractSafeParcelable
{
  public static final ai CREATOR = new ai();
  public static final UserDataType a = a("test_type", 1);
  public static final UserDataType b = a("labeled_place", 6);
  public static final UserDataType c = a("here_content", 7);
  public static final Set<UserDataType> d = d.a(a, b, c);
  final int e;
  final String f;
  final int g;
  
  UserDataType(int paramInt1, String paramString, int paramInt2)
  {
    b.a(paramString);
    this.e = paramInt1;
    this.f = paramString;
    this.g = paramInt2;
  }
  
  private static UserDataType a(String paramString, int paramInt)
  {
    return new UserDataType(0, paramString, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof UserDataType)) {
        return false;
      }
      paramObject = (UserDataType)paramObject;
    } while ((this.f.equals(((UserDataType)paramObject).f)) && (this.g == ((UserDataType)paramObject).g));
    return false;
  }
  
  public int hashCode()
  {
    return this.f.hashCode();
  }
  
  public String toString()
  {
    return this.f;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ai.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\UserDataType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */