package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.aa;
import android.support.v4.app.bd;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity
  extends aa
{
  private u m;
  private SignInConfiguration n;
  private boolean o;
  private int p;
  private Intent q;
  
  private void a(int paramInt, Intent paramIntent)
  {
    if (paramIntent != null)
    {
      Object localObject = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if ((localObject != null) && (((SignInAccount)localObject).a() != null))
      {
        localObject = ((SignInAccount)localObject).a();
        this.m.b((GoogleSignInAccount)localObject, this.n.b());
        paramIntent.removeExtra("signInAccount");
        paramIntent.putExtra("googleSignInAccount", (Parcelable)localObject);
        this.o = true;
        this.p = paramInt;
        this.q = paramIntent;
        h();
        return;
      }
      if (paramIntent.hasExtra("errorCode"))
      {
        b(paramIntent.getIntExtra("errorCode", 8));
        return;
      }
    }
    b(8);
  }
  
  private void a(Intent paramIntent)
  {
    paramIntent.setPackage("com.google.android.gms");
    paramIntent.putExtra("config", this.n);
    try
    {
      startActivityForResult(paramIntent, 40962);
      return;
    }
    catch (ActivityNotFoundException paramIntent)
    {
      Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
      b(8);
    }
  }
  
  private void b(int paramInt)
  {
    Status localStatus = new Status(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("googleSignInStatus", localStatus);
    setResult(0, localIntent);
    finish();
  }
  
  private void h()
  {
    g().a(0, null, new b(this, null));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    setResult(0);
    switch (paramInt1)
    {
    default: 
      return;
    }
    a(paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.m = u.a(this);
    Intent localIntent = getIntent();
    String str;
    if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(localIntent.getAction()))
    {
      str = String.valueOf(localIntent.getAction());
      if (str.length() != 0)
      {
        str = "Unknown action: ".concat(str);
        Log.e("AuthSignInClient", str);
        finish();
      }
    }
    else
    {
      this.n = ((SignInConfiguration)localIntent.getParcelableExtra("config"));
      if (this.n != null) {
        break label114;
      }
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
    }
    label114:
    do
    {
      return;
      str = new String("Unknown action: ");
      break;
      if (paramBundle == null)
      {
        a(new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN"));
        return;
      }
      this.o = paramBundle.getBoolean("signingInGoogleApiClients");
    } while (!this.o);
    this.p = paramBundle.getInt("signInResultCode");
    this.q = ((Intent)paramBundle.getParcelable("signInResultData"));
    h();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", this.o);
    if (this.o)
    {
      paramBundle.putInt("signInResultCode", this.p);
      paramBundle.putParcelable("signInResultData", this.q);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\SignInHubActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */