package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.a.m;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.f;

public final class c
{
  private final String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  
  private c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    if (!m.a(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      b.a(bool, "ApplicationId must be set.");
      this.b = paramString1;
      this.a = paramString2;
      this.c = paramString3;
      this.d = paramString4;
      this.e = paramString5;
      this.f = paramString6;
      return;
    }
  }
  
  public static c a(Context paramContext)
  {
    paramContext = new f(paramContext);
    String str = paramContext.a("google_app_id");
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return new c(str, paramContext.a("google_api_key"), paramContext.a("firebase_database_url"), paramContext.a("ga_trackingId"), paramContext.a("gcm_defaultSenderId"), paramContext.a("google_storage_bucket"));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c)) {}
    do
    {
      return false;
      paramObject = (c)paramObject;
    } while ((!br.a(this.b, ((c)paramObject).b)) || (!br.a(this.a, ((c)paramObject).a)) || (!br.a(this.c, ((c)paramObject).c)) || (!br.a(this.d, ((c)paramObject).d)) || (!br.a(this.e, ((c)paramObject).e)) || (!br.a(this.f, ((c)paramObject).f)));
    return true;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, this.a, this.c, this.d, this.e, this.f });
  }
  
  public String toString()
  {
    return br.a(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\firebase\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */