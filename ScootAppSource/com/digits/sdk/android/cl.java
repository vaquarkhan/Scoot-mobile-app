package com.digits.sdk.android;

import android.content.Context;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cl
  extends bo
{
  private String k;
  
  cl(ResultReceiver paramResultReceiver, StateButton paramStateButton, EditText paramEditText, com.twitter.sdk.android.core.m<cb> paramm, a parama, bf parambf, String paramString, ca paramca, co paramco)
  {
    super(paramResultReceiver, paramStateButton, paramEditText, parambf, paramco, parama, paramm, paramca);
    this.k = paramString;
  }
  
  cl(StateButton paramStateButton, EditText paramEditText, ResultReceiver paramResultReceiver, String paramString, ca paramca)
  {
    this(paramResultReceiver, paramStateButton, paramEditText, ao.f(), ao.d().m(), new bf(), paramString, paramca, new cj(paramStateButton.getContext().getResources()));
  }
  
  private boolean b(String paramString)
  {
    return Patterns.EMAIL_ADDRESS.matcher(paramString).find();
  }
  
  DigitsApiClient.SdkService a(cb paramcb)
  {
    return new DigitsApiClient(paramcb).b();
  }
  
  public void a(Context paramContext)
  {
    this.h.a(bz.b);
    if (a(this.e.getText()))
    {
      this.f.d();
      b.a.a.a.a.b.m.a(paramContext, this.e);
      String str = this.e.getText().toString();
      cb localcb = (cb)this.g.b();
      if ((localcb != null) && (!localcb.a()))
      {
        a(localcb).email(str, new cm(this, paramContext, this, paramContext, localcb));
        return;
      }
      a(paramContext, new ec(""));
      return;
    }
    this.e.setError(paramContext.getString(R.string.dgts__invalid_email));
  }
  
  public boolean a(CharSequence paramCharSequence)
  {
    return (!TextUtils.isEmpty(paramCharSequence)) && (b(paramCharSequence.toString()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */