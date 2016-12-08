package com.payu.custombrowser;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

final class y
  extends BroadcastReceiver
{
  y(a parama) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i;
    try
    {
      if (a.a(this.a) == null) {
        return;
      }
      if (a.e(this.a) == null) {
        break label799;
      }
      paramContext = paramIntent.getExtras();
      if (paramContext == null) {
        break label799;
      }
      try
      {
        arrayOfObject = (Object[])paramContext.get("pdus");
        if (arrayOfObject == null) {
          break label794;
        }
        arrayOfSmsMessage = new SmsMessage[arrayOfObject.length];
        i = 0;
        paramContext = null;
      }
      catch (Exception paramIntent)
      {
        try
        {
          Object[] arrayOfObject;
          SmsMessage[] arrayOfSmsMessage;
          if (i >= arrayOfSmsMessage.length) {
            break label800;
          }
          arrayOfSmsMessage[i] = SmsMessage.createFromPdu((byte[])(byte[])arrayOfObject[i]);
          paramIntent = paramContext + arrayOfSmsMessage[i].getMessageBody();
          paramContext = paramIntent;
          i += 1;
        }
        catch (Exception paramIntent)
        {
          for (;;) {}
        }
        paramIntent = paramIntent;
        paramContext = null;
      }
      paramIntent = paramContext;
      paramIntent.printStackTrace();
      paramIntent = paramContext;
    }
    catch (JSONException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        return;
        if (!paramIntent.equals("payment_initiated")) {
          break;
        }
        i = 0;
        break;
        if (!paramIntent.equals("CUSTOM_BROWSER")) {
          break;
        }
        i = 1;
        break;
        if (!paramIntent.equals("otp_click")) {
          break;
        }
        i = 2;
        break;
        if (!paramIntent.equals("regenerate_click")) {
          break;
        }
        i = 3;
        break;
        a.b(this.a, "received_otp_direct");
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    if ((paramContext != null) && (Pattern.compile(a.a(this.a).getString(this.a.a(R.string.cb_detect_otp)), 2).matcher(paramContext).find()))
    {
      paramContext = Pattern.compile(a.a(this.a).getString(this.a.a(R.string.cb_find_otp)), 2).matcher(paramContext);
      if (paramContext.find()) {
        a.a(this.a, paramContext.group(1).replaceAll("[^0-9]", ""));
      }
    }
    if (a.e(this.a).findViewById(R.id.otp_sms) != null)
    {
      paramContext = (TextView)a.e(this.a).findViewById(R.id.otp_sms);
      if ((a.j(this.a)) && (a.k(this.a) != null) && (paramContext.getVisibility() != 0))
      {
        if (a.l(this.a) != null)
        {
          a.l(this.a).cancel();
          a.l(this.a).purge();
        }
        paramIntent = a.m(this.a);
        i = -1;
        switch (paramIntent.hashCode())
        {
        }
      }
    }
    for (;;)
    {
      a.b(this.a, "otp_web");
      for (;;)
      {
        a.a(this.a, "otp_received", a.m(this.a));
        paramContext.setText(a.k(this.a));
        a.a(this.a, null);
        ai.a(a.e(this.a).findViewById(R.id.progress));
        if (a.l(this.a) != null) {
          a.l(this.a).cancel();
        }
        paramIntent = (Button)a.e(this.a).findViewById(R.id.approve);
        paramIntent.setClickable(true);
        ah.a(1.0F, paramIntent);
        paramIntent.setVisibility(0);
        a.e(this.a).findViewById(R.id.timer).setVisibility(8);
        a.e(this.a).findViewById(R.id.retry_text).setVisibility(8);
        a.e(this.a).findViewById(R.id.regenerate_layout).setVisibility(8);
        a.e(this.a).findViewById(R.id.waiting).setVisibility(8);
        a.e(this.a).findViewById(R.id.otp_recieved).setVisibility(0);
        paramContext.setVisibility(0);
        if (a.n(this.a))
        {
          paramIntent.performClick();
          a.b(this.a, "auto_approve");
          a.a(this.a, "user_input", a.m(this.a));
        }
        paramIntent.setOnClickListener(new z(this, paramContext));
        abortBroadcast();
        if (a.r(this.a) == null) {
          break;
        }
        this.a.a(a.r(this.a));
        a.a(this.a, null);
        return;
        a.b(this.a, "received_otp_selected");
        continue;
        a.b(this.a, "received_otp_regenerate");
      }
      label794:
      paramContext = null;
      break;
      label799:
      return;
      label800:
      paramContext = paramIntent;
      break;
      switch (i)
      {
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */