package com.google.android.gms.b;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.ab;
import com.google.android.gms.common.internal.b;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ad
  extends ab<ad>
{
  private String a;
  private int b;
  private int c;
  private String d;
  private String e;
  private boolean f;
  private boolean g;
  
  public ad()
  {
    this(false);
  }
  
  public ad(boolean paramBoolean)
  {
    this(paramBoolean, a());
  }
  
  public ad(boolean paramBoolean, int paramInt)
  {
    b.a(paramInt);
    this.b = paramInt;
    this.g = paramBoolean;
  }
  
  static int a()
  {
    UUID localUUID = UUID.randomUUID();
    int i = (int)(localUUID.getLeastSignificantBits() & 0x7FFFFFFF);
    if (i != 0) {}
    int j;
    do
    {
      return i;
      j = (int)(localUUID.getMostSignificantBits() & 0x7FFFFFFF);
      i = j;
    } while (j != 0);
    Log.e("GAv4", "UUID.randomUUID() returned 0.");
    return Integer.MAX_VALUE;
  }
  
  private void e() {}
  
  public void a(int paramInt)
  {
    e();
    this.b = paramInt;
  }
  
  public void a(ad paramad)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramad.a(this.a);
    }
    if (this.b != 0) {
      paramad.a(this.b);
    }
    if (this.c != 0) {
      paramad.b(this.c);
    }
    if (!TextUtils.isEmpty(this.d)) {
      paramad.b(this.d);
    }
    if (!TextUtils.isEmpty(this.e)) {
      paramad.c(this.e);
    }
    if (this.f) {
      paramad.b(this.f);
    }
    if (this.g) {
      paramad.a(this.g);
    }
  }
  
  public void a(String paramString)
  {
    e();
    this.a = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    e();
    this.g = paramBoolean;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    e();
    this.c = paramInt;
  }
  
  public void b(String paramString)
  {
    e();
    this.d = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    e();
    this.f = paramBoolean;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    e();
    if (TextUtils.isEmpty(paramString))
    {
      this.e = null;
      return;
    }
    this.e = paramString;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("screenName", this.a);
    localHashMap.put("interstitial", Boolean.valueOf(this.f));
    localHashMap.put("automatic", Boolean.valueOf(this.g));
    localHashMap.put("screenId", Integer.valueOf(this.b));
    localHashMap.put("referrerScreenId", Integer.valueOf(this.c));
    localHashMap.put("referrerScreenName", this.d);
    localHashMap.put("referrerUri", this.e);
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */