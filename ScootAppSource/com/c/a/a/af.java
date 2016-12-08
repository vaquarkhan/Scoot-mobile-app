package com.c.a.a;

final class af
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final Boolean f;
  public final String g;
  public final String h;
  public final String i;
  public final String j;
  public final String k;
  public final String l;
  private String m;
  
  public af(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Boolean paramBoolean, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramBoolean;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramString8;
    this.j = paramString9;
    this.k = paramString10;
    this.l = paramString11;
  }
  
  public String toString()
  {
    if (this.m == null) {
      this.m = ("appBundleId=" + this.a + ", executionId=" + this.b + ", installationId=" + this.c + ", androidId=" + this.d + ", advertisingId=" + this.e + ", limitAdTrackingEnabled=" + this.f + ", betaDeviceToken=" + this.g + ", buildId=" + this.h + ", osVersion=" + this.i + ", deviceModel=" + this.j + ", appVersionCode=" + this.k + ", appVersionName=" + this.l);
    }
    return this.m;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */