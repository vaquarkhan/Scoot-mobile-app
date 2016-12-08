package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class t
  implements Parcelable.Creator<AutocompleteFilter>
{
  static void a(AutocompleteFilter paramAutocompleteFilter, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramAutocompleteFilter.b);
    c.a(paramParcel, 2, paramAutocompleteFilter.c, false);
    c.a(paramParcel, 1000, paramAutocompleteFilter.a);
    c.a(paramParcel, paramInt);
  }
  
  public AutocompleteFilter a(Parcel paramParcel)
  {
    boolean bool = false;
    int j = a.b(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        bool = a.c(paramParcel, k);
        break;
      case 2: 
        localArrayList = a.q(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AutocompleteFilter(i, bool, localArrayList);
  }
  
  public AutocompleteFilter[] a(int paramInt)
  {
    return new AutocompleteFilter[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */