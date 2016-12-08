package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class WakeLockEvent
  extends StatsEvent
{
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new i();
  final int a;
  private final long b;
  private int c;
  private final String d;
  private final String e;
  private final String f;
  private final int g;
  private final List<String> h;
  private final String i;
  private final long j;
  private int k;
  private final String l;
  private final float m;
  private final long n;
  private long o;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List<String> paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString3;
    this.f = paramString5;
    this.g = paramInt3;
    this.o = -1L;
    this.h = paramList;
    this.i = paramString2;
    this.j = paramLong2;
    this.k = paramInt4;
    this.l = paramString4;
    this.m = paramFloat;
    this.n = paramLong3;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List<String> paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5)
  {
    this(2, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat, paramLong3, paramString5);
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
  
  public int f()
  {
    return this.g;
  }
  
  public List<String> g()
  {
    return this.h;
  }
  
  public String h()
  {
    return this.i;
  }
  
  public long i()
  {
    return this.o;
  }
  
  public long j()
  {
    return this.j;
  }
  
  public int k()
  {
    return this.k;
  }
  
  public String l()
  {
    String str5 = String.valueOf("\t");
    String str6 = String.valueOf(c());
    String str7 = String.valueOf("\t");
    int i1 = f();
    String str8 = String.valueOf("\t");
    String str1;
    String str9;
    int i2;
    String str10;
    String str2;
    label76:
    String str11;
    String str3;
    label94:
    String str12;
    float f1;
    String str13;
    if (g() == null)
    {
      str1 = "";
      str9 = String.valueOf("\t");
      i2 = k();
      str10 = String.valueOf("\t");
      if (d() != null) {
        break label345;
      }
      str2 = "";
      str11 = String.valueOf("\t");
      if (m() != null) {
        break label354;
      }
      str3 = "";
      str12 = String.valueOf("\t");
      f1 = n();
      str13 = String.valueOf("\t");
      if (e() != null) {
        break label363;
      }
    }
    label345:
    label354:
    label363:
    for (String str4 = "";; str4 = e())
    {
      return String.valueOf(str5).length() + 37 + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str1).length() + String.valueOf(str9).length() + String.valueOf(str10).length() + String.valueOf(str2).length() + String.valueOf(str11).length() + String.valueOf(str3).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str4).length() + str5 + str6 + str7 + i1 + str8 + str1 + str9 + i2 + str10 + str2 + str11 + str3 + str12 + f1 + str13 + str4;
      str1 = TextUtils.join(",", g());
      break;
      str2 = d();
      break label76;
      str3 = m();
      break label94;
    }
  }
  
  public String m()
  {
    return this.l;
  }
  
  public float n()
  {
    return this.m;
  }
  
  public long o()
  {
    return this.n;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\WakeLockEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */