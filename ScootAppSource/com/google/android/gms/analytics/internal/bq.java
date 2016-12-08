package com.google.android.gms.analytics.internal;

import com.google.android.gms.b.ec;
import com.google.android.gms.common.internal.b;

public final class bq<V>
{
  private final V a;
  private final ec<V> b;
  
  private bq(ec<V> paramec, V paramV)
  {
    b.a(paramec);
    this.b = paramec;
    this.a = paramV;
  }
  
  static bq<Float> a(String paramString, float paramFloat)
  {
    return a(paramString, paramFloat, paramFloat);
  }
  
  static bq<Float> a(String paramString, float paramFloat1, float paramFloat2)
  {
    return new bq(ec.a(paramString, Float.valueOf(paramFloat2)), Float.valueOf(paramFloat1));
  }
  
  static bq<Integer> a(String paramString, int paramInt)
  {
    return a(paramString, paramInt, paramInt);
  }
  
  static bq<Integer> a(String paramString, int paramInt1, int paramInt2)
  {
    return new bq(ec.a(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
  }
  
  static bq<Long> a(String paramString, long paramLong)
  {
    return a(paramString, paramLong, paramLong);
  }
  
  static bq<Long> a(String paramString, long paramLong1, long paramLong2)
  {
    return new bq(ec.a(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
  }
  
  static bq<String> a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, paramString2);
  }
  
  static bq<String> a(String paramString1, String paramString2, String paramString3)
  {
    return new bq(ec.a(paramString1, paramString3), paramString2);
  }
  
  static bq<Boolean> a(String paramString, boolean paramBoolean)
  {
    return a(paramString, paramBoolean, paramBoolean);
  }
  
  static bq<Boolean> a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new bq(ec.a(paramString, paramBoolean2), Boolean.valueOf(paramBoolean1));
  }
  
  public V a()
  {
    return (V)this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */