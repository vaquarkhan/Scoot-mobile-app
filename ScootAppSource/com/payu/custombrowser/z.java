package com.payu.custombrowser;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

final class z
  implements View.OnClickListener
{
  z(y paramy, TextView paramTextView) {}
  
  public void onClick(View paramView)
  {
    try
    {
      a.b(this.b.a, "approved_otp");
      a.a(this.b.a, "user_input", a.m(this.b.a));
      a.o(this.b.a);
      a.a(this.b.a, false);
      a.a(this.b.a, Boolean.valueOf(true));
      this.b.a.d();
      a.c(this.b.a);
      a.a(this.b.a, 1);
      a.b(this.b.a).loadUrl("javascript:" + a.p(this.b.a).getString(this.b.a.a(R.string.cb_process_otp)) + "(\"" + this.a.getText().toString() + "\")");
      a.q(this.b.a).e(a.e(this.b.a));
      return;
    }
    catch (JSONException paramView)
    {
      paramView.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */