package com.payu.custombrowser;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONObject;

final class p
  implements Runnable
{
  int a = this.c;
  EditText b = (EditText)this.d.findViewById(R.id.otp_sms);
  
  p(a parama, int paramInt, View paramView, TextView paramTextView, String paramString) {}
  
  public void run()
  {
    int j = 1;
    if (this.a == 0) {}
    for (;;)
    {
      try
      {
        if ((a.e(this.g) == null) || (!this.d.isShown()) || (a.e(this.g).findViewById(R.id.otp_sms) == null)) {
          break label597;
        }
        this.e.setVisibility(8);
        JSONObject localJSONObject = new JSONObject(this.f);
        if ((!localJSONObject.has(this.g.a(R.string.cb_regenerate))) || (!localJSONObject.getBoolean(this.g.a(R.string.cb_regenerate)))) {
          break label598;
        }
        i = 1;
        if ((!localJSONObject.has(this.g.a(R.string.cb_pin))) || (!localJSONObject.getBoolean(this.g.a(R.string.cb_pin)))) {
          break label603;
        }
        this.d.findViewById(R.id.retry_text).setVisibility(0);
        if (i != 0)
        {
          this.d.findViewById(R.id.Regenerate_layout_gone).setVisibility(0);
          this.d.findViewById(R.id.pin_layout_gone).setVisibility(8);
          this.d.findViewById(R.id.Enter_manually_gone).setVisibility(0);
          this.d.findViewById(R.id.retry_text).setVisibility(0);
          this.d.findViewById(R.id.regenerate_layout).setVisibility(0);
          this.d.findViewById(R.id.approve).setVisibility(8);
          this.d.findViewById(R.id.waiting).setVisibility(8);
          this.d.findViewById(R.id.otp_sms).setVisibility(8);
          this.d.findViewById(R.id.pin).setOnClickListener(a.B(this.g));
          this.d.findViewById(R.id.retry).setOnClickListener(a.B(this.g));
          this.d.findViewById(R.id.enter_manually).setOnClickListener(a.B(this.g));
          a.a(this.g, this.d);
          return;
        }
        if (j != 0)
        {
          this.d.findViewById(R.id.pin_layout_gone).setVisibility(0);
          this.d.findViewById(R.id.Regenerate_layout_gone).setVisibility(8);
          this.d.findViewById(R.id.Enter_manually_gone).setVisibility(0);
          continue;
        }
        this.d.findViewById(R.id.pin_layout_gone).setVisibility(8);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      continue;
      if ((!this.b.hasFocus()) && (this.b.getText().toString().matches("")))
      {
        if (this.a == this.c) {
          this.e.setVisibility(0);
        }
        String str;
        if ((Build.VERSION.SDK_INT >= 23) && (!a.D(this.g))) {
          if (this.a != 1)
          {
            str = this.a + "  secs remaining to regenerate OTP\n";
            this.e.setText(str);
          }
        }
        for (;;)
        {
          this.a -= 1;
          return;
          str = this.a + " sec remaining to regenerate OTP\n";
          this.e.setText(str);
          continue;
          this.e.setText(this.a + "");
        }
      }
      label597:
      return;
      label598:
      int i = 0;
      continue;
      label603:
      j = 0;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */