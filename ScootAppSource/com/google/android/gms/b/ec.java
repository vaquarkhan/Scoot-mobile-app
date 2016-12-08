package com.google.android.gms.b;

public abstract class ec<T>
{
  private static final Object c = new Object();
  private static ei d = null;
  private static int e = 0;
  private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  protected final String a;
  protected final T b;
  private T g = null;
  
  protected ec(String paramString, T paramT)
  {
    this.a = paramString;
    this.b = paramT;
  }
  
  public static ec<Float> a(String paramString, Float paramFloat)
  {
    return new eg(paramString, paramFloat);
  }
  
  public static ec<Integer> a(String paramString, Integer paramInteger)
  {
    return new ef(paramString, paramInteger);
  }
  
  public static ec<Long> a(String paramString, Long paramLong)
  {
    return new ee(paramString, paramLong);
  }
  
  public static ec<String> a(String paramString1, String paramString2)
  {
    return new eh(paramString1, paramString2);
  }
  
  public static ec<Boolean> a(String paramString, boolean paramBoolean)
  {
    return new ed(paramString, Boolean.valueOf(paramBoolean));
  }
  
  public final T a()
  {
    return (T)a(this.a);
  }
  
  protected abstract T a(String paramString);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */