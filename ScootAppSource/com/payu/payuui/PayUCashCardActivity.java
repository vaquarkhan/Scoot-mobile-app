package com.payu.payuui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.payu.india.Model.PaymentDetails;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PostData;
import com.payu.india.d.b;
import java.util.ArrayList;

public class PayUCashCardActivity
  extends ah
  implements AdapterView.OnItemClickListener
{
  ListView m;
  a n;
  ArrayList<PaymentDetails> o;
  Bundle p;
  PaymentParams q;
  PayuHashes r;
  private TextView s;
  private TextView t;
  private PayuConfig u;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      setResult(paramInt2, paramIntent);
      finish();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_cash_card);
    this.m = ((ListView)findViewById(R.id.list_view_cash_card));
    this.m.setOnItemClickListener(this);
    this.p = getIntent().getExtras();
    this.u = ((PayuConfig)this.p.getParcelable("payuConfig"));
    this.q = ((PaymentParams)this.p.getParcelable("payment_params"));
    this.r = ((PayuHashes)this.p.getParcelable("payu_hashes"));
    this.q.i(this.r.a());
    paramBundle = (TextView)findViewById(R.id.text_view_amount);
    this.s = paramBundle;
    paramBundle.setText(this.q.c());
    paramBundle = (TextView)findViewById(R.id.text_view_transaction_id);
    this.t = paramBundle;
    paramBundle.setText("txnid:" + this.q.b());
    if (this.p.getParcelableArrayList("cashcard") != null)
    {
      this.o = this.p.getParcelableArrayList("cashcard");
      this.n = new a(this, R.layout.cash_card_list_item, this.o);
      this.m.setAdapter(this.n);
      return;
    }
    Toast.makeText(this, "Cash card not found", 1).show();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(R.menu.menu_cash_card, paramMenu);
    return true;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    try
    {
      this.q.w(((PaymentDetails)this.o.get(paramInt)).b());
      paramAdapterView = new b(this.q, "CASH").a();
      if (paramAdapterView.b() == 0)
      {
        this.u.a(paramAdapterView.a());
        paramAdapterView = new Intent(this, PaymentsActivity.class);
        paramAdapterView.putExtra("payuConfig", this.u);
        startActivityForResult(paramAdapterView, 100);
        return;
      }
      Toast.makeText(this, paramAdapterView.a(), 1).show();
      return;
    }
    catch (Exception paramAdapterView)
    {
      paramAdapterView.printStackTrace();
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUCashCardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */