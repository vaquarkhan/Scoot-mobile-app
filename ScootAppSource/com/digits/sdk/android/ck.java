package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;
import b.a.a.a.a.b.m;

public final class ck
  extends as
{
  EditText a;
  StateButton b;
  InvertedStateButton c;
  InvertedStateButton d;
  LinkTextView e;
  TextView f;
  TextView g;
  bn h;
  Activity i;
  ca j;
  TextView k;
  ea l;
  
  ck(ca paramca)
  {
    this.j = paramca;
  }
  
  private bn b(Bundle paramBundle)
  {
    return new cl(this.b, this.a, (ResultReceiver)paramBundle.getParcelable("receiver"), paramBundle.getString("phone_number"), this.j);
  }
  
  public void a(Activity paramActivity, Bundle paramBundle)
  {
    this.i = paramActivity;
    this.k = ((TextView)paramActivity.findViewById(R.id.dgts__titleText));
    this.a = ((EditText)paramActivity.findViewById(R.id.dgts__confirmationEditText));
    this.b = ((StateButton)paramActivity.findViewById(R.id.dgts__createAccount));
    this.c = ((InvertedStateButton)paramActivity.findViewById(R.id.dgts__resendConfirmationButton));
    this.d = ((InvertedStateButton)paramActivity.findViewById(R.id.dgts__callMeButton));
    this.e = ((LinkTextView)paramActivity.findViewById(R.id.dgts__editPhoneNumber));
    this.f = ((TextView)paramActivity.findViewById(R.id.dgts__termsTextCreateAccount));
    this.g = ((TextView)paramActivity.findViewById(R.id.dgts__countdownTimer));
    AuthConfig localAuthConfig = (AuthConfig)paramBundle.getParcelable("auth_config");
    this.h = b(paramBundle);
    this.l = new ea(paramActivity);
    this.a.setHint(R.string.dgts__email_request_edit_hint);
    this.k.setText(R.string.dgts__email_request_title);
    a(paramActivity, this.h, this.a);
    a(paramActivity, this.h, this.b);
    a(paramActivity, this.h, this.j, this.c);
    a(paramActivity, this.h, this.j, this.d, localAuthConfig);
    a(this.h, this.g, localAuthConfig);
    a(paramActivity, this.e, paramBundle.getString("phone_number"));
    a(paramActivity, this.h, this.f);
    m.b(paramActivity, this.a);
  }
  
  protected void a(Activity paramActivity, LinkTextView paramLinkTextView, String paramString)
  {
    paramLinkTextView.setVisibility(8);
  }
  
  public void a(Activity paramActivity, bn parambn, EditText paramEditText)
  {
    paramEditText.setInputType(32);
    super.a(paramActivity, parambn, paramEditText);
  }
  
  public void a(Activity paramActivity, bn parambn, TextView paramTextView)
  {
    paramTextView.setText(this.l.a(R.string.dgts__terms_email_request));
    super.a(paramActivity, parambn, paramTextView);
  }
  
  public void a(Activity paramActivity, bn parambn, StateButton paramStateButton)
  {
    paramStateButton.a(R.string.dgts__continue, R.string.dgts__sending, R.string.dgts__done);
    paramStateButton.g();
    super.a(paramActivity, parambn, paramStateButton);
  }
  
  void a(Activity paramActivity, bn parambn, ca paramca, InvertedStateButton paramInvertedStateButton)
  {
    paramInvertedStateButton.setVisibility(8);
  }
  
  void a(Activity paramActivity, bn parambn, ca paramca, InvertedStateButton paramInvertedStateButton, AuthConfig paramAuthConfig)
  {
    paramInvertedStateButton.setVisibility(8);
  }
  
  void a(bn parambn, TextView paramTextView, AuthConfig paramAuthConfig)
  {
    paramTextView.setVisibility(8);
  }
  
  public boolean a(Bundle paramBundle)
  {
    return k.a(paramBundle, new String[] { "receiver", "phone_number" });
  }
  
  public void b()
  {
    this.j.a();
    this.h.a();
  }
  
  public int c()
  {
    return R.layout.dgts__activity_confirmation;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */