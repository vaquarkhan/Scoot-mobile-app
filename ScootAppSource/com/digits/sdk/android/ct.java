package com.digits.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;

final class ct
  implements cs
{
  final a a;
  
  public ct()
  {
    this(ao.d().m());
  }
  
  public ct(a parama)
  {
    this.a = parama;
  }
  
  @TargetApi(11)
  int a()
  {
    if (Build.VERSION.SDK_INT >= 11) {
      return 268468224;
    }
    return 335544320;
  }
  
  public void a(Activity paramActivity, ResultReceiver paramResultReceiver)
  {
    Intent localIntent = new Intent(paramActivity, this.a.a());
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("receiver", paramResultReceiver);
    localIntent.putExtras(localBundle);
    localIntent.setFlags(a());
    paramActivity.startActivity(localIntent);
  }
  
  public void a(ResultReceiver paramResultReceiver, Exception paramException)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("login_error", paramException.getLocalizedMessage());
    paramResultReceiver.send(400, localBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */