package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class StoredCard
  implements Parcelable
{
  public static final Parcelable.Creator<StoredCard> CREATOR = new k();
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private Boolean g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private String n;
  private int o;
  
  public StoredCard() {}
  
  protected StoredCard(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.h = paramParcel.readString();
    this.i = paramParcel.readString();
    this.j = paramParcel.readString();
    this.k = paramParcel.readString();
    this.l = paramParcel.readString();
    this.m = paramParcel.readString();
    this.n = paramParcel.readString();
    this.o = paramParcel.readInt();
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void a(Boolean paramBoolean)
  {
    this.g = paramBoolean;
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
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public void e(String paramString)
  {
    this.e = paramString;
  }
  
  public String f()
  {
    return this.i;
  }
  
  public void f(String paramString)
  {
    this.f = paramString;
  }
  
  public String g()
  {
    return this.k;
  }
  
  public void g(String paramString)
  {
    this.h = paramString;
  }
  
  public int h()
  {
    return this.o;
  }
  
  public void h(String paramString)
  {
    this.i = paramString;
  }
  
  public void i(String paramString)
  {
    this.j = paramString;
  }
  
  public void j(String paramString)
  {
    this.k = paramString;
  }
  
  public void k(String paramString)
  {
    this.l = paramString;
  }
  
  public void l(String paramString)
  {
    this.m = paramString;
  }
  
  public void m(String paramString)
  {
    this.n = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
    paramParcel.writeString(this.k);
    paramParcel.writeString(this.l);
    paramParcel.writeString(this.m);
    paramParcel.writeString(this.n);
    paramParcel.writeInt(this.o);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\StoredCard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */