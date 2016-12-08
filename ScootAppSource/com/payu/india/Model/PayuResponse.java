package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class PayuResponse
  implements Parcelable
{
  public static final Parcelable.Creator<PayuResponse> CREATOR = new i();
  private ArrayList<StoredCard> a;
  private ArrayList<Emi> b;
  private ArrayList<PaymentDetails> c;
  private ArrayList<PaymentDetails> d;
  private ArrayList<PaymentDetails> e;
  private ArrayList<PaymentDetails> f;
  private ArrayList<PaymentDetails> g;
  private ArrayList<PaymentDetails> h;
  private ArrayList<PaymentDetails> i;
  private PostData j;
  private CardInformation k;
  private PayuOffer l;
  private ArrayList<TransactionDetails> m;
  
  public PayuResponse() {}
  
  protected PayuResponse(Parcel paramParcel)
  {
    this.a = paramParcel.createTypedArrayList(StoredCard.CREATOR);
    this.b = paramParcel.createTypedArrayList(Emi.CREATOR);
    this.c = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.d = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.e = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.f = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.g = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.h = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.i = paramParcel.createTypedArrayList(PaymentDetails.CREATOR);
    this.j = ((PostData)paramParcel.readParcelable(PostData.class.getClassLoader()));
    this.k = ((CardInformation)paramParcel.readParcelable(CardInformation.class.getClassLoader()));
    this.l = ((PayuOffer)paramParcel.readParcelable(PayuOffer.class.getClassLoader()));
    this.m = paramParcel.createTypedArrayList(TransactionDetails.CREATOR);
  }
  
  public ArrayList<StoredCard> a()
  {
    return this.a;
  }
  
  public void a(PostData paramPostData)
  {
    this.j = paramPostData;
  }
  
  public void a(ArrayList<StoredCard> paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  public ArrayList<Emi> b()
  {
    return this.b;
  }
  
  public void b(ArrayList<Emi> paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  public ArrayList<PaymentDetails> c()
  {
    return this.c;
  }
  
  public void c(ArrayList<PaymentDetails> paramArrayList)
  {
    this.c = paramArrayList;
  }
  
  public ArrayList<PaymentDetails> d()
  {
    return this.d;
  }
  
  public void d(ArrayList<PaymentDetails> paramArrayList)
  {
    this.d = paramArrayList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ArrayList<PaymentDetails> e()
  {
    return this.e;
  }
  
  public void e(ArrayList<PaymentDetails> paramArrayList)
  {
    this.e = paramArrayList;
  }
  
  public ArrayList<PaymentDetails> f()
  {
    return this.f;
  }
  
  public void f(ArrayList<PaymentDetails> paramArrayList)
  {
    this.f = paramArrayList;
  }
  
  public PostData g()
  {
    return this.j;
  }
  
  public void g(ArrayList<PaymentDetails> paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  public Boolean h()
  {
    if ((this.a != null) && (this.a.size() > 0)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public void h(ArrayList<PaymentDetails> paramArrayList)
  {
    this.h = paramArrayList;
  }
  
  public Boolean i()
  {
    if ((this.b != null) && (this.b.size() > 0)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public void i(ArrayList<PaymentDetails> paramArrayList)
  {
    this.i = paramArrayList;
  }
  
  public Boolean j()
  {
    if ((this.c != null) && (this.c.size() > 0)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public Boolean k()
  {
    if ((this.d != null) && (this.d.size() > 0)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public Boolean l()
  {
    if ((this.e != null) && (this.e.size() > 0)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public Boolean m()
  {
    if ((this.f != null) && (this.f.size() > 0)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public Boolean n()
  {
    if (this.j != null) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedList(this.a);
    paramParcel.writeTypedList(this.b);
    paramParcel.writeTypedList(this.c);
    paramParcel.writeTypedList(this.d);
    paramParcel.writeTypedList(this.e);
    paramParcel.writeTypedList(this.f);
    paramParcel.writeTypedList(this.g);
    paramParcel.writeTypedList(this.h);
    paramParcel.writeTypedList(this.i);
    paramParcel.writeParcelable(this.j, paramInt);
    paramParcel.writeParcelable(this.k, paramInt);
    paramParcel.writeParcelable(this.l, paramInt);
    paramParcel.writeTypedList(this.m);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\PayuResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */