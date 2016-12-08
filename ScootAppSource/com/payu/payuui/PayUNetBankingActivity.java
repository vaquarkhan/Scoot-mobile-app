package com.payu.payuui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.payu.india.Model.PaymentDetails;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PostData;
import com.payu.india.d.b;
import java.util.ArrayList;

public class PayUNetBankingActivity
  extends ah
  implements View.OnClickListener
{
  private String m;
  private Bundle n;
  private ArrayList<PaymentDetails> o;
  private Spinner p;
  private PaymentParams q;
  private PayuHashes r;
  private Button s;
  private k t;
  private PayuConfig u;
  private TextView v;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      setResult(paramInt2, paramIntent);
      finish();
    }
  }
  
  public void onBackPressed()
  {
    setResult(1, null);
    finish();
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == R.id.button_pay_now)
    {
      if ("NA".equals(this.m)) {
        Toast.makeText(this, "Please Select a Bank", 1).show();
      }
    }
    else {
      return;
    }
    try
    {
      this.q.i(this.r.a());
      this.q.w(this.m);
      paramView = new b(this.q, "NB").a();
      if (paramView.b() == 0)
      {
        this.u.a(paramView.a());
        paramView = new Intent(this, PaymentsActivity.class);
        paramView.putExtra("payuConfig", this.u);
        startActivityForResult(paramView, 100);
        return;
      }
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
      return;
    }
    Toast.makeText(this, paramView.a(), 1).show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_net_banking);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, R.color.gradient_start));
    }
    paramBundle = (Toolbar)findViewById(R.id.tool_bar);
    a(paramBundle);
    Object localObject = h();
    if (localObject != null)
    {
      ((a)localObject).c(false);
      ((a)localObject).b(true);
      ((a)localObject).a(true);
      if (Build.VERSION.SDK_INT >= 21) {
        ((a)localObject).a(getResources().getDrawable(R.drawable.ic_nav_back, null));
      }
    }
    else
    {
      ((TextView)paramBundle.findViewById(R.id.toolbar_title)).setText(getResources().getString(R.string.activity_net_banking));
      paramBundle = (Button)findViewById(R.id.button_pay_now);
      this.s = paramBundle;
      paramBundle.setOnClickListener(this);
      this.p = ((Spinner)findViewById(R.id.spinner_netbanking));
      this.n = getIntent().getExtras();
      if ((this.n == null) || (this.n.getParcelableArrayList("netbanking") == null)) {
        break label486;
      }
      this.o = new ArrayList();
      this.o = this.n.getParcelableArrayList("netbanking");
      paramBundle = new PaymentDetails();
      paramBundle.a("Select another bank");
      paramBundle.b("NA");
      this.o.add(0, paramBundle);
      this.t = new k(this, this.o);
      this.p.setAdapter(this.t);
      this.p.setOnItemSelectedListener(new i(this));
      label303:
      this.q = ((PaymentParams)this.n.getParcelable("payment_params"));
      this.r = ((PayuHashes)this.n.getParcelable("payu_hashes"));
      this.u = ((PayuConfig)this.n.getParcelable("payuConfig"));
      if (this.u == null) {
        break label500;
      }
    }
    label486:
    label500:
    for (paramBundle = this.u;; paramBundle = new PayuConfig())
    {
      this.u = paramBundle;
      paramBundle = (TextView)findViewById(R.id.amount_payable);
      this.v = paramBundle;
      paramBundle.setText(String.format("Rs. %s", new Object[] { this.q.c() }));
      paramBundle = (GridLayout)findViewById(R.id.popularBankGroup);
      int j = paramBundle.getChildCount();
      int i = 0;
      while (i < j)
      {
        localObject = (LinearLayout)paramBundle.getChildAt(i);
        ((LinearLayout)localObject).setId(i);
        ((LinearLayout)localObject).setOnClickListener(new j(this, j, paramBundle));
        i += 1;
      }
      ((a)localObject).a(c.a(this, R.drawable.ic_nav_back));
      break;
      Toast.makeText(this, "Could not get netbanking list Data from the previous activity", 1).show();
      break label303;
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    finish();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUNetBankingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */