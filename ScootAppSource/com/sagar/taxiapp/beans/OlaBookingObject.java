package com.sagar.taxiapp.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class OlaBookingObject
  implements Parcelable
{
  public static final Parcelable.Creator<OlaBookingObject> CREATOR = new n();
  protected int a;
  protected String b;
  protected String c;
  protected String d;
  protected String e;
  protected String f;
  protected String g;
  protected String h;
  protected String i;
  protected String j;
  protected String k;
  protected String l;
  protected float m;
  protected String n;
  protected String o;
  protected String p;
  
  public OlaBookingObject() {}
  
  public OlaBookingObject(Parcel paramParcel)
  {
    a(paramParcel);
  }
  
  private void a(Parcel paramParcel)
  {
    this.h = paramParcel.readString();
    this.f = paramParcel.readString();
    this.e = paramParcel.readString();
    this.i = paramParcel.readString();
    this.g = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.j = paramParcel.readString();
    this.k = paramParcel.readString();
    this.m = paramParcel.readFloat();
    this.a = paramParcel.readInt();
    this.l = paramParcel.readString();
    this.d = paramParcel.readString();
    this.n = paramParcel.readString();
  }
  
  public String a()
  {
    return this.p;
  }
  
  public void a(float paramFloat)
  {
    this.m = paramFloat;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(String paramString)
  {
    this.p = paramString;
  }
  
  public String b()
  {
    return this.o;
  }
  
  public void b(String paramString)
  {
    this.o = paramString;
  }
  
  public int c()
  {
    return this.a;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public String d()
  {
    return this.b;
  }
  
  public void d(String paramString)
  {
    this.c = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.c;
  }
  
  public void e(String paramString)
  {
    this.d = paramString;
  }
  
  public String f()
  {
    return this.d;
  }
  
  public void f(String paramString)
  {
    this.f = paramString;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public void g(String paramString)
  {
    this.g = paramString;
  }
  
  public String h()
  {
    return this.l;
  }
  
  public void h(String paramString)
  {
    this.l = paramString;
  }
  
  public float i()
  {
    return this.m;
  }
  
  public void i(String paramString)
  {
    this.n = paramString;
  }
  
  public String j()
  {
    return this.n;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.j);
    paramParcel.writeString(this.k);
    paramParcel.writeFloat(this.m);
    paramParcel.writeFloat(this.a);
    paramParcel.writeString(this.l);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.n);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\OlaBookingObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */