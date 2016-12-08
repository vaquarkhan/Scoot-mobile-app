package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;

final class cw
  extends bo
{
  private final long k;
  private final String l;
  private final Boolean m;
  private final InvertedStateButton n;
  private final InvertedStateButton o;
  private String p;
  private final TextView q;
  
  cw(ResultReceiver paramResultReceiver, StateButton paramStateButton, InvertedStateButton paramInvertedStateButton1, InvertedStateButton paramInvertedStateButton2, EditText paramEditText, com.twitter.sdk.android.core.m<cb> paramm, bf parambf, String paramString1, long paramLong, String paramString2, co paramco, a parama, ca paramca, Boolean paramBoolean, TextView paramTextView)
  {
    super(paramResultReceiver, paramStateButton, paramEditText, parambf, paramco, parama, paramm, paramca);
    this.p = paramString1;
    this.k = paramLong;
    this.l = paramString2;
    this.m = paramBoolean;
    this.n = paramInvertedStateButton1;
    this.o = paramInvertedStateButton2;
    this.j = a(15000, paramTextView, paramInvertedStateButton1, paramInvertedStateButton2);
    this.q = paramTextView;
  }
  
  cw(ResultReceiver paramResultReceiver, StateButton paramStateButton, InvertedStateButton paramInvertedStateButton1, InvertedStateButton paramInvertedStateButton2, EditText paramEditText, String paramString1, long paramLong, String paramString2, ca paramca, Boolean paramBoolean, TextView paramTextView)
  {
    this(paramResultReceiver, paramStateButton, paramInvertedStateButton1, paramInvertedStateButton2, paramEditText, ao.f(), ao.d().i(), paramString1, paramLong, paramString2, new u(paramStateButton.getContext().getResources()), ao.d().m(), paramca, paramBoolean, paramTextView);
  }
  
  private void a(Context paramContext, cb paramcb)
  {
    a(paramcb).verifyAccount(new da(this, paramContext, this, paramcb, paramContext));
  }
  
  private boolean a(cb paramcb1, cb paramcb2)
  {
    return (this.m.booleanValue()) && (paramcb1.c().equals(cb.a)) && (paramcb1.e() == paramcb2.e());
  }
  
  private void b(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, this.b.e());
    Bundle localBundle = a(this.l);
    localBundle.putParcelable("receiver", this.d);
    localBundle.putString("request_id", this.p);
    localBundle.putLong("user_id", this.k);
    localBundle.putBoolean("email_enabled", this.m.booleanValue());
    localIntent.putExtras(localBundle);
    a((Activity)paramContext, localIntent);
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
      this.a.a(this.p, this.k, str, new cx(this, paramContext, this, paramContext));
    }
  }
  
  public void a(Context paramContext, InvertedStateButton paramInvertedStateButton, ef paramef)
  {
    paramInvertedStateButton.d();
    this.a.a(this.l, paramef, new cy(this, paramContext, this, paramInvertedStateButton));
  }
  
  public void a(Context paramContext, bs parambs)
  {
    this.o.f();
    this.n.f();
    super.a(paramContext, parambs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */