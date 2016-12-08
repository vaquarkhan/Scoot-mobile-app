package com.digits.sdk.android;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ContactsUploadResult
  implements Parcelable
{
  public static final Parcelable.Creator<ContactsUploadResult> CREATOR = new ae();
  public final int a;
  public final int b;
  
  ContactsUploadResult(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  ContactsUploadResult(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ContactsUploadResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */