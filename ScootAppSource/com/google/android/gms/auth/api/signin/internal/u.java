package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class u
{
  private static final Lock a = new ReentrantLock();
  private static u b;
  private final Lock c = new ReentrantLock();
  private final SharedPreferences d;
  
  u(Context paramContext)
  {
    this.d = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static u a(Context paramContext)
  {
    b.a(paramContext);
    a.lock();
    try
    {
      if (b == null) {
        b = new u(paramContext.getApplicationContext());
      }
      paramContext = b;
      return paramContext;
    }
    finally
    {
      a.unlock();
    }
  }
  
  private String b(String paramString1, String paramString2)
  {
    String str = String.valueOf(":");
    return String.valueOf(paramString1).length() + 0 + String.valueOf(str).length() + String.valueOf(paramString2).length() + paramString1 + str + paramString2;
  }
  
  public GoogleSignInAccount a()
  {
    return a(c("defaultGoogleSignInAccount"));
  }
  
  GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return null;
      paramString = c(b("googleSignInAccount", paramString));
    } while (paramString == null);
    try
    {
      paramString = GoogleSignInAccount.a(paramString);
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  void a(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    b.a(paramGoogleSignInAccount);
    b.a(paramGoogleSignInOptions);
    String str = paramGoogleSignInAccount.j();
    a(b("googleSignInAccount", str), paramGoogleSignInAccount.l());
    a(b("googleSignInOptions", str), paramGoogleSignInOptions.h());
  }
  
  protected void a(String paramString1, String paramString2)
  {
    this.c.lock();
    try
    {
      this.d.edit().putString(paramString1, paramString2).apply();
      return;
    }
    finally
    {
      this.c.unlock();
    }
  }
  
  public GoogleSignInOptions b()
  {
    return b(c("defaultGoogleSignInAccount"));
  }
  
  GoogleSignInOptions b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return null;
      paramString = c(b("googleSignInOptions", paramString));
    } while (paramString == null);
    try
    {
      paramString = GoogleSignInOptions.a(paramString);
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public void b(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    b.a(paramGoogleSignInAccount);
    b.a(paramGoogleSignInOptions);
    a("defaultGoogleSignInAccount", paramGoogleSignInAccount.j());
    a(paramGoogleSignInAccount, paramGoogleSignInOptions);
  }
  
  protected String c(String paramString)
  {
    this.c.lock();
    try
    {
      paramString = this.d.getString(paramString, null);
      return paramString;
    }
    finally
    {
      this.c.unlock();
    }
  }
  
  public void c()
  {
    String str = c("defaultGoogleSignInAccount");
    e("defaultGoogleSignInAccount");
    d(str);
  }
  
  void d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    e(b("googleSignInAccount", paramString));
    e(b("googleSignInOptions", paramString));
  }
  
  protected void e(String paramString)
  {
    this.c.lock();
    try
    {
      this.d.edit().remove(paramString).apply();
      return;
    }
    finally
    {
      this.c.unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */