package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

abstract class bo
  implements TextWatcher, bn
{
  final bf a;
  final a b;
  final co c;
  final ResultReceiver d;
  final EditText e;
  final StateButton f;
  final com.twitter.sdk.android.core.m<cb> g;
  final ca h;
  int i;
  CountDownTimer j;
  
  bo(ResultReceiver paramResultReceiver, StateButton paramStateButton, EditText paramEditText, bf parambf, co paramco, a parama, com.twitter.sdk.android.core.m<cb> paramm, ca paramca)
  {
    this.d = paramResultReceiver;
    this.a = parambf;
    this.b = parama;
    this.f = paramStateButton;
    this.e = paramEditText;
    this.c = paramco;
    this.g = paramm;
    this.i = 0;
    this.h = paramca;
  }
  
  private boolean a(bs parambs)
  {
    return (this.i == 5) || ((parambs instanceof ec));
  }
  
  Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("phone_number", paramString);
    return localBundle;
  }
  
  CountDownTimer a(int paramInt, TextView paramTextView, InvertedStateButton paramInvertedStateButton1, InvertedStateButton paramInvertedStateButton2)
  {
    paramTextView.setText(String.valueOf(15));
    return new bq(this, paramInt, 500L, paramTextView, paramInvertedStateButton1, paramInvertedStateButton2);
  }
  
  public void a()
  {
    this.f.g();
  }
  
  void a(Activity paramActivity, Intent paramIntent)
  {
    paramActivity.startActivityForResult(paramIntent, 140);
  }
  
  public void a(Context paramContext, ResultReceiver paramResultReceiver, bs parambs)
  {
    Intent localIntent = new Intent(paramContext, this.b.d());
    localIntent.putExtra("receiver", paramResultReceiver);
    localIntent.putExtra("fallback_reason", parambs);
    paramContext.startActivity(localIntent);
    b.a.a.a.a.b.m.a(paramContext, 200);
  }
  
  public void a(Context paramContext, InvertedStateButton paramInvertedStateButton, ef paramef) {}
  
  public void a(Context paramContext, bs parambs)
  {
    this.i += 1;
    this.h.a(parambs);
    if (a(parambs))
    {
      this.h.b();
      a(paramContext, this.d, parambs);
      return;
    }
    this.e.setError(parambs.getLocalizedMessage());
    this.f.f();
  }
  
  void a(Context paramContext, cb paramcb, String paramString)
  {
    this.g.a(paramcb);
    this.f.e();
    this.e.postDelayed(new bp(this, paramString, paramContext), 1500L);
  }
  
  void a(Context paramContext, String paramString)
  {
    this.f.e();
    Intent localIntent = new Intent(paramContext, this.b.f());
    paramString = a(paramString);
    paramString.putParcelable("receiver", this.d);
    localIntent.putExtras(paramString);
    a((Activity)paramContext, localIntent);
  }
  
  public boolean a(CharSequence paramCharSequence)
  {
    return !TextUtils.isEmpty(paramCharSequence);
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public TextWatcher b()
  {
    return this;
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public co c()
  {
    return this.c;
  }
  
  public void d()
  {
    this.e.setError(null);
  }
  
  public void e()
  {
    if (this.j != null) {
      this.j.start();
    }
  }
  
  public void f()
  {
    if (this.j != null) {
      this.j.cancel();
    }
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */