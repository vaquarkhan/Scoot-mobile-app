package com.digits.sdk.android;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ae
  implements Parcelable.Creator<ContactsUploadResult>
{
  public ContactsUploadResult a(Parcel paramParcel)
  {
    return new ContactsUploadResult(paramParcel);
  }
  
  public ContactsUploadResult[] a(int paramInt)
  {
    return new ContactsUploadResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */