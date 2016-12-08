package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import b.a.a.a.a.b.m;

final class dh
  extends as
  implements dp, eb
{
  CountryListSpinner a;
  StateButton b;
  EditText c;
  TextView d;
  dj e;
  ea f;
  private final ca g;
  private Activity h;
  
  public dh(ca paramca)
  {
    this.g = paramca;
  }
  
  private void a(dq paramdq, Bundle paramBundle)
  {
    paramBundle = paramBundle.getString("phone_number");
    if (TextUtils.isEmpty(paramBundle))
    {
      new do(paramdq, this).a(ao.d().l(), new Void[0]);
      return;
    }
    new do(paramdq, paramBundle, this).a(ao.d().l(), new Void[0]);
  }
  
  public void a(int paramInt)
  {
    this.d.setText(this.f.a(paramInt));
  }
  
  public void a(Activity paramActivity, Bundle paramBundle)
  {
    this.h = paramActivity;
    this.a = ((CountryListSpinner)paramActivity.findViewById(R.id.dgts__countryCode));
    this.b = ((StateButton)paramActivity.findViewById(R.id.dgts__sendCodeButton));
    this.c = ((EditText)paramActivity.findViewById(R.id.dgts__phoneNumberEditText));
    this.d = ((TextView)paramActivity.findViewById(R.id.dgts__termsText));
    this.e = b(paramBundle);
    this.f = new ea(paramActivity);
    a(paramActivity, this.e, this.c);
    a(paramActivity, this.e, this.b);
    a(paramActivity, this.e, this.d);
    a(this.a);
    a(new dq(dx.a(paramActivity)), paramBundle);
    m.b(paramActivity, this.c);
  }
  
  public void a(Activity paramActivity, bn parambn, TextView paramTextView)
  {
    paramTextView.setText(this.f.a(R.string.dgts__terms_text));
    super.a(paramActivity, parambn, paramTextView);
  }
  
  protected void a(CountryListSpinner paramCountryListSpinner)
  {
    paramCountryListSpinner.setOnClickListener(new di(this));
  }
  
  public void a(dg paramdg)
  {
    this.e.b(paramdg);
    this.e.c(paramdg);
  }
  
  public boolean a(Bundle paramBundle)
  {
    return k.a(paramBundle, new String[] { "receiver" });
  }
  
  dj b(Bundle paramBundle)
  {
    return new dj((ResultReceiver)paramBundle.getParcelable("receiver"), this.b, this.c, this.a, this, this.g, paramBundle.getBoolean("email_enabled"));
  }
  
  public void b()
  {
    this.g.a();
    this.e.a();
  }
  
  public int c()
  {
    return R.layout.dgts__activity_phone_number;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */