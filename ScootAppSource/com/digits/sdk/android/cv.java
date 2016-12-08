package com.digits.sdk.android;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;
import b.a.a.a.a.b.m;

final class cv
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
  AuthConfig k;
  ea l;
  private final ca m;
  
  cv(ca paramca)
  {
    this.m = paramca;
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
    this.k = ((AuthConfig)paramBundle.getParcelable("auth_config"));
    this.h = b(paramBundle);
    this.l = new ea(paramActivity);
    a(paramActivity, this.h, this.a);
    a(paramActivity, this.h, this.c);
    a(paramActivity, this.h, this.m, this.d);
    a(paramActivity, this.h, this.m, this.e, this.k);
    a(this.h, this.g, this.k);
    a(paramActivity, this.b, paramBundle.getString("phone_number"));
    a(paramActivity, this.h, this.f);
    a(paramActivity, this.a);
    m.b(paramActivity, this.a);
  }
  
  protected void a(Activity paramActivity, EditText paramEditText)
  {
    if (m.c(paramActivity, "android.permission.RECEIVE_SMS"))
    {
      IntentFilter localIntentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
      this.i = new dy(paramEditText);
      paramActivity.registerReceiver(this.i, localIntentFilter);
    }
  }
  
  public void a(Activity paramActivity, bn parambn, TextView paramTextView)
  {
    if ((this.k != null) && (this.k.a)) {
      paramTextView.setText(this.l.a(R.string.dgts__terms_text_updated));
    }
    for (;;)
    {
      super.a(paramActivity, parambn, paramTextView);
      return;
      paramTextView.setText(this.l.a(R.string.dgts__terms_text_sign_in));
    }
  }
  
  public void a(Activity paramActivity, bn parambn, StateButton paramStateButton)
  {
    paramStateButton.a(R.string.dgts__continue, R.string.dgts__sending, R.string.dgts__done);
    paramStateButton.g();
    super.a(paramActivity, parambn, paramStateButton);
  }
  
  public boolean a(Bundle paramBundle)
  {
    return k.a(paramBundle, new String[] { "receiver", "phone_number", "request_id", "user_id" });
  }
  
  bn b(Bundle paramBundle)
  {
    return new cw((ResultReceiver)paramBundle.getParcelable("receiver"), this.c, this.d, this.e, this.a, paramBundle.getString("request_id"), paramBundle.getLong("user_id"), paramBundle.getString("phone_number"), this.m, Boolean.valueOf(paramBundle.getBoolean("email_enabled")), this.g);
  }
  
  public void b()
  {
    this.m.a();
    this.h.a();
  }
  
  public int c()
  {
    return R.layout.dgts__activity_confirmation;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */