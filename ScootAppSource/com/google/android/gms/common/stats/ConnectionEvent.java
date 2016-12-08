package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ConnectionEvent
  extends StatsEvent
{
  public static final Parcelable.Creator<ConnectionEvent> CREATOR = new a();
  final int a;
  private final long b;
  private int c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final long j;
  private final long k;
  private long l;
  
  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.l = -1L;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramLong2;
    this.k = paramLong3;
  }
  
  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
  }
  
  public long a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public String g()
  {
    return this.h;
  }
  
  public String h()
  {
    return this.i;
  }
  
  public long i()
  {
    return this.l;
  }
  
  public long j()
  {
    return this.k;
  }
  
  public long k()
  {
    return this.j;
  }
  
  public String l()
  {
    String str2 = String.valueOf("\t");
    String str3 = String.valueOf(c());
    String str4 = String.valueOf(d());
    String str5 = String.valueOf("\t");
    String str6 = String.valueOf(e());
    String str7 = String.valueOf(f());
    String str8 = String.valueOf("\t");
    if (this.h == null) {}
    for (String str1 = "";; str1 = this.h)
    {
      String str9 = String.valueOf("\t");
      long l1 = j();
      return String.valueOf(str2).length() + 22 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str1).length() + String.valueOf(str9).length() + str2 + str3 + "/" + str4 + str5 + str6 + "/" + str7 + str8 + str1 + str9 + l1;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\ConnectionEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */