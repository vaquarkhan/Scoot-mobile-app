package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class a
  implements Parcelable.Creator<Command>
{
  @Deprecated
  public Command a(Parcel paramParcel)
  {
    return new Command(paramParcel);
  }
  
  @Deprecated
  public Command[] a(int paramInt)
  {
    return new Command[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */