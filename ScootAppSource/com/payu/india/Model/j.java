package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class j
  implements Parcelable.Creator<PostData>
{
  public PostData a(Parcel paramParcel)
  {
    return new PostData(paramParcel, null);
  }
  
  public PostData[] a(int paramInt)
  {
    return new PostData[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */