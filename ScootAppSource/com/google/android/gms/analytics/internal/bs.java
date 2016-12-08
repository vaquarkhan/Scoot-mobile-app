package com.google.android.gms.analytics.internal;

final class bs
  implements bg<c>
{
  private final ah a;
  private final c b;
  
  public bs(ah paramah)
  {
    this.a = paramah;
    this.b = new c();
  }
  
  public c a()
  {
    return this.b;
  }
  
  public void a(String paramString, int paramInt)
  {
    if ("ga_dispatchPeriod".equals(paramString))
    {
      this.b.d = paramInt;
      return;
    }
    this.a.f().d("Int xml configuration name not recognized", paramString);
  }
  
  public void a(String paramString1, String paramString2) {}
  
  public void a(String paramString, boolean paramBoolean)
  {
    if ("ga_dryRun".equals(paramString))
    {
      paramString = this.b;
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        paramString.e = i;
        return;
      }
    }
    this.a.f().d("Bool xml configuration name not recognized", paramString);
  }
  
  public void b(String paramString1, String paramString2)
  {
    if ("ga_appName".equals(paramString1))
    {
      this.b.a = paramString2;
      return;
    }
    if ("ga_appVersion".equals(paramString1))
    {
      this.b.b = paramString2;
      return;
    }
    if ("ga_logLevel".equals(paramString1))
    {
      this.b.c = paramString2;
      return;
    }
    this.a.f().d("String xml configuration name not recognized", paramString1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */