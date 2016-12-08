package com.payu.payuui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.payu.india.Model.Emi;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PostData;
import com.payu.india.d.b;
import java.util.ArrayList;

public class PayUEmiActivity
  extends ah
  implements View.OnClickListener
{
  private PayuHashes A;
  private TextView B;
  private TextView C;
  private PayuConfig D;
  private Spinner m;
  private Spinner n;
  private SpinnerAdapter o;
  private SpinnerAdapter p;
  private Bundle q;
  private Button r;
  private Emi s;
  private EditText t;
  private EditText u;
  private EditText v;
  private EditText w;
  private EditText x;
  private ArrayList<Emi> y;
  private PaymentParams z;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      setResult(paramInt2, paramIntent);
      finish();
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == R.id.button_emi_pay_now) {
      try
      {
        this.z.t(this.u.getText().toString());
        this.z.p(this.t.getText().toString());
        this.z.q(this.v.getText().toString());
        this.z.s(this.x.getText().toString());
        this.z.r(this.w.getText().toString());
        this.z.w(this.s.b());
        paramView = new b(this.z, "EMI").a();
        if (paramView.b() == 0)
        {
          this.D.a(paramView.a());
          paramView = new Intent(this, PaymentsActivity.class);
          paramView.putExtra("payuConfig", this.D);
          startActivityForResult(paramView, 100);
          return;
        }
        Toast.makeText(this, paramView.a(), 1).show();
        return;
      }
      catch (Exception paramView)
      {
        paramView.printStackTrace();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_emi);
    this.q = getIntent().getExtras();
    this.m = ((Spinner)findViewById(R.id.spinner_emi_bank_name));
    this.n = ((Spinner)findViewById(R.id.spinner_emi_duration));
    this.t = ((EditText)findViewById(R.id.edit_text_emi_card_number));
    this.u = ((EditText)findViewById(R.id.edit_text_emi_name_on_card));
    this.v = ((EditText)findViewById(R.id.edit_text_emi_cvv));
    this.w = ((EditText)findViewById(R.id.edit_text_emi_expiry_month));
    this.x = ((EditText)findViewById(R.id.edit_text_emi_expiry_year));
    this.z = ((PaymentParams)this.q.getParcelable("payment_params"));
    this.A = ((PayuHashes)this.q.getParcelable("payu_hashes"));
    this.D = ((PayuConfig)this.q.getParcelable("payuConfig"));
    if (this.D != null) {}
    for (paramBundle = this.D;; paramBundle = new PayuConfig())
    {
      this.D = paramBundle;
      this.z.i(this.A.a());
      paramBundle = (Button)findViewById(R.id.button_emi_pay_now);
      this.r = paramBundle;
      paramBundle.setOnClickListener(this);
      paramBundle = (TextView)findViewById(R.id.text_view_amount);
      this.B = paramBundle;
      paramBundle.setText("amount: " + this.z.c());
      paramBundle = (TextView)findViewById(R.id.text_view_transaction_id);
      this.C = paramBundle;
      paramBundle.setText("txnid: " + this.z.b());
      if (this.q.getParcelableArrayList("EMI") == null) {
        break;
      }
      this.y = this.q.getParcelableArrayList("EMI");
      this.o = new g(this, this.y);
      this.m.setAdapter(this.o);
      this.m.setOnItemSelectedListener(new d(this));
      this.n.setOnItemSelectedListener(new e(this));
      return;
    }
    Toast.makeText(this, "Could not find emil list from the privious activity", 1).show();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(R.menu.menu_emi, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUEmiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */