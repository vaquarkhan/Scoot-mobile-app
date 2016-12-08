package com.payu.payuui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.payu.india.Model.MerchantWebService;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PayuResponse;
import com.payu.india.Model.PostData;
import com.payu.india.Model.StoredCard;
import com.scootapp.olamoneyui.OlaMoneyBaseActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class PayUBaseActivity
  extends ah
  implements View.OnClickListener, com.payu.india.b.c
{
  ArrayList<StoredCard> A;
  ArrayList<StoredCard> B;
  HashMap<String, String> C;
  PaymentParams D;
  PayuHashes E;
  int F;
  Bundle G;
  private boolean H = false;
  PayuResponse m;
  Intent n;
  RelativeLayout o;
  RelativeLayout p;
  RelativeLayout q;
  RelativeLayout r;
  RelativeLayout s;
  RelativeLayout t;
  RelativeLayout u;
  RelativeLayout v;
  RelativeLayout w;
  RelativeLayout x;
  LinearLayout y;
  PayuConfig z;
  
  private void c(Intent paramIntent)
  {
    this.H = true;
    paramIntent.putExtra("payu_hashes", this.E);
    paramIntent.putExtra("payment_params", this.D);
    paramIntent.putExtra("store_one_click_hash", this.F);
    this.z.a(null);
    paramIntent.putExtra("payuConfig", this.z);
    if (this.G.getString("salt") != null) {
      paramIntent.putExtra("salt", this.G.getString("salt"));
    }
    startActivityForResult(paramIntent, 100);
  }
  
  private void l()
  {
    this.H = true;
    this.D.i(this.E.a());
    try
    {
      Object localObject = new com.payu.india.d.b(this.D, "PAYU_MONEY").a();
      if (((PostData)localObject).b() == 0)
      {
        this.z.a(((PostData)localObject).a());
        localObject = new Intent(this, PaymentsActivity.class);
        ((Intent)localObject).putExtra("payuConfig", this.z);
        startActivityForResult((Intent)localObject, 100);
        return;
      }
      Log.v("PayU", "Error while launching PayUMoney " + ((PostData)localObject).a());
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void m()
  {
    this.H = true;
    this.D.i(this.E.a());
    try
    {
      Intent localIntent = new Intent(this, OlaMoneyBaseActivity.class);
      localIntent.putExtra("payuConfig", this.z);
      startActivityForResult(localIntent, 100);
      return;
    }
    catch (Exception localException)
    {
      Log.e(PayUBaseActivity.class.getName(), "Exception in launchOlaMoneyUI " + localException);
    }
  }
  
  public void a(PayuResponse paramPayuResponse)
  {
    this.m = paramPayuResponse;
    findViewById(R.id.progress_bar).setVisibility(8);
    new HashMap();
    switch (this.F)
    {
    default: 
      this.F = 0;
      this.A = paramPayuResponse.a();
    }
    for (;;)
    {
      if ((paramPayuResponse.n().booleanValue()) && (paramPayuResponse.g().b() == 0))
      {
        if ((paramPayuResponse.h().booleanValue()) && (this.A != null) && (this.A.size() > 0)) {
          findViewById(R.id.linear_layout_stored_card).setVisibility(0);
        }
        if ((paramPayuResponse.h().booleanValue()) && (this.B.size() > 0)) {
          findViewById(R.id.linear_layout_one_click_payment).setVisibility(0);
        }
        if (paramPayuResponse.l().booleanValue()) {
          findViewById(R.id.linear_layout_netbanking).setVisibility(0);
        }
        if (paramPayuResponse.m().booleanValue()) {
          findViewById(R.id.linear_layout_cash_card).setVisibility(0);
        }
        if ((paramPayuResponse.j().booleanValue()) || (paramPayuResponse.k().booleanValue())) {
          findViewById(R.id.linear_layout_credit_debit_card).setVisibility(0);
        }
        if (paramPayuResponse.i().booleanValue()) {
          findViewById(R.id.linear_layout_emi).setVisibility(0);
        }
      }
      return;
      HashMap localHashMap = new com.payu.india.c.c().a(this, this.m.a());
      this.A = ((ArrayList)localHashMap.get("store_card"));
      this.B = ((ArrayList)localHashMap.get("one_click_checkout"));
      continue;
      localHashMap = new com.payu.india.c.c().a(this.m.a(), this.C);
      this.A = ((ArrayList)localHashMap.get("store_card"));
      this.B = ((ArrayList)localHashMap.get("one_click_checkout"));
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      if (paramInt2 != 1)
      {
        setResult(paramInt2, paramIntent);
        finish();
      }
    }
    else {
      return;
    }
    this.H = false;
  }
  
  public void onBackPressed()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("result", "Transaction could not be completed!");
    setResult(0, localIntent);
    finish();
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == R.id.button_netbanking)
    {
      this.n = new Intent(this, PayUNetBankingActivity.class);
      this.n.putParcelableArrayListExtra("netbanking", this.m.e());
      c(this.n);
    }
    do
    {
      return;
      if (i == R.id.button_cash_card)
      {
        this.n = new Intent(this, PayUCashCardActivity.class);
        this.n.putParcelableArrayListExtra("cashcard", this.m.f());
        c(this.n);
        return;
      }
      if (i == R.id.button_emi)
      {
        this.n = new Intent(this, PayUEmiActivity.class);
        this.n.putParcelableArrayListExtra("EMI", this.m.b());
        c(this.n);
        return;
      }
      if (i == R.id.button_credit_debit_card)
      {
        this.n = new Intent(this, PayUCreditDebitCardActivity.class);
        this.n.putParcelableArrayListExtra("creditcard", this.m.c());
        this.n.putParcelableArrayListExtra("debitcard", this.m.d());
        c(this.n);
        return;
      }
      if (i == R.id.button_payumoney)
      {
        l();
        return;
      }
      if (i == R.id.button_stored_card)
      {
        this.n = new Intent(this, PayUStoredCardsActivity.class);
        this.n.putParcelableArrayListExtra("store_card", this.A);
        c(this.n);
        return;
      }
      if (i == R.id.button_one_click_payment)
      {
        this.n = new Intent(this, PayUOneClickPaymentActivity.class);
        this.n.putParcelableArrayListExtra("store_card", this.B);
        this.n.putExtra("one_click_card_tokens", this.C);
        c(this.n);
        return;
      }
      if (i == R.id.button_wallet)
      {
        if (this.y.isShown())
        {
          paramView = AnimationUtils.loadAnimation(this, R.anim.face_out);
          this.y.startAnimation(paramView);
          this.y.setVisibility(8);
          return;
        }
        paramView = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        this.y.startAnimation(paramView);
        this.y.setVisibility(0);
        return;
      }
    } while (i != R.id.button_payumoney);
    m();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_base);
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject1 = getWindow();
      ((Window)localObject1).addFlags(Integer.MIN_VALUE);
      ((Window)localObject1).clearFlags(67108864);
      ((Window)localObject1).setStatusBarColor(android.support.v4.b.c.c(this, R.color.gradient_start));
    }
    Object localObject1 = (Toolbar)findViewById(R.id.tool_bar);
    a((Toolbar)localObject1);
    Object localObject2 = h();
    if (localObject2 != null)
    {
      ((android.support.v7.a.a)localObject2).c(false);
      ((android.support.v7.a.a)localObject2).b(true);
      ((android.support.v7.a.a)localObject2).a(true);
      if (Build.VERSION.SDK_INT >= 21) {
        ((android.support.v7.a.a)localObject2).a(getResources().getDrawable(R.drawable.ic_nav_back, null));
      }
    }
    else
    {
      ((TextView)((Toolbar)localObject1).findViewById(R.id.toolbar_title)).setText(getResources().getString(R.string.activity_payments));
      this.A = new ArrayList();
      this.B = new ArrayList();
      localObject1 = (RelativeLayout)findViewById(R.id.button_netbanking);
      this.o = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_emi);
      this.p = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_cash_card);
      this.q = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_payumoney);
      this.r = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_stored_card);
      this.s = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_credit_debit_card);
      this.t = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_merchant_payment);
      this.u = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_verify_api);
      this.v = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_one_click_payment);
      this.w = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      localObject1 = (RelativeLayout)findViewById(R.id.button_wallet);
      this.x = ((RelativeLayout)localObject1);
      ((RelativeLayout)localObject1).setOnClickListener(this);
      this.y = ((LinearLayout)findViewById(R.id.linear_layout_wallet_option));
      this.G = getIntent().getExtras();
      this.z = ((PayuConfig)this.G.getParcelable("payuConfig"));
      if (this.z == null) {
        break label661;
      }
      localObject1 = this.z;
      label421:
      this.z = ((PayuConfig)localObject1);
      this.D = ((PaymentParams)this.G.getParcelable("payment_params"));
      this.E = ((PayuHashes)this.G.getParcelable("payu_hashes"));
      this.F = this.G.getInt("store_one_click_hash");
      this.C = ((HashMap)this.G.getSerializable("one_click_card_tokens"));
      localObject2 = new MerchantWebService();
      ((MerchantWebService)localObject2).b(this.D.a());
      ((MerchantWebService)localObject2).a("payment_related_details_for_mobile_sdk");
      if (this.D.L() != null) {
        break label672;
      }
      localObject1 = "default";
      label528:
      ((MerchantWebService)localObject2).d((String)localObject1);
      ((MerchantWebService)localObject2).c(this.E.e());
      if (paramBundle == null)
      {
        paramBundle = new com.payu.india.d.a((MerchantWebService)localObject2).a();
        if (paramBundle.b() != 0) {
          break label683;
        }
        this.z.a(paramBundle.a());
        findViewById(R.id.progress_bar).setVisibility(8);
        new com.payu.india.e.b(this).execute(new PayuConfig[] { this.z });
      }
    }
    for (;;)
    {
      ((TextView)findViewById(R.id.amount_payable)).setText(String.format("Rs. %s", new Object[] { this.D.c() }));
      return;
      ((android.support.v7.a.a)localObject2).a(android.support.v4.b.c.a(this, R.drawable.ic_nav_back));
      break;
      label661:
      localObject1 = new PayuConfig();
      break label421;
      label672:
      localObject1 = this.D.L();
      break label528;
      label683:
      Log.v("PayU", "Error occured in PayUBaseActivity " + paramBundle.a());
      findViewById(R.id.progress_bar).setVisibility(8);
      finish();
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
  
  protected void onResume()
  {
    if (this.H)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("result", "Some error occured");
      setResult(0, localIntent);
      finish();
    }
    super.onResume();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */