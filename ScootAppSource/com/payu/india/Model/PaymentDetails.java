package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PaymentDetails
  implements Parcelable
{
  public static final Parcelable.Creator<PaymentDetails> CREATOR = new d();
  private String a;
  private String b;
  private String c;
  private String d;
  
  public PaymentDetails() {}
  
  private PaymentDetails(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.a = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\PaymentDetails.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */