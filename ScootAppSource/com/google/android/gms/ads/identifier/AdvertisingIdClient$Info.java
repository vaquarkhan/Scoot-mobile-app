package com.google.android.gms.ads.identifier;

public final class AdvertisingIdClient$Info
{
  private final String zzpO;
  private final boolean zzpP;
  
  public AdvertisingIdClient$Info(String paramString, boolean paramBoolean)
  {
    this.zzpO = paramString;
    this.zzpP = paramBoolean;
  }
  
  public String getId()
  {
    return this.zzpO;
  }
  
  public boolean isLimitAdTrackingEnabled()
  {
    return this.zzpP;
  }
  
  public String toString()
  {
    String str = this.zzpO;
    boolean bool = this.zzpP;
    return String.valueOf(str).length() + 7 + "{" + str + "}" + bool;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\ads\identifier\AdvertisingIdClient$Info.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */