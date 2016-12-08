package com.digits.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dy
  extends BroadcastReceiver
{
  final Pattern a = Pattern.compile("\\s(\\d{6}).*Digits by Twitter");
  final WeakReference<EditText> b;
  
  dy(EditText paramEditText)
  {
    this.b = new WeakReference(paramEditText);
  }
  
  String a(SmsMessage paramSmsMessage)
  {
    paramSmsMessage = paramSmsMessage.getDisplayMessageBody();
    if (paramSmsMessage != null)
    {
      paramSmsMessage = this.a.matcher(paramSmsMessage);
      if (paramSmsMessage.find()) {
        return paramSmsMessage.group(1);
      }
    }
    return null;
  }
  
  String a(SmsMessage[] paramArrayOfSmsMessage)
  {
    int j = paramArrayOfSmsMessage.length;
    int i = 0;
    while (i < j)
    {
      String str = a(paramArrayOfSmsMessage[i]);
      if (str != null) {
        return str;
      }
      i += 1;
    }
    return null;
  }
  
  SmsMessage[] a(Intent paramIntent)
  {
    paramIntent = (Object[])paramIntent.getSerializableExtra("pdus");
    int j = paramIntent.length;
    SmsMessage[] arrayOfSmsMessage = new SmsMessage[j];
    int i = 0;
    while (i < j)
    {
      arrayOfSmsMessage[i] = SmsMessage.createFromPdu((byte[])(byte[])paramIntent[i]);
      i += 1;
    }
    return arrayOfSmsMessage;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = a(a(paramIntent));
    if (paramContext != null)
    {
      paramIntent = (EditText)this.b.get();
      if (paramIntent != null)
      {
        paramIntent.setText(paramContext);
        paramIntent.setSelection(paramContext.length());
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */