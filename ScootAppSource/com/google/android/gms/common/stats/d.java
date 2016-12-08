package com.google.android.gms.common.stats;

import com.google.android.gms.b.ec;

public final class d
{
  public static ec<Integer> a = ec.a("gms:common:stats:connections:level", Integer.valueOf(f.b));
  public static ec<String> b = ec.a("gms:common:stats:connections:ignored_calling_processes", "");
  public static ec<String> c = ec.a("gms:common:stats:connections:ignored_calling_services", "");
  public static ec<String> d = ec.a("gms:common:stats:connections:ignored_target_processes", "");
  public static ec<String> e = ec.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
  public static ec<Long> f = ec.a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000L));
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */