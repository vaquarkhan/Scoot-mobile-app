package com.google.android.gms.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.a.m;
import com.google.android.gms.common.a.o;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.stats.h;

public final class fl
{
  private static String a = "WakeLock";
  private static String b = "*gcore*:";
  private static boolean c = false;
  private final PowerManager.WakeLock d;
  private WorkSource e;
  private final int f;
  private final String g;
  private final String h;
  private final String i;
  private final Context j;
  private boolean k = true;
  private int l;
  private int m;
  
  public fl(Context paramContext, int paramInt, String paramString) {}
  
  @SuppressLint({"UnwrappedWakeLock"})
  public fl(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this(paramContext, paramInt, paramString1, paramString2, paramString3, null);
  }
  
  @SuppressLint({"UnwrappedWakeLock"})
  public fl(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    b.a(paramString1, "Wake lock name can NOT be empty");
    this.f = paramInt;
    this.h = paramString2;
    this.i = paramString4;
    this.j = paramContext.getApplicationContext();
    if (!"com.google.android.gms".equals(paramContext.getPackageName()))
    {
      paramString2 = String.valueOf(b);
      paramString4 = String.valueOf(paramString1);
      if (paramString4.length() != 0) {
        paramString2 = paramString2.concat(paramString4);
      }
    }
    for (this.g = paramString2;; this.g = paramString1)
    {
      this.d = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(paramInt, paramString1);
      if (o.a(this.j))
      {
        paramString1 = paramString3;
        if (m.a(paramString3)) {
          paramString1 = paramContext.getPackageName();
        }
        this.e = o.a(paramContext, paramString1);
        a(this.e);
      }
      return;
      paramString2 = new String(paramString2);
      break;
    }
  }
  
  private String a(String paramString, boolean paramBoolean)
  {
    if (this.k)
    {
      if (paramBoolean) {
        return paramString;
      }
      return this.h;
    }
    return this.h;
  }
  
  private void a(String paramString)
  {
    boolean bool = b(paramString);
    paramString = a(paramString, bool);
    try
    {
      if (this.k)
      {
        int n = this.l - 1;
        this.l = n;
        if ((n == 0) || (bool)) {}
      }
      else
      {
        if ((this.k) || (this.m != 1)) {
          break label107;
        }
      }
      com.google.android.gms.common.stats.j.a().a(this.j, h.a(this.d, paramString), 8, this.g, paramString, this.i, this.f, o.b(this.e));
      this.m -= 1;
      label107:
      return;
    }
    finally {}
  }
  
  private void a(String paramString, long paramLong)
  {
    boolean bool = b(paramString);
    paramString = a(paramString, bool);
    try
    {
      if (this.k)
      {
        int n = this.l;
        this.l = (n + 1);
        if ((n == 0) || (bool)) {}
      }
      else
      {
        if ((this.k) || (this.m != 0)) {
          break label113;
        }
      }
      com.google.android.gms.common.stats.j.a().a(this.j, h.a(this.d, paramString), 7, this.g, paramString, this.i, this.f, o.b(this.e), paramLong);
      this.m += 1;
      label113:
      return;
    }
    finally {}
  }
  
  private boolean b(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.h));
  }
  
  public void a()
  {
    a(null);
    this.d.release();
  }
  
  public void a(long paramLong)
  {
    String str2;
    if ((!com.google.android.gms.common.a.j.c()) && (this.k))
    {
      str2 = a;
      str1 = String.valueOf(this.g);
      if (str1.length() == 0) {
        break label62;
      }
    }
    label62:
    for (String str1 = "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ".concat(str1);; str1 = new String("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: "))
    {
      Log.wtf(str2, str1);
      a(null, paramLong);
      this.d.acquire(paramLong);
      return;
    }
  }
  
  public void a(WorkSource paramWorkSource)
  {
    if ((paramWorkSource != null) && (o.a(this.j)))
    {
      if (this.e == null) {
        break label42;
      }
      this.e.add(paramWorkSource);
    }
    for (;;)
    {
      this.d.setWorkSource(this.e);
      return;
      label42:
      this.e = paramWorkSource;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.d.setReferenceCounted(paramBoolean);
    this.k = paramBoolean;
  }
  
  public boolean b()
  {
    return this.d.isHeld();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */