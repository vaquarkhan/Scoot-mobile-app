package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;
import b.a.a.a.a.b.m;

final class dr
  extends as
{
  EditText a;
  StateButton b;
  TextView c;
  bn d;
  private final ca e;
  
  dr(ca paramca)
  {
    this.e = paramca;
  }
  
  public void a(Activity paramActivity, Bundle paramBundle)
  {
    this.a = ((EditText)paramActivity.findViewById(R.id.dgts__confirmationEditText));
    this.b = ((StateButton)paramActivity.findViewById(R.id.dgts__createAccount));
    this.c = ((TextView)paramActivity.findViewById(R.id.dgts__termsTextCreateAccount));
    this.d = b(paramBundle);
    a(paramActivity, this.d, this.a);
    a(paramActivity, this.d, this.b);
    a(paramActivity, this.d, this.c);
    m.b(paramActivity, this.a);
  }
  
  public boolean a(Bundle paramBundle)
  {
    return k.a(paramBundle, new String[] { "receiver", "phone_number", "request_id", "user_id" });
  }
  
  bn b(Bundle paramBundle)
  {
    return new ds((ResultReceiver)paramBundle.getParcelable("receiver"), this.b, this.a, paramBundle.getString("request_id"), paramBundle.getLong("user_id"), paramBundle.getString("phone_number"), this.e, Boolean.valueOf(paramBundle.getBoolean("email_enabled")));
  }
  
  public void b()
  {
    this.e.a();
    this.d.a();
  }
  
  public int c()
  {
    return R.layout.dgts__activity_pin_code;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */