package com.c.a.c;

import android.util.Log;
import b.a.a.a.a.b.m;
import b.a.a.a.f;
import b.a.a.a.t;

final class a
{
  private final String a;
  private final boolean b;
  
  public a(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((m.c(this.a)) && (this.b))
    {
      paramString1 = b(paramString1, paramString2);
      Log.e("CrashlyticsCore", ".");
      Log.e("CrashlyticsCore", ".     |  | ");
      Log.e("CrashlyticsCore", ".     |  |");
      Log.e("CrashlyticsCore", ".     |  |");
      Log.e("CrashlyticsCore", ".   \\ |  | /");
      Log.e("CrashlyticsCore", ".    \\    /");
      Log.e("CrashlyticsCore", ".     \\  /");
      Log.e("CrashlyticsCore", ".      \\/");
      Log.e("CrashlyticsCore", ".");
      Log.e("CrashlyticsCore", paramString1);
      Log.e("CrashlyticsCore", ".");
      Log.e("CrashlyticsCore", ".      /\\");
      Log.e("CrashlyticsCore", ".     /  \\");
      Log.e("CrashlyticsCore", ".    /    \\");
      Log.e("CrashlyticsCore", ".   / |  | \\");
      Log.e("CrashlyticsCore", ".     |  |");
      Log.e("CrashlyticsCore", ".     |  |");
      Log.e("CrashlyticsCore", ".     |  |");
      Log.e("CrashlyticsCore", ".");
      throw new aa(paramString1);
    }
    if (!this.b) {
      f.h().a("CrashlyticsCore", "Configured not to require a build ID.");
    }
  }
  
  protected String b(String paramString1, String paramString2)
  {
    return "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */