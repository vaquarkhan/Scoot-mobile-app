package com.digits.sdk.android;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;

final class m
  extends as
{
  EditText a;
  LinkTextView b;
  StateButton c;
  InvertedStateButton d;
  InvertedStateButton e;
  TextView f;
  TextView g;
  bn h;
  dy i;
  Activity j;
  ca k;
  AuthConfig l;
  ea m;
  
  public m(ca paramca)
  {
    this.k = paramca;
  }
  
  public void a()
  {
    if (this.i != null) {
      this.j.unregisterReceiver(this.i);
    }
    this.h.f();
  }
  
  public void a(Activity paramActivity, Bundle paramBundle)
  {
    this.j = paramActivity;
    this.a = ((EditText)paramActivity.findViewById(R.id.dgts__confirmationEditText));
    this.c = ((StateButton)paramActivity.findViewById(R.id.dgts__createAccount));
    this.d = ((InvertedStateButton)paramActivity.findViewById(R.id.dgts__resendConfirmationButton));
    this.e = ((InvertedStateButton)paramActivity.findViewById(R.id.dgts__callMeButton));
    this.b = ((LinkTextView)paramActivity.findViewById(R.id.dgts__editPhoneNumber));
    this.f = ((TextView)paramActivity.findViewById(R.id.dgts__termsTextCreateAccount));
    this.g = ((TextView)paramActivity.findViewById(R.id.dgts__countdownTimer));
    this.l = ((AuthConfig)paramBundle.getParcelable("auth_config"));
    this.h = b(paramBundle);
    this.m = new ea(paramActivity);
    a(paramActivity, this.h, this.a);
    a(paramActivity, this.h, this.c);
    a(paramActivity, this.h, this.k, this.d);
    a(paramActivity, this.h, this.k, this.e, this.l);
    a(this.h, this.g, this.l);
    a(paramActivity, this.b, paramBundle.getString("phone_number"));
    a(paramActivity, this.h, this.f);
    a(paramActivity, this.a);
    b.a.a.a.a.b.m.b(paramActivity, this.a);
  }
  
  protected void a(Activity paramActivity, EditText paramEditText)
  {
    if (b.a.a.a.a.b.m.c(paramActivity, "android.permission.RECEIVE_SMS"))
    {
      IntentFilter localIntentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
      this.i = new dy(paramEditText);
      paramActivity.registerReceiver(this.i, localIntentFilter);
    }
  }
  
  public void a(Activity paramActivity, bn parambn, TextView paramTextView)
  {
    paramTextView.setText(this.m.a(R.string.dgts__terms_text_create));
    super.a(paramActivity, parambn, paramTextView);
  }
  
  public void a(Activity paramActivity, bn parambn, StateButton paramStateButton)
  {
    paramStateButton.a(R.string.dgts__create_account, R.string.dgts__sending, R.string.dgts__done);
    paramStateButton.g();
    super.a(paramActivity, parambn, paramStateButton);
  }
  
  public boolean a(Bundle paramBundle)
  {
    return k.a(paramBundle, new String[] { "receiver", "phone_number" });
  }
  
  bn b(Bundle paramBundle)
  {
    return new o((ResultReceiver)paramBundle.getParcelable("receiver"), this.c, this.d, this.e, this.a, paramBundle.getString("phone_number"), this.k, paramBundle.getBoolean("email_enabled"), this.g);
  }
  
  public void b()
  {
    this.k.a();
    this.h.a();
  }
  
  public int c()
  {
    return R.layout.dgts__activity_confirmation;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */