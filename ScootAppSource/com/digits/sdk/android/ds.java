package com.digits.sdk.android;

import android.content.Context;
import android.os.ResultReceiver;
import android.widget.EditText;

final class ds
  extends bo
{
  private final String k;
  private final long l;
  private final String m;
  private final Boolean n;
  
  ds(ResultReceiver paramResultReceiver, StateButton paramStateButton, EditText paramEditText, com.twitter.sdk.android.core.m<cb> paramm, bf parambf, String paramString1, long paramLong, String paramString2, co paramco, a parama, ca paramca, Boolean paramBoolean)
  {
    super(paramResultReceiver, paramStateButton, paramEditText, parambf, paramco, parama, paramm, paramca);
    this.k = paramString1;
    this.l = paramLong;
    this.m = paramString2;
    this.n = paramBoolean;
  }
  
  ds(ResultReceiver paramResultReceiver, StateButton paramStateButton, EditText paramEditText, String paramString1, long paramLong, String paramString2, ca paramca, Boolean paramBoolean)
  {
    this(paramResultReceiver, paramStateButton, paramEditText, ao.f(), ao.d().i(), paramString1, paramLong, paramString2, new u(paramStateButton.getContext().getResources()), ao.d().m(), paramca, paramBoolean);
  }
  
  private void a(Context paramContext, cb paramcb)
  {
    a(paramcb).verifyAccount(new du(this, paramContext, this, paramcb, paramContext));
  }
  
  private boolean a(cb paramcb1, cb paramcb2)
  {
    return (this.n.booleanValue()) && (paramcb1.c().equals(cb.a)) && (paramcb1.e() == paramcb2.e());
  }
  
  DigitsApiClient.AccountService a(cb paramcb)
  {
    return new DigitsApiClient(paramcb).d();
  }
  
  public void a(Context paramContext)
  {
    this.h.a(bz.b);
    if (a(this.e.getText()))
    {
      this.f.d();
      b.a.a.a.a.b.m.a(paramContext, this.e);
      String str = this.e.getText().toString();
      this.a.b(this.k, this.l, str, new dt(this, paramContext, this, paramContext));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */