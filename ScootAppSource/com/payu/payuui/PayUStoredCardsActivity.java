package com.payu.payuui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
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
import com.payu.india.e.e;
import java.util.ArrayList;

public class PayUStoredCardsActivity
  extends ah
  implements com.payu.india.b.a, com.payu.india.b.b
{
  private ListView m;
  private o n;
  private Bundle o;
  private ArrayList<StoredCard> p;
  private PayuHashes q;
  private PaymentParams r;
  private TextView s;
  private PayuConfig t;
  
  private void a(StoredCard paramStoredCard)
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
      this.t.a(paramStoredCard.a());
      this.t.a(this.t.b());
      new com.payu.india.e.a(this).execute(new PayuConfig[] { this.t });
      return;
    }
    Toast.makeText(this, paramStoredCard.a(), 1).show();
  }
  
  private void a(StoredCard paramStoredCard, String paramString)
  {
    try
    {
      new PostData();
      paramStoredCard.l(paramString);
      this.r.i(this.q.a());
      this.r.v(paramStoredCard.e());
      this.r.q(paramString);
      this.r.t(paramStoredCard.a());
      this.r.u(paramStoredCard.b());
      this.r.r(paramStoredCard.d());
      this.r.s(paramStoredCard.c());
      paramStoredCard = new com.payu.india.d.b(this.r, "CC").a();
      if (paramStoredCard.b() == 0)
      {
        this.t.a(paramStoredCard.a());
        paramStoredCard = new Intent(this, PaymentsActivity.class);
        paramStoredCard.putExtra("payuConfig", this.t);
        startActivityForResult(paramStoredCard, 100);
        return;
      }
      Toast.makeText(this, paramStoredCard.a(), 0).show();
      return;
    }
    catch (Exception paramStoredCard)
    {
      paramStoredCard.printStackTrace();
    }
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
        this.t.a(paramPayuResponse.a());
        this.t.a(this.t.b());
        new e(this).execute(new PayuConfig[] { this.t });
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
    paramPayuResponse = paramPayuResponse.a();
    this.p = paramPayuResponse;
    this.n = new o(this, this, paramPayuResponse);
    this.m.setAdapter(this.n);
  }
  
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
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_user_cards);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, R.color.gradient_start));
    }
    paramBundle = (Toolbar)findViewById(R.id.tool_bar);
    a(paramBundle);
    android.support.v7.a.a locala = h();
    if (locala != null)
    {
      locala.c(false);
      locala.b(true);
      locala.a(true);
      if (Build.VERSION.SDK_INT >= 21) {
        locala.a(getResources().getDrawable(R.drawable.ic_nav_back, null));
      }
    }
    else
    {
      ((TextView)paramBundle.findViewById(R.id.toolbar_title)).setText(getResources().getString(R.string.activity_stored_card));
      this.m = ((ListView)findViewById(R.id.list_view_user_card));
      this.o = getIntent().getExtras();
      if ((this.o == null) || (this.o.getParcelableArrayList("store_card") == null)) {
        break label356;
      }
      this.p = new ArrayList();
      this.p = this.o.getParcelableArrayList("store_card");
      this.n = new o(this, this, this.p);
      this.m.setAdapter(this.n);
      label234:
      this.q = ((PayuHashes)this.o.getParcelable("payu_hashes"));
      this.r = ((PaymentParams)this.o.getParcelable("payment_params"));
      this.t = ((PayuConfig)this.o.getParcelable("payuConfig"));
      if (this.t == null) {
        break label370;
      }
    }
    label356:
    label370:
    for (paramBundle = this.t;; paramBundle = new PayuConfig())
    {
      this.t = paramBundle;
      paramBundle = (TextView)findViewById(R.id.amount_payable);
      this.s = paramBundle;
      paramBundle.setText(String.format("Rs. %s", new Object[] { this.r.c() }));
      return;
      locala.a(c.a(this, R.drawable.ic_nav_back));
      break;
      Toast.makeText(this, "Could not get user card list from the previous activity", 1).show();
      break label234;
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUStoredCardsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */