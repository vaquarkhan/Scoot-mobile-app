package com.payu.payuui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PostData;
import com.payu.india.d.b;

public class PayUCreditDebitCardActivity
  extends ah
  implements View.OnClickListener
{
  private PaymentParams A;
  private PostData B;
  private TextView C;
  private PayuConfig D;
  private com.payu.india.c.c E;
  private Button m;
  private EditText n;
  private EditText o;
  private EditText p;
  private EditText q;
  private EditText r;
  private Bundle s;
  private CheckBox t;
  private String u;
  private String v;
  private String w;
  private String x;
  private String y;
  private PayuHashes z;
  
  private Drawable a(String paramString)
  {
    int i = 0;
    int j = -1;
    if (Build.VERSION.SDK_INT < 21)
    {
      switch (paramString.hashCode())
      {
      default: 
        i = j;
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          return null;
          i = j;
          if (paramString.equals("VISA"))
          {
            i = 0;
            continue;
            i = j;
            if (paramString.equals("LASER"))
            {
              i = 1;
              continue;
              i = j;
              if (paramString.equals("DISCOVER"))
              {
                i = 2;
                continue;
                i = j;
                if (paramString.equals("MAES"))
                {
                  i = 3;
                  continue;
                  i = j;
                  if (paramString.equals("MAST"))
                  {
                    i = 4;
                    continue;
                    i = j;
                    if (paramString.equals("AMEX"))
                    {
                      i = 5;
                      continue;
                      i = j;
                      if (paramString.equals("DINR"))
                      {
                        i = 6;
                        continue;
                        i = j;
                        if (paramString.equals("JCB"))
                        {
                          i = 7;
                          continue;
                          i = j;
                          if (paramString.equals("SMAE"))
                          {
                            i = 8;
                            continue;
                            i = j;
                            if (paramString.equals("RUPAY")) {
                              i = 9;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          break;
        }
      }
      return android.support.v4.b.c.a(this, R.drawable.visa);
      return android.support.v4.b.c.a(this, R.drawable.laser);
      return android.support.v4.b.c.a(this, R.drawable.discover);
      return android.support.v4.b.c.a(this, R.drawable.maestro);
      return android.support.v4.b.c.a(this, R.drawable.master);
      return android.support.v4.b.c.a(this, R.drawable.amex);
      return android.support.v4.b.c.a(this, R.drawable.diner);
      return android.support.v4.b.c.a(this, R.drawable.jcb);
      return android.support.v4.b.c.a(this, R.drawable.maestro);
      return android.support.v4.b.c.a(this, R.drawable.rupay);
    }
    switch (paramString.hashCode())
    {
    default: 
      label504:
      i = -1;
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return null;
      case 0: 
        return getResources().getDrawable(R.drawable.visa, null);
        if (!paramString.equals("VISA")) {
          break label504;
        }
        continue;
        if (!paramString.equals("LASER")) {
          break label504;
        }
        i = 1;
        continue;
        if (!paramString.equals("DISCOVER")) {
          break label504;
        }
        i = 2;
        continue;
        if (!paramString.equals("MAES")) {
          break label504;
        }
        i = 3;
        continue;
        if (!paramString.equals("MAST")) {
          break label504;
        }
        i = 4;
        continue;
        if (!paramString.equals("AMEX")) {
          break label504;
        }
        i = 5;
        continue;
        if (!paramString.equals("DINR")) {
          break label504;
        }
        i = 6;
        continue;
        if (!paramString.equals("JCB")) {
          break label504;
        }
        i = 7;
        continue;
        if (!paramString.equals("SMAE")) {
          break label504;
        }
        i = 8;
        continue;
        if (!paramString.equals("RUPAY")) {
          break label504;
        }
        i = 9;
      }
    }
    return getResources().getDrawable(R.drawable.laser, null);
    return getResources().getDrawable(R.drawable.discover, null);
    return getResources().getDrawable(R.drawable.maestro, null);
    return getResources().getDrawable(R.drawable.master, null);
    return getResources().getDrawable(R.drawable.amex, null);
    return getResources().getDrawable(R.drawable.diner, null);
    return getResources().getDrawable(R.drawable.jcb, null);
    return getResources().getDrawable(R.drawable.maestro, null);
    return getResources().getDrawable(R.drawable.rupay, null);
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
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == R.id.button_card_make_payment)
    {
      try
      {
        if (this.t.isChecked()) {
          this.A.a(1);
        }
        for (;;)
        {
          this.A.i(this.z.a());
          this.B = null;
          this.v = String.valueOf(this.o.getText());
          this.u = this.n.getText().toString();
          this.x = this.q.getText().toString();
          this.y = this.r.getText().toString();
          this.w = this.p.getText().toString();
          this.A.p(this.v);
          this.A.u(this.u);
          this.A.t(this.u);
          this.A.r(this.x);
          this.A.s(this.y);
          this.A.q(this.w);
          this.B = new b(this.A, "CC").a();
          if (this.B.b() != 0) {
            break;
          }
          this.D.a(this.B.a());
          paramView = new Intent(this, PaymentsActivity.class);
          paramView.putExtra("payuConfig", this.D);
          startActivityForResult(paramView, 100);
          return;
          this.A.a(0);
        }
        Toast.makeText(this, this.B.a(), 1).show();
      }
      catch (Exception paramView)
      {
        paramView.printStackTrace();
        return;
      }
      return;
    }
    Toast.makeText(this, this.B.a(), 1).show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_card);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(android.support.v4.b.c.c(this, R.color.gradient_start));
    }
    paramBundle = (Toolbar)findViewById(R.id.tool_bar);
    a(paramBundle);
    a locala = h();
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
      ((TextView)paramBundle.findViewById(R.id.toolbar_title)).setText(getResources().getString(R.string.activity_credit_debit_card));
      paramBundle = (Button)findViewById(R.id.button_card_make_payment);
      this.m = paramBundle;
      paramBundle.setOnClickListener(this);
      this.n = ((EditText)findViewById(R.id.edit_text_name_on_card));
      this.o = ((EditText)findViewById(R.id.edit_text_card_number));
      this.p = ((EditText)findViewById(R.id.edit_text_card_cvv));
      this.q = ((EditText)findViewById(R.id.edit_text_expiry_month));
      this.r = ((EditText)findViewById(R.id.edit_text_expiry_year));
      this.t = ((CheckBox)findViewById(R.id.check_box_save_card));
      this.s = getIntent().getExtras();
      this.z = ((PayuHashes)this.s.getParcelable("payu_hashes"));
      this.A = ((PaymentParams)this.s.getParcelable("payment_params"));
      this.D = ((PayuConfig)this.s.getParcelable("payuConfig"));
      if (this.D == null) {
        break label420;
      }
      paramBundle = this.D;
      label315:
      this.D = paramBundle;
      paramBundle = (TextView)findViewById(R.id.amount_payable);
      this.C = paramBundle;
      paramBundle.setText(String.format("Rs. %s", new Object[] { this.A.c() }));
      if (this.A.L() != null) {
        break label431;
      }
      this.t.setVisibility(8);
    }
    for (;;)
    {
      this.E = new com.payu.india.c.c();
      this.o.addTextChangedListener(new c(this));
      return;
      locala.a(android.support.v4.b.c.a(this, R.drawable.ic_nav_back));
      break;
      label420:
      paramBundle = new PayuConfig();
      break label315;
      label431:
      this.t.setVisibility(0);
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PayUCreditDebitCardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */