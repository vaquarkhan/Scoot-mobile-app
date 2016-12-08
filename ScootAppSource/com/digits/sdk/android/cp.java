package com.digits.sdk.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.Button;
import android.widget.TextView;

final class cp
{
  final Activity a;
  final cs b;
  final ca c;
  
  public cp(Activity paramActivity)
  {
    this(paramActivity, new ct(), new cu(ao.d().j()));
  }
  
  public cp(Activity paramActivity, cs paramcs, ca paramca)
  {
    this.a = paramActivity;
    this.b = paramcs;
    this.c = paramca;
  }
  
  private ResultReceiver d()
  {
    return (ResultReceiver)this.a.getIntent().getExtras().getParcelable("receiver");
  }
  
  private bs e()
  {
    return (bs)this.a.getIntent().getExtras().getSerializable("fallback_reason");
  }
  
  public void a()
  {
    this.c.a();
    if (a(this.a.getIntent().getExtras()))
    {
      b();
      c();
      return;
    }
    throw new IllegalAccessError("This activity can only be started from Digits");
  }
  
  protected void a(Button paramButton)
  {
    paramButton.setOnClickListener(new cq(this));
  }
  
  protected void a(TextView paramTextView)
  {
    paramTextView.setOnClickListener(new cr(this));
  }
  
  protected boolean a(Bundle paramBundle)
  {
    return k.a(paramBundle, new String[] { "receiver" });
  }
  
  protected void b()
  {
    this.a.setContentView(R.layout.dgts__activity_failure);
  }
  
  protected void c()
  {
    Button localButton = (Button)this.a.findViewById(R.id.dgts__dismiss_button);
    TextView localTextView = (TextView)this.a.findViewById(R.id.dgts__try_another_phone);
    a(localButton);
    a(localTextView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */