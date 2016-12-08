package com.payu.payuui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.payu.india.Model.MerchantWebService;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PayuResponse;
import com.payu.india.Model.PostData;
import com.payu.india.Model.StoredCard;
import com.payu.india.c.c;
import com.payu.india.e.e;
import java.util.ArrayList;
import java.util.HashMap;

public class PayUOneClickPaymentActivity
  extends ah
  implements com.payu.india.b.a, com.payu.india.b.b
{
  private ListView m;
  private m n;
  private Bundle o;
  private ArrayList<StoredCard> p;
  private PayuHashes q;
  private PaymentParams r;
  private TextView s;
  private TextView t;
  private PayuConfig u;
  private c v;
  private HashMap<String, String> w;
  private int x;
  
  private void a(StoredCard paramStoredCard)
  {
    new PostData();
    this.r.i(this.q.a());
    this.r.v(paramStoredCard.e());
    this.r.t(paramStoredCard.a());
    this.r.u(paramStoredCard.b());
    this.r.r(paramStoredCard.d());
    this.r.s(paramStoredCard.c());
    if (this.x == 1) {}
    for (paramStoredCard = (String)this.w.get(paramStoredCard.e());; paramStoredCard = this.v.a(this, paramStoredCard.e()))
    {
      if (paramStoredCard != null) {
        this.r.x(paramStoredCard);
      }
      paramStoredCard = new com.payu.india.d.b(this.r, "CC").a();
      if (paramStoredCard.b() != 0) {
        break;
      }
      this.u.a(paramStoredCard.a());
      paramStoredCard = new Intent(this, PaymentsActivity.class);
      paramStoredCard.putExtra("payuConfig", this.u);
      paramStoredCard.putExtra("store_one_click_hash", this.x);
      startActivityForResult(paramStoredCard, 100);
      return;
    }
    Toast.makeText(this, paramStoredCard.a(), 0).show();
  }
  
  private void b(StoredCard paramStoredCard)
  {
    MerchantWebService localMerchantWebService = new MerchantWebService();
    localMerchantWebService.b(this.r.a());
    localMerchantWebService.a("delete_user_card");
    localMerchantWebService.d(this.r.L());
    localMerchantWebService.e(paramStoredCard.e());
    localMerchantWebService.c(this.q.d());
    paramStoredCard = new com.payu.india.d.a(localMerchantWebService).a();
    if (paramStoredCard.b() == 0)
    {
      this.u.a(paramStoredCard.a());
      this.u.a(this.u.b());
      new com.payu.india.e.a(this).execute(new PayuConfig[] { this.u });
      return;
    }
    Toast.makeText(this, paramStoredCard.a(), 1).show();
  }
  
  public void a(PayuResponse paramPayuResponse)
  {
    if (paramPayuResponse.n().booleanValue()) {
      Toast.makeText(this, paramPayuResponse.g().a(), 1).show();
    }
    if (paramPayuResponse.g().b() == 0)
    {
      paramPayuResponse = new MerchantWebService();
      paramPayuResponse.b(this.r.a());
      paramPayuResponse.a("get_user_cards");
      paramPayuResponse.d(this.r.L());
      paramPayuResponse.c(this.q.c());
      paramPayuResponse = new com.payu.india.d.a(paramPayuResponse).a();
      if (paramPayuResponse.b() == 0)
      {
        this.u.a(paramPayuResponse.a());
        this.u.a(this.u.b());
        new e(this).execute(new PayuConfig[] { this.u });
      }
    }
    else
    {
      return;
    }
    Toast.makeText(this, paramPayuResponse.a(), 1).show();
  }
  
  public void b(PayuResponse paramPayuResponse)
  {
    Toast.makeText(this, paramPayuResponse.g().a(), 1).show();
    this.n = null;
    this.p = null;
    new HashMap();
    switch (this.x)
    {
    default: 
      this.x = 0;
      this.p = paramPayuResponse.a();
    }
    for (;;)
    {
      this.n = new m(this, this, this.p);
      this.m.setAdapter(this.n);
      return;
      this.p = ((ArrayList)new c().a(this, paramPayuResponse.a()).get("one_click_checkout"));
      continue;
      this.p = ((ArrayList)new c().a(paramPayuResponse.a(), this.w).get("one_click_checkout"));
    }
  }
  
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
    setContentView(R.layout.activity_user_cards);
    this.m = ((ListView)findViewById(R.id.list_view_user_card));
    this.o = getIntent().getExtras();
    this.v = new c();
    this.x = this.o.getInt("store_one_click_hash");
    if ((this.o != null) && (this.o.getParcelableArrayList("store_card") != null))
    {
      this.p = new ArrayList();
      this.p = this.o.getParcelableArrayList("store_card");
      this.n = new m(this, this, this.p);
      this.m.setAdapter(this.n);
      this.q = ((PayuHashes)this.o.getParcelable("payu_hashes"));
      this.r = ((PaymentParams)this.o.getParcelable("payment_params"));
      this.u = ((PayuConfig)this.o.getParcelable("payuConfig"));
      this.w = ((HashMap)this.o.getSerializable("one_click_card_tokens"));
      if (this.u == null) {
        break label415;
      }
    }
    label415:
    for (paramBundle = this.u;; paramBundle = new PayuConfig())
    {
      this.u = paramBundle;
      this.s = ((TextView)findViewById(R.id.text_view_amount));
      this.t = ((TextView)findViewById(R.id.text_view_transaction_id));
      this.s.setText("amount: " + this.r.c());
      this.t.setText("txnid: " + this.r.b());
      if ((this.p != null) && (this.p.size() == 1) && ((!this.v.a(this, ((StoredCard)this.p.get(0)).e()).contains("default")) || (this.w.get(((StoredCard)this.p.get(0)).e()) != null))) {
        a((StoredCard)this.p.get(0));
      }
      return;
      Toast.makeText(this, "Could not get user card list from the previous activity", 1).show();
      break;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(R.menu.menu_user_cards, paramMenu);
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUOneClickPaymentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */