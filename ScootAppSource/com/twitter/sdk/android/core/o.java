package com.twitter.sdk.android.core;

import b.a.a.a.f;
import b.a.a.a.t;
import com.google.a.ab;
import com.google.a.af;
import com.google.a.k;
import com.google.a.z;
import com.twitter.sdk.android.core.a.a;
import java.io.UnsupportedEncodingException;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

public final class o
  extends u
{
  private final RetrofitError a;
  private final w b;
  private final a c;
  
  o(RetrofitError paramRetrofitError)
  {
    super(c(paramRetrofitError));
    setStackTrace(paramRetrofitError.getStackTrace());
    this.a = paramRetrofitError;
    this.b = d(paramRetrofitError);
    this.c = b(paramRetrofitError);
  }
  
  static a a(String paramString)
  {
    Object localObject = new k();
    try
    {
      localObject = (a[])((k)localObject).a(new ab().a(paramString).k().a("errors"), a[].class);
      if (localObject.length == 0) {
        return null;
      }
      paramString = localObject[0];
      return paramString;
    }
    catch (af localaf)
    {
      f.h().e("Twitter", "Invalid json: " + paramString, localaf);
      return null;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        f.h().e("Twitter", "Unexpected response: " + paramString, localException);
      }
    }
  }
  
  public static final o a(RetrofitError paramRetrofitError)
  {
    return new o(paramRetrofitError);
  }
  
  public static a b(RetrofitError paramRetrofitError)
  {
    if ((paramRetrofitError == null) || (paramRetrofitError.getResponse() == null) || (paramRetrofitError.getResponse().getBody() == null)) {
      return null;
    }
    paramRetrofitError = ((TypedByteArray)paramRetrofitError.getResponse().getBody()).getBytes();
    if (paramRetrofitError == null) {
      return null;
    }
    try
    {
      paramRetrofitError = a(new String(paramRetrofitError, "UTF-8"));
      return paramRetrofitError;
    }
    catch (UnsupportedEncodingException paramRetrofitError)
    {
      f.h().e("Twitter", "Failed to convert to string", paramRetrofitError);
    }
    return null;
  }
  
  private static String c(RetrofitError paramRetrofitError)
  {
    if (paramRetrofitError.getMessage() != null) {
      return paramRetrofitError.getMessage();
    }
    if (paramRetrofitError.getResponse() != null) {
      return "Status: " + paramRetrofitError.getResponse().getStatus();
    }
    return "unknown error";
  }
  
  private static w d(RetrofitError paramRetrofitError)
  {
    if (paramRetrofitError.getResponse() != null) {
      return new w(paramRetrofitError.getResponse().getHeaders());
    }
    return null;
  }
  
  public int a()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.b();
  }
  
  public String b()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.a();
  }
  
  public RetrofitError c()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */