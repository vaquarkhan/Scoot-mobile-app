package com.digits.sdk.android;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.widget.Button;
import android.widget.TextView;

final class v
{
  final Activity a;
  final z b;
  private final ca c;
  
  public v(Activity paramActivity)
  {
    this(paramActivity, new aa(), new ad(ao.d().j()));
  }
  
  public v(Activity paramActivity, z paramz, ca paramca)
  {
    this.a = paramActivity;
    this.b = paramz;
    this.c = paramca;
  }
  
  public void a()
  {
    this.c.a();
    b();
    c();
  }
  
  protected void a(Button paramButton)
  {
    paramButton.setOnClickListener(new w(this));
  }
  
  protected void a(TextView paramTextView)
  {
    paramTextView.setText(e());
  }
  
  protected void b()
  {
    this.a.setContentView(R.layout.dgts__activity_contacts);
  }
  
  protected void b(Button paramButton)
  {
    paramButton.setOnClickListener(new x(this));
  }
  
  protected void c()
  {
    Button localButton1 = (Button)this.a.findViewById(R.id.dgts__not_now);
    Button localButton2 = (Button)this.a.findViewById(R.id.dgts__okay);
    TextView localTextView = (TextView)this.a.findViewById(R.id.dgts__upload_contacts);
    a(localButton1);
    b(localButton2);
    a(localTextView);
  }
  
  protected String d()
  {
    return this.a.getApplicationInfo().loadLabel(this.a.getPackageManager()).toString();
  }
  
  protected String e()
  {
    return this.a.getString(R.string.dgts__upload_contacts, new Object[] { d() });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */