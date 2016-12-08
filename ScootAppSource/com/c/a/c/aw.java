package com.c.a.c;

import android.content.Context;
import b.a.a.a.a.b.m;
import b.a.a.a.a.g.o;

final class aw
{
  private final Context a;
  private final o b;
  
  public aw(Context paramContext, o paramo)
  {
    this.a = paramContext;
    this.b = paramo;
  }
  
  private String a(String paramString1, String paramString2)
  {
    return b(m.b(this.a, paramString1), paramString2);
  }
  
  private boolean a(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  private String b(String paramString1, String paramString2)
  {
    if (a(paramString1)) {
      return paramString2;
    }
    return paramString1;
  }
  
  public String a()
  {
    return a("com.crashlytics.CrashSubmissionPromptTitle", this.b.a);
  }
  
  public String b()
  {
    return a("com.crashlytics.CrashSubmissionPromptMessage", this.b.b);
  }
  
  public String c()
  {
    return a("com.crashlytics.CrashSubmissionSendTitle", this.b.c);
  }
  
  public String d()
  {
    return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.b.g);
  }
  
  public String e()
  {
    return a("com.crashlytics.CrashSubmissionCancelTitle", this.b.e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */