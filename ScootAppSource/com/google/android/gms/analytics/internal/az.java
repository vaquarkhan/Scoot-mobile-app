package com.google.android.gms.analytics.internal;

public enum az
{
  private az() {}
  
  public static az a(String paramString)
  {
    if ("BATCH_BY_SESSION".equalsIgnoreCase(paramString)) {
      return b;
    }
    if ("BATCH_BY_TIME".equalsIgnoreCase(paramString)) {
      return c;
    }
    if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(paramString)) {
      return d;
    }
    if ("BATCH_BY_COUNT".equalsIgnoreCase(paramString)) {
      return e;
    }
    if ("BATCH_BY_SIZE".equalsIgnoreCase(paramString)) {
      return f;
    }
    return a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */