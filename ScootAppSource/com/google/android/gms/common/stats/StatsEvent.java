package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent
  extends AbstractSafeParcelable
{
  public abstract long a();
  
  public abstract int b();
  
  public abstract long i();
  
  public abstract String l();
  
  public String toString()
  {
    long l1 = a();
    String str1 = String.valueOf("\t");
    int i = b();
    String str2 = String.valueOf("\t");
    long l2 = i();
    String str3 = String.valueOf(l());
    return String.valueOf(str1).length() + 51 + String.valueOf(str2).length() + String.valueOf(str3).length() + l1 + str1 + i + str2 + l2 + str3;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\StatsEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */