package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PostData
  implements Parcelable
{
  public static final Parcelable.Creator<PostData> CREATOR = new j();
  private String a;
  private String b;
  private int c;
  
  public PostData() {}
  
  private PostData(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.b = paramParcel.readString();
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\PostData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */