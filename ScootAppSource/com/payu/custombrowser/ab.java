package com.payu.custombrowser;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab
  implements View.OnClickListener
{
  private View b;
  
  public ab(a parama) {}
  
  public void a(View paramView)
  {
    this.b = paramView;
  }
  
  public void onClick(View paramView)
  {
    Object localObject = "";
    if ((paramView instanceof Button)) {
      localObject = ((Button)paramView).getText().toString();
    }
    switch (ah.b(((String)localObject).toLowerCase()))
    {
    default: 
    case 2: 
    case 6: 
    case 7: 
    case 5: 
      for (;;)
      {
        return;
        if (!(paramView instanceof TextView)) {
          break;
        }
        localObject = ((TextView)paramView).getText().toString();
        break;
        try
        {
          a.b(this.a, "regenerate_click");
          a.a(this.a, "user_input", a.m(this.a));
          a.a(this.a, null);
          a.b(this.a).loadUrl("javascript:" + a.p(this.a).getString(this.a.a(R.string.cb_regen_otp)));
          a.o(this.a);
          return;
        }
        catch (JSONException paramView)
        {
          paramView.printStackTrace();
          return;
        }
        a.c(this.a, true);
        a.C(this.a);
        a.b(this.a, "otp_click");
        a.a(this.a, "user_input", a.m(this.a));
        if (Build.VERSION.SDK_INT < 23)
        {
          a.a(this.a, null);
          a.o(this.a);
          return;
          try
          {
            a.q(this.a).d(a.e(this.a));
            a.a(this.a, null);
            a.a(this.a, false);
            a.a(this.a, Boolean.valueOf(true));
            this.a.d();
            a.c(this.a);
            a.a(this.a, 1);
            a.o(this.a);
            if (((EditText)this.b.findViewById(R.id.otp_sms)).getText().toString().length() > 5)
            {
              a.b(this.a, "approved_otp");
              a.a(this.a, "user_input", a.m(this.a));
              a.b(this.a).loadUrl("javascript:" + a.p(this.a).getString(this.a.a(R.string.cb_process_otp)) + "(\"" + ((TextView)a.e(this.a).findViewById(R.id.otp_sms)).getText().toString() + "\")");
              return;
            }
          }
          catch (JSONException paramView)
          {
            paramView.printStackTrace();
            return;
          }
        }
      }
    case 4: 
      paramView = a.e(this.a).getLayoutInflater().inflate(R.layout.wait_for_otp, null);
      a.b(this.a, "enter_manually_click");
      a.a(this.a, "user_input", a.m(this.a));
      if (a.A(this.a) == 0)
      {
        paramView.measure(-2, -2);
        a.c(this.a, paramView.getMeasuredHeight());
      }
      a.t(this.a).removeAllViews();
      a.t(this.a).addView(paramView);
      if (a.t(this.a).isShown()) {
        a.a(this.a, 2);
      }
      for (;;)
      {
        localObject = (ImageView)paramView.findViewById(R.id.bank_logo);
        if (a.z(this.a) != null) {
          ((ImageView)localObject).setImageDrawable(a.z(this.a));
        }
        paramView.findViewById(R.id.waiting).setVisibility(8);
        localObject = (Button)paramView.findViewById(R.id.approve);
        ((Button)localObject).setClickable(false);
        EditText localEditText = (EditText)paramView.findViewById(R.id.otp_sms);
        a.q(this.a).a(localEditText, a.e(this.a));
        ah.a(0.3F, (View)localObject);
        ((Button)localObject).setVisibility(0);
        localEditText.setVisibility(0);
        paramView.findViewById(R.id.regenerate_layout).setVisibility(8);
        paramView.findViewById(R.id.progress).setVisibility(4);
        a.q(this.a).a(localEditText, a.e(this.a));
        localEditText.addTextChangedListener(new ac(this, paramView, (Button)localObject));
        a.a(this.a, paramView);
        return;
        a.c(this.a);
      }
    }
    a.b(this.a, true);
    a.a(this.a, Boolean.valueOf(true));
    a.c(this.a);
    a.a(this.a, 1);
    this.a.d();
    if (a.d(this.a) != null) {
      a.d(this.a).setVisibility(8);
    }
    if (a.f(this.a) != null) {
      a.f(this.a).setVisibility(8);
    }
    try
    {
      a.b(this.a).loadUrl("javascript:" + a.p(this.a).getString(this.a.a(R.string.cb_pin)));
      a.b(this.a, "password_click");
      a.a(this.a, "user_input", a.m(this.a));
      return;
    }
    catch (JSONException paramView)
    {
      paramView.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */